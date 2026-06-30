package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_countdown extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 30;
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.22182f, 7.22183f);
        instancePath.cubicTo(5.23122f, 9.21243f, 4.0f, 11.9624f, 4.0f, 15.0f);
        instancePath.cubicTo(4.0f, 21.0751f, 8.92487f, 26.0f, 15.0f, 26.0f);
        instancePath.cubicTo(21.0751f, 26.0f, 26.0f, 21.0751f, 26.0f, 15.0f);
        instancePath.cubicTo(26.0f, 8.92487f, 21.0751f, 4.0f, 15.0f, 4.0f);
        instancePath.lineTo(15.0f, 2.0f);
        instancePath.cubicTo(22.1797f, 2.0f, 28.0f, 7.8203f, 28.0f, 15.0f);
        instancePath.cubicTo(28.0f, 22.1797f, 22.1797f, 28.0f, 15.0f, 28.0f);
        instancePath.cubicTo(7.8203f, 28.0f, 2.0f, 22.1797f, 2.0f, 15.0f);
        instancePath.cubicTo(2.0f, 11.4101f, 3.45507f, 8.16015f, 5.80761f, 5.80761f);
        instancePath.lineTo(7.22182f, 7.22183f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.2892f, 8.34438f);
        instancePath2.cubicTo(10.0442f, 8.09142f, 9.64538f, 8.07082f, 9.37561f, 8.29718f);
        instancePath2.cubicTo(9.13582f, 8.49839f, 9.07048f, 8.83392f, 9.204f, 9.10631f);
        instancePath2.lineTo(9.26344f, 9.20511f);
        instancePath2.lineTo(13.1679f, 14.5994f);
        instancePath2.cubicTo(13.1398f, 14.7285f, 13.125f, 14.8626f, 13.125f, 15.0001f);
        instancePath2.cubicTo(13.125f, 16.0356f, 13.9645f, 16.8751f, 15.0f, 16.8751f);
        instancePath2.cubicTo(16.0355f, 16.8751f, 16.875f, 16.0356f, 16.875f, 15.0001f);
        instancePath2.cubicTo(16.875f, 13.9645f, 16.0355f, 13.1251f, 15.0f, 13.1251f);
        instancePath2.lineTo(14.923f, 13.1266f);
        instancePath2.lineTo(14.923f, 13.1266f);
        instancePath2.lineTo(10.2892f, 8.34438f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
