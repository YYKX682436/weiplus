package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_like extends l95.c {
    private final int width = 14;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 14;
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(9.03533f, 2.31129f);
                instancePath.cubicTo(9.39243f, 2.83733f, 9.48831f, 3.39232f, 9.48831f, 4.55906f);
                instancePath.cubicTo(9.48831f, 4.67052f, 9.47788f, 4.75267f, 9.4692f, 4.821f);
                instancePath.cubicTo(9.45309f, 4.94783f, 9.44303f, 5.02702f, 9.517f, 5.15752f);
                instancePath.cubicTo(9.75612f, 5.16143f, 10.9667f, 5.24271f, 11.2976f, 5.36213f);
                instancePath.cubicTo(11.7084f, 5.51042f, 12.0235f, 5.74888f, 12.1836f, 6.10581f);
                instancePath.cubicTo(12.7554f, 7.37982f, 12.0376f, 10.8182f, 10.6948f, 11.9236f);
                instancePath.cubicTo(10.3745f, 12.1874f, 9.79272f, 12.2157f, 9.25342f, 12.2419f);
                instancePath.cubicTo(9.11427f, 12.2487f, 8.97794f, 12.2553f, 8.84967f, 12.2658f);
                instancePath.cubicTo(8.46015f, 12.2976f, 6.46578f, 12.2934f, 2.90231f, 12.2707f);
                instancePath.cubicTo(2.40592f, 12.2677f, 2.00391f, 11.8691f, 2.00391f, 11.3755f);
                instancePath.lineTo(2.00391f, 7.12855f);
                instancePath.cubicTo(2.00391f, 6.63283f, 2.41041f, 6.23338f, 2.90907f, 6.23338f);
                instancePath.lineTo(4.00263f, 6.23338f);
                instancePath.cubicTo(4.275f, 6.23338f, 4.52972f, 6.20782f, 4.83362f, 6.14094f);
                instancePath.cubicTo(5.04803f, 6.09373f, 5.22618f, 6.00888f, 5.55349f, 5.81696f);
                instancePath.cubicTo(5.92034f, 5.60188f, 6.13651f, 5.35778f, 6.29879f, 4.92868f);
                instancePath.cubicTo(6.39054f, 4.68569f, 6.42169f, 4.44731f, 6.45506f, 3.74197f);
                instancePath.cubicTo(6.45948f, 3.64858f, 6.46059f, 3.61919f, 6.46811f, 3.40718f);
                instancePath.cubicTo(6.50221f, 2.44568f, 6.60416f, 2.1031f, 7.13666f, 1.85582f);
                instancePath.cubicTo(7.84834f, 1.52528f, 8.69848f, 1.81497f, 9.03533f, 2.31129f);
                instancePath.close();
                instancePath.moveTo(8.45618f, 2.70445f);
                instancePath.cubicTo(8.28824f, 2.457f, 7.7931f, 2.32277f, 7.43151f, 2.49071f);
                instancePath.cubicTo(7.22295f, 2.58756f, 7.19522f, 2.65574f, 7.16769f, 3.43201f);
                instancePath.cubicTo(7.15988f, 3.65196f, 7.15878f, 3.68031f, 7.15429f, 3.77506f);
                instancePath.cubicTo(7.11752f, 4.55251f, 7.07927f, 4.84335f, 6.95355f, 5.1763f);
                instancePath.cubicTo(6.73801f, 5.74623f, 6.42065f, 6.12001f, 5.90758f, 6.42082f);
                instancePath.cubicTo(5.62439f, 6.58687f, 5.42623f, 6.68789f, 5.23028f, 6.75567f);
                instancePath.lineTo(5.23028f, 11.5837f);
                instancePath.cubicTo(7.46412f, 11.5937f, 8.53906f, 11.5889f, 8.79256f, 11.5682f);
                instancePath.cubicTo(8.93221f, 11.5567f, 9.08779f, 11.5562f, 9.2455f, 11.5556f);
                instancePath.cubicTo(9.63826f, 11.5541f, 10.0442f, 11.5526f, 10.2499f, 11.3832f);
                instancePath.cubicTo(11.2171f, 10.587f, 12.0689f, 7.55969f, 11.545f, 6.39242f);
                instancePath.cubicTo(11.4766f, 6.24004f, 11.3254f, 6.1164f, 11.0599f, 6.02055f);
                instancePath.cubicTo(10.8382f, 5.94051f, 9.72418f, 5.89951f, 9.54145f, 5.89615f);
                instancePath.cubicTo(9.34901f, 5.8993f, 9.12852f, 5.84916f, 8.94402f, 5.73556f);
                instancePath.cubicTo(8.69075f, 5.57961f, 8.72039f, 5.31524f, 8.75763f, 4.9832f);
                instancePath.lineTo(8.75763f, 4.9832f);
                instancePath.cubicTo(8.77238f, 4.8516f, 8.78833f, 4.70938f, 8.78833f, 4.55907f);
                instancePath.cubicTo(8.78833f, 3.4875f, 8.70748f, 3.07464f, 8.45618f, 2.70445f);
                instancePath.close();
                instancePath.moveTo(4.53028f, 11.5802f);
                instancePath.lineTo(4.53028f, 6.90263f);
                instancePath.cubicTo(4.35549f, 6.92364f, 4.18316f, 6.93339f, 4.00264f, 6.93339f);
                instancePath.lineTo(2.90909f, 6.93339f);
                instancePath.cubicTo(2.7941f, 6.93339f, 2.70392f, 7.02239f, 2.70392f, 7.12856f);
                instancePath.lineTo(2.70392f, 11.3755f);
                instancePath.cubicTo(2.70392f, 11.4817f, 2.79267f, 11.57f, 2.90679f, 11.5707f);
                instancePath.cubicTo(3.4973f, 11.5745f, 4.03756f, 11.5777f, 4.53028f, 11.5802f);
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
