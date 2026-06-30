package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class private_lock extends l95.c {
    private final int width = 12;
    private final int height = 15;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 12;
        }
        if (i17 == 1) {
            return 15;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.33365f, 3.50016f);
            instancePath.cubicTo(3.33365f, 2.0274f, 4.52755f, 0.833496f, 6.00031f, 0.833496f);
            instancePath.cubicTo(7.47307f, 0.833496f, 8.66698f, 2.0274f, 8.66698f, 3.50016f);
            instancePath.lineTo(8.66698f, 5.5001f);
            instancePath.lineTo(10.6664f, 5.5001f);
            instancePath.cubicTo(11.0349f, 5.5001f, 11.3337f, 5.79842f, 11.3337f, 6.16577f);
            instancePath.lineTo(11.3337f, 13.5011f);
            instancePath.cubicTo(11.3337f, 13.8687f, 11.0372f, 14.1668f, 10.6664f, 14.1668f);
            instancePath.lineTo(1.33424f, 14.1668f);
            instancePath.cubicTo(0.965728f, 14.1668f, 0.666992f, 13.8684f, 0.666992f, 13.5011f);
            instancePath.lineTo(0.666992f, 6.16577f);
            instancePath.cubicTo(0.666992f, 5.79813f, 0.963411f, 5.5001f, 1.33424f, 5.5001f);
            instancePath.lineTo(3.33365f, 5.5001f);
            instancePath.lineTo(3.33365f, 3.50016f);
            instancePath.close();
            instancePath.moveTo(7.86698f, 3.50016f);
            instancePath.lineTo(7.86698f, 5.5001f);
            instancePath.lineTo(4.13365f, 5.5001f);
            instancePath.lineTo(4.13365f, 3.50016f);
            instancePath.cubicTo(4.13365f, 2.46923f, 4.96938f, 1.63349f, 6.00031f, 1.63349f);
            instancePath.cubicTo(7.03124f, 1.63349f, 7.86698f, 2.46923f, 7.86698f, 3.50016f);
            instancePath.close();
            instancePath.moveTo(1.46695f, 13.3667f);
            instancePath.lineTo(1.46695f, 6.30006f);
            instancePath.lineTo(10.5336f, 6.30006f);
            instancePath.lineTo(10.5336f, 13.3667f);
            instancePath.lineTo(1.46695f, 13.3667f);
            instancePath.close();
            instancePath.moveTo(5.00032f, 9.16677f);
            instancePath.cubicTo(5.00032f, 9.57684f, 5.24714f, 9.92925f, 5.60032f, 10.0836f);
            instancePath.lineTo(5.60032f, 11.5001f);
            instancePath.lineTo(6.40032f, 11.5001f);
            instancePath.lineTo(6.40032f, 10.0836f);
            instancePath.cubicTo(6.7535f, 9.92926f, 7.00032f, 9.57684f, 7.00032f, 9.16677f);
            instancePath.cubicTo(7.00032f, 8.61449f, 6.55261f, 8.16677f, 6.00032f, 8.16677f);
            instancePath.cubicTo(5.44804f, 8.16677f, 5.00032f, 8.61449f, 5.00032f, 9.16677f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
