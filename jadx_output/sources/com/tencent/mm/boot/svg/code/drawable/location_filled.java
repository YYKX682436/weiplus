package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class location_filled extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.166622f, 11.833367f);
                instancePath.lineTo(4.5139213f, 11.833367f);
                instancePath.cubicTo(4.2300906f, 11.833367f, 4.0f, 11.603278f, 4.0f, 11.319449f);
                instancePath.cubicTo(4.0f, 11.117918f, 4.117793f, 10.934987f, 4.3012614f, 10.851594f);
                instancePath.lineTo(19.273418f, 4.0461893f);
                instancePath.cubicTo(19.531809f, 3.928741f, 19.836487f, 4.0429964f, 19.953936f, 4.3013854f);
                instancePath.cubicTo(20.015356f, 4.4365077f, 20.015354f, 4.5915856f, 19.953934f, 4.7267075f);
                instancePath.lineTo(13.148398f, 19.69862f);
                instancePath.cubicTo(13.030948f, 19.957006f, 12.726269f, 20.07126f, 12.467878f, 19.95381f);
                instancePath.cubicTo(12.284413f, 19.870415f, 12.166622f, 19.687485f, 12.166622f, 19.485956f);
                instancePath.lineTo(12.166622f, 11.833367f);
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
