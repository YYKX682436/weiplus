package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_regular_disable_replay extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePath.moveTo(19.0253f, 13.5f);
        instancePath.cubicTo(20.406f, 13.5f, 21.5253f, 14.6193f, 21.5253f, 16.0f);
        instancePath.lineTo(21.5253f, 16.2995f);
        instancePath.cubicTo(22.0776f, 16.2995f, 22.5253f, 16.7472f, 22.5253f, 17.2995f);
        instancePath.lineTo(22.5253f, 20.9259f);
        instancePath.cubicTo(22.5253f, 21.4782f, 22.0776f, 21.9259f, 21.5253f, 21.9259f);
        instancePath.lineTo(16.5253f, 21.9259f);
        instancePath.cubicTo(15.973f, 21.9259f, 15.5253f, 21.4782f, 15.5253f, 20.9259f);
        instancePath.lineTo(15.5253f, 17.2995f);
        instancePath.cubicTo(15.5253f, 16.7472f, 15.973f, 16.2995f, 16.5253f, 16.2995f);
        instancePath.lineTo(16.5253f, 16.0f);
        instancePath.cubicTo(16.5253f, 14.6193f, 17.6446f, 13.5f, 19.0253f, 13.5f);
        instancePath.close();
        instancePath.moveTo(21.3253f, 17.4988f);
        instancePath.lineTo(16.7253f, 17.4988f);
        instancePath.lineTo(16.7253f, 20.7258f);
        instancePath.lineTo(21.3253f, 20.7258f);
        instancePath.lineTo(21.3253f, 17.4988f);
        instancePath.close();
        instancePath.moveTo(19.0253f, 14.7f);
        instancePath.cubicTo(18.3522f, 14.7f, 17.7986f, 15.2115f, 17.732f, 15.8671f);
        instancePath.lineTo(17.7253f, 16.0f);
        instancePath.lineTo(17.7243f, 16.299f);
        instancePath.lineTo(20.3253f, 16.299f);
        instancePath.lineTo(20.3253f, 16.0f);
        instancePath.cubicTo(20.3253f, 15.3269f, 19.8137f, 14.7733f, 19.1582f, 14.7067f);
        instancePath.lineTo(19.0253f, 14.7f);
        instancePath.close();
        instancePath.moveTo(20.3f, 12.0f);
        instancePath.lineTo(21.5f, 12.0f);
        instancePath.lineTo(21.5f, 6.625f);
        instancePath.cubicTo(21.5f, 5.24429f, 20.3807f, 4.125f, 19.0f, 4.125f);
        instancePath.lineTo(5.0f, 4.125f);
        instancePath.cubicTo(3.61929f, 4.125f, 2.5f, 5.24429f, 2.5f, 6.625f);
        instancePath.lineTo(2.5f, 17.375f);
        instancePath.cubicTo(2.5f, 18.7557f, 3.61929f, 19.875f, 5.0f, 19.875f);
        instancePath.lineTo(13.8751f, 19.875f);
        instancePath.lineTo(13.8751f, 18.675f);
        instancePath.lineTo(5.0f, 18.675f);
        instancePath.lineTo(4.86709f, 18.6683f);
        instancePath.cubicTo(4.21155f, 18.6017f, 3.7f, 18.0481f, 3.7f, 17.375f);
        instancePath.lineTo(3.7f, 6.625f);
        instancePath.lineTo(3.70672f, 6.49208f);
        instancePath.cubicTo(3.77329f, 5.83655f, 4.32691f, 5.325f, 5.0f, 5.325f);
        instancePath.lineTo(19.0f, 5.325f);
        instancePath.lineTo(19.1329f, 5.33171f);
        instancePath.cubicTo(19.7885f, 5.39828f, 20.3f, 5.9519f, 20.3f, 6.625f);
        instancePath.lineTo(20.3f, 12.0f);
        instancePath.close();
        instancePath.moveTo(7.35012f, 11.25f);
        instancePath.cubicTo(7.01875f, 11.25f, 6.75012f, 11.5186f, 6.75012f, 11.85f);
        instancePath.cubicTo(6.75012f, 12.1814f, 7.01875f, 12.45f, 7.35012f, 12.45f);
        instancePath.lineTo(13.6501f, 12.45f);
        instancePath.cubicTo(13.9815f, 12.45f, 14.2501f, 12.1814f, 14.2501f, 11.85f);
        instancePath.cubicTo(14.2501f, 11.5186f, 13.9815f, 11.25f, 13.6501f, 11.25f);
        instancePath.lineTo(7.35012f, 11.25f);
        instancePath.close();
        instancePath.moveTo(15.0001f, 8.85f);
        instancePath.cubicTo(15.0001f, 8.51863f, 15.2688f, 8.25f, 15.6001f, 8.25f);
        instancePath.lineTo(16.6501f, 8.25f);
        instancePath.cubicTo(16.9815f, 8.25f, 17.2501f, 8.51863f, 17.2501f, 8.85f);
        instancePath.cubicTo(17.2501f, 9.18137f, 16.9815f, 9.45f, 16.6501f, 9.45f);
        instancePath.lineTo(15.6001f, 9.45f);
        instancePath.cubicTo(15.2688f, 9.45f, 15.0001f, 9.18137f, 15.0001f, 8.85f);
        instancePath.close();
        instancePath.moveTo(6.60013f, 8.25f);
        instancePath.cubicTo(6.26875f, 8.25f, 6.00012f, 8.51863f, 6.00012f, 8.85f);
        instancePath.cubicTo(6.00012f, 9.18137f, 6.26875f, 9.45f, 6.60012f, 9.45f);
        instancePath.lineTo(12.9001f, 9.45f);
        instancePath.cubicTo(13.2315f, 9.45f, 13.5001f, 9.18137f, 13.5001f, 8.85f);
        instancePath.cubicTo(13.5001f, 8.51863f, 13.2315f, 8.25f, 12.9001f, 8.25f);
        instancePath.lineTo(6.60013f, 8.25f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
