package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_lottery_cheers_right_new extends l95.c {
    private final int width = 35;
    private final int height = 75;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 35;
        }
        if (i17 == 1) {
            return 75;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
        android.graphics.Paint instancePaint = l95.c.instancePaint(looper);
        instancePaint.setFlags(385);
        instancePaint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint2 = l95.c.instancePaint(looper);
        instancePaint2.setFlags(385);
        instancePaint2.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint.setColor(-16777216);
        instancePaint2.setStrokeWidth(1.0f);
        instancePaint2.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint2.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint2.setStrokeMiter(4.0f);
        instancePaint2.setPathEffect(null);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -274.0f, 0.0f, 1.0f, -210.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 276.0f, 0.0f, 1.0f, 210.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-5642283);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 0.70710677f, -0.70710677f, 5.0389657f, 0.70710677f, 0.70710677f, -3.0010347f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.9820518f, 0.26205194f);
        instancePath.lineTo(8.302052f, 0.26205194f);
        instancePath.lineTo(8.302052f, 8.902052f);
        instancePath.lineTo(3.9820518f, 8.902052f);
        instancePath.lineTo(3.9820518f, 0.26205194f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-29042);
        instancePaint5.setStrokeWidth(4.0f);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 0.9961947f, -0.087155744f, 2.902948f, 0.087155744f, 0.9961947f, -1.7613473f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.622223f, 35.27002f);
        instancePath2.lineTo(15.471107f, 32.228134f);
        instancePath2.cubicTo(17.03054f, 30.563055f, 19.644522f, 30.477413f, 21.309599f, 32.036846f);
        instancePath2.cubicTo(21.419695f, 32.139954f, 21.524057f, 32.249016f, 21.622223f, 32.363544f);
        instancePath2.cubicTo(23.042383f, 34.020397f, 25.536797f, 34.212276f, 27.193651f, 32.792114f);
        instancePath2.cubicTo(27.347271f, 32.660442f, 27.49055f, 32.517162f, 27.622223f, 32.363544f);
        instancePath2.lineTo(30.622223f, 28.863543f);
        instancePath2.lineTo(30.622223f, 28.863543f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-12126);
        instancePaint6.setStrokeWidth(3.456f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(5.76f, 61.4f);
        instancePath3.cubicTo(8.94116f, 61.4f, 11.52f, 63.978844f, 11.52f, 67.16f);
        instancePath3.cubicTo(11.52f, 70.34116f, 8.94116f, 72.920006f, 5.76f, 72.920006f);
        instancePath3.cubicTo(2.5788398f, 72.920006f, 0.0f, 70.34116f, 0.0f, 67.16f);
        instancePath3.cubicTo(0.0f, 63.978844f, 2.5788398f, 61.4f, 5.76f, 61.4f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
