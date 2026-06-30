package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class searchbar_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-5592406);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.35f, 12.4f);
                instancePath.cubicTo(7.25f, 5.36f, 14.93f, 0.63f, 22.96f, 0.27f);
                instancePath.cubicTo(31.48f, -0.27f, 40.05f, 4.2f, 44.53f, 11.46f);
                instancePath.cubicTo(49.92f, 19.74f, 49.24f, 31.19f, 43.22f, 38.97f);
                instancePath.cubicTo(48.42f, 44.2f, 53.65f, 49.4f, 58.86f, 54.62f);
                instancePath.cubicTo(57.46f, 56.07f, 56.03f, 57.5f, 54.53f, 58.84f);
                instancePath.cubicTo(49.4f, 53.57f, 44.14f, 48.41f, 38.95f, 43.2f);
                instancePath.cubicTo(34.16f, 46.84f, 28.05f, 48.71f, 22.04f, 48.11f);
                instancePath.cubicTo(13.48f, 47.41f, 5.55f, 41.7f, 2.22f, 33.77f);
                instancePath.cubicTo(-0.77f, 26.99f, -0.35f, 18.82f, 3.35f, 12.4f);
                instancePath.lineTo(3.35f, 12.4f);
                instancePath.close();
                instancePath.moveTo(22.25f, 6.34f);
                instancePath.cubicTo(12.73f, 7.14f, 5.11f, 16.55f, 6.33f, 26.04f);
                instancePath.cubicTo(7.03f, 35.6f, 16.43f, 43.3f, 25.94f, 42.13f);
                instancePath.cubicTo(35.7f, 41.45f, 43.55f, 31.72f, 42.08f, 22.03f);
                instancePath.cubicTo(41.15f, 12.55f, 31.71f, 5.05f, 22.25f, 6.34f);
                instancePath.lineTo(22.25f, 6.34f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
