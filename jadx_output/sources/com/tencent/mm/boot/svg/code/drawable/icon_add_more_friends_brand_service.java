package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_add_more_friends_brand_service extends l95.c {
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
        instancePaint3.setColor(-40634);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.889f, 6.4473f);
        instancePath.lineTo(14.2209f, 6.4473f);
        instancePath.lineTo(14.2209f, 3.10989f);
        instancePath.cubicTo(14.2209f, 2.49662f, 13.7231f, 1.9989f, 13.1099f, 1.9989f);
        instancePath.lineTo(3.11099f, 1.9989f);
        instancePath.cubicTo(2.49772f, 1.9989f, 2.0f, 2.49662f, 2.0f, 3.10989f);
        instancePath.lineTo(2.0f, 16.4417f);
        instancePath.cubicTo(2.0f, 17.055f, 2.49772f, 17.5527f, 3.11099f, 17.5527f);
        instancePath.lineTo(12.2633f, 17.5527f);
        instancePath.lineTo(10.7013f, 20.348f);
        instancePath.cubicTo(10.288f, 21.0879f, 10.8235f, 22.0011f, 11.6723f, 22.0011f);
        instancePath.lineTo(20.889f, 22.0011f);
        instancePath.cubicTo(21.5023f, 22.0011f, 22.0f, 21.5034f, 22.0f, 20.8901f);
        instancePath.lineTo(22.0f, 7.55828f);
        instancePath.cubicTo(22.0f, 6.94502f, 21.5023f, 6.4473f, 20.889f, 6.4473f);
        instancePath.close();
        instancePath.moveTo(3.33319f, 3.33431f);
        instancePath.lineTo(12.8877f, 3.33431f);
        instancePath.lineTo(12.8877f, 16.2218f);
        instancePath.lineTo(3.33319f, 16.2218f);
        instancePath.lineTo(3.33319f, 3.33431f);
        instancePath.close();
        instancePath.moveTo(20.6668f, 20.6679f);
        instancePath.lineTo(12.05f, 20.6679f);
        instancePath.lineTo(14.0453f, 17.095f);
        instancePath.cubicTo(14.1187f, 16.9661f, 14.1653f, 16.8261f, 14.192f, 16.6817f);
        instancePath.cubicTo(14.1964f, 16.6617f, 14.1986f, 16.6417f, 14.2009f, 16.6217f);
        instancePath.cubicTo(14.2053f, 16.5928f, 14.2075f, 16.5639f, 14.2098f, 16.5373f);
        instancePath.cubicTo(14.212f, 16.5062f, 14.2186f, 16.4751f, 14.2186f, 16.444f);
        instancePath.lineTo(14.2186f, 15.8329f);
        instancePath.lineTo(17.9716f, 15.8329f);
        instancePath.lineTo(17.9716f, 14.4997f);
        instancePath.lineTo(14.2186f, 14.4997f);
        instancePath.lineTo(14.2186f, 12.3511f);
        instancePath.lineTo(18.9892f, 12.3511f);
        instancePath.lineTo(18.9892f, 11.0179f);
        instancePath.lineTo(14.2186f, 11.0179f);
        instancePath.lineTo(14.2186f, 7.7827f);
        instancePath.lineTo(20.6646f, 7.7827f);
        instancePath.lineTo(20.6646f, 20.6702f);
        instancePath.lineTo(20.6668f, 20.6679f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-40634);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.3324f, 5.53851f);
        instancePath2.cubicTo(10.3324f, 6.77171f, 9.33474f, 7.77604f, 8.11043f, 7.77604f);
        instancePath2.cubicTo(6.88612f, 7.77604f, 5.88846f, 6.77171f, 5.88846f, 5.53851f);
        instancePath2.lineTo(5.88846f, 4.96524f);
        instancePath2.lineTo(4.55527f, 4.96524f);
        instancePath2.lineTo(4.55527f, 5.53851f);
        instancePath2.cubicTo(4.55527f, 7.50718f, 6.15065f, 9.10922f, 8.11043f, 9.10922f);
        instancePath2.cubicTo(10.0702f, 9.10922f, 11.6656f, 7.50718f, 11.6656f, 5.53851f);
        instancePath2.lineTo(11.6656f, 4.96524f);
        instancePath2.lineTo(10.3324f, 4.96524f);
        instancePath2.lineTo(10.3324f, 5.53851f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
