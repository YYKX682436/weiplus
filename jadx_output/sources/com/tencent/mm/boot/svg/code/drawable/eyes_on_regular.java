package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class eyes_on_regular extends l95.c {
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
                instancePath.moveTo(11.9998f, 5.0f);
                instancePath.cubicTo(16.8077f, 5.0f, 20.9722f, 7.84786f, 23.0f, 12.0005f);
                instancePath.cubicTo(20.9715f, 16.1526f, 16.8074f, 19.0f, 11.9998f, 19.0f);
                instancePath.cubicTo(7.19216f, 19.0f, 3.02802f, 16.1526f, 1.0f, 12.0005f);
                instancePath.cubicTo(3.02736f, 7.84786f, 7.19178f, 5.0f, 11.9998f, 5.0f);
                instancePath.close();
                instancePath.moveTo(11.9998f, 6.2f);
                instancePath.cubicTo(8.08431f, 6.2f, 4.52916f, 8.31947f, 2.53015f, 11.6894f);
                instancePath.lineTo(2.35176f, 12.0f);
                instancePath.lineTo(2.3672f, 12.0276f);
                instancePath.cubicTo(4.28211f, 15.4709f, 7.79018f, 17.6844f, 11.691f, 17.7956f);
                instancePath.lineTo(11.9998f, 17.8f);
                instancePath.cubicTo(15.9148f, 17.8f, 19.4698f, 15.6809f, 21.4698f, 12.3112f);
                instancePath.lineTo(21.6468f, 12.0f);
                instancePath.lineTo(21.6328f, 11.9732f);
                instancePath.cubicTo(19.718f, 8.52945f, 16.2097f, 6.31566f, 12.3085f, 6.2044f);
                instancePath.lineTo(11.9998f, 6.2f);
                instancePath.close();
                instancePath.moveTo(12.0f, 8.0f);
                instancePath.cubicTo(14.2091f, 8.0f, 16.0f, 9.79086f, 16.0f, 12.0f);
                instancePath.cubicTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f);
                instancePath.cubicTo(9.79086f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f);
                instancePath.cubicTo(8.0f, 9.79086f, 9.79086f, 8.0f, 12.0f, 8.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 9.2f);
                instancePath.cubicTo(10.4536f, 9.2f, 9.2f, 10.4536f, 9.2f, 12.0f);
                instancePath.cubicTo(9.2f, 13.5464f, 10.4536f, 14.8f, 12.0f, 14.8f);
                instancePath.cubicTo(13.5464f, 14.8f, 14.8f, 13.5464f, 14.8f, 12.0f);
                instancePath.cubicTo(14.8f, 10.4536f, 13.5464f, 9.2f, 12.0f, 9.2f);
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
