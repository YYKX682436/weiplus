package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_computer extends l95.c {
    private final int width = 88;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 88;
        }
        if (i17 == 1) {
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
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.6f, 3.883483f);
        instancePath.cubicTo(0.6f, 2.0700653f, 2.0700653f, 0.6f, 3.883483f, 0.6f);
        instancePath.lineTo(66.116516f, 0.6f);
        instancePath.cubicTo(67.92993f, 0.6f, 69.4f, 2.0700653f, 69.4f, 3.883483f);
        instancePath.lineTo(69.4f, 44.116516f);
        instancePath.cubicTo(69.4f, 45.929935f, 67.92993f, 47.399998f, 66.116516f, 47.399998f);
        instancePath.lineTo(3.883483f, 47.399998f);
        instancePath.cubicTo(2.0700653f, 47.399998f, 0.6f, 45.929935f, 0.6f, 44.116516f);
        instancePath.lineTo(0.6f, 3.883483f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.0f, 55.3f);
        instancePath2.cubicTo(19.0f, 55.134315f, 19.134314f, 55.0f, 19.3f, 55.0f);
        instancePath2.lineTo(50.7f, 55.0f);
        instancePath2.cubicTo(50.865685f, 55.0f, 51.0f, 55.134315f, 51.0f, 55.3f);
        instancePath2.lineTo(51.0f, 55.9f);
        instancePath2.cubicTo(51.0f, 56.065685f, 50.865685f, 56.2f, 50.7f, 56.2f);
        instancePath2.lineTo(19.3f, 56.2f);
        instancePath2.cubicTo(19.134314f, 56.2f, 19.0f, 56.065685f, 19.0f, 55.9f);
        instancePath2.lineTo(19.0f, 55.3f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 47.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 6.123234E-17f, -1.0f, 5.2f, 1.0f, 6.123234E-17f, 3.9999998f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(-3.4f, 4.0f);
        instancePath3.lineTo(4.6f, 4.0f);
        instancePath3.lineTo(4.6f, 5.2f);
        instancePath3.lineTo(-3.4f, 5.2f);
        instancePath3.lineTo(-3.4f, 4.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint6, looper);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 6.123234E-17f, -1.0f, 9.8f, 1.0f, 6.123234E-17f, -1.8000002f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(1.8f, 3.4f);
        instancePath4.lineTo(9.8f, 3.4f);
        instancePath4.lineTo(9.8f, 4.6000004f);
        instancePath4.lineTo(1.8f, 4.6000004f);
        instancePath4.lineTo(1.8f, 3.4f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
