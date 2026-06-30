package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_bullet_close extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(51.0f, 13.5f);
        instancePath.cubicTo(55.142136f, 13.5f, 58.5f, 16.857864f, 58.5f, 21.0f);
        instancePath.lineTo(58.5f, 25.5f);
        instancePath.lineTo(64.2f, 25.5f);
        instancePath.cubicTo(65.194115f, 25.5f, 66.0f, 26.305887f, 66.0f, 27.3f);
        instancePath.cubicTo(66.0f, 28.294113f, 65.194115f, 29.1f, 64.2f, 29.1f);
        instancePath.lineTo(46.8f, 29.1f);
        instancePath.cubicTo(45.80589f, 29.1f, 45.0f, 28.294113f, 45.0f, 27.3f);
        instancePath.cubicTo(45.0f, 26.305887f, 45.80589f, 25.5f, 46.8f, 25.5f);
        instancePath.lineTo(54.899f, 25.5f);
        instancePath.lineTo(54.9f, 21.0f);
        instancePath.cubicTo(54.9f, 18.98071f, 53.365353f, 17.319855f, 51.398754f, 17.120134f);
        instancePath.lineTo(51.0f, 17.1f);
        instancePath.lineTo(15.0f, 17.1f);
        instancePath.cubicTo(12.980709f, 17.1f, 11.319854f, 18.63465f, 11.120135f, 20.601248f);
        instancePath.lineTo(11.1f, 21.0f);
        instancePath.lineTo(11.1f, 46.5f);
        instancePath.cubicTo(11.1f, 48.51929f, 12.634649f, 50.180145f, 14.601248f, 50.379864f);
        instancePath.lineTo(15.0f, 50.4f);
        instancePath.lineTo(23.1f, 50.4f);
        instancePath.lineTo(23.097f, 57.3f);
        instancePath.lineTo(30.010162f, 50.4f);
        instancePath.lineTo(31.509188f, 50.399616f);
        instancePath.cubicTo(31.472355f, 51.60279f, 31.546268f, 52.808727f, 31.730928f, 54.000824f);
        instancePath.lineTo(31.5f, 54.0f);
        instancePath.lineTo(24.62132f, 60.87f);
        instancePath.cubicTo(23.449747f, 62.041573f, 21.550253f, 62.041573f, 20.37868f, 60.87f);
        instancePath.cubicTo(19.81607f, 60.307392f, 19.5f, 59.56565f, 19.5f, 58.77f);
        instancePath.lineTo(19.5f, 54.0f);
        instancePath.lineTo(15.0f, 54.0f);
        instancePath.cubicTo(10.857864f, 54.0f, 7.5f, 50.642136f, 7.5f, 46.5f);
        instancePath.lineTo(7.5f, 21.0f);
        instancePath.cubicTo(7.5f, 16.857864f, 10.857864f, 13.5f, 15.0f, 13.5f);
        instancePath.lineTo(51.0f, 13.5f);
        instancePath.close();
        instancePath.moveTo(37.776936f, 36.667797f);
        instancePath.lineTo(37.21142f, 37.21142f);
        instancePath.cubicTo(36.92192f, 37.500916f, 36.64343f, 37.79725f, 36.375946f, 38.0999f);
        instancePath.lineTo(35.4f, 38.1f);
        instancePath.cubicTo(34.405888f, 38.1f, 33.6f, 37.294113f, 33.6f, 36.3f);
        instancePath.cubicTo(33.6f, 35.30589f, 34.405888f, 34.5f, 35.4f, 34.5f);
        instancePath.lineTo(40.600315f, 34.49963f);
        instancePath.cubicTo(39.610622f, 35.124672f, 38.664913f, 35.847393f, 37.776936f, 36.667797f);
        instancePath.close();
        instancePath.moveTo(25.8f, 34.5f);
        instancePath.cubicTo(26.794113f, 34.5f, 27.6f, 35.30589f, 27.6f, 36.3f);
        instancePath.cubicTo(27.6f, 37.294113f, 26.794113f, 38.1f, 25.8f, 38.1f);
        instancePath.lineTo(20.4f, 38.1f);
        instancePath.cubicTo(19.405888f, 38.1f, 18.6f, 37.294113f, 18.6f, 36.3f);
        instancePath.cubicTo(18.6f, 35.30589f, 19.405888f, 34.5f, 20.4f, 34.5f);
        instancePath.lineTo(25.8f, 34.5f);
        instancePath.close();
        instancePath.moveTo(37.2f, 25.5f);
        instancePath.cubicTo(38.19411f, 25.5f, 39.0f, 26.305887f, 39.0f, 27.3f);
        instancePath.cubicTo(39.0f, 28.294113f, 38.19411f, 29.1f, 37.2f, 29.1f);
        instancePath.lineTo(31.8f, 29.1f);
        instancePath.cubicTo(30.805887f, 29.1f, 30.0f, 28.294113f, 30.0f, 27.3f);
        instancePath.cubicTo(30.0f, 26.305887f, 30.805887f, 25.5f, 31.8f, 25.5f);
        instancePath.lineTo(37.2f, 25.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(61.6066f, 40.3934f);
        instancePath2.cubicTo(67.46447f, 46.251263f, 67.46447f, 55.748737f, 61.6066f, 61.6066f);
        instancePath2.cubicTo(55.748737f, 67.46447f, 46.251263f, 67.46447f, 40.3934f, 61.6066f);
        instancePath2.cubicTo(34.535534f, 55.748737f, 34.535534f, 46.251263f, 40.3934f, 40.3934f);
        instancePath2.cubicTo(46.251263f, 34.535534f, 55.748737f, 34.535534f, 61.6066f, 40.3934f);
        instancePath2.close();
        instancePath2.moveTo(41.765602f, 44.31238f);
        instancePath2.cubicTo(38.52918f, 48.769787f, 38.920303f, 55.04234f, 42.938984f, 59.061016f);
        instancePath2.cubicTo(46.95766f, 63.079697f, 53.230213f, 63.47082f, 57.68762f, 60.234398f);
        instancePath2.lineTo(41.765602f, 44.31238f);
        instancePath2.close();
        instancePath2.moveTo(44.31238f, 41.765602f);
        instancePath2.lineTo(60.234398f, 57.68762f);
        instancePath2.cubicTo(63.47082f, 53.230213f, 63.079697f, 46.95766f, 59.061016f, 42.938984f);
        instancePath2.cubicTo(55.04234f, 38.920303f, 48.769787f, 38.52918f, 44.31238f, 41.765602f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
