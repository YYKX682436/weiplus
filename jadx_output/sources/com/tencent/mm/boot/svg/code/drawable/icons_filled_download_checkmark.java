package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_download_checkmark extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.75f, 1.0f);
        instancePath.lineTo(10.25f, 1.0f);
        instancePath.lineTo(10.25f, 4.0f);
        instancePath.lineTo(16.0f, 4.0f);
        instancePath.cubicTo(16.5523f, 4.0f, 17.0f, 4.44772f, 17.0f, 5.0f);
        instancePath.lineTo(17.0f, 9.5f);
        instancePath.cubicTo(12.8579f, 9.5f, 9.5f, 12.8579f, 9.5f, 17.0f);
        instancePath.cubicTo(9.5f, 17.6926f, 9.59388f, 18.3633f, 9.76962f, 19.0f);
        instancePath.lineTo(3.0f, 19.0f);
        instancePath.cubicTo(2.44772f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f);
        instancePath.lineTo(2.0f, 5.0f);
        instancePath.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
        instancePath.lineTo(8.75f, 4.0f);
        instancePath.lineTo(8.75f, 1.0f);
        instancePath.close();
        instancePath.moveTo(8.96967f, 11.5303f);
        instancePath.lineTo(5.96967f, 8.53033f);
        instancePath.lineTo(7.03033f, 7.46967f);
        instancePath.lineTo(8.75f, 9.18934f);
        instancePath.lineTo(8.75f, 4.25f);
        instancePath.lineTo(10.25f, 4.25f);
        instancePath.lineTo(10.25f, 9.18934f);
        instancePath.lineTo(11.9697f, 7.46967f);
        instancePath.lineTo(13.0303f, 8.53033f);
        instancePath.lineTo(10.0303f, 11.5303f);
        instancePath.lineTo(9.5f, 12.0607f);
        instancePath.lineTo(8.96967f, 11.5303f);
        instancePath.close();
        instancePath.moveTo(23.0f, 17.0f);
        instancePath.cubicTo(23.0f, 20.3137f, 20.3137f, 23.0f, 17.0f, 23.0f);
        instancePath.cubicTo(13.6863f, 23.0f, 11.0f, 20.3137f, 11.0f, 17.0f);
        instancePath.cubicTo(11.0f, 13.6863f, 13.6863f, 11.0f, 17.0f, 11.0f);
        instancePath.cubicTo(20.3137f, 11.0f, 23.0f, 13.6863f, 23.0f, 17.0f);
        instancePath.close();
        instancePath.moveTo(20.9303f, 15.5303f);
        instancePath.lineTo(16.8294f, 19.6313f);
        instancePath.cubicTo(16.4818f, 19.9789f, 15.9183f, 19.9789f, 15.5708f, 19.6313f);
        instancePath.lineTo(13.4697f, 17.5303f);
        instancePath.lineTo(14.5303f, 16.4697f);
        instancePath.lineTo(16.2001f, 18.1393f);
        instancePath.lineTo(19.8696f, 14.4697f);
        instancePath.lineTo(20.9303f, 15.5303f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
