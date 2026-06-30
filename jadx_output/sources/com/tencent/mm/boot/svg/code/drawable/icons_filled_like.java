package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_like extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(13.606602f, 17.334524f);
            instancePath.cubicTo(19.464466f, 11.47666f, 28.96194f, 11.47666f, 34.819805f, 17.334524f);
            instancePath.cubicTo(35.368225f, 17.882944f, 36.075333f, 18.565023f, 36.941124f, 19.380762f);
            instancePath.cubicTo(37.80692f, 18.565023f, 38.514027f, 17.882944f, 39.062447f, 17.334524f);
            instancePath.cubicTo(44.92031f, 11.47666f, 54.417786f, 11.47666f, 60.27565f, 17.334524f);
            instancePath.cubicTo(66.079025f, 23.137897f, 66.133f, 32.51349f, 60.4376f, 38.38332f);
            instancePath.lineTo(39.062447f, 59.76093f);
            instancePath.cubicTo(37.890934f, 60.932564f, 35.99144f, 60.932663f, 34.819805f, 59.761154f);
            instancePath.cubicTo(34.819767f, 59.761116f, 34.819733f, 59.761078f, 34.819695f, 59.761044f);
            instancePath.lineTo(13.443423f, 38.38455f);
            instancePath.cubicTo(7.749244f, 32.51349f, 7.803227f, 23.137897f, 13.606602f, 17.334524f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
