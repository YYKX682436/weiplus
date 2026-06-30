package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class record_nopicture_icon extends l95.c {
    private final int width = 180;
    private final int height = 180;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 180;
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
                instancePaint3.setColor(-1315861);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 20.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 9.032258f);
                instancePath.lineTo(9.0f, 9.032258f);
                instancePath.lineTo(9.0f, 89.96034f);
                instancePath.lineTo(60.553738f, 41.65066f);
                instancePath.lineTo(121.92021f, 98.15694f);
                instancePath.lineTo(113.13358f, 80.02691f);
                instancePath.lineTo(138.16164f, 60.600388f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.lineTo(171.0f, 90.18926f);
                instancePath.close();
                instancePath.moveTo(4.494371f, 0.0f);
                instancePath.cubicTo(2.0121984f, 0.0f, 0.0f, 2.0194945f, 0.0f, 4.5191708f);
                instancePath.lineTo(0.0f, 135.48083f);
                instancePath.cubicTo(0.0f, 137.9767f, 2.0214844f, 140.0f, 4.494371f, 140.0f);
                instancePath.lineTo(175.50563f, 140.0f);
                instancePath.cubicTo(177.98781f, 140.0f, 180.0f, 137.9805f, 180.0f, 135.48083f);
                instancePath.lineTo(180.0f, 4.5191708f);
                instancePath.cubicTo(180.0f, 2.0233016f, 177.97852f, 0.0f, 175.50563f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
                instancePath.lineTo(4.494371f, 0.0f);
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
