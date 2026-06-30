package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class weixin_store_medium extends l95.c {
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
                instancePath.moveTo(11.998f, 21.374f);
                instancePath.lineTo(11.9941f, 21.374f);
                instancePath.lineTo(11.9961f, 21.373f);
                instancePath.lineTo(11.998f, 21.374f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(19.0566f, 14.8818f);
                instancePath2.cubicTo(19.4666f, 14.9399f, 19.7524f, 15.3205f, 19.6924f, 15.7305f);
                instancePath2.cubicTo(19.2342f, 18.9478f, 15.9252f, 21.3724f, 11.9961f, 21.373f);
                instancePath2.cubicTo(8.06734f, 21.3721f, 4.75895f, 18.9476f, 4.30078f, 15.7305f);
                instancePath2.cubicTo(4.24278f, 15.3205f, 4.52652f, 14.9398f, 4.93652f, 14.8818f);
                instancePath2.cubicTo(5.34634f, 14.8239f, 5.72595f, 15.1079f, 5.78418f, 15.5176f);
                instancePath2.cubicTo(6.13817f, 18.0015f, 8.80827f, 19.8739f, 11.9961f, 19.874f);
                instancePath2.cubicTo(15.1841f, 19.874f, 17.854f, 18.0016f, 18.208f, 15.5176f);
                instancePath2.cubicTo(18.2662f, 15.1078f, 18.6488f, 14.8239f, 19.0566f, 14.8818f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(16.626f, 2.62793f);
                instancePath3.cubicTo(18.01f, 2.62793f, 19.2737f, 3.44402f, 19.8438f, 4.70801f);
                instancePath3.lineTo(19.8818f, 4.7959f);
                instancePath3.lineTo(21.6855f, 8.76367f);
                instancePath3.cubicTo(21.8935f, 9.17567f, 22.0f, 9.61808f, 22.0f, 10.0801f);
                instancePath3.cubicTo(21.9999f, 11.622f, 20.7896f, 12.9401f, 19.0557f, 13.2861f);
                instancePath3.cubicTo(18.7779f, 13.3441f, 18.4861f, 13.374f, 18.1963f, 13.374f);
                instancePath3.lineTo(18.1982f, 13.3701f);
                instancePath3.cubicTo(17.4422f, 13.3701f, 16.7118f, 13.1775f, 16.0898f, 12.8135f);
                instancePath3.cubicTo(15.756f, 12.6275f, 15.4457f, 12.3782f, 15.1738f, 12.0703f);
                instancePath3.cubicTo(14.4098f, 12.8821f, 13.2539f, 13.3701f, 12.0f, 13.3701f);
                instancePath3.cubicTo(10.7461f, 13.3701f, 9.59399f, 12.8843f, 8.83398f, 12.0664f);
                instancePath3.cubicTo(8.57607f, 12.3642f, 8.25425f, 12.6243f, 7.89844f, 12.8223f);
                instancePath3.cubicTo(7.06253f, 13.3102f, 5.99218f, 13.4982f, 4.94629f, 13.2803f);
                instancePath3.cubicTo(3.21638f, 12.9463f, 2.00013f, 11.6281f, 2.0f, 10.0762f);
                instancePath3.cubicTo(2.0f, 9.64817f, 2.09799f, 9.21971f, 2.29199f, 8.80371f);
                instancePath3.lineTo(2.31152f, 8.76367f);
                instancePath3.lineTo(4.1416f, 4.74805f);
                instancePath3.cubicTo(4.1456f, 4.73805f, 4.15025f, 4.72777f, 4.15625f, 4.71777f);
                instancePath3.cubicTo(4.7243f, 3.44791f, 5.98807f, 2.62794f, 7.37598f, 2.62793f);
                instancePath3.lineTo(16.626f, 2.62793f);
                instancePath3.close();
                instancePath3.moveTo(7.37793f, 4.12793f);
                instancePath3.cubicTo(6.58596f, 4.12796f, 5.86617f, 4.59438f, 5.53418f, 5.31836f);
                instancePath3.lineTo(5.52246f, 5.34766f);
                instancePath3.cubicTo(5.51847f, 5.35964f, 5.51185f, 5.37181f, 5.50586f, 5.38379f);
                instancePath3.lineTo(3.67383f, 9.40039f);
                instancePath3.cubicTo(3.67254f, 9.40299f, 3.6659f, 9.41642f, 3.66406f, 9.42188f);
                instancePath3.lineTo(3.64648f, 9.45801f);
                instancePath3.cubicTo(3.55448f, 9.65601f, 3.50195f, 9.87017f, 3.50195f, 10.0762f);
                instancePath3.cubicTo(3.5021f, 10.8861f, 4.23424f, 11.6156f, 5.24414f, 11.8096f);
                instancePath3.cubicTo(5.43801f, 11.8495f, 5.62582f, 11.8701f, 5.80371f, 11.8701f);
                instancePath3.cubicTo(6.29571f, 11.8701f, 6.76225f, 11.7475f, 7.15625f, 11.5195f);
                instancePath3.cubicTo(7.40609f, 11.3796f, 7.61454f, 11.2019f, 7.77246f, 10.998f);
                instancePath3.cubicTo(7.91634f, 10.8142f, 8.01551f, 10.6139f, 8.06152f, 10.4141f);
                instancePath3.cubicTo(8.13751f, 10.0881f, 8.42189f, 9.85202f, 8.75781f, 9.83594f);
                instancePath3.cubicTo(9.09572f, 9.81794f, 9.39782f, 10.0298f, 9.50391f, 10.3477f);
                instancePath3.cubicTo(9.53991f, 10.4577f, 9.59034f, 10.5641f, 9.65234f, 10.6621f);
                instancePath3.cubicTo(9.65624f, 10.668f, 9.66016f, 10.6758f, 9.66406f, 10.6816f);
                instancePath3.cubicTo(10.0841f, 11.4036f, 11.002f, 11.8721f, 12.002f, 11.8721f);
                instancePath3.cubicTo(13.002f, 11.8721f, 13.9235f, 11.4056f, 14.3535f, 10.6836f);
                instancePath3.cubicTo(14.4215f, 10.5756f, 14.4643f, 10.4815f, 14.4883f, 10.3955f);
                instancePath3.cubicTo(14.5784f, 10.0718f, 14.8741f, 9.84572f, 15.21f, 9.8457f);
                instancePath3.lineTo(15.21f, 9.84375f);
                instancePath3.lineTo(15.2256f, 9.84375f);
                instancePath3.cubicTo(15.5676f, 9.84975f, 15.8644f, 10.0879f, 15.9424f, 10.4219f);
                instancePath3.cubicTo(15.9884f, 10.6158f, 16.0836f, 10.8082f, 16.2275f, 10.9922f);
                instancePath3.cubicTo(16.4015f, 11.2082f, 16.608f, 11.3837f, 16.834f, 11.5117f);
                instancePath3.cubicTo(17.394f, 11.8397f, 18.0878f, 11.9515f, 18.7578f, 11.8115f);
                instancePath3.cubicTo(19.7877f, 11.6055f, 20.5018f, 10.8921f, 20.502f, 10.0762f);
                instancePath3.cubicTo(20.502f, 9.85017f, 20.4498f, 9.63169f, 20.3438f, 9.42969f);
                instancePath3.cubicTo(20.3378f, 9.41975f, 20.3341f, 9.40739f, 20.3281f, 9.39551f);
                instancePath3.lineTo(18.4756f, 5.32031f);
                instancePath3.cubicTo(18.1496f, 4.59831f, 17.4219f, 4.12793f, 16.6279f, 4.12793f);
                instancePath3.lineTo(7.37793f, 4.12793f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
