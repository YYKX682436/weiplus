package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_spring2024_comment_normal_light extends l95.c {
    private final int width = 32;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 32;
        }
        if (i17 == 1) {
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
        instancePath2.lineTo(32.0f, 0.0f);
        instancePath2.lineTo(32.0f, 20.0f);
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
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 4.0f);
        instancePath3.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath3.lineTo(28.0f, 0.0f);
        instancePath3.cubicTo(30.209139f, 0.0f, 32.0f, 1.7908609f, 32.0f, 4.0f);
        instancePath3.lineTo(32.0f, 16.0f);
        instancePath3.cubicTo(32.0f, 18.209139f, 30.209139f, 20.0f, 28.0f, 20.0f);
        instancePath3.lineTo(4.0f, 20.0f);
        instancePath3.cubicTo(1.7908609f, 20.0f, 0.0f, 18.209139f, 0.0f, 16.0f);
        instancePath3.lineTo(0.0f, 4.0f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint5, 16.0f, 0.0f, 16.0f, 20.0f, new int[]{-329744, -330522}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-4220842);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(12.0f, 12.0f);
        instancePath4.cubicTo(13.1046f, 12.0f, 14.0f, 11.1046f, 14.0f, 10.0f);
        instancePath4.cubicTo(14.0f, 8.89543f, 13.1046f, 8.0f, 12.0f, 8.0f);
        instancePath4.cubicTo(10.8954f, 8.0f, 10.0f, 8.89543f, 10.0f, 10.0f);
        instancePath4.cubicTo(10.0f, 11.1046f, 10.8954f, 12.0f, 12.0f, 12.0f);
        instancePath4.close();
        instancePath4.moveTo(20.0f, 12.0f);
        instancePath4.cubicTo(21.1046f, 12.0f, 22.0f, 11.1046f, 22.0f, 10.0f);
        instancePath4.cubicTo(22.0f, 8.89543f, 21.1046f, 8.0f, 20.0f, 8.0f);
        instancePath4.cubicTo(18.8954f, 8.0f, 18.0f, 8.89543f, 18.0f, 10.0f);
        instancePath4.cubicTo(18.0f, 11.1046f, 18.8954f, 12.0f, 20.0f, 12.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
