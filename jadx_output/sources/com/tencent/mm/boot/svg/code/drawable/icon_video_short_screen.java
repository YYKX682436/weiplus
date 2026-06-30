package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_video_short_screen extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(1.5f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 5.0f, 0.0f, -1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 5.0f);
        instancePath2.lineTo(0.0f, 1.0f);
        instancePath2.cubicTo(-6.7635376E-17f, 0.44771525f, 0.44771525f, 1.0145306E-16f, 1.0f, 0.0f);
        instancePath2.lineTo(5.0f, 0.0f);
        instancePath2.lineTo(5.0f, 0.0f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 16.0f);
        instancePath3.lineTo(0.0f, 12.0f);
        instancePath3.cubicTo(-6.7635376E-17f, 11.447716f, 0.44771525f, 11.0f, 1.0f, 11.0f);
        instancePath3.lineTo(5.0f, 11.0f);
        instancePath3.lineTo(5.0f, 11.0f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.8369701E-16f, 1.0f, 11.0f, -1.0f, 1.8369701E-16f, 16.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(11.0f, 5.0f);
        instancePath4.lineTo(11.0f, 1.0f);
        instancePath4.cubicTo(11.0f, 0.44771525f, 11.447716f, 1.0145306E-16f, 12.0f, 0.0f);
        instancePath4.lineTo(16.0f, 0.0f);
        instancePath4.lineTo(16.0f, 0.0f);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, 1.8369701E-16f, 1.0f, -1.7763568E-15f, 1.0f, -1.8369701E-16f, 2.4799096E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(11.0f, 16.0f);
        instancePath5.lineTo(11.0f, 12.0f);
        instancePath5.cubicTo(11.0f, 11.447716f, 11.447716f, 11.0f, 12.0f, 11.0f);
        instancePath5.lineTo(16.0f, 11.0f);
        instancePath5.lineTo(16.0f, 11.0f);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
