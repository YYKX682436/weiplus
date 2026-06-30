package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_ad_finder_link extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.79373f, 3.36494f);
        instancePath.cubicTo(2.0804f, 2.66961f, 2.52907f, 2.49427f, 2.8544f, 2.46961f);
        instancePath.cubicTo(3.5724f, 2.42361f, 4.7144f, 2.89894f, 7.26839f, 7.13894f);
        instancePath.cubicTo(7.45579f, 7.44981f, 7.74415f, 7.94151f, 7.99843f, 8.37756f);
        instancePath.cubicTo(8.25271f, 7.94151f, 8.54108f, 7.44981f, 8.72848f, 7.13894f);
        instancePath.cubicTo(11.2825f, 2.89894f, 12.4245f, 2.42361f, 13.1425f, 2.46961f);
        instancePath.cubicTo(13.4678f, 2.49427f, 13.9165f, 2.66961f, 14.2031f, 3.36494f);
        instancePath.cubicTo(14.9371f, 5.13961f, 13.8045f, 10.5369f, 12.6631f, 12.5436f);
        instancePath.cubicTo(12.357f, 13.0841f, 11.9181f, 13.5389f, 11.2625f, 13.5349f);
        instancePath.cubicTo(9.97524f, 13.5349f, 8.69527f, 11.6088f, 7.99844f, 10.355f);
        instancePath.cubicTo(7.3016f, 11.6088f, 6.02163f, 13.5349f, 4.7344f, 13.5349f);
        instancePath.cubicTo(4.07879f, 13.5389f, 3.6399f, 13.0841f, 3.33373f, 12.5436f);
        instancePath.cubicTo(2.1924f, 10.5369f, 1.05974f, 5.13961f, 1.79373f, 3.36494f);
        instancePath.close();
        instancePath.moveTo(6.26903f, 7.74092f);
        instancePath.cubicTo(5.00943f, 5.64981f, 4.1529f, 4.58333f, 3.58024f, 4.05306f);
        instancePath.cubicTo(3.30069f, 3.79421f, 3.1232f, 3.69585f, 3.03529f, 3.65886f);
        instancePath.cubicTo(3.00495f, 3.64609f, 2.98319f, 3.63955f, 2.96731f, 3.6363f);
        instancePath.lineTo(2.9621f, 3.64294f);
        instancePath.cubicTo(2.94285f, 3.66817f, 2.90965f, 3.71909f, 2.87233f, 3.80962f);
        instancePath.lineTo(2.87183f, 3.81084f);
        instancePath.cubicTo(2.7855f, 4.01957f, 2.71066f, 4.48568f, 2.73046f, 5.23478f);
        instancePath.cubicTo(2.74925f, 5.94542f, 2.84851f, 6.78697f, 3.00802f, 7.65686f);
        instancePath.cubicTo(3.33338f, 9.43133f, 3.87294f, 11.1318f, 4.34784f, 11.9668f);
        instancePath.lineTo(4.34886f, 11.9686f);
        instancePath.cubicTo(4.45911f, 12.1633f, 4.55566f, 12.2725f, 4.62404f, 12.3263f);
        instancePath.cubicTo(4.67393f, 12.3655f, 4.69636f, 12.3685f, 4.72736f, 12.3683f);
        instancePath.lineTo(4.7344f, 12.3683f);
        instancePath.cubicTo(4.78724f, 12.3683f, 4.99276f, 12.3269f, 5.35756f, 12.0021f);
        instancePath.cubicTo(5.69994f, 11.6973f, 6.0525f, 11.2577f, 6.38225f, 10.7673f);
        instancePath.cubicTo(6.70661f, 10.2849f, 6.98089f, 9.79569f, 7.17546f, 9.42305f);
        instancePath.cubicTo(7.18868f, 9.39773f, 7.20151f, 9.37299f, 7.21393f, 9.3489f);
        instancePath.lineTo(7.0443f, 9.05739f);
        instancePath.cubicTo(6.77741f, 8.59929f, 6.46468f, 8.06547f, 6.26903f, 7.74092f);
        instancePath.close();
        instancePath.moveTo(9.72784f, 7.74092f);
        instancePath.cubicTo(10.9874f, 5.64981f, 11.844f, 4.58333f, 12.4166f, 4.05306f);
        instancePath.cubicTo(12.6962f, 3.79421f, 12.8737f, 3.69585f, 12.9616f, 3.65886f);
        instancePath.cubicTo(12.9919f, 3.64609f, 13.0137f, 3.63955f, 13.0296f, 3.6363f);
        instancePath.lineTo(13.0348f, 3.64294f);
        instancePath.cubicTo(13.054f, 3.66817f, 13.0872f, 3.71909f, 13.1245f, 3.80962f);
        instancePath.lineTo(13.125f, 3.81084f);
        instancePath.cubicTo(13.2114f, 4.01957f, 13.2862f, 4.48568f, 13.2664f, 5.23478f);
        instancePath.cubicTo(13.2476f, 5.94542f, 13.1484f, 6.78697f, 12.9889f, 7.65686f);
        instancePath.cubicTo(12.6635f, 9.43133f, 12.1239f, 11.1318f, 11.649f, 11.9668f);
        instancePath.lineTo(11.648f, 11.9686f);
        instancePath.cubicTo(11.5378f, 12.1633f, 11.4412f, 12.2725f, 11.3728f, 12.3263f);
        instancePath.cubicTo(11.3229f, 12.3655f, 11.3005f, 12.3685f, 11.2695f, 12.3683f);
        instancePath.lineTo(11.2625f, 12.3683f);
        instancePath.cubicTo(11.2096f, 12.3683f, 11.0041f, 12.3269f, 10.6393f, 12.0021f);
        instancePath.cubicTo(10.2969f, 11.6973f, 9.94436f, 11.2577f, 9.61462f, 10.7673f);
        instancePath.cubicTo(9.29026f, 10.2849f, 9.01598f, 9.79569f, 8.82141f, 9.42305f);
        instancePath.cubicTo(8.80818f, 9.39773f, 8.79536f, 9.37299f, 8.78294f, 9.3489f);
        instancePath.lineTo(8.95256f, 9.05739f);
        instancePath.cubicTo(9.21946f, 8.59929f, 9.53219f, 8.06547f, 9.72784f, 7.74092f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
