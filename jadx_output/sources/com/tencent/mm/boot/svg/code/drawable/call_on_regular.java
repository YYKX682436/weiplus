package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class call_on_regular extends l95.c {
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
                instancePath.moveTo(5.54817f, 2.40039f);
                instancePath.lineTo(5.57482f, 2.40092f);
                instancePath.cubicTo(6.46329f, 2.43054f, 7.23165f, 2.95223f, 7.58567f, 3.79178f);
                instancePath.lineTo(8.90078f, 7.28895f);
                instancePath.cubicTo(9.07295f, 7.76247f, 9.02175f, 8.16378f, 8.76393f, 8.63615f);
                instancePath.lineTo(8.26817f, 9.5284f);
                instancePath.lineTo(7.68459f, 10.6124f);
                instancePath.lineTo(7.30869f, 11.3328f);
                instancePath.cubicTo(7.28413f, 11.3784f, 7.2705f, 11.4313f, 7.2705f, 11.4746f);
                instancePath.cubicTo(7.2705f, 11.5064f, 7.28506f, 11.5553f, 7.31881f, 11.6104f);
                instancePath.cubicTo(7.99385f, 12.7565f, 8.71449f, 13.7125f, 9.49961f, 14.4977f);
                instancePath.cubicTo(10.2711f, 15.2823f, 11.2188f, 16.0009f, 12.3918f, 16.692f);
                instancePath.cubicTo(12.4363f, 16.7195f, 12.4699f, 16.7294f, 12.5092f, 16.7294f);
                instancePath.cubicTo(12.5606f, 16.7294f, 12.5985f, 16.7194f, 12.6626f, 16.6849f);
                instancePath.lineTo(13.1309f, 16.4386f);
                instancePath.lineTo(13.9853f, 15.9805f);
                instancePath.lineTo(15.36f, 15.2287f);
                instancePath.cubicTo(15.8193f, 14.9782f, 16.1964f, 14.9323f, 16.706f, 15.1031f);
                instancePath.lineTo(20.2328f, 16.4307f);
                instancePath.cubicTo(21.0192f, 16.7635f, 21.5375f, 17.5139f, 21.5944f, 18.3704f);
                instancePath.cubicTo(21.6014f, 18.455f, 21.6017f, 18.5401f, 21.5956f, 18.6262f);
                instancePath.cubicTo(21.5843f, 18.7856f, 21.5527f, 18.9413f, 21.4958f, 19.1231f);
                instancePath.lineTo(21.4382f, 19.2883f);
                instancePath.cubicTo(20.7082f, 21.2757f, 18.8334f, 22.6003f, 16.7196f, 22.6003f);
                instancePath.cubicTo(16.2731f, 22.6003f, 15.7643f, 22.5281f, 15.4412f, 22.4338f);
                instancePath.cubicTo(12.0695f, 21.6631f, 8.98356f, 19.9465f, 6.5185f, 17.4812f);
                instancePath.cubicTo(4.04898f, 15.0114f, 2.33553f, 11.9234f, 1.55575f, 8.50285f);
                instancePath.lineTo(1.48827f, 8.17028f);
                instancePath.cubicTo(1.42971f, 7.85212f, 1.3999f, 7.56338f, 1.3999f, 7.27923f);
                instancePath.cubicTo(1.3999f, 5.16285f, 2.72674f, 3.28949f, 4.75542f, 2.54533f);
                instancePath.lineTo(4.94673f, 2.4865f);
                instancePath.cubicTo(5.07923f, 2.45045f, 5.20664f, 2.42527f, 5.3335f, 2.41161f);
                instancePath.cubicTo(5.40266f, 2.40416f, 5.4707f, 2.40031f, 5.54817f, 2.40039f);
                instancePath.close();
                instancePath.moveTo(5.54342f, 3.60042f);
                instancePath.lineTo(5.46195f, 3.60455f);
                instancePath.cubicTo(5.40191f, 3.61102f, 5.33603f, 3.62404f, 5.28158f, 3.63849f);
                instancePath.lineTo(5.13958f, 3.68158f);
                instancePath.cubicTo(3.60969f, 4.24342f, 2.59985f, 5.66921f, 2.59985f, 7.27908f);
                instancePath.cubicTo(2.59985f, 7.48506f, 2.62229f, 7.70242f, 2.66629f, 7.94201f);
                instancePath.lineTo(2.72867f, 8.24981f);
                instancePath.cubicTo(3.45506f, 11.4354f, 5.05673f, 14.322f, 7.36702f, 16.6325f);
                instancePath.cubicTo(9.67319f, 18.9389f, 12.558f, 20.5437f, 15.7412f, 21.2723f);
                instancePath.lineTo(15.8765f, 21.3066f);
                instancePath.cubicTo(16.1196f, 21.361f, 16.4415f, 21.4002f, 16.7196f, 21.4002f);
                instancePath.cubicTo(18.3274f, 21.4002f, 19.7543f, 20.392f, 20.3083f, 18.8841f);
                instancePath.lineTo(20.3562f, 18.7475f);
                instancePath.cubicTo(20.3808f, 18.6683f, 20.3942f, 18.6022f, 20.3985f, 18.5414f);
                instancePath.cubicTo(20.4003f, 18.5153f, 20.4003f, 18.4917f, 20.3977f, 18.4599f);
                instancePath.cubicTo(20.3697f, 18.0392f, 20.128f, 17.6892f, 19.7876f, 17.5447f);
                instancePath.lineTo(16.3043f, 16.2336f);
                instancePath.cubicTo(16.1466f, 16.1808f, 16.1126f, 16.1849f, 15.9352f, 16.2817f);
                instancePath.lineTo(14.5567f, 17.0356f);
                instancePath.lineTo(13.6937f, 17.4983f);
                instancePath.lineTo(13.2262f, 17.7442f);
                instancePath.cubicTo(12.9957f, 17.8682f, 12.7632f, 17.9292f, 12.5092f, 17.9292f);
                instancePath.cubicTo(12.2433f, 17.9292f, 11.9929f, 17.8555f, 11.7726f, 17.7198f);
                instancePath.cubicTo(10.5238f, 16.984f, 9.49326f, 16.2027f, 8.64743f, 15.3425f);
                instancePath.cubicTo(7.79019f, 14.4851f, 7.00893f, 13.4488f, 6.29058f, 12.2289f);
                instancePath.cubicTo(6.14929f, 11.999f, 6.07045f, 11.7339f, 6.07045f, 11.4744f);
                instancePath.cubicTo(6.07045f, 11.2302f, 6.13443f, 10.9823f, 6.24838f, 10.7707f);
                instancePath.lineTo(6.62427f, 10.0503f);
                instancePath.lineTo(7.21531f, 8.95246f);
                instancePath.lineTo(7.71272f, 8.05717f);
                instancePath.cubicTo(7.81271f, 7.87396f, 7.81893f, 7.82525f, 7.77525f, 7.70502f);
                instancePath.lineTo(6.47128f, 4.23624f);
                instancePath.cubicTo(6.3103f, 3.85504f, 5.96313f, 3.61747f, 5.54342f, 3.60042f);
                instancePath.close();
                instancePath.moveTo(5.54342f, 3.60042f);
                instancePath.lineTo(5.54478f, 3.60035f);
                instancePath.lineTo(5.53479f, 3.6001f);
                instancePath.cubicTo(5.53767f, 3.60019f, 5.54055f, 3.6003f, 5.54342f, 3.60042f);
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
