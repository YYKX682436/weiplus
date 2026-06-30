package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_link_mic extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.0538f, 11.2425f);
        instancePath.cubicTo(12.3869f, 10.626f, 12.4514f, 10.1032f, 12.2246f, 9.48763f);
        instancePath.lineTo(10.4931f, 4.94138f);
        instancePath.cubicTo(9.92182f, 3.60244f, 8.44497f, 2.87043f, 7.04991f, 3.25633f);
        instancePath.cubicTo(3.74396f, 4.28816f, 1.98106f, 7.79614f, 2.66771f, 11.1085f);
        instancePath.cubicTo(3.70178f, 15.5579f, 5.94968f, 19.5692f, 9.17866f, 22.7714f);
        instancePath.cubicTo(12.4018f, 25.9678f, 16.4292f, 28.186f, 20.8235f, 29.171f);
        instancePath.cubicTo(24.0136f, 30.0868f, 27.4999f, 28.1173f, 28.6146f, 25.0425f);
        instancePath.cubicTo(29.1147f, 23.5883f, 28.5083f, 21.9468f, 27.0295f, 21.3284f);
        instancePath.lineTo(22.4301f, 19.6192f);
        instancePath.cubicTo(21.7657f, 19.3995f, 21.275f, 19.4614f, 20.6783f, 19.7901f);
        instancePath.lineTo(17.1742f, 21.701f);
        instancePath.cubicTo(17.0579f, 21.7641f, 16.9381f, 21.7828f, 16.8215f, 21.7117f);
        instancePath.cubicTo(15.2906f, 20.8182f, 14.0526f, 19.8878f, 13.0438f, 18.8705f);
        instancePath.cubicTo(12.0172f, 17.8523f, 11.0737f, 16.6116f, 10.1885f, 15.1231f);
        instancePath.cubicTo(10.1155f, 15.0049f, 10.1077f, 14.8857f, 10.1738f, 14.7617f);
        instancePath.lineTo(12.0538f, 11.2425f);
        instancePath.close();
        instancePath.moveTo(8.81793f, 15.9487f);
        instancePath.cubicTo(8.67103f, 15.7063f, 8.54816f, 15.392f, 8.5307f, 15.0194f);
        instancePath.cubicTo(8.51265f, 14.634f, 8.61238f, 14.2895f, 8.76183f, 14.0091f);
        instancePath.lineTo(8.76254f, 14.0078f);
        instancePath.lineTo(10.6461f, 10.4819f);
        instancePath.cubicTo(10.744f, 10.3007f, 10.7556f, 10.2196f, 10.7576f, 10.2003f);
        instancePath.cubicTo(10.7587f, 10.1908f, 10.7632f, 10.1512f, 10.7256f, 10.0471f);
        instancePath.lineTo(9.01121f, 5.54591f);
        instancePath.cubicTo(8.74221f, 4.94656f, 8.08662f, 4.64166f, 7.49831f, 4.7926f);
        instancePath.cubicTo(5.09793f, 5.55877f, 3.70183f, 8.17164f, 4.23072f, 10.7658f);
        instancePath.cubicTo(5.1983f, 14.9126f, 7.29401f, 18.649f, 10.3053f, 21.6353f);
        instancePath.cubicTo(13.3176f, 24.6227f, 17.077f, 26.6915f, 21.1735f, 27.6098f);
        instancePath.lineTo(21.2196f, 27.6201f);
        instancePath.lineTo(21.265f, 27.6331f);
        instancePath.cubicTo(23.5758f, 28.2965f, 26.2484f, 26.853f, 27.1057f, 24.5102f);
        instancePath.cubicTo(27.3528f, 23.7738f, 27.0299f, 23.0776f, 26.4358f, 22.8147f);
        instancePath.lineTo(21.9044f, 21.1308f);
        instancePath.cubicTo(21.7537f, 21.0833f, 21.7001f, 21.0897f, 21.6943f, 21.0904f);
        instancePath.cubicTo(21.6856f, 21.0913f, 21.6202f, 21.098f, 21.4504f, 21.1915f);
        instancePath.lineTo(21.4443f, 21.1949f);
        instancePath.lineTo(17.9377f, 23.107f);
        instancePath.cubicTo(17.5258f, 23.3307f, 16.7727f, 23.5456f, 16.0061f, 23.0884f);
        instancePath.cubicTo(14.3887f, 22.1435f, 13.0368f, 21.1348f, 11.9124f, 20.0018f);
        instancePath.cubicTo(10.776f, 18.8738f, 9.75565f, 17.5243f, 8.81793f, 15.9487f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.9333f, 5.33331f);
        instancePath2.cubicTo(16.4178f, 5.33331f, 15.9999f, 5.75118f, 15.9999f, 6.26665f);
        instancePath2.lineTo(15.9999f, 13.0666f);
        instancePath2.cubicTo(15.9999f, 13.5821f, 16.4178f, 14.0f, 16.9333f, 14.0f);
        instancePath2.lineTo(25.3999f, 14.0f);
        instancePath2.cubicTo(25.9154f, 14.0f, 26.3333f, 13.5821f, 26.3333f, 13.0666f);
        instancePath2.lineTo(26.3333f, 11.7138f);
        instancePath2.lineTo(28.6295f, 12.9363f);
        instancePath2.cubicTo(29.2512f, 13.2672f, 30.0014f, 12.8167f, 30.0014f, 12.1124f);
        instancePath2.lineTo(30.0014f, 7.22087f);
        instancePath2.cubicTo(30.0014f, 6.51659f, 29.2512f, 6.06605f, 28.6295f, 6.39701f);
        instancePath2.lineTo(26.3333f, 7.61946f);
        instancePath2.lineTo(26.3333f, 6.26665f);
        instancePath2.cubicTo(26.3333f, 5.75118f, 25.9154f, 5.33331f, 25.3999f, 5.33331f);
        instancePath2.lineTo(16.9333f, 5.33331f);
        instancePath2.close();
        instancePath2.moveTo(17.4666f, 6.79998f);
        instancePath2.lineTo(17.4666f, 12.5333f);
        instancePath2.lineTo(24.8666f, 12.5333f);
        instancePath2.lineTo(24.8666f, 6.79998f);
        instancePath2.lineTo(17.4666f, 6.79998f);
        instancePath2.close();
        instancePath2.moveTo(26.3338f, 9.28073f);
        instancePath2.lineTo(28.5348f, 8.109f);
        instancePath2.lineTo(28.5348f, 11.2243f);
        instancePath2.lineTo(26.3338f, 10.0526f);
        instancePath2.lineTo(26.3338f, 9.28073f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
