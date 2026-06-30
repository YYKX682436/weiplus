package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_scratch_card_decor_icon extends l95.c {
    private final int width = 10;
    private final int height = 10;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 10;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-6791389);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.5f, 0.0f);
        instancePath.lineTo(5.5f, 0.0f);
        instancePath.lineTo(5.5f, 3.0f);
        instancePath.lineTo(4.5f, 3.0f);
        instancePath.lineTo(4.5f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-6791389);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.5f, 7.0f);
        instancePath2.lineTo(5.5f, 7.0f);
        instancePath2.lineTo(5.5f, 10.0f);
        instancePath2.lineTo(4.5f, 10.0f);
        instancePath2.lineTo(4.5f, 7.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-6791389);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.5f, 0.8660254f, -2.3301868f, -0.8660254f, 0.5f, 1.8302181f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.419922f, 2.93311f);
        instancePath3.lineTo(1.419922f, 2.93311f);
        instancePath3.lineTo(1.419922f, 5.93311f);
        instancePath3.lineTo(0.419922f, 5.93311f);
        instancePath3.lineTo(0.419922f, 2.93311f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-6791389);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.5f, 0.8660254f, -2.3300266f, -0.8660254f, 0.5f, 8.830496f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(6.48242f, 6.43311f);
        instancePath4.lineTo(7.48242f, 6.43311f);
        instancePath4.lineTo(7.48242f, 9.43311f);
        instancePath4.lineTo(6.48242f, 9.43311f);
        instancePath4.lineTo(6.48242f, 6.43311f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-6791389);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -0.5f, 0.8660254f, -5.490392f, -0.8660254f, -0.5f, 12.6963415f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(0.919922f, 7.93311f);
        instancePath5.lineTo(1.919922f, 7.93311f);
        instancePath5.lineTo(1.919922f, 10.93311f);
        instancePath5.lineTo(0.919922f, 10.93311f);
        instancePath5.lineTo(0.919922f, 7.93311f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-6791389);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -0.5f, 0.8660254f, 6.634444f, -0.8660254f, -0.5f, 12.696619f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(6.98242f, 4.43311f);
        instancePath6.lineTo(7.98242f, 4.43311f);
        instancePath6.lineTo(7.98242f, 7.43311f);
        instancePath6.lineTo(6.98242f, 7.43311f);
        instancePath6.lineTo(6.98242f, 4.43311f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
