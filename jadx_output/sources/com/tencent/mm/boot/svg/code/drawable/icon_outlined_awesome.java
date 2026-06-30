package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_outlined_awesome extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.757333f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.213623f, 7.6450953f);
                instancePath.cubicTo(17.65774f, 6.1567516f, 17.640882f, 3.7815373f, 16.17234f, 2.3129942f);
                instancePath.cubicTo(14.688348f, 0.8290019f, 12.282321f, 0.8290019f, 10.798328f, 2.3129942f);
                instancePath.cubicTo(10.606064f, 2.505259f, 10.362191f, 2.7404997f, 10.0655985f, 3.0199451f);
                instancePath.lineTo(9.242693f, 3.7952752f);
                instancePath.lineTo(8.419788f, 3.0199451f);
                instancePath.cubicTo(8.123196f, 2.7404997f, 7.8793235f, 2.505259f, 7.6870584f, 2.3129942f);
                instancePath.cubicTo(6.2030663f, 0.8290019f, 3.7970393f, 0.8290019f, 2.313047f, 2.3129942f);
                instancePath.cubicTo(0.844522f, 3.7815192f, 0.82756805f, 6.1568704f, 2.2586584f, 7.6326175f);
                instancePath.lineTo(9.242651f, 14.616682f);
                instancePath.lineTo(16.213623f, 7.6450953f);
                instancePath.close();
                instancePath.moveTo(1.4645188f, 1.4644661f);
                instancePath.cubicTo(3.4171402f, -0.48815536f, 6.5829654f, -0.48815536f, 8.535586f, 1.4644661f);
                instancePath.cubicTo(8.718393f, 1.6472728f, 8.954096f, 1.8746326f, 9.242693f, 2.1465456f);
                instancePath.cubicTo(9.531291f, 1.8746326f, 9.7669935f, 1.6472728f, 9.9498005f, 1.4644661f);
                instancePath.cubicTo(11.902422f, -0.48815536f, 15.068247f, -0.48815536f, 17.020868f, 1.4644661f);
                instancePath.cubicTo(18.955326f, 3.3989244f, 18.97332f, 6.5241203f, 17.07485f, 8.480731f);
                instancePath.lineTo(9.9498005f, 15.606602f);
                instancePath.cubicTo(9.559297f, 15.997147f, 8.926131f, 15.99718f, 8.535586f, 15.606676f);
                instancePath.lineTo(1.410126f, 8.481141f);
                instancePath.cubicTo(-0.4879337f, 6.5241203f, -0.4699394f, 3.3989244f, 1.4645188f, 1.4644661f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
