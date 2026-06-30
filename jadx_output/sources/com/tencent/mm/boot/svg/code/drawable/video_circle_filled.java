package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_circle_filled extends l95.c {
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
        instancePath.moveTo(6.2f, 4.0f);
        instancePath.cubicTo(5.53726f, 4.0f, 5.0f, 4.53726f, 5.0f, 5.2f);
        instancePath.lineTo(5.0f, 12.8f);
        instancePath.cubicTo(5.0f, 13.4627f, 5.53726f, 14.0f, 6.2f, 14.0f);
        instancePath.lineTo(15.8f, 14.0f);
        instancePath.cubicTo(16.4627f, 14.0f, 17.0f, 13.4627f, 17.0f, 12.8f);
        instancePath.lineTo(17.0f, 11.4f);
        instancePath.lineTo(19.9029f, 12.5612f);
        instancePath.cubicTo(20.4284f, 12.7714f, 21.0f, 12.3844f, 21.0f, 11.8184f);
        instancePath.lineTo(21.0f, 6.18165f);
        instancePath.cubicTo(21.0f, 5.61568f, 20.4284f, 5.22867f, 19.9029f, 5.43887f);
        instancePath.lineTo(17.0f, 6.60002f);
        instancePath.lineTo(17.0f, 5.2f);
        instancePath.cubicTo(17.0f, 4.53726f, 16.4627f, 4.0f, 15.8f, 4.0f);
        instancePath.lineTo(6.2f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.19104f, 16.7841f);
        instancePath2.cubicTo(3.06614f, 16.8944f, 3.02088f, 16.9665f, 3.00542f, 16.9991f);
        instancePath2.cubicTo(3.0253f, 17.0425f, 3.10005f, 17.1646f, 3.36438f, 17.3521f);
        instancePath2.cubicTo(3.74615f, 17.6228f, 4.36346f, 17.9076f, 5.21628f, 18.1635f);
        instancePath2.cubicTo(6.90919f, 18.6714f, 9.30786f, 19.0f, 12.0f, 19.0f);
        instancePath2.cubicTo(14.6921f, 19.0f, 17.0908f, 18.6714f, 18.7837f, 18.1635f);
        instancePath2.cubicTo(19.6365f, 17.9076f, 20.2538f, 17.6228f, 20.6356f, 17.3521f);
        instancePath2.cubicTo(20.9f, 17.1646f, 20.9747f, 17.0425f, 20.9946f, 16.9991f);
        instancePath2.cubicTo(20.9791f, 16.9665f, 20.9339f, 16.8944f, 20.809f, 16.7841f);
        instancePath2.cubicTo(20.585f, 16.5863f, 20.201f, 16.3567f, 19.6292f, 16.1284f);
        instancePath2.lineTo(20.3708f, 14.271f);
        instancePath2.cubicTo(21.0548f, 14.5441f, 21.6708f, 14.8769f, 22.1329f, 15.2851f);
        instancePath2.cubicTo(22.5923f, 15.6908f, 23.0f, 16.266f, 23.0f, 17.0f);
        instancePath2.cubicTo(23.0f, 17.899f, 22.397f, 18.5548f, 21.7927f, 18.9834f);
        instancePath2.cubicTo(21.1624f, 19.4304f, 20.3152f, 19.7921f, 19.3584f, 20.0791f);
        instancePath2.cubicTo(17.432f, 20.657f, 14.8307f, 21.0f, 12.0f, 21.0f);
        instancePath2.cubicTo(9.16929f, 21.0f, 6.56796f, 20.657f, 4.64158f, 20.0791f);
        instancePath2.cubicTo(3.68476f, 19.7921f, 2.8376f, 19.4304f, 2.20732f, 18.9834f);
        instancePath2.cubicTo(1.60301f, 18.5548f, 1.0f, 17.899f, 1.0f, 17.0f);
        instancePath2.cubicTo(1.0f, 16.266f, 1.4077f, 15.6908f, 1.86709f, 15.2851f);
        instancePath2.cubicTo(2.32922f, 14.8769f, 2.94523f, 14.5441f, 3.62917f, 14.271f);
        instancePath2.lineTo(4.37083f, 16.1284f);
        instancePath2.cubicTo(3.79895f, 16.3567f, 3.41496f, 16.5863f, 3.19104f, 16.7841f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
