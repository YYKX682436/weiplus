package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_file_scan extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.6f, 40.2f);
        instancePath.lineTo(12.6f, 56.4f);
        instancePath.lineTo(50.4f, 56.4f);
        instancePath.lineTo(50.4f, 40.2f);
        instancePath.lineTo(54.0f, 40.2f);
        instancePath.lineTo(54.0f, 57.004063f);
        instancePath.cubicTo(54.0f, 58.66269f, 52.662483f, 60.0f, 51.012573f, 60.0f);
        instancePath.lineTo(11.987426f, 60.0f);
        instancePath.cubicTo(10.346761f, 60.0f, 9.0f, 58.658672f, 9.0f, 57.004063f);
        instancePath.lineTo(9.0f, 40.2f);
        instancePath.lineTo(12.6f, 40.2f);
        instancePath.close();
        instancePath.moveTo(0.0f, 36.6f);
        instancePath.lineTo(0.0f, 33.0f);
        instancePath.lineTo(9.0f, 33.0f);
        instancePath.lineTo(9.0f, 2.9959373f);
        instancePath.cubicTo(9.0f, 1.3373097f, 10.337516f, 0.0f, 11.987426f, 0.0f);
        instancePath.lineTo(35.993713f, 0.0f);
        instancePath.lineTo(54.0f, 18.0f);
        instancePath.lineTo(54.0f, 33.0f);
        instancePath.lineTo(60.0f, 33.0f);
        instancePath.lineTo(60.0f, 36.6f);
        instancePath.lineTo(0.0f, 36.6f);
        instancePath.close();
        instancePath.moveTo(31.199f, 3.6f);
        instancePath.lineTo(12.6f, 3.6f);
        instancePath.lineTo(12.6f, 33.0f);
        instancePath.lineTo(50.4f, 33.0f);
        instancePath.lineTo(50.4f, 22.799f);
        instancePath.lineTo(36.0f, 22.8f);
        instancePath.cubicTo(33.349033f, 22.8f, 31.2f, 20.650967f, 31.2f, 18.0f);
        instancePath.lineTo(31.199f, 3.6f);
        instancePath.close();
        instancePath.moveTo(34.799f, 3.897f);
        instancePath.lineTo(34.8f, 18.0f);
        instancePath.cubicTo(34.8f, 18.662743f, 35.337257f, 19.2f, 36.0f, 19.2f);
        instancePath.lineTo(50.109f, 19.2f);
        instancePath.lineTo(34.799f, 3.897f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
