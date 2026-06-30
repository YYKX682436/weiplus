package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class on_error_info extends l95.c {
    private final int width = 18;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 18;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, -3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-372399);
        instancePaint4.setStrokeWidth(0.8888889f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.838384f, 8.00678f);
        instancePath.cubicTo(15.838384f, 3.5409493f, 12.2929325f, 0.0f, 7.821424f, 0.0f);
        instancePath.cubicTo(3.5454516f, 0.0f, 0.0f, 3.5409493f, 0.0f, 8.00678f);
        instancePath.cubicTo(0.0f, 12.277322f, 3.5454516f, 15.818272f, 7.821424f, 15.818272f);
        instancePath.cubicTo(12.2929325f, 15.818272f, 15.838384f, 12.277322f, 15.838384f, 8.00678f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-372399);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.129927f, 10.750443f);
        instancePath2.cubicTo(8.558716f, 10.750443f, 8.906318f, 11.097604f, 8.906318f, 11.525848f);
        instancePath2.cubicTo(8.906318f, 11.954093f, 8.558716f, 12.301254f, 8.129927f, 12.301254f);
        instancePath2.cubicTo(7.7011375f, 12.301254f, 7.353535f, 11.954093f, 7.353535f, 11.525848f);
        instancePath2.cubicTo(7.353535f, 11.097604f, 7.7011375f, 10.750443f, 8.129927f, 10.750443f);
        instancePath2.close();
        instancePath2.moveTo(8.129927f, 4.237037f);
        instancePath2.cubicTo(8.561706f, 4.237037f, 8.890207f, 4.58459f, 8.870334f, 5.013318f);
        instancePath2.lineTo(8.870334f, 5.013318f);
        instancePath2.lineTo(8.675217f, 9.2224865f);
        instancePath2.cubicTo(8.660004f, 9.55068f, 8.383294f, 9.819957f, 8.057353f, 9.819957f);
        instancePath2.lineTo(8.129536f, 9.814037f);
        instancePath2.lineTo(8.1056795f, 9.812137f);
        instancePath2.cubicTo(7.8529983f, 9.770977f, 7.648717f, 9.571741f, 7.596772f, 9.319399f);
        instancePath2.lineTo(7.5846367f, 9.2224865f);
        instancePath2.lineTo(7.38952f, 5.013318f);
        instancePath2.cubicTo(7.3697243f, 4.5862737f, 7.7011375f, 4.237037f, 8.129927f, 4.237037f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
