package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class blue_clock extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 48;
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
                instancePaint3.setColor(-15683841);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(24.0f, 44.0f);
                instancePath.cubicTo(12.9543f, 44.0f, 4.0f, 35.0457f, 4.0f, 24.0f);
                instancePath.cubicTo(4.0f, 12.9543f, 12.9543f, 4.0f, 24.0f, 4.0f);
                instancePath.cubicTo(35.0457f, 4.0f, 44.0f, 12.9543f, 44.0f, 24.0f);
                instancePath.cubicTo(44.0f, 35.0457f, 35.0457f, 44.0f, 24.0f, 44.0f);
                instancePath.close();
                instancePath.moveTo(24.0f, 41.6f);
                instancePath.cubicTo(33.7202f, 41.6f, 41.6f, 33.7202f, 41.6f, 24.0f);
                instancePath.cubicTo(41.6f, 14.2798f, 33.7202f, 6.4f, 24.0f, 6.4f);
                instancePath.cubicTo(14.2798f, 6.4f, 6.4f, 14.2798f, 6.4f, 24.0f);
                instancePath.cubicTo(6.4f, 33.7202f, 14.2798f, 41.6f, 24.0f, 41.6f);
                instancePath.close();
                instancePath.moveTo(22.8f, 12.0f);
                instancePath.lineTo(25.2f, 12.0f);
                instancePath.lineTo(25.2f, 23.0058f);
                instancePath.lineTo(32.9825f, 30.7882f);
                instancePath.lineTo(31.2854f, 32.4853f);
                instancePath.lineTo(22.8001f, 24.0f);
                instancePath.lineTo(22.8f, 24.0f);
                instancePath.lineTo(22.8f, 12.0f);
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
