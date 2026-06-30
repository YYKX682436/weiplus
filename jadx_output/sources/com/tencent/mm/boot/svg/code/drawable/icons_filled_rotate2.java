package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_rotate2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
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
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(18.0f, 0.0f);
        instancePath2.lineTo(18.0f, 18.0f);
        instancePath2.lineTo(0.0f, 18.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.91888f, 17.9539f);
        instancePath3.lineTo(9.68854f, 19.287f);
        instancePath3.lineTo(8.38951f, 20.037f);
        instancePath3.lineTo(6.34585f, 16.4973f);
        instancePath3.cubicTo(6.2423f, 16.318f, 6.30375f, 16.0886f, 6.48311f, 15.9851f);
        instancePath3.lineTo(10.0228f, 13.9414f);
        instancePath3.lineTo(10.7728f, 15.2404f);
        instancePath3.lineTo(8.96543f, 16.2839f);
        instancePath3.cubicTo(10.9873f, 17.5217f, 13.6656f, 17.2655f, 15.4158f, 15.5154f);
        instancePath3.cubicTo(16.3283f, 14.6028f, 16.8342f, 13.4397f, 16.9347f, 12.2473f);
        instancePath3.lineTo(18.4294f, 12.3733f);
        instancePath3.cubicTo(18.3002f, 13.9056f, 17.6487f, 15.4037f, 16.4764f, 16.576f);
        instancePath3.cubicTo(14.4328f, 18.6196f, 11.4049f, 19.0789f, 8.91888f, 17.9539f);
        instancePath3.close();
        instancePath3.moveTo(15.0364f, 7.71241f);
        instancePath3.cubicTo(13.0145f, 6.47462f, 10.3361f, 6.73079f, 8.58594f, 8.48094f);
        instancePath3.cubicTo(7.67337f, 9.39351f, 7.16752f, 10.5566f, 7.06695f, 11.749f);
        instancePath3.lineTo(5.57225f, 11.623f);
        instancePath3.cubicTo(5.70148f, 10.0907f, 6.35297f, 8.59259f, 7.52528f, 7.42028f);
        instancePath3.cubicTo(9.56892f, 5.37664f, 12.597f, 4.91737f, 15.0831f, 6.04248f);
        instancePath3.lineTo(14.3133f, 4.70927f);
        instancePath3.lineTo(15.6124f, 3.95927f);
        instancePath3.lineTo(17.656f, 7.49898f);
        instancePath3.cubicTo(17.7596f, 7.67834f, 17.6981f, 7.90769f, 17.5188f, 8.01124f);
        instancePath3.lineTo(13.9791f, 10.0549f);
        instancePath3.lineTo(13.2291f, 8.75586f);
        instancePath3.lineTo(15.0364f, 7.71241f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(13.5f, 12.0f);
        instancePath4.cubicTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f);
        instancePath4.cubicTo(11.1716f, 13.5f, 10.5f, 12.8284f, 10.5f, 12.0f);
        instancePath4.cubicTo(10.5f, 11.1716f, 11.1716f, 10.5f, 12.0f, 10.5f);
        instancePath4.cubicTo(12.8284f, 10.5f, 13.5f, 11.1716f, 13.5f, 12.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
