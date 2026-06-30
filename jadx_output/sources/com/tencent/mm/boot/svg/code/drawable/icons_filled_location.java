package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_location extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(33.785156f, 66.40343f);
                instancePath.cubicTo(33.785156f, 66.40343f, 12.0f, 48.054832f, 12.0f, 30.0f);
                instancePath.cubicTo(12.0f, 16.745167f, 22.745167f, 6.0f, 36.0f, 6.0f);
                instancePath.cubicTo(49.254833f, 6.0f, 60.0f, 16.745167f, 60.0f, 30.0f);
                instancePath.cubicTo(60.0f, 48.054832f, 38.225567f, 66.39341f, 38.225567f, 66.39341f);
                instancePath.cubicTo(37.000694f, 67.51806f, 35.00838f, 67.5061f, 33.785156f, 66.40343f);
                instancePath.close();
                instancePath.moveTo(36.0f, 40.5f);
                instancePath.cubicTo(41.79899f, 40.5f, 46.5f, 35.79899f, 46.5f, 30.0f);
                instancePath.cubicTo(46.5f, 24.20101f, 41.79899f, 19.5f, 36.0f, 19.5f);
                instancePath.cubicTo(30.20101f, 19.5f, 25.5f, 24.20101f, 25.5f, 30.0f);
                instancePath.cubicTo(25.5f, 35.79899f, 30.20101f, 40.5f, 36.0f, 40.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
