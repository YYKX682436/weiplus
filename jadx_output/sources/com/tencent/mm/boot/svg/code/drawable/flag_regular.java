package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class flag_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.42475f, 3.43303f);
                instancePath.cubicTo(10.306f, 3.56284f, 11.1653f, 3.81328f, 11.9783f, 4.17732f);
                instancePath.lineTo(12.3024f, 4.33538f);
                instancePath.cubicTo(13.2069f, 4.77872f, 14.0403f, 5.35414f, 14.7754f, 6.04272f);
                instancePath.cubicTo(15.6116f, 6.89098f, 16.5641f, 7.61611f, 17.6044f, 8.19633f);
                instancePath.cubicTo(18.46f, 8.61363f, 19.0593f, 8.58259f, 19.6978f, 8.43625f);
                instancePath.lineTo(20.0217f, 8.35502f);
                instancePath.lineTo(20.3913f, 8.25656f);
                instancePath.cubicTo(20.608f, 8.18926f, 20.8421f, 8.20482f, 21.048f, 8.30021f);
                instancePath.cubicTo(21.1618f, 8.35593f, 21.2588f, 8.44061f, 21.3295f, 8.54573f);
                instancePath.cubicTo(21.58f, 8.92855f, 21.357f, 9.36105f, 21.1776f, 9.63841f);
                instancePath.cubicTo(20.9385f, 9.98304f, 20.6616f, 10.2998f, 20.3519f, 10.5828f);
                instancePath.cubicTo(19.4422f, 11.4469f, 18.3613f, 12.1107f, 17.179f, 12.5315f);
                instancePath.cubicTo(16.5187f, 12.7632f, 15.8212f, 12.8715f, 15.1215f, 12.851f);
                instancePath.lineTo(14.9892f, 12.8426f);
                instancePath.cubicTo(14.4057f, 12.8039f, 13.8352f, 12.6523f, 13.3094f, 12.3962f);
                instancePath.lineTo(12.9691f, 12.2302f);
                instancePath.cubicTo(12.6398f, 12.0335f, 12.3188f, 11.8609f, 12.0174f, 11.7139f);
                instancePath.cubicTo(10.1007f, 10.7791f, 8.99874f, 10.9429f, 8.1636f, 11.3548f);
                instancePath.lineTo(7.95143f, 11.4673f);
                instancePath.lineTo(7.7492f, 11.5877f);
                instancePath.lineTo(7.35554f, 11.8458f);
                instancePath.lineTo(7.30592f, 11.8818f);
                instancePath.lineTo(7.28317f, 20.5663f);
                instancePath.cubicTo(7.27753f, 20.7029f, 7.21512f, 20.8308f, 7.11098f, 20.9193f);
                instancePath.cubicTo(6.99824f, 21.0217f, 6.84835f, 21.0733f, 6.69641f, 21.0619f);
                instancePath.cubicTo(6.62556f, 21.0542f, 6.55667f, 21.034f, 6.49261f, 21.0027f);
                instancePath.cubicTo(6.29408f, 20.9089f, 6.16541f, 20.7111f, 6.16016f, 20.4917f);
                instancePath.lineTo(6.20548f, 3.98785f);
                instancePath.cubicTo(6.21078f, 3.7164f, 6.42723f, 3.49644f, 6.69866f, 3.48666f);
                instancePath.cubicTo(6.73313f, 3.469f, 6.77093f, 3.45875f, 6.80961f, 3.45658f);
                instancePath.cubicTo(7.67465f, 3.31189f, 8.55712f, 3.30394f, 9.42475f, 3.43303f);
                instancePath.close();
                instancePath.moveTo(7.33412f, 4.47058f);
                instancePath.lineTo(7.31641f, 10.5361f);
                instancePath.cubicTo(7.86399f, 10.2096f, 8.47807f, 10.0103f, 9.11322f, 9.95309f);
                instancePath.cubicTo(10.1169f, 9.86929f, 11.2273f, 10.1342f, 12.514f, 10.7618f);
                instancePath.cubicTo(12.8381f, 10.9198f, 13.1913f, 11.0921f, 13.5322f, 11.3145f);
                instancePath.lineTo(13.7817f, 11.4362f);
                instancePath.cubicTo(14.6956f, 11.882f, 15.7615f, 11.8846f, 16.9454f, 11.4396f);
                instancePath.cubicTo(17.8186f, 11.0995f, 18.6248f, 10.6077f, 19.3268f, 9.98701f);
                instancePath.cubicTo(19.501f, 9.83543f, 19.6575f, 9.68724f, 19.7947f, 9.53763f);
                instancePath.cubicTo(19.1745f, 9.66778f, 18.5315f, 9.63959f, 17.925f, 9.45569f);
                instancePath.cubicTo(17.6614f, 9.37627f, 17.4047f, 9.27523f, 17.1577f, 9.15359f);
                instancePath.cubicTo(16.0007f, 8.52072f, 14.9403f, 7.7254f, 14.0089f, 6.7919f);
                instancePath.cubicTo(13.3608f, 6.17961f, 12.6246f, 5.66783f, 11.8248f, 5.2736f);
                instancePath.cubicTo(11.0463f, 4.89602f, 10.2144f, 4.64035f, 9.35819f, 4.51559f);
                instancePath.cubicTo(8.68822f, 4.4135f, 8.00789f, 4.39838f, 7.33412f, 4.47058f);
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
