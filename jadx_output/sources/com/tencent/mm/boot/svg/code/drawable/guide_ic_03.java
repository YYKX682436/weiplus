package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class guide_ic_03 extends l95.c {
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
        canvas.saveLayerAlpha(null, 38, 31);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -287.0f, 0.0f, 1.0f, -610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 287.0f, 0.0f, 1.0f, 610.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(24.0f, 4.0f);
        instancePath2.cubicTo(35.045696f, 4.0f, 44.0f, 12.954305f, 44.0f, 24.0f);
        instancePath2.cubicTo(44.0f, 35.045696f, 35.045696f, 44.0f, 24.0f, 44.0f);
        instancePath2.cubicTo(12.954305f, 44.0f, 4.0f, 35.045696f, 4.0f, 24.0f);
        instancePath2.cubicTo(4.0f, 12.954305f, 12.954305f, 4.0f, 24.0f, 4.0f);
        instancePath2.close();
        instancePath2.moveTo(24.0f, 6.4f);
        instancePath2.cubicTo(14.279788f, 6.4f, 6.4f, 14.279788f, 6.4f, 24.0f);
        instancePath2.cubicTo(6.4f, 33.72021f, 14.279788f, 41.6f, 24.0f, 41.6f);
        instancePath2.cubicTo(33.72021f, 41.6f, 41.6f, 33.72021f, 41.6f, 24.0f);
        instancePath2.cubicTo(41.6f, 14.279788f, 33.72021f, 6.4f, 24.0f, 6.4f);
        instancePath2.close();
        instancePath2.moveTo(24.433197f, 22.980652f);
        instancePath2.cubicTo(26.967815f, 22.980652f, 29.414766f, 23.60272f, 31.600103f, 24.773226f);
        instancePath2.lineTo(31.817759f, 24.892101f);
        instancePath2.lineTo(30.650215f, 26.988966f);
        instancePath2.cubicTo(28.765032f, 25.939287f, 26.64102f, 25.380651f, 24.433197f, 25.380651f);
        instancePath2.cubicTo(22.158596f, 25.380651f, 19.973698f, 25.973795f, 18.049559f, 27.083376f);
        instancePath2.lineTo(17.851448f, 27.2f);
        instancePath2.lineTo(16.615438f, 25.14275f);
        instancePath2.cubicTo(18.957834f, 23.735424f, 21.64163f, 22.980652f, 24.433197f, 22.980652f);
        instancePath2.close();
        instancePath2.moveTo(17.0f, 11.8f);
        instancePath2.cubicTo(18.656855f, 11.8f, 20.0f, 13.143146f, 20.0f, 14.8f);
        instancePath2.cubicTo(20.0f, 16.456854f, 18.656855f, 17.8f, 17.0f, 17.8f);
        instancePath2.cubicTo(15.343145f, 17.8f, 14.0f, 16.456854f, 14.0f, 14.8f);
        instancePath2.cubicTo(14.0f, 13.143146f, 15.343145f, 11.8f, 17.0f, 11.8f);
        instancePath2.close();
        instancePath2.moveTo(31.0f, 11.8f);
        instancePath2.cubicTo(32.656853f, 11.8f, 34.0f, 13.143146f, 34.0f, 14.8f);
        instancePath2.cubicTo(34.0f, 16.456854f, 32.656853f, 17.8f, 31.0f, 17.8f);
        instancePath2.cubicTo(29.343145f, 17.8f, 28.0f, 16.456854f, 28.0f, 14.8f);
        instancePath2.cubicTo(28.0f, 13.143146f, 29.343145f, 11.8f, 31.0f, 11.8f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
