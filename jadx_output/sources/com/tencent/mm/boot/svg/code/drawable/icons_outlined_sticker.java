package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_sticker extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            instancePath.moveTo(36.0f, 66.0f);
            instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 62.4f);
            instancePath.cubicTo(50.58032f, 62.4f, 62.4f, 50.58032f, 62.4f, 36.0f);
            instancePath.cubicTo(62.4f, 21.419683f, 50.58032f, 9.6f, 36.0f, 9.6f);
            instancePath.cubicTo(21.419683f, 9.6f, 9.6f, 21.419683f, 9.6f, 36.0f);
            instancePath.cubicTo(9.6f, 50.58032f, 21.419683f, 62.4f, 36.0f, 62.4f);
            instancePath.close();
            instancePath.moveTo(18.0f, 37.5f);
            instancePath.lineTo(54.0f, 37.5f);
            instancePath.cubicTo(54.0f, 47.441124f, 45.941124f, 55.5f, 36.0f, 55.5f);
            instancePath.cubicTo(26.058874f, 55.5f, 18.0f, 47.441124f, 18.0f, 37.5f);
            instancePath.close();
            instancePath.moveTo(36.0f, 51.9f);
            instancePath.cubicTo(42.709824f, 51.9f, 48.347782f, 47.310818f, 49.94634f, 41.1f);
            instancePath.lineTo(22.053663f, 41.1f);
            instancePath.cubicTo(23.652218f, 47.310818f, 29.290178f, 51.9f, 36.0f, 51.9f);
            instancePath.close();
            instancePath.moveTo(25.5f, 31.5f);
            instancePath.cubicTo(23.014719f, 31.5f, 21.0f, 29.485281f, 21.0f, 27.0f);
            instancePath.cubicTo(21.0f, 24.514719f, 23.014719f, 22.5f, 25.5f, 22.5f);
            instancePath.cubicTo(27.985281f, 22.5f, 30.0f, 24.514719f, 30.0f, 27.0f);
            instancePath.cubicTo(30.0f, 29.485281f, 27.985281f, 31.5f, 25.5f, 31.5f);
            instancePath.close();
            instancePath.moveTo(46.5f, 31.5f);
            instancePath.cubicTo(44.014717f, 31.5f, 42.0f, 29.485281f, 42.0f, 27.0f);
            instancePath.cubicTo(42.0f, 24.514719f, 44.014717f, 22.5f, 46.5f, 22.5f);
            instancePath.cubicTo(48.985283f, 22.5f, 51.0f, 24.514719f, 51.0f, 27.0f);
            instancePath.cubicTo(51.0f, 29.485281f, 48.985283f, 31.5f, 46.5f, 31.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
