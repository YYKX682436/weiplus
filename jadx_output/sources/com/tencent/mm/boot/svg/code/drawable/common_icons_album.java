package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class common_icons_album extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(17.538166f, 8.3f);
                instancePath2.cubicTo(17.990835f, 8.3f, 18.375f, 8.675888f, 18.375f, 9.13957f);
                instancePath2.lineTo(18.375f, 19.96043f);
                instancePath2.cubicTo(18.375f, 20.4259f, 18.000338f, 20.8f, 17.538166f, 20.8f);
                instancePath2.lineTo(2.336834f, 20.8f);
                instancePath2.cubicTo(1.8841641f, 20.8f, 1.5f, 20.424112f, 1.5f, 19.96043f);
                instancePath2.lineTo(1.5f, 9.13957f);
                instancePath2.cubicTo(1.5f, 8.6741f, 1.8746632f, 8.3f, 2.336834f, 8.3f);
                instancePath2.lineTo(17.538166f, 8.3f);
                instancePath2.close();
                instancePath2.moveTo(21.1875f, 4.5f);
                instancePath2.cubicTo(21.739784f, 4.5f, 22.1875f, 4.9477153f, 22.1875f, 5.5f);
                instancePath2.lineTo(22.1875f, 16.25f);
                instancePath2.cubicTo(22.1875f, 16.802284f, 21.739784f, 17.25f, 21.1875f, 17.25f);
                instancePath2.lineTo(19.6875f, 17.25f);
                instancePath2.lineTo(19.6875f, 8.5f);
                instancePath2.cubicTo(19.6875f, 7.6715727f, 19.015926f, 7.0f, 18.1875f, 7.0f);
                instancePath2.lineTo(4.6875f, 7.0f);
                instancePath2.lineTo(4.6875f, 5.5f);
                instancePath2.cubicTo(4.6875f, 4.9477153f, 5.1352153f, 4.5f, 5.6875f, 4.5f);
                instancePath2.lineTo(21.1875f, 4.5f);
                instancePath2.close();
                instancePath2.moveTo(17.109375f, 9.471875f);
                instancePath2.lineTo(2.765625f, 9.471875f);
                instancePath2.lineTo(2.765f, 15.995f);
                instancePath2.lineTo(6.730613f, 13.025983f);
                instancePath2.cubicTo(7.120893f, 12.733738f, 7.747653f, 12.747911f, 8.123856f, 13.053971f);
                instancePath2.lineTo(11.900841f, 16.12674f);
                instancePath2.lineTo(13.82643f, 14.610545f);
                instancePath2.cubicTo(14.216424f, 14.303467f, 14.836923f, 14.309705f, 15.21552f, 14.624284f);
                instancePath2.lineTo(17.109f, 16.219f);
                instancePath2.lineTo(17.109375f, 9.471875f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
