package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_alarm extends l95.c {
    private final int width = 36;
    private final int height = 36;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 36;
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
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-15028967);
        instancePaint4.setStrokeWidth(2.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.0306435f, 11.052016f);
        instancePath.cubicTo(0.7812371f, 9.886849f, 0.0f, 8.226148f, 0.0f, 6.382979f);
        instancePath.cubicTo(0.0f, 2.8577569f, 2.8577569f, 0.0f, 6.382979f, 0.0f);
        instancePath.cubicTo(8.40088f, 0.0f, 10.200077f, 0.93637973f, 11.3697605f, 2.3983283f);
        instancePath.cubicTo(7.022729f, 3.5833154f, 3.5322874f, 6.84528f, 2.0306435f, 11.052016f);
        instancePath.close();
        instancePath.moveTo(18.629875f, 2.3987827f);
        instancePath.cubicTo(19.799551f, 0.9365738f, 21.598911f, 0.0f, 23.617022f, 0.0f);
        instancePath.cubicTo(27.142242f, 0.0f, 30.0f, 2.8577569f, 30.0f, 6.382979f);
        instancePath.cubicTo(30.0f, 8.226897f, 29.218128f, 9.8882f, 27.967833f, 11.053436f);
        instancePath.cubicTo(26.46666f, 6.8465524f, 22.976622f, 3.5842826f, 18.629875f, 2.3987827f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.0f, 1.9148932f);
        instancePath2.cubicTo(22.226706f, 1.9148932f, 28.085106f, 7.7732944f, 28.085106f, 15.0f);
        instancePath2.cubicTo(28.085106f, 22.226706f, 22.226706f, 28.085106f, 15.0f, 28.085106f);
        instancePath2.cubicTo(7.7732944f, 28.085106f, 1.9148932f, 22.226706f, 1.9148932f, 15.0f);
        instancePath2.cubicTo(1.9148932f, 7.7732944f, 7.7732944f, 1.9148932f, 15.0f, 1.9148932f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
        instancePaint7.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(23.0f, 26.0f);
        instancePath3.lineTo(26.19149f, 29.19149f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 10.553192f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(4.0f, 26.0f);
        instancePath4.lineTo(6.5531917f, 29.829786f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint4, looper);
        instancePaint9.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(15.0f, 6.1363635f);
        instancePath5.lineTo(15.0f, 15.0f);
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint4, looper);
        instancePaint10.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(15.0f, 15.0f);
        instancePath6.lineTo(20.74468f, 18.40909f);
        canvas.drawPath(instancePath6, instancePaint10);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
