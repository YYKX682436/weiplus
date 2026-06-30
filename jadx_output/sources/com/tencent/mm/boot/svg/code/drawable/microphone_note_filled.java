package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class microphone_note_filled extends l95.c {
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
        instancePath.moveTo(6.34852f, 4.28697f);
        instancePath.cubicTo(6.34852f, 3.56989f, 7.16768f, 3.24496f, 7.61638f, 3.73199f);
        instancePath.lineTo(7.68398f, 3.8157f);
        instancePath.lineTo(8.46652f, 5.06165f);
        instancePath.cubicTo(8.67085f, 5.35008f, 8.933f, 5.63426f, 9.47761f, 5.82966f);
        instancePath.cubicTo(10.0031f, 5.97047f, 10.3883f, 5.9878f, 10.3883f, 5.9878f);
        instancePath.cubicTo(10.3883f, 5.9878f, 10.021f, 6.8816f, 9.46412f, 7.00497f);
        instancePath.cubicTo(8.87569f, 7.13533f, 8.40187f, 6.9624f, 7.93746f, 6.59589f);
        instancePath.lineTo(7.83236f, 6.50614f);
        instancePath.lineTo(7.83236f, 9.72827f);
        instancePath.lineTo(7.83119f, 9.72726f);
        instancePath.cubicTo(7.77329f, 10.8724f, 6.82649f, 11.783f, 5.667f, 11.783f);
        instancePath.cubicTo(4.4702f, 11.783f, 3.5f, 10.8128f, 3.5f, 9.61602f);
        instancePath.cubicTo(3.5f, 8.41923f, 4.4702f, 7.44903f, 5.667f, 7.44903f);
        instancePath.cubicTo(5.90509f, 7.44903f, 6.13422f, 7.48743f, 6.34852f, 7.55837f);
        instancePath.lineTo(6.34852f, 4.28697f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.4633f, 5.19949f);
        instancePath2.cubicTo(16.5211f, 4.07817f, 14.0377f, 4.74361f, 12.9164f, 6.68579f);
        instancePath2.cubicTo(12.291f, 7.769f, 12.2208f, 9.02015f, 12.6196f, 10.1117f);
        instancePath2.cubicTo(14.173f, 11.3112f, 15.4376f, 12.0408f, 17.1273f, 12.7171f);
        instancePath2.cubicTo(18.2735f, 12.5175f, 19.3235f, 11.8308f, 19.9496f, 10.7464f);
        instancePath2.cubicTo(21.0709f, 8.80426f, 20.4055f, 6.3208f, 18.4633f, 5.19949f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.2563f, 11.4551f);
        instancePath3.cubicTo(13.5529f, 12.4163f, 14.7159f, 13.0931f, 16.1153f, 13.6969f);
        instancePath3.lineTo(11.2694f, 20.3694f);
        instancePath3.cubicTo(10.8072f, 21.0033f, 9.94128f, 21.1865f, 9.26184f, 20.7942f);
        instancePath3.cubicTo(8.56384f, 20.3912f, 8.29642f, 19.517f, 8.64953f, 18.7925f);
        instancePath3.lineTo(12.2563f, 11.4551f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
