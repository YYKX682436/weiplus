package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_feed_dislike extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.960938f, 19.054688f);
        instancePath.lineTo(16.507812f, 21.597656f);
        instancePath.cubicTo(16.386719f, 21.707031f, 16.269531f, 21.820312f, 16.152344f, 21.9375f);
        instancePath.cubicTo(11.746094f, 26.34375f, 11.695312f, 33.46875f, 15.988281f, 37.898438f);
        instancePath.lineTo(36.941406f, 58.851562f);
        instancePath.lineTo(45.347656f, 50.4375f);
        instancePath.lineTo(47.890625f, 52.984375f);
        instancePath.lineTo(39.0625f, 61.820312f);
        instancePath.cubicTo(37.890625f, 62.992188f, 35.992188f, 62.992188f, 34.820312f, 61.820312f);
        instancePath.lineTo(13.445312f, 40.445312f);
        instancePath.cubicTo(7.75f, 34.57422f, 7.804688f, 25.195312f, 13.605469f, 19.394531f);
        instancePath.close();
        instancePath.moveTo(14.089844f, 9.0f);
        instancePath.lineTo(20.546875f, 15.453125f);
        instancePath.cubicTo(25.496094f, 14.210938f, 30.949219f, 15.523438f, 34.820312f, 19.394531f);
        instancePath.cubicTo(35.367188f, 19.941406f, 36.07422f, 20.625f, 36.941406f, 21.441406f);
        instancePath.cubicTo(37.808594f, 20.625f, 38.515625f, 19.941406f, 39.0625f, 19.394531f);
        instancePath.cubicTo(44.921875f, 13.535156f, 54.41797f, 13.535156f, 60.277344f, 19.394531f);
        instancePath.cubicTo(66.078125f, 25.195312f, 66.13281f, 34.57422f, 60.4375f, 40.441406f);
        instancePath.lineTo(52.984375f, 47.890625f);
        instancePath.lineTo(64.27344f, 59.183594f);
        instancePath.lineTo(61.73047f, 61.73047f);
        instancePath.lineTo(11.546875f, 11.546875f);
        instancePath.close();
        instancePath.moveTo(23.703125f, 18.613281f);
        instancePath.lineTo(50.4375f, 45.347656f);
        instancePath.lineTo(57.85547f, 37.933594f);
        instancePath.cubicTo(62.1875f, 33.46875f, 62.13672f, 26.34375f, 57.73047f, 21.9375f);
        instancePath.cubicTo(53.277344f, 17.488281f, 46.058594f, 17.488281f, 41.609375f, 21.9375f);
        instancePath.cubicTo(41.03125f, 22.515625f, 40.30078f, 23.222656f, 39.410156f, 24.058594f);
        instancePath.lineTo(36.941406f, 26.386719f);
        instancePath.lineTo(34.472656f, 24.058594f);
        instancePath.cubicTo(33.58203f, 23.222656f, 32.851562f, 22.515625f, 32.273438f, 21.9375f);
        instancePath.cubicTo(29.917969f, 19.582031f, 26.789062f, 18.472656f, 23.703125f, 18.613281f);
        instancePath.close();
        instancePath.moveTo(23.703125f, 18.613281f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
