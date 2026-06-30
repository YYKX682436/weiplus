package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_bgm_play extends l95.c {
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
            instancePath.moveTo(32.023438f, 10.832031f);
            instancePath.lineTo(32.554688f, 14.394531f);
            instancePath.lineTo(32.253906f, 14.4375f);
            instancePath.cubicTo(21.113281f, 16.230469f, 12.601562f, 25.890625f, 12.601562f, 37.539062f);
            instancePath.cubicTo(12.601562f, 50.460938f, 23.078125f, 60.9375f, 36.0f, 60.9375f);
            instancePath.cubicTo(48.921875f, 60.9375f, 59.398438f, 50.460938f, 59.398438f, 37.539062f);
            instancePath.cubicTo(59.398438f, 32.1875f, 57.601562f, 27.253906f, 54.58203f, 23.3125f);
            instancePath.lineTo(57.433594f, 21.128906f);
            instancePath.lineTo(57.765625f, 21.5625f);
            instancePath.cubicTo(61.058594f, 26.035156f, 63.0f, 31.5625f, 63.0f, 37.539062f);
            instancePath.cubicTo(63.0f, 52.44922f, 50.910156f, 64.53906f, 36.0f, 64.53906f);
            instancePath.cubicTo(21.089844f, 64.53906f, 9.0f, 52.44922f, 9.0f, 37.539062f);
            instancePath.cubicTo(9.0f, 23.980469f, 18.996094f, 12.753906f, 32.023438f, 10.832031f);
            instancePath.close();
            instancePath.moveTo(57.890625f, 6.222656f);
            instancePath.lineTo(57.898438f, 6.261719f);
            instancePath.lineTo(57.898438f, 10.519531f);
            instancePath.cubicTo(57.898438f, 10.65625f, 57.808594f, 10.773438f, 57.67578f, 10.808594f);
            instancePath.lineTo(43.496094f, 14.570312f);
            instancePath.lineTo(41.98828f, 37.875f);
            instancePath.cubicTo(41.79297f, 41.015625f, 39.1875f, 43.5f, 36.0f, 43.5f);
            instancePath.cubicTo(32.6875f, 43.5f, 30.0f, 40.8125f, 30.0f, 37.5f);
            instancePath.cubicTo(30.0f, 34.1875f, 32.6875f, 31.5f, 36.0f, 31.5f);
            instancePath.cubicTo(36.98828f, 31.5f, 37.921875f, 31.738281f, 38.746094f, 32.164062f);
            instancePath.lineTo(39.898438f, 12.996094f);
            instancePath.cubicTo(39.898438f, 11.636719f, 40.816406f, 10.445312f, 42.128906f, 10.097656f);
            instancePath.lineTo(57.523438f, 6.011719f);
            instancePath.cubicTo(57.683594f, 5.96875f, 57.847656f, 6.0625f, 57.890625f, 6.222656f);
            instancePath.close();
            instancePath.moveTo(57.890625f, 6.222656f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
