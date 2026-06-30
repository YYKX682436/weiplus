package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class microphone_note_regular extends l95.c {
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
        instancePath.moveTo(6.16797f, 4.20482f);
        instancePath.cubicTo(6.16797f, 3.56259f, 6.90162f, 3.27158f, 7.30347f, 3.70778f);
        instancePath.lineTo(7.36401f, 3.78275f);
        instancePath.lineTo(8.06486f, 4.89862f);
        instancePath.cubicTo(8.24787f, 5.15694f, 8.48265f, 5.41146f, 8.9704f, 5.58646f);
        instancePath.cubicTo(9.44104f, 5.71257f, 9.78605f, 5.72809f, 9.78605f, 5.72809f);
        instancePath.cubicTo(9.78605f, 5.72809f, 9.45709f, 6.52859f, 8.95833f, 6.63908f);
        instancePath.cubicTo(8.43132f, 6.75583f, 8.00696f, 6.60096f, 7.59104f, 6.2727f);
        instancePath.lineTo(7.49691f, 6.19232f);
        instancePath.lineTo(7.49691f, 9.3859f);
        instancePath.cubicTo(7.49896f, 9.42303f, 7.5f, 9.46042f, 7.5f, 9.49806f);
        instancePath.cubicTo(7.5f, 10.6026f, 6.60457f, 11.4981f, 5.5f, 11.4981f);
        instancePath.cubicTo(4.39543f, 11.4981f, 3.5f, 10.6026f, 3.5f, 9.49806f);
        instancePath.cubicTo(3.5f, 8.39349f, 4.39543f, 7.49806f, 5.5f, 7.49806f);
        instancePath.cubicTo(5.73424f, 7.49806f, 5.95908f, 7.53833f, 6.16797f, 7.61233f);
        instancePath.lineTo(6.16797f, 4.20482f);
        instancePath.close();
        instancePath.moveTo(6.3f, 9.49806f);
        instancePath.cubicTo(6.3f, 9.93989f, 5.94183f, 10.2981f, 5.5f, 10.2981f);
        instancePath.cubicTo(5.05817f, 10.2981f, 4.7f, 9.93989f, 4.7f, 9.49806f);
        instancePath.cubicTo(4.7f, 9.05624f, 5.05817f, 8.69806f, 5.5f, 8.69806f);
        instancePath.cubicTo(5.62204f, 8.69806f, 5.7377f, 8.72539f, 5.84119f, 8.77426f);
        instancePath.lineTo(6.2959f, 8.93068f);
        instancePath.lineTo(6.2959f, 9.41655f);
        instancePath.cubicTo(6.29861f, 9.44335f, 6.3f, 9.47055f, 6.3f, 9.49806f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.8999f, 11.3122f);
        instancePath2.cubicTo(19.1769f, 12.5644f, 17.9369f, 13.3321f, 16.6052f, 13.5013f);
        instancePath2.lineTo(11.7802f, 20.167f);
        instancePath2.cubicTo(11.1758f, 21.0019f, 10.0381f, 21.2448f, 9.14552f, 20.7294f);
        instancePath2.cubicTo(8.2294f, 20.2005f, 7.87964f, 19.0523f, 8.34532f, 18.1024f);
        instancePath2.lineTo(11.9348f, 10.781f);
        instancePath2.cubicTo(11.4292f, 9.54993f, 11.4793f, 8.10621f, 12.1962f, 6.86449f);
        instancePath2.cubicTo(13.4244f, 4.73718f, 16.1446f, 4.00832f, 18.2719f, 5.23652f);
        instancePath2.cubicTo(20.3992f, 6.46471f, 21.1281f, 9.18489f, 19.8999f, 11.3122f);
        instancePath2.close();
        instancePath2.moveTo(16.7364f, 12.2623f);
        instancePath2.cubicTo(17.6019f, 12.0744f, 18.3844f, 11.537f, 18.8606f, 10.7122f);
        instancePath2.cubicTo(19.7575f, 9.15884f, 19.2253f, 7.17257f, 17.6719f, 6.27575f);
        instancePath2.cubicTo(16.1186f, 5.37892f, 14.1323f, 5.91114f, 13.2355f, 7.46449f);
        instancePath2.cubicTo(12.7602f, 8.28764f, 12.6854f, 9.23176f, 12.9534f, 10.0739f);
        instancePath2.cubicTo(14.2558f, 11.0678f, 15.3337f, 11.6897f, 16.7364f, 12.2623f);
        instancePath2.close();
        instancePath2.moveTo(9.42279f, 18.6307f);
        instancePath2.lineTo(12.9051f, 11.5278f);
        instancePath2.cubicTo(13.7615f, 12.1327f, 14.5674f, 12.6017f, 15.4716f, 13.0207f);
        instancePath2.lineTo(10.8081f, 19.4633f);
        instancePath2.cubicTo(10.5644f, 19.8001f, 10.1055f, 19.898f, 9.74552f, 19.6902f);
        instancePath2.cubicTo(9.37604f, 19.4769f, 9.23498f, 19.0138f, 9.42279f, 18.6307f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
