package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class location_copy extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -216.0f, 0.0f, 1.0f, -713.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 216.0f, 0.0f, 1.0f, 713.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(16777215);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.0f, 21.33337f);
        instancePath2.lineTo(16.0f, 21.33337f);
        instancePath2.lineTo(16.0f, 25.33337f);
        instancePath2.cubicTo(16.0f, 26.06967f, 15.40309f, 26.66667f, 14.66669f, 26.66667f);
        instancePath2.lineTo(1.33333f, 26.66667f);
        instancePath2.cubicTo(0.59695f, 26.66667f, 0.0f, 26.06967f, 0.0f, 25.33337f);
        instancePath2.lineTo(0.0f, 6.66666f);
        instancePath2.cubicTo(0.0f, 5.93028f, 0.59695f, 5.33333f, 1.33333f, 5.33333f);
        instancePath2.lineTo(5.33329f, 5.33333f);
        instancePath2.lineTo(5.33329f, 1.33333f);
        instancePath2.cubicTo(5.33329f, 0.59695f, 5.93029f, 4.440892E-16f, 6.66669f, 4.440892E-16f);
        instancePath2.lineTo(20.0f, 4.440892E-16f);
        instancePath2.cubicTo(20.73639f, 4.440892E-16f, 21.33329f, 0.59695f, 21.33329f, 1.33333f);
        instancePath2.lineTo(21.33329f, 19.99997f);
        instancePath2.cubicTo(21.33329f, 20.73637f, 20.73639f, 21.33337f, 20.0f, 21.33337f);
        instancePath2.close();
        instancePath2.moveTo(6.93329f, 5.33333f);
        instancePath2.lineTo(14.66669f, 5.33333f);
        instancePath2.cubicTo(15.40309f, 5.33333f, 15.99999f, 5.93028f, 15.99999f, 6.66666f);
        instancePath2.lineTo(15.99999f, 19.73337f);
        instancePath2.lineTo(19.73329f, 19.73337f);
        instancePath2.lineTo(19.73329f, 1.6f);
        instancePath2.lineTo(6.93329f, 1.6f);
        instancePath2.lineTo(6.93329f, 5.33333f);
        instancePath2.close();
        instancePath2.moveTo(1.6f, 25.06667f);
        instancePath2.lineTo(14.39999f, 25.06667f);
        instancePath2.lineTo(14.39999f, 6.93333f);
        instancePath2.lineTo(1.6f, 6.93333f);
        instancePath2.lineTo(1.6f, 25.06667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
