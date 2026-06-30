package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class rectangle_4_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(19.6f, 12.9955f);
        instancePath.cubicTo(20.1523f, 12.9955f, 20.6f, 13.4433f, 20.6f, 13.9955f);
        instancePath.lineTo(20.6f, 19.9955f);
        instancePath.cubicTo(20.6f, 20.5478f, 20.1523f, 20.9955f, 19.6f, 20.9955f);
        instancePath.lineTo(13.6f, 20.9955f);
        instancePath.cubicTo(13.0477f, 20.9955f, 12.6f, 20.5478f, 12.6f, 19.9955f);
        instancePath.lineTo(12.6f, 13.9955f);
        instancePath.cubicTo(12.6f, 13.4433f, 13.0477f, 12.9955f, 13.6f, 12.9955f);
        instancePath.lineTo(19.6f, 12.9955f);
        instancePath.close();
        instancePath.moveTo(10.0f, 12.9955f);
        instancePath.cubicTo(10.5523f, 12.9955f, 11.0f, 13.4433f, 11.0f, 13.9955f);
        instancePath.lineTo(11.0f, 19.9955f);
        instancePath.cubicTo(11.0f, 20.5478f, 10.5523f, 20.9955f, 10.0f, 20.9955f);
        instancePath.lineTo(4.0f, 20.9955f);
        instancePath.cubicTo(3.44772f, 20.9955f, 3.0f, 20.5478f, 3.0f, 19.9955f);
        instancePath.lineTo(3.0f, 13.9955f);
        instancePath.cubicTo(3.0f, 13.4433f, 3.44772f, 12.9955f, 4.0f, 12.9955f);
        instancePath.lineTo(10.0f, 12.9955f);
        instancePath.close();
        instancePath.moveTo(19.4f, 14.1955f);
        instancePath.lineTo(13.8f, 14.1955f);
        instancePath.lineTo(13.8f, 19.7955f);
        instancePath.lineTo(19.4f, 19.7955f);
        instancePath.lineTo(19.4f, 14.1955f);
        instancePath.close();
        instancePath.moveTo(9.8f, 14.1955f);
        instancePath.lineTo(4.2f, 14.1955f);
        instancePath.lineTo(4.2f, 19.7955f);
        instancePath.lineTo(9.8f, 19.7955f);
        instancePath.lineTo(9.8f, 14.1955f);
        instancePath.close();
        instancePath.moveTo(17.4071f, 2.9529f);
        instancePath.lineTo(20.9426f, 6.48843f);
        instancePath.cubicTo(21.3332f, 6.87895f, 21.3332f, 7.51212f, 20.9426f, 7.90264f);
        instancePath.lineTo(17.4071f, 11.4382f);
        instancePath.cubicTo(17.0166f, 11.8287f, 16.3834f, 11.8287f, 15.9929f, 11.4382f);
        instancePath.lineTo(12.4574f, 7.90264f);
        instancePath.cubicTo(12.0668f, 7.51212f, 12.0668f, 6.87895f, 12.4574f, 6.48843f);
        instancePath.lineTo(15.9929f, 2.9529f);
        instancePath.cubicTo(16.3834f, 2.56237f, 17.0166f, 2.56237f, 17.4071f, 2.9529f);
        instancePath.close();
        instancePath.moveTo(10.0f, 3.39554f);
        instancePath.cubicTo(10.5523f, 3.39554f, 11.0f, 3.84325f, 11.0f, 4.39554f);
        instancePath.lineTo(11.0f, 10.3955f);
        instancePath.cubicTo(11.0f, 10.9478f, 10.5523f, 11.3955f, 10.0f, 11.3955f);
        instancePath.lineTo(4.0f, 11.3955f);
        instancePath.cubicTo(3.44772f, 11.3955f, 3.0f, 10.9478f, 3.0f, 10.3955f);
        instancePath.lineTo(3.0f, 4.39554f);
        instancePath.cubicTo(3.0f, 3.84325f, 3.44772f, 3.39554f, 4.0f, 3.39554f);
        instancePath.lineTo(10.0f, 3.39554f);
        instancePath.close();
        instancePath.moveTo(16.7f, 3.94285f);
        instancePath.lineTo(13.4473f, 7.19554f);
        instancePath.lineTo(16.7f, 10.4482f);
        instancePath.lineTo(19.9527f, 7.19554f);
        instancePath.lineTo(16.7f, 3.94285f);
        instancePath.close();
        instancePath.moveTo(9.8f, 4.59554f);
        instancePath.lineTo(4.2f, 4.59554f);
        instancePath.lineTo(4.2f, 10.1955f);
        instancePath.lineTo(9.8f, 10.1955f);
        instancePath.lineTo(9.8f, 4.59554f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
