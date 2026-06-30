package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_pause_circle extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(65.9999f, 36.001f);
        instancePath.cubicTo(65.9999f, 52.5695f, 52.5684f, 66.001f, 35.9999f, 66.001f);
        instancePath.cubicTo(19.4313f, 66.001f, 5.99988f, 52.5695f, 5.99988f, 36.001f);
        instancePath.cubicTo(5.99988f, 19.4324f, 19.4313f, 6.00098f, 35.9999f, 6.00098f);
        instancePath.cubicTo(52.5684f, 6.00098f, 65.9999f, 19.4324f, 65.9999f, 36.001f);
        instancePath.close();
        instancePath.moveTo(27.3f, 23.4004f);
        instancePath.lineTo(29.7f, 23.4004f);
        instancePath.cubicTo(30.8597f, 23.4004f, 31.8f, 24.3406f, 31.8f, 25.5004f);
        instancePath.lineTo(31.8f, 46.5004f);
        instancePath.cubicTo(31.8f, 47.6602f, 30.8598f, 48.6004f, 29.7f, 48.6004f);
        instancePath.lineTo(27.3f, 48.6004f);
        instancePath.cubicTo(26.1402f, 48.6004f, 25.2f, 47.6602f, 25.2f, 46.5004f);
        instancePath.lineTo(25.2f, 25.5004f);
        instancePath.cubicTo(25.2f, 24.3406f, 26.1402f, 23.4004f, 27.3f, 23.4004f);
        instancePath.close();
        instancePath.moveTo(44.7f, 23.4004f);
        instancePath.lineTo(42.3f, 23.4004f);
        instancePath.cubicTo(41.1402f, 23.4004f, 40.2f, 24.3406f, 40.2f, 25.5004f);
        instancePath.lineTo(40.2f, 46.5004f);
        instancePath.cubicTo(40.2f, 47.6602f, 41.1402f, 48.6004f, 42.3f, 48.6004f);
        instancePath.lineTo(44.7f, 48.6004f);
        instancePath.cubicTo(45.8598f, 48.6004f, 46.8f, 47.6602f, 46.8f, 46.5004f);
        instancePath.lineTo(46.8f, 25.5004f);
        instancePath.cubicTo(46.8f, 24.3406f, 45.8598f, 23.4004f, 44.7f, 23.4004f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
