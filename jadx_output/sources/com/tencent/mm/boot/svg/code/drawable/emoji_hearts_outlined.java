package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class emoji_hearts_outlined extends l95.c {
    private final int width = 49;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 49;
        }
        if (i17 == 1) {
            return 48;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-372399);
            instancePaint3.setStrokeWidth(2.4f);
            instancePaint3.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            instancePaint3.setColor(-372399);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(22.125f, 40.0444f);
            instancePath.lineTo(7.97285f, 30.135f);
            instancePath.cubicTo(3.55474f, 26.9396f, 2.50481f, 20.778f, 5.64312f, 16.296f);
            instancePath.cubicTo(8.81089f, 11.7719f, 15.0463f, 10.6725f, 19.5704f, 13.8402f);
            instancePath.cubicTo(19.9939f, 14.1368f, 20.5372f, 14.5028f, 21.2f, 14.9381f);
            instancePath.cubicTo(21.674f, 14.3023f, 22.0593f, 13.7726f, 22.3559f, 13.3491f);
            instancePath.cubicTo(25.5236f, 8.82503f, 31.7591f, 7.72555f, 36.2831f, 10.8933f);
            instancePath.cubicTo(39.6766f, 13.2694f, 41.1432f, 17.3715f, 40.3275f, 21.1826f);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-372399);
            instancePaint4.setStrokeWidth(2.4f);
            instancePaint4.setColor(-372399);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(38.0442f, 26.0582f);
            instancePath2.cubicTo(41.8064f, 25.1133f, 45.6891f, 27.2759f, 46.8362f, 31.0272f);
            instancePath2.lineTo(46.9364f, 31.3879f);
            instancePath2.cubicTo(47.8743f, 35.1152f, 45.7618f, 38.9617f, 42.0752f, 40.1499f);
            instancePath2.lineTo(42.058f, 40.1552f);
            instancePath2.lineTo(29.7841f, 43.9084f);
            instancePath2.cubicTo(28.8184f, 44.2037f, 27.7994f, 43.7124f, 27.4165f, 42.801f);
            instancePath2.lineTo(27.3491f, 42.6137f);
            instancePath2.lineTo(23.5963f, 30.3389f);
            instancePath2.lineTo(23.593f, 30.3305f);
            instancePath2.lineTo(23.591f, 30.3217f);
            instancePath2.cubicTo(22.4807f, 26.4809f, 24.6551f, 22.4463f, 28.4918f, 21.2733f);
            instancePath2.lineTo(28.8552f, 21.1723f);
            instancePath2.cubicTo(32.6175f, 20.2272f, 36.501f, 22.3901f, 37.648f, 26.1418f);
            instancePath2.lineTo(37.6562f, 26.166f);
            instancePath2.cubicTo(37.6643f, 26.1635f, 37.6728f, 26.1616f, 37.6808f, 26.1592f);
            instancePath2.lineTo(38.0442f, 26.0582f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
