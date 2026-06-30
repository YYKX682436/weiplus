package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_draw_filled extends l95.c {
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
                instancePath.moveTo(5.70926f, 7.40513f);
                instancePath.cubicTo(7.7159f, 7.66399f, 9.49171f, 8.29376f, 10.9593f, 9.17551f);
                instancePath.cubicTo(10.3225f, 9.69653f, 9.75956f, 10.2683f, 9.27883f, 10.8788f);
                instancePath.lineTo(10.2217f, 11.6212f);
                instancePath.lineTo(10.3801f, 11.4256f);
                instancePath.cubicTo(10.8426f, 10.8704f, 11.3849f, 10.352f, 12.0007f, 9.88199f);
                instancePath.cubicTo(12.6868f, 10.4063f, 13.2832f, 10.9917f, 13.7788f, 11.6212f);
                instancePath.lineTo(14.7217f, 10.8788f);
                instancePath.lineTo(14.5552f, 10.6729f);
                instancePath.cubicTo(14.1125f, 10.1395f, 13.6059f, 9.63754f, 13.0406f, 9.17596f);
                instancePath.cubicTo(14.5046f, 8.29625f, 16.2746f, 7.66753f, 18.2744f, 7.40731f);
                instancePath.cubicTo(20.1023f, 8.82862f, 21.2017f, 10.613f, 21.5111f, 12.6675f);
                instancePath.cubicTo(21.5569f, 12.9714f, 21.5854f, 13.2812f, 21.5964f, 13.5966f);
                instancePath.cubicTo(21.6011f, 13.729f, 21.6012f, 13.8599f, 21.5969f, 13.9891f);
                instancePath.cubicTo(21.6f, 19.1665f, 17.2008f, 21.68f, 12.0232f, 21.68f);
                instancePath.cubicTo(6.93794f, 21.68f, 2.54115f, 19.2554f, 2.38574f, 14.2636f);
                instancePath.lineTo(2.38149f, 13.9888f);
                instancePath.cubicTo(2.38029f, 13.8598f, 2.38045f, 13.729f, 2.38514f, 13.5966f);
                instancePath.cubicTo(2.46947f, 11.177f, 3.58295f, 9.08759f, 5.63351f, 7.4637f);
                instancePath.lineTo(5.70926f, 7.40513f);
                instancePath.close();
                instancePath.moveTo(12.109f, 1.875f);
                instancePath.cubicTo(13.3182f, 1.875f, 14.3602f, 2.59036f, 14.8351f, 3.62094f);
                instancePath.cubicTo(15.141f, 3.464f, 15.4896f, 3.375f, 15.859f, 3.375f);
                instancePath.cubicTo(17.1016f, 3.375f, 18.109f, 4.38236f, 18.109f, 5.625f);
                instancePath.cubicTo(18.109f, 5.83526f, 18.0802f, 6.03878f, 18.0262f, 6.23182f);
                instancePath.cubicTo(15.7059f, 6.54537f, 13.6625f, 7.32376f, 12.0011f, 8.41346f);
                instancePath.cubicTo(10.3695f, 7.34418f, 8.37066f, 6.57442f, 6.10457f, 6.248f);
                instancePath.cubicTo(6.04594f, 6.05164f, 6.01524f, 5.8419f, 6.01524f, 5.625f);
                instancePath.cubicTo(6.01524f, 4.38236f, 7.0226f, 3.375f, 8.26524f, 3.375f);
                instancePath.cubicTo(8.66478f, 3.375f, 9.03999f, 3.47914f, 9.36522f, 3.66175f);
                instancePath.cubicTo(9.83027f, 2.60937f, 10.8839f, 1.875f, 12.109f, 1.875f);
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
