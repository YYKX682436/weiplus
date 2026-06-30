package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_perspective extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 28;
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
        instancePaint3.setColor(-855638017);
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.4333f, 6.0665f);
        instancePath.lineTo(7.2333f, 6.0665f);
        instancePath.lineTo(7.2333f, 14.9332f);
        instancePath.lineTo(18.4333f, 14.9332f);
        instancePath.lineTo(18.4333f, 6.0665f);
        instancePath.close();
        instancePath.moveTo(7.2333f, 4.6665f);
        instancePath.cubicTo(6.4601f, 4.6665f, 5.8333f, 5.29331f, 5.8333f, 6.0665f);
        instancePath.lineTo(5.8333f, 14.9332f);
        instancePath.cubicTo(5.8333f, 15.7064f, 6.4601f, 16.3332f, 7.2333f, 16.3332f);
        instancePath.lineTo(18.4333f, 16.3332f);
        instancePath.cubicTo(19.2065f, 16.3332f, 19.8333f, 15.7064f, 19.8333f, 14.9332f);
        instancePath.lineTo(19.8333f, 6.0665f);
        instancePath.cubicTo(19.8333f, 5.29331f, 19.2065f, 4.6665f, 18.4333f, 4.6665f);
        instancePath.lineTo(7.2333f, 4.6665f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        instancePaint4.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(23.1f, 7.90102f);
        instancePath2.lineTo(20.0666f, 9.11435f);
        instancePath2.lineTo(20.0666f, 11.8853f);
        instancePath2.lineTo(23.1f, 13.0987f);
        instancePath2.lineTo(23.1f, 7.90102f);
        instancePath2.close();
        instancePath2.moveTo(19.5467f, 7.81448f);
        instancePath2.cubicTo(19.0152f, 8.02709f, 18.6666f, 8.54188f, 18.6666f, 9.11435f);
        instancePath2.lineTo(18.6666f, 11.8853f);
        instancePath2.cubicTo(18.6666f, 12.4578f, 19.0152f, 12.9726f, 19.5467f, 13.1852f);
        instancePath2.lineTo(22.58f, 14.3985f);
        instancePath2.cubicTo(23.4996f, 14.7664f, 24.5f, 14.0891f, 24.5f, 13.0987f);
        instancePath2.lineTo(24.5f, 7.90102f);
        instancePath2.cubicTo(24.5f, 6.91057f, 23.4996f, 6.23331f, 22.58f, 6.60115f);
        instancePath2.lineTo(19.5467f, 7.81448f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-855638017);
        instancePaint5.setColor(-855638017);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(3.41393f, 19.2315f);
        instancePath3.cubicTo(3.09519f, 19.513f, 3.0333f, 19.7165f, 3.0333f, 19.8332f);
        instancePath3.cubicTo(3.0333f, 19.9771f, 3.13353f, 20.2546f, 3.6551f, 20.6246f);
        instancePath3.cubicTo(4.15849f, 20.9816f, 4.93231f, 21.3318f, 5.95153f, 21.6376f);
        instancePath3.cubicTo(7.98107f, 22.2464f, 10.8268f, 22.6332f, 14.0f, 22.6332f);
        instancePath3.cubicTo(17.1731f, 22.6332f, 20.0189f, 22.2464f, 22.0484f, 21.6376f);
        instancePath3.cubicTo(23.0676f, 21.3318f, 23.8415f, 20.9816f, 24.3448f, 20.6246f);
        instancePath3.cubicTo(24.8664f, 20.2546f, 24.9666f, 19.9771f, 24.9666f, 19.8332f);
        instancePath3.cubicTo(24.9666f, 19.7165f, 24.9047f, 19.513f, 24.586f, 19.2315f);
        instancePath3.cubicTo(24.2692f, 18.9517f, 23.7671f, 18.6598f, 23.0737f, 18.3829f);
        instancePath3.lineTo(23.5929f, 17.0827f);
        instancePath3.cubicTo(24.3647f, 17.3909f, 25.0292f, 17.7551f, 25.5128f, 18.1822f);
        instancePath3.cubicTo(25.9944f, 18.6076f, 26.3666f, 19.1618f, 26.3666f, 19.8332f);
        instancePath3.cubicTo(26.3666f, 20.6558f, 25.8139f, 21.299f, 25.1548f, 21.7665f);
        instancePath3.cubicTo(24.4774f, 22.2469f, 23.5427f, 22.6509f, 22.4507f, 22.9785f);
        instancePath3.cubicTo(20.2577f, 23.6364f, 17.2701f, 24.0332f, 14.0f, 24.0332f);
        instancePath3.cubicTo(10.7298f, 24.0332f, 7.74221f, 23.6364f, 5.54925f, 22.9785f);
        instancePath3.cubicTo(4.45722f, 22.6509f, 3.5225f, 22.2469f, 2.84515f, 21.7665f);
        instancePath3.cubicTo(2.18599f, 21.299f, 1.6333f, 20.6558f, 1.6333f, 19.8332f);
        instancePath3.cubicTo(1.6333f, 19.1618f, 2.00552f, 18.6076f, 2.48716f, 18.1822f);
        instancePath3.cubicTo(2.97073f, 17.7551f, 3.63527f, 17.3909f, 4.40705f, 17.0827f);
        instancePath3.lineTo(4.92621f, 18.3829f);
        instancePath3.cubicTo(4.23288f, 18.6598f, 3.73075f, 18.9517f, 3.41393f, 19.2315f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
