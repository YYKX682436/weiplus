package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_origin extends l95.c {
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.0f, 2.41699f);
            instancePath.cubicTo(18.5983f, 2.41704f, 19.083f, 2.90172f, 19.083f, 3.5f);
            instancePath.lineTo(19.083f, 11.4082f);
            instancePath.lineTo(19.0f, 11.4082f);
            instancePath.cubicTo(18.7128f, 11.4082f, 18.4285f, 11.5203f, 18.2148f, 11.6582f);
            instancePath.cubicTo(18.1083f, 11.727f, 18.0214f, 11.8003f, 17.9629f, 11.8662f);
            instancePath.cubicTo(17.9338f, 11.899f, 17.9127f, 11.9285f, 17.8994f, 11.9531f);
            instancePath.lineTo(17.8838f, 12.0f);
            instancePath.lineTo(17.7168f, 12.0f);
            instancePath.lineTo(17.7168f, 3.7832f);
            instancePath.lineTo(5.2832f, 3.7832f);
            instancePath.lineTo(5.2832f, 20.2168f);
            instancePath.lineTo(10.707f, 20.2168f);
            instancePath.lineTo(10.7295f, 20.2627f);
            instancePath.cubicTo(10.9032f, 20.6151f, 10.9869f, 20.7833f, 11.0879f, 20.9268f);
            instancePath.cubicTo(11.1885f, 21.0696f, 11.3068f, 21.1897f, 11.5586f, 21.4414f);
            instancePath.lineTo(11.7012f, 21.583f);
            instancePath.lineTo(5.0f, 21.583f);
            instancePath.cubicTo(4.40169f, 21.583f, 3.917f, 21.0983f, 3.91699f, 20.5f);
            instancePath.lineTo(3.91699f, 3.5f);
            instancePath.cubicTo(3.91699f, 2.90169f, 4.40169f, 2.41699f, 5.0f, 2.41699f);
            instancePath.lineTo(18.0f, 2.41699f);
            instancePath.close();
            instancePath.moveTo(19.7773f, 12.6182f);
            instancePath.cubicTo(20.3097f, 12.6116f, 20.7129f, 12.983f, 20.9014f, 13.4385f);
            instancePath.cubicTo(21.0881f, 13.8899f, 21.1091f, 14.5459f, 21.0625f, 15.1943f);
            instancePath.cubicTo(21.0157f, 15.8463f, 20.8991f, 16.5055f, 20.8027f, 16.9727f);
            instancePath.cubicTo(20.5121f, 18.3821f, 20.0433f, 19.7925f, 19.6045f, 20.5645f);
            instancePath.cubicTo(19.3134f, 21.0765f, 19.0083f, 21.364f, 18.6396f, 21.418f);
            instancePath.cubicTo(18.5827f, 21.4263f, 18.5241f, 21.4307f, 18.4668f, 21.4307f);
            instancePath.cubicTo(17.9446f, 21.4306f, 17.4487f, 21.0906f, 17.0205f, 20.6475f);
            instancePath.cubicTo(16.6242f, 20.2373f, 16.2748f, 19.7241f, 16.0f, 19.2656f);
            instancePath.cubicTo(15.7252f, 19.7241f, 15.3758f, 20.2373f, 14.9795f, 20.6475f);
            instancePath.cubicTo(14.5513f, 21.0906f, 14.0552f, 21.4305f, 13.5332f, 21.4307f);
            instancePath.cubicTo(13.4759f, 21.4307f, 13.4172f, 21.4263f, 13.3604f, 21.418f);
            instancePath.cubicTo(12.9915f, 21.364f, 12.6866f, 21.0764f, 12.3955f, 20.5645f);
            instancePath.cubicTo(11.9567f, 19.7925f, 11.4879f, 18.3822f, 11.1973f, 16.9727f);
            instancePath.cubicTo(11.1009f, 16.5055f, 10.9843f, 15.8463f, 10.9375f, 15.1943f);
            instancePath.cubicTo(10.8909f, 14.5459f, 10.9119f, 13.8899f, 11.0986f, 13.4385f);
            instancePath.cubicTo(11.234f, 13.1113f, 11.4174f, 12.9103f, 11.6025f, 12.7891f);
            instancePath.cubicTo(11.787f, 12.6684f, 11.9686f, 12.6298f, 12.0967f, 12.6201f);
            instancePath.cubicTo(12.5719f, 12.5849f, 13.0736f, 12.8603f, 13.6416f, 13.4482f);
            instancePath.cubicTo(14.2119f, 14.0386f, 14.8647f, 14.96f, 15.6436f, 16.2529f);
            instancePath.cubicTo(15.772f, 16.466f, 15.8921f, 16.667f, 16.0f, 16.8477f);
            instancePath.cubicTo(16.1084f, 16.6663f, 16.2286f, 16.4651f, 16.3564f, 16.2529f);
            instancePath.cubicTo(17.1005f, 15.0177f, 17.7281f, 14.1215f, 18.2793f, 13.5293f);
            instancePath.cubicTo(18.8284f, 12.9394f, 19.3146f, 12.6372f, 19.7754f, 12.6182f);
            instancePath.lineTo(19.7773f, 12.6182f);
            instancePath.close();
            instancePath.moveTo(12.2422f, 13.8633f);
            instancePath.cubicTo(12.2236f, 13.8776f, 12.2035f, 13.9074f, 12.1855f, 13.9482f);
            instancePath.cubicTo(12.1009f, 14.2107f, 12.089f, 14.6957f, 12.1504f, 15.3203f);
            instancePath.cubicTo(12.2115f, 15.9417f, 12.3442f, 16.6892f, 12.54f, 17.4678f);
            instancePath.cubicTo(12.9209f, 18.9817f, 13.3312f, 19.8296f, 13.54f, 20.1445f);
            instancePath.cubicTo(13.571f, 20.1912f, 13.6309f, 20.2061f, 13.6787f, 20.1807f);
            instancePath.cubicTo(13.8525f, 20.0878f, 14.1745f, 19.8332f, 14.6494f, 19.1426f);
            instancePath.cubicTo(14.9323f, 18.731f, 15.1677f, 18.3075f, 15.3125f, 18.0342f);
            instancePath.cubicTo(15.1567f, 17.7713f, 14.9067f, 17.3491f, 14.6182f, 16.8701f);
            instancePath.cubicTo(13.2663f, 14.6259f, 12.5598f, 14.0244f, 12.291f, 13.8662f);
            instancePath.cubicTo(12.2731f, 13.8557f, 12.2628f, 13.8553f, 12.2588f, 13.8555f);
            instancePath.cubicTo(12.2551f, 13.8557f, 12.25f, 13.8573f, 12.2422f, 13.8633f);
            instancePath.close();
            instancePath.moveTo(19.7109f, 13.8652f);
            instancePath.cubicTo(19.4445f, 14.0215f, 18.7374f, 14.6199f, 17.3818f, 16.8701f);
            instancePath.cubicTo(17.0919f, 17.3515f, 16.8391f, 17.7745f, 16.6836f, 18.0371f);
            instancePath.cubicTo(16.9651f, 18.5801f, 17.2656f, 19.0495f, 17.5449f, 19.4141f);
            instancePath.cubicTo(17.8325f, 19.7894f, 18.0928f, 20.0482f, 18.2822f, 20.166f);
            instancePath.cubicTo(18.3483f, 20.2069f, 18.4334f, 20.1877f, 18.4736f, 20.125f);
            instancePath.cubicTo(18.685f, 19.7961f, 19.0868f, 18.9516f, 19.46f, 17.4678f);
            instancePath.cubicTo(19.6629f, 16.6612f, 19.7984f, 15.8881f, 19.8564f, 15.2539f);
            instancePath.cubicTo(19.8855f, 14.9367f, 19.8953f, 14.6552f, 19.8848f, 14.4229f);
            instancePath.cubicTo(19.8742f, 14.1892f, 19.8433f, 14.0114f, 19.7959f, 13.8965f);
            instancePath.lineTo(19.7939f, 13.8926f);
            instancePath.lineTo(19.7939f, 13.8916f);
            instancePath.cubicTo(19.778f, 13.8564f, 19.7426f, 13.8467f, 19.7109f, 13.8652f);
            instancePath.close();
            instancePath.moveTo(11.083f, 11.1836f);
            instancePath.lineTo(6.91699f, 11.1836f);
            instancePath.lineTo(6.91699f, 9.81641f);
            instancePath.lineTo(11.083f, 9.81641f);
            instancePath.lineTo(11.083f, 11.1836f);
            instancePath.close();
            instancePath.moveTo(16.083f, 8.18359f);
            instancePath.lineTo(6.91699f, 8.18359f);
            instancePath.lineTo(6.91699f, 6.81641f);
            instancePath.lineTo(16.083f, 6.81641f);
            instancePath.lineTo(16.083f, 8.18359f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
