package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_live_coupon_filled extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
            instancePaint3.setColor(-40634);
            instancePaint3.setColor(-40634);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(17.4992f, 3.125f);
            instancePath.cubicTo(18.0745f, 3.125f, 18.5409f, 3.59137f, 18.5409f, 4.16667f);
            instancePath.lineTo(18.5409f, 8.08105f);
            instancePath.lineTo(18.3326f, 8.08105f);
            instancePath.cubicTo(17.5397f, 8.08106f, 16.8742f, 8.77122f, 16.8742f, 9.65088f);
            instancePath.cubicTo(16.8743f, 10.5305f, 17.5397f, 11.2199f, 18.3326f, 11.2199f);
            instancePath.lineTo(18.5409f, 11.2199f);
            instancePath.lineTo(18.5409f, 15.8333f);
            instancePath.cubicTo(18.5409f, 16.4086f, 18.0745f, 16.875f, 17.4992f, 16.875f);
            instancePath.lineTo(2.50004f, 16.875f);
            instancePath.cubicTo(1.92474f, 16.875f, 1.45837f, 16.4086f, 1.45837f, 15.8333f);
            instancePath.lineTo(1.45837f, 11.4583f);
            instancePath.lineTo(1.66671f, 11.4583f);
            instancePath.cubicTo(2.47212f, 11.4583f, 3.12504f, 10.8054f, 3.12504f, 10.0f);
            instancePath.cubicTo(3.12504f, 9.19458f, 2.47212f, 8.54167f, 1.66671f, 8.54167f);
            instancePath.lineTo(1.45837f, 8.54167f);
            instancePath.lineTo(1.45837f, 4.16667f);
            instancePath.cubicTo(1.45837f, 3.59137f, 1.92474f, 3.125f, 2.50004f, 3.125f);
            instancePath.lineTo(17.4992f, 3.125f);
            instancePath.close();
            instancePath.moveTo(5.9587f, 10.5705f);
            instancePath.lineTo(5.9587f, 11.9873f);
            instancePath.lineTo(11.0173f, 11.9873f);
            instancePath.lineTo(11.0173f, 10.5705f);
            instancePath.lineTo(5.9587f, 10.5705f);
            instancePath.close();
            instancePath.moveTo(5.9587f, 7.62533f);
            instancePath.lineTo(5.9587f, 9.04134f);
            instancePath.lineTo(13.2634f, 9.04134f);
            instancePath.lineTo(13.2634f, 7.62533f);
            instancePath.lineTo(5.9587f, 7.62533f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
