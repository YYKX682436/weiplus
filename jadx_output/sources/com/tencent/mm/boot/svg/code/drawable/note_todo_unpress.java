package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_todo_unpress extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 28.8f);
        instancePath.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
        instancePath.lineTo(115.2f, 0.0f);
        instancePath.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
        instancePath.lineTo(144.0f, 115.2f);
        instancePath.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
        instancePath.lineTo(28.8f, 144.0f);
        instancePath.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
        instancePath.lineTo(0.0f, 28.8f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-14477034);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(94.2f, 67.7346f);
        instancePath2.lineTo(94.2f, 89.8806f);
        instancePath2.cubicTo(94.2f, 92.2656f, 92.265f, 94.2006f, 89.88f, 94.2006f);
        instancePath2.lineTo(55.32f, 94.2006f);
        instancePath2.cubicTo(52.935f, 94.2006f, 51.0f, 92.2656f, 51.0f, 89.8806f);
        instancePath2.lineTo(51.0f, 55.3206f);
        instancePath2.cubicTo(51.0f, 52.9326f, 52.935f, 51.0006f, 55.32f, 51.0006f);
        instancePath2.lineTo(89.88f, 51.0006f);
        instancePath2.cubicTo(90.219f, 51.0006f, 90.552f, 51.0396f, 90.867f, 51.1146f);
        instancePath2.lineTo(87.6f, 54.6006f);
        instancePath2.lineTo(55.32f, 54.6006f);
        instancePath2.cubicTo(54.921f, 54.6006f, 54.6f, 54.9216f, 54.6f, 55.3206f);
        instancePath2.lineTo(54.6f, 89.8806f);
        instancePath2.cubicTo(54.6f, 90.2766f, 54.921f, 90.6006f, 55.32f, 90.6006f);
        instancePath2.lineTo(89.88f, 90.6006f);
        instancePath2.cubicTo(90.279f, 90.6006f, 90.6f, 90.2766f, 90.6f, 89.8806f);
        instancePath2.lineTo(90.6f, 71.5746f);
        instancePath2.lineTo(94.2f, 67.7346f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(3.6f);
        instancePaint7.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        instancePaint7.setStrokeJoin(android.graphics.Paint.Join.MITER);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(63.648f, 67.40708f);
        instancePath3.lineTo(73.50063f, 78.48f);
        instancePath3.lineTo(96.0f, 54.48867f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
