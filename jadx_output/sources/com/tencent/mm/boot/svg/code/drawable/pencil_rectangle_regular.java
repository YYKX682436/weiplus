package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pencil_rectangle_regular extends l95.c {
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
        instancePath.moveTo(4.2f, 4.2f);
        instancePath.lineTo(4.2f, 19.8f);
        instancePath.lineTo(19.8f, 19.8f);
        instancePath.lineTo(19.8f, 10.0f);
        instancePath.lineTo(21.0f, 10.0f);
        instancePath.lineTo(21.0f, 20.0f);
        instancePath.cubicTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.44772f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 4.0f);
        instancePath.cubicTo(3.0f, 3.44772f, 3.44772f, 3.0f, 4.0f, 3.0f);
        instancePath.lineTo(14.0f, 3.0f);
        instancePath.lineTo(14.0f, 4.2f);
        instancePath.lineTo(4.2f, 4.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.0662f, 3.14608f);
        instancePath2.cubicTo(19.8714f, 2.95131f, 19.5557f, 2.95131f, 19.3609f, 3.14608f);
        instancePath2.lineTo(9.85136f, 12.6556f);
        instancePath2.lineTo(8.53941f, 14.9523f);
        instancePath2.cubicTo(8.48735f, 15.0434f, 8.48684f, 15.1552f, 8.53807f, 15.2468f);
        instancePath2.cubicTo(8.61874f, 15.391f, 8.80107f, 15.4425f, 8.94531f, 15.3619f);
        instancePath2.lineTo(11.2619f, 14.0664f);
        instancePath2.lineTo(20.7716f, 4.55675f);
        instancePath2.cubicTo(20.9663f, 4.36198f, 20.9663f, 4.04619f, 20.7716f, 3.85142f);
        instancePath2.lineTo(20.0662f, 3.14608f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
