package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_keyboard extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 28;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-983041);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.0f, 2.6666667f);
                instancePath.cubicTo(23.363796f, 2.6666667f, 29.333332f, 8.636204f, 29.333332f, 16.0f);
                instancePath.cubicTo(29.333332f, 23.363796f, 23.363796f, 29.333332f, 15.999999f, 29.333332f);
                instancePath.cubicTo(8.636202f, 29.333332f, 2.666666f, 23.363796f, 2.666666f, 15.999999f);
                instancePath.cubicTo(2.666666f, 8.636202f, 8.636203f, 2.666666f, 15.999999f, 2.666666f);
                instancePath.close();
                instancePath.moveTo(20.0f, 20.0f);
                instancePath.lineTo(12.0f, 20.0f);
                instancePath.lineTo(12.0f, 22.666666f);
                instancePath.lineTo(20.0f, 22.666666f);
                instancePath.close();
                instancePath.moveTo(11.333333f, 14.666666f);
                instancePath.lineTo(8.666666f, 14.666666f);
                instancePath.lineTo(8.666666f, 17.333332f);
                instancePath.lineTo(11.333333f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(15.333333f, 14.666666f);
                instancePath.lineTo(12.666666f, 14.666666f);
                instancePath.lineTo(12.666666f, 17.333332f);
                instancePath.lineTo(15.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(19.333332f, 14.666666f);
                instancePath.lineTo(16.666666f, 14.666666f);
                instancePath.lineTo(16.666666f, 17.333332f);
                instancePath.lineTo(19.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(23.333332f, 14.666666f);
                instancePath.lineTo(20.666666f, 14.666666f);
                instancePath.lineTo(20.666666f, 17.333332f);
                instancePath.lineTo(23.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(11.333332f, 10.666666f);
                instancePath.lineTo(8.666665f, 10.666666f);
                instancePath.lineTo(8.666665f, 13.333332f);
                instancePath.lineTo(11.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(15.333332f, 10.666666f);
                instancePath.lineTo(12.666666f, 10.666666f);
                instancePath.lineTo(12.666666f, 13.333332f);
                instancePath.lineTo(15.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(19.333332f, 10.666666f);
                instancePath.lineTo(16.666666f, 10.666666f);
                instancePath.lineTo(16.666666f, 13.333332f);
                instancePath.lineTo(19.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(23.333332f, 10.666666f);
                instancePath.lineTo(20.666666f, 10.666666f);
                instancePath.lineTo(20.666666f, 13.333332f);
                instancePath.lineTo(23.333332f, 13.333332f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
