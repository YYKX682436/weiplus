package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class rectangle_4_filled extends l95.c {
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
        instancePath.moveTo(13.6f, 13.0f);
        instancePath.lineTo(19.6f, 13.0f);
        instancePath.cubicTo(20.1523f, 13.0f, 20.6f, 13.4477f, 20.6f, 14.0f);
        instancePath.lineTo(20.6f, 20.0f);
        instancePath.cubicTo(20.6f, 20.5522f, 20.1523f, 21.0f, 19.6f, 21.0f);
        instancePath.lineTo(13.6f, 21.0f);
        instancePath.cubicTo(13.0477f, 21.0f, 12.6f, 20.5522f, 12.6f, 20.0f);
        instancePath.lineTo(12.6f, 14.0f);
        instancePath.cubicTo(12.6f, 13.4477f, 13.0477f, 13.0f, 13.6f, 13.0f);
        instancePath.close();
        instancePath.moveTo(4.0f, 13.0f);
        instancePath.lineTo(10.0f, 13.0f);
        instancePath.cubicTo(10.5523f, 13.0f, 11.0f, 13.4477f, 11.0f, 14.0f);
        instancePath.lineTo(11.0f, 20.0f);
        instancePath.cubicTo(11.0f, 20.5522f, 10.5523f, 21.0f, 10.0f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.44772f, 21.0f, 3.0f, 20.5522f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 14.0f);
        instancePath.cubicTo(3.0f, 13.4477f, 3.44772f, 13.0f, 4.0f, 13.0f);
        instancePath.close();
        instancePath.moveTo(12.4574f, 6.49286f);
        instancePath.lineTo(15.9929f, 2.95732f);
        instancePath.cubicTo(16.3834f, 2.5668f, 17.0166f, 2.5668f, 17.4071f, 2.95732f);
        instancePath.lineTo(20.9426f, 6.49286f);
        instancePath.cubicTo(21.3332f, 6.88338f, 21.3332f, 7.51655f, 20.9426f, 7.90707f);
        instancePath.lineTo(17.4071f, 11.4426f);
        instancePath.cubicTo(17.0166f, 11.8331f, 16.3834f, 11.8331f, 15.9929f, 11.4426f);
        instancePath.lineTo(12.4574f, 7.90707f);
        instancePath.cubicTo(12.0668f, 7.51655f, 12.0668f, 6.88338f, 12.4574f, 6.49286f);
        instancePath.close();
        instancePath.moveTo(4.0f, 3.39996f);
        instancePath.lineTo(10.0f, 3.39996f);
        instancePath.cubicTo(10.5523f, 3.39996f, 11.0f, 3.84768f, 11.0f, 4.39996f);
        instancePath.lineTo(11.0f, 10.4f);
        instancePath.cubicTo(11.0f, 10.9522f, 10.5523f, 11.4f, 10.0f, 11.4f);
        instancePath.lineTo(4.0f, 11.4f);
        instancePath.cubicTo(3.44772f, 11.4f, 3.0f, 10.9522f, 3.0f, 10.4f);
        instancePath.lineTo(3.0f, 4.39996f);
        instancePath.cubicTo(3.0f, 3.84768f, 3.44772f, 3.39996f, 4.0f, 3.39996f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
