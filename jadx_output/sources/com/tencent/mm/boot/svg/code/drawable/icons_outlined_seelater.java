package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_seelater extends l95.c {
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
        instancePath.moveTo(14.5f, 19.3907f);
        instancePath.cubicTo(13.7152f, 19.6561f, 12.8744f, 19.8f, 12.0f, 19.8f);
        instancePath.cubicTo(7.69218f, 19.8f, 4.2f, 16.3078f, 4.2f, 12.0f);
        instancePath.cubicTo(4.2f, 7.69218f, 7.69218f, 4.2f, 12.0f, 4.2f);
        instancePath.cubicTo(16.3078f, 4.2f, 19.8f, 7.69218f, 19.8f, 12.0f);
        instancePath.cubicTo(19.8f, 12.7266f, 19.7006f, 13.43f, 19.5148f, 14.0974f);
        instancePath.lineTo(20.572f, 14.7504f);
        instancePath.cubicTo(20.8499f, 13.8834f, 21.0f, 12.9592f, 21.0f, 12.0f);
        instancePath.cubicTo(21.0f, 7.02944f, 16.9706f, 3.0f, 12.0f, 3.0f);
        instancePath.cubicTo(7.02944f, 3.0f, 3.0f, 7.02944f, 3.0f, 12.0f);
        instancePath.cubicTo(3.0f, 16.9706f, 7.02944f, 21.0f, 12.0f, 21.0f);
        instancePath.cubicTo(13.02f, 21.0f, 14.0003f, 20.8303f, 14.9143f, 20.5177f);
        instancePath.cubicTo(14.6686f, 20.3411f, 14.5f, 20.0538f, 14.5f, 19.707f);
        instancePath.lineTo(14.5f, 19.3907f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.5999f, 6.9999f);
        instancePath2.cubicTo(12.5999f, 6.66853f, 12.3313f, 6.3999f, 11.9999f, 6.3999f);
        instancePath2.cubicTo(11.6685f, 6.3999f, 11.3999f, 6.66853f, 11.3999f, 6.9999f);
        instancePath2.lineTo(11.3999f, 12.2484f);
        instancePath2.lineTo(13.5756f, 14.4242f);
        instancePath2.cubicTo(13.81f, 14.6585f, 14.1899f, 14.6585f, 14.4242f, 14.4242f);
        instancePath2.cubicTo(14.6585f, 14.1899f, 14.6585f, 13.81f, 14.4242f, 13.5756f);
        instancePath2.lineTo(12.5999f, 11.7514f);
        instancePath2.lineTo(12.5999f, 6.9999f);
        instancePath2.close();
        instancePath2.moveTo(18.0472f, 15.0117f);
        instancePath2.cubicTo(17.3821f, 14.5768f, 16.5f, 15.054f, 16.5f, 15.8486f);
        instancePath2.lineTo(16.5f, 20.6514f);
        instancePath2.cubicTo(16.5f, 21.446f, 17.3821f, 21.9232f, 18.0472f, 21.4883f);
        instancePath2.lineTo(21.7199f, 19.087f);
        instancePath2.cubicTo(22.3236f, 18.6923f, 22.3236f, 17.8077f, 21.7199f, 17.413f);
        instancePath2.lineTo(18.0472f, 15.0117f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
