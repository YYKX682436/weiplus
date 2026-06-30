package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_wx_album extends l95.c {
    private final int width = 357;
    private final int height = 245;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 357;
        }
        if (i17 == 1) {
            return 245;
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
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 0.0f);
        instancePath.lineTo(21.0f, 0.0f);
        instancePath.lineTo(21.0f, 245.0f);
        instancePath.lineTo(20.0f, 245.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(335.0f, 0.0f);
        instancePath2.lineTo(336.0f, 0.0f);
        instancePath2.lineTo(336.0f, 245.0f);
        instancePath2.lineTo(335.0f, 245.0f);
        instancePath2.lineTo(335.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.0f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.790844f, 1.5f);
        instancePath3.lineTo(1.506977f, 243.5f);
        instancePath3.lineTo(355.493f, 243.5f);
        instancePath3.lineTo(348.20917f, 1.5f);
        instancePath3.lineTo(8.790844f, 1.5f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 37.0f, 0.0f, 1.0f, 25.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint7, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(-0.5f, -0.5f);
        instancePath4.lineTo(285.5f, -0.5f);
        instancePath4.lineTo(285.5f, 192.5f);
        instancePath4.lineTo(-0.5f, 192.5f);
        instancePath4.lineTo(-0.5f, -0.5f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint9.setColor(-16777216);
        instancePaint9.setStrokeWidth(2.0f);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 134.0f, 0.0f, 1.0f, 97.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint9, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(1.0f, 3.0f);
        instancePath5.cubicTo(1.0f, 1.8954304f, 1.8954304f, 1.0f, 3.0f, 1.0f);
        instancePath5.lineTo(66.0f, 1.0f);
        instancePath5.cubicTo(67.10457f, 1.0f, 68.0f, 1.8954304f, 68.0f, 3.0f);
        instancePath5.lineTo(68.0f, 49.0f);
        instancePath5.cubicTo(68.0f, 50.10457f, 67.10457f, 51.0f, 66.0f, 51.0f);
        instancePath5.lineTo(3.0f, 51.0f);
        instancePath5.cubicTo(1.8954304f, 51.0f, 1.0f, 50.10457f, 1.0f, 49.0f);
        instancePath5.lineTo(1.0f, 3.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint10);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint9, looper);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(99.0f, 50.07509f);
        instancePath6.lineTo(99.0f, 2.0108225f);
        instancePath6.lineTo(75.39577f, 19.873486f);
        instancePath6.cubicTo(75.21011f, 20.013983f, 75.0f, 20.437353f, 75.0f, 20.675142f);
        instancePath6.lineTo(75.0f, 32.730263f);
        instancePath6.cubicTo(75.0f, 32.953712f, 75.21011f, 33.357872f, 75.39602f, 33.488506f);
        instancePath6.lineTo(99.0f, 50.07509f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint11);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
