package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class coin_icon extends l95.c {
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
            instancePath.moveTo(55.878906f, 19.71875f);
            instancePath.cubicTo(52.84375f, 16.683594f, 48.882812f, 14.984375f, 44.53125f, 14.535156f);
            instancePath.cubicTo(43.98047f, 15.878906f, 43.128906f, 17.394531f, 41.84375f, 19.171875f);
            instancePath.cubicTo(38.19922f, 24.207031f, 32.617188f, 26.589844f, 32.617188f, 26.589844f);
            instancePath.cubicTo(32.617188f, 26.589844f, 38.46875f, 20.359375f, 39.160156f, 14.398438f);
            instancePath.cubicTo(39.507812f, 11.433594f, 38.898438f, 7.738281f, 37.578125f, 6.402344f);
            instancePath.cubicTo(36.79297f, 5.601562f, 35.445312f, 6.070312f, 35.33203f, 7.183594f);
            instancePath.cubicTo(35.15625f, 9.015625f, 34.476562f, 11.519531f, 32.691406f, 13.894531f);
            instancePath.cubicTo(31.265625f, 15.800781f, 28.234375f, 17.996094f, 27.152344f, 18.75f);
            instancePath.cubicTo(24.542969f, 20.28125f, 22.023438f, 22.203125f, 19.710938f, 24.515625f);
            instancePath.cubicTo(8.402344f, 35.82422f, 6.253906f, 52.01953f, 14.917969f, 60.683594f);
            instancePath.cubicTo(23.578125f, 69.34375f, 39.773438f, 67.19922f, 51.08203f, 55.88672f);
            instancePath.cubicTo(62.39453f, 44.57422f, 64.54297f, 28.382812f, 55.878906f, 19.71875f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
