package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class guide_ic_01 extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.saveLayerAlpha(null, 38, 31);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -79.0f, 0.0f, 1.0f, -610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 79.0f, 0.0f, 1.0f, 610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(24.0f, 4.0f);
        instancePath.cubicTo(35.045696f, 4.0f, 44.0f, 12.954305f, 44.0f, 24.0f);
        instancePath.cubicTo(44.0f, 35.045696f, 35.045696f, 44.0f, 24.0f, 44.0f);
        instancePath.cubicTo(12.954305f, 44.0f, 4.0f, 35.045696f, 4.0f, 24.0f);
        instancePath.cubicTo(4.0f, 12.954305f, 12.954305f, 4.0f, 24.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(24.0f, 6.4f);
        instancePath.cubicTo(14.279788f, 6.4f, 6.4f, 14.279788f, 6.4f, 24.0f);
        instancePath.cubicTo(6.4f, 33.72021f, 14.279788f, 41.6f, 24.0f, 41.6f);
        instancePath.cubicTo(33.72021f, 41.6f, 41.6f, 33.72021f, 41.6f, 24.0f);
        instancePath.cubicTo(41.6f, 14.279788f, 33.72021f, 6.4f, 24.0f, 6.4f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(2.4f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(26.8f, 22.0f);
        instancePath2.cubicTo(26.8f, 18.907206f, 29.307203f, 16.4f, 32.399998f, 16.4f);
        instancePath2.lineTo(33.2f, 16.4f);
        instancePath2.cubicTo(36.292797f, 16.4f, 38.8f, 18.907206f, 38.8f, 22.0f);
        instancePath2.lineTo(38.8f, 21.999998f);
        instancePath2.cubicTo(38.8f, 25.092793f, 36.292797f, 27.599998f, 33.2f, 27.599998f);
        instancePath2.lineTo(32.399998f, 27.599998f);
        instancePath2.cubicTo(29.307203f, 27.599998f, 26.8f, 25.092793f, 26.8f, 21.999998f);
        instancePath2.lineTo(26.8f, 22.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(2.4f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.2f, 22.0f);
        instancePath3.cubicTo(9.2f, 18.907206f, 11.707205f, 16.4f, 14.799999f, 16.4f);
        instancePath3.lineTo(15.6f, 16.4f);
        instancePath3.cubicTo(18.692795f, 16.4f, 21.2f, 18.907206f, 21.2f, 22.0f);
        instancePath3.lineTo(21.2f, 21.999998f);
        instancePath3.cubicTo(21.2f, 25.092793f, 18.692795f, 27.599998f, 15.6f, 27.599998f);
        instancePath3.lineTo(14.799999f, 27.599998f);
        instancePath3.cubicTo(11.707205f, 27.599998f, 9.2f, 25.092793f, 9.2f, 21.999998f);
        instancePath3.lineTo(9.2f, 22.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(2.4f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(26.8f, 22.8f);
        instancePath4.cubicTo(26.8f, 21.253603f, 25.546398f, 20.0f, 24.0f, 20.0f);
        instancePath4.cubicTo(22.453602f, 20.0f, 21.2f, 21.253603f, 21.2f, 22.8f);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
