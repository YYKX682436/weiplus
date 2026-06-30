package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_question extends l95.c {
    private final int width = 16;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 14;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -201.0f, 0.0f, 1.0f, -672.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 134.0f, 0.0f, 1.0f, 68.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(18.0f, 0.0f);
        instancePath.lineTo(18.0f, 18.0f);
        instancePath.lineTo(0.0f, 18.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-5066062);
        instancePaint5.setColor(-5066062);
        instancePaint5.setStrokeWidth(0.2f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.8642535f, 4.9974422f);
        instancePath2.lineTo(6.21267f, 4.9974422f);
        instancePath2.lineTo(6.21267f, 3.0639386f);
        instancePath2.cubicTo(6.21267f, 2.6062908f, 6.577325f, 2.235294f, 7.027149f, 2.235294f);
        instancePath2.lineTo(15.714932f, 2.235294f);
        instancePath2.cubicTo(16.164757f, 2.235294f, 16.529411f, 2.6062908f, 16.529411f, 3.0639386f);
        instancePath2.lineTo(16.529411f, 9.693094f);
        instancePath2.cubicTo(16.529411f, 10.150743f, 16.164757f, 10.521739f, 15.714932f, 10.521739f);
        instancePath2.lineTo(14.357466f, 10.521739f);
        instancePath2.lineTo(14.357466f, 11.397775f);
        instancePath2.cubicTo(14.357466f, 11.544288f, 14.300259f, 11.684801f, 14.198429f, 11.788402f);
        instancePath2.cubicTo(13.98638f, 12.004139f, 13.64258f, 12.004139f, 13.430531f, 11.788402f);
        instancePath2.lineTo(12.728507f, 11.074169f);
        instancePath2.lineTo(12.728507f, 10.136664f);
        instancePath2.lineTo(13.705882f, 11.131038f);
        instancePath2.lineTo(13.705882f, 9.858824f);
        instancePath2.lineTo(15.714932f, 9.858824f);
        instancePath2.cubicTo(15.804897f, 9.858824f, 15.877828f, 9.784624f, 15.877828f, 9.693094f);
        instancePath2.lineTo(15.877828f, 3.0639386f);
        instancePath2.cubicTo(15.877828f, 2.972409f, 15.804897f, 2.8982098f, 15.714932f, 2.8982098f);
        instancePath2.lineTo(7.027149f, 2.8982098f);
        instancePath2.cubicTo(6.9371843f, 2.8982098f, 6.8642535f, 2.972409f, 6.8642535f, 3.0639386f);
        instancePath2.lineTo(6.8642535f, 4.9974422f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-5066062);
        instancePaint7.setColor(-5066062);
        instancePaint7.setStrokeWidth(0.2f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(5.5445848f, 13.562148f);
        instancePath3.lineTo(11.914027f, 13.562148f);
        instancePath3.cubicTo(12.003992f, 13.562148f, 12.076923f, 13.487949f, 12.076923f, 13.39642f);
        instancePath3.lineTo(12.076923f, 5.826087f);
        instancePath3.cubicTo(12.076923f, 5.7345576f, 12.003992f, 5.660358f, 11.914027f, 5.660358f);
        instancePath3.lineTo(2.2850678f, 5.660358f);
        instancePath3.cubicTo(2.195103f, 5.660358f, 2.1221719f, 5.7345576f, 2.1221719f, 5.826087f);
        instancePath3.lineTo(2.1221719f, 13.39642f);
        instancePath3.cubicTo(2.1221719f, 13.487949f, 2.195103f, 13.562148f, 2.2850678f, 13.562148f);
        instancePath3.lineTo(4.2941175f, 13.562148f);
        instancePath3.lineTo(4.2941175f, 14.834363f);
        instancePath3.lineTo(5.5445848f, 13.562148f);
        instancePath3.close();
        instancePath3.moveTo(4.56947f, 15.491726f);
        instancePath3.cubicTo(4.3574204f, 15.707463f, 4.0136204f, 15.707463f, 3.801571f, 15.491726f);
        instancePath3.cubicTo(3.6997414f, 15.388125f, 3.642534f, 15.247613f, 3.642534f, 15.101099f);
        instancePath3.lineTo(3.642534f, 14.225064f);
        instancePath3.lineTo(2.2850678f, 14.225064f);
        instancePath3.cubicTo(1.8352432f, 14.225064f, 1.4705882f, 13.854067f, 1.4705882f, 13.39642f);
        instancePath3.lineTo(1.4705882f, 5.826087f);
        instancePath3.cubicTo(1.4705882f, 5.368439f, 1.8352432f, 4.9974422f, 2.2850678f, 4.9974422f);
        instancePath3.lineTo(11.914027f, 4.9974422f);
        instancePath3.cubicTo(12.363852f, 4.9974422f, 12.728507f, 5.368439f, 12.728507f, 5.826087f);
        instancePath3.lineTo(12.728507f, 13.39642f);
        instancePath3.cubicTo(12.728507f, 13.854067f, 12.363852f, 14.225064f, 11.914027f, 14.225064f);
        instancePath3.lineTo(5.81448f, 14.225064f);
        instancePath3.lineTo(4.56947f, 15.491726f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
