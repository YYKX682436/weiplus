package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ear_medium extends l95.c {
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
            instancePath.moveTo(14.4487f, 6.42951f);
            instancePath.lineTo(14.4472f, 6.42932f);
            instancePath.lineTo(14.4321f, 6.55144f);
            instancePath.lineTo(14.4487f, 6.42951f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.7113f, 9.88903f);
            instancePath2.cubicTo(14.7247f, 9.89074f, 14.7474f, 9.89345f, 14.7785f, 9.89642f);
            instancePath2.cubicTo(14.8499f, 9.90325f, 14.9626f, 9.91119f, 15.1043f, 9.91204f);
            instancePath2.cubicTo(15.3937f, 9.91377f, 15.7703f, 9.88561f, 16.152f, 9.77922f);
            instancePath2.cubicTo(16.8495f, 9.58479f, 17.5876f, 9.14471f, 17.9068f, 7.8844f);
            instancePath2.cubicTo(18.1869f, 6.7778f, 17.871f, 5.74948f, 17.0689f, 4.9484f);
            instancePath2.cubicTo(16.2451f, 4.12557f, 14.8464f, 3.5f, 12.9804f, 3.5f);
            instancePath2.cubicTo(10.6983f, 3.5f, 9.25866f, 4.11391f, 8.356f, 4.8082f);
            instancePath2.cubicTo(7.43807f, 5.51423f, 6.97541f, 6.38059f, 6.78163f, 7.02304f);
            instancePath2.cubicTo(5.76508f, 10.3932f, 7.75218f, 12.5956f, 9.04519f, 13.9802f);
            instancePath2.lineTo(9.05534f, 13.9911f);
            instancePath2.cubicTo(10.0356f, 15.0409f, 10.2515f, 16.3961f, 10.366f, 17.3317f);
            instancePath2.cubicTo(10.3935f, 17.5559f, 10.4139f, 17.7471f, 10.4327f, 17.9237f);
            instancePath2.cubicTo(10.4604f, 18.1833f, 10.4847f, 18.4115f, 10.5232f, 18.667f);
            instancePath2.cubicTo(10.5821f, 19.0584f, 10.6516f, 19.3209f, 10.7356f, 19.5052f);
            instancePath2.cubicTo(10.9301f, 19.9324f, 11.1638f, 20.1322f, 11.4371f, 20.2591f);
            instancePath2.cubicTo(11.7616f, 20.4097f, 12.2436f, 20.501f, 12.9784f, 20.5f);
            instancePath2.cubicTo(13.0785f, 20.4999f, 13.5191f, 20.4589f, 13.981f, 20.2379f);
            instancePath2.cubicTo(14.4094f, 20.0329f, 14.8094f, 19.7003f, 15.0366f, 19.1117f);
            instancePath2.cubicTo(15.1655f, 18.7778f, 15.2884f, 18.0303f, 15.2125f, 17.1885f);
            instancePath2.cubicTo(15.1358f, 16.3374f, 14.8839f, 15.6967f, 14.5622f, 15.3595f);
            instancePath2.cubicTo(13.9839f, 14.7534f, 13.4154f, 14.4694f, 12.7036f, 14.1139f);
            instancePath2.cubicTo(12.4755f, 13.9999f, 12.2327f, 13.8787f, 11.9702f, 13.7371f);
            instancePath2.cubicTo(11.4765f, 13.4708f, 10.8751f, 13.099f, 10.4023f, 12.4968f);
            instancePath2.cubicTo(9.90155f, 11.8592f, 9.63887f, 11.0885f, 9.59486f, 10.1803f);
            instancePath2.cubicTo(9.54709f, 9.18709f, 9.8326f, 8.32686f, 10.4159f, 7.67228f);
            instancePath2.cubicTo(10.966f, 7.05486f, 11.6655f, 6.74958f, 12.2327f, 6.59317f);
            instancePath2.cubicTo(12.8064f, 6.43496f, 13.3555f, 6.39812f, 13.7386f, 6.39508f);
            instancePath2.cubicTo(13.9354f, 6.39352f, 14.1017f, 6.40085f, 14.2228f, 6.40901f);
            instancePath2.cubicTo(14.2837f, 6.4131f, 14.3339f, 6.41746f, 14.3717f, 6.42114f);
            instancePath2.cubicTo(14.3906f, 6.42298f, 14.4065f, 6.42466f, 14.4191f, 6.42606f);
            instancePath2.lineTo(14.4357f, 6.42794f);
            instancePath2.lineTo(14.442f, 6.4287f);
            instancePath2.lineTo(14.4448f, 6.42903f);
            instancePath2.lineTo(14.446f, 6.42918f);
            instancePath2.cubicTo(14.4463f, 6.42921f, 14.4466f, 6.42925f, 14.4277f, 6.58353f);
            instancePath2.lineTo(14.2463f, 7.91611f);
            instancePath2.cubicTo(14.0931f, 7.89983f, 12.9386f, 7.79613f, 12.0698f, 8.25846f);
            instancePath2.cubicTo(11.6493f, 8.48223f, 11.2957f, 8.83858f, 11.1549f, 9.40161f);
            instancePath2.cubicTo(11.1383f, 9.46818f, 11.1246f, 9.53764f, 11.1142f, 9.61011f);
            instancePath2.cubicTo(11.0922f, 9.76231f, 11.0844f, 9.92778f, 11.0931f, 10.1077f);
            instancePath2.cubicTo(11.1253f, 10.7715f, 11.3113f, 11.237f, 11.6031f, 11.5969f);
            instancePath2.cubicTo(11.8398f, 11.8887f, 12.146f, 12.1111f, 12.4963f, 12.3133f);
            instancePath2.cubicTo(12.7332f, 12.4501f, 12.9903f, 12.5776f, 13.2596f, 12.7112f);
            instancePath2.cubicTo(14.0174f, 13.0873f, 14.8722f, 13.5115f, 15.6475f, 14.324f);
            instancePath2.cubicTo(16.9578f, 15.6974f, 16.8982f, 18.4541f, 16.436f, 19.6518f);
            instancePath2.cubicTo(15.6482f, 21.6929f, 13.5552f, 21.9992f, 12.9804f, 22.0f);
            instancePath2.cubicTo(11.3194f, 22.0022f, 10.0449f, 21.6078f, 9.37047f, 20.127f);
            instancePath2.cubicTo(9.0963f, 19.525f, 9.01685f, 18.7873f, 8.93576f, 18.0344f);
            instancePath2.cubicTo(8.81737f, 16.9352f, 8.69549f, 15.8036f, 7.95904f, 15.0149f);
            instancePath2.lineTo(7.94889f, 15.004f);
            instancePath2.cubicTo(6.67161f, 13.6362f, 4.06282f, 10.8425f, 5.34554f, 6.58987f);
            instancePath2.cubicTo(5.88905f, 4.78797f, 7.8463f, 2.0f, 12.9804f, 2.0f);
            instancePath2.cubicTo(17.3659f, 2.0f, 20.1975f, 4.94802f, 19.3609f, 8.25252f);
            instancePath2.cubicTo(18.4064f, 12.0216f, 14.4644f, 11.3689f, 14.4644f, 11.3689f);
            instancePath2.cubicTo(14.4641f, 11.3689f, 14.4638f, 11.3688f, 14.4634f, 11.3688f);
            instancePath2.lineTo(14.7113f, 9.88903f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
