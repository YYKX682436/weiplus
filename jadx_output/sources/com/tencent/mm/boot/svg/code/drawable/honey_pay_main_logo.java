package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class honey_pay_main_logo extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.89879405f, -0.43837115f, 28.230295f, 0.43837115f, 0.89879405f, -15.78627f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(21.793938f, 18.856665f);
        instancePath.lineTo(90.79637f, 43.881905f);
        instancePath.cubicTo(92.528595f, 44.510136f, 93.42174f, 46.418655f, 92.79126f, 48.144703f);
        instancePath.lineTo(79.09226f, 85.648125f);
        instancePath.cubicTo(78.461784f, 87.374176f, 76.54643f, 88.26413f, 74.8142f, 87.6359f);
        instancePath.lineTo(5.8117714f, 62.61066f);
        instancePath.cubicTo(4.0795445f, 61.982433f, 3.1864014f, 60.073914f, 3.8168805f, 58.347866f);
        instancePath.lineTo(17.515879f, 20.84444f);
        instancePath.cubicTo(18.146358f, 19.118393f, 20.06171f, 18.228436f, 21.793938f, 18.856665f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 76, 31);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-15616);
        instancePaint6.setStrokeWidth(3.0f);
        instancePaint6.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.9975641f, 0.06975647f, -3.3305128f, -0.06975647f, 0.9975641f, 3.923065f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(59.294525f, 21.50847f);
        instancePath2.cubicTo(64.62902f, 18.715134f, 70.33086f, 17.109463f, 76.400024f, 16.691454f);
        instancePath2.cubicTo(85.764915f, 16.630167f, 93.19274f, 19.516296f, 96.61384f, 25.42067f);
        instancePath2.cubicTo(103.76379f, 37.760567f, 90.705086f, 58.61107f, 67.44642f, 71.99156f);
        instancePath2.cubicTo(44.187748f, 85.37206f, 19.536694f, 86.21563f, 12.386744f, 73.87573f);
        instancePath2.cubicTo(11.5345125f, 72.40489f, 10.96939f, 70.81314f, 10.674427f, 69.12753f);
        instancePath2.cubicTo(10.217703f, 65.51224f, 10.431046f, 62.472187f, 11.314454f, 60.00737f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
