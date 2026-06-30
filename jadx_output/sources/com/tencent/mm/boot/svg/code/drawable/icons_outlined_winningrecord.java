package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_winningrecord extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.saveLayerAlpha(null, 230, 31);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(29.993713f, 0.0f);
        instancePath.lineTo(48.0f, 18.0f);
        instancePath.lineTo(48.0f, 57.004063f);
        instancePath.cubicTo(48.0f, 58.66269f, 46.662483f, 60.0f, 45.012573f, 60.0f);
        instancePath.lineTo(2.9874256f, 60.0f);
        instancePath.cubicTo(1.3467606f, 60.0f, 0.0f, 58.658672f, 0.0f, 57.004063f);
        instancePath.lineTo(0.0f, 2.9959373f);
        instancePath.cubicTo(0.0f, 1.3373097f, 1.337516f, 0.0f, 2.9874256f, 0.0f);
        instancePath.lineTo(29.993713f, 0.0f);
        instancePath.close();
        instancePath.moveTo(25.197f, 3.597f);
        instancePath.lineTo(3.6f, 3.6f);
        instancePath.lineTo(3.6f, 56.4f);
        instancePath.lineTo(44.4f, 56.4f);
        instancePath.lineTo(44.397f, 22.8f);
        instancePath.lineTo(30.0f, 22.8f);
        instancePath.cubicTo(27.349033f, 22.8f, 25.2f, 20.650967f, 25.2f, 18.0f);
        instancePath.lineTo(25.197f, 3.597f);
        instancePath.close();
        instancePath.moveTo(44.106f, 19.2f);
        instancePath.lineTo(28.797f, 3.894f);
        instancePath.lineTo(28.8f, 18.0f);
        instancePath.cubicTo(28.8f, 18.662743f, 29.337257f, 19.2f, 30.0f, 19.2f);
        instancePath.lineTo(44.106f, 19.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 22.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 9.0f);
        instancePath2.lineTo(22.5f, 9.0f);
        instancePath2.lineTo(22.5f, 12.6f);
        instancePath2.lineTo(0.0f, 12.6f);
        instancePath2.lineTo(0.0f, 9.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 18.0f);
        instancePath3.lineTo(12.0f, 18.0f);
        instancePath3.lineTo(12.0f, 21.6f);
        instancePath3.lineTo(0.0f, 21.6f);
        instancePath3.lineTo(0.0f, 18.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.0f, 0.0f);
        instancePath4.lineTo(12.0f, 0.0f);
        instancePath4.lineTo(12.0f, 3.6000001f);
        instancePath4.lineTo(0.0f, 3.6000001f);
        instancePath4.lineTo(0.0f, 0.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
