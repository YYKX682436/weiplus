package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_profile_verified_news_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.99999f, 13.3333f);
                instancePath.cubicTo(10.9455f, 13.3333f, 13.3333f, 10.9455f, 13.3333f, 8.00001f);
                instancePath.cubicTo(13.3333f, 5.05449f, 10.9455f, 2.66667f, 7.99999f, 2.66667f);
                instancePath.cubicTo(5.05447f, 2.66667f, 2.66666f, 5.05449f, 2.66666f, 8.00001f);
                instancePath.cubicTo(2.66666f, 10.9455f, 5.05447f, 13.3333f, 7.99999f, 13.3333f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-65536);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(8.00003f, 14.8f);
                instancePath2.cubicTo(11.7556f, 14.8f, 14.8f, 11.7556f, 14.8f, 8.00002f);
                instancePath2.cubicTo(14.8f, 4.24448f, 11.7556f, 1.20003f, 8.00003f, 1.20003f);
                instancePath2.cubicTo(4.2445f, 1.20003f, 1.20004f, 4.24448f, 1.20004f, 8.00002f);
                instancePath2.cubicTo(1.20004f, 11.7556f, 4.2445f, 14.8f, 8.00003f, 14.8f);
                instancePath2.close();
                instancePath2.moveTo(7.96319f, 10.3807f);
                instancePath2.lineTo(6.09399f, 5.13331f);
                instancePath2.lineTo(4.66668f, 5.13331f);
                instancePath2.lineTo(7.19517f, 11.8f);
                instancePath2.lineTo(8.80134f, 11.8f);
                instancePath2.lineTo(11.3333f, 5.13331f);
                instancePath2.lineTo(9.90252f, 5.13331f);
                instancePath2.lineTo(8.03683f, 10.3807f);
                instancePath2.lineTo(7.96319f, 10.3807f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
