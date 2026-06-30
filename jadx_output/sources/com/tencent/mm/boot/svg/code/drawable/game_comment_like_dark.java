package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_like_dark extends l95.c {
    private final int width = 11;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 11;
        }
        if (i17 == 1) {
            return 12;
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
            instancePaint3.setColor(-419430401);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(7.03533f, 1.31129f);
            instancePath.cubicTo(7.39243f, 1.83733f, 7.48831f, 2.39232f, 7.48831f, 3.55906f);
            instancePath.cubicTo(7.48831f, 3.67052f, 7.47788f, 3.75267f, 7.4692f, 3.821f);
            instancePath.cubicTo(7.45309f, 3.94783f, 7.44303f, 4.02702f, 7.517f, 4.15752f);
            instancePath.cubicTo(7.75612f, 4.16143f, 8.96675f, 4.24271f, 9.29756f, 4.36213f);
            instancePath.cubicTo(9.70838f, 4.51042f, 10.0235f, 4.74888f, 10.1836f, 5.10581f);
            instancePath.cubicTo(10.7554f, 6.37982f, 10.0376f, 9.81825f, 8.69477f, 10.9236f);
            instancePath.cubicTo(8.37451f, 11.1874f, 7.79272f, 11.2157f, 7.25342f, 11.2419f);
            instancePath.cubicTo(7.11427f, 11.2487f, 6.97794f, 11.2553f, 6.84967f, 11.2658f);
            instancePath.cubicTo(6.46015f, 11.2976f, 4.46578f, 11.2934f, 0.902313f, 11.2707f);
            instancePath.cubicTo(0.405923f, 11.2677f, 0.00390625f, 10.8691f, 0.00390625f, 10.3755f);
            instancePath.lineTo(0.00390625f, 6.12855f);
            instancePath.cubicTo(0.00390625f, 5.63283f, 0.410414f, 5.23338f, 0.909074f, 5.23338f);
            instancePath.lineTo(2.00263f, 5.23338f);
            instancePath.cubicTo(2.275f, 5.23338f, 2.52972f, 5.20782f, 2.83362f, 5.14094f);
            instancePath.cubicTo(3.04803f, 5.09373f, 3.22618f, 5.00888f, 3.55349f, 4.81696f);
            instancePath.cubicTo(3.92034f, 4.60188f, 4.13651f, 4.35778f, 4.29879f, 3.92868f);
            instancePath.cubicTo(4.39054f, 3.68569f, 4.42169f, 3.44731f, 4.45506f, 2.74197f);
            instancePath.cubicTo(4.45948f, 2.64858f, 4.46059f, 2.61919f, 4.46811f, 2.40718f);
            instancePath.cubicTo(4.50221f, 1.44568f, 4.60416f, 1.1031f, 5.13666f, 0.855816f);
            instancePath.cubicTo(5.84834f, 0.525282f, 6.69848f, 0.814971f, 7.03533f, 1.31129f);
            instancePath.close();
            instancePath.moveTo(6.45618f, 1.70445f);
            instancePath.cubicTo(6.28824f, 1.457f, 5.7931f, 1.32277f, 5.43151f, 1.49071f);
            instancePath.cubicTo(5.22295f, 1.58756f, 5.19522f, 1.65574f, 5.16769f, 2.43201f);
            instancePath.cubicTo(5.15988f, 2.65196f, 5.15878f, 2.68031f, 5.15429f, 2.77506f);
            instancePath.cubicTo(5.11752f, 3.55251f, 5.07927f, 3.84335f, 4.95355f, 4.1763f);
            instancePath.cubicTo(4.73801f, 4.74623f, 4.42065f, 5.12001f, 3.90758f, 5.42082f);
            instancePath.cubicTo(3.62439f, 5.58687f, 3.42623f, 5.68789f, 3.23028f, 5.75567f);
            instancePath.lineTo(3.23028f, 10.5837f);
            instancePath.cubicTo(5.46412f, 10.5937f, 6.53906f, 10.5889f, 6.79256f, 10.5682f);
            instancePath.cubicTo(6.93221f, 10.5567f, 7.08779f, 10.5562f, 7.2455f, 10.5556f);
            instancePath.cubicTo(7.63826f, 10.5541f, 8.04418f, 10.5526f, 8.2499f, 10.3832f);
            instancePath.cubicTo(9.21713f, 9.587f, 10.0689f, 6.55969f, 9.54502f, 5.39242f);
            instancePath.cubicTo(9.47664f, 5.24004f, 9.32543f, 5.1164f, 9.05991f, 5.02055f);
            instancePath.cubicTo(8.83816f, 4.94051f, 7.72418f, 4.89951f, 7.54145f, 4.89615f);
            instancePath.cubicTo(7.34901f, 4.8993f, 7.12852f, 4.84916f, 6.94402f, 4.73556f);
            instancePath.cubicTo(6.69075f, 4.57961f, 6.72039f, 4.31524f, 6.75763f, 3.9832f);
            instancePath.lineTo(6.75763f, 3.9832f);
            instancePath.cubicTo(6.77238f, 3.8516f, 6.78833f, 3.70938f, 6.78833f, 3.55907f);
            instancePath.cubicTo(6.78833f, 2.4875f, 6.70748f, 2.07464f, 6.45618f, 1.70445f);
            instancePath.close();
            instancePath.moveTo(2.53028f, 10.5802f);
            instancePath.lineTo(2.53028f, 5.90263f);
            instancePath.cubicTo(2.35549f, 5.92364f, 2.18316f, 5.93339f, 2.00264f, 5.93339f);
            instancePath.lineTo(0.909091f, 5.93339f);
            instancePath.cubicTo(0.794097f, 5.93339f, 0.703924f, 6.02239f, 0.703924f, 6.12856f);
            instancePath.lineTo(0.703924f, 10.3755f);
            instancePath.cubicTo(0.703924f, 10.4817f, 0.792674f, 10.57f, 0.906794f, 10.5707f);
            instancePath.cubicTo(1.4973f, 10.5745f, 2.03756f, 10.5777f, 2.53028f, 10.5802f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
