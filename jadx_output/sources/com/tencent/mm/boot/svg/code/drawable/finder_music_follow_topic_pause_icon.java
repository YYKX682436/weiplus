package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_music_follow_topic_pause_icon extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -580.0f, 0.0f, 1.0f, -160.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 70.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 514.0f, 0.0f, 1.0f, 90.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.0f, 0.39999962f);
        instancePath.cubicTo(18.406504f, 0.39999962f, 23.6f, 5.5934963f, 23.6f, 12.0f);
        instancePath.cubicTo(23.6f, 18.406504f, 18.406504f, 23.6f, 12.0f, 23.6f);
        instancePath.cubicTo(5.5934963f, 23.6f, 0.39999962f, 18.406504f, 0.39999962f, 12.0f);
        instancePath.cubicTo(0.39999962f, 5.5934963f, 5.5934963f, 0.39999962f, 12.0f, 0.39999962f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 5.5f, 0.0f, 1.0f, 5.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.5208333f, 2.4375f);
        instancePath2.lineTo(4.6041665f, 2.4375f);
        instancePath2.cubicTo(4.903321f, 2.4375f, 5.1458335f, 2.6800125f, 5.1458335f, 2.9791667f);
        instancePath2.lineTo(5.1458335f, 10.020833f);
        instancePath2.cubicTo(5.1458335f, 10.319987f, 4.903321f, 10.5625f, 4.6041665f, 10.5625f);
        instancePath2.lineTo(3.5208333f, 10.5625f);
        instancePath2.cubicTo(3.221679f, 10.5625f, 2.9791667f, 10.319987f, 2.9791667f, 10.020833f);
        instancePath2.lineTo(2.9791667f, 2.9791667f);
        instancePath2.cubicTo(2.9791667f, 2.6800125f, 3.221679f, 2.4375f, 3.5208333f, 2.4375f);
        instancePath2.close();
        instancePath2.moveTo(8.395833f, 2.4375f);
        instancePath2.lineTo(9.479167f, 2.4375f);
        instancePath2.cubicTo(9.778321f, 2.4375f, 10.020833f, 2.6800125f, 10.020833f, 2.9791667f);
        instancePath2.lineTo(10.020833f, 10.020833f);
        instancePath2.cubicTo(10.020833f, 10.319987f, 9.778321f, 10.5625f, 9.479167f, 10.5625f);
        instancePath2.lineTo(8.395833f, 10.5625f);
        instancePath2.cubicTo(8.096679f, 10.5625f, 7.8541665f, 10.319987f, 7.8541665f, 10.020833f);
        instancePath2.lineTo(7.8541665f, 2.9791667f);
        instancePath2.cubicTo(7.8541665f, 2.6800125f, 8.096679f, 2.4375f, 8.395833f, 2.4375f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
