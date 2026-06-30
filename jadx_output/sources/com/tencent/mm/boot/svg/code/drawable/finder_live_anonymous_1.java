package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_anonymous_1 extends l95.c {
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
        instancePath.moveTo(63.0f, 12.0f);
        instancePath.cubicTo(64.65625f, 12.0f, 66.0f, 13.34375f, 66.0f, 15.0f);
        instancePath.lineTo(66.0f, 57.0f);
        instancePath.cubicTo(66.0f, 58.65625f, 64.65625f, 60.0f, 63.0f, 60.0f);
        instancePath.lineTo(9.0f, 60.0f);
        instancePath.cubicTo(7.34375f, 60.0f, 6.0f, 58.65625f, 6.0f, 57.0f);
        instancePath.lineTo(6.0f, 15.0f);
        instancePath.cubicTo(6.0f, 13.34375f, 7.34375f, 12.0f, 9.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(62.398438f, 15.601562f);
        instancePath.lineTo(9.601562f, 15.601562f);
        instancePath.lineTo(9.601562f, 56.398438f);
        instancePath.lineTo(62.398438f, 56.398438f);
        instancePath.close();
        instancePath.moveTo(27.0f, 22.199219f);
        instancePath.cubicTo(30.648438f, 22.199219f, 33.597656f, 25.15625f, 33.835938f, 28.847656f);
        instancePath.lineTo(33.851562f, 29.332031f);
        instancePath.lineTo(33.851562f, 31.613281f);
        instancePath.cubicTo(33.851562f, 33.48828f, 33.3125f, 35.679688f, 32.375f, 37.13672f);
        instancePath.lineTo(32.046875f, 37.59375f);
        instancePath.lineTo(31.613281f, 38.132812f);
        instancePath.lineTo(38.41797f, 41.773438f);
        instancePath.cubicTo(39.5625f, 42.36328f, 40.4375f, 43.61328f, 40.710938f, 44.91797f);
        instancePath.lineTo(40.78125f, 45.35547f);
        instancePath.lineTo(40.80078f, 45.753906f);
        instancePath.lineTo(40.80078f, 46.73828f);
        instancePath.cubicTo(40.80078f, 48.316406f, 39.60547f, 49.617188f, 38.070312f, 49.78125f);
        instancePath.lineTo(37.73828f, 49.80078f);
        instancePath.lineTo(16.261719f, 49.80078f);
        instancePath.cubicTo(14.683594f, 49.80078f, 13.382812f, 48.60547f, 13.21875f, 47.070312f);
        instancePath.lineTo(13.199219f, 46.73828f);
        instancePath.lineTo(13.199219f, 45.753906f);
        instancePath.cubicTo(13.199219f, 44.308594f, 14.039062f, 42.76953f, 15.230469f, 41.98047f);
        instancePath.lineTo(15.5625f, 41.785156f);
        instancePath.lineTo(22.429688f, 38.128906f);
        instancePath.lineTo(21.996094f, 37.59375f);
        instancePath.cubicTo(21.078125f, 36.445312f, 20.445312f, 34.621094f, 20.230469f, 32.882812f);
        instancePath.lineTo(20.167969f, 32.23828f);
        instancePath.lineTo(20.148438f, 31.613281f);
        instancePath.lineTo(20.148438f, 29.332031f);
        instancePath.cubicTo(20.148438f, 25.417969f, 23.195312f, 22.199219f, 27.0f, 22.199219f);
        instancePath.close();
        instancePath.moveTo(27.0f, 25.800781f);
        instancePath.cubicTo(25.347656f, 25.800781f, 23.945312f, 27.160156f, 23.765625f, 28.945312f);
        instancePath.lineTo(23.746094f, 29.332031f);
        instancePath.lineTo(23.746094f, 31.613281f);
        instancePath.cubicTo(23.746094f, 32.765625f, 24.128906f, 34.246094f, 24.621094f, 35.070312f);
        instancePath.lineTo(24.808594f, 35.34375f);
        instancePath.lineTo(25.265625f, 35.91797f);
        instancePath.cubicTo(26.628906f, 37.625f, 26.265625f, 39.941406f, 24.519531f, 41.08203f);
        instancePath.lineTo(24.175781f, 41.285156f);
        instancePath.lineTo(17.230469f, 44.976562f);
        instancePath.cubicTo(17.09375f, 45.046875f, 16.902344f, 45.34375f, 16.828125f, 45.585938f);
        instancePath.lineTo(16.800781f, 45.753906f);
        instancePath.lineTo(16.800781f, 46.19922f);
        instancePath.lineTo(37.19922f, 46.19922f);
        instancePath.lineTo(37.19922f, 45.753906f);
        instancePath.cubicTo(37.19922f, 45.601562f, 37.10547f, 45.382812f, 36.98828f, 45.210938f);
        instancePath.lineTo(36.867188f, 45.058594f);
        instancePath.lineTo(36.742188f, 44.960938f);
        instancePath.lineTo(29.890625f, 41.29297f);
        instancePath.cubicTo(27.949219f, 40.296875f, 27.394531f, 38.015625f, 28.542969f, 36.242188f);
        instancePath.lineTo(28.777344f, 35.91797f);
        instancePath.lineTo(29.234375f, 35.34375f);
        instancePath.cubicTo(29.734375f, 34.722656f, 30.148438f, 33.3125f, 30.234375f, 32.070312f);
        instancePath.lineTo(30.253906f, 31.613281f);
        instancePath.lineTo(30.253906f, 29.332031f);
        instancePath.cubicTo(30.253906f, 27.363281f, 28.773438f, 25.800781f, 27.0f, 25.800781f);
        instancePath.close();
        instancePath.moveTo(57.0f, 35.398438f);
        instancePath.lineTo(57.0f, 39.0f);
        instancePath.lineTo(45.0f, 39.0f);
        instancePath.lineTo(45.0f, 35.398438f);
        instancePath.close();
        instancePath.moveTo(57.0f, 28.199219f);
        instancePath.lineTo(57.0f, 31.800781f);
        instancePath.lineTo(39.0f, 31.800781f);
        instancePath.lineTo(39.0f, 28.199219f);
        instancePath.close();
        instancePath.moveTo(57.0f, 28.199219f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
