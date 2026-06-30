package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class watch_regular extends l95.c {
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
            instancePath.moveTo(7.29114f, 5.29119f);
            instancePath.cubicTo(8.30176f, 5.77378f, 9.0f, 6.8053f, 9.0f, 7.9999f);
            instancePath.lineTo(9.0f, 15.9999f);
            instancePath.cubicTo(9.0f, 17.1945f, 8.30176f, 18.226f, 7.29114f, 18.7086f);
            instancePath.cubicTo(8.64842f, 20.3523f, 10.7019f, 21.3999f, 13.0f, 21.3999f);
            instancePath.cubicTo(16.0473f, 21.3999f, 18.7489f, 19.5409f, 19.8677f, 16.7615f);
            instancePath.cubicTo(20.1463f, 16.0694f, 20.3264f, 15.0493f, 20.1316f, 14.1235f);
            instancePath.cubicTo(20.0633f, 13.7992f, 20.2709f, 13.481f, 20.5952f, 13.4128f);
            instancePath.cubicTo(20.9194f, 13.3445f, 21.2376f, 13.5521f, 21.3059f, 13.8764f);
            instancePath.cubicTo(21.4509f, 14.5658f, 21.4388f, 15.286f, 21.3119f, 16.0048f);
            instancePath.cubicTo(21.2272f, 16.4843f, 21.0994f, 16.915f, 20.9809f, 17.2096f);
            instancePath.cubicTo(19.6808f, 20.4396f, 16.5412f, 22.5999f, 13.0f, 22.5999f);
            instancePath.cubicTo(10.1152f, 22.5999f, 7.56213f, 21.1795f, 6.00204f, 18.9999f);
            instancePath.cubicTo(6.00136f, 18.9999f, 6.00068f, 18.9999f, 6.0f, 18.9999f);
            instancePath.cubicTo(4.34315f, 18.9999f, 3.0f, 17.6568f, 3.0f, 15.9999f);
            instancePath.lineTo(3.0f, 7.9999f);
            instancePath.cubicTo(3.0f, 6.34305f, 4.34315f, 4.9999f, 6.0f, 4.9999f);
            instancePath.cubicTo(6.00068f, 4.9999f, 6.00136f, 4.9999f, 6.00204f, 4.9999f);
            instancePath.cubicTo(7.56213f, 2.82031f, 10.1152f, 1.3999f, 13.0f, 1.3999f);
            instancePath.cubicTo(16.9256f, 1.3999f, 20.324f, 4.05236f, 21.3234f, 7.83395f);
            instancePath.cubicTo(21.6443f, 9.49982f, 21.328f, 10.4203f, 20.3369f, 11.7693f);
            instancePath.cubicTo(20.2906f, 11.8323f, 20.2906f, 11.8323f, 20.2451f, 11.8942f);
            instancePath.cubicTo(19.7195f, 12.6106f, 19.531f, 12.9862f, 19.4839f, 13.5498f);
            instancePath.cubicTo(19.3487f, 15.1695f, 19.0647f, 16.3209f, 18.5978f, 17.0299f);
            instancePath.cubicTo(18.4156f, 17.3067f, 18.0435f, 17.3833f, 17.7667f, 17.201f);
            instancePath.cubicTo(17.49f, 17.0187f, 17.4134f, 16.6466f, 17.5956f, 16.3699f);
            instancePath.cubicTo(17.926f, 15.8682f, 18.1682f, 14.8863f, 18.2881f, 13.45f);
            instancePath.cubicTo(18.3583f, 12.6092f, 18.6313f, 12.0652f, 19.2776f, 11.1843f);
            instancePath.cubicTo(19.324f, 11.1211f, 19.324f, 11.1211f, 19.3699f, 11.0588f);
            instancePath.cubicTo(20.1818f, 9.95363f, 20.3919f, 9.34223f, 20.1542f, 8.10094f);
            instancePath.cubicTo(19.3024f, 4.8826f, 16.3778f, 2.5999f, 13.0f, 2.5999f);
            instancePath.cubicTo(10.7019f, 2.5999f, 8.64842f, 3.64749f, 7.29114f, 5.29119f);
            instancePath.close();
            instancePath.moveTo(17.6993f, 7.34214f);
            instancePath.cubicTo(17.5103f, 7.06996f, 17.5777f, 6.69609f, 17.8499f, 6.50708f);
            instancePath.cubicTo(18.1221f, 6.31807f, 18.496f, 6.38549f, 18.685f, 6.65766f);
            instancePath.cubicTo(19.059f, 7.19624f, 19.3999f, 8.08454f, 19.5472f, 8.8923f);
            instancePath.cubicTo(19.6066f, 9.2183f, 19.3905f, 9.53075f, 19.0645f, 9.59018f);
            instancePath.cubicTo(18.7385f, 9.6496f, 18.426f, 9.4335f, 18.3666f, 9.1075f);
            instancePath.cubicTo(18.2484f, 8.45891f, 17.9686f, 7.72983f, 17.6993f, 7.34214f);
            instancePath.close();
            instancePath.moveTo(6.0f, 6.1999f);
            instancePath.cubicTo(5.00589f, 6.1999f, 4.2f, 7.00579f, 4.2f, 7.9999f);
            instancePath.lineTo(4.2f, 15.9999f);
            instancePath.cubicTo(4.2f, 16.994f, 5.00589f, 17.7999f, 6.0f, 17.7999f);
            instancePath.cubicTo(6.99411f, 17.7999f, 7.8f, 16.994f, 7.8f, 15.9999f);
            instancePath.lineTo(7.8f, 7.9999f);
            instancePath.cubicTo(7.8f, 7.00579f, 6.99411f, 6.1999f, 6.0f, 6.1999f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
