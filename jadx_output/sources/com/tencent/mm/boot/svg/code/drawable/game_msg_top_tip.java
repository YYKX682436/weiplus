package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_msg_top_tip extends l95.c {
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
        instancePath.moveTo(10.0001f, 4.0f);
        instancePath.cubicTo(10.0001f, 2.89543f, 10.8955f, 2.0f, 12.0001f, 2.0f);
        instancePath.cubicTo(13.1047f, 2.0f, 14.0001f, 2.89543f, 14.0001f, 4.0f);
        instancePath.cubicTo(14.0001f, 4.11304f, 13.9907f, 4.22388f, 13.9727f, 4.3318f);
        instancePath.cubicTo(16.3174f, 5.14769f, 18.0001f, 7.37734f, 18.0001f, 10.0f);
        instancePath.lineTo(18.0001f, 14.0f);
        instancePath.cubicTo(18.0001f, 15.4693f, 18.5398f, 16.9386f, 19.6192f, 18.4079f);
        instancePath.cubicTo(19.7453f, 18.5796f, 19.8134f, 18.787f, 19.8134f, 19.0f);
        instancePath.cubicTo(19.8134f, 19.5523f, 19.3656f, 20.0f, 18.8133f, 20.0f);
        instancePath.lineTo(13.0001f, 20.0f);
        instancePath.lineTo(12.0001f, 20.0f);
        instancePath.lineTo(5.1868f, 20.0f);
        instancePath.cubicTo(4.97382f, 20.0f, 4.7664f, 19.932f, 4.59476f, 19.8059f);
        instancePath.cubicTo(4.14969f, 19.4789f, 4.05396f, 18.8531f, 4.38093f, 18.408f);
        instancePath.cubicTo(5.46036f, 16.9386f, 6.00009f, 15.4693f, 6.00009f, 14.0f);
        instancePath.lineTo(6.00009f, 10.0f);
        instancePath.cubicTo(6.00009f, 7.37734f, 7.6828f, 5.14769f, 10.0275f, 4.3318f);
        instancePath.cubicTo(10.0095f, 4.22388f, 10.0001f, 4.11304f, 10.0001f, 4.0f);
        instancePath.close();
        instancePath.moveTo(13.0001f, 20.0f);
        instancePath.lineTo(13.0001f, 20.2f);
        instancePath.cubicTo(13.0001f, 20.7523f, 12.5524f, 21.2f, 12.0001f, 21.2f);
        instancePath.cubicTo(11.4478f, 21.2f, 11.0001f, 20.7523f, 11.0001f, 20.2f);
        instancePath.lineTo(11.0001f, 20.0f);
        instancePath.lineTo(13.0001f, 20.0f);
        instancePath.close();
        instancePath.moveTo(12.0001f, 18.8f);
        instancePath.lineTo(18.4259f, 18.8f);
        instancePath.cubicTo(17.3516f, 17.2356f, 16.8001f, 15.6304f, 16.8001f, 14.0f);
        instancePath.lineTo(16.8001f, 10.0f);
        instancePath.cubicTo(16.8001f, 7.94087f, 15.4915f, 6.13088f, 13.5783f, 5.46516f);
        instancePath.lineTo(12.6224f, 5.13252f);
        instancePath.lineTo(12.7891f, 4.13419f);
        instancePath.cubicTo(12.7964f, 4.0905f, 12.8001f, 4.04575f, 12.8001f, 4.00001f);
        instancePath.cubicTo(12.8001f, 3.55818f, 12.4419f, 3.20001f, 12.0001f, 3.20001f);
        instancePath.cubicTo(11.5583f, 3.20001f, 11.2001f, 3.55818f, 11.2001f, 4.00001f);
        instancePath.cubicTo(11.2001f, 4.04575f, 11.2038f, 4.0905f, 11.2111f, 4.13419f);
        instancePath.lineTo(11.3778f, 5.13252f);
        instancePath.lineTo(10.4219f, 5.46516f);
        instancePath.cubicTo(8.50871f, 6.13088f, 7.20009f, 7.94087f, 7.20009f, 10.0f);
        instancePath.lineTo(7.20009f, 14.0f);
        instancePath.cubicTo(7.20009f, 15.6303f, 6.64859f, 17.2355f, 5.57431f, 18.8f);
        instancePath.lineTo(12.0001f, 18.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
