package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_chat_room_logo extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-15683857);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.0001f, 12.6667f);
                instancePath.cubicTo(20.0001f, 16.7168f, 16.7168f, 20.0f, 12.6667f, 20.0f);
                instancePath.cubicTo(12.4514f, 20.0f, 12.2382f, 19.9907f, 12.0276f, 19.9725f);
                instancePath.cubicTo(12.0094f, 19.7619f, 12.0001f, 19.5487f, 12.0001f, 19.3333f);
                instancePath.cubicTo(12.0001f, 15.2832f, 15.2833f, 12.0f, 19.3334f, 12.0f);
                instancePath.cubicTo(19.5488f, 12.0f, 19.762f, 12.0093f, 19.9726f, 12.0275f);
                instancePath.cubicTo(19.9908f, 12.2381f, 20.0001f, 12.4513f, 20.0001f, 12.6667f);
                instancePath.close();
                instancePath.moveTo(19.2009f, 9.33419f);
                instancePath.cubicTo(13.7832f, 9.40455f, 9.40463f, 13.7832f, 9.33428f, 19.2008f);
                instancePath.cubicTo(6.95936f, 17.9872f, 5.33341f, 15.5168f, 5.33341f, 12.6667f);
                instancePath.cubicTo(5.33341f, 8.61658f, 8.61666f, 5.33333f, 12.6667f, 5.33333f);
                instancePath.cubicTo(15.5169f, 5.33333f, 17.9873f, 6.95927f, 19.2009f, 9.33419f);
                instancePath.close();
                instancePath.moveTo(22.2383f, 9.76178f);
                instancePath.cubicTo(20.9938f, 5.65564f, 17.1793f, 2.66666f, 12.6667f, 2.66666f);
                instancePath.cubicTo(7.1439f, 2.66666f, 2.66675f, 7.14382f, 2.66675f, 12.6667f);
                instancePath.cubicTo(2.66675f, 17.1792f, 5.65572f, 20.9937f, 9.76187f, 22.2382f);
                instancePath.cubicTo(11.0064f, 26.3444f, 14.8209f, 29.3333f, 19.3334f, 29.3333f);
                instancePath.cubicTo(24.8563f, 29.3333f, 29.3334f, 24.8562f, 29.3334f, 19.3333f);
                instancePath.cubicTo(29.3334f, 14.8208f, 26.3444f, 11.0063f, 22.2383f, 9.76178f);
                instancePath.close();
                instancePath.moveTo(22.6659f, 12.7992f);
                instancePath.cubicTo(22.5955f, 18.2168f, 18.2169f, 22.5954f, 12.7993f, 22.6658f);
                instancePath.cubicTo(14.0129f, 25.0407f, 16.4833f, 26.6667f, 19.3334f, 26.6667f);
                instancePath.cubicTo(23.3835f, 26.6667f, 26.6667f, 23.3834f, 26.6667f, 19.3333f);
                instancePath.cubicTo(26.6667f, 16.4832f, 25.0408f, 14.0128f, 22.6659f, 12.7992f);
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
