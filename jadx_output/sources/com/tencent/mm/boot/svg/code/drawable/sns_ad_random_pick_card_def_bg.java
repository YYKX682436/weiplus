package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_random_pick_card_def_bg extends l95.c {
    private final int width = 103;
    private final int height = 165;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 103;
        }
        if (i17 == 1) {
            return 165;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint4.setStrokeWidth(3.0f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, -1.4584E-4f, 1.00022f, 0.0f, 1.0f, 1.78814E-7f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.49978f, 12.0f);
        instancePath.cubicTo(1.49978f, 6.2010098f, 6.2007895f, 1.5f, 11.99978f, 1.5f);
        instancePath.lineTo(89.99978f, 1.5f);
        instancePath.cubicTo(95.79877f, 1.5f, 100.49978f, 6.2010098f, 100.49978f, 12.0f);
        instancePath.lineTo(100.49978f, 153.0f);
        instancePath.cubicTo(100.49978f, 158.799f, 95.79877f, 163.5f, 89.99978f, 163.5f);
        instancePath.lineTo(11.99978f, 163.5f);
        instancePath.cubicTo(6.2007895f, 163.5f, 1.49978f, 158.799f, 1.49978f, 153.0f);
        instancePath.lineTo(1.49978f, 12.0f);
        instancePath.close();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(looper);
        instancePaint6.setFlags(385);
        instancePaint6.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint5.setColor(-16777216);
        instancePaint6.setStrokeWidth(1.0f);
        instancePaint6.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint6.setStrokeMiter(4.0f);
        instancePaint6.setPathEffect(null);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 51.0f, 0.0f, 51.0f, 165.0f, new int[]{-365726, -2215117}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
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
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint4, 51.0f, 0.0f, 51.0f, 165.0f, new int[]{-3433436, -5712, -3433436}, new float[]{0.0f, 0.322917f, 1.0f}, instanceMatrix, 0);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
