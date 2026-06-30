package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_filled_gift extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(60.0f, 39.0f);
        instancePath.lineTo(60.0f, 60.0f);
        instancePath.cubicTo(60.0f, 61.65625f, 58.65625f, 63.0f, 57.0f, 63.0f);
        instancePath.lineTo(38.25f, 62.996094f);
        instancePath.lineTo(38.25f, 39.0f);
        instancePath.close();
        instancePath.moveTo(33.75f, 39.0f);
        instancePath.lineTo(33.75f, 62.996094f);
        instancePath.lineTo(15.0f, 63.0f);
        instancePath.cubicTo(13.34375f, 63.0f, 12.0f, 61.65625f, 12.0f, 60.0f);
        instancePath.lineTo(12.0f, 39.0f);
        instancePath.close();
        instancePath.moveTo(46.5f, 12.0f);
        instancePath.lineTo(45.984375f, 12.007812f);
        instancePath.cubicTo(43.242188f, 12.152344f, 40.941406f, 14.113281f, 40.339844f, 16.765625f);
        instancePath.lineTo(40.253906f, 17.242188f);
        instancePath.lineTo(39.703125f, 21.0f);
        instancePath.lineTo(46.5f, 21.0f);
        instancePath.cubicTo(48.839844f, 21.0f, 50.76172f, 19.214844f, 50.98047f, 16.933594f);
        instancePath.lineTo(51.0f, 16.5f);
        instancePath.cubicTo(51.0f, 14.160156f, 49.214844f, 12.238281f, 46.933594f, 12.019531f);
        instancePath.close();
        instancePath.moveTo(25.6875f, 12.0f);
        instancePath.lineTo(25.5f, 12.0f);
        instancePath.cubicTo(23.015625f, 12.0f, 21.0f, 14.015625f, 21.0f, 16.5f);
        instancePath.cubicTo(21.0f, 18.839844f, 22.785156f, 20.761719f, 25.066406f, 20.980469f);
        instancePath.lineTo(25.5f, 21.0f);
        instancePath.lineTo(32.296875f, 21.0f);
        instancePath.lineTo(31.746094f, 17.242188f);
        instancePath.cubicTo(31.355469f, 14.558594f, 29.261719f, 12.492188f, 26.65625f, 12.078125f);
        instancePath.lineTo(26.164062f, 12.019531f);
        instancePath.close();
        instancePath.moveTo(9.0f, 24.0f);
        instancePath.cubicTo(9.0f, 22.34375f, 10.34375f, 21.0f, 12.0f, 21.0f);
        instancePath.lineTo(17.707031f, 21.003906f);
        instancePath.cubicTo(16.9375f, 19.679688f, 16.5f, 18.140625f, 16.5f, 16.5f);
        instancePath.cubicTo(16.5f, 11.707031f, 20.246094f, 7.789062f, 24.972656f, 7.515625f);
        instancePath.lineTo(25.6875f, 7.5f);
        instancePath.cubicTo(30.617188f, 7.5f, 34.847656f, 10.878906f, 36.003906f, 15.578125f);
        instancePath.cubicTo(37.109375f, 11.058594f, 41.066406f, 7.761719f, 45.75f, 7.515625f);
        instancePath.lineTo(46.5f, 7.5f);
        instancePath.cubicTo(51.46875f, 7.5f, 55.5f, 11.53125f, 55.5f, 16.5f);
        instancePath.cubicTo(55.5f, 18.140625f, 55.0625f, 19.679688f, 54.29297f, 21.003906f);
        instancePath.lineTo(60.0f, 21.0f);
        instancePath.cubicTo(61.65625f, 21.0f, 63.0f, 22.34375f, 63.0f, 24.0f);
        instancePath.lineTo(63.0f, 34.5f);
        instancePath.lineTo(9.0f, 34.5f);
        instancePath.close();
        instancePath.moveTo(9.0f, 24.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
