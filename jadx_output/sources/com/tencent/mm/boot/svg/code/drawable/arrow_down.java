package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_down extends l95.c {
    private final int width = 39;
    private final int height = 21;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 39;
        }
        if (i17 == 1) {
            return 21;
        }
        if (i17 == 2) {
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
            canvas.saveLayerAlpha(null, 83, 31);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 1.2246469E-16f, 72.0f, -1.2246469E-16f, -1.0f, 72.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 6.123234E-17f, 1.0f, -9.0f, 1.0f, -6.123234E-17f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(63.0f, 77.8108f);
            instancePath.lineTo(59.87755f, 81.0f);
            instancePath.lineTo(42.883453f, 63.64262f);
            instancePath.cubicTo(41.724884f, 62.459286f, 41.71944f, 60.546272f, 42.883453f, 59.35738f);
            instancePath.lineTo(59.87755f, 42.0f);
            instancePath.lineTo(63.0f, 45.1892f);
            instancePath.lineTo(47.030582f, 61.5f);
            instancePath.lineTo(63.0f, 77.8108f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
