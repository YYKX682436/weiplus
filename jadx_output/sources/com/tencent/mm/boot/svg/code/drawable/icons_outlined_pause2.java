package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pause2 extends l95.c {
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
        instancePath.moveTo(30.601562f, 23.398438f);
        instancePath.cubicTo(31.59375f, 23.398438f, 32.398438f, 24.152344f, 32.398438f, 25.078125f);
        instancePath.lineTo(32.398438f, 46.921875f);
        instancePath.cubicTo(32.398438f, 47.847656f, 31.59375f, 48.601562f, 30.601562f, 48.601562f);
        instancePath.lineTo(27.0f, 48.601562f);
        instancePath.cubicTo(26.007812f, 48.601562f, 25.199219f, 47.847656f, 25.199219f, 46.921875f);
        instancePath.lineTo(25.199219f, 25.078125f);
        instancePath.cubicTo(25.199219f, 24.152344f, 26.007812f, 23.398438f, 27.0f, 23.398438f);
        instancePath.close();
        instancePath.moveTo(45.0f, 23.398438f);
        instancePath.cubicTo(45.992188f, 23.398438f, 46.80078f, 24.152344f, 46.80078f, 25.078125f);
        instancePath.lineTo(46.80078f, 46.921875f);
        instancePath.cubicTo(46.80078f, 47.847656f, 45.992188f, 48.601562f, 45.0f, 48.601562f);
        instancePath.lineTo(41.398438f, 48.601562f);
        instancePath.cubicTo(40.40625f, 48.601562f, 39.601562f, 47.847656f, 39.601562f, 46.921875f);
        instancePath.lineTo(39.601562f, 25.078125f);
        instancePath.cubicTo(39.601562f, 24.152344f, 40.40625f, 23.398438f, 41.398438f, 23.398438f);
        instancePath.close();
        instancePath.moveTo(45.0f, 23.398438f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
