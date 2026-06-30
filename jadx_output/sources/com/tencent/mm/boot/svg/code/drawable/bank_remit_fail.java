package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bank_remit_fail extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 120;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.instanceMatrix(looper);
                l95.c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-564640);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(115.8f, 60.68889f);
                instancePath.cubicTo(115.8f, 29.181868f, 90.81813f, 4.2f, 59.31111f, 4.2f);
                instancePath.cubicTo(29.181868f, 4.2f, 4.2f, 29.181868f, 4.2f, 60.68889f);
                instancePath.cubicTo(4.2f, 90.81813f, 29.181868f, 115.8f, 59.31111f, 115.8f);
                instancePath.cubicTo(90.81813f, 115.8f, 115.8f, 90.81813f, 115.8f, 60.68889f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(57.790684f, 34.2f);
                instancePath2.lineTo(62.209316f, 34.2f);
                instancePath2.cubicTo(63.301052f, 34.2f, 64.16696f, 35.09441f, 64.12621f, 36.197716f);
                instancePath2.lineTo(62.836727f, 71.10812f);
                instancePath2.cubicTo(62.816696f, 71.650375f, 62.35176f, 72.10244f, 61.798832f, 72.10244f);
                instancePath2.lineTo(58.201168f, 72.10244f);
                instancePath2.cubicTo(57.639423f, 72.10244f, 57.183556f, 71.65727f, 57.163273f, 71.10812f);
                instancePath2.lineTo(55.87379f, 36.197716f);
                instancePath2.cubicTo(55.833225f, 35.099537f, 56.691257f, 34.2f, 57.790684f, 34.2f);
                instancePath2.close();
                instancePath2.moveTo(60.0f, 85.8f);
                instancePath2.cubicTo(57.680405f, 85.8f, 55.8f, 83.91959f, 55.8f, 81.6f);
                instancePath2.cubicTo(55.8f, 79.2804f, 57.680405f, 77.4f, 60.0f, 77.4f);
                instancePath2.cubicTo(62.319595f, 77.4f, 64.2f, 79.2804f, 64.2f, 81.6f);
                instancePath2.cubicTo(64.2f, 83.91959f, 62.319595f, 85.8f, 60.0f, 85.8f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
