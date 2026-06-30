package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_item_app_liteapp_ask_icon extends l95.c {
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
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16268960);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.10714f, 18.1716f);
        instancePath3.lineTo(8.66736f, 18.0445f);
        instancePath3.lineTo(6.4161f, 19.1223f);
        instancePath3.lineTo(6.65116f, 17.1032f);
        instancePath3.lineTo(6.1005f, 16.69f);
        instancePath3.cubicTo(4.25683f, 15.3069f, 3.1999f, 13.3597f, 3.1999f, 11.2869f);
        instancePath3.cubicTo(3.1999f, 7.30841f, 7.10047f, 3.99795f, 11.9999f, 3.99795f);
        instancePath3.cubicTo(16.8993f, 3.99795f, 20.7999f, 7.30841f, 20.7999f, 11.2869f);
        instancePath3.cubicTo(20.7999f, 15.2654f, 16.8993f, 18.5758f, 11.9999f, 18.5758f);
        instancePath3.cubicTo(11.0021f, 18.5758f, 10.0284f, 18.438f, 9.10714f, 18.1716f);
        instancePath3.close();
        instancePath3.moveTo(8.77345f, 19.3225f);
        instancePath3.cubicTo(9.78573f, 19.6152f, 10.871f, 19.774f, 12.0f, 19.774f);
        instancePath3.cubicTo(17.5228f, 19.774f, 22.0f, 15.9742f, 22.0f, 11.2869f);
        instancePath3.cubicTo(22.0f, 6.59961f, 17.5228f, 2.7998f, 12.0f, 2.7998f);
        instancePath3.cubicTo(6.47715f, 2.7998f, 2.0f, 6.59961f, 2.0f, 11.2869f);
        instancePath3.cubicTo(2.0f, 13.8195f, 3.307f, 16.0929f, 5.37976f, 17.648f);
        instancePath3.lineTo(5.07766f, 20.2429f);
        instancePath3.cubicTo(5.04577f, 20.5168f, 5.24229f, 20.7646f, 5.51658f, 20.7965f);
        instancePath3.cubicTo(5.61038f, 20.8074f, 5.70535f, 20.7915f, 5.7905f, 20.7507f);
        instancePath3.lineTo(8.77345f, 19.3225f);
        instancePath3.close();
        instancePath3.moveTo(12.6014f, 13.0504f);
        instancePath3.lineTo(12.6014f, 13.1536f);
        instancePath3.lineTo(11.2455f, 13.1536f);
        instancePath3.lineTo(11.2455f, 13.0504f);
        instancePath3.cubicTo(11.2455f, 12.6078f, 11.3163f, 12.2234f, 11.4814f, 11.9089f);
        instancePath3.cubicTo(11.6346f, 11.5943f, 12.0945f, 11.1051f, 12.8608f, 10.4294f);
        instancePath3.lineTo(13.0023f, 10.2663f);
        instancePath3.cubicTo(13.2145f, 10.0101f, 13.3207f, 9.73049f, 13.3207f, 9.43927f);
        instancePath3.cubicTo(13.3207f, 9.05485f, 13.2028f, 8.75198f, 12.9905f, 8.53065f);
        instancePath3.cubicTo(12.7665f, 8.30932f, 12.4482f, 8.20448f, 12.0473f, 8.20448f);
        instancePath3.cubicTo(11.5285f, 8.20448f, 11.163f, 8.35592f, 10.939f, 8.68209f);
        instancePath3.cubicTo(10.7386f, 8.95001f, 10.6442f, 9.33443f, 10.6442f, 9.82368f);
        instancePath3.lineTo(9.30013f, 9.82368f);
        instancePath3.cubicTo(9.30013f, 8.96166f, 9.54773f, 8.28602f, 10.0665f, 7.79676f);
        instancePath3.cubicTo(10.5735f, 7.30751f, 11.2573f, 7.06288f, 12.1298f, 7.06288f);
        instancePath3.cubicTo(12.8962f, 7.06288f, 13.5211f, 7.26091f, 13.9927f, 7.68027f);
        instancePath3.cubicTo(14.4643f, 8.08799f, 14.7001f, 8.64714f, 14.7001f, 9.35773f);
        instancePath3.cubicTo(14.7001f, 9.94017f, 14.5469f, 10.4178f, 14.2639f, 10.7906f);
        instancePath3.cubicTo(14.1578f, 10.907f, 13.8159f, 11.2216f, 13.2499f, 11.7108f);
        instancePath3.cubicTo(13.0377f, 11.8856f, 12.8844f, 12.0836f, 12.7783f, 12.2933f);
        instancePath3.cubicTo(12.6604f, 12.5262f, 12.6014f, 12.7709f, 12.6014f, 13.0504f);
        instancePath3.close();
        instancePath3.moveTo(12.633f, 15.4165f);
        instancePath3.cubicTo(12.4588f, 15.5721f, 12.2498f, 15.6498f, 11.9943f, 15.6498f);
        instancePath3.cubicTo(11.7388f, 15.6498f, 11.5298f, 15.561f, 11.3556f, 15.4054f);
        instancePath3.cubicTo(11.1814f, 15.2499f, 11.1001f, 15.05f, 11.1001f, 14.8056f);
        instancePath3.cubicTo(11.1001f, 14.5612f, 11.1814f, 14.3612f, 11.3556f, 14.2057f);
        instancePath3.cubicTo(11.5298f, 14.0501f, 11.7388f, 13.9724f, 11.9943f, 13.9724f);
        instancePath3.cubicTo(12.2498f, 13.9724f, 12.4705f, 14.0501f, 12.6446f, 14.2057f);
        instancePath3.cubicTo(12.8072f, 14.3612f, 12.9001f, 14.5612f, 12.9001f, 14.8056f);
        instancePath3.cubicTo(12.9001f, 15.05f, 12.8072f, 15.261f, 12.633f, 15.4165f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
