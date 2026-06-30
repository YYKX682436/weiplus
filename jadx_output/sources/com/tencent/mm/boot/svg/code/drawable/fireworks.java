package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fireworks extends l95.c {
    private final int width = 22;
    private final int height = 22;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 22;
        }
        if (i17 == 2) {
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
            instancePaint4.setColor(-8058);
            instancePaint4.setStrokeWidth(2.0f);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -24.0f, 0.0f, 1.0f, -95.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 24.51317f, 0.0f, 1.0f, 95.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(10.486831f, 0.0f);
            instancePath.lineTo(10.486831f, 7.0f);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(10.486831f, 15.0f);
            instancePath2.lineTo(10.486831f, 22.0f);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 0.5f, -0.8660254f, 15.307152f, 0.8660254f, 0.5f, -11.542917f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(17.712133f, 3.792134f);
            instancePath3.lineTo(17.587938f, 11.177714f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 0.5f, -0.8660254f, 15.035036f, 0.8660254f, 0.5f, 4.6390305f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(3.562098f, 11.647449f);
            instancePath4.lineTo(3.437902f, 19.03303f);
            canvas.drawPath(instancePath4, instancePaint8);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, -0.5f, -0.8660254f, 39.844887f, 0.8660254f, -0.5f, 7.8718505f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray5);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath5 = l95.c.instancePath(looper);
            instancePath5.moveTo(17.587938f, 11.745362f);
            instancePath5.lineTo(17.712133f, 19.130943f);
            canvas.drawPath(instancePath5, instancePaint9);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray6 = l95.c.setMatrixFloatArray(matrixFloatArray5, -0.5f, -0.8660254f, 11.816931f, 0.8660254f, -0.5f, 8.343168f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray6);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath6 = l95.c.instancePath(looper);
            instancePath6.moveTo(3.437902f, 3.8900478f);
            instancePath6.lineTo(3.562098f, 11.275628f);
            canvas.drawPath(instancePath6, instancePaint10);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
