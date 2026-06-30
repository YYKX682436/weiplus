package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icon_outlined_min_window extends l95.c {
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(28.59801f, 40.41f);
        instancePath.cubicTo(30.254864f, 40.41f, 31.59801f, 41.753147f, 31.59801f, 43.41f);
        instancePath.lineTo(31.59801f, 57.66f);
        instancePath.lineTo(27.09801f, 57.66f);
        instancePath.lineTo(27.09801f, 48.091515f);
        instancePath.lineTo(12.72f, 62.464516f);
        instancePath.lineTo(9.54f, 59.284515f);
        instancePath.lineTo(23.912008f, 44.911514f);
        instancePath.lineTo(14.348009f, 44.91f);
        instancePath.lineTo(14.348009f, 40.41f);
        instancePath.lineTo(28.59801f, 40.41f);
        instancePath.close();
        instancePath.moveTo(59.28801f, 9.530009f);
        instancePath.lineTo(62.46801f, 12.71001f);
        instancePath.lineTo(48.096f, 27.08301f);
        instancePath.lineTo(57.66f, 27.084524f);
        instancePath.lineTo(57.66f, 31.584524f);
        instancePath.lineTo(43.41f, 31.584524f);
        instancePath.cubicTo(41.753147f, 31.584524f, 40.41f, 30.241379f, 40.41f, 28.584524f);
        instancePath.lineTo(40.41f, 14.334524f);
        instancePath.lineTo(44.91f, 14.334524f);
        instancePath.lineTo(44.91f, 23.90301f);
        instancePath.lineTo(59.28801f, 9.530009f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
