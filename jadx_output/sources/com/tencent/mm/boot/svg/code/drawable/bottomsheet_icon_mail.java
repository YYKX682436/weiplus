package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_mail extends l95.c {
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
        instancePath.moveTo(87.0f, 26.0f);
        instancePath.lineTo(81.0f, 32.0f);
        instancePath.cubicTo(80.87885f, 32.277943f, 80.9f, 32.483356f, 81.0f, 33.0f);
        instancePath.lineTo(81.0f, 65.0f);
        instancePath.cubicTo(80.9f, 67.14137f, 79.08695f, 68.94447f, 77.0f, 69.0f);
        instancePath.lineTo(20.0f, 69.0f);
        instancePath.cubicTo(17.91305f, 68.94447f, 16.1f, 67.14137f, 16.0f, 65.0f);
        instancePath.lineTo(16.0f, 33.0f);
        instancePath.cubicTo(16.1f, 32.483356f, 16.12115f, 32.277943f, 16.0f, 32.0f);
        instancePath.lineTo(10.0f, 26.0f);
        instancePath.cubicTo(8.75645f, 27.917215f, 8.0f, 30.216175f, 8.0f, 33.0f);
        instancePath.lineTo(8.0f, 65.0f);
        instancePath.cubicTo(8.0f, 71.59026f, 13.4396f, 77.0f, 20.0f, 77.0f);
        instancePath.lineTo(77.0f, 77.0f);
        instancePath.cubicTo(83.5604f, 77.0f, 89.0f, 71.59026f, 89.0f, 65.0f);
        instancePath.lineTo(89.0f, 33.0f);
        instancePath.cubicTo(89.0f, 30.216175f, 88.24355f, 27.917215f, 87.0f, 26.0f);
        instancePath.moveTo(17.0f, 22.0f);
        instancePath.lineTo(24.0f, 29.0f);
        instancePath.lineTo(24.0f, 29.0f);
        instancePath.lineTo(49.0f, 53.0f);
        instancePath.lineTo(73.0f, 29.0f);
        instancePath.lineTo(73.0f, 29.0f);
        instancePath.lineTo(80.0f, 22.0f);
        instancePath.cubicTo(80.48633f, 21.519585f, 80.48227f, 21.517807f, 80.0f, 22.0f);
        instancePath.lineTo(81.0f, 21.0f);
        instancePath.lineTo(77.0f, 21.0f);
        instancePath.cubicTo(77.00033f, 21.002222f, 76.96873f, 21.0f, 77.0f, 21.0f);
        instancePath.lineTo(20.0f, 21.0f);
        instancePath.cubicTo(20.031721f, 21.0f, 20.000126f, 21.002222f, 20.0f, 21.0f);
        instancePath.lineTo(16.0f, 21.0f);
        instancePath.lineTo(17.0f, 22.0f);
        instancePath.cubicTo(16.517733f, 21.517807f, 16.514122f, 21.519585f, 17.0f, 22.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
