package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class caption_lock_regular extends l95.c {
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
        instancePath.lineTo(21.5984f, 13.5462f);
        instancePath.cubicTo(21.2683f, 13.1424f, 20.8607f, 12.8042f, 20.3984f, 12.5545f);
        instancePath.lineTo(20.3984f, 6.9999f);
        instancePath.cubicTo(20.3984f, 6.2267f, 19.7716f, 5.5999f, 18.9984f, 5.5999f);
        instancePath.lineTo(4.99844f, 5.5999f);
        instancePath.cubicTo(4.22524f, 5.5999f, 3.59844f, 6.2267f, 3.59844f, 6.9999f);
        instancePath.lineTo(3.59844f, 16.9999f);
        instancePath.cubicTo(3.59844f, 17.7731f, 4.22524f, 18.3999f, 4.99844f, 18.3999f);
        instancePath.lineTo(13.5f, 18.3999f);
        instancePath.lineTo(13.5f, 19.5999f);
        instancePath.lineTo(4.99844f, 19.5999f);
        instancePath.cubicTo(3.5625f, 19.5999f, 2.39844f, 18.4358f, 2.39844f, 16.9999f);
        instancePath.lineTo(2.39844f, 6.9999f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.9984f, 14.3999f);
        instancePath2.lineTo(14.8671f, 14.3999f);
        instancePath2.cubicTo(14.7326f, 14.6909f, 14.6321f, 15.0007f, 14.5705f, 15.3244f);
        instancePath2.cubicTo(14.4526f, 15.4067f, 14.3421f, 15.499f, 14.2402f, 15.5999f);
        instancePath2.lineTo(11.9984f, 15.5999f);
        instancePath2.cubicTo(11.6671f, 15.5999f, 11.3984f, 15.3313f, 11.3984f, 14.9999f);
        instancePath2.cubicTo(11.3984f, 14.6685f, 11.6671f, 14.3999f, 11.9984f, 14.3999f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.99844f, 14.3999f);
        instancePath3.cubicTo(6.66707f, 14.3999f, 6.39844f, 14.6685f, 6.39844f, 14.9999f);
        instancePath3.cubicTo(6.39844f, 15.3313f, 6.66707f, 15.5999f, 6.99844f, 15.5999f);
        instancePath3.lineTo(8.99844f, 15.5999f);
        instancePath3.cubicTo(9.32981f, 15.5999f, 9.59844f, 15.3313f, 9.59844f, 14.9999f);
        instancePath3.cubicTo(9.59844f, 14.6685f, 9.32981f, 14.3999f, 8.99844f, 14.3999f);
        instancePath3.lineTo(6.99844f, 14.3999f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(21.0f, 16.0701f);
        instancePath4.cubicTo(21.0f, 14.6894f, 19.8807f, 13.5701f, 18.5f, 13.5701f);
        instancePath4.cubicTo(17.1193f, 13.5701f, 16.0f, 14.6894f, 16.0f, 16.0701f);
        instancePath4.lineTo(16.0f, 16.3695f);
        instancePath4.cubicTo(15.4477f, 16.3695f, 15.0f, 16.8173f, 15.0f, 17.3695f);
        instancePath4.lineTo(15.0f, 20.996f);
        instancePath4.cubicTo(15.0f, 21.5483f, 15.4477f, 21.996f, 16.0f, 21.996f);
        instancePath4.lineTo(21.0f, 21.996f);
        instancePath4.cubicTo(21.5523f, 21.996f, 22.0f, 21.5483f, 22.0f, 20.996f);
        instancePath4.lineTo(22.0f, 17.3695f);
        instancePath4.cubicTo(22.0f, 16.8173f, 21.5523f, 16.3695f, 21.0f, 16.3695f);
        instancePath4.lineTo(21.0f, 16.0701f);
        instancePath4.close();
        instancePath4.moveTo(16.2f, 20.7958f);
        instancePath4.lineTo(16.2f, 17.5688f);
        instancePath4.lineTo(20.8f, 17.5688f);
        instancePath4.lineTo(20.8f, 20.7958f);
        instancePath4.lineTo(16.2f, 20.7958f);
        instancePath4.close();
        instancePath4.moveTo(17.2067f, 15.9372f);
        instancePath4.cubicTo(17.2733f, 15.2816f, 17.8269f, 14.7701f, 18.5f, 14.7701f);
        instancePath4.lineTo(18.6329f, 14.7768f);
        instancePath4.cubicTo(19.2885f, 14.8434f, 19.8f, 15.397f, 19.8f, 16.0701f);
        instancePath4.lineTo(19.8f, 16.3691f);
        instancePath4.lineTo(17.199f, 16.3691f);
        instancePath4.lineTo(17.2f, 16.0701f);
        instancePath4.lineTo(17.2067f, 15.9372f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
