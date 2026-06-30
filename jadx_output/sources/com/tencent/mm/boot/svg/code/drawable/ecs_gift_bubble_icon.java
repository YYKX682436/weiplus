package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ecs_gift_bubble_icon extends l95.c {
    private final int width = 32;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 32;
        }
        if (i17 == 1) {
            return 80;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(17.5f, 0.0f);
        instancePath.lineTo(14.5f, 0.0f);
        instancePath.lineTo(14.5f, 28.841f);
        instancePath.cubicTo(14.95f, 29.4282f, 15.625f, 30.5f, 16.0f, 31.25f);
        instancePath.cubicTo(16.3779f, 30.5f, 17.05f, 29.4283f, 17.5f, 28.8411f);
        instancePath.lineTo(17.5f, 0.0f);
        instancePath.close();
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 16.0f, 77.0f, 16.0003f, 3.0f, new int[]{14664596, 1289733012, -2112620, -2112620, 1289733012, 14664596}, new float[]{0.0f, 0.10778f, 0.394648f, 0.651179f, 0.891444f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.5f, 46.541f);
        instancePath2.cubicTo(17.05f, 45.8846f, 16.375f, 44.8512f, 15.9977f, 44.0f);
        instancePath2.cubicTo(15.625f, 44.8535f, 14.95f, 45.8899f, 14.5f, 46.541f);
        instancePath2.lineTo(14.5f, 80.0f);
        instancePath2.lineTo(17.5f, 80.0f);
        instancePath2.lineTo(17.5f, 46.541f);
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
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 16.0f, 77.0f, 16.0003f, 3.0f, new int[]{14664596, 1289733012, -2112620, -2112620, 1289733012, 14664596}, new float[]{0.0f, 0.10778f, 0.394648f, 0.651179f, 0.891444f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint9.setColor(-2112620);
        instancePaint9.setStrokeWidth(3.0f);
        instancePaint9.setStrokeMiter(10.0f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(25.5325f, 27.6193f);
        instancePath3.cubicTo(27.9747f, 27.6193f, 30.2475f, 29.8687f, 30.2475f, 32.6498f);
        instancePath3.cubicTo(30.2475f, 35.4309f, 27.9747f, 37.6803f, 25.5325f, 37.6803f);
        instancePath3.lineTo(15.9973f, 37.6803f);
        instancePath3.cubicTo(18.5739f, 33.1873f, 21.6763f, 27.6193f, 25.5325f, 27.6193f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint10.setColor(-2112620);
        instancePaint10.setStrokeWidth(3.0f);
        instancePaint10.setStrokeMiter(10.0f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(6.46816f, 27.6193f);
        instancePath4.cubicTo(4.02595f, 27.6193f, 1.75317f, 29.8687f, 1.75317f, 32.6498f);
        instancePath4.cubicTo(1.75317f, 35.4309f, 4.02595f, 37.6803f, 6.46816f, 37.6803f);
        instancePath4.lineTo(15.9975f, 37.6803f);
        instancePath4.cubicTo(13.4267f, 33.1873f, 10.3243f, 27.6193f, 6.46816f, 27.6193f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint10);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint11.setColor(-2112620);
        instancePaint11.setStrokeWidth(3.0f);
        instancePaint11.setStrokeMiter(10.0f);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(15.9973f, 37.6744f);
        instancePath5.cubicTo(19.2633f, 43.5872f, 23.9491f, 48.5651f, 29.5931f, 52.1057f);
        canvas.drawPath(instancePath5, instancePaint11);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint12 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint12.setColor(-2112620);
        instancePaint12.setStrokeWidth(3.0f);
        instancePaint12.setStrokeMiter(10.0f);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(16.0035f, 37.6744f);
        instancePath6.cubicTo(12.7375f, 43.5872f, 8.05168f, 48.5651f, 2.40771f, 52.1057f);
        canvas.drawPath(instancePath6, instancePaint12);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
