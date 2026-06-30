package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_panel_audio_icon extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePaint3.setColor(-12345871);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(26.8334f, 13.334f);
        instancePath2.cubicTo(25.7288f, 13.334f, 24.8334f, 14.2294f, 24.8334f, 15.334f);
        instancePath2.cubicTo(24.8334f, 16.4386f, 25.7288f, 17.334f, 26.8334f, 17.334f);
        instancePath2.cubicTo(27.9379f, 17.334f, 28.8334f, 16.4386f, 28.8334f, 15.334f);
        instancePath2.cubicTo(28.8334f, 14.2294f, 27.9379f, 13.334f, 26.8334f, 13.334f);
        instancePath2.close();
        instancePath2.moveTo(12.3334f, 20.6673f);
        instancePath2.cubicTo(12.3334f, 19.7468f, 13.0796f, 19.0007f, 14.0f, 19.0007f);
        instancePath2.cubicTo(14.9205f, 19.0007f, 15.6667f, 19.7468f, 15.6667f, 20.6673f);
        instancePath2.lineTo(15.6667f, 25.6673f);
        instancePath2.cubicTo(15.6667f, 26.5878f, 14.9205f, 27.334f, 14.0f, 27.334f);
        instancePath2.cubicTo(13.0796f, 27.334f, 12.3334f, 26.5878f, 12.3334f, 25.6673f);
        instancePath2.lineTo(12.3334f, 20.6673f);
        instancePath2.close();
        instancePath2.moveTo(25.3335f, 20.6673f);
        instancePath2.cubicTo(25.3335f, 19.7468f, 26.0796f, 19.0007f, 27.0001f, 19.0007f);
        instancePath2.cubicTo(27.9206f, 19.0007f, 28.6668f, 19.7468f, 28.6668f, 20.6673f);
        instancePath2.lineTo(28.6668f, 29.0006f);
        instancePath2.cubicTo(28.6668f, 29.9211f, 27.9206f, 30.6673f, 27.0001f, 30.6673f);
        instancePath2.cubicTo(26.0796f, 30.6673f, 25.3335f, 29.9211f, 25.3335f, 29.0007f);
        instancePath2.lineTo(25.3335f, 20.6673f);
        instancePath2.close();
        instancePath2.moveTo(31.8335f, 22.334f);
        instancePath2.cubicTo(31.8335f, 21.4135f, 32.5797f, 20.6673f, 33.5002f, 20.6673f);
        instancePath2.cubicTo(34.4206f, 20.6673f, 35.1668f, 21.4135f, 35.1668f, 22.334f);
        instancePath2.lineTo(35.1668f, 25.6673f);
        instancePath2.cubicTo(35.1668f, 26.5878f, 34.4206f, 27.334f, 33.5002f, 27.334f);
        instancePath2.cubicTo(32.5797f, 27.334f, 31.8335f, 26.5878f, 31.8335f, 25.6673f);
        instancePath2.lineTo(31.8335f, 22.334f);
        instancePath2.close();
        instancePath2.moveTo(20.5001f, 20.6673f);
        instancePath2.cubicTo(19.5796f, 20.6673f, 18.8334f, 21.4135f, 18.8334f, 22.334f);
        instancePath2.lineTo(18.8334f, 34.0007f);
        instancePath2.cubicTo(18.8334f, 34.9211f, 19.5796f, 35.6673f, 20.5001f, 35.6673f);
        instancePath2.cubicTo(21.4206f, 35.6673f, 22.1667f, 34.9211f, 22.1667f, 34.0007f);
        instancePath2.lineTo(22.1667f, 22.334f);
        instancePath2.cubicTo(22.1667f, 21.4135f, 21.4206f, 20.6673f, 20.5001f, 20.6673f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
