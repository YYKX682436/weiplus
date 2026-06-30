package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class plus_one_medium extends l95.c {
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
                instancePath.moveTo(11.6301f, 14.5978f);
                instancePath.lineTo(8.30008f, 14.5978f);
                instancePath.lineTo(8.30008f, 17.9278f);
                instancePath.lineTo(6.01408f, 17.9278f);
                instancePath.lineTo(6.01408f, 14.5978f);
                instancePath.lineTo(2.68408f, 14.5978f);
                instancePath.lineTo(2.68408f, 12.3298f);
                instancePath.lineTo(6.01408f, 12.3298f);
                instancePath.lineTo(6.01408f, 8.99977f);
                instancePath.lineTo(8.30008f, 8.99977f);
                instancePath.lineTo(8.30008f, 12.3298f);
                instancePath.lineTo(11.6301f, 12.3298f);
                instancePath.lineTo(11.6301f, 14.5978f);
                instancePath.close();
                instancePath.moveTo(16.9801f, 8.15977f);
                instancePath.lineTo(14.4201f, 9.97977f);
                instancePath.lineTo(13.0001f, 7.89977f);
                instancePath.lineTo(17.2201f, 4.75977f);
                instancePath.lineTo(19.6001f, 4.75977f);
                instancePath.lineTo(19.6001f, 18.9998f);
                instancePath.lineTo(16.9801f, 18.9998f);
                instancePath.lineTo(16.9801f, 8.15977f);
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
