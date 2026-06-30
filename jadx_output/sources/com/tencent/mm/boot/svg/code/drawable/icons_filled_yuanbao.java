package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_yuanbao extends l95.c {
    private final int width = 512;
    private final int height = 512;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 512;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 16.0f, 0.0f, 0.0f, 0.0f, 16.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.11427f, 0.0f, -1.83f, 0.0f, 1.11427f, -1.83f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
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
        l95.c.instancePaint(instancePaint3, looper).setColor(-983041);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(2.0f, 2.0f);
        instancePath2.lineTo(30.0f, 2.0f);
        instancePath2.lineTo(30.0f, 30.0f);
        instancePath2.lineTo(2.0f, 30.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, false);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16724880);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.0f, 30.0f);
        instancePath3.cubicTo(23.731987f, 30.0f, 30.0f, 23.731987f, 30.0f, 15.999999f);
        instancePath3.cubicTo(30.0f, 8.268012f, 23.731985f, 2.0f, 16.0f, 2.0f);
        instancePath3.cubicTo(8.268013f, 2.0f, 2.0f, 8.268014f, 2.0f, 16.0f);
        instancePath3.cubicTo(2.0f, 23.731987f, 8.268015f, 30.0f, 16.0f, 30.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-983041);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(25.2f, 12.03f);
        instancePath4.cubicTo(23.1f, 9.75f, 19.37f, 9.74f, 16.86f, 12.0199995f);
        instancePath4.cubicTo(14.360001f, 14.289999f, 10.630001f, 14.28f, 8.530001f, 11.999999f);
        instancePath4.cubicTo(6.500001f, 9.789999f, 6.750001f, 6.2599993f, 9.050001f, 3.9699993f);
        instancePath4.cubicTo(4.250001f, 8.529999f, 3.6600013f, 15.749999f, 7.790001f, 20.24f);
        instancePath4.cubicTo(11.980001f, 24.8f, 19.44f, 24.81f, 24.45f, 20.27f);
        instancePath4.cubicTo(26.95f, 18.0f, 27.29f, 14.31f, 25.19f, 12.030001f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(14.58f, 16.93f);
        instancePath5.cubicTo(14.58f, 19.03f, 14.16f, 19.43f, 13.22f, 19.43f);
        instancePath5.cubicTo(12.280001f, 19.43f, 11.85f, 19.03f, 11.85f, 16.93f);
        instancePath5.cubicTo(11.85f, 14.83f, 12.27f, 14.43f, 13.22f, 14.43f);
        instancePath5.cubicTo(14.16f, 14.43f, 14.58f, 14.820001f, 14.58f, 16.93f);
        instancePath5.moveTo(19.27f, 19.43f);
        instancePath5.cubicTo(18.988487f, 19.424519f, 18.725761f, 19.287605f, 18.560001f, 19.06f);
        instancePath5.lineTo(17.460001f, 17.49f);
        instancePath5.cubicTo(17.256083f, 17.193651f, 17.248219f, 16.80434f, 17.44f, 16.5f);
        instancePath5.lineTo(18.54f, 14.82f);
        instancePath5.cubicTo(18.82508f, 14.464979f, 19.333897f, 14.3860445f, 19.713139f, 14.638008f);
        instancePath5.cubicTo(20.092382f, 14.889971f, 20.216799f, 15.389615f, 20.0f, 15.79f);
        instancePath5.lineTo(19.23f, 16.97f);
        instancePath5.lineTo(19.99f, 18.05f);
        instancePath5.cubicTo(20.175442f, 18.318567f, 20.197014f, 18.66771f, 20.046047f, 18.957066f);
        instancePath5.cubicTo(19.895079f, 19.24642f, 19.596369f, 19.42846f, 19.27f, 19.429998f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
