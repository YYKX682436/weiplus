package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class radar_search_waiting extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 48;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.9f, 0.0f);
                instancePath.lineTo(34.1f, 0.0f);
                instancePath.cubicTo(33.86f, 7.5f, 29.44f, 14.06f, 24.1f, 19.0f);
                instancePath.cubicTo(29.21f, 23.71f, 33.38f, 29.87f, 34.09f, 36.94f);
                instancePath.cubicTo(23.03f, 37.05f, 11.96f, 37.01f, 0.9f, 36.97f);
                instancePath.cubicTo(1.62f, 29.89f, 5.78f, 23.72f, 10.9f, 19.01f);
                instancePath.cubicTo(5.57f, 14.06f, 1.14f, 7.5f, 0.9f, 0.0f);
                instancePath.lineTo(0.9f, 0.0f);
                instancePath.close();
                instancePath.moveTo(8.27f, 6.01f);
                instancePath.cubicTo(10.16f, 10.93f, 16.03f, 13.56f, 16.48f, 19.02f);
                instancePath.cubicTo(16.19f, 24.12f, 10.8f, 26.53f, 8.87f, 30.95f);
                instancePath.cubicTo(14.62f, 31.03f, 20.37f, 31.03f, 26.12f, 30.94f);
                instancePath.cubicTo(24.2f, 26.52f, 18.8f, 24.11f, 18.52f, 19.01f);
                instancePath.cubicTo(18.99f, 13.55f, 24.84f, 10.93f, 26.73f, 6.01f);
                instancePath.cubicTo(20.58f, 6.0f, 14.42f, 6.0f, 8.27f, 6.01f);
                instancePath.lineTo(8.27f, 6.01f);
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
