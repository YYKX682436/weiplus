package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class phone_rectangle_regular extends l95.c {
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
        instancePath.moveTo(9.17798f, 7.0f);
        instancePath.lineTo(9.18587f, 7.00013f);
        instancePath.cubicTo(9.49485f, 7.01043f, 9.76101f, 7.18887f, 9.88182f, 7.47495f);
        instancePath.lineTo(10.5037f, 9.12858f);
        instancePath.cubicTo(10.5573f, 9.27601f, 10.5383f, 9.38353f, 10.4575f, 9.53158f);
        instancePath.lineTo(10.2209f, 9.95754f);
        instancePath.lineTo(9.94272f, 10.4743f);
        instancePath.lineTo(9.7664f, 10.8123f);
        instancePath.cubicTo(9.73276f, 10.8747f, 9.71434f, 10.946f, 9.71434f, 11.0141f);
        instancePath.cubicTo(9.71434f, 11.0828f, 9.7363f, 11.1572f, 9.77655f, 11.2227f);
        instancePath.cubicTo(10.103f, 11.777f, 10.4581f, 12.2516f, 10.8518f, 12.6454f);
        instancePath.cubicTo(11.2413f, 13.0416f, 11.7128f, 13.3961f, 12.2754f, 13.7276f);
        instancePath.cubicTo(12.3399f, 13.7673f, 12.4071f, 13.7874f, 12.4801f, 13.7874f);
        instancePath.cubicTo(12.5525f, 13.7874f, 12.6165f, 13.7706f, 12.685f, 13.7337f);
        instancePath.lineTo(12.9088f, 13.616f);
        instancePath.lineTo(13.3156f, 13.3979f);
        instancePath.lineTo(13.9665f, 13.0419f);
        instancePath.cubicTo(14.1105f, 12.9634f, 14.2084f, 12.9456f, 14.3679f, 12.9989f);
        instancePath.lineTo(16.0278f, 13.6235f);
        instancePath.cubicTo(16.3018f, 13.7394f, 16.4802f, 14.0013f, 16.5003f, 14.3042f);
        instancePath.cubicTo(16.5025f, 14.3299f, 16.5024f, 14.3557f, 16.5006f, 14.3817f);
        instancePath.cubicTo(16.4967f, 14.4365f, 16.4853f, 14.4896f, 16.4684f, 14.5437f);
        instancePath.lineTo(16.4428f, 14.6174f);
        instancePath.cubicTo(16.1399f, 15.442f, 15.3616f, 16.0f, 14.4745f, 16.0f);
        instancePath.cubicTo(14.2711f, 16.0f, 14.0572f, 15.9643f, 13.9322f, 15.9283f);
        instancePath.cubicTo(12.3804f, 15.5736f, 10.9681f, 14.7833f, 9.84332f, 13.6584f);
        instancePath.cubicTo(8.71853f, 12.5335f, 7.92836f, 11.1211f, 7.57008f, 9.54986f);
        instancePath.lineTo(7.53911f, 9.39748f);
        instancePath.cubicTo(7.51557f, 9.26957f, 7.50195f, 9.14824f, 7.50195f, 9.02686f);
        instancePath.cubicTo(7.50195f, 8.13964f, 8.05986f, 7.3613f, 8.89121f, 7.05599f);
        instancePath.lineTo(8.97244f, 7.03086f);
        instancePath.cubicTo(9.01916f, 7.01815f, 9.06532f, 7.00869f, 9.11146f, 7.00372f);
        instancePath.cubicTo(9.13393f, 7.0013f, 9.15607f, 7.0f, 9.17798f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.0f, 2.0f);
        instancePath2.cubicTo(4.44772f, 2.0f, 4.0f, 2.44772f, 4.0f, 3.0f);
        instancePath2.lineTo(4.0f, 21.0f);
        instancePath2.cubicTo(4.0f, 21.5523f, 4.44772f, 22.0f, 5.0f, 22.0f);
        instancePath2.lineTo(19.0f, 22.0f);
        instancePath2.cubicTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f);
        instancePath2.lineTo(20.0f, 3.0f);
        instancePath2.cubicTo(20.0f, 2.44772f, 19.5523f, 2.0f, 19.0f, 2.0f);
        instancePath2.lineTo(5.0f, 2.0f);
        instancePath2.close();
        instancePath2.moveTo(5.2f, 20.8f);
        instancePath2.lineTo(5.2f, 3.2f);
        instancePath2.lineTo(18.8f, 3.2f);
        instancePath2.lineTo(18.8f, 20.8f);
        instancePath2.lineTo(5.2f, 20.8f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
