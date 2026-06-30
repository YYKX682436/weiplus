package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_promote_redpacket_icon extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0006f, 12.0623f);
                instancePath.cubicTo(11.1377f, 12.0623f, 10.4381f, 11.3627f, 10.4381f, 10.4998f);
                instancePath.cubicTo(10.4381f, 9.63686f, 11.1377f, 8.9373f, 12.0006f, 8.9373f);
                instancePath.cubicTo(12.8636f, 8.9373f, 13.5631f, 9.63686f, 13.5631f, 10.4998f);
                instancePath.cubicTo(13.5631f, 11.3627f, 12.8636f, 12.0623f, 12.0006f, 12.0623f);
                instancePath.moveTo(19.5f, 4.45182f);
                instancePath.cubicTo(19.5f, 3.64993f, 18.8499f, 2.99988f, 18.0481f, 2.99988f);
                instancePath.lineTo(5.95194f, 2.99988f);
                instancePath.cubicTo(5.15006f, 2.99988f, 4.5f, 3.64993f, 4.5f, 4.45182f);
                instancePath.lineTo(4.5f, 4.45182f);
                instancePath.cubicTo(4.5f, 7.09548f, 6.79179f, 9.32399f, 9.92314f, 10.0203f);
                instancePath.cubicTo(9.88157f, 10.188f, 9.85714f, 10.3623f, 9.85714f, 10.5429f);
                instancePath.cubicTo(9.85714f, 10.6145f, 9.861f, 10.6853f, 9.86786f, 10.7552f);
                instancePath.cubicTo(7.80064f, 10.4316f, 5.94943f, 9.64636f, 4.5f, 8.54462f);
                instancePath.lineTo(4.5f, 19.8749f);
                instancePath.cubicTo(4.5f, 20.9104f, 5.33947f, 21.7499f, 6.375f, 21.7499f);
                instancePath.lineTo(17.625f, 21.7499f);
                instancePath.cubicTo(18.6605f, 21.7499f, 19.5f, 20.9104f, 19.5f, 19.8749f);
                instancePath.lineTo(19.5f, 8.54462f);
                instancePath.cubicTo(18.0506f, 9.64636f, 16.1994f, 10.4316f, 14.1321f, 10.7552f);
                instancePath.cubicTo(14.139f, 10.6853f, 14.1429f, 10.6145f, 14.1429f, 10.5429f);
                instancePath.cubicTo(14.1429f, 10.3623f, 14.1184f, 10.188f, 14.0769f, 10.0203f);
                instancePath.cubicTo(17.2082f, 9.32399f, 19.5f, 7.09548f, 19.5f, 4.45182f);
                instancePath.lineTo(19.5f, 4.45182f);
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
