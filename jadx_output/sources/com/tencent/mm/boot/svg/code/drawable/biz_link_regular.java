package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_link_regular extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(17.6569f, 12.0f);
                instancePath.lineTo(16.8084f, 11.1515f);
                instancePath.lineTo(18.9297f, 9.03013f);
                instancePath.cubicTo(20.0232f, 7.93666f, 20.0232f, 6.1638f, 18.9297f, 5.07033f);
                instancePath.cubicTo(17.8362f, 3.97686f, 16.0634f, 3.97686f, 14.9699f, 5.07033f);
                instancePath.lineTo(11.0808f, 8.95942f);
                instancePath.cubicTo(9.98733f, 10.0529f, 9.98733f, 11.8258f, 11.0808f, 12.9192f);
                instancePath.lineTo(10.2323f, 13.7677f);
                instancePath.cubicTo(8.67018f, 12.2056f, 8.67018f, 9.67299f, 10.2323f, 8.11089f);
                instancePath.lineTo(14.1214f, 4.2218f);
                instancePath.cubicTo(15.6835f, 2.65971f, 18.2161f, 2.65971f, 19.7782f, 4.2218f);
                instancePath.cubicTo(21.3403f, 5.7839f, 21.3403f, 8.31656f, 19.7782f, 9.87866f);
                instancePath.lineTo(17.6569f, 12.0f);
                instancePath.close();
                instancePath.moveTo(6.34319f, 12.0f);
                instancePath.lineTo(7.19171f, 12.8485f);
                instancePath.lineTo(5.07039f, 14.9698f);
                instancePath.cubicTo(3.97693f, 16.0633f, 3.97693f, 17.8362f, 5.07039f, 18.9296f);
                instancePath.cubicTo(6.16386f, 20.0231f, 7.93672f, 20.0231f, 9.03019f, 18.9296f);
                instancePath.lineTo(12.9193f, 15.0405f);
                instancePath.cubicTo(14.0127f, 13.9471f, 14.0127f, 12.1742f, 12.9193f, 11.0807f);
                instancePath.lineTo(13.7678f, 10.2322f);
                instancePath.cubicTo(15.3299f, 11.7943f, 15.3299f, 14.327f, 13.7678f, 15.8891f);
                instancePath.lineTo(9.87872f, 19.7782f);
                instancePath.cubicTo(8.31662f, 21.3403f, 5.78396f, 21.3403f, 4.22187f, 19.7782f);
                instancePath.cubicTo(2.65977f, 18.2161f, 2.65977f, 15.6834f, 4.22187f, 14.1213f);
                instancePath.lineTo(6.34319f, 12.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
