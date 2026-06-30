package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class suoxiao extends l95.c {
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
        instancePaint3.setColor(-855638017);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.25f, 30.75f);
        instancePath.lineTo(15.25f, 45.0f);
        instancePath.lineTo(10.75f, 45.0f);
        instancePath.lineTo(10.749f, 38.431f);
        instancePath.lineTo(4.09099f, 45.090992f);
        instancePath.lineTo(0.90900975f, 41.909008f);
        instancePath.lineTo(7.568f, 35.25f);
        instancePath.lineTo(1.0f, 35.25f);
        instancePath.lineTo(1.0f, 30.75f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 6.123234E-17f, -1.0f, 16.0f, 1.0f, 6.123234E-17f, -0.15900993f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.25f, 0.75f);
        instancePath2.lineTo(15.25f, 15.0f);
        instancePath2.lineTo(10.75f, 15.0f);
        instancePath2.lineTo(10.75f, 8.43f);
        instancePath2.lineTo(4.09099f, 15.09099f);
        instancePath2.lineTo(0.90900975f, 11.90901f);
        instancePath2.lineTo(7.57f, 5.249f);
        instancePath2.lineTo(1.0f, 5.25f);
        instancePath2.lineTo(1.0f, 0.75f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 76.15901f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(45.25f, 30.75f);
        instancePath3.lineTo(45.25f, 45.0f);
        instancePath3.lineTo(40.75f, 45.0f);
        instancePath3.lineTo(40.75f, 38.43f);
        instancePath3.lineTo(34.090992f, 45.090992f);
        instancePath3.lineTo(30.90901f, 41.909008f);
        instancePath3.lineTo(37.568f, 35.25f);
        instancePath3.lineTo(31.0f, 35.25f);
        instancePath3.lineTo(31.0f, 30.75f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -6.123234E-17f, 1.0f, 30.159012f, 1.0f, 6.123234E-17f, -30.159012f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(45.25f, 0.75f);
        instancePath4.lineTo(45.25f, 15.0f);
        instancePath4.lineTo(40.75f, 15.0f);
        instancePath4.lineTo(40.75f, 8.43f);
        instancePath4.lineTo(34.090992f, 15.09099f);
        instancePath4.lineTo(30.90901f, 11.90901f);
        instancePath4.lineTo(37.57f, 5.249f);
        instancePath4.lineTo(31.0f, 5.25f);
        instancePath4.lineTo(31.0f, 0.75f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
