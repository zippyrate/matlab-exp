import regiongrow_java.RegionGrow;

import com.mathworks.toolbox.javabuilder.MWCellArray;
import com.mathworks.toolbox.javabuilder.MWCharArray;
import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

public class TestBuilderJA2013b

{
	public static void main(String[] args)
	{
		RegionGrow regionGrow = null; // MATLAB-generated Java class containing function ePAD_regiongrow

		try {
			regionGrow = new RegionGrow();

			double[] point = new double[3];
			MWCellArray _dicomFilesnamesCells = new MWCellArray(1, 1);
			MWCharArray path = new MWCharArray("/tmp/fred");
			_dicomFilesnamesCells.set(0, path);
			MWNumericArray _point = new MWNumericArray(point, MWClassID.DOUBLE);

			regionGrow.ePAD_regiongrow(1, _point, _dicomFilesnamesCells);

		} catch (MWException t) {
			t.printStackTrace();
		} finally {
			if (regionGrow != null)
				regionGrow.dispose();
		}

	}

}
