package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class red_packet_regular extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.3333f, 1.66602f);
                instancePath.cubicTo(12.7015f, 1.66602f, 13.0f, 1.96449f, 13.0f, 2.33268f);
                instancePath.lineTo(13.0f, 13.666f);
                instancePath.cubicTo(13.0f, 14.0342f, 12.7015f, 14.3327f, 12.3333f, 14.3327f);
                instancePath.lineTo(3.66667f, 14.3327f);
                instancePath.cubicTo(3.29848f, 14.3327f, 3.0f, 14.0342f, 3.0f, 13.666f);
                instancePath.lineTo(3.0f, 2.33268f);
                instancePath.cubicTo(3.0f, 1.96449f, 3.29848f, 1.66602f, 3.66667f, 1.66602f);
                instancePath.lineTo(12.3333f, 1.66602f);
                instancePath.close();
                instancePath.moveTo(12.2f, 2.46602f);
                instancePath.lineTo(3.8f, 2.46602f);
                instancePath.lineTo(3.79962f, 4.72992f);
                instancePath.cubicTo(4.44746f, 5.50289f, 5.4432f, 6.08563f, 6.61543f, 6.34629f);
                instancePath.cubicTo(6.58771f, 6.45806f, 6.57143f, 6.57429f, 6.57143f, 6.6947f);
                instancePath.cubicTo(6.57143f, 6.74245f, 6.574f, 6.78964f, 6.57857f, 6.83624f);
                instancePath.cubicTo(5.55634f, 6.67619f, 4.61334f, 6.34686f, 3.80011f, 5.88768f);
                instancePath.lineTo(3.8f, 13.5327f);
                instancePath.lineTo(12.2f, 13.5327f);
                instancePath.lineTo(12.2006f, 5.8873f);
                instancePath.cubicTo(11.3872f, 6.34668f, 10.4439f, 6.67615f, 9.42143f, 6.83624f);
                instancePath.cubicTo(9.426f, 6.78964f, 9.42857f, 6.74245f, 9.42857f, 6.6947f);
                instancePath.cubicTo(9.42857f, 6.57429f, 9.41229f, 6.45806f, 9.38457f, 6.34629f);
                instancePath.cubicTo(10.5571f, 6.08556f, 11.5531f, 5.50255f, 12.2009f, 4.72925f);
                instancePath.lineTo(12.2f, 2.46602f);
                instancePath.close();
                instancePath.moveTo(8.0f, 5.62433f);
                instancePath.cubicTo(8.5753f, 5.62433f, 9.04167f, 6.0907f, 9.04167f, 6.666f);
                instancePath.cubicTo(9.04167f, 7.2413f, 8.5753f, 7.70767f, 8.0f, 7.70767f);
                instancePath.cubicTo(7.4247f, 7.70767f, 6.95833f, 7.2413f, 6.95833f, 6.666f);
                instancePath.cubicTo(6.95833f, 6.0907f, 7.4247f, 5.62433f, 8.0f, 5.62433f);
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
