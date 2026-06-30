package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class info extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                canvas.saveLayerAlpha(null, 140, 31);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.333333f, 0.0f, 1.0f, 1.333333f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(6.6666665f, 0.0f);
                instancePath.cubicTo(10.348565f, 0.0f, 13.333333f, 2.9847684f, 13.333333f, 6.6666665f);
                instancePath.cubicTo(13.333333f, 10.348565f, 10.348565f, 13.333333f, 6.6666665f, 13.333333f);
                instancePath.cubicTo(2.9847684f, 13.333333f, 0.0f, 10.348565f, 0.0f, 6.6666665f);
                instancePath.cubicTo(0.0f, 2.9847684f, 2.9847684f, 0.0f, 6.6666665f, 0.0f);
                instancePath.close();
                instancePath.moveTo(6.6666665f, 0.8f);
                instancePath.cubicTo(3.4265962f, 0.8f, 0.8f, 3.4265962f, 0.8f, 6.6666665f);
                instancePath.cubicTo(0.8f, 9.906737f, 3.4265962f, 12.533333f, 6.6666665f, 12.533333f);
                instancePath.cubicTo(9.906737f, 12.533333f, 12.533333f, 9.906737f, 12.533333f, 6.6666665f);
                instancePath.cubicTo(12.533333f, 3.4265962f, 9.906737f, 0.8f, 6.6666665f, 0.8f);
                instancePath.close();
                instancePath.moveTo(7.0666666f, 5.3333335f);
                instancePath.lineTo(7.0666666f, 10.0f);
                instancePath.lineTo(6.2666664f, 10.0f);
                instancePath.lineTo(6.2666664f, 5.3333335f);
                instancePath.lineTo(7.0666666f, 5.3333335f);
                instancePath.close();
                instancePath.moveTo(6.6666665f, 3.3333333f);
                instancePath.cubicTo(7.0348563f, 3.3333333f, 7.3333335f, 3.6318102f, 7.3333335f, 4.0f);
                instancePath.cubicTo(7.3333335f, 4.36819f, 7.0348563f, 4.6666665f, 6.6666665f, 4.6666665f);
                instancePath.cubicTo(6.2984767f, 4.6666665f, 6.0f, 4.36819f, 6.0f, 4.0f);
                instancePath.cubicTo(6.0f, 3.6318102f, 6.2984767f, 3.3333333f, 6.6666665f, 3.3333333f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
