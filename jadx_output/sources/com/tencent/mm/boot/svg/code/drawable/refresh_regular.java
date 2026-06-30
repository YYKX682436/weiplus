package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class refresh_regular extends l95.c {
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
        instancePath.moveTo(13.3033f, 5.18198f);
        instancePath.cubicTo(13.4986f, 4.98672f, 13.4986f, 4.67014f, 13.3033f, 4.47487f);
        instancePath.lineTo(10.8284f, 2.0f);
        instancePath.lineTo(9.9799f, 2.84853f);
        instancePath.lineTo(11.1692f, 4.03784f);
        instancePath.cubicTo(6.58809f, 4.45713f, 3.0f, 8.30954f, 3.0f, 13.0f);
        instancePath.cubicTo(3.0f, 17.9706f, 7.02944f, 22.0f, 12.0f, 22.0f);
        instancePath.cubicTo(16.9706f, 22.0f, 21.0f, 17.9706f, 21.0f, 13.0f);
        instancePath.cubicTo(21.0f, 10.5147f, 19.9926f, 8.26472f, 18.364f, 6.63604f);
        instancePath.lineTo(17.5154f, 7.48457f);
        instancePath.cubicTo(18.9696f, 8.93869f, 19.8f, 10.9021f, 19.8f, 13.0f);
        instancePath.cubicTo(19.8f, 17.3078f, 16.3078f, 20.8f, 12.0f, 20.8f);
        instancePath.cubicTo(7.69218f, 20.8f, 4.2f, 17.3078f, 4.2f, 13.0f);
        instancePath.cubicTo(4.2f, 8.83411f, 7.46585f, 5.43101f, 11.5769f, 5.21128f);
        instancePath.lineTo(9.9799f, 6.80833f);
        instancePath.lineTo(10.8284f, 7.65685f);
        instancePath.lineTo(13.3033f, 5.18198f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
