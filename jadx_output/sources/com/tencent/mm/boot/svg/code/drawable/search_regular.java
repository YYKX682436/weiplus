package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class search_regular extends l95.c {
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
        instancePath.moveTo(9.89213f, 7.99999f);
        instancePath.cubicTo(9.66575f, 7.90944f, 9.53769f, 7.66882f, 9.58903f, 7.43048f);
        instancePath.lineTo(10.7811f, 1.89591f);
        instancePath.cubicTo(10.8443f, 1.60225f, 11.1504f, 1.43025f, 11.4341f, 1.52894f);
        instancePath.lineTo(12.6875f, 1.96489f);
        instancePath.cubicTo(12.9636f, 2.06091f, 13.0988f, 2.37224f, 12.9805f, 2.63951f);
        instancePath.lineTo(10.6953f, 7.80224f);
        instancePath.cubicTo(10.5864f, 8.04831f, 10.3023f, 8.16405f, 10.0524f, 8.06411f);
        instancePath.lineTo(9.89213f, 7.99999f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.1219f, 10.041f);
        instancePath2.cubicTo(12.1219f, 9.78902f, 12.3093f, 9.57644f, 12.5593f, 9.54489f);
        instancePath2.lineTo(21.8824f, 8.3682f);
        instancePath2.cubicTo(22.1727f, 8.33155f, 22.4324f, 8.55103f, 22.4445f, 8.84344f);
        instancePath2.lineTo(22.5f, 10.1742f);
        instancePath2.cubicTo(22.5119f, 10.4602f, 22.2818f, 10.6978f, 21.9956f, 10.695f);
        instancePath2.lineTo(12.6171f, 10.6049f);
        instancePath2.cubicTo(12.3428f, 10.6022f, 12.1219f, 10.3791f, 12.1219f, 10.1049f);
        instancePath2.lineTo(12.1219f, 10.041f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.70737f, 10.6079f);
        instancePath3.cubicTo(6.96085f, 10.6034f, 7.17089f, 10.41f, 7.19612f, 10.1577f);
        instancePath3.lineTo(7.20739f, 10.0451f);
        instancePath3.cubicTo(7.23272f, 9.79169f, 7.06361f, 9.55975f, 6.81463f, 9.5064f);
        instancePath3.lineTo(2.2057f, 8.51877f);
        instancePath3.cubicTo(1.91163f, 8.45576f, 1.62887f, 8.66474f, 1.60281f, 8.96436f);
        instancePath3.lineTo(1.49997f, 10.1471f);
        instancePath3.cubicTo(1.47426f, 10.4427f, 1.71017f, 10.6956f, 2.00686f, 10.6904f);
        instancePath3.lineTo(6.70737f, 10.6079f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(8.43629f, 13.2634f);
        instancePath4.cubicTo(8.69262f, 13.3403f, 8.84295f, 13.6054f, 8.77738f, 13.8649f);
        instancePath4.lineTo(6.72833f, 21.972f);
        instancePath4.cubicTo(6.65645f, 22.2563f, 6.35635f, 22.418f, 6.07931f, 22.3217f);
        instancePath4.lineTo(4.79696f, 21.8756f);
        instancePath4.cubicTo(4.52469f, 21.7809f, 4.38869f, 21.4762f, 4.5f, 21.2103f);
        instancePath4.lineTo(7.72084f, 13.5161f);
        instancePath4.cubicTo(7.81964f, 13.2801f, 8.08067f, 13.1567f, 8.32574f, 13.2303f);
        instancePath4.lineTo(8.43629f, 13.2634f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(12.1006f, 12.9641f);
        instancePath5.cubicTo(11.9272f, 12.7729f, 11.6368f, 12.7451f, 11.4303f, 12.9f);
        instancePath5.lineTo(11.3858f, 12.9333f);
        instancePath5.cubicTo(11.1684f, 13.0964f, 11.121f, 13.4033f, 11.2793f, 13.6243f);
        instancePath5.lineTo(17.4814f, 22.2891f);
        instancePath5.cubicTo(17.6505f, 22.5254f, 17.9848f, 22.5682f, 18.2081f, 22.3822f);
        instancePath5.lineTo(19.1941f, 21.5605f);
        instancePath5.cubicTo(19.4125f, 21.3785f, 19.4354f, 21.0511f, 19.2443f, 20.8405f);
        instancePath5.lineTo(12.1006f, 12.9641f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
