package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class weixin_store_filled extends l95.c {
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
            instancePath.moveTo(12.0098f, 21.5f);
            instancePath.lineTo(12.0f, 21.5f);
            instancePath.lineTo(12.0049f, 21.499f);
            instancePath.lineTo(12.0098f, 21.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(4.91992f, 14.5098f);
            instancePath2.cubicTo(5.46992f, 14.4198f, 5.9698f, 14.8104f, 6.0498f, 15.3604f);
            instancePath2.cubicTo(6.38995f, 17.7201f, 8.95008f, 19.4998f, 12.0098f, 19.5f);
            instancePath2.cubicTo(15.0696f, 19.5f, 17.6395f, 17.7201f, 17.9697f, 15.3604f);
            instancePath2.cubicTo(18.0497f, 14.8104f, 18.5506f, 14.4298f, 19.1006f, 14.5098f);
            instancePath2.cubicTo(19.6503f, 14.5899f, 20.03f, 15.0899f, 19.9502f, 15.6396f);
            instancePath2.cubicTo(19.4704f, 18.9784f, 16.0628f, 21.4971f, 12.0049f, 21.499f);
            instancePath2.cubicTo(7.95721f, 21.4968f, 4.54011f, 18.9782f, 4.07031f, 15.6396f);
            instancePath2.cubicTo(3.99053f, 15.0899f, 4.37016f, 14.5899f, 4.91992f, 14.5098f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(17.0f, 2.5f);
            instancePath3.cubicTo(18.2199f, 2.5f, 19.2702f, 3.22969f, 19.7402f, 4.26953f);
            instancePath3.lineTo(19.7803f, 4.36035f);
            instancePath3.lineTo(21.7402f, 8.66992f);
            instancePath3.cubicTo(21.9102f, 8.99991f, 22.0f, 9.36025f, 22.0f, 9.74023f);
            instancePath3.cubicTo(21.9999f, 11.0401f, 20.9196f, 12.1202f, 19.4697f, 12.4102f);
            instancePath3.cubicTo(19.2299f, 12.4601f, 18.97f, 12.4902f, 18.7002f, 12.4902f);
            instancePath3.cubicTo(18.0002f, 12.4902f, 17.3601f, 12.31f, 16.8301f, 12.0f);
            instancePath3.cubicTo(16.4701f, 11.8f, 16.1697f, 11.5304f, 15.9297f, 11.2305f);
            instancePath3.cubicTo(15.7097f, 10.9505f, 15.5497f, 10.6398f, 15.4697f, 10.2998f);
            instancePath3.cubicTo(15.4198f, 10.4796f, 15.3401f, 10.6497f, 15.2402f, 10.8096f);
            instancePath3.cubicTo(14.6502f, 11.7996f, 13.42f, 12.4902f, 12.0f, 12.4902f);
            instancePath3.cubicTo(10.58f, 12.4902f, 9.34953f, 11.7998f, 8.76953f, 10.7998f);
            instancePath3.cubicTo(8.66966f, 10.6399f, 8.59023f, 10.4699f, 8.53027f, 10.29f);
            instancePath3.cubicTo(8.45027f, 10.63f, 8.29031f, 10.9505f, 8.07031f, 11.2305f);
            instancePath3.cubicTo(7.84032f, 11.5304f, 7.52986f, 11.8f, 7.16992f, 12.0f);
            instancePath3.cubicTo(6.63993f, 12.31f, 5.99978f, 12.4902f, 5.2998f, 12.4902f);
            instancePath3.cubicTo(5.03989f, 12.4902f, 4.77996f, 12.4601f, 4.54004f, 12.4102f);
            instancePath3.cubicTo(3.09013f, 12.1302f, 2.00013f, 11.0401f, 2.0f, 9.74023f);
            instancePath3.cubicTo(2.0f, 9.38023f, 2.09023f, 9.02996f, 2.24023f, 8.70996f);
            instancePath3.lineTo(2.25977f, 8.66992f);
            instancePath3.lineTo(4.24023f, 4.33008f);
            instancePath3.lineTo(4.25977f, 4.28027f);
            instancePath3.cubicTo(4.72977f, 3.23027f, 5.78f, 2.5f, 7.0f, 2.5f);
            instancePath3.lineTo(17.0f, 2.5f);
            instancePath3.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
