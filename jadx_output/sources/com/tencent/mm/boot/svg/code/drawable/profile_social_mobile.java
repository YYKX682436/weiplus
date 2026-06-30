package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class profile_social_mobile extends l95.c {
    private final int width = 76;
    private final int height = 76;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 76;
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
        instancePaint3.setColor(-789517);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.cubicTo(74.20914f, 0.0f, 76.0f, 1.7908609f, 76.0f, 4.0f);
        instancePath.lineTo(76.0f, 72.0f);
        instancePath.cubicTo(76.0f, 74.20914f, 74.20914f, 76.0f, 72.0f, 76.0f);
        instancePath.lineTo(4.0f, 76.0f);
        instancePath.cubicTo(1.7908609f, 76.0f, 0.0f, 74.20914f, 0.0f, 72.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-5658199);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 18.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.7070117f, 6.412617f);
        instancePath2.cubicTo(6.3475637f, 3.0910726f, 10.084194f, -0.36092544f, 14.617972f, 0.03043481f);
        instancePath2.cubicTo(16.40159f, 5.1482224f, 19.90904f, 9.844545f, 19.92897f, 15.433972f);
        instancePath2.cubicTo(17.168846f, 17.22018f, 12.874211f, 18.815727f, 13.252857f, 22.849749f);
        instancePath2.cubicTo(14.059969f, 27.385513f, 16.501234f, 31.840998f, 19.958862f, 34.871532f);
        instancePath2.cubicTo(23.376635f, 37.169518f, 26.385868f, 33.416473f, 28.398664f, 31.048243f);
        instancePath2.cubicTo(29.494743f, 31.028173f, 30.580858f, 31.018139f, 31.676935f, 31.018139f);
        instancePath2.cubicTo(35.134563f, 33.908184f, 38.651978f, 36.727985f, 42.0f, 39.74848f);
        instancePath2.cubicTo(41.15303f, 41.805634f, 40.993603f, 44.49498f, 38.891125f, 45.72927f);
        instancePath2.cubicTo(35.463387f, 48.288162f, 31.447756f, 50.736675f, 26.973764f, 49.793396f);
        instancePath2.cubicTo(17.358168f, 48.248024f, 10.452875f, 40.14988f, 5.7297745f, 32.15208f);
        instancePath2.cubicTo(1.4251761f, 24.545643f, -1.3249838f, 14.320102f, 3.7070117f, 6.412617f);
        instancePath2.lineTo(3.7070117f, 6.412617f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
