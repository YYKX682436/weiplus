package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class scan_detail_movie_icon_hl extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        l95.c.instanceMatrix(looper);
        l95.c.instanceMatrixArray(looper);
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.saveLayerAlpha(null, 192, 31);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(57.64f, 0.0f);
        instancePath.lineTo(62.28f, 0.0f);
        instancePath.cubicTo(76.76f, 0.59f, 90.96f, 6.52f, 101.4f, 16.59f);
        instancePath.cubicTo(112.61f, 27.16f, 119.33f, 42.17f, 120.0f, 57.54f);
        instancePath.lineTo(120.0f, 62.43f);
        instancePath.cubicTo(119.34f, 77.55f, 112.85f, 92.35f, 101.95f, 102.89f);
        instancePath.cubicTo(91.57f, 113.17f, 77.33f, 119.24f, 62.78f, 120.0f);
        instancePath.lineTo(57.65f, 120.0f);
        instancePath.cubicTo(42.48f, 119.36f, 27.64f, 112.85f, 17.09f, 101.92f);
        instancePath.cubicTo(6.78f, 91.48f, 0.68f, 77.16f, 0.0f, 62.53f);
        instancePath.lineTo(0.0f, 57.62f);
        instancePath.cubicTo(0.63f, 42.94f, 6.74f, 28.56f, 17.08f, 18.09f);
        instancePath.cubicTo(27.63f, 7.16f, 42.47f, 0.64f, 57.64f, 0.0f);
        instancePath.lineTo(57.64f, 0.0f);
        instancePath.close();
        instancePath.moveTo(51.51f, 4.65f);
        instancePath.cubicTo(36.05f, 6.93f, 21.8f, 16.1f, 13.25f, 29.18f);
        instancePath.cubicTo(4.8f, 41.83f, 1.96f, 58.0f, 5.48f, 72.79f);
        instancePath.cubicTo(8.55f, 86.14f, 16.78f, 98.19f, 28.04f, 105.97f);
        instancePath.cubicTo(39.28f, 113.88f, 53.5f, 117.33f, 67.12f, 115.54f);
        instancePath.cubicTo(82.63f, 113.66f, 97.09f, 104.84f, 105.96f, 91.99f);
        instancePath.cubicTo(114.35f, 80.09f, 117.7f, 64.82f, 115.18f, 50.48f);
        instancePath.cubicTo(112.74f, 35.87f, 104.15f, 22.44f, 91.97f, 14.03f);
        instancePath.cubicTo(80.35f, 5.86f, 65.54f, 2.46f, 51.51f, 4.65f);
        instancePath.lineTo(51.51f, 4.65f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(42.01f, 32.0f);
        instancePath2.cubicTo(57.33f, 41.35f, 72.67f, 50.66f, 87.99f, 60.0f);
        instancePath2.cubicTo(72.67f, 69.34f, 57.34f, 78.67f, 42.01f, 87.99f);
        instancePath2.cubicTo(42.0f, 69.33f, 41.99f, 50.67f, 42.01f, 32.0f);
        instancePath2.lineTo(42.01f, 32.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
