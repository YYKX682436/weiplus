package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class trash_off_regular extends l95.c {
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.77359f, 6.39999f);
            instancePath.lineTo(7.58594f, 20.0475f);
            instancePath.cubicTo(7.61109f, 20.4701f, 7.96116f, 20.8f, 8.38452f, 20.8f);
            instancePath.lineTo(15.6155f, 20.8f);
            instancePath.cubicTo(16.0389f, 20.8f, 16.389f, 20.4701f, 16.4141f, 20.0475f);
            instancePath.lineTo(17.2265f, 6.39999f);
            instancePath.lineTo(18.4286f, 6.39999f);
            instancePath.lineTo(17.612f, 20.1188f);
            instancePath.cubicTo(17.5491f, 21.1754f, 16.674f, 22.0f, 15.6155f, 22.0f);
            instancePath.lineTo(8.38452f, 22.0f);
            instancePath.cubicTo(7.32611f, 22.0f, 6.45095f, 21.1754f, 6.38806f, 20.1188f);
            instancePath.lineTo(5.57146f, 6.39999f);
            instancePath.lineTo(6.77359f, 6.39999f);
            instancePath.close();
            instancePath.moveTo(9.50003f, 8.99999f);
            instancePath.lineTo(10.7f, 8.99999f);
            instancePath.lineTo(11.2f, 18.0f);
            instancePath.lineTo(10.0f, 18.0f);
            instancePath.lineTo(9.50003f, 8.99999f);
            instancePath.close();
            instancePath.moveTo(13.3f, 8.99999f);
            instancePath.lineTo(14.5f, 8.99999f);
            instancePath.lineTo(14.0f, 18.0f);
            instancePath.lineTo(12.8f, 18.0f);
            instancePath.lineTo(13.3f, 8.99999f);
            instancePath.close();
            instancePath.moveTo(4.45908f, 2.35303f);
            instancePath.lineTo(20.216f, 5.1314f);
            instancePath.cubicTo(20.488f, 5.17935f, 20.6695f, 5.43868f, 20.6216f, 5.71062f);
            instancePath.lineTo(20.5f, 6.39999f);
            instancePath.lineTo(3.7583f, 3.44797f);
            instancePath.lineTo(3.87985f, 2.75861f);
            instancePath.cubicTo(3.92781f, 2.48666f, 4.18714f, 2.30507f, 4.45908f, 2.35303f);
            instancePath.close();
            instancePath.moveTo(10.7499f, 1.22837f);
            instancePath.lineTo(14.6892f, 1.92296f);
            instancePath.cubicTo(14.9611f, 1.97091f, 15.1427f, 2.23024f, 15.0948f, 2.50219f);
            instancePath.lineTo(14.9732f, 3.19155f);
            instancePath.lineTo(10.0492f, 2.32331f);
            instancePath.lineTo(10.1707f, 1.63395f);
            instancePath.cubicTo(10.2187f, 1.362f, 10.478f, 1.18042f, 10.7499f, 1.22837f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
