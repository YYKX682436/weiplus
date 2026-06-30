package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pencil_rectangle_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.7405f, 16.0109f);
        instancePath.lineTo(11.1055f, 14.6884f);
        instancePath.lineTo(20.6544f, 5.1395f);
        instancePath.cubicTo(21.0053f, 4.78852f, 21.0053f, 4.21946f, 20.6544f, 3.86848f);
        instancePath.lineTo(19.949f, 3.16314f);
        instancePath.cubicTo(19.598f, 2.81216f, 19.029f, 2.81216f, 18.678f, 3.16314f);
        instancePath.lineTo(9.13057f, 12.7106f);
        instancePath.lineTo(7.79203f, 15.0538f);
        instancePath.cubicTo(7.67038f, 15.2667f, 7.66919f, 15.5278f, 7.7889f, 15.7419f);
        instancePath.cubicTo(7.9774f, 16.079f, 8.40344f, 16.1994f, 8.7405f, 16.0109f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.0f, 4.99995f);
        instancePath2.lineTo(5.0f, 19.0f);
        instancePath2.lineTo(19.0f, 19.0f);
        instancePath2.lineTo(19.0f, 9.99995f);
        instancePath2.lineTo(21.0f, 9.99995f);
        instancePath2.lineTo(21.0f, 20.0f);
        instancePath2.cubicTo(21.0f, 20.5522f, 20.5523f, 21.0f, 20.0f, 21.0f);
        instancePath2.lineTo(4.0f, 21.0f);
        instancePath2.cubicTo(3.44772f, 21.0f, 3.0f, 20.5522f, 3.0f, 20.0f);
        instancePath2.lineTo(3.0f, 3.99995f);
        instancePath2.cubicTo(3.0f, 3.44767f, 3.44772f, 2.99995f, 4.0f, 2.99995f);
        instancePath2.lineTo(14.0f, 2.99995f);
        instancePath2.lineTo(14.0f, 4.99995f);
        instancePath2.lineTo(5.0f, 4.99995f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
