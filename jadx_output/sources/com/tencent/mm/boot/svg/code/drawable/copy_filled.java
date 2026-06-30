package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class copy_filled extends l95.c {
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
                instancePath.moveTo(8.0f, 3.61f);
                instancePath.cubicTo(8.0f, 3.04051f, 8.0f, 2.75576f, 8.11259f, 2.53903f);
                instancePath.cubicTo(8.20746f, 2.35638f, 8.35638f, 2.20746f, 8.53903f, 2.11259f);
                instancePath.cubicTo(8.75576f, 2.0f, 9.04051f, 2.0f, 9.61f, 2.0f);
                instancePath.lineTo(18.39f, 2.0f);
                instancePath.cubicTo(18.9595f, 2.0f, 19.2442f, 2.0f, 19.461f, 2.11259f);
                instancePath.cubicTo(19.6436f, 2.20746f, 19.7925f, 2.35638f, 19.8874f, 2.53903f);
                instancePath.cubicTo(20.0f, 2.75576f, 20.0f, 3.04051f, 20.0f, 3.61f);
                instancePath.lineTo(20.0f, 16.39f);
                instancePath.cubicTo(20.0f, 16.9595f, 20.0f, 17.2442f, 19.8874f, 17.461f);
                instancePath.cubicTo(19.7925f, 17.6436f, 19.6436f, 17.7925f, 19.461f, 17.8874f);
                instancePath.cubicTo(19.2442f, 18.0f, 18.9595f, 18.0f, 18.39f, 18.0f);
                instancePath.lineTo(17.0f, 18.0f);
                instancePath.lineTo(17.0f, 6.61f);
                instancePath.cubicTo(17.0f, 6.04051f, 17.0f, 5.75576f, 16.8874f, 5.53903f);
                instancePath.cubicTo(16.7925f, 5.35638f, 16.6436f, 5.20746f, 16.461f, 5.11259f);
                instancePath.cubicTo(16.2442f, 5.0f, 15.9595f, 5.0f, 15.39f, 5.0f);
                instancePath.lineTo(8.0f, 5.0f);
                instancePath.lineTo(8.0f, 3.61f);
                instancePath.close();
                instancePath.moveTo(4.11259f, 6.53903f);
                instancePath.cubicTo(4.0f, 6.75576f, 4.0f, 7.04051f, 4.0f, 7.61f);
                instancePath.lineTo(4.0f, 20.39f);
                instancePath.cubicTo(4.0f, 20.9595f, 4.0f, 21.2442f, 4.11259f, 21.461f);
                instancePath.cubicTo(4.20746f, 21.6436f, 4.35638f, 21.7925f, 4.53903f, 21.8874f);
                instancePath.cubicTo(4.75576f, 22.0f, 5.04051f, 22.0f, 5.61f, 22.0f);
                instancePath.lineTo(14.39f, 22.0f);
                instancePath.cubicTo(14.9595f, 22.0f, 15.2442f, 22.0f, 15.461f, 21.8874f);
                instancePath.cubicTo(15.6436f, 21.7925f, 15.7925f, 21.6436f, 15.8874f, 21.461f);
                instancePath.cubicTo(16.0f, 21.2442f, 16.0f, 20.9595f, 16.0f, 20.39f);
                instancePath.lineTo(16.0f, 7.61f);
                instancePath.cubicTo(16.0f, 7.04051f, 16.0f, 6.75576f, 15.8874f, 6.53903f);
                instancePath.cubicTo(15.7925f, 6.35638f, 15.6436f, 6.20746f, 15.461f, 6.11259f);
                instancePath.cubicTo(15.2442f, 6.0f, 14.9595f, 6.0f, 14.39f, 6.0f);
                instancePath.lineTo(5.61f, 6.0f);
                instancePath.cubicTo(5.04051f, 6.0f, 4.75576f, 6.0f, 4.53903f, 6.11259f);
                instancePath.cubicTo(4.35638f, 6.20746f, 4.20746f, 6.35638f, 4.11259f, 6.53903f);
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
