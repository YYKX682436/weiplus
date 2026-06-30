package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class official_accounts_filled extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(30.5812f, 10.4795f);
                instancePath.cubicTo(28.9044f, 7.07844f, 24.663f, 4.16742f, 19.8606f, 4.16675f);
                instancePath.cubicTo(17.3403f, 4.16608f, 13.4905f, 5.01942f, 10.6137f, 8.45078f);
                instancePath.cubicTo(8.69253f, 10.7421f, 8.04572f, 13.4238f, 8.4509f, 16.0982f);
                instancePath.cubicTo(8.72869f, 17.9355f, 9.76648f, 20.3595f, 11.2507f, 21.8929f);
                instancePath.cubicTo(11.8103f, 18.0058f, 13.8859f, 14.9488f, 16.6073f, 12.7018f);
                instancePath.cubicTo(21.5209f, 8.99912f, 26.7666f, 9.20879f, 30.5812f, 10.4795f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(34.4153f, 16.3109f);
                instancePath2.cubicTo(31.4091f, 12.4625f, 26.2123f, 11.3858f, 21.5211f, 13.1018f);
                instancePath2.cubicTo(21.6722f, 13.1468f, 21.8235f, 13.1912f, 21.9743f, 13.2415f);
                instancePath2.cubicTo(28.9198f, 15.5755f, 32.6736f, 23.0079f, 30.3588f, 29.842f);
                instancePath2.cubicTo(29.7427f, 31.66f, 28.7566f, 33.25f, 27.514f, 34.5643f);
                instancePath2.cubicTo(29.0107f, 34.1557f, 30.5423f, 33.5713f, 31.8561f, 32.5727f);
                instancePath2.cubicTo(37.1458f, 28.5523f, 38.187f, 21.1389f, 34.4153f, 16.3109f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-1);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(19.8472f, 28.6048f);
                instancePath3.cubicTo(18.7918f, 28.6048f, 17.7696f, 28.4851f, 16.7862f, 28.2684f);
                instancePath3.cubicTo(16.6662f, 28.2441f, 16.5425f, 28.2298f, 16.4141f, 28.2354f);
                instancePath3.cubicTo(16.1228f, 28.2478f, 15.8616f, 28.3471f, 15.6176f, 28.5014f);
                instancePath3.lineTo(12.3741f, 30.5524f);
                instancePath3.cubicTo(12.2832f, 30.6094f, 12.1953f, 30.6541f, 12.0852f, 30.6588f);
                instancePath3.cubicTo(11.8047f, 30.6708f, 11.5685f, 30.4544f, 11.5563f, 30.1771f);
                instancePath3.cubicTo(11.5509f, 30.0518f, 11.5958f, 29.9254f, 11.6222f, 29.8051f);
                instancePath3.cubicTo(11.6381f, 29.7331f, 11.9817f, 28.1954f, 12.196f, 27.2361f);
                instancePath3.cubicTo(12.221f, 27.1281f, 12.2406f, 27.0241f, 12.2359f, 26.9131f);
                instancePath3.cubicTo(12.2213f, 26.5794f, 12.0436f, 26.2911f, 11.7837f, 26.1184f);
                instancePath3.cubicTo(8.36517f, 23.8191f, 6.02092f, 20.206f, 5.50489f, 16.4913f);
                instancePath3.cubicTo(4.64552f, 17.8243f, 4.18762f, 18.8837f, 3.73952f, 20.428f);
                instancePath3.cubicTo(2.06844f, 26.1904f, 5.7259f, 33.0938f, 11.6945f, 35.0275f);
                instancePath3.cubicTo(18.5586f, 37.2512f, 25.1081f, 34.7551f, 27.3709f, 28.9968f);
                instancePath3.cubicTo(27.6457f, 28.2974f, 27.9465f, 27.1098f, 28.009f, 26.1231f);
                instancePath3.cubicTo(25.6052f, 27.8674f, 23.0603f, 28.6048f, 19.8472f, 28.6048f);
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
