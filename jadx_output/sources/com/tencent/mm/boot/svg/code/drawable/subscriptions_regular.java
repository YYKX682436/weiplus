package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class subscriptions_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.0f, 3.0f);
            instancePath.cubicTo(4.0f, 2.44772f, 4.44772f, 2.0f, 5.0f, 2.0f);
            instancePath.lineTo(19.0f, 2.0f);
            instancePath.cubicTo(19.5523f, 2.0f, 20.0f, 2.44772f, 20.0f, 3.0f);
            instancePath.lineTo(20.0f, 21.0f);
            instancePath.cubicTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f);
            instancePath.lineTo(5.0f, 22.0f);
            instancePath.cubicTo(4.44772f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f);
            instancePath.lineTo(4.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(5.2f, 3.2f);
            instancePath.lineTo(5.2f, 20.8f);
            instancePath.lineTo(18.8f, 20.8f);
            instancePath.lineTo(18.8f, 3.2f);
            instancePath.lineTo(5.2f, 3.2f);
            instancePath.close();
            instancePath.moveTo(8.5f, 8.0f);
            instancePath.cubicTo(7.67157f, 8.0f, 7.0f, 7.32843f, 7.0f, 6.5f);
            instancePath.cubicTo(7.0f, 5.67157f, 7.67157f, 5.0f, 8.5f, 5.0f);
            instancePath.cubicTo(9.32843f, 5.0f, 10.0f, 5.67157f, 10.0f, 6.5f);
            instancePath.cubicTo(10.0f, 7.32843f, 9.32843f, 8.0f, 8.5f, 8.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 10.0f);
            instancePath.lineTo(14.5f, 10.0f);
            instancePath.lineTo(14.5f, 11.2f);
            instancePath.lineTo(7.0f, 11.2f);
            instancePath.lineTo(7.0f, 10.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 13.0f);
            instancePath.lineTo(11.0f, 13.0f);
            instancePath.lineTo(11.0f, 14.2f);
            instancePath.lineTo(7.0f, 14.2f);
            instancePath.lineTo(7.0f, 13.0f);
            instancePath.close();
            instancePath.moveTo(7.0f, 16.0f);
            instancePath.lineTo(11.0f, 16.0f);
            instancePath.lineTo(11.0f, 17.2f);
            instancePath.lineTo(7.0f, 17.2f);
            instancePath.lineTo(7.0f, 16.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
