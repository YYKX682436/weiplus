package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_lucky_money extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 20.0f);
        instancePath.lineTo(0.0f, 20.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.75f, 0.0f, 1.0f, 2.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha(null, 230, 31);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.25f, 7.5520654f);
        instancePath2.cubicTo(5.530878f, 7.5520654f, 4.9479165f, 6.9691043f, 4.9479165f, 6.249982f);
        instancePath2.cubicTo(4.9479165f, 5.53086f, 5.530878f, 4.947899f, 6.25f, 4.947899f);
        instancePath2.cubicTo(6.969122f, 4.947899f, 7.5520835f, 5.53086f, 7.5520835f, 6.249982f);
        instancePath2.cubicTo(7.5520835f, 6.9691043f, 6.969122f, 7.5520654f, 6.25f, 7.5520654f);
        instancePath2.moveTo(12.5f, 0.6333248f);
        instancePath2.cubicTo(12.5f, 0.2835492f, 12.215434f, 5.553739E-13f, 11.880123f, 5.4012903E-13f);
        instancePath2.lineTo(0.6198769f, 2.8182665E-14f);
        instancePath2.cubicTo(0.27752838f, 1.26178085E-14f, 6.6949484E-15f, 0.28062844f, 1.5109221E-14f, 0.6333248f);
        instancePath2.lineTo(2.88658E-14f, 1.2099516f);
        instancePath2.cubicTo(2.88658E-14f, 3.4130023f, 1.9098214f, 5.2700953f, 4.5192857f, 5.850347f);
        instancePath2.cubicTo(4.484643f, 5.990061f, 4.464286f, 6.1353483f, 4.464286f, 6.2858505f);
        instancePath2.cubicTo(4.464286f, 6.345548f, 4.4675f, 6.404526f, 4.473214f, 6.4627852f);
        instancePath2.cubicTo(2.7505357f, 6.193068f, 1.2078571f, 5.538734f, 2.88658E-14f, 4.6206164f);
        instancePath2.lineTo(5.609694E-14f, 15.001827f);
        instancePath2.cubicTo(5.6999734E-14f, 15.345996f, 0.284566f, 15.625f, 0.6198769f, 15.625f);
        instancePath2.lineTo(11.880123f, 15.625f);
        instancePath2.cubicTo(12.222471f, 15.625f, 12.5f, 15.35298f, 12.5f, 15.001827f);
        instancePath2.lineTo(12.5f, 4.6206164f);
        instancePath2.cubicTo(11.292143f, 5.538734f, 9.749464f, 6.193068f, 8.026786f, 6.4627852f);
        instancePath2.cubicTo(8.0325f, 6.404526f, 8.035714f, 6.345548f, 8.035714f, 6.2858505f);
        instancePath2.cubicTo(8.035714f, 6.1353483f, 8.015357f, 5.990061f, 7.9807143f, 5.850347f);
        instancePath2.cubicTo(10.5901785f, 5.2700953f, 12.5f, 3.4130023f, 12.5f, 1.2099516f);
        instancePath2.lineTo(12.5f, 0.6333248f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
