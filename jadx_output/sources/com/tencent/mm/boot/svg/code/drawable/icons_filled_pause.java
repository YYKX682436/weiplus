package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_pause extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.5f, 13.5f);
        instancePath.lineTo(25.5f, 13.5f);
        instancePath.cubicTo(27.156855f, 13.5f, 28.5f, 14.843145f, 28.5f, 16.5f);
        instancePath.lineTo(28.5f, 55.5f);
        instancePath.cubicTo(28.5f, 57.156853f, 27.156855f, 58.5f, 25.5f, 58.5f);
        instancePath.lineTo(19.5f, 58.5f);
        instancePath.cubicTo(17.843145f, 58.5f, 16.5f, 57.156853f, 16.5f, 55.5f);
        instancePath.lineTo(16.5f, 16.5f);
        instancePath.cubicTo(16.5f, 14.843145f, 17.843145f, 13.5f, 19.5f, 13.5f);
        instancePath.close();
        instancePath.moveTo(46.5f, 13.5f);
        instancePath.lineTo(52.5f, 13.5f);
        instancePath.cubicTo(54.156853f, 13.5f, 55.5f, 14.843145f, 55.5f, 16.5f);
        instancePath.lineTo(55.5f, 55.5f);
        instancePath.cubicTo(55.5f, 57.156853f, 54.156853f, 58.5f, 52.5f, 58.5f);
        instancePath.lineTo(46.5f, 58.5f);
        instancePath.cubicTo(44.843147f, 58.5f, 43.5f, 57.156853f, 43.5f, 55.5f);
        instancePath.lineTo(43.5f, 16.5f);
        instancePath.cubicTo(43.5f, 14.843145f, 44.843147f, 13.5f, 46.5f, 13.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
