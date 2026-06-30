package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class honey_pay_bank_logo extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(-15616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 0.0f);
        instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
        instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
        instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
        instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.2f, 0.0f, 1.0f, 3.466667f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(21.952038f, 12.523949f);
        instancePath2.cubicTo(24.222239f, 8.749648f, 24.676779f, 5.066351f, 22.907307f, 3.2968793f);
        instancePath2.cubicTo(21.453276f, 1.8428482f, 18.613134f, 1.8441888f, 15.334306f, 3.369651f);
        instancePath2.cubicTo(14.933711f, 3.5560262f, 14.457878f, 3.3823671f, 14.271503f, 2.9817724f);
        instancePath2.cubicTo(14.085128f, 2.5811777f, 14.258787f, 2.1053445f, 14.659382f, 1.9189694f);
        instancePath2.cubicTo(18.480469f, 0.141224f, 22.012726f, 0.13955672f, 24.03868f, 2.1655085f);
        instancePath2.cubicTo(26.496927f, 4.6237583f, 25.918806f, 9.221988f, 23.116028f, 13.687938f);
        instancePath2.lineTo(24.75405f, 15.325959f);
        instancePath2.cubicTo(25.326818f, 15.898728f, 25.326818f, 16.82737f, 24.75405f, 17.400139f);
        instancePath2.lineTo(17.400139f, 24.75405f);
        instancePath2.cubicTo(16.82737f, 25.326818f, 15.898728f, 25.326818f, 15.325959f, 24.75405f);
        instancePath2.lineTo(13.115574f, 22.543665f);
        instancePath2.cubicTo(9.492017f, 24.143118f, 6.058259f, 24.160192f, 4.0511265f, 22.15306f);
        instancePath2.cubicTo(2.647475f, 20.749409f, 2.2076728f, 18.60638f, 2.6895852f, 16.114594f);
        instancePath2.cubicTo(2.7734802f, 15.680804f, 3.1931465f, 15.397159f, 3.626936f, 15.481053f);
        instancePath2.cubicTo(4.0607257f, 15.564948f, 4.3443713f, 15.984614f, 4.260476f, 16.418404f);
        instancePath2.cubicTo(3.8710227f, 18.432123f, 4.201048f, 20.04024f, 5.1824975f, 21.021688f);
        instancePath2.cubicTo(6.5531187f, 22.392311f, 9.072025f, 22.428535f, 11.892057f, 21.320147f);
        instancePath2.lineTo(0.42957672f, 9.857667f);
        instancePath2.cubicTo(-0.14319225f, 9.284898f, -0.14319225f, 8.3562565f, 0.42957672f, 7.7834873f);
        instancePath2.lineTo(7.7834873f, 0.42957672f);
        instancePath2.cubicTo(8.3562565f, -0.14319225f, 9.284898f, -0.14319225f, 9.857667f, 0.42957672f);
        instancePath2.lineTo(21.952038f, 12.523949f);
        instancePath2.lineTo(21.952038f, 12.523949f);
        instancePath2.close();
        instancePath2.moveTo(21.05361f, 13.888261f);
        instancePath2.lineTo(8.820578f, 1.6552285f);
        instancePath2.lineTo(1.6552285f, 8.820578f);
        instancePath2.lineTo(13.443747f, 20.609095f);
        instancePath2.cubicTo(15.178481f, 19.702929f, 16.966202f, 18.399763f, 18.625792f, 16.740173f);
        instancePath2.cubicTo(19.547262f, 15.818703f, 20.358849f, 14.857731f, 21.05361f, 13.888261f);
        instancePath2.lineTo(21.05361f, 13.888261f);
        instancePath2.close();
        instancePath2.moveTo(22.19977f, 15.03442f);
        instancePath2.cubicTo(21.486336f, 16.005684f, 20.669256f, 16.95945f, 19.757162f, 17.871544f);
        instancePath2.cubicTo(18.133266f, 19.49544f, 16.377274f, 20.818161f, 14.625621f, 21.79097f);
        instancePath2.lineTo(16.363049f, 23.528399f);
        instancePath2.lineTo(23.528399f, 16.363049f);
        instancePath2.lineTo(22.19977f, 15.03442f);
        instancePath2.lineTo(22.19977f, 15.03442f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2565928);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(32.0f, 0.0f);
        instancePath3.lineTo(32.0f, 32.0f);
        instancePath3.lineTo(0.0f, 32.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath3, l95.c.instancePaint(instancePaint6, looper));
        canvas.restore();
        canvas.restore();
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.0f, 0.0f);
        instancePath4.lineTo(40.0f, 0.0f);
        instancePath4.lineTo(40.0f, 40.0f);
        instancePath4.lineTo(0.0f, 40.0f);
        instancePath4.lineTo(0.0f, 0.0f);
        instancePath4.close();
        l95.c.done(looper);
        return 0;
    }
}
