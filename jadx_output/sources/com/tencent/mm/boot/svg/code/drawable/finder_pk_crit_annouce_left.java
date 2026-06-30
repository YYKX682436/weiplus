package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_pk_crit_annouce_left extends l95.c {
    private final int width = 56;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 56;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9176);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(23.1934f, 7.64462f);
        instancePath.cubicTo(23.1436f, 7.21005f, 23.6364f, 6.92552f, 23.9878f, 7.18595f);
        instancePath.lineTo(27.179f, 9.55076f);
        instancePath.cubicTo(27.2809f, 9.62626f, 27.4077f, 9.66023f, 27.5337f, 9.64579f);
        instancePath.lineTo(31.4797f, 9.1934f);
        instancePath.cubicTo(31.9143f, 9.14358f, 32.1988f, 9.6364f, 31.9384f, 9.98784f);
        instancePath.lineTo(29.5736f, 13.179f);
        instancePath.cubicTo(29.4981f, 13.2809f, 29.4641f, 13.4077f, 29.4786f, 13.5337f);
        instancePath.lineTo(29.931f, 17.4797f);
        instancePath.cubicTo(29.9808f, 17.9143f, 29.488f, 18.1988f, 29.1365f, 17.9384f);
        instancePath.lineTo(25.9453f, 15.5736f);
        instancePath.cubicTo(25.8434f, 15.4981f, 25.7167f, 15.4641f, 25.5907f, 15.4786f);
        instancePath.lineTo(21.6446f, 15.931f);
        instancePath.cubicTo(21.21f, 15.9808f, 20.9255f, 15.488f, 21.186f, 15.1365f);
        instancePath.lineTo(23.5508f, 11.9453f);
        instancePath.cubicTo(23.6263f, 11.8434f, 23.6602f, 11.7167f, 23.6458f, 11.5907f);
        instancePath.lineTo(23.1934f, 7.64462f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 204, 31);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(48.6276f, 27.0378f);
        instancePath2.lineTo(50.7205f, 23.8371f);
        instancePath2.cubicTo(48.1667f, 21.2606f, 44.1817f, 18.8994f, 42.0682f, 19.9442f);
        instancePath2.cubicTo(40.0113f, 20.9611f, 38.7668f, 22.6919f, 38.6323f, 23.3491f);
        instancePath2.cubicTo(38.7384f, 23.1654f, 39.4913f, 22.4978f, 40.7668f, 22.6219f);
        instancePath2.cubicTo(43.6813f, 22.8348f, 47.2217f, 25.6545f, 48.6276f, 27.0378f);
        instancePath2.close();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(looper);
        instancePaint6.setFlags(385);
        instancePaint6.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint6.setColor(-16777216);
        instancePaint7.setStrokeWidth(1.0f);
        instancePaint7.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint7.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint7.setStrokeMiter(4.0f);
        instancePaint7.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint5, 49.763f, 20.2637f, 41.6165f, 27.1467f, new int[]{-20589, -31488}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        canvas.saveLayerAlpha(null, 204, 31);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint5, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
