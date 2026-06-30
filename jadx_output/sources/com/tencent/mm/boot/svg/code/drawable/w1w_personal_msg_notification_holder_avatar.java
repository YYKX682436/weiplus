package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class w1w_personal_msg_notification_holder_avatar extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 48;
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
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(48.0f, 0.0f);
                instancePath.lineTo(48.0f, 48.0f);
                instancePath.lineTo(0.0f, 48.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(31.4064f, 17.3356f);
                instancePath2.cubicTo(30.2327f, 14.9549f, 27.2637f, 12.9172f, 23.902f, 12.9167f);
                instancePath2.cubicTo(22.1378f, 12.9163f, 19.4429f, 13.5136f, 17.4292f, 15.9156f);
                instancePath2.cubicTo(16.0844f, 17.5195f, 15.6316f, 19.3967f, 15.9152f, 21.2687f);
                instancePath2.cubicTo(16.1097f, 22.5549f, 16.8361f, 24.2517f, 17.8751f, 25.325f);
                instancePath2.cubicTo(18.2668f, 22.6041f, 19.7197f, 20.4642f, 21.6247f, 18.8913f);
                instancePath2.cubicTo(25.0642f, 16.2994f, 28.7362f, 16.4462f, 31.4064f, 17.3356f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-1);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(34.0903f, 21.4176f);
                instancePath3.cubicTo(31.9859f, 18.7238f, 28.3482f, 17.9701f, 25.0644f, 19.1713f);
                instancePath3.cubicTo(25.1701f, 19.2028f, 25.2761f, 19.2339f, 25.3816f, 19.2691f);
                instancePath3.cubicTo(30.2435f, 20.9029f, 32.8711f, 26.1056f, 31.2507f, 30.8894f);
                instancePath3.cubicTo(30.8195f, 32.162f, 30.1292f, 33.275f, 29.2594f, 34.1951f);
                instancePath3.cubicTo(30.3071f, 33.909f, 31.3792f, 33.5f, 32.2989f, 32.8009f);
                instancePath3.cubicTo(36.0017f, 29.9866f, 36.7305f, 24.7973f, 34.0903f, 21.4176f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
                instancePaint6.setColor(-1);
                android.graphics.Path instancePath4 = l95.c.instancePath(looper);
                instancePath4.moveTo(23.8926f, 30.0234f);
                instancePath4.cubicTo(23.1538f, 30.0234f, 22.4383f, 29.9396f, 21.7499f, 29.7879f);
                instancePath4.cubicTo(21.6659f, 29.7709f, 21.5793f, 29.7609f, 21.4895f, 29.7648f);
                instancePath4.cubicTo(21.2855f, 29.7735f, 21.1027f, 29.843f, 20.9319f, 29.951f);
                instancePath4.lineTo(18.6614f, 31.3867f);
                instancePath4.cubicTo(18.5978f, 31.4266f, 18.5363f, 31.4579f, 18.4592f, 31.4612f);
                instancePath4.cubicTo(18.2629f, 31.4696f, 18.0975f, 31.3181f, 18.089f, 31.124f);
                instancePath4.cubicTo(18.0852f, 31.0363f, 18.1167f, 30.9478f, 18.1351f, 30.8636f);
                instancePath4.cubicTo(18.1462f, 30.8132f, 18.3868f, 29.7368f, 18.5368f, 29.0653f);
                instancePath4.cubicTo(18.5543f, 28.9897f, 18.568f, 28.9169f, 18.5647f, 28.8392f);
                instancePath4.cubicTo(18.5545f, 28.6056f, 18.4301f, 28.4038f, 18.2482f, 28.2829f);
                instancePath4.cubicTo(15.8552f, 26.6734f, 14.2142f, 24.1442f, 13.853f, 21.544f);
                instancePath4.cubicTo(13.2515f, 22.4771f, 12.9309f, 23.2186f, 12.6172f, 24.2996f);
                instancePath4.cubicTo(11.4475f, 28.3333f, 14.0077f, 33.1657f, 18.1857f, 34.5193f);
                instancePath4.cubicTo(22.9906f, 36.0758f, 27.5753f, 34.3286f, 29.1592f, 30.2978f);
                instancePath4.cubicTo(29.3516f, 29.8082f, 29.5621f, 28.9769f, 29.6059f, 28.2862f);
                instancePath4.cubicTo(27.9233f, 29.5072f, 26.1418f, 30.0234f, 23.8926f, 30.0234f);
                instancePath4.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
                canvas.drawPath(instancePath4, instancePaint6);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
