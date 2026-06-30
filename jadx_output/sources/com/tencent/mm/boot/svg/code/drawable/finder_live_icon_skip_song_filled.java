package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icon_skip_song_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.5f, 5.91418f);
            instancePath.cubicTo(4.5f, 5.20731f, 5.1954f, 4.75556f, 5.81348f, 4.96301f);
            instancePath.cubicTo(5.9017f, 4.99259f, 5.98847f, 5.03528f, 6.07129f, 5.0929f);
            instancePath.lineTo(14.8203f, 11.1788f);
            instancePath.cubicTo(14.9275f, 11.2534f, 15.015f, 11.3433f, 15.082f, 11.4435f);
            instancePath.cubicTo(15.1492f, 11.5438f, 15.1958f, 11.6545f, 15.2227f, 11.7687f);
            instancePath.cubicTo(15.2672f, 11.9586f, 15.2554f, 12.1594f, 15.1885f, 12.3439f);
            instancePath.cubicTo(15.1751f, 12.3807f, 15.1595f, 12.4169f, 15.1416f, 12.4523f);
            instancePath.cubicTo(15.0701f, 12.5939f, 14.9633f, 12.7219f, 14.8203f, 12.8214f);
            instancePath.lineTo(6.07129f, 18.9073f);
            instancePath.cubicTo(5.98848f, 18.9649f, 5.90169f, 19.0077f, 5.81348f, 19.0372f);
            instancePath.cubicTo(5.19542f, 19.2446f, 4.5f, 18.7929f, 4.5f, 18.0861f);
            instancePath.lineTo(4.5f, 5.91418f);
            instancePath.close();
            instancePath.moveTo(18.5f, 5.00012f);
            instancePath.cubicTo(18.9142f, 5.00012f, 19.25f, 5.33591f, 19.25f, 5.75012f);
            instancePath.lineTo(19.25f, 18.2501f);
            instancePath.cubicTo(19.2499f, 18.6643f, 18.9142f, 19.0001f, 18.5f, 19.0001f);
            instancePath.lineTo(17.75f, 19.0001f);
            instancePath.cubicTo(17.3616f, 19.0001f, 17.0421f, 18.7047f, 17.0039f, 18.3263f);
            instancePath.cubicTo(17.0014f, 18.3012f, 17.0f, 18.2758f, 17.0f, 18.2501f);
            instancePath.lineTo(17.0f, 5.75012f);
            instancePath.cubicTo(17.0f, 5.33591f, 17.3358f, 5.00012f, 17.75f, 5.00012f);
            instancePath.lineTo(18.5f, 5.00012f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
