package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_live_gift_bg extends l95.c {
    private final int width = com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
    private final int height = 171;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
        }
        if (i17 == 1) {
            return 171;
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
        instancePaint3.setColor(-3873);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(51.7361f, 0.0263672f);
        instancePath.cubicTo(66.8847f, 0.0263672f, 79.8901f, 10.3861f, 83.4459f, 24.8017f);
        instancePath.cubicTo(86.8486f, 10.9376f, 99.0094f, 0.824498f, 113.411f, 0.0714482f);
        instancePath.lineTo(115.715f, 0.0263672f);
        instancePath.cubicTo(130.995f, 0.0263672f, 143.382f, 12.3854f, 143.382f, 27.6311f);
        instancePath.cubicTo(143.382f, 32.6619f, 142.033f, 37.3783f, 139.677f, 41.4401f);
        instancePath.lineTo(157.215f, 41.4335f);
        instancePath.cubicTo(162.309f, 41.4335f, 166.437f, 45.5532f, 166.437f, 50.6351f);
        instancePath.lineTo(166.437f, 96.643f);
        instancePath.lineTo(157.215f, 96.643f);
        instancePath.lineTo(157.215f, 161.054f);
        instancePath.cubicTo(157.215f, 166.136f, 153.086f, 170.256f, 147.993f, 170.256f);
        instancePath.lineTo(18.8819f, 170.256f);
        instancePath.cubicTo(13.7887f, 170.256f, 9.65972f, 166.136f, 9.65972f, 161.054f);
        instancePath.lineTo(9.65972f, 96.643f);
        instancePath.lineTo(0.4375f, 96.643f);
        instancePath.lineTo(0.4375f, 50.6351f);
        instancePath.cubicTo(0.4375f, 45.5532f, 4.56643f, 41.4335f, 9.65972f, 41.4335f);
        instancePath.lineTo(27.1982f, 41.4401f);
        instancePath.cubicTo(24.8418f, 37.3783f, 23.4931f, 32.6619f, 23.4931f, 27.6311f);
        instancePath.cubicTo(23.4931f, 12.3854f, 35.8798f, 0.0263672f, 51.1597f, 0.0263672f);
        instancePath.lineTo(51.7361f, 0.0263672f);
        instancePath.close();
        instancePath.moveTo(51.7361f, 11.0683f);
        instancePath.lineTo(51.1597f, 11.0683f);
        instancePath.cubicTo(41.9918f, 11.0683f, 34.5597f, 18.4837f, 34.5597f, 27.6311f);
        instancePath.cubicTo(34.5597f, 33.3958f, 37.5114f, 38.4727f, 41.9891f, 41.4392f);
        instancePath.lineTo(74.8424f, 41.4335f);
        instancePath.lineTo(73.104f, 29.5047f);
        instancePath.cubicTo(71.7079f, 19.9531f, 64.1649f, 12.629f, 54.8282f, 11.2885f);
        instancePath.lineTo(53.2562f, 11.1211f);
        instancePath.lineTo(51.7361f, 11.0683f);
        instancePath.close();
        instancePath.moveTo(115.715f, 11.0683f);
        instancePath.lineTo(115.139f, 11.0683f);
        instancePath.cubicTo(104.927f, 11.0683f, 96.1885f, 18.1885f, 94.0428f, 28.0115f);
        instancePath.lineTo(93.771f, 29.5047f);
        instancePath.lineTo(92.0234f, 41.4335f);
        instancePath.lineTo(124.888f, 41.4379f);
        instancePath.cubicTo(129.009f, 38.7066f, 131.837f, 34.1873f, 132.26f, 28.9895f);
        instancePath.lineTo(132.315f, 27.6311f);
        instancePath.cubicTo(132.315f, 18.9411f, 125.608f, 11.8141f, 117.077f, 11.1232f);
        instancePath.lineTo(115.715f, 11.0683f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
