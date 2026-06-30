package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class spannable_app_brand_link_logo_dark extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
        }
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-13684945);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(30.0f, 0.0f);
            instancePath.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            instancePath.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            instancePath.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            instancePath.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 245, 31);
            canvas.drawPath(instancePath, l95.c.instancePaint(instancePaint3, looper));
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-8548183);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(25.055851f, 16.55173f);
            instancePath2.lineTo(24.672968f, 16.555822f);
            instancePath2.cubicTo(23.556097f, 16.555822f, 22.90875f, 15.772191f, 23.328331f, 14.828192f);
            instancePath2.cubicTo(23.62506f, 14.135827f, 24.300451f, 13.590319f, 25.111223f, 13.410193f);
            instancePath2.cubicTo(27.469143f, 12.841042f, 29.092695f, 10.988818f, 29.092695f, 8.815007f);
            instancePath2.cubicTo(29.092695f, 6.1977615f, 26.610712f, 4.059816f, 23.498846f, 4.059816f);
            instancePath2.cubicTo(20.38698f, 4.059816f, 17.904997f, 6.1977615f, 17.904997f, 8.815007f);
            instancePath2.lineTo(17.904997f, 21.39488f);
            instancePath2.cubicTo(17.904997f, 25.733704f, 14.016926f, 29.21956f, 9.241657f, 29.21956f);
            instancePath2.cubicTo(4.466389f, 29.21956f, 0.5783189f, 25.733704f, 0.5783189f, 21.39488f);
            instancePath2.cubicTo(0.5783189f, 17.59332f, 3.585328f, 14.353009f, 7.648207f, 13.73793f);
            instancePath2.lineTo(7.98367f, 13.73793f);
            instancePath2.cubicTo(8.842476f, 13.73793f, 9.434549f, 14.236519f, 9.434549f, 14.937212f);
            instancePath2.cubicTo(9.434904f, 15.059127f, 9.432623f, 15.118441f, 9.4203005f, 15.192375f);
            instancePath2.cubicTo(9.404586f, 15.286661f, 9.373752f, 15.375737f, 9.328306f, 15.465561f);
            instancePath2.cubicTo(9.046687f, 16.122671f, 8.316116f, 16.690893f, 7.545414f, 16.883558f);
            instancePath2.cubicTo(5.20022f, 17.44964f, 3.563942f, 19.293333f, 3.563942f, 21.39488f);
            instancePath2.cubicTo(3.563942f, 24.012125f, 6.045925f, 26.150072f, 9.157792f, 26.150072f);
            instancePath2.cubicTo(12.269658f, 26.150072f, 14.751641f, 24.012125f, 14.751641f, 21.39488f);
            instancePath2.lineTo(14.751641f, 8.815007f);
            instancePath2.cubicTo(14.751641f, 4.476183f, 18.639711f, 0.9903269f, 23.41498f, 0.9903269f);
            instancePath2.cubicTo(28.190248f, 0.9903269f, 32.07832f, 4.476183f, 32.07832f, 8.815007f);
            instancePath2.cubicTo(32.07832f, 12.657618f, 29.120598f, 15.844817f, 25.055851f, 16.55173f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
