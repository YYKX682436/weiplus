package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_avatar_round extends l95.c {
    private final int width = 160;
    private final int height = 160;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 160;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-526345);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(80.0f, 0.0f);
        instancePath.cubicTo(124.182785f, 0.0f, 160.0f, 35.81722f, 160.0f, 80.0f);
        instancePath.cubicTo(160.0f, 124.182785f, 124.182785f, 160.0f, 80.0f, 160.0f);
        instancePath.cubicTo(35.81722f, 160.0f, 0.0f, 124.182785f, 0.0f, 80.0f);
        instancePath.cubicTo(0.0f, 35.81722f, 35.81722f, 0.0f, 80.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 40.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha(null, 25, 31);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.333333f, 66.666664f);
        instancePath2.lineTo(8.333333f, 64.38488f);
        instancePath2.lineTo(8.333333f, 64.38488f);
        instancePath2.cubicTo(8.333333f, 62.10125f, 9.993836f, 59.439693f, 12.046992f, 58.437775f);
        instancePath2.lineTo(30.914835f, 49.230476f);
        instancePath2.cubicTo(33.651257f, 47.895134f, 34.28753f, 44.937542f, 32.311485f, 42.595463f);
        instancePath2.lineTo(31.106375f, 41.167126f);
        instancePath2.cubicTo(28.654392f, 38.260952f, 26.666666f, 32.831654f, 26.666666f, 29.030968f);
        instancePath2.lineTo(26.666666f, 23.331934f);
        instancePath2.cubicTo(26.666666f, 15.96891f, 32.651188f, 10.0f, 40.0f, 10.0f);
        instancePath2.cubicTo(47.363796f, 10.0f, 53.333332f, 15.976601f, 53.333332f, 23.334024f);
        instancePath2.lineTo(53.333332f, 29.033953f);
        instancePath2.cubicTo(53.333332f, 32.830986f, 51.33644f, 38.2762f, 48.893623f, 41.17191f);
        instancePath2.lineTo(47.688515f, 42.60044f);
        instancePath2.cubicTo(45.723442f, 44.929836f, 46.33729f, 47.894657f, 49.085163f, 49.235035f);
        instancePath2.lineTo(67.95301f, 58.438526f);
        instancePath2.cubicTo(70.004005f, 59.438976f, 71.666664f, 62.0839f, 71.666664f, 64.38488f);
        instancePath2.lineTo(71.666664f, 66.666664f);
        instancePath2.cubicTo(71.666664f, 68.507614f, 70.174286f, 70.0f, 68.333336f, 70.0f);
        instancePath2.lineTo(11.666667f, 70.0f);
        instancePath2.cubicTo(9.825718f, 70.0f, 8.333333f, 68.507614f, 8.333333f, 66.666664f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
