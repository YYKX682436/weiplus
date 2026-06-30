package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_moment extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        instancePath.cubicTo(4.5f, 0.0f, 0.0f, 4.5f, 0.0f, 10.0f);
        instancePath.cubicTo(0.0f, 15.5f, 4.5f, 20.0f, 10.0f, 20.0f);
        instancePath.cubicTo(15.5f, 20.0f, 20.0f, 15.5f, 20.0f, 10.0f);
        instancePath.cubicTo(20.0f, 4.5f, 15.5f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 6.3f);
        instancePath.lineTo(14.2f, 10.0f);
        instancePath.cubicTo(14.2f, 10.0f, 14.2f, 10.0f, 14.2f, 10.0f);
        instancePath.lineTo(14.2f, 2.3f);
        instancePath.cubicTo(15.8f, 3.2f, 17.2f, 4.6f, 18.0f, 6.3f);
        instancePath.close();
        instancePath.moveTo(12.1f, 12.1f);
        instancePath.cubicTo(11.6f, 12.7f, 10.8f, 13.0f, 10.0f, 13.0f);
        instancePath.cubicTo(9.2f, 13.0f, 8.4f, 12.7f, 7.9f, 12.1f);
        instancePath.lineTo(7.9f, 12.1f);
        instancePath.lineTo(7.9f, 12.1f);
        instancePath.cubicTo(7.3f, 11.6f, 7.0f, 10.8f, 7.0f, 10.0f);
        instancePath.cubicTo(7.0f, 8.3f, 8.3f, 7.0f, 10.0f, 7.0f);
        instancePath.cubicTo(11.7f, 7.0f, 13.0f, 8.3f, 13.0f, 10.0f);
        instancePath.cubicTo(13.0f, 10.8f, 12.7f, 11.6f, 12.1f, 12.1f);
        instancePath.lineTo(12.1f, 12.1f);
        instancePath.lineTo(12.1f, 12.1f);
        instancePath.close();
        instancePath.moveTo(13.0f, 1.7f);
        instancePath.lineTo(13.0f, 7.0f);
        instancePath.cubicTo(13.0f, 7.0f, 13.0f, 7.0f, 13.0f, 7.0f);
        instancePath.lineTo(13.0f, 7.0f);
        instancePath.lineTo(7.5f, 1.6f);
        instancePath.cubicTo(8.3f, 1.4f, 9.1f, 1.2f, 10.0f, 1.2f);
        instancePath.cubicTo(11.1f, 1.2f, 12.1f, 1.4f, 13.0f, 1.7f);
        instancePath.close();
        instancePath.moveTo(6.3f, 2.0f);
        instancePath.lineTo(10.0f, 5.8f);
        instancePath.cubicTo(10.0f, 5.8f, 10.0f, 5.8f, 10.0f, 5.8f);
        instancePath.lineTo(2.3f, 5.8f);
        instancePath.cubicTo(3.2f, 4.2f, 4.6f, 2.8f, 6.3f, 2.0f);
        instancePath.close();
        instancePath.moveTo(1.7f, 7.0f);
        instancePath.lineTo(7.0f, 7.0f);
        instancePath.cubicTo(7.0f, 7.0f, 7.0f, 7.0f, 7.0f, 7.0f);
        instancePath.lineTo(7.0f, 7.0f);
        instancePath.lineTo(1.5f, 12.5f);
        instancePath.cubicTo(1.3f, 11.7f, 1.1f, 10.9f, 1.1f, 10.0f);
        instancePath.cubicTo(1.2f, 8.9f, 1.4f, 7.9f, 1.7f, 7.0f);
        instancePath.close();
        instancePath.moveTo(2.0f, 13.7f);
        instancePath.lineTo(5.8f, 10.0f);
        instancePath.cubicTo(5.8f, 10.0f, 5.8f, 10.0f, 5.8f, 10.0f);
        instancePath.lineTo(5.8f, 17.7f);
        instancePath.cubicTo(4.2f, 16.8f, 2.8f, 15.4f, 2.0f, 13.7f);
        instancePath.close();
        instancePath.moveTo(7.0f, 18.3f);
        instancePath.lineTo(7.0f, 13.0f);
        instancePath.cubicTo(7.0f, 13.0f, 7.0f, 13.0f, 7.0f, 13.0f);
        instancePath.lineTo(7.0f, 13.0f);
        instancePath.lineTo(12.5f, 18.5f);
        instancePath.cubicTo(11.7f, 18.7f, 10.9f, 18.9f, 10.0f, 18.9f);
        instancePath.cubicTo(8.9f, 18.8f, 7.9f, 18.6f, 7.0f, 18.3f);
        instancePath.close();
        instancePath.moveTo(13.7f, 18.0f);
        instancePath.lineTo(10.0f, 14.2f);
        instancePath.cubicTo(10.0f, 14.2f, 10.0f, 14.2f, 10.0f, 14.2f);
        instancePath.lineTo(17.7f, 14.2f);
        instancePath.cubicTo(16.8f, 15.8f, 15.4f, 17.2f, 13.7f, 18.0f);
        instancePath.close();
        instancePath.moveTo(18.3f, 13.0f);
        instancePath.lineTo(13.0f, 13.0f);
        instancePath.cubicTo(13.0f, 13.0f, 13.0f, 13.0f, 13.0f, 13.0f);
        instancePath.lineTo(13.0f, 13.0f);
        instancePath.lineTo(18.5f, 7.5f);
        instancePath.cubicTo(18.7f, 8.3f, 18.9f, 9.1f, 18.9f, 10.0f);
        instancePath.cubicTo(18.8f, 11.1f, 18.6f, 12.1f, 18.3f, 13.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
