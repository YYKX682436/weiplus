package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class amp8 extends l95.c {
    private final int width = 34;
    private final int height = 51;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 34;
        }
        if (i17 == 1) {
            return 51;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -459.0f, 0.0f, 1.0f, -50.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 459.0f, 0.0f, 1.0f, 50.25f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 46.666668f);
        instancePath.lineTo(10.0f, 46.666668f);
        instancePath.lineTo(10.0f, 50.0f);
        instancePath.lineTo(0.0f, 50.0f);
        instancePath.lineTo(0.0f, 46.666668f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 40.0f);
        instancePath2.lineTo(13.333333f, 40.0f);
        instancePath2.lineTo(13.333333f, 43.333332f);
        instancePath2.lineTo(0.0f, 43.333332f);
        instancePath2.lineTo(0.0f, 40.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 33.333332f);
        instancePath3.lineTo(16.666666f, 33.333332f);
        instancePath3.lineTo(16.666666f, 36.666664f);
        instancePath3.lineTo(0.0f, 36.666664f);
        instancePath3.lineTo(0.0f, 33.333332f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.0f, 26.666666f);
        instancePath4.lineTo(20.0f, 26.666666f);
        instancePath4.lineTo(20.0f, 30.0f);
        instancePath4.lineTo(0.0f, 30.0f);
        instancePath4.lineTo(0.0f, 26.666666f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(0.0f, 20.0f);
        instancePath5.lineTo(23.333334f, 20.0f);
        instancePath5.lineTo(23.333334f, 23.333334f);
        instancePath5.lineTo(0.0f, 23.333334f);
        instancePath5.lineTo(0.0f, 20.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(0.0f, 13.333333f);
        instancePath6.lineTo(26.666666f, 13.333333f);
        instancePath6.lineTo(26.666666f, 16.666666f);
        instancePath6.lineTo(0.0f, 16.666666f);
        instancePath6.lineTo(0.0f, 13.333333f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath7 = l95.c.instancePath(looper);
        instancePath7.moveTo(0.0f, 6.6666665f);
        instancePath7.lineTo(30.0f, 6.6666665f);
        instancePath7.lineTo(30.0f, 10.0f);
        instancePath7.lineTo(0.0f, 10.0f);
        instancePath7.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath7, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath7, 2);
        canvas.drawPath(instancePath7, instancePaint10);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath8 = l95.c.instancePath(looper);
        instancePath8.moveTo(0.0f, 0.0f);
        instancePath8.lineTo(33.333332f, 0.0f);
        instancePath8.lineTo(33.333332f, 3.3333333f);
        instancePath8.lineTo(0.0f, 3.3333333f);
        instancePath8.lineTo(0.0f, 0.0f);
        instancePath8.close();
        canvas.drawPath(instancePath8, instancePaint11);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
