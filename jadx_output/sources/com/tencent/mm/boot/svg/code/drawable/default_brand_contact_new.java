package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_brand_contact_new extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        instancePath2.lineTo(192.0f, 0.0f);
        instancePath2.lineTo(192.0f, 192.0f);
        instancePath2.lineTo(0.0f, 192.0f);
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
        instancePaint5.setColor(-15432210);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(192.0f, 0.0f);
        instancePath3.lineTo(192.0f, 192.0f);
        instancePath3.lineTo(0.0f, 192.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(49.6875f, 59.0944f);
        instancePath4.cubicTo(49.6897f, 56.7201f, 51.9807f, 55.096f, 54.1406f, 55.7858f);
        instancePath4.lineTo(54.5703f, 55.9538f);
        instancePath4.lineTo(73.6562f, 64.9538f);
        instancePath4.cubicTo(85.0429f, 70.3208f, 92.3228f, 81.8621f, 92.3242f, 94.5515f);
        instancePath4.lineTo(92.3242f, 130.536f);
        instancePath4.cubicTo(92.324f, 133.07f, 89.7157f, 134.744f, 87.4414f, 133.673f);
        instancePath4.lineTo(68.3555f, 124.704f);
        instancePath4.cubicTo(56.9671f, 119.337f, 49.6875f, 107.754f, 49.6875f, 95.0632f);
        instancePath4.lineTo(49.6875f, 59.0944f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(137.859f, 55.7858f);
        instancePath5.cubicTo(140.019f, 55.096f, 142.31f, 56.7201f, 142.312f, 59.0944f);
        instancePath5.lineTo(142.312f, 95.0632f);
        instancePath5.cubicTo(142.312f, 107.754f, 135.033f, 119.337f, 123.645f, 124.704f);
        instancePath5.lineTo(104.559f, 133.673f);
        instancePath5.cubicTo(102.284f, 134.744f, 99.676f, 133.07f, 99.6758f, 130.536f);
        instancePath5.lineTo(99.6758f, 94.5515f);
        instancePath5.cubicTo(99.6772f, 81.8621f, 106.957f, 70.3208f, 118.344f, 64.9538f);
        instancePath5.lineTo(137.43f, 55.9538f);
        instancePath5.lineTo(137.859f, 55.7858f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
