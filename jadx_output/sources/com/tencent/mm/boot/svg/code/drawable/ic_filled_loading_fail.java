package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ic_filled_loading_fail extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-855638017);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -167.0f, 0.0f, 1.0f, -370.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 128.0f, 0.0f, 1.0f, 346.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 39.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 16.036478f);
        instancePath.lineTo(37.1022f, 0.13443516f);
        instancePath.cubicTo(37.29843f, -0.048027184f, 37.612587f, -0.040865954f, 37.798798f, 0.14534536f);
        instancePath.lineTo(39.854656f, 2.201203f);
        instancePath.cubicTo(40.043144f, 2.389691f, 40.049908f, 2.699546f, 39.865566f, 2.897802f);
        instancePath.lineTo(23.963522f, 20.0f);
        instancePath.lineTo(39.865566f, 37.1022f);
        instancePath.cubicTo(40.048027f, 37.29843f, 40.040867f, 37.612587f, 39.854656f, 37.798798f);
        instancePath.lineTo(37.798798f, 39.854656f);
        instancePath.cubicTo(37.61031f, 40.043144f, 37.300453f, 40.049908f, 37.1022f, 39.865566f);
        instancePath.lineTo(20.0f, 23.963522f);
        instancePath.lineTo(2.897802f, 39.865566f);
        instancePath.cubicTo(2.701569f, 40.048027f, 2.3874145f, 40.040867f, 2.201203f, 39.854656f);
        instancePath.lineTo(0.14534536f, 37.798798f);
        instancePath.cubicTo(-0.04314252f, 37.61031f, -0.049908195f, 37.300453f, 0.13443516f, 37.1022f);
        instancePath.lineTo(16.036478f, 20.0f);
        instancePath.lineTo(0.13443516f, 2.897802f);
        instancePath.cubicTo(-0.048027184f, 2.701569f, -0.040865954f, 2.3874145f, 0.14534536f, 2.201203f);
        instancePath.lineTo(2.201203f, 0.14534536f);
        instancePath.cubicTo(2.389691f, -0.04314252f, 2.699546f, -0.049908195f, 2.897802f, 0.13443516f);
        instancePath.lineTo(20.0f, 16.036478f);
        instancePath.lineTo(20.0f, 16.036478f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
