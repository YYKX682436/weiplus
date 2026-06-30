package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bluetooth_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16268960);
        instancePaint6.setColor(-16268960);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.058f, 3.15895f);
        instancePath3.lineTo(16.3429f, 7.44094f);
        instancePath3.cubicTo(16.763f, 7.86016f, 16.7632f, 8.54056f, 16.3437f, 8.96035f);
        instancePath3.cubicTo(16.3441f, 8.96055f, 16.3436f, 8.96045f, 16.3437f, 8.96035f);
        instancePath3.lineTo(13.3036f, 11.9996f);
        instancePath3.lineTo(16.3431f, 15.0392f);
        instancePath3.cubicTo(16.7627f, 15.4589f, 16.7628f, 16.1393f, 16.3432f, 16.559f);
        instancePath3.lineTo(12.0582f, 20.8443f);
        instancePath3.cubicTo(11.8484f, 21.0542f, 11.5082f, 21.0542f, 11.2983f, 20.8444f);
        instancePath3.cubicTo(11.1975f, 20.7436f, 11.1409f, 20.6069f, 11.1409f, 20.4644f);
        instancePath3.lineTo(11.1409f, 14.1622f);
        instancePath3.lineTo(7.6048f, 17.6987f);
        instancePath3.lineTo(6.33838f, 16.4323f);
        instancePath3.lineTo(10.7702f, 11.9996f);
        instancePath3.lineTo(6.33838f, 7.56732f);
        instancePath3.lineTo(7.6048f, 6.3009f);
        instancePath3.lineTo(11.1409f, 9.83696f);
        instancePath3.lineTo(11.1409f, 3.53901f);
        instancePath3.cubicTo(11.1409f, 3.24227f, 11.3815f, 3.00171f, 11.6782f, 3.00171f);
        instancePath3.cubicTo(11.8207f, 3.00171f, 11.9573f, 3.05827f, 12.058f, 3.15895f);
        instancePath3.close();
        instancePath3.moveTo(12.9319f, 14.1613f);
        instancePath3.lineTo(12.9319f, 17.4379f);
        instancePath3.lineTo(14.5707f, 15.7992f);
        instancePath3.lineTo(12.9319f, 14.1613f);
        instancePath3.close();
        instancePath3.moveTo(12.9319f, 6.56571f);
        instancePath3.lineTo(12.9319f, 9.83786f);
        instancePath3.lineTo(14.568f, 8.20178f);
        instancePath3.lineTo(12.9319f, 6.56571f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
