package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class song_list_filled extends l95.c {
    private final int width = 24;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 25;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(16.5886f, 3.44092f);
            instancePath.cubicTo(18.5586f, 3.44597f, 19.5992f, 3.50411f, 20.2678f, 4.17267f);
            instancePath.cubicTo(20.9363f, 4.84123f, 20.9945f, 5.88183f, 20.9995f, 7.85181f);
            instancePath.lineTo(20.9995f, 17.029f);
            instancePath.cubicTo(20.9945f, 18.9991f, 20.9363f, 20.0397f, 20.2678f, 20.7082f);
            instancePath.cubicTo(19.5992f, 21.3767f, 18.5586f, 21.4349f, 16.5886f, 21.4399f);
            instancePath.lineTo(7.41138f, 21.4399f);
            instancePath.cubicTo(5.4414f, 21.4349f, 4.4008f, 21.3767f, 3.73224f, 20.7082f);
            instancePath.cubicTo(3.06368f, 20.0397f, 3.00554f, 18.9991f, 3.00049f, 17.029f);
            instancePath.lineTo(3.00049f, 7.85181f);
            instancePath.cubicTo(3.00554f, 5.88183f, 3.06368f, 4.84123f, 3.73224f, 4.17267f);
            instancePath.cubicTo(4.4008f, 3.50411f, 5.4414f, 3.44597f, 7.41138f, 3.44092f);
            instancePath.lineTo(16.5886f, 3.44092f);
            instancePath.close();
            instancePath.moveTo(10.3384f, 15.5359f);
            instancePath.lineTo(10.3425f, 15.6899f);
            instancePath.lineTo(6.00001f, 15.6904f);
            instancePath.lineTo(6.00001f, 17.1904f);
            instancePath.lineTo(10.8226f, 17.1902f);
            instancePath.cubicTo(10.5168f, 16.7104f, 10.3384f, 16.1437f, 10.3384f, 15.5359f);
            instancePath.close();
            instancePath.moveTo(15.3916f, 7.71771f);
            instancePath.cubicTo(15.2596f, 7.67023f, 15.107f, 7.6852f, 14.9865f, 7.7591f);
            instancePath.cubicTo(14.9793f, 7.76292f, 14.9681f, 7.76918f, 14.9571f, 7.77707f);
            instancePath.cubicTo(14.946f, 7.78496f, 14.9329f, 7.79591f, 14.9201f, 7.81061f);
            instancePath.cubicTo(14.8877f, 7.84015f, 14.8624f, 7.87291f, 14.8432f, 7.90388f);
            instancePath.cubicTo(14.7365f, 8.06046f, 14.6934f, 8.2838f, 14.6934f, 8.58348f);
            instancePath.lineTo(14.6934f, 12.3837f);
            instancePath.cubicTo(14.6934f, 12.8053f, 14.6722f, 13.084f, 14.6286f, 13.2725f);
            instancePath.cubicTo(14.5861f, 13.4565f, 14.5271f, 13.5342f, 14.4643f, 13.5791f);
            instancePath.cubicTo(14.3918f, 13.631f, 14.287f, 13.6601f, 14.1027f, 13.6915f);
            instancePath.cubicTo(14.0661f, 13.6978f, 14.0269f, 13.7041f, 13.9852f, 13.7107f);
            instancePath.cubicTo(13.828f, 13.7359f, 13.636f, 13.7666f, 13.4171f, 13.8223f);
            instancePath.cubicTo(12.5908f, 14.0314f, 11.8384f, 14.6071f, 11.8384f, 15.5359f);
            instancePath.cubicTo(11.8384f, 16.453f, 12.646f, 17.2042f, 13.5777f, 17.1719f);
            instancePath.cubicTo(14.1314f, 17.155f, 14.556f, 16.9944f, 14.8765f, 16.7383f);
            instancePath.cubicTo(15.1953f, 16.4835f, 15.3986f, 16.1442f, 15.5287f, 15.7896f);
            instancePath.cubicTo(15.7712f, 15.1283f, 15.7695f, 14.3807f, 15.7684f, 13.9463f);
            instancePath.lineTo(15.7683f, 10.434f);
            instancePath.cubicTo(15.7753f, 10.2861f, 15.806f, 10.2193f, 15.8308f, 10.19f);
            instancePath.cubicTo(15.8493f, 10.1682f, 15.8819f, 10.1465f, 15.9661f, 10.1459f);
            instancePath.cubicTo(16.0552f, 10.1452f, 16.1777f, 10.1688f, 16.3435f, 10.2183f);
            instancePath.cubicTo(16.5066f, 10.267f, 16.6971f, 10.336f, 16.9202f, 10.4176f);
            instancePath.cubicTo(17.1741f, 10.5183f, 17.4071f, 10.6244f, 17.6093f, 10.7637f);
            instancePath.cubicTo(17.8007f, 10.8938f, 17.9109f, 11.0416f, 17.9655f, 11.1905f);
            instancePath.cubicTo(18.0204f, 11.3399f, 18.0235f, 11.5021f, 17.9809f, 11.6663f);
            instancePath.cubicTo(17.8946f, 11.999f, 17.6221f, 12.3289f, 17.2566f, 12.5216f);
            instancePath.cubicTo(16.9802f, 12.6736f, 17.134f, 13.0809f, 17.4313f, 13.0282f);
            instancePath.cubicTo(18.1165f, 12.909f, 18.649f, 12.394f, 18.8463f, 11.7832f);
            instancePath.cubicTo(19.0462f, 11.1645f, 18.9029f, 10.4442f, 18.2419f, 9.93369f);
            instancePath.cubicTo(17.8917f, 9.63789f, 17.4721f, 9.47923f, 17.0897f, 9.33465f);
            instancePath.cubicTo(17.0567f, 9.32216f, 17.024f, 9.30977f, 16.9916f, 9.29741f);
            instancePath.cubicTo(16.5715f, 9.13723f, 16.2045f, 8.98023f, 15.934f, 8.67733f);
            instancePath.cubicTo(15.7816f, 8.50355f, 15.6917f, 8.29507f, 15.6754f, 8.08749f);
            instancePath.cubicTo(15.6513f, 7.8945f, 15.5353f, 7.76941f, 15.3916f, 7.71771f);
            instancePath.close();
            instancePath.moveTo(13.1915f, 11.6899f);
            instancePath.lineTo(6.00001f, 11.6904f);
            instancePath.lineTo(6.00001f, 13.1904f);
            instancePath.lineTo(11.4198f, 13.1902f);
            instancePath.cubicTo(11.8036f, 12.8604f, 12.2697f, 12.6076f, 12.7854f, 12.4433f);
            instancePath.lineTo(13.0472f, 12.3686f);
            instancePath.lineTo(13.1925f, 12.3329f);
            instancePath.lineTo(13.1915f, 11.6899f);
            instancePath.close();
            instancePath.moveTo(13.303f, 7.68905f);
            instancePath.lineTo(6.00001f, 7.69044f);
            instancePath.lineTo(6.00001f, 9.19044f);
            instancePath.lineTo(13.1925f, 9.18992f);
            instancePath.lineTo(13.1934f, 8.58348f);
            instancePath.cubicTo(13.1934f, 8.25612f, 13.2265f, 7.95753f, 13.303f, 7.68905f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
