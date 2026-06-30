package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wecoin_balance_icons extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8727808);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.660116f, 5.9295855f);
                instancePath.cubicTo(13.89521f, 5.1705894f, 12.896751f, 4.7460914f, 11.80079f, 4.6335917f);
                instancePath.cubicTo(11.662472f, 4.96959f, 11.447815f, 5.349088f, 11.123562f, 5.793086f);
                instancePath.cubicTo(10.205221f, 7.0515804f, 8.798612f, 7.6478276f, 8.798612f, 7.6478276f);
                instancePath.cubicTo(8.798612f, 7.6478276f, 10.273247f, 6.090085f, 10.4478445f, 4.599842f);
                instancePath.cubicTo(10.534765f, 3.8580954f, 10.381331f, 2.9341f, 10.048763f, 2.6003513f);
                instancePath.cubicTo(9.850735f, 2.4001024f, 9.511364f, 2.5171018f, 9.483398f, 2.7961006f);
                instancePath.cubicTo(9.438804f, 3.2535982f, 9.267229f, 3.8798454f, 8.818263f, 4.4738426f);
                instancePath.cubicTo(8.458486f, 4.9500904f, 7.6950917f, 5.499088f, 7.422235f, 5.687337f);
                instancePath.cubicTo(6.764658f, 6.070585f, 6.130512f, 6.5505824f, 5.547763f, 7.12883f);
                instancePath.cubicTo(2.698263f, 9.956316f, 2.1570847f, 14.004797f, 4.3399377f, 16.170786f);
                instancePath.cubicTo(6.5220346f, 18.336027f, 10.602035f, 17.79978f, 13.451535f, 14.971542f);
                instancePath.cubicTo(16.30179f, 12.143306f, 16.842968f, 8.095575f, 14.660116f, 5.9295855f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
