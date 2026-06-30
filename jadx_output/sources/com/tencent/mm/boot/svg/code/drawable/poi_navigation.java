package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class poi_navigation extends l95.c {
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
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 11.171573f, 0.70710677f, 0.70710677f, -6.970563f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.464238f, 1.1605959f);
                instancePath.lineTo(21.408022f, 18.520058f);
                instancePath.cubicTo(21.51058f, 18.77645f, 21.385872f, 19.067434f, 21.12948f, 19.16999f);
                instancePath.cubicTo(20.977533f, 19.230768f, 20.805462f, 19.213343f, 20.668787f, 19.123337f);
                instancePath.lineTo(14.0f, 14.731639f);
                instancePath.lineTo(14.0f, 14.731639f);
                instancePath.lineTo(7.3312135f, 19.123337f);
                instancePath.cubicTo(7.1005883f, 19.275213f, 6.7905087f, 19.211374f, 6.638632f, 18.98075f);
                instancePath.cubicTo(6.5486245f, 18.844074f, 6.531199f, 18.672003f, 6.591977f, 18.520058f);
                instancePath.lineTo(13.535762f, 1.1605959f);
                instancePath.cubicTo(13.638318f, 0.90420413f, 13.929303f, 0.77949613f, 14.185696f, 0.88205284f);
                instancePath.cubicTo(14.312747f, 0.93287337f, 14.413418f, 1.0335445f, 14.464238f, 1.1605959f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
