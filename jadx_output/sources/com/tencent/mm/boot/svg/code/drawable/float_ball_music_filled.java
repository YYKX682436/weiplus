package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_music_filled extends l95.c {
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
            instancePaint3.setColor(-16268960);
            instancePaint3.setColor(-16268960);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(17.4146f, 7.07289f);
            instancePath.cubicTo(15.8348f, 5.78533f, 14.255f, 5.95883f, 13.0771f, 4.72606f);
            instancePath.cubicTo(12.7392f, 4.36079f, 12.5566f, 3.9316f, 12.5018f, 3.47502f);
            instancePath.cubicTo(12.4013f, 2.91799f, 11.8169f, 2.80841f, 11.4425f, 3.0367f);
            instancePath.cubicTo(11.4151f, 3.05497f, 11.3968f, 3.07323f, 11.3694f, 3.09149f);
            instancePath.cubicTo(11.3147f, 3.13715f, 11.269f, 3.19194f, 11.2325f, 3.24673f);
            instancePath.cubicTo(11.0407f, 3.51155f, 10.9129f, 3.90421f, 10.9129f, 4.45211f);
            instancePath.lineTo(10.9129f, 11.7392f);
            instancePath.cubicTo(10.8672f, 14.0586f, 10.4745f, 13.9947f, 8.45645f, 14.506f);
            instancePath.cubicTo(6.87667f, 14.9078f, 5.56172f, 15.9671f, 5.57085f, 17.5925f);
            instancePath.cubicTo(5.57998f, 19.218f, 7.01365f, 20.5695f, 8.67561f, 20.5238f);
            instancePath.cubicTo(12.794f, 20.4142f, 12.7392f, 16.1315f, 12.7301f, 14.3599f);
            instancePath.lineTo(12.7301f, 7.88561f);
            instancePath.cubicTo(12.7301f, 6.97244f, 13.351f, 7.20073f, 14.5199f, 7.62992f);
            instancePath.lineTo(14.5107f, 7.62992f);
            instancePath.cubicTo(14.6842f, 7.68471f, 14.8577f, 7.74863f, 15.0312f, 7.79429f);
            instancePath.cubicTo(15.8531f, 8.12303f, 16.7936f, 8.51569f, 17.095f, 9.31927f);
            instancePath.cubicTo(17.4785f, 10.5338f, 16.6658f, 11.6387f, 15.4787f, 12.1957f);
            instancePath.cubicTo(15.3052f, 12.2779f, 15.3691f, 12.5427f, 15.5609f, 12.5427f);
            instancePath.cubicTo(18.2273f, 12.5336f, 19.8801f, 8.99054f, 17.4055f, 7.07289f);
            instancePath.lineTo(17.4146f, 7.07289f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
