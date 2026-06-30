package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_state_voip extends l95.c {
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
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.5f, 6.5f);
                instancePath.cubicTo(1.5f, 5.94772f, 1.94772f, 5.5f, 2.5f, 5.5f);
                instancePath.lineTo(16.0f, 5.5f);
                instancePath.cubicTo(16.5523f, 5.5f, 17.0f, 5.94772f, 17.0f, 6.5f);
                instancePath.lineTo(17.0f, 17.5f);
                instancePath.cubicTo(17.0f, 18.0523f, 16.5523f, 18.5f, 16.0f, 18.5f);
                instancePath.lineTo(2.5f, 18.5f);
                instancePath.cubicTo(1.94772f, 18.5f, 1.5f, 18.0523f, 1.5f, 17.5f);
                instancePath.lineTo(1.5f, 6.5f);
                instancePath.close();
                instancePath.moveTo(20.8356f, 7.47943f);
                instancePath.cubicTo(21.4805f, 6.90619f, 22.5f, 7.36399f, 22.5f, 8.22684f);
                instancePath.lineTo(22.5f, 15.7732f);
                instancePath.cubicTo(22.5f, 16.636f, 21.4805f, 17.0938f, 20.8356f, 16.5206f);
                instancePath.lineTo(18.0f, 14.0f);
                instancePath.lineTo(18.0f, 10.0f);
                instancePath.lineTo(20.8356f, 7.47943f);
                instancePath.close();
                instancePath.moveTo(7.26435f, 8.4375f);
                instancePath.lineTo(7.2706f, 8.4376f);
                instancePath.cubicTo(7.51521f, 8.44576f, 7.72592f, 8.58702f, 7.82156f, 8.8135f);
                instancePath.lineTo(8.31387f, 10.1226f);
                instancePath.cubicTo(8.35631f, 10.2393f, 8.34129f, 10.3245f, 8.27733f, 10.4417f);
                instancePath.lineTo(8.08998f, 10.7789f);
                instancePath.lineTo(7.86977f, 11.188f);
                instancePath.lineTo(7.73019f, 11.4555f);
                instancePath.cubicTo(7.70356f, 11.505f, 7.68897f, 11.5614f, 7.68897f, 11.6154f);
                instancePath.cubicTo(7.68897f, 11.6697f, 7.70635f, 11.7286f, 7.73822f, 11.7805f);
                instancePath.cubicTo(7.99669f, 12.2193f, 8.27776f, 12.5951f, 8.58945f, 12.9068f);
                instancePath.cubicTo(8.89781f, 13.2204f, 9.27113f, 13.5011f, 9.71651f, 13.7635f);
                instancePath.cubicTo(9.76754f, 13.7949f, 9.82077f, 13.8109f, 9.8785f, 13.8109f);
                instancePath.cubicTo(9.93584f, 13.8109f, 9.98654f, 13.7975f, 10.0408f, 13.7684f);
                instancePath.lineTo(10.2179f, 13.6752f);
                instancePath.lineTo(10.54f, 13.5025f);
                instancePath.lineTo(11.0553f, 13.2207f);
                instancePath.cubicTo(11.1693f, 13.1585f, 11.2467f, 13.1444f, 11.373f, 13.1867f);
                instancePath.lineTo(12.6872f, 13.6811f);
                instancePath.cubicTo(12.904f, 13.7729f, 13.0452f, 13.9802f, 13.0612f, 14.22f);
                instancePath.cubicTo(13.0629f, 14.2403f, 13.0629f, 14.2607f, 13.0614f, 14.2813f);
                instancePath.cubicTo(13.0584f, 14.3247f, 13.0493f, 14.3668f, 13.036f, 14.4096f);
                instancePath.lineTo(13.0157f, 14.4679f);
                instancePath.cubicTo(12.7759f, 15.1208f, 12.1597f, 15.5625f, 11.4574f, 15.5625f);
                instancePath.cubicTo(11.2964f, 15.5625f, 11.127f, 15.5343f, 11.0281f, 15.5057f);
                instancePath.cubicTo(9.79959f, 15.2249f, 8.68154f, 14.5993f, 7.79108f, 13.7087f);
                instancePath.cubicTo(6.90062f, 12.8182f, 6.27507f, 11.7f, 5.99144f, 10.4561f);
                instancePath.lineTo(5.96692f, 10.3355f);
                instancePath.cubicTo(5.94828f, 10.2342f, 5.9375f, 10.1382f, 5.9375f, 10.0421f);
                instancePath.cubicTo(5.9375f, 9.33971f, 6.37918f, 8.72353f, 7.03733f, 8.48183f);
                instancePath.lineTo(7.10163f, 8.46193f);
                instancePath.cubicTo(7.13862f, 8.45187f, 7.17517f, 8.44438f, 7.21169f, 8.44044f);
                instancePath.cubicTo(7.22948f, 8.43853f, 7.24701f, 8.4375f, 7.26435f, 8.4375f);
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
