package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_red_envelope_small extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.5f, 8.75149f);
                instancePath.lineTo(12.0311f, 8.75149f);
                instancePath.cubicTo(12.1352f, 8.54415f, 12.1938f, 8.30977f, 12.1938f, 8.06133f);
                instancePath.cubicTo(12.1938f, 7.21422f, 11.5121f, 6.52993f, 10.6741f, 6.52993f);
                instancePath.cubicTo(10.259f, 6.52993f, 9.86934f, 6.69916f, 9.58508f, 6.99323f);
                instancePath.cubicTo(8.72588f, 7.85576f, 8.3398f, 8.24353f, 8.00001f, 8.58458f);
                instancePath.lineTo(6.3806f, 6.95894f);
                instancePath.cubicTo(6.09366f, 6.68304f, 5.72113f, 6.52993f, 5.32607f, 6.52993f);
                instancePath.cubicTo(4.48806f, 6.52993f, 3.80619f, 7.21422f, 3.80619f, 8.06133f);
                instancePath.cubicTo(3.80619f, 8.30977f, 3.86495f, 8.54415f, 3.96891f, 8.75149f);
                instancePath.lineTo(2.50001f, 8.75149f);
                instancePath.lineTo(2.50001f, 2.96628f);
                instancePath.cubicTo(2.50001f, 2.57865f, 2.76965f, 2.12287f, 3.11454f, 1.95118f);
                instancePath.cubicTo(3.11454f, 1.95118f, 3.14324f, 1.9352f, 3.23554f, 1.89586f);
                instancePath.cubicTo(4.52227f, 1.34706f, 6.18193f, 1.0f, 8.00001f, 1.0f);
                instancePath.cubicTo(9.81582f, 1.0f, 11.4782f, 1.33491f, 12.7595f, 1.89368f);
                instancePath.cubicTo(12.8369f, 1.92741f, 12.8815f, 1.94927f, 12.8815f, 1.94927f);
                instancePath.cubicTo(13.2231f, 2.12341f, 13.5f, 2.57879f, 13.5f, 2.96628f);
                instancePath.lineTo(13.5f, 8.75149f);
                instancePath.close();
                instancePath.moveTo(13.5f, 9.59145f);
                instancePath.lineTo(13.5f, 14.3f);
                instancePath.cubicTo(13.5f, 14.6875f, 13.1943f, 15.0f, 12.812f, 15.0f);
                instancePath.lineTo(3.18804f, 15.0f);
                instancePath.cubicTo(2.808f, 15.0f, 2.5f, 14.6873f, 2.5f, 14.3f);
                instancePath.lineTo(2.5f, 9.59145f);
                instancePath.lineTo(5.2614f, 9.59145f);
                instancePath.cubicTo(5.28287f, 9.59241f, 5.30446f, 9.59282f, 5.32606f, 9.59282f);
                instancePath.lineTo(6.99551f, 9.59282f);
                instancePath.cubicTo(6.41345f, 10.1719f, 5.51816f, 10.9309f, 4.31259f, 11.8659f);
                instancePath.lineTo(4.81241f, 12.534f);
                instancePath.cubicTo(6.06655f, 11.5614f, 6.99726f, 10.7707f, 7.60789f, 10.1579f);
                instancePath.lineTo(8.0f, 9.76423f);
                instancePath.cubicTo(8.11617f, 9.88088f, 8.2467f, 10.0119f, 8.4007f, 10.1663f);
                instancePath.cubicTo(9.00932f, 10.7774f, 9.93721f, 11.5654f, 11.1877f, 12.5342f);
                instancePath.lineTo(11.6873f, 11.8657f);
                instancePath.cubicTo(10.4797f, 10.93f, 9.5844f, 10.1711f, 9.00449f, 9.59282f);
                instancePath.lineTo(10.6741f, 9.59282f);
                instancePath.cubicTo(10.6958f, 9.59282f, 10.7173f, 9.59241f, 10.7387f, 9.59145f);
                instancePath.lineTo(13.5f, 9.59145f);
                instancePath.close();
                instancePath.moveTo(10.7182f, 8.75143f);
                instancePath.lineTo(9.00887f, 8.75143f);
                instancePath.lineTo(10.1688f, 7.58691f);
                instancePath.cubicTo(10.3036f, 7.44745f, 10.4821f, 7.36987f, 10.6742f, 7.36987f);
                instancePath.cubicTo(11.0592f, 7.36987f, 11.3688f, 7.68088f, 11.3688f, 8.06127f);
                instancePath.cubicTo(11.3688f, 8.42732f, 11.0825f, 8.72876f, 10.7182f, 8.75143f);
                instancePath.close();
                instancePath.moveTo(5.28211f, 8.75143f);
                instancePath.cubicTo(4.91777f, 8.72876f, 4.63136f, 8.42718f, 4.63136f, 8.06127f);
                instancePath.cubicTo(4.63136f, 7.68088f, 4.94111f, 7.36987f, 5.32611f, 7.36987f);
                instancePath.cubicTo(5.50895f, 7.36987f, 5.67945f, 7.43994f, 5.80796f, 7.56341f);
                instancePath.cubicTo(6.35675f, 8.11426f, 6.71506f, 8.47417f, 6.99127f, 8.75143f);
                instancePath.lineTo(5.28211f, 8.75143f);
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
