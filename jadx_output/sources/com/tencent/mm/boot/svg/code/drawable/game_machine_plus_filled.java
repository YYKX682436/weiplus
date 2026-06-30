package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_machine_plus_filled extends l95.c {
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
        instancePath.moveTo(15.999f, 5.0f);
        instancePath.lineTo(16.0f, 5.47181f);
        instancePath.cubicTo(16.0f, 5.66341f, 16.0336f, 5.83724f, 16.1315f, 6.02044f);
        instancePath.cubicTo(16.2335f, 6.21101f, 16.389f, 6.36654f, 16.5796f, 6.46846f);
        instancePath.lineTo(16.6886f, 6.51976f);
        instancePath.cubicTo(16.833f, 6.57852f, 16.9749f, 6.6f, 17.1282f, 6.6f);
        instancePath.lineTo(18.399f, 6.598f);
        instancePath.lineTo(18.4f, 7.87225f);
        instancePath.cubicTo(18.4f, 8.06341f, 18.4336f, 8.23724f, 18.5315f, 8.42044f);
        instancePath.cubicTo(18.6335f, 8.61101f, 18.789f, 8.76654f, 18.9796f, 8.86846f);
        instancePath.cubicTo(19.1628f, 8.96643f, 19.3366f, 9.0f, 19.5282f, 9.0f);
        instancePath.lineTo(20.4718f, 9.0f);
        instancePath.cubicTo(20.6634f, 9.0f, 20.8372f, 8.96643f, 21.0204f, 8.86846f);
        instancePath.lineTo(21.0785f, 8.83332f);
        instancePath.cubicTo(21.4083f, 9.76883f, 21.6601f, 10.899f, 21.8005f, 12.2486f);
        instancePath.cubicTo(22.2045f, 16.1296f, 21.9985f, 18.4043f, 21.1504f, 19.408f);
        instancePath.cubicTo(20.8204f, 19.8005f, 20.3924f, 20.0f, 19.8824f, 20.0f);
        instancePath.cubicTo(18.5723f, 20.0f, 17.8263f, 19.1682f, 16.9602f, 18.207f);
        instancePath.cubicTo(16.6542f, 17.8674f, 16.3362f, 17.5131f, 15.9682f, 17.163f);
        instancePath.cubicTo(15.0001f, 16.2463f, 14.0241f, 16.119f, 13.1161f, 16.119f);
        instancePath.cubicTo(12.954f, 16.119f, 12.794f, 16.1232f, 12.642f, 16.1275f);
        instancePath.cubicTo(12.496f, 16.1317f, 12.354f, 16.1338f, 12.22f, 16.1338f);
        instancePath.lineTo(11.782f, 16.1338f);
        instancePath.cubicTo(11.648f, 16.1338f, 11.506f, 16.1296f, 11.36f, 16.1275f);
        instancePath.cubicTo(11.208f, 16.1232f, 11.05f, 16.119f, 10.8859f, 16.119f);
        instancePath.cubicTo(9.9759f, 16.119f, 9.00186f, 16.2463f, 8.03381f, 17.163f);
        instancePath.cubicTo(7.66379f, 17.5131f, 7.34778f, 17.8653f, 7.03977f, 18.207f);
        instancePath.cubicTo(6.17572f, 19.1682f, 5.42769f, 20.0f, 4.11763f, 20.0f);
        instancePath.cubicTo(3.6076f, 20.0f, 3.18158f, 19.8005f, 2.84957f, 19.408f);
        instancePath.cubicTo(2.00153f, 18.4022f, 1.79552f, 16.1275f, 2.19954f, 12.2486f);
        instancePath.cubicTo(2.75756f, 6.90338f, 5.05967f, 5.0f, 7.02977f, 5.0f);
        instancePath.lineTo(15.999f, 5.0f);
        instancePath.close();
        instancePath.moveTo(9.1f, 9.0f);
        instancePath.lineTo(7.9f, 9.0f);
        instancePath.lineTo(7.9f, 10.399f);
        instancePath.lineTo(6.5f, 10.4f);
        instancePath.lineTo(6.5f, 11.6f);
        instancePath.lineTo(7.9f, 11.599f);
        instancePath.lineTo(7.9f, 13.0f);
        instancePath.lineTo(9.1f, 13.0f);
        instancePath.lineTo(9.1f, 11.599f);
        instancePath.lineTo(10.5f, 11.6f);
        instancePath.lineTo(10.5f, 10.4f);
        instancePath.lineTo(9.1f, 10.399f);
        instancePath.lineTo(9.1f, 9.0f);
        instancePath.close();
        instancePath.moveTo(16.0f, 9.0f);
        instancePath.cubicTo(14.8954f, 9.0f, 14.0f, 9.89543f, 14.0f, 11.0f);
        instancePath.cubicTo(14.0f, 12.1046f, 14.8954f, 13.0f, 16.0f, 13.0f);
        instancePath.cubicTo(17.1046f, 13.0f, 18.0f, 12.1046f, 18.0f, 11.0f);
        instancePath.cubicTo(18.0f, 9.89543f, 17.1046f, 9.0f, 16.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(16.0f, 10.2f);
        instancePath.cubicTo(16.4418f, 10.2f, 16.8f, 10.5582f, 16.8f, 11.0f);
        instancePath.cubicTo(16.8f, 11.4418f, 16.4418f, 11.8f, 16.0f, 11.8f);
        instancePath.cubicTo(15.5582f, 11.8f, 15.2f, 11.4418f, 15.2f, 11.0f);
        instancePath.cubicTo(15.2f, 10.5582f, 15.5582f, 10.2f, 16.0f, 10.2f);
        instancePath.close();
        instancePath.moveTo(20.75f, 2.0f);
        instancePath.lineTo(20.75f, 4.25f);
        instancePath.lineTo(23.0f, 4.25f);
        instancePath.lineTo(23.0f, 5.75f);
        instancePath.lineTo(20.75f, 5.75f);
        instancePath.lineTo(20.75f, 8.0f);
        instancePath.lineTo(19.25f, 8.0f);
        instancePath.lineTo(19.25f, 5.75f);
        instancePath.lineTo(17.0f, 5.75f);
        instancePath.lineTo(17.0f, 4.25f);
        instancePath.lineTo(19.25f, 4.25f);
        instancePath.lineTo(19.25f, 2.0f);
        instancePath.lineTo(20.75f, 2.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
