package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_mic_off extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.0f, 8.66675f);
                instancePath.cubicTo(10.0f, 5.35304f, 12.6863f, 2.66675f, 16.0f, 2.66675f);
                instancePath.cubicTo(19.3137f, 2.66675f, 22.0f, 5.35304f, 22.0f, 8.66675f);
                instancePath.lineTo(22.0f, 14.4266f);
                instancePath.cubicTo(21.4497f, 14.4705f, 20.9146f, 14.5683f, 20.4f, 14.7147f);
                instancePath.lineTo(20.4f, 8.66675f);
                instancePath.cubicTo(20.4f, 6.2367f, 18.4301f, 4.26675f, 16.0f, 4.26675f);
                instancePath.cubicTo(13.5699f, 4.26675f, 11.6f, 6.2367f, 11.6f, 8.66675f);
                instancePath.lineTo(11.6f, 16.6667f);
                instancePath.cubicTo(11.6f, 18.6083f, 12.8575f, 20.2561f, 14.6025f, 20.8402f);
                instancePath.cubicTo(14.4851f, 21.3605f, 14.4168f, 21.8994f, 14.4027f, 22.4518f);
                instancePath.cubicTo(11.8644f, 21.7525f, 10.0f, 19.4274f, 10.0f, 16.6667f);
                instancePath.lineTo(10.0f, 8.66675f);
                instancePath.close();
                instancePath.moveTo(16.8f, 28.4908f);
                instancePath.cubicTo(15.8386f, 27.5224f, 15.1153f, 26.3173f, 14.7253f, 24.9707f);
                instancePath.cubicTo(10.691f, 24.3565f, 7.6f, 20.8726f, 7.6f, 16.6667f);
                instancePath.lineTo(7.6f, 14.6667f);
                instancePath.lineTo(6.0f, 14.6667f);
                instancePath.lineTo(6.0f, 16.6667f);
                instancePath.cubicTo(6.0f, 21.9203f, 10.0512f, 26.2277f, 15.2f, 26.6352f);
                instancePath.lineTo(15.2f, 30.6667f);
                instancePath.lineTo(16.8f, 30.6667f);
                instancePath.lineTo(16.8f, 28.4908f);
                instancePath.close();
                instancePath.moveTo(29.3333f, 22.6667f);
                instancePath.cubicTo(29.3333f, 18.9848f, 26.3486f, 16.0001f, 22.6667f, 16.0001f);
                instancePath.cubicTo(18.9848f, 16.0001f, 16.0f, 18.9848f, 16.0f, 22.6667f);
                instancePath.cubicTo(16.0f, 26.3486f, 18.9848f, 29.3334f, 22.6667f, 29.3334f);
                instancePath.cubicTo(26.3486f, 29.3334f, 29.3333f, 26.3486f, 29.3333f, 22.6667f);
                instancePath.close();
                instancePath.moveTo(17.6f, 22.6667f);
                instancePath.cubicTo(17.6f, 21.5563f, 17.9572f, 20.5294f, 18.563f, 19.6944f);
                instancePath.lineTo(25.639f, 26.7704f);
                instancePath.cubicTo(24.8041f, 27.3762f, 23.7771f, 27.7334f, 22.6667f, 27.7334f);
                instancePath.cubicTo(19.8684f, 27.7334f, 17.6f, 25.465f, 17.6f, 22.6667f);
                instancePath.close();
                instancePath.moveTo(26.7703f, 25.6391f);
                instancePath.lineTo(19.6944f, 18.5631f);
                instancePath.cubicTo(20.5293f, 17.9573f, 21.5563f, 17.6001f, 22.6667f, 17.6001f);
                instancePath.cubicTo(25.4649f, 17.6001f, 27.7333f, 19.8685f, 27.7333f, 22.6667f);
                instancePath.cubicTo(27.7333f, 23.7772f, 27.3761f, 24.8041f, 26.7703f, 25.6391f);
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
