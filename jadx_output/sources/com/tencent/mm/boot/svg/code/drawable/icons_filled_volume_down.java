package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_volume_down extends l95.c {
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
        instancePaint3.setColor(-16515072);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(27.9f, 2.1f);
        instancePath.lineTo(16.5f, 13.5f);
        instancePath.lineTo(3.0f, 13.5f);
        instancePath.cubicTo(1.2f, 13.5f, 0.0f, 14.7f, 0.0f, 16.5f);
        instancePath.lineTo(0.0f, 31.5f);
        instancePath.cubicTo(0.0f, 33.3f, 1.2f, 34.5f, 3.0f, 34.5f);
        instancePath.lineTo(16.5f, 34.5f);
        instancePath.lineTo(27.9f, 45.9f);
        instancePath.cubicTo(28.5f, 46.5f, 29.1f, 46.8f, 30.0f, 46.8f);
        instancePath.cubicTo(31.8f, 46.8f, 33.0f, 45.6f, 33.0f, 43.8f);
        instancePath.lineTo(33.0f, 4.2f);
        instancePath.cubicTo(33.0f, 3.3f, 32.7f, 2.7f, 32.1f, 2.1f);
        instancePath.cubicTo(30.9f, 0.9f, 29.1f, 0.9f, 27.9f, 2.1f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(42.6f, 35.7f);
        instancePath2.lineTo(39.3f, 32.4f);
        instancePath2.lineTo(39.6f, 32.1f);
        instancePath2.cubicTo(41.7f, 30.0f, 42.9f, 27.0f, 42.9f, 24.0f);
        instancePath2.cubicTo(42.9f, 21.0f, 41.7f, 18.0f, 39.6f, 15.9f);
        instancePath2.lineTo(39.3f, 15.6f);
        instancePath2.lineTo(42.6f, 12.3f);
        instancePath2.lineTo(42.9f, 12.6f);
        instancePath2.cubicTo(45.9f, 15.6f, 47.7f, 19.8f, 47.7f, 24.0f);
        instancePath2.cubicTo(47.7f, 28.2f, 45.9f, 32.4f, 42.9f, 35.4f);
        instancePath2.lineTo(42.6f, 35.7f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
