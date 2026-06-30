package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_wcpay_done extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(96.0f, 176.0f);
                instancePath.cubicTo(51.81722f, 176.0f, 16.0f, 140.18279f, 16.0f, 96.0f);
                instancePath.cubicTo(16.0f, 51.81722f, 51.81722f, 16.0f, 96.0f, 16.0f);
                instancePath.cubicTo(140.18279f, 16.0f, 176.0f, 51.81722f, 176.0f, 96.0f);
                instancePath.cubicTo(176.0f, 140.18279f, 140.18279f, 176.0f, 96.0f, 176.0f);
                instancePath.close();
                instancePath.moveTo(86.5875f, 113.11453f);
                instancePath.lineTo(64.460304f, 90.987335f);
                instancePath.lineTo(56.0f, 99.44764f);
                instancePath.lineTo(80.95047f, 124.41615f);
                instancePath.cubicTo(80.94989f, 124.41731f, 80.95018f, 124.4176f, 80.95047f, 124.41789f);
                instancePath.cubicTo(84.07402f, 127.54274f, 89.139336f, 127.54379f, 92.26331f, 124.41937f);
                instancePath.lineTo(139.88225f, 76.82022f);
                instancePath.lineTo(131.38203f, 68.32f);
                instancePath.lineTo(86.5875f, 113.11453f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
