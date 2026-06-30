package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ai_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.11898f, 2.48568f);
        instancePath.cubicTo(8.34172f, 2.1098f, 8.82027f, 1.97451f, 9.20687f, 2.17806f);
        instancePath.cubicTo(9.3868f, 2.27339f, 9.63118f, 2.71126f, 10.0379f, 3.54329f);
        instancePath.lineTo(10.5028f, 4.51009f);
        instancePath.cubicTo(11.1966f, 5.9594f, 11.5873f, 6.77543f, 12.0477f, 7.3763f);
        instancePath.lineTo(12.2498f, 7.62142f);
        instancePath.cubicTo(13.1318f, 8.61201f, 14.3217f, 9.27872f, 15.6268f, 9.51497f);
        instancePath.cubicTo(16.2456f, 9.62683f, 16.9199f, 9.60224f, 17.9969f, 9.50325f);
        instancePath.lineTo(19.2225f, 9.38216f);
        instancePath.cubicTo(20.9905f, 9.20169f, 21.8757f, 9.11095f, 22.1161f, 9.264f);
        instancePath.cubicTo(22.4713f, 9.49089f, 22.5968f, 9.95149f, 22.4061f, 10.3275f);
        instancePath.cubicTo(22.2763f, 10.5815f, 21.4802f, 10.9485f, 19.8914f, 11.681f);
        instancePath.lineTo(19.66f, 11.7884f);
        instancePath.cubicTo(18.1151f, 12.5007f, 17.3419f, 12.8569f, 16.743f, 13.3538f);
        instancePath.cubicTo(15.6671f, 14.247f, 14.9412f, 15.4923f, 14.6932f, 16.8685f);
        instancePath.cubicTo(14.5553f, 17.6344f, 14.6253f, 18.4933f, 14.7674f, 20.2103f);
        instancePath.cubicTo(14.8852f, 21.6331f, 14.9447f, 22.3463f, 14.8309f, 22.5599f);
        instancePath.cubicTo(14.6075f, 22.9776f, 14.0771f, 23.1192f, 13.6746f, 22.8695f);
        instancePath.cubicTo(13.4693f, 22.7418f, 13.1688f, 22.1065f, 12.5692f, 20.8363f);
        instancePath.cubicTo(11.854f, 19.3213f, 11.4957f, 18.5634f, 11.0057f, 17.9779f);
        instancePath.lineTo(10.825f, 17.7718f);
        instancePath.cubicTo(9.90242f, 16.7677f, 8.65959f, 16.1094f, 7.30453f, 15.9134f);
        instancePath.cubicTo(6.54877f, 15.8042f, 5.70216f, 15.9003f, 4.01058f, 16.0911f);
        instancePath.lineTo(2.99008f, 16.2034f);
        instancePath.cubicTo(2.10956f, 16.296f, 1.63155f, 16.3218f, 1.46175f, 16.2318f);
        instancePath.lineTo(1.38754f, 16.1878f);
        instancePath.cubicTo(1.06272f, 15.9678f, 0.939119f, 15.5452f, 1.09457f, 15.1849f);
        instancePath.lineTo(1.13168f, 15.1087f);
        instancePath.cubicTo(1.22529f, 14.9413f, 1.63533f, 14.7094f, 2.41293f, 14.3197f);
        instancePath.lineTo(3.31527f, 13.8743f);
        instancePath.lineTo(3.45101f, 13.807f);
        instancePath.cubicTo(4.87539f, 13.107f, 5.67749f, 12.7128f, 6.2684f, 12.2523f);
        instancePath.lineTo(6.50961f, 12.0501f);
        instancePath.cubicTo(7.49078f, 11.1634f, 8.14847f, 9.97387f, 8.37679f, 8.67122f);
        instancePath.cubicTo(8.48422f, 8.05773f, 8.45714f, 7.39596f, 8.35726f, 6.3431f);
        instancePath.lineTo(8.23617f, 5.14681f);
        instancePath.cubicTo(8.07675f, 3.62952f, 7.99151f, 2.8234f, 8.09554f, 2.53646f);
        instancePath.lineTo(8.11898f, 2.48568f);
        instancePath.close();
        instancePath.moveTo(9.43246f, 5.05013f);
        instancePath.cubicTo(9.61259f, 6.76344f, 9.73664f, 7.86061f, 9.55843f, 8.87825f);
        instancePath.cubicTo(9.28398f, 10.4442f, 8.4947f, 11.8747f, 7.31527f, 12.9408f);
        instancePath.cubicTo(6.54433f, 13.6375f, 5.54183f, 14.1177f, 3.98031f, 14.8851f);
        instancePath.lineTo(3.97543f, 14.887f);
        instancePath.cubicTo(5.54029f, 14.7102f, 6.54908f, 14.5921f, 7.47543f, 14.7259f);
        instancePath.cubicTo(9.21344f, 14.9773f, 10.7983f, 15.8609f, 11.9256f, 17.2074f);
        instancePath.cubicTo(12.5091f, 17.9045f, 12.9264f, 18.781f, 13.5565f, 20.1165f);
        instancePath.cubicTo(13.4289f, 18.5795f, 13.3457f, 17.5753f, 13.5116f, 16.6546f);
        instancePath.cubicTo(13.8098f, 15.0004f, 14.6831f, 13.5047f, 15.9764f, 12.431f);
        instancePath.cubicTo(16.7257f, 11.809f, 17.6748f, 11.381f, 19.1571f, 10.6976f);
        instancePath.lineTo(19.3895f, 10.5911f);
        instancePath.cubicTo(19.4075f, 10.5828f, 19.4254f, 10.5739f, 19.4432f, 10.5658f);
        instancePath.cubicTo(19.4106f, 10.5691f, 19.3769f, 10.5721f, 19.3436f, 10.5755f);
        instancePath.cubicTo(17.5731f, 10.7563f, 16.4447f, 10.8835f, 15.412f, 10.6966f);
        instancePath.cubicTo(13.8429f, 10.4125f, 12.4136f, 9.61031f, 11.3534f, 8.41927f);
        instancePath.cubicTo(10.6591f, 7.63926f, 10.1865f, 6.62537f, 9.43246f, 5.05013f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.5047f, 2.56673f);
        instancePath2.cubicTo(17.6093f, 2.56687f, 18.5047f, 3.46211f, 18.5047f, 4.56673f);
        instancePath2.cubicTo(18.5045f, 5.67118f, 17.6092f, 6.56659f, 16.5047f, 6.56673f);
        instancePath2.cubicTo(15.4001f, 6.56673f, 14.5049f, 5.67126f, 14.5047f, 4.56673f);
        instancePath2.cubicTo(14.5047f, 3.46202f, 15.4f, 2.56673f, 16.5047f, 2.56673f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
