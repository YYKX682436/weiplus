package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_listening extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.999772f, 0.0f, 1.0f, 0.9997f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 6.504309f, 0.0f, 1.0f, 2.531457f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.2766f, 6.411f);
        instancePath.cubicTo(11.5206f, 4.256f, 13.9476f, 3.21f, 16.2636f, 3.618f);
        instancePath.cubicTo(16.9076f, 3.732f, 17.5426f, 3.958f, 18.1416f, 4.303f);
        instancePath.cubicTo(20.8966f, 5.894f, 21.8396f, 9.415f, 20.2496f, 12.169f);
        instancePath.lineTo(20.2496f, 12.169f);
        instancePath.lineTo(15.0616f, 21.155f);
        instancePath.cubicTo(14.5636f, 22.018f, 13.5916f, 22.437f, 12.6646f, 22.273f);
        instancePath.cubicTo(12.4066f, 22.228f, 12.1516f, 22.137f, 11.9116f, 21.999f);
        instancePath.cubicTo(10.8086f, 21.362f, 10.4306f, 19.952f, 11.0676f, 18.849f);
        instancePath.lineTo(11.0676f, 18.849f);
        instancePath.lineTo(13.4336f, 14.75f);
        instancePath.cubicTo(13.0756f, 14.63f, 12.7236f, 14.473f, 12.3836f, 14.277f);
        instancePath.cubicTo(9.6296f, 12.687f, 8.6866f, 9.165f, 10.2766f, 6.411f);
        instancePath.close();
        instancePath.moveTo(16.0556f, 4.8f);
        instancePath.cubicTo(14.1756f, 4.468f, 12.2706f, 5.357f, 11.3156f, 7.011f);
        instancePath.cubicTo(10.7066f, 8.065f, 10.5446f, 9.294f, 10.8606f, 10.47f);
        instancePath.cubicTo(11.1756f, 11.646f, 11.9296f, 12.629f, 12.9836f, 13.238f);
        instancePath.cubicTo(13.2466f, 13.389f, 13.5266f, 13.516f, 13.8166f, 13.613f);
        instancePath.lineTo(13.8166f, 13.613f);
        instancePath.lineTo(15.2066f, 14.08f);
        instancePath.lineTo(14.4726f, 15.35f);
        instancePath.lineTo(12.1066f, 19.449f);
        instancePath.cubicTo(11.9596f, 19.704f, 11.9196f, 20.003f, 11.9966f, 20.288f);
        instancePath.cubicTo(12.0726f, 20.573f, 12.2556f, 20.812f, 12.5116f, 20.959f);
        instancePath.cubicTo(12.6246f, 21.025f, 12.7466f, 21.069f, 12.8726f, 21.091f);
        instancePath.cubicTo(13.3286f, 21.172f, 13.7906f, 20.956f, 14.0226f, 20.555f);
        instancePath.lineTo(14.0226f, 20.555f);
        instancePath.lineTo(19.2106f, 11.569f);
        instancePath.cubicTo(20.4676f, 9.393f, 19.7186f, 6.599f, 17.5416f, 5.343f);
        instancePath.cubicTo(17.0776f, 5.075f, 16.5776f, 4.892f, 16.0556f, 4.8f);
        instancePath.close();
        instancePath.moveTo(13.9441f, 7.0871f);
        instancePath.cubicTo(14.2371f, 7.2551f, 14.3371f, 7.6301f, 14.1681f, 7.9231f);
        instancePath.lineTo(13.2821f, 9.4581f);
        instancePath.cubicTo(13.1491f, 9.6871f, 12.8911f, 9.7981f, 12.6451f, 9.7551f);
        instancePath.cubicTo(12.5761f, 9.7431f, 12.5091f, 9.7191f, 12.4451f, 9.6821f);
        instancePath.cubicTo(12.1521f, 9.5131f, 12.0521f, 9.1391f, 12.2211f, 8.8451f);
        instancePath.lineTo(13.1071f, 7.3111f);
        instancePath.cubicTo(13.2761f, 7.0171f, 13.6501f, 6.9161f, 13.9441f, 7.0871f);
        instancePath.close();
        instancePath.moveTo(6.221f, 0.9997f);
        instancePath.lineTo(7.109f, 1.8127f);
        instancePath.cubicTo(5.73f, 3.3127f, 4.742f, 5.2017f, 4.363f, 7.3527f);
        instancePath.cubicTo(4.22f, 8.1627f, 4.177f, 8.9657f, 4.212f, 9.7557f);
        instancePath.lineTo(4.212f, 9.7557f);
        instancePath.lineTo(3.012f, 9.8077f);
        instancePath.cubicTo(2.974f, 8.9327f, 3.023f, 8.0427f, 3.181f, 7.1447f);
        instancePath.cubicTo(3.602f, 4.7577f, 4.695f, 2.6627f, 6.221f, 0.9997f);
        instancePath.lineTo(6.221f, 0.9997f);
        instancePath.close();
        instancePath.moveTo(8.4396f, 3.0326f);
        instancePath.lineTo(9.3266f, 3.8446f);
        instancePath.cubicTo(8.3236f, 4.9366f, 7.6046f, 6.3106f, 7.3286f, 7.8756f);
        instancePath.cubicTo(7.2246f, 8.4646f, 7.1936f, 9.0496f, 7.2186f, 9.6246f);
        instancePath.lineTo(7.2186f, 9.6246f);
        instancePath.lineTo(6.0196f, 9.6766f);
        instancePath.cubicTo(5.9906f, 9.0166f, 6.0276f, 8.3446f, 6.1466f, 7.6676f);
        instancePath.cubicTo(6.4646f, 5.8666f, 7.2886f, 4.2866f, 8.4396f, 3.0326f);
        instancePath.lineTo(8.4396f, 3.0326f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
