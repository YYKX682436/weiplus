package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_shake_music extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                instancePath.moveTo(83.9058f, 20.8528f);
                instancePath.cubicTo(84.4002f, 20.8013f, 84.8427f, 21.1604f, 84.8942f, 21.6547f);
                instancePath.cubicTo(84.9028f, 21.7379f, 84.8999f, 21.8219f, 84.8853f, 21.9042f);
                instancePath.lineTo(75.7155f, 73.9088f);
                instancePath.cubicTo(74.7565f, 79.3478f, 69.5699f, 82.9795f, 64.131f, 82.0204f);
                instancePath.cubicTo(58.692f, 81.0614f, 55.0603f, 75.8748f, 56.0194f, 70.4359f);
                instancePath.cubicTo(56.9784f, 64.9969f, 62.165f, 61.3652f, 67.6039f, 62.3243f);
                instancePath.cubicTo(68.0963f, 62.4111f, 68.6807f, 62.5925f, 69.357f, 62.8683f);
                instancePath.cubicTo(70.2772f, 63.2444f, 71.3283f, 62.8037f, 71.7048f, 61.8837f);
                instancePath.cubicTo(71.7545f, 61.7621f, 71.7908f, 61.6356f, 71.813f, 61.5061f);
                instancePath.lineTo(76.1073f, 37.1342f);
                instancePath.lineTo(45.0753f, 40.3626f);
                instancePath.lineTo(38.8733f, 75.536f);
                instancePath.cubicTo(37.9526f, 80.7574f, 33.1358f, 84.3132f, 27.9399f, 83.7408f);
                instancePath.lineTo(27.2887f, 83.6476f);
                instancePath.cubicTo(21.8498f, 82.6885f, 18.2181f, 77.5019f, 19.1771f, 72.063f);
                instancePath.cubicTo(20.1361f, 66.6241f, 25.3227f, 62.9924f, 30.7617f, 63.9514f);
                instancePath.cubicTo(31.2541f, 64.0382f, 31.8384f, 64.2196f, 32.5147f, 64.4955f);
                instancePath.cubicTo(33.435f, 64.8716f, 34.486f, 64.431f, 34.8626f, 63.5109f);
                instancePath.cubicTo(34.9114f, 63.3917f, 34.9472f, 63.2675f, 34.9695f, 63.1406f);
                instancePath.lineTo(41.4111f, 26.5909f);
                instancePath.cubicTo(41.5506f, 25.7994f, 42.198f, 25.1963f, 42.9974f, 25.113f);
                instancePath.lineTo(83.9058f, 20.8528f);
                instancePath.close();
                instancePath.moveTo(31.9876f, 10.999f);
                instancePath.cubicTo(32.9336f, 14.9666f, 30.4842f, 18.9498f, 26.5167f, 19.8958f);
                instancePath.cubicTo(26.3355f, 19.939f, 26.1527f, 19.9753f, 25.9688f, 20.0047f);
                instancePath.lineTo(22.2514f, 20.5986f);
                instancePath.lineTo(27.7725f, 41.2037f);
                instancePath.cubicTo(28.916f, 45.4715f, 26.3834f, 49.8582f, 22.1156f, 51.0017f);
                instancePath.cubicTo(17.8479f, 52.1452f, 13.4612f, 49.6126f, 12.3177f, 45.3448f);
                instancePath.cubicTo(11.1741f, 41.0771f, 13.7068f, 36.6904f, 17.9745f, 35.5469f);
                instancePath.cubicTo(18.0185f, 35.5351f, 18.0646f, 35.5236f, 18.1129f, 35.5124f);
                instancePath.cubicTo(19.0813f, 35.2878f, 19.6843f, 34.3207f, 19.4598f, 33.3523f);
                instancePath.cubicTo(19.4549f, 33.3311f, 19.4496f, 33.3101f, 19.4439f, 33.2891f);
                instancePath.lineTo(14.491f, 14.8179f);
                instancePath.cubicTo(14.358f, 14.3389f, 14.6384f, 13.8429f, 15.1173f, 13.7098f);
                instancePath.cubicTo(15.1668f, 13.6961f, 15.2174f, 13.6866f, 15.2686f, 13.6827f);
                instancePath.cubicTo(19.8998f, 13.2561f, 23.2611f, 12.8792f, 25.3527f, 12.5521f);
                instancePath.cubicTo(27.6001f, 12.2006f, 29.8117f, 11.6829f, 31.9876f, 10.999f);
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
