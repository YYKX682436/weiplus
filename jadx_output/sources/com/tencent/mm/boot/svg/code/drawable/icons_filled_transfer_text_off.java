package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_transfer_text_off extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.8351f, 20.5502f);
        instancePath.cubicTo(20.9393f, 20.3924f, 21.0f, 20.2033f, 21.0f, 20.0f);
        instancePath.lineTo(21.0f, 4.0f);
        instancePath.cubicTo(21.0f, 3.44772f, 20.5523f, 3.0f, 20.0f, 3.0f);
        instancePath.lineTo(4.0f, 3.0f);
        instancePath.cubicTo(3.79672f, 3.0f, 3.60761f, 3.06065f, 3.44978f, 3.16485f);
        instancePath.lineTo(8.98314f, 8.69822f);
        instancePath.lineTo(11.2961f, 8.69822f);
        instancePath.cubicTo(11.0512f, 8.28574f, 10.7603f, 7.89428f, 10.4292f, 7.51719f);
        instancePath.lineTo(10.2841f, 7.35198f);
        instancePath.lineTo(11.7492f, 6.82178f);
        instancePath.lineTo(11.816f, 6.909f);
        instancePath.cubicTo(12.2036f, 7.41509f, 12.5585f, 8.01191f, 12.8815f, 8.69822f);
        instancePath.lineTo(17.0939f, 8.69822f);
        instancePath.lineTo(17.0939f, 10.1422f);
        instancePath.lineTo(15.3919f, 10.1422f);
        instancePath.cubicTo(14.9794f, 11.3984f, 14.4251f, 12.4977f, 13.7281f, 13.4432f);
        instancePath.lineTo(16.0649f, 15.78f);
        instancePath.cubicTo(16.4397f, 15.9458f, 16.8307f, 16.1035f, 17.2377f, 16.2535f);
        instancePath.lineTo(17.4143f, 16.3185f);
        instancePath.lineTo(17.0943f, 16.8094f);
        instancePath.lineTo(20.8351f, 20.5502f);
        instancePath.close();
        instancePath.moveTo(9.82404f, 12.509f);
        instancePath.cubicTo(10.192f, 13.1014f, 10.6255f, 13.6588f, 11.1245f, 14.1822f);
        instancePath.cubicTo(10.0205f, 15.0803f, 8.63163f, 15.7415f, 6.96243f, 16.172f);
        instancePath.lineTo(6.7666f, 16.2225f);
        instancePath.lineTo(7.54698f, 17.5045f);
        instancePath.lineTo(7.65662f, 17.4736f);
        instancePath.cubicTo(9.4223f, 16.9753f, 10.9286f, 16.1906f, 12.1619f, 15.1277f);
        instancePath.cubicTo(12.4839f, 15.389f, 12.8274f, 15.6388f, 13.1922f, 15.8771f);
        instancePath.lineTo(18.3151f, 21.0f);
        instancePath.lineTo(4.0f, 21.0f);
        instancePath.cubicTo(3.44772f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f);
        instancePath.lineTo(3.0f, 5.68492f);
        instancePath.lineTo(7.04788f, 9.7328f);
        instancePath.lineTo(7.04788f, 10.1422f);
        instancePath.lineTo(7.45729f, 10.1422f);
        instancePath.lineTo(9.82404f, 12.509f);
        instancePath.close();
        instancePath.moveTo(12.7335f, 12.4486f);
        instancePath.cubicTo(13.2087f, 11.7627f, 13.5943f, 10.9932f, 13.8868f, 10.1422f);
        instancePath.lineTo(10.4271f, 10.1422f);
        instancePath.lineTo(12.7335f, 12.4486f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.9637f, 22.2365f);
        instancePath2.lineTo(1.76367f, 3.03646f);
        instancePath2.lineTo(3.03646f, 1.76367f);
        instancePath2.lineTo(22.2365f, 20.9637f);
        instancePath2.lineTo(20.9637f, 22.2365f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
