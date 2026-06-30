package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class actionbar_goto_disabled_biz_icon extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -30.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(48.870228f, 11.038835f);
        instancePath.lineTo(46.0f, 13.9090605f);
        instancePath.lineTo(47.16861f, 15.077669f);
        instancePath.lineTo(50.038834f, 12.207443f);
        instancePath.lineTo(52.90906f, 15.077669f);
        instancePath.lineTo(54.07767f, 13.9090605f);
        instancePath.lineTo(51.207443f, 11.038835f);
        instancePath.lineTo(54.07767f, 8.168609f);
        instancePath.lineTo(52.90906f, 7.0f);
        instancePath.lineTo(50.038834f, 9.870226f);
        instancePath.lineTo(47.16861f, 7.0f);
        instancePath.lineTo(46.0f, 8.168609f);
        instancePath.lineTo(48.870228f, 11.038835f);
        instancePath.close();
        instancePath.moveTo(37.99703f, 7.0f);
        instancePath.cubicTo(37.446384f, 7.0f, 37.0f, 7.4530363f, 37.0f, 7.9970303f);
        instancePath.lineTo(37.0f, 14.00297f);
        instancePath.cubicTo(37.0f, 14.553615f, 37.453037f, 15.0f, 37.99703f, 15.0f);
        instancePath.lineTo(44.00297f, 15.0f);
        instancePath.cubicTo(44.553616f, 15.0f, 45.0f, 14.546964f, 45.0f, 14.00297f);
        instancePath.lineTo(45.0f, 7.9970303f);
        instancePath.cubicTo(45.0f, 7.4463854f, 44.546963f, 7.0f, 44.00297f, 7.0f);
        instancePath.lineTo(37.99703f, 7.0f);
        instancePath.close();
        instancePath.moveTo(37.99703f, 16.0f);
        instancePath.cubicTo(37.446384f, 16.0f, 37.0f, 16.453035f, 37.0f, 16.99703f);
        instancePath.lineTo(37.0f, 23.00297f);
        instancePath.cubicTo(37.0f, 23.553614f, 37.453037f, 24.0f, 37.99703f, 24.0f);
        instancePath.lineTo(44.00297f, 24.0f);
        instancePath.cubicTo(44.553616f, 24.0f, 45.0f, 23.546965f, 45.0f, 23.00297f);
        instancePath.lineTo(45.0f, 16.99703f);
        instancePath.cubicTo(45.0f, 16.446386f, 44.546963f, 16.0f, 44.00297f, 16.0f);
        instancePath.lineTo(37.99703f, 16.0f);
        instancePath.close();
        instancePath.moveTo(46.99703f, 16.0f);
        instancePath.cubicTo(46.446384f, 16.0f, 46.0f, 16.453035f, 46.0f, 16.99703f);
        instancePath.lineTo(46.0f, 23.00297f);
        instancePath.cubicTo(46.0f, 23.553614f, 46.453037f, 24.0f, 46.99703f, 24.0f);
        instancePath.lineTo(53.00297f, 24.0f);
        instancePath.cubicTo(53.553616f, 24.0f, 54.0f, 23.546965f, 54.0f, 23.00297f);
        instancePath.lineTo(54.0f, 16.99703f);
        instancePath.cubicTo(54.0f, 16.446386f, 53.546963f, 16.0f, 53.00297f, 16.0f);
        instancePath.lineTo(46.99703f, 16.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
