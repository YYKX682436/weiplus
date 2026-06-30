package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_unmute_icon extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(24.0f, 25.4992f);
                instancePath.lineTo(35.4f, 14.0992f);
                instancePath.cubicTo(36.6f, 12.8992f, 38.4f, 12.8992f, 39.6f, 14.0992f);
                instancePath.cubicTo(40.2f, 14.6992f, 40.5f, 15.2992f, 40.5f, 16.1992f);
                instancePath.lineTo(40.5f, 55.7992f);
                instancePath.cubicTo(40.5f, 57.5992f, 39.3f, 58.7992f, 37.5f, 58.7992f);
                instancePath.cubicTo(36.6f, 58.7992f, 36.0f, 58.4992f, 35.4f, 57.8992f);
                instancePath.lineTo(24.0f, 46.4992f);
                instancePath.lineTo(10.5f, 46.4992f);
                instancePath.cubicTo(8.7f, 46.4992f, 7.5f, 45.2992f, 7.5f, 43.4992f);
                instancePath.lineTo(7.5f, 28.4992f);
                instancePath.cubicTo(7.5f, 26.6992f, 8.7f, 25.4992f, 10.5f, 25.4992f);
                instancePath.lineTo(24.0f, 25.4992f);
                instancePath.close();
                instancePath.moveTo(52.8003f, 50.3991f);
                instancePath.lineTo(56.1003f, 53.6991f);
                instancePath.lineTo(56.4003f, 53.3991f);
                instancePath.cubicTo(61.2003f, 48.5991f, 63.6003f, 42.5991f, 63.6003f, 35.9991f);
                instancePath.cubicTo(63.6003f, 29.3991f, 60.9003f, 23.0991f, 56.4003f, 18.5991f);
                instancePath.lineTo(56.1003f, 18.2991f);
                instancePath.lineTo(52.8003f, 21.5991f);
                instancePath.lineTo(53.1003f, 21.8991f);
                instancePath.cubicTo(56.7003f, 25.7991f, 58.8003f, 30.5991f, 58.8003f, 35.9991f);
                instancePath.cubicTo(58.8003f, 41.3991f, 57.0003f, 46.1991f, 53.1003f, 50.0991f);
                instancePath.lineTo(52.8003f, 50.3991f);
                instancePath.close();
                instancePath.moveTo(46.8003f, 44.3991f);
                instancePath.lineTo(50.1003f, 47.6991f);
                instancePath.lineTo(50.4003f, 47.3991f);
                instancePath.cubicTo(53.4003f, 44.3991f, 55.2003f, 40.1991f, 55.2003f, 35.9991f);
                instancePath.cubicTo(55.2003f, 31.7991f, 53.4003f, 27.5991f, 50.4003f, 24.5991f);
                instancePath.lineTo(50.1003f, 24.2991f);
                instancePath.lineTo(46.8003f, 27.5991f);
                instancePath.lineTo(47.1003f, 27.8991f);
                instancePath.cubicTo(49.2003f, 29.9991f, 50.4003f, 32.9991f, 50.4003f, 35.9991f);
                instancePath.cubicTo(50.4003f, 38.9991f, 49.2003f, 41.9991f, 47.1003f, 44.0991f);
                instancePath.lineTo(46.8003f, 44.3991f);
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
