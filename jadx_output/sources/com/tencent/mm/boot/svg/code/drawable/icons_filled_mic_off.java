package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_mic_off extends l95.c {
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
        instancePath.moveTo(12.0f, 2.0f);
        instancePath.cubicTo(9.51472f, 2.0f, 7.5f, 4.01472f, 7.5f, 6.5f);
        instancePath.lineTo(7.5f, 12.5f);
        instancePath.cubicTo(7.5f, 14.5705f, 8.89829f, 16.3143f, 10.8021f, 16.8388f);
        instancePath.cubicTo(10.8833f, 13.6564f, 13.3625f, 11.0702f, 16.5f, 10.8199f);
        instancePath.lineTo(16.5f, 6.5f);
        instancePath.cubicTo(16.5f, 4.01472f, 14.4853f, 2.0f, 12.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(5.7f, 12.5f);
        instancePath.cubicTo(5.7f, 15.6544f, 8.01827f, 18.2673f, 11.044f, 18.7279f);
        instancePath.cubicTo(11.3365f, 19.7379f, 11.8789f, 20.6418f, 12.6f, 21.3681f);
        instancePath.lineTo(12.6f, 23.0f);
        instancePath.lineTo(11.4f, 23.0f);
        instancePath.lineTo(11.4f, 19.9763f);
        instancePath.cubicTo(7.5384f, 19.6707f, 4.5f, 16.4402f, 4.5f, 12.5f);
        instancePath.lineTo(4.5f, 11.0f);
        instancePath.lineTo(5.7f, 11.0f);
        instancePath.lineTo(5.7f, 12.5f);
        instancePath.close();
        instancePath.moveTo(22.0f, 17.0f);
        instancePath.cubicTo(22.0f, 14.2386f, 19.7614f, 12.0f, 17.0f, 12.0f);
        instancePath.cubicTo(14.2386f, 12.0f, 12.0f, 14.2386f, 12.0f, 17.0f);
        instancePath.cubicTo(12.0f, 19.7614f, 14.2386f, 22.0f, 17.0f, 22.0f);
        instancePath.cubicTo(19.7614f, 22.0f, 22.0f, 19.7614f, 22.0f, 17.0f);
        instancePath.close();
        instancePath.moveTo(13.2f, 17.0f);
        instancePath.cubicTo(13.2f, 16.1672f, 13.4679f, 15.397f, 13.9222f, 14.7708f);
        instancePath.lineTo(19.2292f, 20.0778f);
        instancePath.cubicTo(18.603f, 20.5321f, 17.8328f, 20.8f, 17.0f, 20.8f);
        instancePath.cubicTo(14.9013f, 20.8f, 13.2f, 19.0987f, 13.2f, 17.0f);
        instancePath.close();
        instancePath.moveTo(17.0f, 13.2f);
        instancePath.cubicTo(16.1672f, 13.2f, 15.397f, 13.4679f, 14.7708f, 13.9222f);
        instancePath.lineTo(20.0778f, 19.2292f);
        instancePath.cubicTo(20.5321f, 18.603f, 20.8f, 17.8328f, 20.8f, 17.0f);
        instancePath.cubicTo(20.8f, 14.9013f, 19.0987f, 13.2f, 17.0f, 13.2f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
