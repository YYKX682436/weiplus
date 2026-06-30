package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_quote_voice extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 58.5f, 0.0f, 1.0f, 4.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 45.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(45.0f, 31.5f);
            instancePath.cubicTo(45.0f, 43.80101f, 39.963615f, 54.937534f, 31.820807f, 62.99901f);
            instancePath.lineTo(27.822594f, 59.043167f);
            instancePath.cubicTo(34.82541f, 51.969753f, 39.15f, 42.23991f, 39.15f, 31.5f);
            instancePath.cubicTo(39.15f, 20.760595f, 34.825813f, 11.031158f, 27.82358f, 3.9578285f);
            instancePath.lineTo(31.819805f, -1.314504E-13f);
            instancePath.cubicTo(39.963203f, 8.061553f, 45.0f, 19.198484f, 45.0f, 31.5f);
            instancePath.close();
            instancePath.moveTo(29.25f, 31.5f);
            instancePath.cubicTo(29.25f, 39.49548f, 25.976496f, 46.734077f, 20.683876f, 51.974007f);
            instancePath.lineTo(16.629457f, 47.962723f);
            instancePath.cubicTo(20.815128f, 43.734924f, 23.4f, 37.919327f, 23.4f, 31.5f);
            instancePath.cubicTo(23.4f, 25.081179f, 20.815536f, 19.265991f, 16.630445f, 15.038276f);
            instancePath.lineTo(20.683878f, 11.025995f);
            instancePath.cubicTo(25.976496f, 16.265926f, 29.25f, 23.50452f, 29.25f, 31.5f);
            instancePath.close();
            instancePath.moveTo(9.546944f, 22.050993f);
            instancePath.cubicTo(11.989374f, 24.46938f, 13.5f, 27.810051f, 13.5f, 31.5f);
            instancePath.cubicTo(13.5f, 35.190456f, 11.988961f, 38.531532f, 9.545941f, 40.95f);
            instancePath.lineTo(0.0f, 31.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
