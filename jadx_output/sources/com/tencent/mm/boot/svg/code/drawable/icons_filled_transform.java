package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_transform extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(72.0f, 0.0f);
                instancePath.lineTo(72.0f, 72.0f);
                instancePath.lineTo(0.0f, 72.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 72.0f, 1.0f, -1.8369701E-16f, 6.6130924E-15f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(57.57888f, 13.5f);
                instancePath2.cubicTo(58.738678f, 13.5f, 59.67888f, 14.440202f, 59.67888f, 15.6f);
                instancePath2.cubicTo(59.67888f, 16.19069f, 59.430107f, 16.754065f, 58.993565f, 17.151989f);
                instancePath2.lineTo(38.315105f, 36.0f);
                instancePath2.lineTo(58.993565f, 54.84801f);
                instancePath2.cubicTo(59.850704f, 55.629322f, 59.912174f, 56.957546f, 59.130867f, 57.814686f);
                instancePath2.cubicTo(58.732944f, 58.25123f, 58.169567f, 58.5f, 57.57888f, 58.5f);
                instancePath2.lineTo(14.421122f, 58.5f);
                instancePath2.cubicTo(13.261323f, 58.5f, 12.321121f, 57.5598f, 12.321121f, 56.4f);
                instancePath2.cubicTo(12.321121f, 55.80931f, 12.569893f, 55.245934f, 13.006436f, 54.84801f);
                instancePath2.lineTo(33.68411f, 36.0f);
                instancePath2.lineTo(13.006436f, 17.151989f);
                instancePath2.cubicTo(12.149298f, 16.37068f, 12.087824f, 15.042455f, 12.869133f, 14.185315f);
                instancePath2.cubicTo(13.2670555f, 13.748772f, 13.830432f, 13.5f, 14.421122f, 13.5f);
                instancePath2.lineTo(57.57888f, 13.5f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
