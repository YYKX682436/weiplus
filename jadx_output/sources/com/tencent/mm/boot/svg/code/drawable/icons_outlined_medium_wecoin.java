package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_medium_wecoin extends l95.c {
    private final int width = 14;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 14;
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
            instancePaint3.setColor(-436207616);
            instancePaint3.setStrokeWidth(1.2f);
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(5.88492f, 6.2463f);
            instancePath.cubicTo(5.88492f, 6.2463f, 7.61684f, 5.20388f, 7.77084f, 3.1593f);
            instancePath.cubicTo(7.81226f, 2.61797f, 7.63609f, 1.77388f, 7.39634f, 1.53122f);
            instancePath.cubicTo(7.25342f, 1.38597f, 7.00784f, 1.47055f, 6.98859f, 1.67355f);
            instancePath.cubicTo(6.95592f, 2.00605f, 6.83226f, 2.63605f, 6.50851f, 3.06772f);
            instancePath.cubicTo(6.24834f, 3.41422f, 5.69767f, 3.8138f, 5.50051f, 3.9503f);
            instancePath.cubicTo(5.02567f, 4.22913f, 4.56776f, 4.57855f, 4.14776f, 4.99855f);
            instancePath.cubicTo(2.09092f, 7.05538f, 1.70067f, 9.99946f, 3.27567f, 11.575f);
            instancePath.cubicTo(4.85126f, 13.15f, 7.79534f, 12.7598f, 9.85217f, 10.703f);
            instancePath.cubicTo(11.909f, 8.64613f, 12.2993f, 5.70147f, 10.7243f, 4.12647f);
            instancePath.cubicTo(10.1724f, 3.57463f, 9.35634f, 3.24505f, 8.74734f, 3.1768f);
            instancePath.cubicTo(8.13834f, 3.10913f, 7.79067f, 3.1593f, 7.79067f, 3.1593f);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
