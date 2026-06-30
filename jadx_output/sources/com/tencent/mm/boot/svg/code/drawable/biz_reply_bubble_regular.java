package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_reply_bubble_regular extends l95.c {
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
        instancePath.moveTo(19.0f, 4.5f);
        instancePath.cubicTo(20.3807f, 4.5f, 21.5f, 5.61929f, 21.5f, 7.0f);
        instancePath.lineTo(21.5f, 15.5f);
        instancePath.cubicTo(21.5f, 16.8807f, 20.3807f, 18.0f, 19.0f, 18.0f);
        instancePath.lineTo(11.5f, 18.0f);
        instancePath.lineTo(9.20711f, 20.29f);
        instancePath.cubicTo(8.81658f, 20.6805f, 8.18342f, 20.6805f, 7.79289f, 20.29f);
        instancePath.cubicTo(7.60536f, 20.1025f, 7.5f, 19.8552f, 7.5f, 19.59f);
        instancePath.lineTo(7.5f, 18.0f);
        instancePath.lineTo(5.0f, 18.0f);
        instancePath.cubicTo(3.61929f, 18.0f, 2.5f, 16.8807f, 2.5f, 15.5f);
        instancePath.lineTo(2.5f, 7.0f);
        instancePath.cubicTo(2.5f, 5.61929f, 3.61929f, 4.5f, 5.0f, 4.5f);
        instancePath.lineTo(19.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(19.0f, 5.7f);
        instancePath.lineTo(5.0f, 5.7f);
        instancePath.cubicTo(4.3269f, 5.7f, 3.77328f, 6.21155f, 3.70671f, 6.86708f);
        instancePath.lineTo(3.7f, 7.0f);
        instancePath.lineTo(3.7f, 15.5f);
        instancePath.cubicTo(3.7f, 16.1731f, 4.21155f, 16.7267f, 4.86708f, 16.7933f);
        instancePath.lineTo(5.0f, 16.8f);
        instancePath.lineTo(8.7f, 16.8f);
        instancePath.lineTo(8.699f, 19.1f);
        instancePath.lineTo(11.0034f, 16.8f);
        instancePath.lineTo(19.0f, 16.8f);
        instancePath.cubicTo(19.6731f, 16.8f, 20.2267f, 16.2885f, 20.2933f, 15.6329f);
        instancePath.lineTo(20.3f, 15.5f);
        instancePath.lineTo(20.3f, 7.0f);
        instancePath.cubicTo(20.3f, 6.3269f, 19.7885f, 5.77328f, 19.1329f, 5.70671f);
        instancePath.lineTo(19.0f, 5.7f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
