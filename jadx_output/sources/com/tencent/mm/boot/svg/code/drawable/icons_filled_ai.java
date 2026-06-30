package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_ai extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.6864f, 1.5410199f);
        instancePath3.cubicTo(18.136147f, 1.5410199f, 19.3114f, 2.7162724f, 19.3114f, 4.16602f);
        instancePath3.cubicTo(19.3114f, 5.6157675f, 18.136147f, 6.79102f, 16.6864f, 6.79102f);
        instancePath3.cubicTo(15.236652f, 6.79102f, 14.061399f, 5.6157675f, 14.061399f, 4.16602f);
        instancePath3.cubicTo(14.061399f, 2.7162724f, 15.236652f, 1.5410199f, 16.6864f, 1.5410199f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(19.6071f, 9.03782f);
        instancePath4.cubicTo(21.3756f, 8.85729f, 22.2598f, 8.76703f, 22.5002f, 8.9201f);
        instancePath4.cubicTo(22.8563f, 9.14687f, 22.9821f, 9.60693f, 22.7909f, 9.98333f);
        instancePath4.cubicTo(22.6618f, 10.2374f, 21.8668f, 10.6039f, 20.2768f, 11.3371f);
        instancePath4.lineTo(20.045f, 11.444f);
        instancePath4.cubicTo(18.4994f, 12.1566f, 17.7266f, 12.5129f, 17.1276f, 13.0102f);
        instancePath4.cubicTo(16.0517f, 13.9034f, 15.3258f, 15.1478f, 15.0778f, 16.524f);
        instancePath4.cubicTo(14.9397f, 17.2902f, 15.0108f, 18.1491f, 15.1529f, 19.8671f);
        instancePath4.lineTo(15.1529f, 19.8671f);
        instancePath4.cubicTo(15.2707f, 21.2907f, 15.3296f, 22.0025f, 15.2156f, 22.2158f);
        instancePath4.cubicTo(14.9921f, 22.6338f, 14.4618f, 22.776f, 14.0592f, 22.5256f);
        instancePath4.cubicTo(13.8538f, 22.3979f, 13.554f, 21.7627f, 12.9543f, 20.4923f);
        instancePath4.lineTo(12.9543f, 20.4923f);
        instancePath4.cubicTo(12.2389f, 18.9769f, 11.8813f, 18.2192f, 11.3911f, 17.6336f);
        instancePath4.cubicTo(10.4533f, 16.5134f, 9.13526f, 15.7784f, 7.68936f, 15.5694f);
        instancePath4.cubicTo(6.93354f, 15.4601f, 6.08764f, 15.5555f, 4.39584f, 15.7465f);
        instancePath4.lineTo(4.39584f, 15.7465f);
        instancePath4.cubicTo(2.84624f, 15.9213f, 2.07144f, 16.0088f, 1.84607f, 15.8879f);
        instancePath4.cubicTo(1.44191f, 15.6713f, 1.29391f, 15.1653f, 1.51761f, 14.765f);
        instancePath4.cubicTo(1.64235f, 14.5418f, 2.32861f, 14.2045f, 3.70112f, 13.5301f);
        instancePath4.lineTo(3.83655f, 13.4635f);
        instancePath4.cubicTo(5.46481f, 12.6634f, 6.27893f, 12.2633f, 6.89523f, 11.7063f);
        instancePath4.cubicTo(7.87657f, 10.8194f, 8.53352f, 9.63016f, 8.76177f, 8.32729f);
        instancePath4.cubicTo(8.90512f, 7.50907f, 8.81033f, 6.60692f, 8.62076f, 4.80261f);
        instancePath4.lineTo(8.62076f, 4.80261f);
        instancePath4.cubicTo(8.45076f, 3.18471f, 8.36577f, 2.37577f, 8.50391f, 2.14226f);
        instancePath4.cubicTo(8.72663f, 1.76582f, 9.20555f, 1.63039f, 9.59243f, 1.83444f);
        instancePath4.cubicTo(9.8324f, 1.96101f, 10.1842f, 2.69594f, 10.8879f, 4.16578f);
        instancePath4.lineTo(10.8879f, 4.16578f);
        instancePath4.cubicTo(11.681f, 5.8223f, 12.0775f, 6.65055f, 12.6352f, 7.27711f);
        instancePath4.cubicTo(13.5173f, 8.26805f, 14.7059f, 8.93491f, 16.0113f, 9.17121f);
        instancePath4.cubicTo(16.8367f, 9.32062f, 17.7601f, 9.22636f, 19.6071f, 9.03782f);
        instancePath4.lineTo(19.6071f, 9.03782f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
