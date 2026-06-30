package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class slide_indicator extends l95.c {
    private final int width = 27;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 27;
        }
        if (i17 == 1) {
            return 32;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 2.6666667f, 0.0f, 0.16666667f, 0.0f, 2.6666667f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.74175f, 3.97746f);
        instancePath.lineTo(2.2998f, 3.53552f);
        instancePath.lineTo(4.70768f, 1.12765f);
        instancePath.cubicTo(4.87023f, 0.965095f, 5.13234f, 0.963653f, 5.29633f, 1.12765f);
        instancePath.lineTo(7.70421f, 3.53552f);
        instancePath.lineTo(7.26226f, 3.97746f);
        instancePath.lineTo(5.00201f, 1.7172f);
        instancePath.lineTo(2.74175f, 3.97746f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(2.74175f, 8.02254f);
        instancePath2.lineTo(2.2998f, 8.46448f);
        instancePath2.lineTo(4.70768f, 10.8724f);
        instancePath2.cubicTo(4.87023f, 11.0349f, 5.13234f, 11.0363f, 5.29633f, 10.8724f);
        instancePath2.lineTo(7.70421f, 8.46448f);
        instancePath2.lineTo(7.26226f, 8.02254f);
        instancePath2.lineTo(5.00201f, 10.2828f);
        instancePath2.lineTo(2.74175f, 8.02254f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
