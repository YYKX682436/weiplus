package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wechat_pay extends l95.c {
    private final int width = 310;
    private final int height = 310;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 310;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(119.789f, 185.823f);
                instancePath.cubicTo(118.622f, 186.418f, 117.309f, 186.768f, 115.917f, 186.768f);
                instancePath.cubicTo(112.686f, 186.768f, 109.877f, 184.954f, 108.403f, 182.275f);
                instancePath.lineTo(107.841f, 181.02f);
                instancePath.lineTo(84.3223f, 128.381f);
                instancePath.cubicTo(84.0683f, 127.808f, 83.9108f, 127.158f, 83.9108f, 126.527f);
                instancePath.cubicTo(83.9108f, 124.104f, 85.8394f, 122.14f, 88.2153f, 122.14f);
                instancePath.cubicTo(89.1886f, 122.14f, 90.0724f, 122.465f, 90.7951f, 123.012f);
                instancePath.lineTo(118.543f, 143.163f);
                instancePath.cubicTo(120.565f, 144.514f, 122.995f, 145.309f, 125.6f, 145.309f);
                instancePath.cubicTo(127.149f, 145.309f, 128.634f, 145.017f, 130.011f, 144.503f);
                instancePath.lineTo(260.509f, 85.2617f);
                instancePath.cubicTo(237.119f, 57.1358f, 198.593f, 38.7515f, 155.001f, 38.7515f);
                instancePath.cubicTo(83.6604f, 38.7515f, 25.8379f, 87.9115f, 25.8379f, 148.554f);
                instancePath.cubicTo(25.8379f, 181.636f, 43.2311f, 211.423f, 70.4642f, 231.552f);
                instancePath.cubicTo(72.6505f, 233.14f, 74.0781f, 235.749f, 74.0781f, 238.706f);
                instancePath.cubicTo(74.0781f, 239.684f, 73.8813f, 240.567f, 73.6237f, 241.501f);
                instancePath.cubicTo(71.4518f, 249.779f, 67.9703f, 263.028f, 67.8093f, 263.652f);
                instancePath.cubicTo(67.5373f, 264.685f, 67.1115f, 265.773f, 67.1115f, 266.864f);
                instancePath.cubicTo(67.1115f, 269.284f, 69.0366f, 271.251f, 71.4232f, 271.251f);
                instancePath.cubicTo(72.3535f, 271.251f, 73.1156f, 270.897f, 73.9064f, 270.438f);
                instancePath.lineTo(102.184f, 253.78f);
                instancePath.cubicTo(104.31f, 252.528f, 106.56f, 251.754f, 109.044f, 251.754f);
                instancePath.cubicTo(110.364f, 251.754f, 111.641f, 251.962f, 112.84f, 252.338f);
                instancePath.cubicTo(126.032f, 256.207f, 140.266f, 258.357f, 155.001f, 258.357f);
                instancePath.cubicTo(226.338f, 258.357f, 284.171f, 209.196f, 284.171f, 148.554f);
                instancePath.cubicTo(284.171f, 130.192f, 278.836f, 112.891f, 269.454f, 97.6785f);
                instancePath.lineTo(120.733f, 185.264f);
                instancePath.lineTo(119.789f, 185.823f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
