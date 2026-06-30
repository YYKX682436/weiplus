package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class photo_accounts_medium extends l95.c {
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
        instancePath.moveTo(15.8528f, 4.00797f);
        instancePath.cubicTo(16.4435f, 2.99729f, 17.8973f, 2.9974f, 18.4881f, 4.00797f);
        instancePath.lineTo(22.399f, 10.7019f);
        instancePath.cubicTo(22.867f, 11.503f, 22.867f, 12.497f, 22.399f, 13.2982f);
        instancePath.lineTo(18.4881f, 19.9921f);
        instancePath.lineTo(18.3671f, 20.1694f);
        instancePath.cubicTo(17.7617f, 20.9436f, 16.5792f, 20.9435f, 15.9739f, 20.1694f);
        instancePath.lineTo(15.8528f, 19.9921f);
        instancePath.lineTo(12.0f, 13.3966f);
        instancePath.lineTo(8.14728f, 19.9921f);
        instancePath.lineTo(8.02622f, 20.1694f);
        instancePath.cubicTo(7.4209f, 20.9436f, 6.23835f, 20.9435f, 5.63302f, 20.1694f);
        instancePath.lineTo(5.51195f, 19.9921f);
        instancePath.lineTo(1.60109f, 13.2982f);
        instancePath.cubicTo(1.16239f, 12.547f, 1.13468f, 11.6261f, 1.51876f, 10.8538f);
        instancePath.lineTo(1.60109f, 10.7019f);
        instancePath.lineTo(5.51195f, 4.00797f);
        instancePath.cubicTo(6.10266f, 2.99729f, 7.55648f, 2.9974f, 8.14728f, 4.00797f);
        instancePath.lineTo(12.0f, 10.6025f);
        instancePath.lineTo(15.8528f, 4.00797f);
        instancePath.close();
        instancePath.moveTo(3.05483f, 11.5611f);
        instancePath.cubicTo(2.89668f, 11.8318f, 2.89684f, 12.1682f, 3.05483f, 12.4389f);
        instancePath.lineTo(6.82913f, 18.899f);
        instancePath.lineTo(10.8165f, 12.0755f);
        instancePath.cubicTo(10.8435f, 12.0291f, 10.8436f, 11.9709f, 10.8165f, 11.9245f);
        instancePath.lineTo(6.82913f, 5.10007f);
        instancePath.lineTo(3.05483f, 11.5611f);
        instancePath.close();
        instancePath.moveTo(13.1836f, 11.9245f);
        instancePath.cubicTo(13.1565f, 11.9708f, 13.1567f, 12.0291f, 13.1836f, 12.0755f);
        instancePath.lineTo(17.17f, 18.899f);
        instancePath.lineTo(20.9452f, 12.4389f);
        instancePath.cubicTo(21.1033f, 12.1681f, 21.1034f, 11.8319f, 20.9452f, 11.5611f);
        instancePath.lineTo(17.17f, 5.10007f);
        instancePath.lineTo(13.1836f, 11.9245f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
