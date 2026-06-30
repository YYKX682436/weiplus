package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icon_outlined_mini_window_2 extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.2f, 0.0f, 1.0f, 10.2f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(45.84045f, 24.0f);
        instancePath.cubicTo(48.86989f, 24.0f, 51.35305f, 26.338902f, 51.582672f, 29.309444f);
        instancePath.lineTo(51.6f, 29.75955f);
        instancePath.lineTo(51.6f, 45.3f);
        instancePath.cubicTo(51.6f, 48.628117f, 49.019333f, 51.353485f, 45.74992f, 51.584183f);
        instancePath.lineTo(45.3f, 51.6f);
        instancePath.lineTo(30.3f, 51.6f);
        instancePath.cubicTo(26.971884f, 51.6f, 24.246515f, 49.019333f, 24.015818f, 45.74992f);
        instancePath.lineTo(24.0f, 45.3f);
        instancePath.lineTo(24.0f, 30.3f);
        instancePath.cubicTo(24.0f, 26.971884f, 26.580667f, 24.246515f, 29.85008f, 24.015818f);
        instancePath.lineTo(30.3f, 24.0f);
        instancePath.lineTo(45.84045f, 24.0f);
        instancePath.close();
        instancePath.moveTo(45.84045f, 27.6f);
        instancePath.lineTo(30.3f, 27.6f);
        instancePath.cubicTo(28.923536f, 27.6f, 27.787645f, 28.63001f, 27.621037f, 29.961317f);
        instancePath.lineTo(27.6f, 30.3f);
        instancePath.lineTo(27.6f, 45.3f);
        instancePath.cubicTo(27.6f, 46.676464f, 28.63001f, 47.812355f, 29.961317f, 47.978962f);
        instancePath.lineTo(30.3f, 48.0f);
        instancePath.lineTo(45.3f, 48.0f);
        instancePath.cubicTo(46.676464f, 48.0f, 47.812355f, 46.96999f, 47.978962f, 45.638683f);
        instancePath.lineTo(48.0f, 45.3f);
        instancePath.lineTo(48.0f, 29.75955f);
        instancePath.cubicTo(48.0f, 28.666254f, 47.187565f, 27.762712f, 46.133488f, 27.619715f);
        instancePath.lineTo(45.84045f, 27.6f);
        instancePath.close();
        instancePath.moveTo(37.8f, 0.0f);
        instancePath.cubicTo(40.30369f, 0.0f, 42.35967f, 1.9168845f, 42.580383f, 4.363102f);
        instancePath.lineTo(42.6f, 4.8f);
        instancePath.lineTo(42.6f, 18.0f);
        instancePath.lineTo(39.0f, 18.0f);
        instancePath.lineTo(39.0f, 4.8f);
        instancePath.cubicTo(39.0f, 4.220101f, 38.58866f, 3.7362752f, 38.041843f, 3.6243796f);
        instancePath.lineTo(37.8f, 3.6f);
        instancePath.lineTo(4.8f, 3.6f);
        instancePath.cubicTo(4.220101f, 3.6f, 3.7362752f, 4.011338f, 3.6243796f, 4.558158f);
        instancePath.lineTo(3.6f, 4.8f);
        instancePath.lineTo(3.6f, 37.8f);
        instancePath.cubicTo(3.6f, 38.379898f, 4.011338f, 38.863724f, 4.558158f, 38.97562f);
        instancePath.lineTo(4.8f, 39.0f);
        instancePath.lineTo(18.0f, 39.0f);
        instancePath.lineTo(18.0f, 42.6f);
        instancePath.lineTo(4.8f, 42.6f);
        instancePath.cubicTo(2.2963092f, 42.6f, 0.24033065f, 40.683117f, 0.019616032f, 38.236897f);
        instancePath.lineTo(0.0f, 37.8f);
        instancePath.lineTo(0.0f, 4.8f);
        instancePath.cubicTo(0.0f, 2.2963092f, 1.9168845f, 0.24033065f, 4.363102f, 0.019616032f);
        instancePath.lineTo(4.8f, 0.0f);
        instancePath.lineTo(37.8f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
