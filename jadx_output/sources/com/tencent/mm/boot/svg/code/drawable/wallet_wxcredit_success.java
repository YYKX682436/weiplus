package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_wxcredit_success extends l95.c {
    private final int width = 240;
    private final int height = 240;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 240;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15879408);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(95.55f, 0.86f);
                instancePath.cubicTo(119.32f, -2.19f, 144.07f, 2.98f, 164.58f, 15.41f);
                instancePath.cubicTo(186.83f, 28.72f, 204.03f, 50.3f, 211.85f, 75.04f);
                instancePath.cubicTo(219.43f, 98.53f, 218.59f, 124.63f, 209.5f, 147.57f);
                instancePath.cubicTo(199.91f, 172.1f, 180.97f, 192.79f, 157.4f, 204.55f);
                instancePath.cubicTo(134.65f, 216.07f, 107.76f, 218.98f, 83.03f, 212.84f);
                instancePath.cubicTo(56.39f, 206.36f, 32.6f, 189.18f, 17.92f, 166.03f);
                instancePath.cubicTo(4.3f, 144.85f, -1.44f, 118.78f, 1.94f, 93.84f);
                instancePath.cubicTo(4.98f, 69.99f, 16.41f, 47.37f, 33.67f, 30.65f);
                instancePath.cubicTo(50.33f, 14.34f, 72.39f, 3.65f, 95.55f, 0.86f);
                instancePath.lineTo(95.55f, 0.86f);
                instancePath.close();
                instancePath.moveTo(158.3f, 71.29f);
                instancePath.cubicTo(138.2f, 94.33f, 118.23f, 117.5f, 98.19f, 140.6f);
                instancePath.cubicTo(88.05f, 130.48f, 77.91f, 120.35f, 67.79f, 110.2f);
                instancePath.cubicTo(66.69f, 109.14f, 65.53f, 108.0f, 63.96f, 107.72f);
                instancePath.cubicTo(58.37f, 106.48f, 52.71f, 114.39f, 57.26f, 118.78f);
                instancePath.cubicTo(69.36f, 131.0f, 81.57f, 143.12f, 93.73f, 155.3f);
                instancePath.cubicTo(96.07f, 158.1f, 100.88f, 158.18f, 103.15f, 155.26f);
                instancePath.cubicTo(124.54f, 130.6f, 145.9f, 105.9f, 167.3f, 81.25f);
                instancePath.cubicTo(168.06f, 80.26f, 168.99f, 79.31f, 169.25f, 78.04f);
                instancePath.cubicTo(170.72f, 72.43f, 162.64f, 66.64f, 158.3f, 71.29f);
                instancePath.lineTo(158.3f, 71.29f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
