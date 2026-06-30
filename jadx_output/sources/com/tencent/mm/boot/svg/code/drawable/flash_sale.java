package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class flash_sale extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.0744f, 0.0f);
                instancePath.cubicTo(8.641f, 0.0f, 9.9111f, 1.27002f, 9.9111f, 2.83666f);
                instancePath.lineTo(9.9111f, 4.80371f);
                instancePath.lineTo(12.4406f, 4.80371f);
                instancePath.cubicTo(12.9224f, 4.80371f, 13.3216f, 5.17722f, 13.3537f, 5.65789f);
                instancePath.lineTo(14.1467f, 17.9196f);
                instancePath.cubicTo(14.1803f, 18.4238f, 13.7988f, 18.8599f, 13.2946f, 18.8935f);
                instancePath.lineTo(13.2337f, 18.8955f);
                instancePath.lineTo(0.91505f, 18.8955f);
                instancePath.cubicTo(0.40968f, 18.8955f, 0.0f, 18.4858f, 0.0f, 17.9805f);
                instancePath.lineTo(0.79507f, 5.65789f);
                instancePath.cubicTo(0.82712f, 5.17722f, 1.22636f, 4.80371f, 1.7081f, 4.80371f);
                instancePath.lineTo(4.23773f, 4.80371f);
                instancePath.lineTo(4.23773f, 2.83666f);
                instancePath.cubicTo(4.23773f, 1.27002f, 5.5077f, 0.0f, 7.0744f, 0.0f);
                instancePath.close();
                instancePath.moveTo(7.6841f, 8.3568f);
                instancePath.cubicTo(7.41968f, 8.1984f, 7.082117f, 8.255622f, 6.886029f, 8.478092f);
                instancePath.lineTo(6.8262f, 8.5583f);
                instancePath.lineTo(5.0417f, 11.4063f);
                instancePath.lineTo(4.99799f, 11.4889f);
                instancePath.cubicTo(4.839845f, 11.852157f, 5.0793934f, 12.270339f, 5.4787197f, 12.328226f);
                instancePath.lineTo(5.5736f, 12.335f);
                instancePath.lineTo(7.317f, 12.3348f);
                instancePath.lineTo(6.2635f, 14.6503f);
                instancePath.lineTo(6.2161f, 14.7381f);
                instancePath.cubicTo(6.0981f, 15.0082f, 6.1941f, 15.3298f, 6.4559f, 15.4922f);
                instancePath.cubicTo(6.7178f, 15.65465f, 7.056164f, 15.602693f, 7.255864f, 15.383277f);
                instancePath.lineTo(7.317f, 15.304f);
                instancePath.lineTo(9.4276f, 12.0518f);
                instancePath.lineTo(9.473f, 11.9691f);
                instancePath.cubicTo(9.637915f, 11.605286f, 9.399125f, 11.180597f, 8.996591f, 11.121783f);
                instancePath.lineTo(8.9009f, 11.1149f);
                instancePath.lineTo(7.0408f, 11.1147f);
                instancePath.lineTo(7.8901f, 9.1956f);
                instancePath.lineTo(7.936f, 9.1071f);
                instancePath.cubicTo(8.0497f, 8.8353f, 7.9485f, 8.5152f, 7.6841f, 8.3568f);
                instancePath.close();
                instancePath.moveTo(7.0744f, 1.0979f);
                instancePath.cubicTo(6.1599f, 1.0979f, 5.4103f, 1.80393f, 5.341f, 2.70063f);
                instancePath.lineTo(5.3358f, 2.8365f);
                instancePath.lineTo(5.3358f, 4.80371f);
                instancePath.lineTo(8.813f, 4.80371f);
                instancePath.lineTo(8.813f, 2.8365f);
                instancePath.cubicTo(8.813f, 1.92202f, 8.107f, 1.17245f, 7.2103f, 1.10313f);
                instancePath.lineTo(7.0744f, 1.0979f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
