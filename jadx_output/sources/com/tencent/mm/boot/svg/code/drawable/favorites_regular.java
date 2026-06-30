package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class favorites_regular extends l95.c {
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
                instancePath.moveTo(11.137f, 2.20843f);
                instancePath.cubicTo(11.6136f, 1.93042f, 12.3867f, 1.93063f, 12.863f, 2.20843f);
                instancePath.lineTo(20.137f, 6.45165f);
                instancePath.cubicTo(20.6136f, 6.72966f, 21.0f, 7.40621f, 21.0f, 7.95232f);
                instancePath.lineTo(21.0f, 16.4578f);
                instancePath.cubicTo(21.0f, 17.0085f, 20.6133f, 17.6806f, 20.137f, 17.9584f);
                instancePath.lineTo(12.863f, 22.2016f);
                instancePath.cubicTo(12.3864f, 22.4797f, 11.6133f, 22.4795f, 11.137f, 22.2016f);
                instancePath.lineTo(3.86296f, 17.9584f);
                instancePath.cubicTo(3.38636f, 17.6804f, 3.0f, 17.0039f, 3.0f, 16.4578f);
                instancePath.lineTo(3.0f, 7.95232f);
                instancePath.cubicTo(3.0f, 7.40154f, 3.38672f, 6.72946f, 3.86296f, 6.45165f);
                instancePath.lineTo(11.137f, 2.20843f);
                instancePath.close();
                instancePath.moveTo(4.2f, 16.4578f);
                instancePath.lineTo(4.2f, 8.39432f);
                instancePath.lineTo(11.4004f, 12.5515f);
                instancePath.lineTo(11.4004f, 20.966f);
                instancePath.lineTo(4.4676f, 16.9219f);
                instancePath.cubicTo(4.36122f, 16.8598f, 4.2f, 16.5789f, 4.2f, 16.4578f);
                instancePath.close();
                instancePath.moveTo(12.0f, 11.512f);
                instancePath.lineTo(19.2524f, 7.32486f);
                instancePath.lineTo(12.2583f, 3.24497f);
                instancePath.cubicTo(12.1556f, 3.18502f, 11.8445f, 3.185f, 11.7417f, 3.24497f);
                instancePath.lineTo(4.74762f, 7.32484f);
                instancePath.lineTo(12.0f, 11.512f);
                instancePath.close();
                instancePath.moveTo(12.6004f, 12.551f);
                instancePath.lineTo(12.6004f, 20.9656f);
                instancePath.lineTo(19.5324f, 16.9219f);
                instancePath.cubicTo(19.6403f, 16.8589f, 19.8f, 16.5813f, 19.8f, 16.4578f);
                instancePath.lineTo(19.8f, 8.39435f);
                instancePath.lineTo(12.6004f, 12.551f);
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
