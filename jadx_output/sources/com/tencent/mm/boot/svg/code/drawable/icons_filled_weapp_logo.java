package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_weapp_logo extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(20.0f, 0.0f);
        instancePath2.lineTo(20.0f, 20.0f);
        instancePath2.lineTo(0.0f, 20.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(14.1701f, 10.8256f);
        instancePath3.cubicTo(13.569f, 10.9301f, 12.9583f, 10.561f, 13.2566f, 9.8899f);
        instancePath3.cubicTo(13.4096f, 9.53283f, 13.7549f, 9.25706f, 14.1626f, 9.16649f);
        instancePath3.cubicTo(15.2536f, 8.90316f, 15.9948f, 8.05054f, 15.9948f, 7.05931f);
        instancePath3.cubicTo(15.9948f, 5.85758f, 14.8474f, 4.87827f, 13.4144f, 4.87827f);
        instancePath3.cubicTo(11.9813f, 4.87827f, 10.834f, 5.85758f, 10.834f, 7.05931f);
        instancePath3.lineTo(10.834f, 13.0497f);
        instancePath3.cubicTo(10.834f, 15.1597f, 8.94809f, 16.8591f, 6.62524f, 16.8591f);
        instancePath3.cubicTo(4.30239f, 16.8591f, 2.4165f, 15.1597f, 2.4165f, 13.0497f);
        instancePath3.cubicTo(2.4165f, 11.1997f, 3.87679f, 9.62049f, 5.86645f, 9.32023f);
        instancePath3.cubicTo(6.30637f, 9.25384f, 6.80042f, 9.45149f, 6.80042f, 9.9744f);
        instancePath3.cubicTo(6.80189f, 10.4796f, 6.28588f, 10.8703f, 5.83705f, 10.9825f);
        instancePath3.cubicTo(4.754f, 11.2439f, 4.0049f, 12.0913f, 4.0049f, 13.0497f);
        instancePath3.cubicTo(4.0049f, 14.2515f, 5.15224f, 15.2308f, 6.5853f, 15.2308f);
        instancePath3.cubicTo(8.01836f, 15.2308f, 9.16571f, 14.2515f, 9.16571f, 13.0497f);
        instancePath3.lineTo(9.16571f, 7.05931f);
        instancePath3.cubicTo(9.16571f, 4.94938f, 11.0516f, 3.24994f, 13.3744f, 3.24994f);
        instancePath3.cubicTo(15.6973f, 3.24994f, 17.5832f, 4.94938f, 17.5832f, 7.05931f);
        instancePath3.cubicTo(17.5832f, 8.9192f, 16.1572f, 10.48f, 14.1701f, 10.8256f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
