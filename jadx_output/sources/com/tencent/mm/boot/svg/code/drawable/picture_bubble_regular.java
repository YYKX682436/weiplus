package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class picture_bubble_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.167f, 13.6504f);
            instancePath.cubicTo(20.7043f, 13.6505f, 22.9336f, 15.417f, 22.9336f, 17.792f);
            instancePath.cubicTo(22.9334f, 20.1668f, 20.7042f, 21.9334f, 18.167f, 21.9336f);
            instancePath.cubicTo(17.724f, 21.9336f, 17.2944f, 21.878f, 16.8857f, 21.7793f);
            instancePath.lineTo(15.8389f, 22.2822f);
            instancePath.cubicTo(15.7012f, 22.3482f, 15.5471f, 22.3741f, 15.3955f, 22.3564f);
            instancePath.cubicTo(14.9523f, 22.3047f, 14.6351f, 21.9032f, 14.6865f, 21.46f);
            instancePath.lineTo(14.7744f, 20.7012f);
            instancePath.cubicTo(13.9394f, 19.966f, 13.4005f, 18.9444f, 13.4004f, 17.792f);
            instancePath.cubicTo(13.4004f, 15.4169f, 15.6296f, 13.6504f, 18.167f, 13.6504f);
            instancePath.close();
            instancePath.moveTo(18.167f, 14.8496f);
            instancePath.cubicTo(16.102f, 14.8496f, 14.5996f, 16.2551f, 14.5996f, 17.792f);
            instancePath.cubicTo(14.5997f, 18.6311f, 15.0311f, 19.4127f, 15.7686f, 19.9668f);
            instancePath.lineTo(16.0439f, 20.1729f);
            instancePath.lineTo(16.0039f, 20.5156f);
            instancePath.lineTo(15.96f, 20.8926f);
            instancePath.lineTo(16.5625f, 20.6035f);
            instancePath.lineTo(16.7695f, 20.5049f);
            instancePath.lineTo(16.9893f, 20.5684f);
            instancePath.cubicTo(17.3567f, 20.6748f, 17.753f, 20.7334f, 18.167f, 20.7334f);
            instancePath.cubicTo(20.2316f, 20.7333f, 21.7332f, 19.3287f, 21.7334f, 17.792f);
            instancePath.cubicTo(21.7334f, 16.2552f, 20.2318f, 14.8498f, 18.167f, 14.8496f);
            instancePath.close();
            instancePath.moveTo(20.5576f, 3.39941f);
            instancePath.cubicTo(21.0672f, 3.39941f, 21.4998f, 3.85725f, 21.5f, 4.4209f);
            instancePath.lineTo(21.5f, 12.0f);
            instancePath.lineTo(20.3604f, 12.0f);
            instancePath.lineTo(20.3604f, 4.54004f);
            instancePath.lineTo(3.63965f, 4.54004f);
            instancePath.lineTo(3.63965f, 12.9883f);
            instancePath.lineTo(8.38965f, 9.14746f);
            instancePath.cubicTo(8.829f, 8.79219f, 9.53442f, 8.80869f, 9.95801f, 9.18066f);
            instancePath.lineTo(14.1387f, 12.8545f);
            instancePath.lineTo(13.4248f, 13.4258f);
            instancePath.lineTo(13.2695f, 13.5801f);
            instancePath.lineTo(9.15527f, 9.99316f);
            instancePath.lineTo(3.63965f, 14.4541f);
            instancePath.lineTo(3.63965f, 17.46f);
            instancePath.lineTo(11.1299f, 17.46f);
            instancePath.lineTo(11.0498f, 17.7002f);
            instancePath.lineTo(11.0498f, 18.6006f);
            instancePath.lineTo(3.44238f, 18.6006f);
            instancePath.cubicTo(2.93286f, 18.6006f, 2.50025f, 18.1427f, 2.5f, 17.5791f);
            instancePath.lineTo(2.5f, 4.4209f);
            instancePath.cubicTo(2.5002f, 3.85508f, 2.92214f, 3.39941f, 3.44238f, 3.39941f);
            instancePath.lineTo(20.5576f, 3.39941f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
