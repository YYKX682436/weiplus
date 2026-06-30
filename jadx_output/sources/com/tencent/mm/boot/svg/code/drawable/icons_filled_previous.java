package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_previous extends l95.c {
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
        instancePath.moveTo(31.757359f, 27.0f);
        instancePath.lineTo(37.24264f, 32.485283f);
        instancePath.lineTo(33.0f, 36.72792f);
        instancePath.lineTo(24.514719f, 28.242641f);
        instancePath.lineTo(22.393398f, 26.12132f);
        instancePath.cubicTo(21.221825f, 24.949747f, 21.221825f, 23.050253f, 22.393398f, 21.87868f);
        instancePath.lineTo(33.0f, 11.272078f);
        instancePath.lineTo(37.24264f, 15.514719f);
        instancePath.lineTo(31.757359f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        instancePath.cubicTo(54.941124f, 21.0f, 63.0f, 29.058874f, 63.0f, 39.0f);
        instancePath.cubicTo(63.0f, 48.941124f, 54.941124f, 57.0f, 45.0f, 57.0f);
        instancePath.lineTo(12.0f, 57.0f);
        instancePath.lineTo(12.0f, 51.0f);
        instancePath.lineTo(45.0f, 51.0f);
        instancePath.cubicTo(51.62742f, 51.0f, 57.0f, 45.62742f, 57.0f, 39.0f);
        instancePath.cubicTo(57.0f, 32.37258f, 51.62742f, 27.0f, 45.0f, 27.0f);
        instancePath.lineTo(31.757359f, 27.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
