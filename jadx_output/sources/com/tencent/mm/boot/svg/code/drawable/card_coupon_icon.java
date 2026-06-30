package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class card_coupon_icon extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-353221);
        instancePaint4.setStrokeWidth(3.6f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.3f, 28.78878f);
        instancePath.cubicTo(9.583951f, 29.583998f, 12.027272f, 32.505836f, 12.027272f, 36.0f);
        instancePath.cubicTo(12.027272f, 39.494164f, 9.583951f, 42.416004f, 6.3f, 43.21122f);
        instancePath.lineTo(6.3f, 55.5f);
        instancePath.cubicTo(6.3f, 56.162743f, 6.8372583f, 56.7f, 7.5f, 56.7f);
        instancePath.lineTo(64.5f, 56.7f);
        instancePath.cubicTo(65.16274f, 56.7f, 65.7f, 56.162743f, 65.7f, 55.5f);
        instancePath.lineTo(65.7f, 43.21122f);
        instancePath.cubicTo(62.41605f, 42.416004f, 59.97273f, 39.494164f, 59.97273f, 36.0f);
        instancePath.cubicTo(59.97273f, 32.50552f, 62.41649f, 29.58347f, 65.70089f, 28.788565f);
        instancePath.lineTo(65.7f, 16.5f);
        instancePath.cubicTo(65.7f, 15.837258f, 65.16274f, 15.3f, 64.5f, 15.3f);
        instancePath.lineTo(7.5f, 15.3f);
        instancePath.cubicTo(6.8372583f, 15.3f, 6.3f, 15.837258f, 6.3f, 16.5f);
        instancePath.lineTo(6.3f, 28.78878f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-352965);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(21.818182f, 28.958097f);
        instancePath2.cubicTo(21.818182f, 28.290884f, 22.359066f, 27.75f, 23.02628f, 27.75f);
        instancePath2.lineTo(46.382816f, 27.75f);
        instancePath2.cubicTo(47.05003f, 27.75f, 47.59091f, 28.290884f, 47.59091f, 28.958097f);
        instancePath2.lineTo(47.59091f, 30.141903f);
        instancePath2.cubicTo(47.59091f, 30.809116f, 47.05003f, 31.35f, 46.382816f, 31.35f);
        instancePath2.lineTo(23.02628f, 31.35f);
        instancePath2.cubicTo(22.359066f, 31.35f, 21.818182f, 30.809116f, 21.818182f, 30.141903f);
        instancePath2.lineTo(21.818182f, 28.958097f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-352965);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(21.818182f, 40.208096f);
        instancePath3.cubicTo(21.818182f, 39.540882f, 22.359066f, 39.0f, 23.02628f, 39.0f);
        instancePath3.lineTo(37.791904f, 39.0f);
        instancePath3.cubicTo(38.459118f, 39.0f, 39.0f, 39.540882f, 39.0f, 40.208096f);
        instancePath3.lineTo(39.0f, 41.391903f);
        instancePath3.cubicTo(39.0f, 42.059116f, 38.459118f, 42.6f, 37.791904f, 42.6f);
        instancePath3.lineTo(23.02628f, 42.6f);
        instancePath3.cubicTo(22.359066f, 42.6f, 21.818182f, 42.059116f, 21.818182f, 41.391903f);
        instancePath3.lineTo(21.818182f, 40.208096f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
