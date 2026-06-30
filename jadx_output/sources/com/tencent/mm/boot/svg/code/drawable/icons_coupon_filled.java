package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_coupon_filled extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.9993f, 2.66663f);
                instancePath.cubicTo(14.3675f, 2.66663f, 14.666f, 2.9651f, 14.666f, 3.33329f);
                instancePath.lineTo(14.666f, 6.29837f);
                instancePath.cubicTo(13.9297f, 6.29837f, 13.3327f, 6.93512f, 13.3327f, 7.72059f);
                instancePath.cubicTo(13.3327f, 8.50607f, 13.9297f, 9.14282f, 14.666f, 9.14282f);
                instancePath.lineTo(14.666f, 12.6666f);
                instancePath.cubicTo(14.666f, 13.0348f, 14.3675f, 13.3333f, 13.9993f, 13.3333f);
                instancePath.lineTo(1.99998f, 13.3333f);
                instancePath.cubicTo(1.63179f, 13.3333f, 1.33331f, 13.0348f, 1.33331f, 12.6666f);
                instancePath.lineTo(1.33331f, 9.33329f);
                instancePath.cubicTo(2.06969f, 9.33329f, 2.66665f, 8.73634f, 2.66665f, 7.99996f);
                instancePath.cubicTo(2.66665f, 7.26358f, 2.06969f, 6.66663f, 1.33331f, 6.66663f);
                instancePath.lineTo(1.33331f, 3.33329f);
                instancePath.cubicTo(1.33331f, 2.9651f, 1.63179f, 2.66663f, 1.99998f, 2.66663f);
                instancePath.lineTo(13.9993f, 2.66663f);
                instancePath.close();
                instancePath.moveTo(8.71366f, 8.99994f);
                instancePath.lineTo(5.0f, 8.99994f);
                instancePath.lineTo(5.0f, 9.99994f);
                instancePath.lineTo(8.71366f, 9.99994f);
                instancePath.lineTo(8.71366f, 8.99994f);
                instancePath.close();
                instancePath.moveTo(11.0f, 5.99996f);
                instancePath.lineTo(5.0f, 5.99996f);
                instancePath.lineTo(5.0f, 6.99996f);
                instancePath.lineTo(11.0f, 6.99996f);
                instancePath.lineTo(11.0f, 5.99996f);
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
