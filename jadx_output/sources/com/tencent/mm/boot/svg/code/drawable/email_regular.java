package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class email_regular extends l95.c {
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
                instancePath.moveTo(3.0f, 4.0f);
                instancePath.lineTo(21.0f, 4.0f);
                instancePath.cubicTo(21.5523f, 4.0f, 22.0f, 4.44772f, 22.0f, 5.0f);
                instancePath.lineTo(22.0f, 19.0f);
                instancePath.cubicTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
                instancePath.lineTo(3.0f, 20.0f);
                instancePath.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                instancePath.lineTo(2.0f, 5.0f);
                instancePath.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
                instancePath.close();
                instancePath.moveTo(3.2f, 5.95012f);
                instancePath.lineTo(3.2f, 18.8f);
                instancePath.lineTo(20.8f, 18.8f);
                instancePath.lineTo(20.8f, 5.94988f);
                instancePath.lineTo(12.9598f, 11.83f);
                instancePath.cubicTo(12.391f, 12.2567f, 11.6087f, 12.2567f, 11.0398f, 11.83f);
                instancePath.lineTo(3.2f, 5.95012f);
                instancePath.close();
                instancePath.moveTo(4.19984f, 5.2f);
                instancePath.lineTo(11.7598f, 10.87f);
                instancePath.cubicTo(11.9021f, 10.9767f, 12.0976f, 10.9767f, 12.2398f, 10.87f);
                instancePath.lineTo(19.7998f, 5.2f);
                instancePath.lineTo(4.19984f, 5.2f);
                instancePath.close();
                instancePath.moveTo(20.7998f, 5.2f);
                instancePath.lineTo(20.8f, 5.20021f);
                instancePath.lineTo(20.8f, 5.2f);
                instancePath.lineTo(20.7998f, 5.2f);
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
