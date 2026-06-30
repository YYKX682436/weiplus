package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class translate_off_regular extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.0f, 20.9975f);
        instancePath.lineTo(14.0f, 15.0213f);
        instancePath.lineTo(12.8f, 13.8213f);
        instancePath.lineTo(12.8f, 20.8f);
        instancePath.lineTo(3.2f, 20.8f);
        instancePath.lineTo(3.2f, 11.2f);
        instancePath.lineTo(10.1787f, 11.2f);
        instancePath.lineTo(8.97868f, 10.0f);
        instancePath.lineTo(3.00247f, 10.0f);
        instancePath.cubicTo(2.44882f, 10.0f, 2.0f, 10.4558f, 2.0f, 11.0025f);
        instancePath.lineTo(2.0f, 20.9975f);
        instancePath.cubicTo(2.0f, 21.5512f, 2.45576f, 22.0f, 3.00247f, 22.0f);
        instancePath.lineTo(12.9975f, 22.0f);
        instancePath.cubicTo(13.5512f, 22.0f, 14.0f, 21.5442f, 14.0f, 20.9975f);
        instancePath.close();
        instancePath.moveTo(10.0f, 7.62838f);
        instancePath.lineTo(4.56904f, 2.19742f);
        instancePath.lineTo(3.72051f, 3.04595f);
        instancePath.lineTo(21.7517f, 21.0772f);
        instancePath.lineTo(22.6003f, 20.2286f);
        instancePath.lineTo(16.3716f, 14.0f);
        instancePath.lineTo(20.9975f, 14.0f);
        instancePath.cubicTo(21.5512f, 14.0f, 22.0f, 13.5442f, 22.0f, 12.9975f);
        instancePath.lineTo(22.0f, 3.00247f);
        instancePath.cubicTo(22.0f, 2.44882f, 21.5442f, 2.0f, 20.9975f, 2.0f);
        instancePath.lineTo(11.0025f, 2.0f);
        instancePath.cubicTo(10.4488f, 2.0f, 10.0f, 2.45576f, 10.0f, 3.00247f);
        instancePath.lineTo(10.0f, 7.62838f);
        instancePath.close();
        instancePath.moveTo(12.3716f, 10.0f);
        instancePath.lineTo(11.2f, 8.82838f);
        instancePath.lineTo(11.2f, 3.2f);
        instancePath.lineTo(20.8f, 3.2f);
        instancePath.lineTo(20.8f, 12.8f);
        instancePath.lineTo(15.1716f, 12.8f);
        instancePath.lineTo(14.0f, 11.6284f);
        instancePath.lineTo(14.0f, 11.0025f);
        instancePath.cubicTo(14.0f, 10.8734f, 13.9752f, 10.75f, 13.9303f, 10.6367f);
        instancePath.lineTo(14.7109f, 10.6367f);
        instancePath.lineTo(15.1406f, 9.26953f);
        instancePath.lineTo(17.1211f, 9.26953f);
        instancePath.lineTo(17.5508f, 10.6367f);
        instancePath.lineTo(18.8047f, 10.6367f);
        instancePath.lineTo(16.8438f, 5.0f);
        instancePath.lineTo(15.457f, 5.0f);
        instancePath.lineTo(13.6395f, 10.2349f);
        instancePath.cubicTo(13.4646f, 10.0883f, 13.24f, 10.0f, 12.9975f, 10.0f);
        instancePath.lineTo(12.3716f, 10.0f);
        instancePath.close();
        instancePath.moveTo(10.1322f, 14.6969f);
        instancePath.lineTo(11.2252f, 14.6969f);
        instancePath.lineTo(11.2252f, 13.669f);
        instancePath.lineTo(8.1849f, 13.669f);
        instancePath.lineTo(8.77125f, 13.488f);
        instancePath.cubicTo(8.69887f, 13.184f, 8.49618f, 12.7279f, 8.3152f, 12.3877f);
        instancePath.lineTo(7.18594f, 12.7207f);
        instancePath.cubicTo(7.32348f, 13.0102f, 7.45378f, 13.3794f, 7.52617f, 13.669f);
        instancePath.lineTo(4.54375f, 13.669f);
        instancePath.lineTo(4.54375f, 14.6969f);
        instancePath.lineTo(5.68749f, 14.6969f);
        instancePath.cubicTo(6.06391f, 15.6741f, 6.5272f, 16.5066f, 7.12803f, 17.2015f);
        instancePath.cubicTo(6.3969f, 17.7372f, 5.49204f, 18.1136f, 4.38449f, 18.3598f);
        instancePath.cubicTo(4.58718f, 18.6059f, 4.90569f, 19.0981f, 5.02151f, 19.3515f);
        instancePath.cubicTo(6.16526f, 19.033f, 7.12079f, 18.5769f, 7.90983f, 17.9544f);
        instancePath.cubicTo(8.65543f, 18.5552f, 9.56029f, 19.004f, 10.6751f, 19.2936f);
        instancePath.cubicTo(10.8343f, 19.004f, 11.1456f, 18.5407f, 11.3845f, 18.3091f);
        instancePath.cubicTo(10.3349f, 18.0774f, 9.45895f, 17.6938f, 8.73506f, 17.1726f);
        instancePath.cubicTo(9.32865f, 16.4994f, 9.79194f, 15.6814f, 10.1322f, 14.6969f);
        instancePath.close();
        instancePath.moveTo(6.78058f, 14.6969f);
        instancePath.lineTo(8.945f, 14.6969f);
        instancePath.cubicTo(8.69888f, 15.3918f, 8.35865f, 15.9782f, 7.93156f, 16.4704f);
        instancePath.cubicTo(7.44656f, 15.9564f, 7.0629f, 15.3629f, 6.78058f, 14.6969f);
        instancePath.close();
        instancePath.moveTo(16.1172f, 6.07812f);
        instancePath.lineTo(15.3945f, 8.38672f);
        instancePath.lineTo(16.8672f, 8.38672f);
        instancePath.lineTo(16.1445f, 6.07812f);
        instancePath.lineTo(16.1172f, 6.07812f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
