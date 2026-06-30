package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class radar_search_blue_bg extends l95.c {
    private final int width = 165;
    private final int height = 74;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 165;
        }
        if (i17 == 1) {
            return 74;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-14442031);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(87.71f, 1.02f);
            instancePath.cubicTo(97.18f, 0.98f, 106.65f, 1.01f, 116.11f, 1.0f);
            instancePath.cubicTo(122.86f, 0.94f, 129.37f, 4.23f, 133.81f, 9.23f);
            instancePath.cubicTo(138.87f, 14.77f, 141.51f, 22.18f, 142.0f, 29.61f);
            instancePath.lineTo(142.0f, 36.95f);
            instancePath.cubicTo(141.63f, 45.0f, 138.59f, 53.09f, 132.81f, 58.82f);
            instancePath.cubicTo(128.22f, 63.52f, 121.67f, 66.29f, 115.07f, 66.0f);
            instancePath.cubicTo(76.95f, 65.86f, 38.82f, 66.27f, 0.7f, 65.79f);
            instancePath.cubicTo(14.4f, 65.13f, 27.91f, 61.47f, 40.08f, 55.19f);
            instancePath.cubicTo(62.05f, 44.0f, 79.39f, 24.21f, 87.71f, 1.02f);
            instancePath.lineTo(87.71f, 1.02f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
