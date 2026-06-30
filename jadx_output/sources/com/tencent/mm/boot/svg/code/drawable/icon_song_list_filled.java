package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_song_list_filled extends l95.c {
    private final int width = 25;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 25;
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.68859f, 3.72473f);
                instancePath.cubicTo(2.875f, 4.53832f, 2.875f, 5.84777f, 2.875f, 8.46669f);
                instancePath.lineTo(2.875f, 17.3556f);
                instancePath.cubicTo(2.875f, 19.9745f, 2.875f, 21.2839f, 3.68859f, 22.0975f);
                instancePath.cubicTo(4.50218f, 22.9111f, 5.81164f, 22.9111f, 8.43054f, 22.9111f);
                instancePath.lineTo(8.43056f, 22.9111f);
                instancePath.lineTo(17.3194f, 22.9111f);
                instancePath.lineTo(17.3195f, 22.9111f);
                instancePath.cubicTo(19.9384f, 22.9111f, 21.2478f, 22.9111f, 22.0614f, 22.0975f);
                instancePath.cubicTo(22.875f, 21.284f, 22.875f, 19.9745f, 22.875f, 17.3556f);
                instancePath.lineTo(22.875f, 17.3556f);
                instancePath.lineTo(22.875f, 8.46669f);
                instancePath.lineTo(22.875f, 8.46667f);
                instancePath.cubicTo(22.875f, 5.84777f, 22.875f, 4.53832f, 22.0614f, 3.72473f);
                instancePath.cubicTo(21.2478f, 2.91113f, 19.9384f, 2.91113f, 17.3194f, 2.91113f);
                instancePath.lineTo(8.43056f, 2.91113f);
                instancePath.cubicTo(5.81164f, 2.91113f, 4.50218f, 2.91113f, 3.68859f, 3.72473f);
                instancePath.close();
                instancePath.moveTo(19.9991f, 9.30155f);
                instancePath.cubicTo(19.3733f, 8.79151f, 18.7475f, 8.56196f, 18.1591f, 8.34613f);
                instancePath.cubicTo(17.5334f, 8.11662f, 16.95f, 7.90261f, 16.4537f, 7.38332f);
                instancePath.cubicTo(16.1776f, 7.08476f, 16.0283f, 6.73396f, 15.9835f, 6.36076f);
                instancePath.cubicTo(15.9014f, 5.90546f, 15.4237f, 5.8159f, 15.1177f, 6.0025f);
                instancePath.cubicTo(15.1065f, 6.00996f, 15.0972f, 6.01742f, 15.0879f, 6.02489f);
                instancePath.cubicTo(15.0785f, 6.03235f, 15.0692f, 6.03981f, 15.058f, 6.04728f);
                instancePath.cubicTo(15.0132f, 6.0846f, 14.9759f, 6.12938f, 14.946f, 6.17417f);
                instancePath.cubicTo(14.7893f, 6.39062f, 14.6848f, 6.71157f, 14.6848f, 7.1594f);
                instancePath.lineTo(14.6848f, 13.1156f);
                instancePath.cubicTo(14.6499f, 14.8877f, 14.3672f, 14.9577f, 12.9834f, 15.3007f);
                instancePath.lineTo(12.9833f, 15.3007f);
                instancePath.cubicTo(12.8867f, 15.3246f, 12.7847f, 15.3499f, 12.677f, 15.3772f);
                instancePath.cubicTo(11.3857f, 15.7056f, 10.3109f, 16.5714f, 10.3184f, 17.9f);
                instancePath.cubicTo(10.3259f, 19.2286f, 11.4977f, 20.3332f, 12.8561f, 20.2959f);
                instancePath.cubicTo(16.1963f, 20.207f, 16.1781f, 16.7597f, 16.1703f, 15.2917f);
                instancePath.lineTo(16.1701f, 15.2578f);
                instancePath.lineTo(16.1701f, 9.96584f);
                instancePath.cubicTo(16.1701f, 9.21968f, 16.6774f, 9.40593f, 17.6322f, 9.75652f);
                instancePath.lineTo(17.633f, 9.75685f);
                instancePath.lineTo(17.6256f, 9.75685f);
                instancePath.cubicTo(17.6729f, 9.77178f, 17.7201f, 9.78754f, 17.7674f, 9.80329f);
                instancePath.cubicTo(17.8619f, 9.83481f, 17.9565f, 9.86632f, 18.051f, 9.8912f);
                instancePath.cubicTo(18.7228f, 10.1599f, 19.4916f, 10.4809f, 19.7379f, 11.1377f);
                instancePath.cubicTo(20.0514f, 12.1304f, 19.3871f, 13.0335f, 18.4168f, 13.4888f);
                instancePath.cubicTo(18.2749f, 13.556f, 18.3272f, 13.7724f, 18.4839f, 13.7724f);
                instancePath.cubicTo(20.6634f, 13.765f, 22.0144f, 10.869f, 19.9917f, 9.30155f);
                instancePath.lineTo(19.9991f, 9.30155f);
                instancePath.close();
                instancePath.moveTo(8.67209f, 18.1207f);
                instancePath.cubicTo(8.66906f, 17.5821f, 8.76047f, 17.0989f, 8.92188f, 16.6678f);
                instancePath.lineTo(8.92188f, 16.5322f);
                instancePath.lineTo(6.1875f, 16.5322f);
                instancePath.lineTo(6.1875f, 18.1822f);
                instancePath.lineTo(8.67289f, 18.1822f);
                instancePath.cubicTo(8.67247f, 18.1618f, 8.6722f, 18.1412f, 8.67209f, 18.1207f);
                instancePath.close();
                instancePath.moveTo(11.75f, 7.64014f);
                instancePath.lineTo(6.1875f, 7.64014f);
                instancePath.lineTo(6.1875f, 9.29014f);
                instancePath.lineTo(11.75f, 9.29014f);
                instancePath.lineTo(11.75f, 7.64014f);
                instancePath.close();
                instancePath.moveTo(6.1875f, 12.0859f);
                instancePath.lineTo(11.75f, 12.0859f);
                instancePath.lineTo(11.75f, 13.7359f);
                instancePath.lineTo(6.1875f, 13.7359f);
                instancePath.lineTo(6.1875f, 12.0859f);
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
