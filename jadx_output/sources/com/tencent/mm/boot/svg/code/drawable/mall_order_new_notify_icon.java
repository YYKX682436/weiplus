package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mall_order_new_notify_icon extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                instancePaint3.setColor(-1158579);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.68f, 0.0f);
                instancePath.lineTo(16.09f, 0.0f);
                instancePath.cubicTo(23.29f, 0.5f, 29.35f, 6.53f, 30.0f, 13.69f);
                instancePath.lineTo(30.0f, 16.12f);
                instancePath.cubicTo(29.49f, 23.29f, 23.49f, 29.33f, 16.34f, 30.0f);
                instancePath.lineTo(13.89f, 30.0f);
                instancePath.cubicTo(6.7f, 29.49f, 0.65f, 23.47f, 0.0f, 16.32f);
                instancePath.lineTo(0.0f, 13.88f);
                instancePath.cubicTo(0.52f, 6.7f, 6.53f, 0.66f, 13.68f, 0.0f);
                instancePath.lineTo(13.68f, 0.0f);
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
