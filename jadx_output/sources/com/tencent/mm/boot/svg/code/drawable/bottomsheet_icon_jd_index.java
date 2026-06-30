package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_jd_index extends l95.c {
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
        instancePaint3.setColor(-8617851);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(69.0f, 73.0f);
        instancePath.cubicTo(69.0f, 75.18871f, 67.16411f, 77.0f, 65.0f, 77.0f);
        instancePath.lineTo(57.0f, 77.0f);
        instancePath.lineTo(57.0f, 57.0f);
        instancePath.lineTo(40.0f, 57.0f);
        instancePath.lineTo(40.0f, 77.0f);
        instancePath.lineTo(32.0f, 77.0f);
        instancePath.cubicTo(29.835434f, 77.0f, 28.0f, 75.18871f, 28.0f, 73.0f);
        instancePath.lineTo(28.0f, 38.0f);
        instancePath.lineTo(49.0f, 18.0f);
        instancePath.lineTo(69.0f, 38.0f);
        instancePath.lineTo(69.0f, 73.0f);
        instancePath.close();
        instancePath.moveTo(52.0f, 9.0f);
        instancePath.lineTo(52.0f, 9.0f);
        instancePath.cubicTo(50.78988f, 8.532246f, 49.708397f, 8.0f, 49.0f, 8.0f);
        instancePath.cubicTo(47.291603f, 8.0f, 46.21012f, 8.532246f, 45.0f, 9.0f);
        instancePath.lineTo(45.0f, 9.0f);
        instancePath.lineTo(8.0f, 47.0f);
        instancePath.lineTo(14.0f, 53.0f);
        instancePath.lineTo(20.0f, 46.0f);
        instancePath.lineTo(20.0f, 73.0f);
        instancePath.cubicTo(20.146534f, 79.55686f, 25.5868f, 85.0f, 32.0f, 85.0f);
        instancePath.lineTo(40.0f, 85.0f);
        instancePath.lineTo(57.0f, 85.0f);
        instancePath.lineTo(65.0f, 85.0f);
        instancePath.cubicTo(71.4132f, 85.0f, 76.85346f, 79.55686f, 77.0f, 73.0f);
        instancePath.lineTo(77.0f, 46.0f);
        instancePath.lineTo(83.0f, 53.0f);
        instancePath.lineTo(89.0f, 47.0f);
        instancePath.lineTo(52.0f, 9.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
