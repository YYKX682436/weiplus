package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_comment extends l95.c {
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
        instancePath.moveTo(31.508831f, 53.4f);
        instancePath.lineTo(61.5f, 53.4f);
        instancePath.cubicTo(61.997055f, 53.4f, 62.4f, 52.997055f, 62.4f, 52.5f);
        instancePath.lineTo(62.4f, 16.5f);
        instancePath.cubicTo(62.4f, 16.002943f, 61.997055f, 15.6f, 61.5f, 15.6f);
        instancePath.lineTo(10.5f, 15.6f);
        instancePath.cubicTo(10.002944f, 15.6f, 9.6f, 16.002943f, 9.6f, 16.5f);
        instancePath.lineTo(9.6f, 52.5f);
        instancePath.cubicTo(9.6f, 52.997055f, 10.002944f, 53.4f, 10.5f, 53.4f);
        instancePath.lineTo(24.6f, 53.4f);
        instancePath.lineTo(24.6f, 60.30883f);
        instancePath.lineTo(31.508831f, 53.4f);
        instancePath.close();
        instancePath.moveTo(33.0f, 57.0f);
        instancePath.lineTo(26.12132f, 63.87868f);
        instancePath.cubicTo(24.949747f, 65.050255f, 23.050253f, 65.050255f, 21.87868f, 63.87868f);
        instancePath.cubicTo(21.31607f, 63.31607f, 21.0f, 62.55301f, 21.0f, 61.75736f);
        instancePath.lineTo(21.0f, 57.0f);
        instancePath.lineTo(10.5f, 57.0f);
        instancePath.cubicTo(8.014719f, 57.0f, 6.0f, 54.985283f, 6.0f, 52.5f);
        instancePath.lineTo(6.0f, 16.5f);
        instancePath.cubicTo(6.0f, 14.014719f, 8.014719f, 12.0f, 10.5f, 12.0f);
        instancePath.lineTo(61.5f, 12.0f);
        instancePath.cubicTo(63.985283f, 12.0f, 66.0f, 14.014719f, 66.0f, 16.5f);
        instancePath.lineTo(66.0f, 52.5f);
        instancePath.cubicTo(66.0f, 54.985283f, 63.985283f, 57.0f, 61.5f, 57.0f);
        instancePath.lineTo(33.0f, 57.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
