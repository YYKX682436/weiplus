package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chat_comment_channel_close extends l95.c {
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
                instancePaint3.setColor(-2130706433);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.00004f, 14.6668f);
                instancePath.cubicTo(4.31814f, 14.6668f, 1.33337f, 11.6821f, 1.33337f, 8.00016f);
                instancePath.cubicTo(1.33337f, 4.31826f, 4.31814f, 1.3335f, 8.00004f, 1.3335f);
                instancePath.cubicTo(11.6819f, 1.3335f, 14.6667f, 4.31826f, 14.6667f, 8.00016f);
                instancePath.cubicTo(14.6667f, 11.6821f, 11.6819f, 14.6668f, 8.00004f, 14.6668f);
                instancePath.close();
                instancePath.moveTo(10.0035f, 5.28956f);
                instancePath.lineTo(10.7106f, 5.99666f);
                instancePath.lineTo(8.70715f, 8.00016f);
                instancePath.lineTo(10.7106f, 10.0036f);
                instancePath.lineTo(10.0035f, 10.7107f);
                instancePath.lineTo(8.00004f, 8.70727f);
                instancePath.lineTo(5.9966f, 10.7107f);
                instancePath.lineTo(5.2895f, 10.0036f);
                instancePath.lineTo(7.29293f, 8.00016f);
                instancePath.lineTo(5.28944f, 5.99666f);
                instancePath.lineTo(5.99654f, 5.28956f);
                instancePath.lineTo(8.00004f, 7.29306f);
                instancePath.lineTo(10.0035f, 5.28956f);
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
