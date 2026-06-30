package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class display_lock_regular extends l95.c {
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
        instancePath.moveTo(2.0f, 3.5f);
        instancePath.cubicTo(1.44772f, 3.5f, 1.0f, 3.94772f, 1.0f, 4.5f);
        instancePath.lineTo(1.0f, 17.5f);
        instancePath.cubicTo(1.0f, 18.0523f, 1.44772f, 18.5f, 2.0f, 18.5f);
        instancePath.lineTo(11.5f, 18.5f);
        instancePath.lineTo(11.5f, 17.3f);
        instancePath.lineTo(2.2f, 17.3f);
        instancePath.lineTo(2.2f, 4.7f);
        instancePath.lineTo(19.8f, 4.7f);
        instancePath.lineTo(19.8f, 9.88716f);
        instancePath.cubicTo(20.2445f, 10.0894f, 20.6482f, 10.364f, 21.0f, 10.6947f);
        instancePath.lineTo(21.0f, 4.5f);
        instancePath.cubicTo(21.0f, 3.94772f, 20.5523f, 3.5f, 20.0f, 3.5f);
        instancePath.lineTo(2.0f, 3.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.0f, 19.8f);
        instancePath2.lineTo(11.5f, 19.8f);
        instancePath2.lineTo(11.5f, 21.0f);
        instancePath2.lineTo(7.0f, 21.0f);
        instancePath2.lineTo(7.0f, 20.8f);
        instancePath2.cubicTo(7.0f, 20.2477f, 7.44772f, 19.8f, 8.0f, 19.8f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(15.0f, 14.2f);
        instancePath3.lineTo(15.0f, 14.5f);
        instancePath3.lineTo(14.0f, 14.5f);
        instancePath3.cubicTo(13.4477f, 14.5f, 13.0f, 14.9477f, 13.0f, 15.5f);
        instancePath3.lineTo(13.0f, 21.0f);
        instancePath3.cubicTo(13.0f, 21.5523f, 13.4477f, 22.0f, 14.0f, 22.0f);
        instancePath3.lineTo(22.0f, 22.0f);
        instancePath3.cubicTo(22.5523f, 22.0f, 23.0f, 21.5523f, 23.0f, 21.0f);
        instancePath3.lineTo(23.0f, 15.5f);
        instancePath3.cubicTo(23.0f, 14.9477f, 22.5523f, 14.5f, 22.0f, 14.5f);
        instancePath3.lineTo(21.0f, 14.5f);
        instancePath3.lineTo(21.0f, 14.2f);
        instancePath3.cubicTo(21.0f, 12.4327f, 19.6569f, 11.0f, 18.0f, 11.0f);
        instancePath3.cubicTo(16.3431f, 11.0f, 15.0f, 12.4327f, 15.0f, 14.2f);
        instancePath3.close();
        instancePath3.moveTo(16.2f, 14.2f);
        instancePath3.lineTo(16.2f, 14.5f);
        instancePath3.lineTo(19.8f, 14.5f);
        instancePath3.lineTo(19.8f, 14.2f);
        instancePath3.cubicTo(19.8f, 13.0213f, 18.9223f, 12.2f, 18.0f, 12.2f);
        instancePath3.cubicTo(17.0777f, 12.2f, 16.2f, 13.0213f, 16.2f, 14.2f);
        instancePath3.close();
        instancePath3.moveTo(14.2f, 15.7f);
        instancePath3.lineTo(14.2f, 20.8f);
        instancePath3.lineTo(21.8f, 20.8f);
        instancePath3.lineTo(21.8f, 15.7f);
        instancePath3.lineTo(14.2f, 15.7f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
