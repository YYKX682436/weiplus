package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_double_arrow_down extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.6f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 1.2246469E-16f, 24.0f, -1.2246469E-16f, -1.0f, 22.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.8369701E-16f, -1.0f, 24.0f, 1.0f, -1.8369701E-16f, 1.1021821E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 19.4375f);
        instancePath.lineTo(8.954533f, 20.5f);
        instancePath.lineTo(1.2894928f, 12.710085f);
        instancePath.cubicTo(0.9036102f, 12.317916f, 0.90844613f, 11.677169f, 1.2894928f, 11.289915f);
        instancePath.lineTo(8.954533f, 3.5f);
        instancePath.lineTo(10.0f, 4.5625f);
        instancePath.lineTo(2.681726f, 12.0f);
        instancePath.lineTo(10.0f, 19.4375f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -1.8369701E-16f, -1.0f, 24.0f, 1.0f, -1.8369701E-16f, 1.1021821E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.0f, 19.4375f);
        instancePath2.lineTo(8.954533f, 20.5f);
        instancePath2.lineTo(1.2894928f, 12.710085f);
        instancePath2.cubicTo(0.9036102f, 12.317916f, 0.90844613f, 11.677169f, 1.2894928f, 11.289915f);
        instancePath2.lineTo(8.954533f, 3.5f);
        instancePath2.lineTo(10.0f, 4.5625f);
        instancePath2.lineTo(2.681726f, 12.0f);
        instancePath2.lineTo(10.0f, 19.4375f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint8);
        canvas.drawPath(instancePath2, instancePaint9);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
