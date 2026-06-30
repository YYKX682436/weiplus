package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class person_2_regular extends l95.c {
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
        instancePath.moveTo(6.5f, 8.70929f);
        instancePath.cubicTo(6.5f, 9.8495f, 7.09632f, 11.4783f, 7.83191f, 12.3501f);
        instancePath.lineTo(8.19345f, 12.7786f);
        instancePath.cubicTo(8.78626f, 13.4813f, 8.59538f, 14.3685f, 7.77445f, 14.7691f);
        instancePath.lineTo(2.1141f, 17.5313f);
        instancePath.cubicTo(1.49815f, 17.8319f, 1.0f, 18.6304f, 1.0f, 19.3155f);
        instancePath.lineTo(1.0f, 20.0016f);
        instancePath.cubicTo(1.0f, 20.5558f, 1.44836f, 21.0f, 2.00143f, 21.0f);
        instancePath.lineTo(18.9986f, 21.0f);
        instancePath.cubicTo(19.5491f, 21.0f, 20.0f, 20.553f, 20.0f, 20.0016f);
        instancePath.lineTo(20.0f, 19.3155f);
        instancePath.cubicTo(20.0f, 19.212f, 19.9888f, 19.1061f, 19.9676f, 19.0f);
        instancePath.lineTo(22.1567f, 19.0f);
        instancePath.cubicTo(22.6203f, 19.0f, 23.0f, 18.6275f, 23.0f, 18.168f);
        instancePath.lineTo(23.0f, 17.5962f);
        instancePath.cubicTo(23.0f, 17.021f, 22.58f, 16.3597f, 22.0618f, 16.1096f);
        instancePath.lineTo(17.2952f, 13.8088f);
        instancePath.cubicTo(16.601f, 13.4737f, 16.4459f, 12.7325f, 16.9424f, 12.1501f);
        instancePath.lineTo(17.2468f, 11.793f);
        instancePath.cubicTo(17.8639f, 11.069f, 18.3684f, 9.70775f, 18.3684f, 8.75849f);
        instancePath.lineTo(18.3684f, 7.33351f);
        instancePath.cubicTo(18.3684f, 5.49415f, 16.8603f, 4.0f, 15.0f, 4.0f);
        instancePath.cubicTo(14.46f, 4.0f, 13.9491f, 4.12626f, 13.4961f, 4.35064f);
        instancePath.cubicTo(12.7632f, 3.52251f, 11.6926f, 3.0f, 10.5f, 3.0f);
        instancePath.cubicTo(8.29536f, 3.0f, 6.5f, 4.79067f, 6.5f, 6.99958f);
        instancePath.lineTo(6.5f, 8.70929f);
        instancePath.close();
        instancePath.moveTo(18.8f, 19.8f);
        instancePath.lineTo(2.2f, 19.8f);
        instancePath.lineTo(2.2f, 19.3155f);
        instancePath.cubicTo(2.2f, 19.0887f, 2.43702f, 18.709f, 2.64037f, 18.6098f);
        instancePath.lineTo(8.30072f, 15.8476f);
        instancePath.cubicTo(9.82521f, 15.1037f, 10.2066f, 13.3039f, 9.11061f, 12.0048f);
        instancePath.lineTo(8.74908f, 11.5763f);
        instancePath.cubicTo(8.19575f, 10.9205f, 7.7f, 9.56566f, 7.7f, 8.70929f);
        instancePath.lineTo(7.7f, 6.99958f);
        instancePath.cubicTo(7.7f, 5.4552f, 8.95631f, 4.2f, 10.5f, 4.2f);
        instancePath.cubicTo(12.0456f, 4.2f, 13.3f, 5.45491f, 13.3f, 7.00021f);
        instancePath.lineTo(13.3f, 8.71019f);
        instancePath.cubicTo(13.3f, 9.56439f, 12.8022f, 10.9243f, 12.2509f, 11.5778f);
        instancePath.lineTo(11.8893f, 12.0064f);
        instancePath.cubicTo(10.7956f, 13.3029f, 11.1729f, 15.1044f, 12.6995f, 15.849f);
        instancePath.lineTo(18.3598f, 18.6101f);
        instancePath.cubicTo(18.5647f, 18.71f, 18.8f, 19.0861f, 18.8f, 19.3155f);
        instancePath.lineTo(18.8f, 19.8f);
        instancePath.close();
        instancePath.moveTo(14.1532f, 5.36931f);
        instancePath.cubicTo(14.3761f, 5.86753f, 14.5f, 6.41954f, 14.5f, 7.00021f);
        instancePath.lineTo(14.5f, 8.71019f);
        instancePath.cubicTo(14.5f, 9.8493f, 13.9009f, 11.4829f, 13.1681f, 12.3516f);
        instancePath.lineTo(12.8066f, 12.7801f);
        instancePath.cubicTo(12.217f, 13.479f, 12.4012f, 14.3684f, 13.2255f, 14.7705f);
        instancePath.lineTo(18.8859f, 17.5316f);
        instancePath.cubicTo(19.0234f, 17.5986f, 19.1551f, 17.6903f, 19.2767f, 17.8f);
        instancePath.lineTo(21.8f, 17.8f);
        instancePath.lineTo(21.8f, 17.5962f);
        instancePath.cubicTo(21.8f, 17.4846f, 21.6463f, 17.2416f, 21.5402f, 17.1903f);
        instancePath.lineTo(16.7735f, 14.8894f);
        instancePath.cubicTo(15.3728f, 14.2133f, 15.0215f, 12.5536f, 16.0292f, 11.3716f);
        instancePath.lineTo(16.3336f, 11.0145f);
        instancePath.cubicTo(16.7668f, 10.5063f, 17.1684f, 9.42061f, 17.1684f, 8.75849f);
        instancePath.lineTo(17.1684f, 7.33351f);
        instancePath.cubicTo(17.1684f, 6.15903f, 16.1997f, 5.2f, 15.0f, 5.2f);
        instancePath.cubicTo(14.6995f, 5.2f, 14.4133f, 5.26035f, 14.1532f, 5.36931f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
