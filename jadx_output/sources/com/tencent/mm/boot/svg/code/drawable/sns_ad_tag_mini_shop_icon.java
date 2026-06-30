package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_tag_mini_shop_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.6228f, 9.15197f);
        instancePath.cubicTo(3.40946f, 9.15197f, 3.1988f, 9.13064f, 2.9948f, 9.08797f);
        instancePath.cubicTo(1.80013f, 8.83597f, 0.966797f, 7.91864f, 0.966797f, 6.85597f);
        instancePath.cubicTo(0.966797f, 6.57197f, 1.02546f, 6.29597f, 1.14146f, 6.03464f);
        instancePath.cubicTo(1.14413f, 6.02931f, 1.14546f, 6.02397f, 1.1468f, 6.02131f);
        instancePath.lineTo(2.48546f, 3.02264f);
        instancePath.cubicTo(2.4908f, 3.01064f, 2.49613f, 2.99864f, 2.5028f, 2.98797f);
        instancePath.cubicTo(2.90546f, 2.12264f, 3.77746f, 1.56531f, 4.73346f, 1.56531f);
        instancePath.lineTo(11.2668f, 1.56531f);
        instancePath.cubicTo(12.2295f, 1.56531f, 13.1055f, 2.13064f, 13.5055f, 3.00664f);
        instancePath.cubicTo(13.5148f, 3.02531f, 13.5241f, 3.04531f, 13.5321f, 3.06664f);
        instancePath.lineTo(14.8548f, 6.02131f);
        instancePath.cubicTo(14.9735f, 6.28931f, 15.0335f, 6.56797f, 15.0335f, 6.85331f);
        instancePath.cubicTo(15.0335f, 7.91731f, 14.1988f, 8.83597f, 13.0041f, 9.08531f);
        instancePath.cubicTo(12.5348f, 9.18397f, 12.0175f, 9.16797f, 11.5535f, 9.03597f);
        instancePath.cubicTo(11.0095f, 8.88264f, 10.5441f, 8.58264f, 10.2188f, 8.19064f);
        instancePath.cubicTo(9.6868f, 8.75464f, 8.87346f, 9.10264f, 8.00146f, 9.10264f);
        instancePath.cubicTo(7.12946f, 9.10264f, 6.32146f, 8.75597f, 5.7868f, 8.19331f);
        instancePath.cubicTo(5.46146f, 8.58664f, 4.9948f, 8.88797f, 4.44413f, 9.04264f);
        instancePath.cubicTo(4.18146f, 9.11597f, 3.90546f, 9.15464f, 3.62413f, 9.15464f);
        instancePath.lineTo(3.6228f, 9.15197f);
        instancePath.close();
        instancePath.moveTo(2.06413f, 6.42131f);
        instancePath.cubicTo(2.06413f, 6.42131f, 2.0588f, 6.43197f, 2.05746f, 6.43597f);
        instancePath.cubicTo(1.99746f, 6.56931f, 1.9668f, 6.71064f, 1.9668f, 6.85597f);
        instancePath.cubicTo(1.9668f, 7.44131f, 2.4748f, 7.95597f, 3.20013f, 8.10931f);
        instancePath.cubicTo(3.51346f, 8.17464f, 3.8628f, 8.16397f, 4.17213f, 8.07731f);
        instancePath.cubicTo(4.6828f, 7.93464f, 5.08413f, 7.59197f, 5.2228f, 7.18397f);
        instancePath.cubicTo(5.23613f, 7.14797f, 5.24413f, 7.11597f, 5.25346f, 7.07864f);
        instancePath.cubicTo(5.30413f, 6.85731f, 5.49613f, 6.69864f, 5.72146f, 6.68931f);
        instancePath.cubicTo(5.9508f, 6.68131f, 6.15213f, 6.82531f, 6.2188f, 7.04131f);
        instancePath.cubicTo(6.22413f, 7.05731f, 6.2308f, 7.07197f, 6.23613f, 7.08797f);
        instancePath.lineTo(6.24413f, 7.10797f);
        instancePath.cubicTo(6.50546f, 7.70264f, 7.20946f, 8.10131f, 8.00013f, 8.10131f);
        instancePath.cubicTo(8.7908f, 8.10131f, 9.50013f, 7.69997f, 9.75746f, 7.10264f);
        instancePath.cubicTo(9.7708f, 7.07197f, 9.78013f, 7.04797f, 9.78813f, 7.02264f);
        instancePath.cubicTo(9.86146f, 6.81064f, 10.0668f, 6.67197f, 10.2908f, 6.68797f);
        instancePath.cubicTo(10.5148f, 6.70131f, 10.7015f, 6.86131f, 10.7495f, 7.07997f);
        instancePath.cubicTo(10.7575f, 7.11731f, 10.7668f, 7.15197f, 10.7775f, 7.18131f);
        instancePath.cubicTo(10.9201f, 7.59464f, 11.3121f, 7.92664f, 11.8255f, 8.07064f);
        instancePath.cubicTo(12.1361f, 8.15864f, 12.4855f, 8.16931f, 12.7988f, 8.10264f);
        instancePath.cubicTo(13.5268f, 7.95064f, 14.0335f, 7.43464f, 14.0335f, 6.84931f);
        instancePath.cubicTo(14.0335f, 6.70531f, 14.0028f, 6.56264f, 13.9415f, 6.42531f);
        instancePath.lineTo(12.6161f, 3.46531f);
        instancePath.cubicTo(12.6161f, 3.46531f, 12.6121f, 3.45731f, 12.6108f, 3.45331f);
        instancePath.cubicTo(12.6068f, 3.44531f, 12.6028f, 3.43731f, 12.5988f, 3.42931f);
        instancePath.cubicTo(12.3641f, 2.90397f, 11.8415f, 2.56531f, 11.2668f, 2.56531f);
        instancePath.lineTo(4.73346f, 2.56531f);
        instancePath.cubicTo(4.15746f, 2.56531f, 3.6348f, 2.90531f, 3.40013f, 3.43064f);
        instancePath.cubicTo(3.3948f, 3.44131f, 3.3908f, 3.45197f, 3.38546f, 3.46131f);
        instancePath.lineTo(2.06413f, 6.42264f);
        instancePath.lineTo(2.06413f, 6.42131f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.9999f, 14.428f);
        instancePath2.cubicTo(5.23857f, 14.428f, 2.9559f, 12.672f, 2.8039f, 10.4307f);
        instancePath2.cubicTo(2.78523f, 10.1547f, 2.99323f, 9.91598f, 3.26923f, 9.89732f);
        instancePath2.cubicTo(3.54657f, 9.87865f, 3.7839f, 10.0867f, 3.80257f, 10.3627f);
        instancePath2.cubicTo(3.91857f, 12.0813f, 5.76256f, 13.428f, 8.00123f, 13.428f);
        instancePath2.cubicTo(10.2399f, 13.428f, 12.0826f, 12.0813f, 12.1986f, 10.3627f);
        instancePath2.cubicTo(12.2172f, 10.0867f, 12.4546f, 9.87732f, 12.7319f, 9.89732f);
        instancePath2.cubicTo(13.0079f, 9.91598f, 13.2159f, 10.1547f, 13.1972f, 10.4307f);
        instancePath2.cubicTo(13.0452f, 12.672f, 10.7626f, 14.428f, 8.00123f, 14.428f);
        instancePath2.lineTo(7.9999f, 14.428f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
