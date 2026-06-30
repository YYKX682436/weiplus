package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_black_list_on_light extends l95.c {
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
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(17.99998f, 5.33361f);
                instancePath.cubicTo(17.99998f, 2.39064f, 15.61218f, 0.0f, 12.66668f, 0.0f);
                instancePath.cubicTo(9.72718f, 0.0f, 7.33338f, 2.38756f, 7.33338f, 5.33277f);
                instancePath.lineTo(7.33338f, 7.6124f);
                instancePath.cubicTo(7.33338f, 9.1327f, 8.12838f, 11.3044f, 9.10918f, 12.4669f);
                instancePath.lineTo(9.59128f, 13.0382f);
                instancePath.cubicTo(10.38168f, 13.975f, 10.12718f, 15.1581f, 9.03258f, 15.6922f);
                instancePath.lineTo(1.48546f, 19.3751f);
                instancePath.cubicTo(0.6642f, 19.7759f, 0.0f, 20.8405f, 0.0f, 21.754f);
                instancePath.lineTo(0.0f, 22.6688f);
                instancePath.cubicTo(0.0f, 23.4077f, 0.59781f, 24.0f, 1.33524f, 24.0f);
                instancePath.lineTo(12.66538f, 24.0f);
                instancePath.lineTo(12.66538f, 23.9513f);
                instancePath.cubicTo(12.42008f, 23.4596f, 12.22248f, 22.9401f, 12.07838f, 22.3987f);
                instancePath.lineTo(1.6f, 22.4f);
                instancePath.lineTo(1.6f, 21.92f);
                instancePath.lineTo(1.61064f, 21.6534f);
                instancePath.lineTo(1.64258f, 21.5214f);
                instancePath.cubicTo(1.73377f, 21.2581f, 1.96384f, 20.922f, 2.18715f, 20.813f);
                instancePath.lineTo(9.72108f, 17.1368f);
                instancePath.lineTo(9.94908f, 17.0169f);
                instancePath.cubicTo(11.81008f, 15.9607f, 12.21588f, 13.6678f, 10.81418f, 12.0064f);
                instancePath.lineTo(10.31818f, 11.4177f);
                instancePath.lineTo(10.14148f, 11.1868f);
                instancePath.cubicTo(9.48058f, 10.2478f, 8.93338f, 8.6476f, 8.93338f, 7.6124f);
                instancePath.lineTo(8.93368f, 5.31508f);
                instancePath.lineTo(8.94358f, 5.05488f);
                instancePath.cubicTo(9.08718f, 3.11507f, 10.71158f, 1.6f, 12.66668f, 1.6f);
                instancePath.cubicTo(14.72728f, 1.6f, 16.39998f, 3.27304f, 16.39998f, 5.33361f);
                instancePath.lineTo(16.39948f, 7.6361f);
                instancePath.lineTo(16.38548f, 7.9255f);
                instancePath.cubicTo(16.28448f, 9.066f, 15.66758f, 10.6471f, 15.00118f, 11.4371f);
                instancePath.lineTo(14.52848f, 11.997f);
                instancePath.lineTo(14.36838f, 12.1988f);
                instancePath.cubicTo(13.87638f, 12.8617f, 13.65658f, 13.6055f, 13.68428f, 14.3238f);
                instancePath.lineTo(14.32118f, 14.3237f);
                instancePath.cubicTo(14.68778f, 13.9692f, 15.08698f, 13.6484f, 15.51398f, 13.366f);
                instancePath.cubicTo(15.57688f, 13.255f, 15.65288f, 13.146f, 15.74208f, 13.0402f);
                instancePath.lineTo(16.22408f, 12.4688f);
                instancePath.cubicTo(17.20128f, 11.3105f, 17.99998f, 9.1324f, 17.99998f, 7.6136f);
                instancePath.lineTo(17.99998f, 5.33361f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-372399);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(19.96748f, 13.5f);
                instancePath2.cubicTo(23.64938f, 13.5f, 26.63408f, 16.4848f, 26.63408f, 20.1667f);
                instancePath2.cubicTo(26.63408f, 23.8486f, 23.64938f, 26.8333f, 19.96748f, 26.8333f);
                instancePath2.cubicTo(16.28558f, 26.8333f, 13.30078f, 23.8486f, 13.30078f, 20.1667f);
                instancePath2.cubicTo(13.30078f, 16.4848f, 16.28558f, 13.5f, 19.96748f, 13.5f);
                instancePath2.close();
                instancePath2.moveTo(16.08298f, 16.9131f);
                instancePath2.cubicTo(15.34488f, 17.7933f, 14.90038f, 18.9281f, 14.90038f, 20.1668f);
                instancePath2.cubicTo(14.90038f, 22.965f, 17.16878f, 25.2334f, 19.96708f, 25.2334f);
                instancePath2.cubicTo(21.20568f, 25.2334f, 22.34048f, 24.789f, 23.22068f, 24.0508f);
                instancePath2.lineTo(16.08298f, 16.9131f);
                instancePath2.close();
                instancePath2.moveTo(17.29428f, 15.8616f);
                instancePath2.lineTo(24.27218f, 22.8396f);
                instancePath2.cubicTo(24.75488f, 22.0637f, 25.03368f, 21.1478f, 25.03368f, 20.1668f);
                instancePath2.cubicTo(25.03368f, 17.3685f, 22.76528f, 15.1001f, 19.96708f, 15.1001f);
                instancePath2.cubicTo(18.98608f, 15.1001f, 18.07008f, 15.3789f, 17.29428f, 15.8616f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
