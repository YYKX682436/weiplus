package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_feed_retransmission extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.8440943f, 7.672352f);
                instancePath.lineTo(6.25884f, 9.086903f);
                instancePath.cubicTo(5.48387f, 9.816408f, 5.0f, 10.851697f, 5.0f, 12.0f);
                instancePath.cubicTo(5.0f, 14.209139f, 6.790861f, 16.0f, 9.0f, 16.0f);
                instancePath.lineTo(13.447f, 15.998f);
                instancePath.lineTo(11.642458f, 14.333333f);
                instancePath.lineTo(13.0876665f, 13.0f);
                instancePath.lineTo(16.700687f, 16.333334f);
                instancePath.cubicTo(17.099771f, 16.701523f, 17.099771f, 17.298477f, 16.700687f, 17.666666f);
                instancePath.lineTo(13.0876665f, 21.0f);
                instancePath.lineTo(11.642458f, 19.666666f);
                instancePath.lineTo(13.447f, 18.0f);
                instancePath.lineTo(9.0f, 18.0f);
                instancePath.cubicTo(5.6862917f, 18.0f, 3.0f, 15.313708f, 3.0f, 12.0f);
                instancePath.cubicTo(3.0f, 10.299465f, 3.70745f, 8.764164f, 4.8440943f, 7.672352f);
                instancePath.close();
                instancePath.moveTo(12.357542f, 9.666667f);
                instancePath.lineTo(10.9123335f, 11.0f);
                instancePath.lineTo(7.2993126f, 7.6666665f);
                instancePath.cubicTo(6.900229f, 7.2984767f, 6.900229f, 6.7015233f, 7.2993126f, 6.3333335f);
                instancePath.lineTo(10.9123335f, 3.0f);
                instancePath.lineTo(12.357542f, 4.3333335f);
                instancePath.lineTo(10.551f, 6.0f);
                instancePath.lineTo(15.0f, 6.0f);
                instancePath.cubicTo(18.31371f, 6.0f, 21.0f, 8.686292f, 21.0f, 12.0f);
                instancePath.cubicTo(21.0f, 13.700535f, 20.292551f, 15.235836f, 19.155907f, 16.327648f);
                instancePath.lineTo(17.74116f, 14.913096f);
                instancePath.cubicTo(18.51613f, 14.183592f, 19.0f, 13.148303f, 19.0f, 12.0f);
                instancePath.cubicTo(19.0f, 9.790861f, 17.209139f, 8.0f, 15.0f, 8.0f);
                instancePath.lineTo(10.552f, 8.0f);
                instancePath.lineTo(12.357542f, 9.666667f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
