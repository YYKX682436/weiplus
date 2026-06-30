package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class doc_bubble_regular extends l95.c {
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
            instancePath.moveTo(17.167f, 13.6504f);
            instancePath.cubicTo(19.7043f, 13.6505f, 21.9336f, 15.417f, 21.9336f, 17.792f);
            instancePath.cubicTo(21.9334f, 20.1668f, 19.7042f, 21.9334f, 17.167f, 21.9336f);
            instancePath.cubicTo(16.724f, 21.9336f, 16.2944f, 21.878f, 15.8857f, 21.7793f);
            instancePath.lineTo(14.8389f, 22.2822f);
            instancePath.cubicTo(14.7012f, 22.3482f, 14.5471f, 22.3741f, 14.3955f, 22.3564f);
            instancePath.cubicTo(13.9523f, 22.3047f, 13.6351f, 21.9032f, 13.6865f, 21.46f);
            instancePath.lineTo(13.7744f, 20.7012f);
            instancePath.cubicTo(12.9394f, 19.966f, 12.4005f, 18.9444f, 12.4004f, 17.792f);
            instancePath.cubicTo(12.4004f, 15.4169f, 14.6296f, 13.6504f, 17.167f, 13.6504f);
            instancePath.close();
            instancePath.moveTo(17.167f, 14.8496f);
            instancePath.cubicTo(15.102f, 14.8496f, 13.5996f, 16.2551f, 13.5996f, 17.792f);
            instancePath.cubicTo(13.5997f, 18.6311f, 14.0311f, 19.4127f, 14.7686f, 19.9668f);
            instancePath.lineTo(15.0439f, 20.1729f);
            instancePath.lineTo(15.0039f, 20.5156f);
            instancePath.lineTo(14.96f, 20.8926f);
            instancePath.lineTo(15.5625f, 20.6035f);
            instancePath.lineTo(15.7695f, 20.5049f);
            instancePath.lineTo(15.9893f, 20.5684f);
            instancePath.cubicTo(16.3567f, 20.6748f, 16.753f, 20.7334f, 17.167f, 20.7334f);
            instancePath.cubicTo(19.2316f, 20.7333f, 20.7332f, 19.3287f, 20.7334f, 17.792f);
            instancePath.cubicTo(20.7334f, 16.2552f, 19.2318f, 14.8498f, 17.167f, 14.8496f);
            instancePath.close();
            instancePath.moveTo(16.5605f, 4.34961f);
            instancePath.lineTo(19.6006f, 7.2002f);
            instancePath.lineTo(19.6006f, 12.0f);
            instancePath.lineTo(18.46f, 12.0f);
            instancePath.lineTo(18.46f, 8.34766f);
            instancePath.lineTo(14.2578f, 8.34766f);
            instancePath.cubicTo(13.1562f, 8.34746f, 12.2627f, 7.45422f, 12.2627f, 6.35254f);
            instancePath.lineTo(12.2627f, 2.63965f);
            instancePath.lineTo(5.8252f, 2.63965f);
            instancePath.cubicTo(5.66795f, 2.63975f, 5.54014f, 2.76756f, 5.54004f, 2.9248f);
            instancePath.lineTo(5.54004f, 19.0752f);
            instancePath.cubicTo(5.54014f, 19.2324f, 5.66795f, 19.3602f, 5.8252f, 19.3604f);
            instancePath.lineTo(11.0f, 19.3604f);
            instancePath.lineTo(11.0f, 20.5f);
            instancePath.lineTo(5.8252f, 20.5f);
            instancePath.cubicTo(5.03834f, 20.4999f, 4.4005f, 19.862f, 4.40039f, 19.0752f);
            instancePath.lineTo(4.40039f, 2.9248f);
            instancePath.cubicTo(4.4005f, 2.13795f, 5.03834f, 1.50011f, 5.8252f, 1.5f);
            instancePath.lineTo(13.5205f, 1.5f);
            instancePath.lineTo(16.5605f, 4.34961f);
            instancePath.close();
            instancePath.moveTo(13.4033f, 6.35254f);
            instancePath.cubicTo(13.4033f, 6.82462f, 13.7858f, 7.20781f, 14.2578f, 7.20801f);
            instancePath.lineTo(17.9414f, 7.20801f);
            instancePath.lineTo(15.7803f, 5.18164f);
            instancePath.lineTo(13.4033f, 2.95312f);
            instancePath.lineTo(13.4033f, 6.35254f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
