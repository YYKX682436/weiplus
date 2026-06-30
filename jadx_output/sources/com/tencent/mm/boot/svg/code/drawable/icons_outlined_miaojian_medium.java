package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_miaojian_medium extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.77269f, 13.0523f);
                instancePath.cubicTo(5.76065f, 13.1915f, 5.79183f, 13.3425f, 5.93606f, 13.5052f);
                instancePath.cubicTo(6.08611f, 13.6745f, 6.22134f, 13.7213f, 6.34626f, 13.7254f);
                instancePath.cubicTo(6.49256f, 13.7301f, 6.74541f, 13.6769f, 7.0929f, 13.425f);
                instancePath.cubicTo(8.07649f, 12.712f, 9.37657f, 11.5895f, 10.2443f, 10.6272f);
                instancePath.cubicTo(10.6078f, 10.224f, 10.8108f, 9.69467f, 10.8383f, 9.04765f);
                instancePath.cubicTo(10.8867f, 7.91284f, 10.3282f, 7.2824f, 9.89585f, 6.80893f);
                instancePath.cubicTo(9.48419f, 6.35808f, 9.28076f, 5.76776f, 9.26354f, 5.21128f);
                instancePath.cubicTo(9.24636f, 4.65632f, 9.41426f, 4.01133f, 9.90986f, 3.53728f);
                instancePath.cubicTo(10.1505f, 3.30711f, 10.2282f, 3.09668f, 10.2409f, 2.95338f);
                instancePath.cubicTo(10.2528f, 2.81991f, 10.2171f, 2.66495f, 10.0686f, 2.49637f);
                instancePath.cubicTo(9.92518f, 2.33351f, 9.77896f, 2.27966f, 9.64329f, 2.27461f);
                instancePath.cubicTo(9.49549f, 2.26911f, 9.28261f, 2.32109f, 9.04333f, 2.50982f);
                instancePath.cubicTo(8.87234f, 2.64469f, 8.69519f, 2.78177f, 8.51458f, 2.92153f);
                instancePath.cubicTo(7.89219f, 3.40315f, 7.2287f, 3.91657f, 6.63416f, 4.48108f);
                instancePath.cubicTo(5.84756f, 5.22794f, 5.37494f, 5.89262f, 5.26278f, 6.4469f);
                instancePath.cubicTo(5.05712f, 7.46331f, 5.38184f, 8.4109f, 5.99007f, 9.03941f);
                instancePath.cubicTo(6.22699f, 9.28422f, 6.62476f, 9.75402f, 6.73682f, 10.4241f);
                instancePath.cubicTo(6.85986f, 11.1598f, 6.60578f, 11.9048f, 5.98022f, 12.592f);
                instancePath.cubicTo(5.86552f, 12.718f, 5.78674f, 12.8899f, 5.77269f, 13.0523f);
                instancePath.close();
                instancePath.moveTo(5.23508f, 11.9137f);
                instancePath.cubicTo(4.7346f, 12.4635f, 4.50989f, 13.4153f, 5.18204f, 14.1736f);
                instancePath.cubicTo(5.81326f, 14.8857f, 6.73443f, 14.9293f, 7.68428f, 14.2408f);
                instancePath.cubicTo(8.71338f, 13.4948f, 10.069f, 12.3263f, 10.9926f, 11.3019f);
                instancePath.cubicTo(11.5383f, 10.6968f, 11.8092f, 9.93145f, 11.845f, 9.09051f);
                instancePath.cubicTo(11.9116f, 7.52813f, 11.1007f, 6.63414f, 10.6399f, 6.12951f);
                instancePath.cubicTo(10.1792f, 5.62488f, 10.1272f, 4.72375f, 10.6063f, 4.26543f);
                instancePath.cubicTo(11.3788f, 3.52651f, 11.463f, 2.55497f, 10.8247f, 1.83036f);
                instancePath.cubicTo(10.1865f, 1.10576f, 9.21416f, 1.09176f, 8.41933f, 1.71868f);
                instancePath.cubicTo(8.26301f, 1.84197f, 8.096f, 1.97116f, 7.922f, 2.10574f);
                instancePath.cubicTo(6.49269f, 3.21132f, 4.59195f, 4.68154f, 4.27518f, 6.24707f);
                instancePath.cubicTo(4.00241f, 7.59514f, 4.43157f, 8.87789f, 5.266f, 9.74012f);
                instancePath.cubicTo(5.64678f, 10.1336f, 6.16756f, 10.8893f, 5.23508f, 11.9137f);
                instancePath.close();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
                instancePaint4.setFlags(385);
                instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
                instancePaint5.setFlags(385);
                instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
                instancePaint4.setColor(-16777216);
                instancePaint5.setStrokeWidth(1.0f);
                instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
                instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
                instancePaint5.setStrokeMiter(4.0f);
                instancePaint5.setPathEffect(null);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 8.02113f, 1.2666f, 8.02113f, 14.7333f, new int[]{-15743638, -12591971}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
