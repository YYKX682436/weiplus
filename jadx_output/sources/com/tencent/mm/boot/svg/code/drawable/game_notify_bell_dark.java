package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_notify_bell_dark extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(420523775);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 20.0f);
        instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
        instancePath.lineTo(40.0f, 20.0f);
        instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
        instancePath.lineTo(20.0f, 40.0f);
        instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.0001f, 28.0f);
        instancePath2.lineTo(13.1868f, 28.0f);
        instancePath2.cubicTo(12.9738f, 28.0f, 12.7664f, 27.932f, 12.5948f, 27.8059f);
        instancePath2.cubicTo(12.1497f, 27.4789f, 12.054f, 26.8531f, 12.3809f, 26.408f);
        instancePath2.lineTo(12.3809f, 26.408f);
        instancePath2.cubicTo(13.4604f, 24.9387f, 14.0001f, 23.4693f, 14.0001f, 22.0f);
        instancePath2.lineTo(14.0001f, 18.0f);
        instancePath2.cubicTo(14.0001f, 15.3773f, 15.6828f, 13.1477f, 18.0275f, 12.3318f);
        instancePath2.cubicTo(18.0095f, 12.2239f, 18.0001f, 12.113f, 18.0001f, 12.0f);
        instancePath2.cubicTo(18.0001f, 10.8954f, 18.8955f, 10.0f, 20.0001f, 10.0f);
        instancePath2.cubicTo(21.1047f, 10.0f, 22.0001f, 10.8954f, 22.0001f, 12.0f);
        instancePath2.cubicTo(22.0001f, 12.113f, 21.9907f, 12.2239f, 21.9727f, 12.3318f);
        instancePath2.cubicTo(24.3174f, 13.1477f, 26.0001f, 15.3773f, 26.0001f, 18.0f);
        instancePath2.lineTo(26.0001f, 22.0f);
        instancePath2.cubicTo(26.0001f, 23.4693f, 26.5398f, 24.9386f, 27.6192f, 26.4079f);
        instancePath2.cubicTo(27.7453f, 26.5796f, 27.8134f, 26.787f, 27.8134f, 27.0f);
        instancePath2.cubicTo(27.8134f, 27.5523f, 27.3656f, 28.0f, 26.8133f, 28.0f);
        instancePath2.lineTo(21.0001f, 28.0f);
        instancePath2.lineTo(21.0001f, 28.2f);
        instancePath2.cubicTo(21.0001f, 28.7523f, 20.5524f, 29.2f, 20.0001f, 29.2f);
        instancePath2.cubicTo(19.4478f, 29.2f, 19.0001f, 28.7523f, 19.0001f, 28.2f);
        instancePath2.lineTo(19.0001f, 28.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
