package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class offline_entrance_activity extends l95.c {
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
            instancePath.moveTo(54.0f, 9.0f);
            instancePath.cubicTo(55.65625f, 9.0f, 57.0f, 10.34375f, 57.0f, 12.0f);
            instancePath.lineTo(57.0f, 60.0f);
            instancePath.cubicTo(57.0f, 61.65625f, 55.65625f, 63.0f, 54.0f, 63.0f);
            instancePath.lineTo(18.0f, 63.0f);
            instancePath.cubicTo(16.34375f, 63.0f, 15.0f, 61.65625f, 15.0f, 60.0f);
            instancePath.lineTo(15.0f, 12.0f);
            instancePath.cubicTo(15.0f, 10.34375f, 16.34375f, 9.0f, 18.0f, 9.0f);
            instancePath.close();
            instancePath.moveTo(53.398438f, 12.601562f);
            instancePath.lineTo(18.601562f, 12.601562f);
            instancePath.lineTo(18.601562f, 59.398438f);
            instancePath.lineTo(53.398438f, 59.398438f);
            instancePath.lineTo(53.398438f, 43.226562f);
            instancePath.lineTo(33.98828f, 53.73828f);
            instancePath.lineTo(33.808594f, 53.835938f);
            instancePath.cubicTo(33.585938f, 53.9375f, 33.335938f, 54.0f, 33.07422f, 54.0f);
            instancePath.cubicTo(32.460938f, 54.0f, 31.925781f, 53.683594f, 31.648438f, 53.214844f);
            instancePath.lineTo(31.539062f, 52.996094f);
            instancePath.lineTo(27.078125f, 43.808594f);
            instancePath.cubicTo(27.03125f, 43.70703f, 27.0f, 43.59375f, 27.0f, 43.484375f);
            instancePath.cubicTo(27.0f, 43.058594f, 27.367188f, 42.71875f, 27.816406f, 42.71875f);
            instancePath.cubicTo(28.0f, 42.71875f, 28.167969f, 42.773438f, 28.304688f, 42.871094f);
            instancePath.lineTo(33.570312f, 46.38672f);
            instancePath.cubicTo(33.953125f, 46.625f, 34.414062f, 46.76172f, 34.910156f, 46.76172f);
            instancePath.cubicTo(35.203125f, 46.76172f, 35.484375f, 46.710938f, 35.746094f, 46.621094f);
            instancePath.cubicTo(35.746094f, 46.621094f, 42.464844f, 43.82422f, 49.097656f, 41.058594f);
            instancePath.lineTo(50.464844f, 40.492188f);
            instancePath.cubicTo(51.464844f, 40.07422f, 52.44922f, 39.664062f, 53.398438f, 39.26953f);
            instancePath.close();
            instancePath.moveTo(40.5f, 27.0f);
            instancePath.lineTo(40.5f, 30.601562f);
            instancePath.lineTo(22.5f, 30.601562f);
            instancePath.lineTo(22.5f, 27.0f);
            instancePath.close();
            instancePath.moveTo(40.5f, 18.0f);
            instancePath.lineTo(40.5f, 21.601562f);
            instancePath.lineTo(22.5f, 21.601562f);
            instancePath.lineTo(22.5f, 18.0f);
            instancePath.close();
            instancePath.moveTo(40.5f, 18.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
