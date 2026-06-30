package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eyes_off extends l95.c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(56.765636f, 50.401676f);
        instancePath.lineTo(66.27565f, 59.91169f);
        instancePath.lineTo(63.09367f, 63.09367f);
        instancePath.lineTo(12.18198f, 12.18198f);
        instancePath.lineTo(15.363961f, 9.0f);
        instancePath.lineTo(23.576626f, 17.212666f);
        instancePath.cubicTo(27.459063f, 15.780132f, 31.641382f, 15.0f, 36.0f, 15.0f);
        instancePath.cubicTo(50.42337f, 15.0f, 62.91619f, 23.542883f, 69.0f, 36.0f);
        instancePath.cubicTo(66.16364f, 41.807686f, 61.934246f, 46.76459f, 56.765636f, 50.401676f);
        instancePath.close();
        instancePath.moveTo(32.47154f, 26.107576f);
        instancePath.lineTo(45.89242f, 39.52846f);
        instancePath.cubicTo(46.285793f, 38.4257f, 46.5f, 37.237865f, 46.5f, 36.0f);
        instancePath.cubicTo(46.5f, 30.20101f, 41.79899f, 25.5f, 36.0f, 25.5f);
        instancePath.cubicTo(34.762135f, 25.5f, 33.5743f, 25.714207f, 32.47154f, 26.107576f);
        instancePath.close();
        instancePath.moveTo(48.423374f, 54.787334f);
        instancePath.cubicTo(44.54094f, 56.219868f, 40.358616f, 57.0f, 36.0f, 57.0f);
        instancePath.cubicTo(21.576628f, 57.0f, 9.08381f, 48.45712f, 3.0f, 36.0f);
        instancePath.cubicTo(5.8363595f, 30.192312f, 10.065755f, 25.235407f, 15.234364f, 21.598326f);
        instancePath.lineTo(26.107576f, 32.47154f);
        instancePath.cubicTo(25.714207f, 33.5743f, 25.5f, 34.762135f, 25.5f, 36.0f);
        instancePath.cubicTo(25.5f, 41.79899f, 30.20101f, 46.5f, 36.0f, 46.5f);
        instancePath.cubicTo(37.237865f, 46.5f, 38.4257f, 46.285793f, 39.52846f, 45.89242f);
        instancePath.lineTo(48.423374f, 54.787334f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
