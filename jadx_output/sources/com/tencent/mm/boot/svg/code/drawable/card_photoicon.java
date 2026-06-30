package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class card_photoicon extends l95.c {
    private final int width = 63;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 63;
        }
        if (i17 == 1) {
            return 48;
        }
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
            instancePaint3.setColor(-5066062);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(2.0f, 0.0f);
            instancePath.lineTo(61.0f, 0.0f);
            instancePath.cubicTo(61.11f, 1.2f, 61.67f, 1.83f, 63.0f, 2.0f);
            instancePath.lineTo(63.0f, 46.0f);
            instancePath.cubicTo(61.8f, 46.1f, 61.18f, 46.66f, 61.0f, 48.0f);
            instancePath.lineTo(2.0f, 48.0f);
            instancePath.cubicTo(1.89f, 46.8f, 1.34f, 46.17f, 0.0f, 46.0f);
            instancePath.lineTo(0.0f, 2.0f);
            instancePath.cubicTo(1.2f, 1.9f, 1.82f, 1.34f, 2.0f, 0.0f);
            instancePath.lineTo(2.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(6.0f, 6.0f);
            instancePath.cubicTo(6.009992f, 14.688017f, 6.0399685f, 23.386019f, 6.0f, 32.0f);
            instancePath.cubicTo(9.807014f, 26.681475f, 14.5433f, 21.658401f, 20.0f, 19.0f);
            instancePath.cubicTo(23.536245f, 16.894972f, 26.683777f, 19.161846f, 29.0f, 21.0f);
            instancePath.cubicTo(33.98805f, 25.31336f, 38.404583f, 30.196625f, 43.0f, 35.0f);
            instancePath.cubicTo(41.642044f, 32.88292f, 40.32308f, 30.815771f, 39.0f, 29.0f);
            instancePath.cubicTo(41.272335f, 26.441805f, 43.51058f, 23.286158f, 47.0f, 23.0f);
            instancePath.cubicTo(51.614223f, 24.234848f, 54.332092f, 28.59883f, 57.0f, 32.0f);
            instancePath.cubicTo(56.96003f, 23.425964f, 56.99001f, 14.707989f, 57.0f, 6.0f);
            instancePath.lineTo(6.0f, 6.0f);
            instancePath.lineTo(6.0f, 6.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
