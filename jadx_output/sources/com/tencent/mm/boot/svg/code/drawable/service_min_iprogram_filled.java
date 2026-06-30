package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class service_min_iprogram_filled extends l95.c {
    private final int width = 24;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 25;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.21068f, 12.4699f);
            instancePath.cubicTo(8.21156f, 12.791f, 8.04805f, 13.072f, 7.81964f, 13.288f);
            instancePath.cubicTo(7.59123f, 13.5039f, 7.29403f, 13.6588f, 7.01676f, 13.7281f);
            instancePath.cubicTo(5.73461f, 14.0376f, 4.85605f, 15.0381f, 4.85605f, 16.1603f);
            instancePath.cubicTo(4.85605f, 17.5674f, 6.20241f, 18.7276f, 7.90253f, 18.7276f);
            instancePath.cubicTo(9.60265f, 18.7276f, 10.949f, 17.5674f, 10.949f, 16.1603f);
            instancePath.lineTo(10.949f, 8.97183f);
            instancePath.cubicTo(10.949f, 6.40767f, 13.2393f, 4.35059f, 16.0495f, 4.35059f);
            instancePath.cubicTo(18.8597f, 4.35059f, 21.15f, 6.40767f, 21.15f, 8.97183f);
            instancePath.cubicTo(21.15f, 11.2313f, 19.418f, 13.1223f, 17.0128f, 13.5406f);
            instancePath.cubicTo(16.6413f, 13.6052f, 16.2615f, 13.5246f, 16.0189f, 13.317f);
            instancePath.cubicTo(15.897f, 13.2125f, 15.8098f, 13.0759f, 15.7778f, 12.9109f);
            instancePath.cubicTo(15.7459f, 12.7462f, 15.7696f, 12.5571f, 15.8622f, 12.3485f);
            instancePath.cubicTo(16.0528f, 11.9043f, 16.4807f, 11.5637f, 16.984f, 11.4517f);
            instancePath.cubicTo(18.2746f, 11.14f, 19.1439f, 10.1341f, 19.1439f, 8.97183f);
            instancePath.cubicTo(19.1439f, 7.56479f, 17.7975f, 6.40458f, 16.0974f, 6.40458f);
            instancePath.cubicTo(14.3973f, 6.40458f, 13.0509f, 7.56479f, 13.0509f, 8.97183f);
            instancePath.lineTo(13.0509f, 16.1603f);
            instancePath.cubicTo(13.0509f, 18.7245f, 10.7606f, 20.7816f, 7.95046f, 20.7816f);
            instancePath.cubicTo(5.1403f, 20.7816f, 2.84998f, 18.7245f, 2.84998f, 16.1603f);
            instancePath.cubicTo(2.84998f, 13.9124f, 4.62359f, 11.999f, 7.03245f, 11.6355f);
            instancePath.cubicTo(7.30529f, 11.5943f, 7.59771f, 11.6344f, 7.82387f, 11.7693f);
            instancePath.cubicTo(8.05238f, 11.9056f, 8.21068f, 12.1377f, 8.21068f, 12.4699f);
            instancePath.close();
            instancePath.moveTo(13.0089f, 19.4776f);
            instancePath.lineTo(13.0398f, 19.437f);
            instancePath.cubicTo(13.4478f, 18.9f, 13.7584f, 18.2958f, 13.9478f, 17.6466f);
            instancePath.lineTo(13.9677f, 17.5784f);
            instancePath.lineTo(14.3091f, 17.8266f);
            instancePath.cubicTo(15.6268f, 18.7847f, 17.4718f, 18.4932f, 18.4299f, 17.1755f);
            instancePath.cubicTo(19.0771f, 16.2854f, 19.1542f, 15.1546f, 18.7297f, 14.219f);
            instancePath.lineTo(18.7089f, 14.1732f);
            instancePath.lineTo(18.7548f, 14.1527f);
            instancePath.cubicTo(19.3797f, 13.8737f, 19.9429f, 13.5011f, 20.4259f, 13.0562f);
            instancePath.lineTo(20.4736f, 13.0123f);
            instancePath.lineTo(20.504f, 13.0696f);
            instancePath.cubicTo(21.3803f, 14.7208f, 21.3019f, 16.7966f, 20.1284f, 18.4105f);
            instancePath.cubicTo(18.4882f, 20.6663f, 15.3299f, 21.1653f, 13.0741f, 19.5251f);
            instancePath.lineTo(13.0089f, 19.4776f);
            instancePath.close();
            instancePath.moveTo(11.0689f, 5.57936f);
            instancePath.lineTo(11.0369f, 5.62017f);
            instancePath.cubicTo(10.621f, 6.1496f, 10.3011f, 6.74687f, 10.1005f, 7.39001f);
            instancePath.lineTo(10.0797f, 7.45656f);
            instancePath.lineTo(9.69086f, 7.1738f);
            instancePath.cubicTo(8.37313f, 6.21567f, 6.52818f, 6.50717f, 5.57004f, 7.82489f);
            instancePath.cubicTo(4.8913f, 8.75837f, 4.8396f, 9.95649f, 5.33581f, 10.9166f);
            instancePath.lineTo(5.36063f, 10.9646f);
            instancePath.lineTo(5.31084f, 10.9856f);
            instancePath.cubicTo(4.68239f, 11.2509f, 4.11524f, 11.6106f, 3.6278f, 12.0445f);
            instancePath.lineTo(3.58134f, 12.0859f);
            instancePath.lineTo(3.55094f, 12.0316f);
            instancePath.cubicTo(2.61691f, 10.3647f, 2.67408f, 8.23681f, 3.87157f, 6.5899f);
            instancePath.cubicTo(5.51178f, 4.33414f, 8.67008f, 3.83513f, 10.9258f, 5.47533f);
            instancePath.lineTo(11.0689f, 5.57936f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
