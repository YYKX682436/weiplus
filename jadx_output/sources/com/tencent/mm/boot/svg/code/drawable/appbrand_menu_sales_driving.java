package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class appbrand_menu_sales_driving extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-40634);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.0f, 2.1333334f);
        instancePath.cubicTo(18.50369f, 2.1333334f, 20.533333f, 3.9838898f, 20.533333f, 6.266667f);
        instancePath.lineTo(20.532515f, 8.799334f);
        instancePath.lineTo(23.552595f, 8.8f);
        instancePath.cubicTo(24.254547f, 8.8f, 24.836283f, 9.344244f, 24.882977f, 10.0446415f);
        instancePath.lineTo(26.038532f, 27.377975f);
        instancePath.cubicTo(26.087515f, 28.112724f, 25.531591f, 28.748064f, 24.796843f, 28.797047f);
        instancePath.lineTo(24.70815f, 28.8f);
        instancePath.lineTo(7.2918487f, 28.8f);
        instancePath.cubicTo(6.555469f, 28.8f, 5.958515f, 28.203047f, 5.958515f, 27.466667f);
        instancePath.lineTo(7.117024f, 10.0446415f);
        instancePath.cubicTo(7.1637173f, 9.344244f, 7.7454524f, 8.8f, 8.447404f, 8.8f);
        instancePath.lineTo(11.466516f, 8.799334f);
        instancePath.lineTo(11.466667f, 6.266667f);
        instancePath.cubicTo(11.466667f, 3.9838898f, 13.496309f, 2.1333334f, 16.0f, 2.1333334f);
        instancePath.close();
        instancePath.moveTo(16.0f, 4.0f);
        instancePath.cubicTo(14.5626f, 4.0f, 13.44436f, 4.9571643f, 13.34112f, 6.0947695f);
        instancePath.lineTo(13.333333f, 6.266667f);
        instancePath.lineTo(13.331515f, 8.799334f);
        instancePath.lineTo(18.665516f, 8.799334f);
        instancePath.lineTo(18.666666f, 6.266667f);
        instancePath.cubicTo(18.666666f, 5.112959f, 17.616873f, 4.1008563f, 16.213129f, 4.0070815f);
        instancePath.lineTo(16.0f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
