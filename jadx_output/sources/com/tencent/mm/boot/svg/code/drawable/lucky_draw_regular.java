package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_draw_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePath.moveTo(12.109f, 1.875f);
                instancePath.cubicTo(13.3182f, 1.875f, 14.3602f, 2.59036f, 14.8351f, 3.62094f);
                instancePath.cubicTo(15.141f, 3.464f, 15.4896f, 3.375f, 15.859f, 3.375f);
                instancePath.cubicTo(17.1016f, 3.375f, 18.109f, 4.38236f, 18.109f, 5.625f);
                instancePath.cubicTo(18.109f, 6.12728f, 17.9444f, 6.59112f, 17.6662f, 6.96553f);
                instancePath.cubicTo(19.8585f, 8.4506f, 21.1687f, 10.3935f, 21.5111f, 12.6675f);
                instancePath.cubicTo(21.5569f, 12.9714f, 21.5854f, 13.2812f, 21.5964f, 13.5966f);
                instancePath.lineTo(21.6f, 13.794f);
                instancePath.lineTo(21.5969f, 13.9891f);
                instancePath.cubicTo(21.6f, 19.1665f, 17.2008f, 21.68f, 12.0232f, 21.68f);
                instancePath.cubicTo(6.93794f, 21.68f, 2.54115f, 19.2554f, 2.38574f, 14.2636f);
                instancePath.lineTo(2.38149f, 13.9888f);
                instancePath.cubicTo(2.38029f, 13.8598f, 2.38045f, 13.729f, 2.38514f, 13.5966f);
                instancePath.cubicTo(2.47959f, 10.8866f, 3.86501f, 8.5909f, 6.41204f, 6.89944f);
                instancePath.cubicTo(6.16152f, 6.53786f, 6.01524f, 6.09851f, 6.01524f, 5.625f);
                instancePath.cubicTo(6.01524f, 4.38236f, 7.0226f, 3.375f, 8.26524f, 3.375f);
                instancePath.cubicTo(8.66478f, 3.375f, 9.03999f, 3.47914f, 9.36522f, 3.66175f);
                instancePath.cubicTo(9.83027f, 2.60937f, 10.8839f, 1.875f, 12.109f, 1.875f);
                instancePath.close();
                instancePath.moveTo(16.7129f, 7.69501f);
                instancePath.lineTo(16.3101f, 7.79787f);
                instancePath.cubicTo(15.102f, 8.12595f, 14.0049f, 8.5965f, 13.0406f, 9.17596f);
                instancePath.cubicTo(13.6059f, 9.63754f, 14.1125f, 10.1395f, 14.5552f, 10.6729f);
                instancePath.lineTo(14.7217f, 10.8788f);
                instancePath.lineTo(13.7788f, 11.6212f);
                instancePath.cubicTo(13.2832f, 10.9917f, 12.6868f, 10.4063f, 12.0007f, 9.88199f);
                instancePath.cubicTo(11.3849f, 10.352f, 10.8426f, 10.8704f, 10.3801f, 11.4256f);
                instancePath.lineTo(10.2217f, 11.6212f);
                instancePath.lineTo(9.27883f, 10.8788f);
                instancePath.cubicTo(9.75956f, 10.2683f, 10.3225f, 9.69653f, 10.9593f, 9.17551f);
                instancePath.cubicTo(9.89393f, 8.53543f, 8.66616f, 8.02813f, 7.30556f, 7.69911f);
                instancePath.cubicTo(7.23912f, 7.77485f, 7.16246f, 7.8416f, 7.07589f, 7.89909f);
                instancePath.cubicTo(4.83715f, 9.38582f, 3.66473f, 11.3339f, 3.58439f, 13.6391f);
                instancePath.lineTo(3.58084f, 13.8488f);
                instancePath.lineTo(3.58516f, 14.2263f);
                instancePath.cubicTo(3.70688f, 18.1358f, 7.04989f, 20.48f, 12.0232f, 20.48f);
                instancePath.cubicTo(16.9842f, 20.48f, 20.2687f, 18.1524f, 20.3939f, 14.1885f);
                instancePath.lineTo(20.3976f, 13.9488f);
                instancePath.cubicTo(20.401f, 13.8472f, 20.4009f, 13.744f, 20.3971f, 13.6384f);
                instancePath.cubicTo(20.3877f, 13.369f, 20.3635f, 13.1049f, 20.3245f, 12.8462f);
                instancePath.cubicTo(20.0341f, 10.9179f, 18.9183f, 9.26313f, 16.9932f, 7.95903f);
                instancePath.cubicTo(16.8831f, 7.88443f, 16.7894f, 7.79489f, 16.7129f, 7.69501f);
                instancePath.close();
                instancePath.moveTo(12.109f, 3.075f);
                instancePath.cubicTo(11.4409f, 3.075f, 10.8404f, 3.44199f, 10.5294f, 4.01177f);
                instancePath.lineTo(10.4628f, 4.14678f);
                instancePath.cubicTo(10.1946f, 4.75386f, 9.4908f, 5.02065f, 8.89523f, 4.76602f);
                instancePath.lineTo(8.77771f, 4.70809f);
                instancePath.cubicTo(8.62281f, 4.62112f, 8.44877f, 4.575f, 8.26524f, 4.575f);
                instancePath.cubicTo(7.68535f, 4.575f, 7.21524f, 5.0451f, 7.21524f, 5.625f);
                instancePath.cubicTo(7.21524f, 5.79819f, 7.25641f, 5.96276f, 7.33373f, 6.10947f);
                instancePath.lineTo(7.39841f, 6.21602f);
                instancePath.cubicTo(7.46589f, 6.3134f, 7.51695f, 6.41721f, 7.55221f, 6.52419f);
                instancePath.cubicTo(9.22678f, 6.92517f, 10.7261f, 7.57786f, 12.0011f, 8.41346f);
                instancePath.cubicTo(13.3034f, 7.55932f, 14.8403f, 6.89645f, 16.5607f, 6.49788f);
                instancePath.cubicTo(16.58f, 6.45233f, 16.6028f, 6.40682f, 16.6287f, 6.36243f);
                instancePath.lineTo(16.703f, 6.24987f);
                instancePath.cubicTo(16.8364f, 6.07026f, 16.909f, 5.85471f, 16.909f, 5.625f);
                instancePath.cubicTo(16.909f, 5.0451f, 16.4389f, 4.575f, 15.859f, 4.575f);
                instancePath.cubicTo(15.7316f, 4.575f, 15.6088f, 4.5972f, 15.4944f, 4.6396f);
                instancePath.lineTo(15.3828f, 4.68866f);
                instancePath.cubicTo(14.8134f, 4.98074f, 14.1234f, 4.773f, 13.804f, 4.23507f);
                instancePath.lineTo(13.7452f, 4.12313f);
                instancePath.cubicTo(13.4532f, 3.48926f, 12.8189f, 3.075f, 12.109f, 3.075f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
