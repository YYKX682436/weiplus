package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class badge_count_more extends l95.c {
    private final int width = 89;
    private final int height = 56;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 89;
        }
        if (i17 == 1) {
            return 56;
        }
        if (i17 == 2) {
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-372399);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 27.0f);
            instancePath.cubicTo(0.0f, 12.088312f, 12.096977f, 0.0f, 26.990974f, 0.0f);
            instancePath.lineTo(60.009026f, 0.0f);
            instancePath.cubicTo(74.915726f, 0.0f, 87.0f, 12.085033f, 87.0f, 27.0f);
            instancePath.lineTo(87.0f, 27.0f);
            instancePath.cubicTo(87.0f, 41.91169f, 74.90302f, 54.0f, 60.009026f, 54.0f);
            instancePath.lineTo(26.990974f, 54.0f);
            instancePath.cubicTo(12.084271f, 54.0f, 0.0f, 41.914967f, 0.0f, 27.0f);
            instancePath.lineTo(0.0f, 27.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(30.3f, 24.0f);
            instancePath2.cubicTo(31.2f, 24.0f, 31.98f, 24.3f, 32.64f, 24.96f);
            instancePath2.cubicTo(33.27f, 25.59f, 33.6f, 26.37f, 33.6f, 27.27f);
            instancePath2.cubicTo(33.6f, 28.17f, 33.27f, 28.92f, 32.64f, 29.58f);
            instancePath2.cubicTo(31.98f, 30.24f, 31.2f, 30.57f, 30.3f, 30.57f);
            instancePath2.cubicTo(29.4f, 30.57f, 28.62f, 30.24f, 27.96f, 29.58f);
            instancePath2.cubicTo(27.3f, 28.92f, 27.0f, 28.17f, 27.0f, 27.27f);
            instancePath2.cubicTo(27.0f, 26.37f, 27.3f, 25.59f, 27.96f, 24.96f);
            instancePath2.cubicTo(28.59f, 24.3f, 29.37f, 24.0f, 30.3f, 24.0f);
            instancePath2.close();
            instancePath2.moveTo(42.9f, 24.0f);
            instancePath2.cubicTo(43.8f, 24.0f, 44.58f, 24.3f, 45.24f, 24.96f);
            instancePath2.cubicTo(45.87f, 25.59f, 46.2f, 26.37f, 46.2f, 27.27f);
            instancePath2.cubicTo(46.2f, 28.17f, 45.87f, 28.92f, 45.24f, 29.58f);
            instancePath2.cubicTo(44.58f, 30.24f, 43.8f, 30.57f, 42.9f, 30.57f);
            instancePath2.cubicTo(42.0f, 30.57f, 41.22f, 30.24f, 40.56f, 29.58f);
            instancePath2.cubicTo(39.9f, 28.92f, 39.6f, 28.17f, 39.6f, 27.27f);
            instancePath2.cubicTo(39.6f, 26.37f, 39.9f, 25.59f, 40.56f, 24.96f);
            instancePath2.cubicTo(41.19f, 24.3f, 41.97f, 24.0f, 42.9f, 24.0f);
            instancePath2.close();
            instancePath2.moveTo(55.5f, 24.0f);
            instancePath2.cubicTo(56.4f, 24.0f, 57.18f, 24.3f, 57.84f, 24.96f);
            instancePath2.cubicTo(58.47f, 25.59f, 58.8f, 26.37f, 58.8f, 27.27f);
            instancePath2.cubicTo(58.8f, 28.17f, 58.47f, 28.92f, 57.84f, 29.58f);
            instancePath2.cubicTo(57.18f, 30.24f, 56.4f, 30.57f, 55.5f, 30.57f);
            instancePath2.cubicTo(54.6f, 30.57f, 53.82f, 30.24f, 53.16f, 29.58f);
            instancePath2.cubicTo(52.5f, 28.92f, 52.2f, 28.17f, 52.2f, 27.27f);
            instancePath2.cubicTo(52.2f, 26.37f, 52.5f, 25.59f, 53.16f, 24.96f);
            instancePath2.cubicTo(53.79f, 24.3f, 54.57f, 24.0f, 55.5f, 24.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
