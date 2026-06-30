package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_favour_off extends l95.c {
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
            instancePath.moveTo(51.0f, 36.0f);
            instancePath.cubicTo(59.285156f, 36.0f, 66.0f, 42.714844f, 66.0f, 51.0f);
            instancePath.cubicTo(66.0f, 59.285156f, 59.285156f, 66.0f, 51.0f, 66.0f);
            instancePath.cubicTo(42.714844f, 66.0f, 36.0f, 59.285156f, 36.0f, 51.0f);
            instancePath.cubicTo(36.0f, 42.714844f, 42.714844f, 36.0f, 51.0f, 36.0f);
            instancePath.close();
            instancePath.moveTo(46.964844f, 20.390625f);
            instancePath.lineTo(46.429688f, 28.664062f);
            instancePath.lineTo(58.45703f, 28.664062f);
            instancePath.cubicTo(62.5f, 28.664062f, 65.53516f, 32.820312f, 64.92578f, 36.953125f);
            instancePath.lineTo(64.84375f, 37.398438f);
            instancePath.lineTo(64.64453f, 38.359375f);
            instancePath.cubicTo(63.671875f, 37.308594f, 62.58203f, 36.375f, 61.390625f, 35.570312f);
            instancePath.cubicTo(61.26172f, 33.902344f, 60.078125f, 32.472656f, 58.75f, 32.285156f);
            instancePath.lineTo(58.45703f, 32.265625f);
            instancePath.lineTo(42.59375f, 32.265625f);
            instancePath.lineTo(43.371094f, 20.164062f);
            instancePath.cubicTo(43.64453f, 15.820312f, 40.78125f, 11.867188f, 38.589844f, 12.828125f);
            instancePath.cubicTo(38.109375f, 13.039062f, 37.746094f, 13.710938f, 37.554688f, 14.96875f);
            instancePath.lineTo(37.492188f, 15.46875f);
            instancePath.lineTo(37.433594f, 16.144531f);
            instancePath.lineTo(37.36328f, 17.957031f);
            instancePath.lineTo(37.320312f, 18.566406f);
            instancePath.cubicTo(36.5625f, 26.023438f, 32.476562f, 33.222656f, 26.816406f, 34.539062f);
            instancePath.lineTo(26.523438f, 34.59375f);
            instancePath.lineTo(25.914062f, 34.660156f);
            instancePath.lineTo(25.367188f, 34.69922f);
            instancePath.lineTo(24.597656f, 34.726562f);
            instancePath.lineTo(24.597656f, 59.382812f);
            instancePath.lineTo(34.39453f, 59.390625f);
            instancePath.cubicTo(35.05078f, 60.683594f, 35.851562f, 61.890625f, 36.777344f, 62.98828f);
            instancePath.lineTo(13.050781f, 62.976562f);
            instancePath.cubicTo(11.394531f, 62.976562f, 10.050781f, 61.632812f, 10.050781f, 59.976562f);
            instancePath.lineTo(10.050781f, 34.234375f);
            instancePath.cubicTo(10.050781f, 32.578125f, 11.394531f, 31.234375f, 13.050781f, 31.234375f);
            instancePath.lineTo(20.375f, 31.234375f);
            instancePath.lineTo(24.160156f, 31.144531f);
            instancePath.lineTo(25.410156f, 31.089844f);
            instancePath.lineTo(25.914062f, 31.046875f);
            instancePath.cubicTo(25.949219f, 31.042969f, 25.976562f, 31.039062f, 26.0f, 31.03125f);
            instancePath.cubicTo(30.066406f, 30.085938f, 33.16797f, 23.8125f, 33.73828f, 18.203125f);
            instancePath.lineTo(33.76953f, 17.722656f);
            instancePath.lineTo(33.835938f, 16.007812f);
            instancePath.lineTo(33.902344f, 15.179688f);
            instancePath.cubicTo(34.121094f, 13.058594f, 34.80078f, 10.5625f, 37.14453f, 9.53125f);
            instancePath.cubicTo(43.304688f, 6.828125f, 47.30078f, 15.035156f, 46.964844f, 20.390625f);
            instancePath.close();
            instancePath.moveTo(41.765625f, 44.3125f);
            instancePath.cubicTo(40.402344f, 46.191406f, 39.601562f, 48.5f, 39.601562f, 51.0f);
            instancePath.cubicTo(39.601562f, 57.296875f, 44.703125f, 62.398438f, 51.0f, 62.398438f);
            instancePath.cubicTo(53.5f, 62.398438f, 55.808594f, 61.597656f, 57.6875f, 60.234375f);
            instancePath.close();
            instancePath.moveTo(20.996094f, 34.820312f);
            instancePath.lineTo(20.375f, 34.835938f);
            instancePath.lineTo(13.648438f, 34.83203f);
            instancePath.lineTo(13.648438f, 59.375f);
            instancePath.lineTo(20.996094f, 59.378906f);
            instancePath.close();
            instancePath.moveTo(51.0f, 39.601562f);
            instancePath.cubicTo(48.5f, 39.601562f, 46.191406f, 40.402344f, 44.3125f, 41.765625f);
            instancePath.lineTo(60.234375f, 57.6875f);
            instancePath.cubicTo(61.597656f, 55.808594f, 62.398438f, 53.5f, 62.398438f, 51.0f);
            instancePath.cubicTo(62.398438f, 44.703125f, 57.296875f, 39.601562f, 51.0f, 39.601562f);
            instancePath.close();
            instancePath.moveTo(51.0f, 39.601562f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
