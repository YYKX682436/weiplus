package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_not_show_comments_on_light extends l95.c {
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
                android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
                float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 3.5f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.3367f, 12.0f);
                instancePath.cubicTo(25.0186f, 12.0f, 28.0033f, 14.9848f, 28.0033f, 18.6667f);
                instancePath.cubicTo(28.0033f, 22.3486f, 25.0186f, 25.3333f, 21.3367f, 25.3333f);
                instancePath.cubicTo(17.6548f, 25.3333f, 14.67f, 22.3486f, 14.67f, 18.6667f);
                instancePath.cubicTo(14.67f, 14.9848f, 17.6548f, 12.0f, 21.3367f, 12.0f);
                instancePath.close();
                instancePath.moveTo(17.4522f, 15.4131f);
                instancePath.cubicTo(16.7141f, 16.2933f, 16.2696f, 17.4281f, 16.2696f, 18.6668f);
                instancePath.cubicTo(16.2696f, 21.465f, 18.538f, 23.7334f, 21.3363f, 23.7334f);
                instancePath.cubicTo(22.5749f, 23.7334f, 23.7097f, 23.289f, 24.5899f, 22.5508f);
                instancePath.lineTo(17.4522f, 15.4131f);
                instancePath.close();
                instancePath.moveTo(18.6635f, 14.3616f);
                instancePath.lineTo(25.6414f, 21.3396f);
                instancePath.cubicTo(26.1241f, 20.5637f, 26.4029f, 19.6478f, 26.4029f, 18.6668f);
                instancePath.cubicTo(26.4029f, 15.8685f, 24.1345f, 13.6001f, 21.3363f, 13.6001f);
                instancePath.cubicTo(20.3553f, 13.6001f, 19.4393f, 13.8789f, 18.6635f, 14.3616f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(13.2358f, 16.9951f);
                instancePath2.cubicTo(8.43401f, 16.5153f, 4.18427f, 13.6425f, 1.80284f, 9.3329f);
                instancePath2.cubicTo(4.41837f, 4.59978f, 9.2876f, 1.59961f, 14.6667f, 1.59961f);
                instancePath2.cubicTo(20.0458f, 1.59961f, 24.915f, 4.59978f, 27.5305f, 9.3329f);
                instancePath2.cubicTo(27.0502f, 10.202f, 26.494f, 11.0127f, 25.8726f, 11.7571f);
                instancePath2.cubicTo(26.3195f, 12.0512f, 26.7362f, 12.3876f, 27.1169f, 12.7605f);
                instancePath2.cubicTo(27.9831f, 11.7202f, 28.7293f, 10.5702f, 29.3333f, 9.3333f);
                instancePath2.cubicTo(26.6294f, 3.79684f, 21.0771f, 0.0f, 14.6667f, 0.0f);
                instancePath2.cubicTo(8.25628f, 0.0f, 2.70392f, 3.79684f, 0.0f, 9.3333f);
                instancePath2.cubicTo(2.47627f, 14.4037f, 7.34157f, 18.015f, 13.067f, 18.5872f);
                instancePath2.cubicTo(13.0722f, 18.0422f, 13.1301f, 17.5099f, 13.2358f, 16.9951f);
                instancePath2.close();
                instancePath2.moveTo(19.8651f, 10.5304f);
                instancePath2.cubicTo(19.9534f, 10.1456f, 20.0f, 9.7449f, 20.0f, 9.3333f);
                instancePath2.cubicTo(20.0f, 6.38781f, 17.6122f, 4.0f, 14.6667f, 4.0f);
                instancePath2.cubicTo(11.7211f, 4.0f, 9.3333f, 6.38781f, 9.3333f, 9.3333f);
                instancePath2.cubicTo(9.3333f, 12.0919f, 11.4277f, 14.3614f, 14.1131f, 14.6383f);
                instancePath2.cubicTo(14.4433f, 14.0478f, 14.8438f, 13.502f, 15.3033f, 13.0122f);
                instancePath2.cubicTo(15.0964f, 13.0478f, 14.8837f, 13.0663f, 14.6667f, 13.0663f);
                instancePath2.cubicTo(12.6048f, 13.0663f, 10.9333f, 11.3948f, 10.9333f, 9.3329f);
                instancePath2.cubicTo(10.9333f, 7.2711f, 12.6048f, 5.59961f, 14.6667f, 5.59961f);
                instancePath2.cubicTo(16.7285f, 5.59961f, 18.4f, 7.2711f, 18.4f, 9.3329f);
                instancePath2.cubicTo(18.4f, 9.9827f, 18.234f, 10.5936f, 17.9422f, 11.1257f);
                instancePath2.cubicTo(18.5479f, 10.8529f, 19.1924f, 10.651f, 19.8651f, 10.5304f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
