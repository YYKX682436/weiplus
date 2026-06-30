package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class appbrand_taskbar_load_progress extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePath2.lineTo(12.0f, 0.0f);
        instancePath2.lineTo(12.0f, 12.0f);
        instancePath2.lineTo(0.0f, 12.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(14.0f, 8.0f);
        instancePath3.cubicTo(14.0f, 11.3137f, 11.3137f, 14.0f, 8.0f, 14.0f);
        instancePath3.lineTo(8.0f, 12.95f);
        instancePath3.cubicTo(10.7338f, 12.95f, 12.95f, 10.7338f, 12.95f, 8.0f);
        instancePath3.cubicTo(12.95f, 5.26619f, 10.7338f, 3.05f, 8.0f, 3.05f);
        instancePath3.lineTo(8.0f, 2.0f);
        instancePath3.cubicTo(11.3137f, 2.0f, 14.0f, 4.68629f, 14.0f, 8.0f);
        instancePath3.close();
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
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint5, 8.0f, 3.05f, 8.0f, 12.875f, new int[]{6316128, 1281384544}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(8.0f, 12.95f);
        instancePath4.lineTo(8.0f, 14.0f);
        instancePath4.cubicTo(4.68629f, 14.0f, 2.0f, 11.3137f, 2.0f, 8.0f);
        instancePath4.cubicTo(2.0f, 4.68629f, 4.68629f, 2.0f, 8.0f, 2.0f);
        instancePath4.cubicTo(8.28995f, 2.0f, 8.525f, 2.23505f, 8.525f, 2.525f);
        instancePath4.cubicTo(8.525f, 2.81495f, 8.28995f, 3.05f, 8.0f, 3.05f);
        instancePath4.cubicTo(5.26619f, 3.05f, 3.05f, 5.26619f, 3.05f, 8.0f);
        instancePath4.cubicTo(3.05f, 10.7338f, 5.26619f, 12.95f, 8.0f, 12.95f);
        instancePath4.close();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(looper);
        instancePaint9.setFlags(385);
        instancePaint9.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(looper);
        instancePaint10.setFlags(385);
        instancePaint10.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint9.setColor(-16777216);
        instancePaint10.setStrokeWidth(1.0f);
        instancePaint10.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint10.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint10.setStrokeMiter(4.0f);
        instancePaint10.setPathEffect(null);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint8, 8.0f, 3.05f, 8.0f, 12.95f, new int[]{-10461088, 1281384544}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
