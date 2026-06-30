package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ic_filled_bell extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -16.0f, 0.0f, 1.0f, -172.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 88.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 72.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-526345);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(44.0f, 0.0f);
        instancePath.cubicTo(46.20914f, 0.0f, 48.0f, 1.7908609f, 48.0f, 4.0f);
        instancePath.lineTo(48.0f, 44.0f);
        instancePath.cubicTo(48.0f, 46.20914f, 46.20914f, 48.0f, 44.0f, 48.0f);
        instancePath.lineTo(4.0f, 48.0f);
        instancePath.cubicTo(1.7908609f, 48.0f, 0.0f, 46.20914f, 0.0f, 44.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15683841);
        float[] matrixFloatArray6 = l95.c.setMatrixFloatArray(matrixFloatArray5, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray6);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.75f, 26.5f);
        instancePath2.lineTo(7.483383f, 26.5f);
        instancePath2.cubicTo(7.217157f, 26.5f, 6.957885f, 26.414997f, 6.7433343f, 26.257376f);
        instancePath2.cubicTo(6.1870003f, 25.848658f, 6.0673337f, 25.06633f, 6.476052f, 24.509995f);
        instancePath2.lineTo(6.476016f, 24.50997f);
        instancePath2.cubicTo(7.825339f, 22.673313f, 8.5f, 20.836657f, 8.5f, 19.0f);
        instancePath2.lineTo(8.5f, 14.0f);
        instancePath2.cubicTo(8.5f, 10.72167f, 10.60339f, 7.934613f, 13.5342455f, 6.914754f);
        instancePath2.cubicTo(13.511722f, 6.7798533f, 13.5f, 6.6412954f, 13.5f, 6.5f);
        instancePath2.cubicTo(13.5f, 5.119288f, 14.619288f, 4.0f, 16.0f, 4.0f);
        instancePath2.cubicTo(17.380713f, 4.0f, 18.5f, 5.119288f, 18.5f, 6.5f);
        instancePath2.cubicTo(18.5f, 6.6412954f, 18.488277f, 6.7798533f, 18.465754f, 6.914754f);
        instancePath2.cubicTo(21.39661f, 7.934613f, 23.5f, 10.72167f, 23.5f, 14.0f);
        instancePath2.lineTo(23.5f, 19.0f);
        instancePath2.cubicTo(23.5f, 20.836636f, 24.174646f, 22.673273f, 25.52394f, 24.509909f);
        instancePath2.cubicTo(25.68157f, 24.724472f, 25.766575f, 24.983759f, 25.766575f, 25.25f);
        instancePath2.cubicTo(25.766575f, 25.940376f, 25.206917f, 26.500036f, 24.51654f, 26.500036f);
        instancePath2.lineTo(17.25f, 26.5f);
        instancePath2.lineTo(17.25f, 26.75f);
        instancePath2.cubicTo(17.25f, 27.440355f, 16.690355f, 28.0f, 16.0f, 28.0f);
        instancePath2.cubicTo(15.309644f, 28.0f, 14.75f, 27.440355f, 14.75f, 26.75f);
        instancePath2.lineTo(14.75f, 26.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
