package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_pic extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.98909f, 5.33336f);
                instancePath.lineTo(28.011f, 5.33336f);
                instancePath.cubicTo(28.7263f, 5.33336f, 29.3334f, 5.97487f, 29.3334f, 6.76622f);
                instancePath.lineTo(29.3334f, 20.6666f);
                instancePath.lineTo(29.3334f, 20.6667f);
                instancePath.lineTo(29.3334f, 20.6667f);
                instancePath.lineTo(29.3334f, 25.2338f);
                instancePath.cubicTo(29.3334f, 26.0282f, 28.7413f, 26.6667f, 28.011f, 26.6667f);
                instancePath.lineTo(3.98909f, 26.6667f);
                instancePath.cubicTo(3.27376f, 26.6667f, 2.66669f, 26.0252f, 2.66669f, 25.2338f);
                instancePath.lineTo(2.66669f, 6.76622f);
                instancePath.cubicTo(2.66669f, 5.97182f, 3.25875f, 5.33336f, 3.98909f, 5.33336f);
                instancePath.close();
                instancePath.moveTo(27.7333f, 19.2117f);
                instancePath.lineTo(27.7333f, 6.93336f);
                instancePath.lineTo(4.26662f, 6.93336f);
                instancePath.lineTo(4.26662f, 18.7897f);
                instancePath.lineTo(10.9324f, 13.399f);
                instancePath.cubicTo(11.5491f, 12.9002f, 12.5396f, 12.9244f, 13.1341f, 13.4468f);
                instancePath.lineTo(19.1026f, 18.691f);
                instancePath.lineTo(22.1455f, 16.1033f);
                instancePath.cubicTo(22.7618f, 15.5793f, 23.7424f, 15.5899f, 24.3407f, 16.1268f);
                instancePath.lineTo(27.7333f, 19.2117f);
                instancePath.close();
                instancePath.moveTo(4.26662f, 20.8475f);
                instancePath.lineTo(12.0082f, 14.5868f);
                instancePath.lineTo(19.7483f, 21.3333f);
                instancePath.lineTo(22.11f, 21.3333f);
                instancePath.lineTo(20.3174f, 19.7583f);
                instancePath.lineTo(23.235f, 17.2772f);
                instancePath.lineTo(27.7333f, 21.3247f);
                instancePath.lineTo(27.7333f, 25.0667f);
                instancePath.lineTo(4.26662f, 25.0667f);
                instancePath.lineTo(4.26662f, 20.8475f);
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
