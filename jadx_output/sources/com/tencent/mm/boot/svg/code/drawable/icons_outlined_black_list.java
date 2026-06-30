package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_black_list extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.saveLayerAlpha(null, 230, 31);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(22.96748f, 16.5f);
                instancePath.cubicTo(26.64938f, 16.5f, 29.63408f, 19.4848f, 29.63408f, 23.1667f);
                instancePath.cubicTo(29.63408f, 26.8486f, 26.64938f, 29.8333f, 22.96748f, 29.8333f);
                instancePath.cubicTo(19.28558f, 29.8333f, 16.30078f, 26.8486f, 16.30078f, 23.1667f);
                instancePath.cubicTo(16.30078f, 19.4848f, 19.28558f, 16.5f, 22.96748f, 16.5f);
                instancePath.close();
                instancePath.moveTo(19.08298f, 19.9131f);
                instancePath.cubicTo(18.34488f, 20.7933f, 17.90038f, 21.9281f, 17.90038f, 23.1668f);
                instancePath.cubicTo(17.90038f, 25.965f, 20.16878f, 28.2334f, 22.96708f, 28.2334f);
                instancePath.cubicTo(24.20568f, 28.2334f, 25.34048f, 27.789f, 26.22068f, 27.0508f);
                instancePath.lineTo(19.08298f, 19.9131f);
                instancePath.close();
                instancePath.moveTo(15.66668f, 3.0f);
                instancePath.cubicTo(18.61218f, 3.0f, 20.99998f, 5.39064f, 20.99998f, 8.33361f);
                instancePath.lineTo(20.99998f, 8.33361f);
                instancePath.lineTo(20.99998f, 10.6136f);
                instancePath.cubicTo(20.99998f, 12.1324f, 20.20128f, 14.3105f, 19.22408f, 15.4688f);
                instancePath.lineTo(19.22408f, 15.4688f);
                instancePath.lineTo(18.74208f, 16.0402f);
                instancePath.cubicTo(18.65288f, 16.146f, 18.57688f, 16.255f, 18.51398f, 16.366f);
                instancePath.cubicTo(18.08698f, 16.6484f, 17.68778f, 16.9692f, 17.32118f, 17.3237f);
                instancePath.lineTo(17.32118f, 17.3237f);
                instancePath.lineTo(16.68428f, 17.3238f);
                instancePath.cubicTo(16.65658f, 16.6055f, 16.87638f, 15.8617f, 17.36838f, 15.1988f);
                instancePath.lineTo(17.36838f, 15.1988f);
                instancePath.lineTo(17.52848f, 14.997f);
                instancePath.lineTo(18.00118f, 14.4371f);
                instancePath.cubicTo(18.66758f, 13.6471f, 19.28448f, 12.066f, 19.38548f, 10.9255f);
                instancePath.lineTo(19.38548f, 10.9255f);
                instancePath.lineTo(19.39948f, 10.6361f);
                instancePath.lineTo(19.39998f, 8.33361f);
                instancePath.cubicTo(19.39998f, 6.27304f, 17.72728f, 4.6f, 15.66668f, 4.6f);
                instancePath.cubicTo(13.71158f, 4.6f, 12.08718f, 6.11507f, 11.94358f, 8.05488f);
                instancePath.lineTo(11.94358f, 8.05488f);
                instancePath.lineTo(11.93368f, 8.31508f);
                instancePath.lineTo(11.93338f, 10.6124f);
                instancePath.cubicTo(11.93338f, 11.6476f, 12.48058f, 13.2478f, 13.14148f, 14.1868f);
                instancePath.lineTo(13.14148f, 14.1868f);
                instancePath.lineTo(13.31818f, 14.4177f);
                instancePath.lineTo(13.81418f, 15.0064f);
                instancePath.cubicTo(15.21588f, 16.6678f, 14.81008f, 18.9607f, 12.94908f, 20.0169f);
                instancePath.lineTo(12.94908f, 20.0169f);
                instancePath.lineTo(12.72108f, 20.1368f);
                instancePath.lineTo(5.18715f, 23.813f);
                instancePath.cubicTo(4.96384f, 23.922f, 4.73377f, 24.2581f, 4.64258f, 24.5214f);
                instancePath.lineTo(4.64258f, 24.5214f);
                instancePath.lineTo(4.61064f, 24.6534f);
                instancePath.lineTo(4.6f, 24.92f);
                instancePath.lineTo(4.6f, 25.4f);
                instancePath.lineTo(15.07838f, 25.3987f);
                instancePath.cubicTo(15.22248f, 25.9401f, 15.42008f, 26.4596f, 15.66538f, 26.9513f);
                instancePath.lineTo(15.66538f, 26.9513f);
                instancePath.lineTo(15.66538f, 27.0f);
                instancePath.lineTo(4.33524f, 27.0f);
                instancePath.cubicTo(3.59781f, 27.0f, 3.0f, 26.4077f, 3.0f, 25.6688f);
                instancePath.lineTo(3.0f, 25.6688f);
                instancePath.lineTo(3.0f, 24.754f);
                instancePath.cubicTo(3.0f, 23.8405f, 3.6642f, 22.7759f, 4.48546f, 22.3751f);
                instancePath.lineTo(4.48546f, 22.3751f);
                instancePath.lineTo(12.03258f, 18.6922f);
                instancePath.cubicTo(13.12718f, 18.1581f, 13.38168f, 16.975f, 12.59128f, 16.0382f);
                instancePath.lineTo(12.59128f, 16.0382f);
                instancePath.lineTo(12.10918f, 15.4669f);
                instancePath.cubicTo(11.12838f, 14.3044f, 10.33338f, 12.1327f, 10.33338f, 10.6124f);
                instancePath.lineTo(10.33338f, 10.6124f);
                instancePath.lineTo(10.33338f, 8.33277f);
                instancePath.cubicTo(10.33338f, 5.38756f, 12.72718f, 3.0f, 15.66668f, 3.0f);
                instancePath.close();
                instancePath.moveTo(22.96708f, 18.1001f);
                instancePath.cubicTo(21.98608f, 18.1001f, 21.07008f, 18.3789f, 20.29428f, 18.8616f);
                instancePath.lineTo(27.27218f, 25.8396f);
                instancePath.cubicTo(27.75488f, 25.0637f, 28.03368f, 24.1478f, 28.03368f, 23.1668f);
                instancePath.cubicTo(28.03368f, 20.3685f, 25.76528f, 18.1001f, 22.96708f, 18.1001f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
