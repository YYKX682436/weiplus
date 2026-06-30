package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_watch extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(0.8f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 22.082f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(49.990242f, 0.0f);
        instancePath.lineTo(46.258274f, 18.948547f);
        instancePath.cubicTo(45.89845f, 20.679089f, 44.216915f, 22.081966f, 42.4932f, 22.081966f);
        instancePath.lineTo(19.497046f, 22.081966f);
        instancePath.cubicTo(17.777475f, 22.081966f, 16.092482f, 20.682394f, 15.73197f, 18.948547f);
        instancePath.lineTo(12.0f, 0.0f);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(49.990242f, 70.0f);
        instancePath2.lineTo(46.258274f, 88.87821f);
        instancePath2.cubicTo(45.89845f, 90.602325f, 44.216915f, 92.0f, 42.4932f, 92.0f);
        instancePath2.lineTo(19.497046f, 92.0f);
        instancePath2.cubicTo(17.777475f, 92.0f, 16.092482f, 90.60562f, 15.73197f, 88.87821f);
        instancePath2.lineTo(12.0f, 70.0f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(31.0f, 15.4f);
        instancePath3.cubicTo(47.899914f, 15.4f, 61.6f, 29.100086f, 61.6f, 46.0f);
        instancePath3.cubicTo(61.6f, 62.899914f, 47.899914f, 76.6f, 31.0f, 76.6f);
        instancePath3.cubicTo(14.100086f, 76.6f, 0.39999962f, 62.899914f, 0.39999962f, 46.0f);
        instancePath3.cubicTo(0.39999962f, 29.100086f, 14.100086f, 15.4f, 31.0f, 15.4f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(31.0f, 23.4f);
        instancePath4.cubicTo(43.481636f, 23.4f, 53.6f, 33.518364f, 53.6f, 46.0f);
        instancePath4.cubicTo(53.6f, 58.481636f, 43.481636f, 68.6f, 31.0f, 68.6f);
        instancePath4.cubicTo(18.518364f, 68.6f, 8.4f, 58.481636f, 8.4f, 46.0f);
        instancePath4.cubicTo(8.4f, 33.518364f, 18.518364f, 23.4f, 31.0f, 23.4f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(16777215);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(0.0f, 0.0f);
        instancePath5.lineTo(104.0f, 0.0f);
        instancePath5.lineTo(104.0f, 104.0f);
        instancePath5.lineTo(0.0f, 104.0f);
        instancePath5.lineTo(0.0f, 0.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
