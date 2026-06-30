package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_shop_discount_price_bg extends l95.c {
    private final int width = 201;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 201;
        }
        if (i17 == 1) {
            return 32;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(-1.7136293E-14f, 0.0f);
        instancePath.lineTo(201.0f, 0.0f);
        instancePath.lineTo(201.0f, 32.0f);
        instancePath.lineTo(-1.7136293E-14f, 32.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 201.0f, 0.0f, -1.7136293E-14f, 0.0f, 32.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.0f, 1.0f, 1.0f, 1.0f, new int[]{-40634, -33971}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.9945219f, 0.104528464f, -12.793014f, -0.104528464f, 0.9945219f, 22.566837f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(9.992486f, 330.764f);
        instancePath2.lineTo(-1.4669633f, 330.764f);
        instancePath2.cubicTo(-2.4251113f, 319.90546f, -3.0f, 310.31314f, -3.0f, 301.41144f);
        instancePath2.cubicTo(-3.0f, 119.694145f, 153.10147f, -31.903204f, 358.22177f, -63.059124f);
        instancePath2.cubicTo(358.78442f, -64.436295f, 358.78442f, -64.436295f, 359.24298f, -63.059124f);
        instancePath2.cubicTo(383.77155f, -56.26775f, 419.81152f, -20.008703f, 420.76968f, -0.4019586f);
        instancePath2.cubicTo(420.76968f, -0.1333731f, 420.808f, 0.1735818f, 420.808f, 0.44216734f);
        instancePath2.cubicTo(205.83792f, 7.0800667f, 26.85589f, 149.77573f, 9.992486f, 330.764f);
        instancePath2.close();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect(null);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 420.808f, 0.0f, -3.0f, 0.0f, 330.764f, -64.436295f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 0.712871f, 0.14770126f, 0.36606425f, 0.36894768f, new int[]{16777215, 654311423, 16777215}, new float[]{0.0f, 0.5132928f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
