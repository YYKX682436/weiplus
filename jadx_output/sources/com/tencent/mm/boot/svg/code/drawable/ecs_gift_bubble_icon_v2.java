package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ecs_gift_bubble_icon_v2 extends l95.c {
    private final int width = 44;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 44;
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
        instancePath.moveTo(24.0f, 0.0f);
        instancePath.lineTo(20.0f, 0.0f);
        instancePath.lineTo(20.0f, 28.841f);
        instancePath.cubicTo(20.6f, 29.4282f, 21.5f, 30.5f, 22.0001f, 31.25f);
        instancePath.cubicTo(22.5039f, 30.5f, 23.4f, 29.4283f, 24.0f, 28.8411f);
        instancePath.lineTo(24.0f, 0.0f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 22.0f, 77.0f, 22.0002f, 3.0f, new int[]{14664596, 1289733012, -2112620, -2112620, 1289733012, 14664596}, new float[]{0.0f, 0.10778f, 0.394648f, 0.651179f, 0.891444f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(24.0f, 46.541f);
        instancePath2.cubicTo(23.4f, 45.8846f, 22.5f, 44.8512f, 21.997f, 44.0f);
        instancePath2.cubicTo(21.5f, 44.8535f, 20.6f, 45.8899f, 20.0f, 46.541f);
        instancePath2.lineTo(20.0f, 80.0f);
        instancePath2.lineTo(24.0f, 80.0f);
        instancePath2.lineTo(24.0f, 46.541f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 22.0f, 77.0f, 22.0002f, 3.0f, new int[]{14664596, 1289733012, -2112620, -2112620, 1289733012, 14664596}, new float[]{0.0f, 0.10778f, 0.394648f, 0.651179f, 0.891444f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint9.setColor(-2112620);
        instancePaint9.setStrokeWidth(3.0f);
        instancePaint9.setStrokeMiter(10.0f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(32.4857f, 26.3818f);
        instancePath3.cubicTo(35.1722f, 26.3818f, 37.6722f, 28.8562f, 37.6722f, 31.9154f);
        instancePath3.cubicTo(37.6722f, 34.9746f, 35.1722f, 37.4489f, 32.4857f, 37.4489f);
        instancePath3.lineTo(21.9971f, 37.4489f);
        instancePath3.cubicTo(24.8313f, 32.5066f, 28.244f, 26.3818f, 32.4857f, 26.3818f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint10.setColor(-2112620);
        instancePaint10.setStrokeWidth(3.0f);
        instancePaint10.setStrokeMiter(10.0f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(11.5156f, 26.3818f);
        instancePath4.cubicTo(8.82916f, 26.3818f, 6.3291f, 28.8562f, 6.3291f, 31.9154f);
        instancePath4.cubicTo(6.3291f, 34.9746f, 8.82916f, 37.4489f, 11.5156f, 37.4489f);
        instancePath4.lineTo(21.9978f, 37.4489f);
        instancePath4.cubicTo(19.17f, 32.5066f, 15.7573f, 26.3818f, 11.5156f, 26.3818f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint10);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint11.setColor(-2112620);
        instancePaint11.setStrokeWidth(3.0f);
        instancePaint11.setStrokeMiter(10.0f);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(21.9971f, 37.4422f);
        instancePath5.cubicTo(25.5897f, 43.9462f, 30.7441f, 49.4219f, 36.9524f, 53.3166f);
        canvas.drawPath(instancePath5, instancePaint11);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint12 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint12.setColor(-2112620);
        instancePaint12.setStrokeWidth(3.0f);
        instancePaint12.setStrokeMiter(10.0f);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(22.0042f, 37.4422f);
        instancePath6.cubicTo(18.4115f, 43.9462f, 13.2572f, 49.4219f, 7.04883f, 53.3166f);
        canvas.drawPath(instancePath6, instancePaint12);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
