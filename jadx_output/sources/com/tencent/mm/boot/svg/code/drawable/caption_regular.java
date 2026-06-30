package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class caption_regular extends l95.c {
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
        instancePath.moveTo(2.39844f, 6.9999f);
        instancePath.cubicTo(2.39844f, 5.56396f, 3.5625f, 4.3999f, 4.99844f, 4.3999f);
        instancePath.lineTo(18.9984f, 4.3999f);
        instancePath.cubicTo(20.4344f, 4.3999f, 21.5984f, 5.56396f, 21.5984f, 6.9999f);
        instancePath.lineTo(21.5984f, 16.9999f);
        instancePath.cubicTo(21.5984f, 18.4358f, 20.4344f, 19.5999f, 18.9984f, 19.5999f);
        instancePath.lineTo(4.99844f, 19.5999f);
        instancePath.cubicTo(3.5625f, 19.5999f, 2.39844f, 18.4358f, 2.39844f, 16.9999f);
        instancePath.lineTo(2.39844f, 6.9999f);
        instancePath.close();
        instancePath.moveTo(4.99844f, 5.5999f);
        instancePath.cubicTo(4.22524f, 5.5999f, 3.59844f, 6.2267f, 3.59844f, 6.9999f);
        instancePath.lineTo(3.59844f, 16.9999f);
        instancePath.cubicTo(3.59844f, 17.7731f, 4.22524f, 18.3999f, 4.99844f, 18.3999f);
        instancePath.lineTo(18.9984f, 18.3999f);
        instancePath.cubicTo(19.7716f, 18.3999f, 20.3984f, 17.7731f, 20.3984f, 16.9999f);
        instancePath.lineTo(20.3984f, 6.9999f);
        instancePath.cubicTo(20.3984f, 6.2267f, 19.7716f, 5.5999f, 18.9984f, 5.5999f);
        instancePath.lineTo(4.99844f, 5.5999f);
        instancePath.close();
        instancePath.moveTo(16.9984f, 15.5999f);
        instancePath.lineTo(11.9984f, 15.5999f);
        instancePath.cubicTo(11.6671f, 15.5999f, 11.3984f, 15.3313f, 11.3984f, 14.9999f);
        instancePath.cubicTo(11.3984f, 14.6685f, 11.6671f, 14.3999f, 11.9984f, 14.3999f);
        instancePath.lineTo(16.9984f, 14.3999f);
        instancePath.cubicTo(17.3298f, 14.3999f, 17.5984f, 14.6685f, 17.5984f, 14.9999f);
        instancePath.cubicTo(17.5984f, 15.3313f, 17.3298f, 15.5999f, 16.9984f, 15.5999f);
        instancePath.close();
        instancePath.moveTo(6.99844f, 14.3999f);
        instancePath.cubicTo(6.66707f, 14.3999f, 6.39844f, 14.6685f, 6.39844f, 14.9999f);
        instancePath.cubicTo(6.39844f, 15.3313f, 6.66707f, 15.5999f, 6.99844f, 15.5999f);
        instancePath.lineTo(8.99844f, 15.5999f);
        instancePath.cubicTo(9.32981f, 15.5999f, 9.59844f, 15.3313f, 9.59844f, 14.9999f);
        instancePath.cubicTo(9.59844f, 14.6685f, 9.32981f, 14.3999f, 8.99844f, 14.3999f);
        instancePath.lineTo(6.99844f, 14.3999f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
