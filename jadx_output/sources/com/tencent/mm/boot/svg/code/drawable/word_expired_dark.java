package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class word_expired_dark extends l95.c {
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
        instancePaint3.setColor(-12564142);
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
        instancePaint4.setColor(-12893366);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(28.5503f, 0.0f);
        instancePath2.cubicTo(29.2497f, 0.0f, 29.9275f, 0.209352f, 30.5f, 0.593355f);
        instancePath2.cubicTo(30.6873f, 0.718989f, 30.8633f, 0.86334f, 31.0251f, 1.02515f);
        instancePath2.lineTo(41.9749f, 11.9749f);
        instancePath2.cubicTo(42.1367f, 12.1367f, 42.281f, 12.3127f, 42.4066f, 12.5f);
        instancePath2.cubicTo(42.7906f, 13.0725f, 43.0f, 13.7503f, 43.0f, 14.4497f);
        instancePath2.lineTo(43.0f, 14.5f);
        instancePath2.cubicTo(43.0f, 13.6743f, 42.3329f, 13.0044f, 41.5082f, 13.0f);
        instancePath2.lineTo(31.7333f, 13.0f);
        instancePath2.cubicTo(30.776f, 13.0f, 30.0f, 12.224f, 30.0f, 11.2667f);
        instancePath2.lineTo(30.0f, 1.5f);
        instancePath2.cubicTo(30.0f, 0.671573f, 29.3284f, 0.0f, 28.5f, 0.0f);
        instancePath2.lineTo(28.5503f, 0.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-10591900);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(21.6499f, 36.6636f);
        instancePath3.lineTo(19.3398f, 36.6636f);
        instancePath3.lineTo(16.0f, 24.0f);
        instancePath3.lineTo(18.709f, 24.0f);
        instancePath3.lineTo(20.6108f, 33.1938f);
        instancePath3.lineTo(20.7314f, 33.1938f);
        instancePath3.lineTo(22.9673f, 24.0f);
        instancePath3.lineTo(25.1289f, 24.0f);
        instancePath3.lineTo(27.3647f, 33.1938f);
        instancePath3.lineTo(27.4946f, 33.1938f);
        instancePath3.lineTo(29.3779f, 24.0f);
        instancePath3.lineTo(32.0962f, 24.0f);
        instancePath3.lineTo(28.7563f, 36.6636f);
        instancePath3.lineTo(26.4463f, 36.6636f);
        instancePath3.lineTo(24.0991f, 27.8315f);
        instancePath3.lineTo(23.9971f, 27.8315f);
        instancePath3.lineTo(21.6499f, 36.6636f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
