package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class music_pauseicon_pressed extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.6666666f, 0.0f, 0.0f, 0.0f, 1.6666666f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(637534208);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 0.0f);
        instancePath.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        instancePath.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        instancePath.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        instancePath.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(36.0f, 0.0f);
        instancePath2.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        instancePath2.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        instancePath2.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        instancePath2.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(36.0f, 2.16f);
        instancePath2.cubicTo(17.310684f, 2.16f, 2.16f, 17.310684f, 2.16f, 36.0f);
        instancePath2.cubicTo(2.16f, 54.689316f, 17.310684f, 69.84f, 36.0f, 69.84f);
        instancePath2.cubicTo(54.689316f, 69.84f, 69.84f, 54.689316f, 69.84f, 36.0f);
        instancePath2.cubicTo(69.84f, 17.310684f, 54.689316f, 2.16f, 36.0f, 2.16f);
        instancePath2.close();
        instancePath2.moveTo(46.5f, 22.5f);
        instancePath2.cubicTo(48.156853f, 22.5f, 49.5f, 23.843145f, 49.5f, 25.5f);
        instancePath2.lineTo(49.5f, 46.5f);
        instancePath2.cubicTo(49.5f, 48.156853f, 48.156853f, 49.5f, 46.5f, 49.5f);
        instancePath2.lineTo(25.5f, 49.5f);
        instancePath2.cubicTo(23.843145f, 49.5f, 22.5f, 48.156853f, 22.5f, 46.5f);
        instancePath2.lineTo(22.5f, 25.5f);
        instancePath2.cubicTo(22.5f, 23.843145f, 23.843145f, 22.5f, 25.5f, 22.5f);
        instancePath2.lineTo(46.5f, 22.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(419430400);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(36.0f, 0.0f);
        instancePath3.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        instancePath3.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        instancePath3.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        instancePath3.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
