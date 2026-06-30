package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_unstick extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
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
            instancePath.moveTo(12.78125f, 23.050781f);
            instancePath.lineTo(45.51172f, 55.78125f);
            instancePath.cubicTo(40.9375f, 59.609375f, 34.660156f, 61.972656f, 27.734375f, 61.972656f);
            instancePath.cubicTo(24.875f, 61.972656f, 22.125f, 61.566406f, 19.5625f, 60.82422f);
            instancePath.lineTo(12.003906f, 64.44922f);
            instancePath.cubicTo(11.789062f, 64.55469f, 11.546875f, 64.59375f, 11.308594f, 64.56641f);
            instancePath.cubicTo(10.613281f, 64.484375f, 10.117188f, 63.85547f, 10.199219f, 63.160156f);
            instancePath.lineTo(10.964844f, 56.578125f);
            instancePath.cubicTo(5.710938f, 52.628906f, 2.398438f, 46.86328f, 2.398438f, 40.433594f);
            instancePath.cubicTo(2.398438f, 33.296875f, 6.488281f, 26.96875f, 12.78125f, 23.050781f);
            instancePath.close();
            instancePath.moveTo(12.910156f, 9.601562f);
            instancePath.lineTo(22.644531f, 19.335938f);
            instancePath.cubicTo(24.289062f, 19.050781f, 25.992188f, 18.898438f, 27.734375f, 18.898438f);
            instancePath.cubicTo(41.726562f, 18.898438f, 53.070312f, 28.542969f, 53.070312f, 40.433594f);
            instancePath.cubicTo(53.070312f, 43.13672f, 52.484375f, 45.722656f, 51.41797f, 48.10547f);
            instancePath.lineTo(63.820312f, 60.51172f);
            instancePath.lineTo(60.42578f, 63.90625f);
            instancePath.lineTo(9.515625f, 12.992188f);
            instancePath.close();
            instancePath.moveTo(68.15234f, 25.253906f);
            instancePath.cubicTo(68.23828f, 25.398438f, 68.30859f, 25.550781f, 68.36328f, 25.710938f);
            instancePath.cubicTo(68.921875f, 27.246094f, 68.13281f, 28.941406f, 66.59766f, 29.5f);
            instancePath.cubicTo(66.4375f, 29.558594f, 66.27734f, 29.601562f, 66.11328f, 29.632812f);
            instancePath.lineTo(57.320312f, 31.222656f);
            instancePath.cubicTo(56.546875f, 31.363281f, 55.804688f, 30.847656f, 55.664062f, 30.074219f);
            instancePath.cubicTo(55.558594f, 29.480469f, 55.835938f, 28.882812f, 56.359375f, 28.582031f);
            instancePath.lineTo(64.11719f, 24.152344f);
            instancePath.cubicTo(65.53516f, 23.339844f, 67.34375f, 23.835938f, 68.15234f, 25.253906f);
            instancePath.close();
            instancePath.moveTo(60.859375f, 10.3125f);
            instancePath.cubicTo(61.01172f, 10.421875f, 61.160156f, 10.542969f, 61.29297f, 10.679688f);
            instancePath.cubicTo(62.60547f, 11.992188f, 62.60547f, 14.121094f, 61.29297f, 15.433594f);
            instancePath.cubicTo(61.160156f, 15.566406f, 61.01172f, 15.6875f, 60.859375f, 15.800781f);
            instancePath.lineTo(51.63672f, 22.320312f);
            instancePath.cubicTo(50.992188f, 22.777344f, 50.10547f, 22.625f, 49.648438f, 21.980469f);
            instancePath.cubicTo(49.30078f, 21.488281f, 49.30078f, 20.828125f, 49.648438f, 20.335938f);
            instancePath.lineTo(56.171875f, 11.113281f);
            instancePath.cubicTo(57.246094f, 9.597656f, 59.34375f, 9.238281f, 60.859375f, 10.3125f);
            instancePath.close();
            instancePath.moveTo(45.066406f, 4.605469f);
            instancePath.cubicTo(45.23047f, 4.636719f, 45.390625f, 4.679688f, 45.546875f, 4.738281f);
            instancePath.cubicTo(47.08203f, 5.292969f, 47.875f, 6.992188f, 47.316406f, 8.523438f);
            instancePath.cubicTo(47.257812f, 8.679688f, 47.1875f, 8.832031f, 47.10547f, 8.980469f);
            instancePath.lineTo(42.67578f, 16.730469f);
            instancePath.cubicTo(42.289062f, 17.414062f, 41.41797f, 17.652344f, 40.734375f, 17.261719f);
            instancePath.cubicTo(40.20703f, 16.960938f, 39.929688f, 16.363281f, 40.039062f, 15.769531f);
            instancePath.lineTo(41.628906f, 6.988281f);
            instancePath.cubicTo(41.921875f, 5.378906f, 43.45703f, 4.316406f, 45.066406f, 4.605469f);
            instancePath.close();
            instancePath.moveTo(45.066406f, 4.605469f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
