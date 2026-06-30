package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_member_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePath.moveTo(11.0597f, 2.3335f);
        instancePath.cubicTo(11.3433f, 2.3335f, 11.6169f, 2.43715f, 11.8259f, 2.6245f);
        instancePath.lineTo(11.9011f, 2.69863f);
        instancePath.lineTo(14.3737f, 5.37725f);
        instancePath.cubicTo(14.7446f, 5.77903f, 14.76f, 6.37947f, 14.439f, 6.78317f);
        instancePath.lineTo(8.59586f, 13.3963f);
        instancePath.cubicTo(8.29835f, 13.733f, 7.79412f, 13.7554f, 7.46905f, 13.4636f);
        instancePath.lineTo(7.40228f, 13.3963f);
        instancePath.lineTo(1.56804f, 6.79194f);
        instancePath.cubicTo(1.26027f, 6.40199f, 1.25444f, 5.85606f, 1.55524f, 5.45979f);
        instancePath.lineTo(1.62439f, 5.37728f);
        instancePath.lineTo(4.09707f, 2.6986f);
        instancePath.cubicTo(4.28904f, 2.49068f, 4.55245f, 2.36392f, 4.83267f, 2.33832f);
        instancePath.lineTo(4.93843f, 2.3335f);
        instancePath.lineTo(11.0597f, 2.3335f);
        instancePath.close();
        instancePath.moveTo(5.90629f, 6.40672f);
        instancePath.cubicTo(5.68987f, 6.22126f, 5.36431f, 6.21967f, 5.14552f, 6.41446f);
        instancePath.cubicTo(4.92674f, 6.60925f, 4.89068f, 6.93281f, 5.04987f, 7.16923f);
        instancePath.lineTo(5.09814f, 7.23138f);
        instancePath.lineTo(7.56691f, 10.0042f);
        instancePath.lineTo(7.62295f, 10.0593f);
        instancePath.cubicTo(7.83857f, 10.2443f, 8.15956f, 10.2443f, 8.37518f, 10.0593f);
        instancePath.lineTo(8.43122f, 10.0042f);
        instancePath.lineTo(10.9f, 7.23138f);
        instancePath.lineTo(10.9483f, 7.16923f);
        instancePath.cubicTo(11.093f, 6.95431f, 11.0763f, 6.66736f, 10.9077f, 6.47062f);
        instancePath.lineTo(10.8526f, 6.41446f);
        instancePath.lineTo(10.7905f, 6.3662f);
        instancePath.cubicTo(10.5755f, 6.22148f, 10.2886f, 6.23812f, 10.0918f, 6.40672f);
        instancePath.lineTo(10.0357f, 6.46185f);
        instancePath.lineTo(7.99871f, 8.74883f);
        instancePath.lineTo(5.96244f, 6.46185f);
        instancePath.lineTo(5.90629f, 6.40672f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
