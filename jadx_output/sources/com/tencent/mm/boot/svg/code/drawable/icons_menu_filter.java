package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_filter extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.1416f, 3.80742f);
                instancePath.cubicTo(14.4215f, 3.76953f, 14.7075f, 3.75f, 14.9982f, 3.75f);
                instancePath.cubicTo(18.3869f, 3.75f, 21.2077f, 6.5554f, 21.2077f, 9.93781f);
                instancePath.cubicTo(21.2077f, 9.94349f, 21.2077f, 9.94916f, 21.2077f, 9.95483f);
                instancePath.cubicTo(21.2054f, 10.818f, 21.0272f, 11.6398f, 20.7072f, 12.3858f);
                instancePath.cubicTo(18.1126f, 12.5199f, 15.7639f, 13.7454f, 14.3171f, 15.8689f);
                instancePath.cubicTo(14.2723f, 15.9346f, 14.2357f, 16.0036f, 14.2072f, 16.0745f);
                instancePath.cubicTo(11.2022f, 15.6828f, 8.87807f, 13.0881f, 8.86242f, 9.9068f);
                instancePath.cubicTo(8.87776f, 6.80389f, 11.166f, 4.24038f, 14.1416f, 3.80742f);
                instancePath.close();
                instancePath.moveTo(14.2057f, 16.078f);
                instancePath.cubicTo(14.2062f, 16.0768f, 14.2067f, 16.0756f, 14.2072f, 16.0745f);
                instancePath.cubicTo(14.4661f, 16.1082f, 14.7301f, 16.1256f, 14.9982f, 16.1256f);
                instancePath.lineTo(14.9982f, 16.1333f);
                instancePath.cubicTo(14.7296f, 16.1317f, 14.4651f, 16.1129f, 14.2057f, 16.078f);
                instancePath.close();
                instancePath.moveTo(4.11984f, 16.7195f);
                instancePath.cubicTo(5.02547f, 15.6362f, 6.29253f, 14.8709f, 7.73325f, 14.6132f);
                instancePath.cubicTo(7.88564f, 14.5868f, 8.03986f, 14.5659f, 8.19568f, 14.5508f);
                instancePath.cubicTo(9.57183f, 16.6362f, 11.8269f, 18.0841f, 14.4354f, 18.2675f);
                instancePath.cubicTo(14.7772f, 19.0459f, 14.9466f, 19.896f, 14.9466f, 20.7737f);
                instancePath.cubicTo(14.9466f, 20.9483f, 14.9393f, 21.1212f, 14.9249f, 21.2921f);
                instancePath.cubicTo(14.9241f, 21.2832f, 14.9233f, 21.2743f, 14.9226f, 21.2655f);
                instancePath.cubicTo(14.7465f, 23.2774f, 13.6179f, 25.0132f, 11.995f, 26.0099f);
                instancePath.cubicTo(11.0667f, 26.5735f, 9.97673f, 26.8981f, 8.81078f, 26.8981f);
                instancePath.cubicTo(8.31858f, 26.8981f, 7.84119f, 26.8438f, 7.38452f, 26.7401f);
                instancePath.cubicTo(5.00673f, 26.1686f, 3.16545f, 24.1998f, 2.75893f, 21.7406f);
                instancePath.cubicTo(2.7111f, 21.44f, 2.6829f, 21.1303f, 2.67573f, 20.8128f);
                instancePath.cubicTo(2.67548f, 20.7974f, 2.6753f, 20.782f, 2.67517f, 20.7666f);
                instancePath.cubicTo(2.7267f, 19.1521f, 3.26345f, 17.77f, 4.11984f, 16.7195f);
                instancePath.close();
                instancePath.moveTo(17.0007f, 25.3614f);
                instancePath.cubicTo(16.7091f, 25.1049f, 16.4418f, 24.8216f, 16.2029f, 24.5152f);
                instancePath.cubicTo(16.7524f, 23.4104f, 17.0606f, 22.1613f, 17.0606f, 20.8341f);
                instancePath.cubicTo(17.0606f, 19.4838f, 16.7925f, 18.1344f, 16.2004f, 16.9526f);
                instancePath.cubicTo(16.2864f, 16.8336f, 16.3764f, 16.7189f, 16.47f, 16.6084f);
                instancePath.cubicTo(16.8733f, 16.1574f, 17.3418f, 15.7655f, 17.8608f, 15.4476f);
                instancePath.cubicTo(17.8043f, 15.4768f, 17.7473f, 15.5052f, 17.6897f, 15.5328f);
                instancePath.cubicTo(17.9097f, 15.3891f, 18.1395f, 15.2605f, 18.3776f, 15.1474f);
                instancePath.cubicTo(18.3346f, 15.1752f, 18.2913f, 15.2025f, 18.2477f, 15.2292f);
                instancePath.cubicTo(18.6885f, 15.0009f, 19.1603f, 14.8236f, 19.6551f, 14.7054f);
                instancePath.cubicTo(20.1352f, 14.5952f, 20.635f, 14.538f, 21.1458f, 14.5351f);
                instancePath.cubicTo(24.558f, 14.5552f, 27.3179f, 17.3173f, 27.3179f, 20.7217f);
                instancePath.cubicTo(27.3179f, 20.829f, 27.3151f, 20.9356f, 27.3097f, 21.0415f);
                instancePath.cubicTo(27.1803f, 23.1491f, 25.9887f, 25.0158f, 24.2641f, 26.051f);
                instancePath.cubicTo(23.3497f, 26.5896f, 22.2847f, 26.9013f, 21.1472f, 26.9083f);
                instancePath.cubicTo(19.6258f, 26.8989f, 18.1304f, 26.3341f, 17.0007f, 25.3614f);
                instancePath.close();
                instancePath.moveTo(20.1667f, 13.3823f);
                instancePath.cubicTo(20.3153f, 13.1596f, 20.45f, 12.9268f, 20.5693f, 12.685f);
                instancePath.cubicTo(20.4484f, 12.9209f, 20.3099f, 13.1506f, 20.1536f, 13.3742f);
                instancePath.lineTo(20.1667f, 13.3823f);
                instancePath.close();
                instancePath.moveTo(16.1939f, 16.9397f);
                instancePath.cubicTo(16.196f, 16.944f, 16.1982f, 16.9483f, 16.2004f, 16.9526f);
                instancePath.cubicTo(16.169f, 16.996f, 16.1381f, 17.04f, 16.1077f, 17.0845f);
                instancePath.cubicTo(16.0654f, 17.1466f, 16.0177f, 17.203f, 15.9657f, 17.2533f);
                instancePath.cubicTo(16.0386f, 17.1463f, 16.1147f, 17.0418f, 16.1939f, 16.9397f);
                instancePath.close();
                instancePath.moveTo(14.4504f, 18.2685f);
                instancePath.cubicTo(14.4454f, 18.2682f, 14.4404f, 18.2678f, 14.4354f, 18.2675f);
                instancePath.cubicTo(14.3173f, 17.9986f, 14.1787f, 17.7382f, 14.0193f, 17.4883f);
                instancePath.cubicTo(14.0268f, 17.4834f, 14.0343f, 17.4784f, 14.0418f, 17.4735f);
                instancePath.cubicTo(14.1961f, 17.727f, 14.3329f, 17.9926f, 14.4504f, 18.2685f);
                instancePath.close();
                instancePath.moveTo(8.84933f, 14.5181f);
                instancePath.cubicTo(8.83649f, 14.518f, 8.82364f, 14.518f, 8.81078f, 14.518f);
                instancePath.cubicTo(8.60273f, 14.518f, 8.39711f, 14.5284f, 8.19438f, 14.5488f);
                instancePath.cubicTo(8.19482f, 14.5495f, 8.19525f, 14.5502f, 8.19568f, 14.5508f);
                instancePath.cubicTo(8.39819f, 14.5312f, 8.6034f, 14.5212f, 8.81078f, 14.5212f);
                instancePath.cubicTo(8.82392f, 14.5212f, 8.83677f, 14.5201f, 8.84933f, 14.5181f);
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
