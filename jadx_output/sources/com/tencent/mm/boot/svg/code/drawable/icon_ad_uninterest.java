package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_ad_uninterest extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.01421f, 2.64999f);
        instancePath.lineTo(2.30711f, 3.3571f);
        instancePath.lineTo(3.94733f, 4.99733f);
        instancePath.lineTo(4.66314f, 5.71313f);
        instancePath.lineTo(12.6413f, 13.6913f);
        instancePath.lineTo(13.3483f, 14.3983f);
        instancePath.lineTo(16.247f, 17.297f);
        instancePath.lineTo(16.9541f, 16.5899f);
        instancePath.lineTo(14.0554f, 13.6912f);
        instancePath.lineTo(16.529f, 11.2173f);
        instancePath.cubicTo(18.1111f, 9.58676f, 18.0961f, 6.98243f, 16.4841f, 5.37038f);
        instancePath.cubicTo(14.8569f, 3.7432f, 12.2187f, 3.7432f, 10.5915f, 5.37038f);
        instancePath.cubicTo(10.4392f, 5.52272f, 10.2427f, 5.71219f, 10.0022f, 5.93878f);
        instancePath.cubicTo(9.76175f, 5.71219f, 9.56533f, 5.52272f, 9.41299f, 5.37038f);
        instancePath.cubicTo(8.17737f, 4.13476f, 6.35878f, 3.83742f, 4.84258f, 4.47837f);
        instancePath.lineTo(3.01421f, 2.64999f);
        instancePath.close();
        instancePath.moveTo(5.62701f, 5.26279f);
        instancePath.lineTo(13.3483f, 12.9841f);
        instancePath.lineTo(15.8114f, 10.5209f);
        instancePath.cubicTo(17.0148f, 9.28062f, 17.0007f, 7.30127f, 15.7769f, 6.07749f);
        instancePath.cubicTo(14.5403f, 4.84083f, 12.5353f, 4.84083f, 11.2986f, 6.07749f);
        instancePath.cubicTo(11.1384f, 6.23771f, 10.9352f, 6.43374f, 10.688f, 6.66662f);
        instancePath.lineTo(10.0022f, 7.31272f);
        instancePath.lineTo(9.31649f, 6.66662f);
        instancePath.cubicTo(9.06933f, 6.43374f, 8.8661f, 6.23771f, 8.70588f, 6.07749f);
        instancePath.cubicTo(7.87192f, 5.24353f, 6.68854f, 4.97196f, 5.62701f, 5.26279f);
        instancePath.close();
        instancePath.moveTo(3.4751f, 11.2176f);
        instancePath.cubicTo(1.99515f, 9.69169f, 1.91306f, 7.31351f, 3.22912f, 5.69333f);
        instancePath.lineTo(3.94131f, 6.40552f);
        instancePath.cubicTo(3.01011f, 7.63284f, 3.09116f, 9.38541f, 4.18221f, 10.5105f);
        instancePath.lineTo(10.0022f, 16.3306f);
        instancePath.lineTo(11.9342f, 14.3984f);
        instancePath.lineTo(12.6413f, 15.1055f);
        instancePath.lineTo(10.5915f, 17.1555f);
        instancePath.cubicTo(10.2661f, 17.4809f, 9.73844f, 17.481f, 9.41299f, 17.1556f);
        instancePath.lineTo(3.4751f, 11.2176f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
