package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_not_show_comments_on_dark extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.2358f, 20.4951f);
                instancePath.cubicTo(9.43401f, 20.0153f, 5.18427f, 17.1425f, 2.80284f, 12.8329f);
                instancePath.cubicTo(5.41837f, 8.09978f, 10.2876f, 5.09961f, 15.6667f, 5.09961f);
                instancePath.cubicTo(21.0458f, 5.09961f, 25.915f, 8.09978f, 28.5305f, 12.8329f);
                instancePath.cubicTo(28.0502f, 13.702f, 27.494f, 14.5127f, 26.8726f, 15.2571f);
                instancePath.cubicTo(27.3195f, 15.5512f, 27.7362f, 15.8876f, 28.1169f, 16.2605f);
                instancePath.cubicTo(28.9831f, 15.2202f, 29.7293f, 14.0702f, 30.3333f, 12.8333f);
                instancePath.cubicTo(27.6294f, 7.29684f, 22.0771f, 3.5f, 15.6667f, 3.5f);
                instancePath.cubicTo(9.25628f, 3.5f, 3.70392f, 7.29684f, 1.0f, 12.8333f);
                instancePath.cubicTo(3.47627f, 17.9037f, 8.34157f, 21.515f, 14.067f, 22.0872f);
                instancePath.cubicTo(14.0722f, 21.5422f, 14.1301f, 21.0099f, 14.2358f, 20.4951f);
                instancePath.close();
                instancePath.moveTo(20.8651f, 14.0304f);
                instancePath.cubicTo(20.9534f, 13.6456f, 21.0f, 13.2449f, 21.0f, 12.8333f);
                instancePath.cubicTo(21.0f, 9.88781f, 18.6122f, 7.5f, 15.6667f, 7.5f);
                instancePath.cubicTo(12.7211f, 7.5f, 10.3333f, 9.88781f, 10.3333f, 12.8333f);
                instancePath.cubicTo(10.3333f, 15.5919f, 12.4277f, 17.8614f, 15.1131f, 18.1383f);
                instancePath.cubicTo(15.4433f, 17.5478f, 15.8438f, 17.002f, 16.3033f, 16.5122f);
                instancePath.cubicTo(16.0964f, 16.5478f, 15.8837f, 16.5663f, 15.6667f, 16.5663f);
                instancePath.cubicTo(13.6048f, 16.5663f, 11.9333f, 14.8948f, 11.9333f, 12.8329f);
                instancePath.cubicTo(11.9333f, 10.7711f, 13.6048f, 9.09961f, 15.6667f, 9.09961f);
                instancePath.cubicTo(17.7285f, 9.09961f, 19.4f, 10.7711f, 19.4f, 12.8329f);
                instancePath.cubicTo(19.4f, 13.4827f, 19.234f, 14.0936f, 18.9422f, 14.6257f);
                instancePath.cubicTo(19.5479f, 14.3529f, 20.1924f, 14.151f, 20.8651f, 14.0304f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-372399);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(22.3367f, 15.5f);
                instancePath2.cubicTo(26.0186f, 15.5f, 29.0033f, 18.4848f, 29.0033f, 22.1667f);
                instancePath2.cubicTo(29.0033f, 25.8486f, 26.0186f, 28.8333f, 22.3367f, 28.8333f);
                instancePath2.cubicTo(18.6548f, 28.8333f, 15.67f, 25.8486f, 15.67f, 22.1667f);
                instancePath2.cubicTo(15.67f, 18.4848f, 18.6548f, 15.5f, 22.3367f, 15.5f);
                instancePath2.close();
                instancePath2.moveTo(18.4522f, 18.9131f);
                instancePath2.cubicTo(17.7141f, 19.7933f, 17.2696f, 20.9281f, 17.2696f, 22.1668f);
                instancePath2.cubicTo(17.2696f, 24.965f, 19.538f, 27.2334f, 22.3363f, 27.2334f);
                instancePath2.cubicTo(23.5749f, 27.2334f, 24.7097f, 26.789f, 25.5899f, 26.0508f);
                instancePath2.lineTo(18.4522f, 18.9131f);
                instancePath2.close();
                instancePath2.moveTo(19.6635f, 17.8616f);
                instancePath2.lineTo(26.6414f, 24.8396f);
                instancePath2.cubicTo(27.1241f, 24.0637f, 27.4029f, 23.1478f, 27.4029f, 22.1668f);
                instancePath2.cubicTo(27.4029f, 19.3685f, 25.1345f, 17.1001f, 22.3363f, 17.1001f);
                instancePath2.cubicTo(21.3553f, 17.1001f, 20.4393f, 17.3789f, 19.6635f, 17.8616f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
