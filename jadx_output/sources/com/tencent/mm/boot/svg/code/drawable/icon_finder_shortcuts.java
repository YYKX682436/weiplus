package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_finder_shortcuts extends l95.c {
    private final int width = 58;
    private final int height = 58;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 58;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(58.0f, 0.0f);
        instancePath.lineTo(58.0f, 58.0f);
        instancePath.lineTo(0.0f, 58.0f);
        instancePath.lineTo(0.0f, 0.0f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 29.0f, 57.8f, 29.0f, -31.2f, new int[]{-352965, -344517}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(45.0806f, 17.2358f);
        instancePath2.cubicTo(46.2721f, 20.1168f, 45.3767f, 25.7521f, 44.7367f, 28.855f);
        instancePath2.cubicTo(43.7705f, 33.5406f, 42.2145f, 38.2074f, 40.7726f, 40.7442f);
        instancePath2.cubicTo(39.8136f, 42.4313f, 38.8549f, 43.2919f, 37.7565f, 43.4522f);
        instancePath2.cubicTo(37.5799f, 43.478f, 37.4f, 43.491f, 37.2222f, 43.491f);
        instancePath2.cubicTo(33.9745f, 43.491f, 30.8832f, 39.2512f, 28.9984f, 36.0204f);
        instancePath2.cubicTo(27.1135f, 39.2515f, 24.0219f, 43.491f, 20.7752f, 43.491f);
        instancePath2.cubicTo(20.5973f, 43.491f, 20.4178f, 43.478f, 20.2416f, 43.4522f);
        instancePath2.cubicTo(19.1425f, 43.2919f, 18.1838f, 42.4313f, 17.2248f, 40.7442f);
        instancePath2.cubicTo(15.7828f, 38.2071f, 14.2269f, 33.5406f, 13.2607f, 28.855f);
        instancePath2.cubicTo(12.6207f, 25.7521f, 11.7253f, 20.1168f, 12.9168f, 17.2358f);
        instancePath2.cubicTo(13.7807f, 15.1472f, 15.2247f, 14.7365f, 16.0091f, 14.6772f);
        instancePath2.cubicTo(18.9218f, 14.4609f, 22.3861f, 18.0421f, 27.573f, 26.6531f);
        instancePath2.cubicTo(28.0977f, 27.524f, 28.5816f, 28.3329f, 28.9987f, 29.0326f);
        instancePath2.cubicTo(29.4181f, 28.3296f, 29.9027f, 27.5194f, 30.4244f, 26.6531f);
        instancePath2.cubicTo(35.3798f, 18.427f, 38.7496f, 14.7881f, 41.5943f, 14.6708f);
        instancePath2.cubicTo(43.2224f, 14.6503f, 44.4817f, 15.7873f, 45.0806f, 17.2358f);
        instancePath2.close();
        instancePath2.moveTo(16.0214f, 18.7366f);
        instancePath2.cubicTo(15.4144f, 20.6037f, 15.883f, 25.4146f, 17.195f, 30.6292f);
        instancePath2.cubicTo(18.469f, 35.6935f, 19.8484f, 38.5512f, 20.5682f, 39.6364f);
        instancePath2.cubicTo(20.7487f, 39.9091f, 21.1028f, 40.0028f, 21.3914f, 39.8491f);
        instancePath2.cubicTo(22.0261f, 39.5102f, 23.1305f, 38.6218f, 24.7268f, 36.3003f);
        instancePath2.cubicTo(25.7269f, 34.8455f, 26.555f, 33.3525f, 27.0317f, 32.4448f);
        instancePath2.cubicTo(26.5209f, 31.5822f, 25.6464f, 30.1105f, 24.6311f, 28.425f);
        instancePath2.cubicTo(20.121f, 20.9376f, 17.7359f, 18.8805f, 16.776f, 18.3157f);
        instancePath2.cubicTo(16.3855f, 18.0858f, 16.1528f, 18.4283f, 16.0214f, 18.7366f);
        instancePath2.close();
        instancePath2.moveTo(41.9045f, 18.5406f);
        instancePath2.cubicTo(41.7899f, 18.2654f, 41.4864f, 18.1597f, 41.2294f, 18.3104f);
        instancePath2.cubicTo(40.2777f, 18.8679f, 37.8906f, 20.9144f, 33.3663f, 28.425f);
        instancePath2.cubicTo(32.3477f, 30.1161f, 31.4705f, 31.5919f, 30.9607f, 32.4531f);
        instancePath2.cubicTo(32.89f, 36.2126f, 35.1094f, 38.9501f, 36.4593f, 39.7895f);
        instancePath2.cubicTo(36.8041f, 40.0038f, 37.2576f, 39.9094f, 37.4769f, 39.5679f);
        instancePath2.cubicTo(38.2034f, 38.438f, 39.5539f, 35.5934f, 40.8024f, 30.6292f);
        instancePath2.cubicTo(42.1612f, 25.2284f, 42.6154f, 20.2605f, 41.9075f, 18.5483f);
        instancePath2.lineTo(41.9045f, 18.5406f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
