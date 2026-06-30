package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class taxi_icon extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(67.92738f, 16.0f);
        instancePath.cubicTo(68.94156f, 16.0f, 69.79519f, 16.759092f, 69.91368f, 17.766317f);
        instancePath.lineTo(70.73721f, 24.766317f);
        instancePath.cubicTo(70.746475f, 24.845015f, 70.75103f, 24.92318f, 70.75111f, 25.000534f);
        instancePath.lineTo(83.86636f, 25.0f);
        instancePath.cubicTo(86.32811f, 25.0f, 88.54007f, 26.503708f, 89.44565f, 28.792835f);
        instancePath.lineTo(99.85472f, 55.105057f);
        instancePath.cubicTo(105.79522f, 57.441925f, 110.0f, 63.229923f, 110.0f, 70.0f);
        instancePath.lineTo(110.0f, 90.0f);
        instancePath.cubicTo(110.0f, 92.20914f, 108.20914f, 94.0f, 106.0f, 94.0f);
        instancePath.lineTo(97.87405f, 94.000244f);
        instancePath.cubicTo(97.95627f, 94.31979f, 98.0f, 94.654785f, 98.0f, 95.0f);
        instancePath.lineTo(98.0f, 99.0f);
        instancePath.cubicTo(98.0f, 101.20914f, 96.20914f, 103.0f, 94.0f, 103.0f);
        instancePath.lineTo(90.0f, 103.0f);
        instancePath.cubicTo(87.79086f, 103.0f, 86.0f, 101.20914f, 86.0f, 99.0f);
        instancePath.lineTo(86.0f, 95.0f);
        instancePath.cubicTo(86.0f, 94.654785f, 86.04373f, 94.31979f, 86.12595f, 94.000244f);
        instancePath.lineTo(33.874046f, 94.000244f);
        instancePath.cubicTo(33.95627f, 94.31979f, 34.0f, 94.654785f, 34.0f, 95.0f);
        instancePath.lineTo(34.0f, 99.0f);
        instancePath.cubicTo(34.0f, 101.20914f, 32.20914f, 103.0f, 30.0f, 103.0f);
        instancePath.lineTo(26.0f, 103.0f);
        instancePath.cubicTo(23.790861f, 103.0f, 22.0f, 101.20914f, 22.0f, 99.0f);
        instancePath.lineTo(22.0f, 95.0f);
        instancePath.cubicTo(22.0f, 94.654785f, 22.043732f, 94.31979f, 22.125956f, 94.000244f);
        instancePath.lineTo(14.0f, 94.0f);
        instancePath.cubicTo(11.790861f, 94.0f, 10.0f, 92.20914f, 10.0f, 90.0f);
        instancePath.lineTo(10.0f, 70.0f);
        instancePath.cubicTo(10.0f, 63.229923f, 14.204777f, 57.441925f, 20.145279f, 55.105057f);
        instancePath.lineTo(30.55435f, 28.792835f);
        instancePath.cubicTo(31.459929f, 26.503708f, 33.671894f, 25.0f, 36.133636f, 25.0f);
        instancePath.lineTo(49.24909f, 25.0f);
        instancePath.cubicTo(49.24909f, 24.921906f, 49.253662f, 24.843878f, 49.262787f, 24.766317f);
        instancePath.lineTo(50.086315f, 17.766317f);
        instancePath.cubicTo(50.20481f, 16.759092f, 51.058445f, 16.0f, 52.072617f, 16.0f);
        instancePath.lineTo(67.92738f, 16.0f);
        instancePath.close();
        instancePath.moveTo(32.0f, 68.0f);
        instancePath.cubicTo(27.581722f, 68.0f, 24.0f, 71.58172f, 24.0f, 76.0f);
        instancePath.cubicTo(24.0f, 80.41828f, 27.581722f, 84.0f, 32.0f, 84.0f);
        instancePath.cubicTo(36.418278f, 84.0f, 40.0f, 80.41828f, 40.0f, 76.0f);
        instancePath.cubicTo(40.0f, 71.58172f, 36.418278f, 68.0f, 32.0f, 68.0f);
        instancePath.close();
        instancePath.moveTo(88.0f, 68.0f);
        instancePath.cubicTo(83.58172f, 68.0f, 80.0f, 71.58172f, 80.0f, 76.0f);
        instancePath.cubicTo(80.0f, 80.41828f, 83.58172f, 84.0f, 88.0f, 84.0f);
        instancePath.cubicTo(92.41828f, 84.0f, 96.0f, 80.41828f, 96.0f, 76.0f);
        instancePath.cubicTo(96.0f, 71.58172f, 92.41828f, 68.0f, 88.0f, 68.0f);
        instancePath.close();
        instancePath.moveTo(75.088844f, 35.0f);
        instancePath.lineTo(45.234837f, 35.0f);
        instancePath.cubicTo(43.472168f, 35.0f, 41.91726f, 36.153828f, 41.406467f, 37.840862f);
        instancePath.lineTo(35.78103f, 56.420433f);
        instancePath.cubicTo(35.72413f, 56.60836f, 35.695213f, 56.803646f, 35.695213f, 57.0f);
        instancePath.cubicTo(35.695213f, 58.10457f, 36.590645f, 59.0f, 37.695213f, 59.0f);
        instancePath.lineTo(82.34409f, 59.0f);
        instancePath.cubicTo(82.531006f, 59.0f, 82.716995f, 58.973797f, 82.89663f, 58.92216f);
        instancePath.cubicTo(83.95821f, 58.617f, 84.57141f, 57.509037f, 84.26625f, 56.44746f);
        instancePath.lineTo(78.93316f, 37.894917f);
        instancePath.cubicTo(78.44042f, 36.1808f, 76.872375f, 35.0f, 75.088844f, 35.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(16777215);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(120.0f, 0.0f);
        instancePath2.lineTo(120.0f, 120.0f);
        instancePath2.lineTo(0.0f, 120.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
