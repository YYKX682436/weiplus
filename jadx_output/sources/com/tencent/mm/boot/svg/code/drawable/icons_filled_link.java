package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_link extends l95.c {
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
        instancePath.moveTo(40.910156f, 29.636719f);
        instancePath.cubicTo(45.59375f, 34.32422f, 45.59375f, 41.921875f, 40.910156f, 46.60547f);
        instancePath.lineTo(28.179688f, 59.335938f);
        instancePath.cubicTo(23.496094f, 64.01953f, 15.898438f, 64.01953f, 11.210938f, 59.335938f);
        instancePath.cubicTo(6.523438f, 54.648438f, 6.523438f, 47.05078f, 11.210938f, 42.36328f);
        instancePath.lineTo(17.574219f, 36.0f);
        instancePath.lineTo(21.816406f, 40.242188f);
        instancePath.lineTo(15.453125f, 46.60547f);
        instancePath.cubicTo(13.109375f, 48.94922f, 13.109375f, 52.75f, 15.453125f, 55.09375f);
        instancePath.cubicTo(17.796875f, 57.433594f, 21.59375f, 57.433594f, 23.9375f, 55.09375f);
        instancePath.lineTo(36.66797f, 42.36328f);
        instancePath.cubicTo(39.007812f, 40.01953f, 39.007812f, 36.222656f, 36.66797f, 33.878906f);
        instancePath.close();
        instancePath.moveTo(57.878906f, 12.664062f);
        instancePath.cubicTo(62.566406f, 17.351562f, 62.566406f, 24.949219f, 57.878906f, 29.636719f);
        instancePath.lineTo(51.515625f, 36.0f);
        instancePath.lineTo(47.273438f, 31.757812f);
        instancePath.lineTo(53.63672f, 25.394531f);
        instancePath.cubicTo(55.98047f, 23.050781f, 55.98047f, 19.25f, 53.63672f, 16.90625f);
        instancePath.cubicTo(51.29297f, 14.566406f, 47.496094f, 14.566406f, 45.152344f, 16.90625f);
        instancePath.lineTo(32.421875f, 29.636719f);
        instancePath.cubicTo(30.082031f, 31.980469f, 30.082031f, 35.777344f, 32.421875f, 38.121094f);
        instancePath.lineTo(28.179688f, 42.36328f);
        instancePath.cubicTo(23.496094f, 37.67578f, 23.496094f, 30.078125f, 28.179688f, 25.394531f);
        instancePath.lineTo(40.910156f, 12.664062f);
        instancePath.cubicTo(45.59375f, 7.980469f, 53.191406f, 7.980469f, 57.878906f, 12.664062f);
        instancePath.close();
        instancePath.moveTo(57.878906f, 12.664062f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
