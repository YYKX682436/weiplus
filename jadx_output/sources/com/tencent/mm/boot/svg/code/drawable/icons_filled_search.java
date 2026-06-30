package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_search extends l95.c {
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
                instancePath.moveTo(49.864876f, 45.51525f);
                instancePath.lineTo(62.598618f, 58.248997f);
                instancePath.lineTo(58.355976f, 62.49164f);
                instancePath.lineTo(45.63759f, 49.77325f);
                instancePath.cubicTo(42.1214f, 52.426655f, 37.744442f, 54.0f, 33.0f, 54.0f);
                instancePath.cubicTo(21.402f, 54.0f, 12.0f, 44.598f, 12.0f, 33.0f);
                instancePath.cubicTo(12.0f, 21.402f, 21.402f, 12.0f, 33.0f, 12.0f);
                instancePath.cubicTo(44.598f, 12.0f, 54.0f, 21.402f, 54.0f, 33.0f);
                instancePath.cubicTo(54.0f, 37.68957f, 52.462833f, 42.020115f, 49.864876f, 45.51525f);
                instancePath.close();
                instancePath.moveTo(48.0f, 33.0f);
                instancePath.cubicTo(48.0f, 24.715714f, 41.284286f, 18.0f, 33.0f, 18.0f);
                instancePath.cubicTo(24.715714f, 18.0f, 18.0f, 24.715714f, 18.0f, 33.0f);
                instancePath.cubicTo(18.0f, 41.284286f, 24.715714f, 48.0f, 33.0f, 48.0f);
                instancePath.cubicTo(41.284286f, 48.0f, 48.0f, 41.284286f, 48.0f, 33.0f);
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
