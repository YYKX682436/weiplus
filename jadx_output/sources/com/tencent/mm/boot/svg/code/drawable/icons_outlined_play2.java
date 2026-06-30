package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_play2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 0.0f);
            instancePath.cubicTo(55.882812f, 0.0f, 72.0f, 16.117188f, 72.0f, 36.0f);
            instancePath.cubicTo(72.0f, 55.882812f, 55.882812f, 72.0f, 36.0f, 72.0f);
            instancePath.cubicTo(16.117188f, 72.0f, 0.0f, 55.882812f, 0.0f, 36.0f);
            instancePath.cubicTo(0.0f, 16.117188f, 16.117188f, 0.0f, 36.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 2.160156f);
            instancePath.cubicTo(17.3125f, 2.160156f, 2.160156f, 17.3125f, 2.160156f, 36.0f);
            instancePath.cubicTo(2.160156f, 54.6875f, 17.3125f, 69.83984f, 36.0f, 69.83984f);
            instancePath.cubicTo(54.6875f, 69.83984f, 69.83984f, 54.6875f, 69.83984f, 36.0f);
            instancePath.cubicTo(69.83984f, 17.3125f, 54.6875f, 2.160156f, 36.0f, 2.160156f);
            instancePath.close();
            instancePath.moveTo(28.800781f, 22.902344f);
            instancePath.cubicTo(29.113281f, 22.902344f, 29.421875f, 22.984375f, 29.691406f, 23.140625f);
            instancePath.lineTo(49.464844f, 34.4375f);
            instancePath.cubicTo(50.328125f, 34.929688f, 50.628906f, 36.03125f, 50.13672f, 36.89453f);
            instancePath.cubicTo(49.976562f, 37.171875f, 49.742188f, 37.402344f, 49.464844f, 37.5625f);
            instancePath.lineTo(29.691406f, 48.859375f);
            instancePath.cubicTo(28.828125f, 49.35547f, 27.730469f, 49.054688f, 27.238281f, 48.191406f);
            instancePath.cubicTo(27.082031f, 47.91797f, 27.0f, 47.61328f, 27.0f, 47.296875f);
            instancePath.lineTo(27.0f, 24.703125f);
            instancePath.cubicTo(27.0f, 23.707031f, 27.804688f, 22.902344f, 28.800781f, 22.902344f);
            instancePath.close();
            instancePath.moveTo(28.800781f, 22.902344f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
