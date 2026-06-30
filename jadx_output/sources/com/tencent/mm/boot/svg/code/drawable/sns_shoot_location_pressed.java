package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_shoot_location_pressed extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 60;
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
                instancePaint3.setColor(-12206054);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.24f, 9.3f);
                instancePath.cubicTo(8.92f, 2.94f, 17.39f, -0.19f, 25.1f, 1.41f);
                instancePath.cubicTo(32.66f, 2.78f, 39.15f, 8.72f, 41.17f, 16.14f);
                instancePath.cubicTo(43.04f, 22.59f, 41.49f, 29.57f, 38.39f, 35.38f);
                instancePath.cubicTo(34.3f, 42.96f, 27.97f, 49.1f, 21.0f, 54.04f);
                instancePath.cubicTo(12.64f, 48.07f, 4.94f, 40.33f, 1.47f, 30.46f);
                instancePath.cubicTo(-1.06f, 23.52f, -0.39f, 15.22f, 4.24f, 9.3f);
                instancePath.lineTo(4.24f, 9.3f);
                instancePath.close();
                instancePath.moveTo(17.121176f, 14.014381f);
                instancePath.cubicTo(11.980267f, 16.542173f, 11.574966f, 24.57351f, 16.44923f, 27.602592f);
                instancePath.cubicTo(21.355494f, 31.324953f, 29.25884f, 27.197294f, 28.949532f, 21.032469f);
                instancePath.cubicTo(29.25884f, 15.198284f, 22.102098f, 10.963966f, 17.121176f, 14.014381f);
                instancePath.lineTo(17.121176f, 14.014381f);
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
