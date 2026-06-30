package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_mini_window_regular extends l95.c {
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
        instancePath.moveTo(17.1935f, 4.45417f);
        instancePath.cubicTo(17.1199f, 3.63876f, 16.4346f, 2.9998f, 15.6f, 2.9998f);
        instancePath.lineTo(4.6f, 2.9998f);
        instancePath.lineTo(4.45437f, 3.00634f);
        instancePath.cubicTo(3.63896f, 3.07991f, 3.0f, 3.76524f, 3.0f, 4.5998f);
        instancePath.lineTo(3.0f, 15.5998f);
        instancePath.lineTo(3.00654f, 15.7454f);
        instancePath.cubicTo(3.08011f, 16.5608f, 3.76544f, 17.1998f, 4.6f, 17.1998f);
        instancePath.lineTo(9.0f, 17.1998f);
        instancePath.lineTo(9.0f, 15.9998f);
        instancePath.lineTo(4.6f, 15.9998f);
        instancePath.lineTo(4.51939f, 15.9917f);
        instancePath.cubicTo(4.33711f, 15.9544f, 4.2f, 15.7931f, 4.2f, 15.5998f);
        instancePath.lineTo(4.2f, 4.5998f);
        instancePath.lineTo(4.20813f, 4.51919f);
        instancePath.cubicTo(4.24543f, 4.33691f, 4.4067f, 4.1998f, 4.6f, 4.1998f);
        instancePath.lineTo(15.6f, 4.1998f);
        instancePath.lineTo(15.6806f, 4.20793f);
        instancePath.cubicTo(15.8629f, 4.24523f, 16.0f, 4.4065f, 16.0f, 4.5998f);
        instancePath.lineTo(16.0f, 8.9998f);
        instancePath.lineTo(17.2f, 8.9998f);
        instancePath.lineTo(17.2f, 4.5998f);
        instancePath.lineTo(17.1935f, 4.45417f);
        instancePath.close();
        instancePath.moveTo(19.0802f, 11.8001f);
        instancePath.cubicTo(20.09f, 11.8001f, 20.9177f, 12.5797f, 20.9942f, 13.5699f);
        instancePath.lineTo(21.0f, 13.7199f);
        instancePath.lineTo(21.0f, 18.9001f);
        instancePath.cubicTo(21.0f, 20.0095f, 20.1398f, 20.9179f, 19.05f, 20.9948f);
        instancePath.lineTo(18.9f, 21.0001f);
        instancePath.lineTo(13.9f, 21.0001f);
        instancePath.cubicTo(12.7906f, 21.0001f, 11.8822f, 20.1399f, 11.8053f, 19.0501f);
        instancePath.lineTo(11.8f, 18.9001f);
        instancePath.lineTo(11.8f, 13.9001f);
        instancePath.cubicTo(11.8f, 12.7907f, 12.6602f, 11.8823f, 13.75f, 11.8054f);
        instancePath.lineTo(13.9f, 11.8001f);
        instancePath.lineTo(19.0802f, 11.8001f);
        instancePath.close();
        instancePath.moveTo(19.0805f, 13.0003f);
        instancePath.lineTo(13.9004f, 13.0003f);
        instancePath.cubicTo(13.4416f, 13.0003f, 13.0629f, 13.3436f, 13.0074f, 13.7874f);
        instancePath.lineTo(13.0004f, 13.9003f);
        instancePath.lineTo(13.0004f, 18.9003f);
        instancePath.cubicTo(13.0004f, 19.3591f, 13.3437f, 19.7377f, 13.7875f, 19.7933f);
        instancePath.lineTo(13.9004f, 19.8003f);
        instancePath.lineTo(18.9004f, 19.8003f);
        instancePath.cubicTo(19.3592f, 19.8003f, 19.7378f, 19.457f, 19.7934f, 19.0132f);
        instancePath.lineTo(19.8004f, 18.9003f);
        instancePath.lineTo(19.8004f, 13.7201f);
        instancePath.cubicTo(19.8004f, 13.3557f, 19.5296f, 13.0545f, 19.1782f, 13.0069f);
        instancePath.lineTo(19.0805f, 13.0003f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
