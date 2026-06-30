package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class likeeasteregg_regular extends l95.c {
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
        instancePath.moveTo(17.2256f, 12.3633f);
        instancePath.lineTo(17.1543f, 12.6162f);
        instancePath.lineTo(17.1484f, 12.6338f);
        instancePath.cubicTo(16.456f, 14.8161f, 14.414f, 16.399f, 12.001f, 16.3994f);
        instancePath.lineTo(11.9873f, 16.3994f);
        instancePath.lineTo(11.7666f, 16.3945f);
        instancePath.lineTo(11.7529f, 16.3936f);
        instancePath.cubicTo(9.36943f, 16.2856f, 7.38191f, 14.631f, 6.78418f, 12.4014f);
        instancePath.lineTo(6.78223f, 12.3945f);
        instancePath.lineTo(6.78027f, 12.3867f);
        instancePath.lineTo(6.76953f, 12.3398f);
        instancePath.lineTo(6.59082f, 11.5996f);
        instancePath.lineTo(17.4424f, 11.5996f);
        instancePath.lineTo(17.2256f, 12.3633f);
        instancePath.close();
        instancePath.moveTo(8.20703f, 12.7988f);
        instancePath.cubicTo(8.8547f, 14.1612f, 10.2125f, 15.1187f, 11.7969f, 15.1943f);
        instancePath.lineTo(12.0049f, 15.1982f);
        instancePath.cubicTo(13.6773f, 15.1964f, 15.1202f, 14.2165f, 15.7939f, 12.7988f);
        instancePath.lineTo(8.20703f, 12.7988f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.5f, 7.0f);
        instancePath2.cubicTo(9.32843f, 7.0f, 10.0f, 7.67157f, 10.0f, 8.5f);
        instancePath2.cubicTo(10.0f, 9.32843f, 9.32843f, 10.0f, 8.5f, 10.0f);
        instancePath2.cubicTo(7.67157f, 10.0f, 7.0f, 9.32843f, 7.0f, 8.5f);
        instancePath2.cubicTo(7.0f, 7.67157f, 7.67157f, 7.0f, 8.5f, 7.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(15.5f, 7.0f);
        instancePath3.cubicTo(16.3284f, 7.0f, 17.0f, 7.67157f, 17.0f, 8.5f);
        instancePath3.cubicTo(17.0f, 9.32843f, 16.3284f, 10.0f, 15.5f, 10.0f);
        instancePath3.cubicTo(14.6716f, 10.0f, 14.0f, 9.32843f, 14.0f, 8.5f);
        instancePath3.cubicTo(14.0f, 7.67157f, 14.6716f, 7.0f, 15.5f, 7.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(19.0f, 2.5f);
        instancePath4.cubicTo(20.3807f, 2.5f, 21.5f, 3.61929f, 21.5f, 5.0f);
        instancePath4.lineTo(21.5f, 17.5f);
        instancePath4.cubicTo(21.5f, 18.8807f, 20.3807f, 20.0f, 19.0f, 20.0f);
        instancePath4.lineTo(11.5f, 20.0f);
        instancePath4.lineTo(9.20703f, 22.29f);
        instancePath4.cubicTo(8.81652f, 22.6805f, 8.18348f, 22.6805f, 7.79297f, 22.29f);
        instancePath4.cubicTo(7.60543f, 22.1025f, 7.5f, 21.8551f, 7.5f, 21.5898f);
        instancePath4.lineTo(7.5f, 20.0f);
        instancePath4.lineTo(5.0f, 20.0f);
        instancePath4.cubicTo(3.61929f, 20.0f, 2.5f, 18.8807f, 2.5f, 17.5f);
        instancePath4.lineTo(2.5f, 5.0f);
        instancePath4.cubicTo(2.5f, 3.61929f, 3.61929f, 2.5f, 5.0f, 2.5f);
        instancePath4.lineTo(19.0f, 2.5f);
        instancePath4.close();
        instancePath4.moveTo(5.0f, 3.7002f);
        instancePath4.cubicTo(4.3269f, 3.7002f, 3.7736f, 4.21165f, 3.70703f, 4.86719f);
        instancePath4.lineTo(3.7002f, 5.0f);
        instancePath4.lineTo(3.7002f, 17.5f);
        instancePath4.cubicTo(3.7002f, 18.1731f, 4.21165f, 18.7264f, 4.86719f, 18.793f);
        instancePath4.lineTo(5.0f, 18.7998f);
        instancePath4.lineTo(8.7002f, 18.7998f);
        instancePath4.lineTo(8.69922f, 21.0996f);
        instancePath4.lineTo(11.0029f, 18.7998f);
        instancePath4.lineTo(19.0f, 18.7998f);
        instancePath4.cubicTo(19.6731f, 18.7998f, 20.2264f, 18.2883f, 20.293f, 17.6328f);
        instancePath4.lineTo(20.2998f, 17.5f);
        instancePath4.lineTo(20.2998f, 5.0f);
        instancePath4.cubicTo(20.2998f, 4.3269f, 19.7883f, 3.7736f, 19.1328f, 3.70703f);
        instancePath4.lineTo(19.0f, 3.7002f);
        instancePath4.lineTo(5.0f, 3.7002f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
