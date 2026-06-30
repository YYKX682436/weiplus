package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class epub_expired_dark extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePaint3.setColor(-11578299);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.6f, 48.0f);
        instancePath.lineTo(37.4f, 48.0f);
        instancePath.cubicTo(39.3602f, 48.0f, 40.3403f, 48.0f, 41.089f, 47.6185f);
        instancePath.cubicTo(41.7475f, 47.283f, 42.283f, 46.7475f, 42.6185f, 46.089f);
        instancePath.cubicTo(43.0f, 45.3403f, 43.0f, 44.3602f, 43.0f, 42.4f);
        instancePath.lineTo(43.0f, 15.3196f);
        instancePath.cubicTo(43.0f, 14.4635f, 43.0f, 14.0355f, 42.9033f, 13.6327f);
        instancePath.cubicTo(42.8176f, 13.2756f, 42.6761f, 12.9342f, 42.4842f, 12.621f);
        instancePath.cubicTo(42.2678f, 12.2678f, 41.9651f, 11.9651f, 41.3598f, 11.3598f);
        instancePath.lineTo(31.6402f, 1.6402f);
        instancePath.lineTo(31.6402f, 1.64018f);
        instancePath.cubicTo(31.0349f, 1.03486f, 30.7322f, 0.732203f, 30.379f, 0.515759f);
        instancePath.cubicTo(30.0658f, 0.323859f, 29.7244f, 0.182444f, 29.3673f, 0.0967053f);
        instancePath.cubicTo(28.9645f, 0.0f, 28.5365f, 0.0f, 27.6804f, 0.0f);
        instancePath.lineTo(10.6f, 0.0f);
        instancePath.cubicTo(8.63982f, 0.0f, 7.65972f, 0.0f, 6.91103f, 0.381477f);
        instancePath.cubicTo(6.25247f, 0.717034f, 5.71703f, 1.25247f, 5.38148f, 1.91103f);
        instancePath.cubicTo(5.0f, 2.65972f, 5.0f, 3.63982f, 5.0f, 5.6f);
        instancePath.lineTo(5.0f, 42.4f);
        instancePath.cubicTo(5.0f, 44.3602f, 5.0f, 45.3403f, 5.38148f, 46.089f);
        instancePath.cubicTo(5.71703f, 46.7475f, 6.25247f, 47.283f, 6.91103f, 47.6185f);
        instancePath.cubicTo(7.65972f, 48.0f, 8.63982f, 48.0f, 10.6f, 48.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-10263456);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.5002f, 23.252f);
        instancePath2.cubicTo(20.9666f, 23.252f, 22.2878f, 23.8468f, 22.9173f, 24.7945f);
        instancePath2.cubicTo(23.0557f, 24.9951f, 23.0764f, 25.0712f, 23.0764f, 25.258f);
        instancePath2.lineTo(23.0764f, 35.1982f);
        instancePath2.cubicTo(23.0764f, 35.3849f, 22.9381f, 35.5094f, 22.7721f, 35.5094f);
        instancePath2.cubicTo(22.6752f, 35.5094f, 22.5645f, 35.4749f, 22.4746f, 35.3918f);
        instancePath2.cubicTo(21.7621f, 34.8039f, 20.856f, 34.4857f, 19.8944f, 34.4857f);
        instancePath2.cubicTo(18.926f, 34.4857f, 17.9576f, 34.79f, 17.1898f, 35.3642f);
        instancePath2.cubicTo(16.8993f, 35.544f, 16.7263f, 35.627f, 16.4427f, 35.627f);
        instancePath2.cubicTo(15.9585f, 35.627f, 15.668f, 35.3573f, 15.668f, 34.8661f);
        instancePath2.lineTo(15.668f, 25.7353f);
        instancePath2.cubicTo(15.668f, 25.3894f, 15.6956f, 25.2649f, 15.8201f, 25.0505f);
        instancePath2.cubicTo(16.4565f, 23.9575f, 17.9991f, 23.252f, 19.5002f, 23.252f);
        instancePath2.close();
        instancePath2.moveTo(27.6695f, 23.252f);
        instancePath2.cubicTo(29.1706f, 23.252f, 30.7201f, 23.9575f, 31.3564f, 25.0505f);
        instancePath2.cubicTo(31.474f, 25.258f, 31.5017f, 25.3894f, 31.5017f, 25.7353f);
        instancePath2.lineTo(31.5017f, 34.8661f);
        instancePath2.cubicTo(31.5017f, 35.3573f, 31.2112f, 35.627f, 30.727f, 35.627f);
        instancePath2.cubicTo(30.4503f, 35.627f, 30.2704f, 35.544f, 29.9868f, 35.3642f);
        instancePath2.cubicTo(29.2121f, 34.79f, 28.2437f, 34.4857f, 27.2752f, 34.4857f);
        instancePath2.cubicTo(26.3137f, 34.4857f, 25.4076f, 34.8039f, 24.6951f, 35.3918f);
        instancePath2.cubicTo(24.6051f, 35.4749f, 24.4945f, 35.5094f, 24.4045f, 35.5094f);
        instancePath2.cubicTo(24.2316f, 35.5094f, 24.0933f, 35.3849f, 24.0933f, 35.1982f);
        instancePath2.lineTo(24.0933f, 25.258f);
        instancePath2.cubicTo(24.0933f, 25.0712f, 24.1209f, 24.9951f, 24.2524f, 24.7945f);
        instancePath2.cubicTo(24.8888f, 23.8468f, 26.203f, 23.252f, 27.6695f, 23.252f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-12039104);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(28.5503f, 0.0f);
        instancePath3.cubicTo(29.2497f, 0.0f, 29.9275f, 0.209352f, 30.5f, 0.593355f);
        instancePath3.cubicTo(30.6873f, 0.718989f, 30.8633f, 0.86334f, 31.0251f, 1.02515f);
        instancePath3.lineTo(41.9749f, 11.9749f);
        instancePath3.cubicTo(42.1367f, 12.1367f, 42.281f, 12.3127f, 42.4066f, 12.5f);
        instancePath3.cubicTo(42.7906f, 13.0725f, 43.0f, 13.7503f, 43.0f, 14.4497f);
        instancePath3.lineTo(43.0f, 14.5f);
        instancePath3.cubicTo(43.0f, 13.6743f, 42.3329f, 13.0044f, 41.5082f, 13.0f);
        instancePath3.lineTo(31.7333f, 13.0f);
        instancePath3.cubicTo(30.776f, 13.0f, 30.0f, 12.224f, 30.0f, 11.2667f);
        instancePath3.lineTo(30.0f, 1.5f);
        instancePath3.cubicTo(30.0f, 0.671573f, 29.3284f, 0.0f, 28.5f, 0.0f);
        instancePath3.lineTo(28.5503f, 0.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
