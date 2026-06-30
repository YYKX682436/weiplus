package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_ad_link_tag_weapp extends l95.c {
    private final int width = 13;
    private final int height = 13;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 13;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(1275068416);
            instancePaint3.setColor(1275068416);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.70469f, 3.08218f);
            instancePath.cubicTo(7.70271f, 3.08218f, 6.98753f, 3.7955f, 6.98753f, 4.56227f);
            instancePath.lineTo(6.98783f, 8.4338f);
            instancePath.cubicTo(6.98783f, 9.84038f, 5.72888f, 10.8889f, 4.29567f, 10.8889f);
            instancePath.cubicTo(2.86246f, 10.8889f, 1.60352f, 9.84038f, 1.60352f, 8.4338f);
            instancePath.cubicTo(1.60352f, 7.19584f, 2.57871f, 6.23524f, 3.78962f, 6.02272f);
            instancePath.cubicTo(4.2515f, 5.94165f, 4.49641f, 6.25905f, 4.34823f, 6.60476f);
            instancePath.cubicTo(4.25225f, 6.82869f, 4.05378f, 6.96816f, 3.75534f, 7.05311f);
            instancePath.cubicTo(3.05156f, 7.25343f, 2.57852f, 7.81917f, 2.57852f, 8.4338f);
            instancePath.cubicTo(2.57852f, 9.20057f, 3.29369f, 9.9139f, 4.29567f, 9.9139f);
            instancePath.cubicTo(5.29765f, 9.9139f, 6.01283f, 9.20057f, 6.01283f, 8.4338f);
            instancePath.lineTo(6.01253f, 4.56227f);
            instancePath.cubicTo(6.01253f, 3.1557f, 7.27148f, 2.10718f, 8.70469f, 2.10718f);
            instancePath.cubicTo(10.1379f, 2.10718f, 11.3968f, 3.1557f, 11.3968f, 4.56227f);
            instancePath.cubicTo(11.3968f, 5.80023f, 10.4216f, 6.76084f, 9.21074f, 6.97336f);
            instancePath.cubicTo(8.74886f, 7.05442f, 8.50395f, 6.73702f, 8.65213f, 6.39132f);
            instancePath.cubicTo(8.74811f, 6.16738f, 8.94658f, 6.02791f, 9.24502f, 5.94297f);
            instancePath.cubicTo(9.9488f, 5.74265f, 10.4218f, 5.1769f, 10.4218f, 4.56227f);
            instancePath.cubicTo(10.4218f, 3.7955f, 9.70667f, 3.08218f, 8.70469f, 3.08218f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
