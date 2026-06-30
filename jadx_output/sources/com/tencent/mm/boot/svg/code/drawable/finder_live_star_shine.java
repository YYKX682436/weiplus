package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_star_shine extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 12.117641f, 0.70710677f, 0.70710677f, -5.019291f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.1176405f, 15.899811f);
        instancePath.lineTo(7.188856f, 17.772009f);
        instancePath.cubicTo(6.898442f, 17.882322f, 6.573587f, 17.736322f, 6.463273f, 17.445908f);
        instancePath.cubicTo(6.414396f, 17.317232f, 6.414396f, 17.1751f, 6.463273f, 17.046425f);
        instancePath.lineTo(8.335471f, 12.1176405f);
        instancePath.lineTo(8.335471f, 12.1176405f);
        instancePath.lineTo(6.463273f, 7.188856f);
        instancePath.cubicTo(6.352959f, 6.898442f, 6.49896f, 6.573587f, 6.7893744f, 6.463273f);
        instancePath.cubicTo(6.91805f, 6.414396f, 7.0601807f, 6.414396f, 7.188856f, 6.463273f);
        instancePath.lineTo(12.1176405f, 8.335471f);
        instancePath.lineTo(12.1176405f, 8.335471f);
        instancePath.lineTo(17.046425f, 6.463273f);
        instancePath.cubicTo(17.33684f, 6.352959f, 17.661694f, 6.49896f, 17.772009f, 6.7893744f);
        instancePath.cubicTo(17.820885f, 6.91805f, 17.820885f, 7.0601807f, 17.772009f, 7.188856f);
        instancePath.lineTo(15.899811f, 12.1176405f);
        instancePath.lineTo(15.899811f, 12.1176405f);
        instancePath.lineTo(17.772009f, 17.046425f);
        instancePath.cubicTo(17.882322f, 17.33684f, 17.736322f, 17.661694f, 17.445908f, 17.772009f);
        instancePath.cubicTo(17.317232f, 17.820885f, 17.1751f, 17.820885f, 17.046425f, 17.772009f);
        instancePath.lineTo(12.1176405f, 15.899811f);
        instancePath.lineTo(12.1176405f, 15.899811f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
