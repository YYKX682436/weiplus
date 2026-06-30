package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_tencent_video extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-12699079);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.664988f, 14.521642f);
                instancePath.cubicTo(8.387968f, 14.585156f, 8.276084f, 14.50136f, 8.223907f, 14.249436f);
                instancePath.cubicTo(8.223907f, 14.249436f, 8.135154f, 13.99858f, 8.135154f, 11.949034f);
                instancePath.cubicTo(8.135154f, 9.8989525f, 8.223907f, 9.668912f, 8.223907f, 9.668912f);
                instancePath.cubicTo(8.28738f, 9.4036455f, 8.43369f, 9.331057f, 8.664988f, 9.396707f);
                instancePath.cubicTo(8.664988f, 9.396707f, 9.347049f, 9.537079f, 10.994107f, 10.374512f);
                instancePath.cubicTo(12.659992f, 11.221017f, 13.170463f, 11.687503f, 13.170463f, 11.687503f);
                instancePath.cubicTo(13.423815f, 11.902598f, 13.372176f, 12.033363f, 13.170463f, 12.230846f);
                instancePath.cubicTo(13.170463f, 12.230846f, 12.859016f, 12.578308f, 10.993569f, 13.514482f);
                instancePath.cubicTo(9.128122f, 14.450121f, 8.664988f, 14.521642f, 8.664988f, 14.521642f);
                instancePath.lineTo(8.664988f, 14.521642f);
                instancePath.close();
                instancePath.moveTo(16.404873f, 12.871863f);
                instancePath.cubicTo(16.668446f, 12.662639f, 16.983118f, 12.337593f, 16.984196f, 11.981057f);
                instancePath.cubicTo(16.984732f, 11.693908f, 16.774412f, 11.366727f, 16.393038f, 11.060363f);
                instancePath.cubicTo(14.828817f, 9.8044815f, 12.952074f, 8.824008f, 11.156554f, 7.951349f);
                instancePath.cubicTo(9.580499f, 7.1859713f, 7.927523f, 6.520402f, 6.232591f, 5.97012f);
                instancePath.cubicTo(5.9109254f, 7.960956f, 5.7479405f, 9.991822f, 5.7479405f, 12.017885f);
                instancePath.cubicTo(5.7479405f, 14.02847f, 5.9082355f, 16.044392f, 6.2245226f, 18.020283f);
                instancePath.cubicTo(7.954956f, 17.452387f, 9.639668f, 16.766003f, 11.242619f, 15.974472f);
                instancePath.cubicTo(12.884836f, 15.164261f, 14.7825575f, 14.161903f, 16.404873f, 12.871863f);
                instancePath.lineTo(16.404873f, 12.871863f);
                instancePath.close();
                instancePath.moveTo(21.084627f, 10.141803f);
                instancePath.cubicTo(19.387545f, 8.553937f, 17.378477f, 7.27297f, 15.288724f, 6.0741987f);
                instancePath.cubicTo(13.211343f, 4.8828993f, 11.068876f, 3.906162f, 8.887142f, 3.1375818f);
                instancePath.cubicTo(7.497201f, 2.6481457f, 5.9969897f, 3.5133321f, 5.7275004f, 4.9597573f);
                instancePath.cubicTo(5.718356f, 5.00726f, 5.7113633f, 5.055296f, 5.702757f, 5.1027985f);
                instancePath.cubicTo(7.6601853f, 5.696847f, 9.583726f, 6.443544f, 11.450249f, 7.350362f);
                instancePath.cubicTo(13.383472f, 8.290272f, 15.238699f, 9.275015f, 16.81314f, 10.539436f);
                instancePath.cubicTo(17.8755f, 11.391812f, 17.988459f, 12.467291f, 16.822285f, 13.394925f);
                instancePath.cubicTo(15.260215f, 14.637463f, 13.444255f, 15.633948f, 11.540079f, 16.573858f);
                instancePath.cubicTo(9.643434f, 17.51003f, 7.6870804f, 18.279678f, 5.6936126f, 18.890806f);
                instancePath.cubicTo(5.702219f, 18.93991f, 5.7102876f, 18.989548f, 5.718894f, 19.038652f);
                instancePath.cubicTo(5.9878454f, 20.48988f, 7.496125f, 21.3556f, 8.888756f, 20.859226f);
                instancePath.cubicTo(11.104916f, 20.06983f, 13.279656f, 19.065338f, 15.386085f, 17.83828f);
                instancePath.cubicTo(17.443563f, 16.639507f, 19.499966f, 15.438601f, 21.093771f, 13.7840185f);
                instancePath.cubicTo(22.380974f, 12.44861f, 22.223368f, 11.20714f, 21.084627f, 10.141803f);
                instancePath.lineTo(21.084627f, 10.141803f);
                instancePath.close();
                instancePath.moveTo(5.078252f, 12.0200205f);
                instancePath.lineTo(5.077714f, 12.020554f);
                instancePath.lineTo(5.077714f, 12.017885f);
                instancePath.cubicTo(5.077714f, 9.656636f, 5.291799f, 7.345558f, 5.7011433f, 5.102265f);
                instancePath.cubicTo(5.6430497f, 5.084118f, 5.5844183f, 5.0654373f, 5.525787f, 5.047824f);
                instancePath.cubicTo(4.239661f, 4.6640673f, 3.110065f, 5.102265f, 2.6022847f, 6.4766355f);
                instancePath.cubicTo(1.9643319f, 8.20007f, 2.0003715f, 10.12152f, 2.0003715f, 12.013082f);
                instancePath.cubicTo(2.0003715f, 13.892367f, 1.9917649f, 15.791401f, 2.594216f, 17.51537f);
                instancePath.cubicTo(3.1477182f, 19.100565f, 4.2385855f, 19.331673f, 5.5274005f, 18.94258f);
                instancePath.cubicTo(5.5828047f, 18.926033f, 5.6376705f, 18.907352f, 5.6936126f, 18.890806f);
                instancePath.cubicTo(5.2901855f, 16.662992f, 5.078252f, 14.36846f, 5.078252f, 12.024824f);
                instancePath.lineTo(5.078252f, 12.0200205f);
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
