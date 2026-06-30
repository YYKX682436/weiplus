package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class android_watch_regular extends l95.c {
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
        instancePath.moveTo(18.0999f, 12.0005f);
        instancePath.cubicTo(18.0999f, 9.98468f, 17.1226f, 8.19707f, 15.6135f, 7.08545f);
        instancePath.cubicTo(14.6022f, 6.34051f, 13.3535f, 5.89994f, 12.0002f, 5.8999f);
        instancePath.cubicTo(10.6468f, 5.8999f, 9.39741f, 6.34043f, 8.38599f, 7.08545f);
        instancePath.cubicTo(6.87711f, 8.19709f, 5.89966f, 9.98485f, 5.89966f, 12.0005f);
        instancePath.cubicTo(5.89982f, 14.0159f, 6.87724f, 15.803f, 8.38599f, 16.9146f);
        instancePath.cubicTo(9.39741f, 17.6596f, 10.6468f, 18.1001f, 12.0002f, 18.1001f);
        instancePath.cubicTo(13.3536f, 18.1001f, 14.6022f, 17.6595f, 15.6135f, 16.9146f);
        instancePath.cubicTo(17.1225f, 15.803f, 18.0997f, 14.0161f, 18.0999f, 12.0005f);
        instancePath.close();
        instancePath.moveTo(15.1819f, 18.5698f);
        instancePath.cubicTo(14.2198f, 19.0366f, 13.1405f, 19.3003f, 12.0002f, 19.3003f);
        instancePath.cubicTo(10.8594f, 19.3003f, 9.77911f, 19.037f, 8.81665f, 18.5698f);
        instancePath.lineTo(9.28833f, 21.6304f);
        instancePath.cubicTo(9.30334f, 21.7279f, 9.38786f, 21.8003f, 9.48657f, 21.8003f);
        instancePath.lineTo(14.5139f, 21.8003f);
        instancePath.cubicTo(14.6125f, 21.8002f, 14.6962f, 21.7279f, 14.7112f, 21.6304f);
        instancePath.lineTo(15.1819f, 18.5698f);
        instancePath.close();
        instancePath.moveTo(9.48657f, 2.19971f);
        instancePath.cubicTo(9.38786f, 2.19971f, 9.30334f, 2.27207f, 9.28833f, 2.36963f);
        instancePath.lineTo(8.81665f, 5.4292f);
        instancePath.cubicTo(9.77901f, 4.96216f, 10.8595f, 4.69971f, 12.0002f, 4.69971f);
        instancePath.cubicTo(13.1404f, 4.69974f, 14.2199f, 4.96257f, 15.1819f, 5.4292f);
        instancePath.lineTo(14.7112f, 2.36963f);
        instancePath.cubicTo(14.6962f, 2.27219f, 14.6125f, 2.19983f, 14.5139f, 2.19971f);
        instancePath.lineTo(9.48657f, 2.19971f);
        instancePath.close();
        instancePath.moveTo(19.3f, 12.0005f);
        instancePath.cubicTo(19.2999f, 14.3217f, 18.2137f, 16.387f, 16.5266f, 17.7231f);
        instancePath.lineTo(15.8977f, 21.813f);
        instancePath.cubicTo(15.7926f, 22.4959f, 15.2048f, 23.0004f, 14.5139f, 23.0005f);
        instancePath.lineTo(9.48657f, 23.0005f);
        instancePath.cubicTo(8.79559f, 23.0005f, 8.20787f, 22.4959f, 8.10278f, 21.813f);
        instancePath.lineTo(7.47388f, 17.7241f);
        instancePath.cubicTo(5.78636f, 16.388f, 4.70059f, 14.322f, 4.70044f, 12.0005f);
        instancePath.cubicTo(4.70044f, 9.67858f, 5.78597f, 7.61107f, 7.47388f, 6.2749f);
        instancePath.lineTo(8.10278f, 2.18701f);
        instancePath.cubicTo(8.20795f, 1.50416f, 8.79565f, 1.00049f, 9.48657f, 1.00049f);
        instancePath.lineTo(14.5139f, 1.00049f);
        instancePath.cubicTo(15.2048f, 1.00061f, 15.7926f, 1.50421f, 15.8977f, 2.18701f);
        instancePath.lineTo(16.5266f, 6.27588f);
        instancePath.cubicTo(18.2141f, 7.61206f, 19.3f, 9.67891f, 19.3f, 12.0005f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
