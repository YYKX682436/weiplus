package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_anchor_icon_talk_on extends l95.c {
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
            instancePath.moveTo(29.148438f, 14.0f);
            instancePath.cubicTo(29.128906f, 13.949219f, 29.105469f, 13.898438f, 29.082031f, 13.851562f);
            instancePath.cubicTo(28.488281f, 12.664062f, 27.046875f, 12.183594f, 25.859375f, 12.777344f);
            instancePath.lineTo(15.601562f, 17.90625f);
            instancePath.lineTo(15.601562f, 52.308594f);
            instancePath.lineTo(27.394531f, 57.36328f);
            instancePath.cubicTo(27.570312f, 57.4375f, 27.753906f, 57.492188f, 27.945312f, 57.523438f);
            instancePath.cubicTo(29.25f, 57.742188f, 30.488281f, 56.859375f, 30.707031f, 55.55078f);
            instancePath.lineTo(32.804688f, 42.953125f);
            instancePath.lineTo(40.1875f, 40.492188f);
            instancePath.close();
            instancePath.moveTo(41.9375f, 43.703125f);
            instancePath.lineTo(36.0f, 45.683594f);
            instancePath.lineTo(34.257812f, 56.14453f);
            instancePath.cubicTo(33.710938f, 59.410156f, 30.621094f, 61.621094f, 27.351562f, 61.07422f);
            instancePath.cubicTo(26.878906f, 60.996094f, 26.414062f, 60.859375f, 25.976562f, 60.671875f);
            instancePath.lineTo(13.816406f, 55.460938f);
            instancePath.cubicTo(12.714844f, 54.98828f, 12.0f, 53.90625f, 12.0f, 52.703125f);
            instancePath.lineTo(12.0f, 17.535156f);
            instancePath.cubicTo(12.0f, 16.402344f, 12.640625f, 15.363281f, 13.660156f, 14.855469f);
            instancePath.lineTo(24.25f, 9.558594f);
            instancePath.cubicTo(27.214844f, 8.074219f, 30.820312f, 9.277344f, 32.30078f, 12.242188f);
            instancePath.cubicTo(32.36328f, 12.363281f, 32.41797f, 12.488281f, 32.472656f, 12.617188f);
            instancePath.lineTo(43.757812f, 39.703125f);
            instancePath.cubicTo(44.39453f, 41.234375f, 43.671875f, 42.98828f, 42.14453f, 43.625f);
            instancePath.cubicTo(42.07422f, 43.65625f, 42.007812f, 43.679688f, 41.9375f, 43.703125f);
            instancePath.close();
            instancePath.moveTo(55.96875f, 22.03125f);
            instancePath.cubicTo(60.3125f, 26.371094f, 63.0f, 32.371094f, 63.0f, 39.0f);
            instancePath.cubicTo(63.0f, 45.628906f, 60.3125f, 51.628906f, 55.96875f, 55.96875f);
            instancePath.lineTo(53.42578f, 53.42578f);
            instancePath.cubicTo(57.226562f, 49.621094f, 59.398438f, 44.48828f, 59.398438f, 39.0f);
            instancePath.cubicTo(59.398438f, 33.51172f, 57.226562f, 28.378906f, 53.42578f, 24.574219f);
            instancePath.close();
            instancePath.moveTo(50.03125f, 27.96875f);
            instancePath.cubicTo(52.85547f, 30.792969f, 54.601562f, 34.691406f, 54.601562f, 39.0f);
            instancePath.cubicTo(54.601562f, 43.308594f, 52.85547f, 47.20703f, 50.03125f, 50.03125f);
            instancePath.lineTo(47.484375f, 47.484375f);
            instancePath.cubicTo(49.722656f, 45.246094f, 51.0f, 42.23047f, 51.0f, 39.0f);
            instancePath.cubicTo(51.0f, 35.76953f, 49.722656f, 32.753906f, 47.484375f, 30.515625f);
            instancePath.close();
            instancePath.moveTo(50.03125f, 27.96875f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
