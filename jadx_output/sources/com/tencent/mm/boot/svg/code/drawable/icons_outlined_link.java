package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_link extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(52.96875f, 36.0f);
        instancePath.lineTo(50.42578f, 33.453125f);
        instancePath.lineTo(56.789062f, 27.089844f);
        instancePath.cubicTo(60.070312f, 23.808594f, 60.070312f, 18.492188f, 56.789062f, 15.210938f);
        instancePath.cubicTo(53.507812f, 11.929688f, 48.191406f, 11.929688f, 44.910156f, 15.210938f);
        instancePath.lineTo(33.242188f, 26.878906f);
        instancePath.cubicTo(29.960938f, 30.160156f, 29.960938f, 35.476562f, 33.242188f, 38.757812f);
        instancePath.lineTo(30.695312f, 41.304688f);
        instancePath.cubicTo(26.011719f, 36.617188f, 26.011719f, 29.019531f, 30.695312f, 24.332031f);
        instancePath.lineTo(42.36328f, 12.664062f);
        instancePath.cubicTo(47.05078f, 7.980469f, 54.648438f, 7.980469f, 59.335938f, 12.664062f);
        instancePath.cubicTo(64.01953f, 17.351562f, 64.01953f, 24.949219f, 59.335938f, 29.636719f);
        instancePath.close();
        instancePath.moveTo(19.03125f, 36.0f);
        instancePath.lineTo(21.574219f, 38.546875f);
        instancePath.lineTo(15.210938f, 44.910156f);
        instancePath.cubicTo(11.929688f, 48.191406f, 11.929688f, 53.507812f, 15.210938f, 56.789062f);
        instancePath.cubicTo(18.492188f, 60.070312f, 23.808594f, 60.070312f, 27.089844f, 56.789062f);
        instancePath.lineTo(38.757812f, 45.121094f);
        instancePath.cubicTo(42.039062f, 41.839844f, 42.039062f, 36.523438f, 38.757812f, 33.242188f);
        instancePath.lineTo(41.304688f, 30.695312f);
        instancePath.cubicTo(45.98828f, 35.382812f, 45.98828f, 42.98047f, 41.304688f, 47.66797f);
        instancePath.lineTo(29.636719f, 59.335938f);
        instancePath.cubicTo(24.949219f, 64.01953f, 17.351562f, 64.01953f, 12.664062f, 59.335938f);
        instancePath.cubicTo(7.980469f, 54.648438f, 7.980469f, 47.05078f, 12.664062f, 42.36328f);
        instancePath.close();
        instancePath.moveTo(19.03125f, 36.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
