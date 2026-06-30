package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_comment_close extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(61.6066f, 40.3934f);
        instancePath.cubicTo(67.46447f, 46.251263f, 67.46447f, 55.748737f, 61.6066f, 61.6066f);
        instancePath.cubicTo(55.748737f, 67.46447f, 46.251263f, 67.46447f, 40.3934f, 61.6066f);
        instancePath.cubicTo(34.535534f, 55.748737f, 34.535534f, 46.251263f, 40.3934f, 40.3934f);
        instancePath.cubicTo(46.251263f, 34.535534f, 55.748737f, 34.535534f, 61.6066f, 40.3934f);
        instancePath.close();
        instancePath.moveTo(41.765602f, 44.31238f);
        instancePath.cubicTo(38.52918f, 48.769787f, 38.920303f, 55.04234f, 42.938984f, 59.061016f);
        instancePath.cubicTo(46.95766f, 63.079697f, 53.230213f, 63.47082f, 57.68762f, 60.234398f);
        instancePath.lineTo(41.765602f, 44.31238f);
        instancePath.close();
        instancePath.moveTo(57.0f, 13.5f);
        instancePath.cubicTo(61.142136f, 13.5f, 64.5f, 16.857864f, 64.5f, 21.0f);
        instancePath.lineTo(64.502914f, 38.20809f);
        instancePath.cubicTo(63.433605f, 37.079727f, 62.22437f, 36.085297f, 60.902996f, 35.252583f);
        instancePath.lineTo(60.9f, 21.0f);
        instancePath.cubicTo(60.9f, 18.98071f, 59.365353f, 17.319855f, 57.398754f, 17.120134f);
        instancePath.lineTo(57.0f, 17.1f);
        instancePath.lineTo(15.0f, 17.1f);
        instancePath.cubicTo(12.980709f, 17.1f, 11.319854f, 18.63465f, 11.120135f, 20.601248f);
        instancePath.lineTo(11.1f, 21.0f);
        instancePath.lineTo(11.1f, 46.5f);
        instancePath.cubicTo(11.1f, 48.51929f, 12.634649f, 50.180145f, 14.601248f, 50.379864f);
        instancePath.lineTo(15.0f, 50.4f);
        instancePath.lineTo(26.1f, 50.4f);
        instancePath.lineTo(26.097f, 57.3f);
        instancePath.lineTo(32.4f, 51.009f);
        instancePath.lineTo(32.412266f, 51.68188f);
        instancePath.cubicTo(32.46008f, 53.008648f, 32.646854f, 54.299988f, 32.958477f, 55.541782f);
        instancePath.lineTo(27.62132f, 60.87f);
        instancePath.cubicTo(26.449747f, 62.041573f, 24.550253f, 62.041573f, 23.37868f, 60.87f);
        instancePath.cubicTo(22.81607f, 60.307392f, 22.5f, 59.56565f, 22.5f, 58.77f);
        instancePath.lineTo(22.5f, 54.0f);
        instancePath.lineTo(15.0f, 54.0f);
        instancePath.cubicTo(10.857864f, 54.0f, 7.5f, 50.642136f, 7.5f, 46.5f);
        instancePath.lineTo(7.5f, 21.0f);
        instancePath.cubicTo(7.5f, 16.857864f, 10.857864f, 13.5f, 15.0f, 13.5f);
        instancePath.lineTo(57.0f, 13.5f);
        instancePath.close();
        instancePath.moveTo(44.31238f, 41.765602f);
        instancePath.lineTo(60.234398f, 57.68762f);
        instancePath.cubicTo(63.47082f, 53.230213f, 63.079697f, 46.95766f, 59.061016f, 42.938984f);
        instancePath.cubicTo(55.04234f, 38.920303f, 48.769787f, 38.52918f, 44.31238f, 41.765602f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
