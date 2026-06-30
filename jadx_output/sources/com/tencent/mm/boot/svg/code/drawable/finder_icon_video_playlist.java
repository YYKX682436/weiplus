package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icon_video_playlist extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1946157056);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.666667f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.666667f, 1.6666666f);
        instancePath.cubicTo(11.403047f, 1.6666666f, 12.0f, 2.2636204f, 12.0f, 3.0f);
        instancePath.lineTo(12.0f, 11.666667f);
        instancePath.cubicTo(12.0f, 12.403047f, 11.403047f, 13.0f, 10.666667f, 13.0f);
        instancePath.lineTo(1.3333334f, 13.0f);
        instancePath.cubicTo(0.5969537f, 13.0f, 0.0f, 12.403047f, 0.0f, 11.666667f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(0.0f, 2.2636204f, 0.5969537f, 1.6666666f, 1.3333334f, 1.6666666f);
        instancePath.lineTo(10.666667f, 1.6666666f);
        instancePath.close();
        instancePath.moveTo(10.666667f, 2.4666667f);
        instancePath.lineTo(1.3333334f, 2.4666667f);
        instancePath.cubicTo(1.0614393f, 2.4666667f, 0.83706564f, 2.6701255f, 0.8041554f, 2.9330997f);
        instancePath.lineTo(0.8f, 3.0f);
        instancePath.lineTo(0.8f, 11.666667f);
        instancePath.cubicTo(0.8f, 11.9385605f, 1.0034587f, 12.162934f, 1.2664331f, 12.195845f);
        instancePath.lineTo(1.3333334f, 12.2f);
        instancePath.lineTo(10.666667f, 12.2f);
        instancePath.cubicTo(10.9385605f, 12.2f, 11.162934f, 11.996541f, 11.195845f, 11.733567f);
        instancePath.lineTo(11.2f, 11.666667f);
        instancePath.lineTo(11.2f, 3.0f);
        instancePath.cubicTo(11.2f, 2.728106f, 10.996541f, 2.5037322f, 10.733567f, 2.470822f);
        instancePath.lineTo(10.666667f, 2.4666667f);
        instancePath.close();
        instancePath.moveTo(5.0f, 4.9561725f);
        instancePath.cubicTo(5.0658083f, 4.9561725f, 5.130144f, 4.9756517f, 5.1849003f, 5.0121555f);
        instancePath.lineTo(8.250642f, 7.055983f);
        instancePath.cubicTo(8.403818f, 7.1581006f, 8.4452095f, 7.365057f, 8.343092f, 7.5182333f);
        instancePath.cubicTo(8.31868f, 7.554851f, 8.287259f, 7.586272f, 8.250642f, 7.6106834f);
        instancePath.lineTo(5.1849003f, 9.654511f);
        instancePath.cubicTo(5.031724f, 9.756629f, 4.8247676f, 9.715238f, 4.72265f, 9.562061f);
        instancePath.cubicTo(4.686146f, 9.507305f, 4.6666665f, 9.442969f, 4.6666665f, 9.377161f);
        instancePath.lineTo(4.6666665f, 5.2895055f);
        instancePath.cubicTo(4.6666665f, 5.1054106f, 4.815905f, 4.9561725f, 5.0f, 4.9561725f);
        instancePath.close();
        instancePath.moveTo(10.266666f, 4.440892E-16f);
        instancePath.cubicTo(10.48758f, 4.440892E-16f, 10.666667f, 0.1790861f, 10.666667f, 0.4f);
        instancePath.cubicTo(10.666667f, 0.6209139f, 10.48758f, 0.8f, 10.266666f, 0.8f);
        instancePath.lineTo(1.7333333f, 0.8f);
        instancePath.cubicTo(1.5124195f, 0.8f, 1.3333334f, 0.6209139f, 1.3333334f, 0.4f);
        instancePath.cubicTo(1.3333334f, 0.1790861f, 1.5124195f, 4.440892E-16f, 1.7333333f, 4.440892E-16f);
        instancePath.lineTo(10.266666f, 4.440892E-16f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
