package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_switch_to_video extends l95.c {
    private final int width = 18;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 18;
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
                instancePaint3.setColor(-1);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(6.51625f, 9.22117f);
                instancePath.cubicTo(6.39407f, 9.58771f, 5.99788f, 9.7858f, 5.63134f, 9.66362f);
                instancePath.cubicTo(4.47268f, 9.27739f, 3.78418f, 8.03312f, 3.78418f, 6.83949f);
                instancePath.cubicTo(3.78418f, 3.82913f, 6.07379f, 1.69981f, 9.04625f, 1.69981f);
                instancePath.cubicTo(12.0187f, 1.69981f, 14.5277f, 4.30867f, 14.3083f, 7.07897f);
                instancePath.cubicTo(14.3083f, 7.93531f, 13.9258f, 8.61738f, 13.518f, 9.34451f);
                instancePath.cubicTo(13.4322f, 9.49757f, 13.3452f, 9.65263f, 13.2605f, 9.81174f);
                instancePath.lineTo(10.6012f, 14.805f);
                instancePath.cubicTo(9.9114f, 16.1005f, 8.34309f, 16.65f, 6.99547f, 16.0687f);
                instancePath.cubicTo(5.92001f, 15.6048f, 5.22911f, 14.4627f, 5.19589f, 13.305f);
                instancePath.cubicTo(5.18494f, 12.9327f, 5.1906f, 12.6248f, 5.19715f, 12.2686f);
                instancePath.cubicTo(5.19808f, 12.2179f, 5.19904f, 12.1661f, 5.19996f, 12.1131f);
                instancePath.cubicTo(5.20751f, 11.7301f, 5.52407f, 11.4257f, 5.907f, 11.4333f);
                instancePath.cubicTo(6.28994f, 11.4408f, 6.59424f, 11.7574f, 6.58668f, 12.1403f);
                instancePath.cubicTo(6.58567f, 12.1984f, 6.58462f, 12.2546f, 6.58359f, 12.3097f);
                instancePath.cubicTo(6.57746f, 12.6366f, 6.57216f, 12.9196f, 6.58228f, 13.2643f);
                instancePath.cubicTo(6.60019f, 13.873f, 6.98306f, 14.537f, 7.55056f, 14.7818f);
                instancePath.cubicTo(8.22843f, 15.0743f, 9.0172f, 14.7979f, 9.36426f, 14.1462f);
                instancePath.lineTo(12.088f, 9.15291f);
                instancePath.cubicTo(12.1512f, 9.03403f, 12.2188f, 8.91286f, 12.2875f, 8.78971f);
                instancePath.cubicTo(12.6303f, 8.17518f, 13.0005f, 7.51161f, 13.0005f, 6.83949f);
                instancePath.cubicTo(13.0005f, 4.77495f, 11.3275f, 3.10131f, 9.04625f, 3.10131f);
                instancePath.cubicTo(6.76501f, 3.10131f, 5.19589f, 4.74163f, 5.19589f, 6.7748f);
                instancePath.cubicTo(5.19589f, 7.37165f, 5.47813f, 8.1377f, 6.07379f, 8.33626f);
                instancePath.cubicTo(6.44033f, 8.45843f, 6.63843f, 8.85463f, 6.51625f, 9.22117f);
                instancePath.close();
                instancePath.moveTo(6.58958f, 7.27937f);
                instancePath.cubicTo(6.46703f, 7.15072f, 6.39866f, 6.97986f, 6.39866f, 6.80218f);
                instancePath.lineTo(6.39866f, 6.7748f);
                instancePath.cubicTo(6.39866f, 5.4128f, 7.68474f, 4.30868f, 9.04673f, 4.30868f);
                instancePath.cubicTo(10.4087f, 4.30868f, 11.693f, 5.4128f, 11.693f, 6.7748f);
                instancePath.cubicTo(11.693f, 7.22801f, 11.4623f, 7.65932f, 11.2464f, 8.06279f);
                instancePath.cubicTo(11.233f, 8.08795f, 11.2196f, 8.113f, 11.2063f, 8.13794f);
                instancePath.lineTo(9.76241f, 10.529f);
                instancePath.cubicTo(9.57083f, 10.8463f, 9.16454f, 10.9582f, 8.83741f, 10.7841f);
                instancePath.cubicTo(8.48289f, 10.5953f, 8.36064f, 10.1469f, 8.57031f, 9.80429f);
                instancePath.lineTo(9.80719f, 7.78329f);
                instancePath.cubicTo(9.82981f, 7.74083f, 9.86045f, 7.68694f, 9.89523f, 7.6258f);
                instancePath.cubicTo(10.0424f, 7.3671f, 10.2634f, 6.97839f, 10.2634f, 6.7748f);
                instancePath.cubicTo(10.2634f, 6.18682f, 9.7398f, 5.70159f, 9.04673f, 5.70159f);
                instancePath.cubicTo(8.28632f, 5.70159f, 7.80011f, 6.18683f, 7.80011f, 6.7748f);
                instancePath.cubicTo(7.80011f, 6.96734f, 7.7218f, 7.15446f, 7.5832f, 7.28811f);
                instancePath.lineTo(7.57068f, 7.30019f);
                instancePath.cubicTo(7.29446f, 7.56653f, 6.85425f, 7.55718f, 6.58958f, 7.27937f);
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
