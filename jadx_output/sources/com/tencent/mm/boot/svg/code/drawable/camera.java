package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class camera extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.001331f, 33.0f);
        instancePath.cubicTo(17.239172f, 33.0f, 15.0f, 35.236286f, 15.0f, 38.00532f);
        instancePath.lineTo(15.0f, 67.994675f);
        instancePath.cubicTo(15.0f, 70.75904f, 17.233757f, 73.0f, 20.001331f, 73.0f);
        instancePath.lineTo(75.998665f, 73.0f);
        instancePath.cubicTo(78.760826f, 73.0f, 81.0f, 70.76372f, 81.0f, 67.994675f);
        instancePath.lineTo(81.0f, 38.00532f);
        instancePath.cubicTo(81.0f, 35.24096f, 78.76624f, 33.0f, 75.998665f, 33.0f);
        instancePath.lineTo(20.001331f, 33.0f);
        instancePath.close();
        instancePath.moveTo(41.230534f, 24.0f);
        instancePath.lineTo(48.0f, 24.0f);
        instancePath.lineTo(48.0f, 33.0f);
        instancePath.lineTo(27.74054f, 33.0f);
        instancePath.cubicTo(33.113003f, 33.0f, 35.999054f, 24.0f, 41.230534f, 24.0f);
        instancePath.close();
        instancePath.moveTo(68.25946f, 33.0f);
        instancePath.cubicTo(62.886997f, 33.0f, 60.000946f, 24.0f, 54.7683f, 24.0f);
        instancePath.lineTo(48.0f, 24.0f);
        instancePath.lineTo(48.0f, 33.0f);
        instancePath.lineTo(68.25946f, 33.0f);
        instancePath.close();
        instancePath.moveTo(48.0f, 36.0f);
        instancePath.cubicTo(56.83692f, 36.0f, 64.0f, 43.16308f, 64.0f, 52.0f);
        instancePath.cubicTo(64.0f, 60.83692f, 56.83692f, 68.0f, 48.0f, 68.0f);
        instancePath.cubicTo(39.16308f, 68.0f, 32.0f, 60.83692f, 32.0f, 52.0f);
        instancePath.cubicTo(32.0f, 43.16308f, 39.16308f, 36.0f, 48.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(58.0f, 52.0f);
        instancePath.cubicTo(58.0f, 57.523f, 53.523f, 62.0f, 48.0f, 62.0f);
        instancePath.cubicTo(42.477f, 62.0f, 38.0f, 57.523f, 38.0f, 52.0f);
        instancePath.cubicTo(38.0f, 46.477f, 42.477f, 42.0f, 48.0f, 42.0f);
        instancePath.cubicTo(53.523f, 42.0f, 58.0f, 46.477f, 58.0f, 52.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 27.0f);
        instancePath.lineTo(27.0f, 27.0f);
        instancePath.lineTo(27.0f, 30.0f);
        instancePath.lineTo(18.0f, 30.0f);
        instancePath.lineTo(18.0f, 27.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
