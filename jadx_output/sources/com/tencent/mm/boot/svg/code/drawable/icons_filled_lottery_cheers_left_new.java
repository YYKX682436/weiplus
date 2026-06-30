package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_lottery_cheers_left_new extends l95.c {
    private final int width = 30;
    private final int height = 87;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 30;
        }
        if (i17 == 1) {
            return 87;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -114.0f, 0.0f, 1.0f, -203.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 114.0f, 0.0f, 1.0f, 205.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-5642283);
        instancePaint4.setStrokeWidth(3.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(23.76f, 76.93109f);
        instancePath.cubicTo(25.35058f, 76.93109f, 26.64f, 78.220505f, 26.64f, 79.81109f);
        instancePath.cubicTo(26.64f, 81.40167f, 25.35058f, 82.691086f, 23.76f, 82.691086f);
        instancePath.cubicTo(22.16942f, 82.691086f, 20.880001f, 81.40167f, 20.880001f, 79.81109f);
        instancePath.cubicTo(20.880001f, 78.220505f, 22.16942f, 76.93109f, 23.76f, 76.93109f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-9745153);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.8369701E-16f, -1.0f, 60.65109f, 1.0f, -1.8369701E-16f, 43.37109f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.48f, 43.37109f);
        instancePath2.lineTo(10.8f, 43.37109f);
        instancePath2.lineTo(10.8f, 60.651093f);
        instancePath2.lineTo(6.48f, 60.651093f);
        instancePath2.lineTo(6.48f, 43.37109f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-40093);
        instancePaint6.setStrokeWidth(4.0f);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -0.8660254f, 0.5f, 25.26622f, -0.5f, -0.8660254f, 24.832241f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(3.96f, 11.937564f);
        instancePath3.lineTo(6.808884f, 8.895679f);
        instancePath3.cubicTo(8.368317f, 7.230602f, 10.982299f, 7.1449594f, 12.647377f, 8.704392f);
        instancePath3.cubicTo(12.757472f, 8.807502f, 12.8618355f, 8.916564f, 12.96f, 9.031089f);
        instancePath3.cubicTo(14.38016f, 10.687943f, 16.874575f, 10.879821f, 18.53143f, 9.459661f);
        instancePath3.cubicTo(18.685047f, 9.327987f, 18.828327f, 9.184709f, 18.96f, 9.031089f);
        instancePath3.cubicTo(20.444649f, 7.2989993f, 23.05233f, 7.0984087f, 24.784418f, 8.583056f);
        instancePath3.cubicTo(24.898945f, 8.681221f, 25.008007f, 8.785585f, 25.111116f, 8.895679f);
        instancePath3.lineTo(27.96f, 11.937564f);
        instancePath3.lineTo(27.96f, 11.937564f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
