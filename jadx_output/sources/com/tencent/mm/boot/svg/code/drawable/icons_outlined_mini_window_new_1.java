package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_mini_window_new_1 extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(4.5f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.2f, 39.0f);
        instancePath2.lineTo(3.0f, 39.0f);
        instancePath2.cubicTo(1.3431457f, 39.0f, -2.4118308E-16f, 37.656853f, 0.0f, 36.0f);
        instancePath2.lineTo(0.0f, 3.0f);
        instancePath2.cubicTo(2.4118308E-16f, 1.3431457f, 1.3431457f, -2.360176E-15f, 3.0f, 0.0f);
        instancePath2.lineTo(36.0f, 0.0f);
        instancePath2.cubicTo(37.656853f, 1.3973002E-16f, 39.0f, 1.3431457f, 39.0f, 3.0f);
        instancePath2.lineTo(39.0f, 16.2f);
        instancePath2.lineTo(39.0f, 16.2f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(44.04045f, 24.0f);
        instancePath3.lineTo(40.0809f, 24.0f);
        instancePath3.lineTo(28.5f, 24.0f);
        instancePath3.cubicTo(26.014719f, 24.0f, 24.0f, 26.014719f, 24.0f, 28.5f);
        instancePath3.lineTo(24.0f, 43.5f);
        instancePath3.cubicTo(24.0f, 45.985283f, 26.014719f, 48.0f, 28.5f, 48.0f);
        instancePath3.lineTo(43.5f, 48.0f);
        instancePath3.cubicTo(45.985283f, 48.0f, 48.0f, 45.985283f, 48.0f, 43.5f);
        instancePath3.lineTo(48.0f, 27.95955f);
        instancePath3.cubicTo(48.0f, 25.77275f, 46.22725f, 24.0f, 44.04045f, 24.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
