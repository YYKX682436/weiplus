package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class panel_icon_transfer extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(57.0f, 42.0f);
                instancePath.lineTo(71.83607f, 42.0f);
                instancePath.cubicTo(73.49293f, 42.0f, 74.83607f, 43.343147f, 74.83607f, 45.0f);
                instancePath.cubicTo(74.83607f, 45.95563f, 74.38078f, 46.85409f, 73.61016f, 47.419216f);
                instancePath.lineTo(39.985905f, 72.077f);
                instancePath.cubicTo(39.31786f, 72.5669f, 38.379154f, 72.422485f, 37.889256f, 71.75444f);
                instancePath.cubicTo(37.593067f, 71.35055f, 37.51801f, 70.82548f, 37.68917f, 70.35478f);
                instancePath.lineTo(44.727272f, 51.0f);
                instancePath.lineTo(3.0f, 51.0f);
                instancePath.cubicTo(1.3431457f, 51.0f, 2.0290612E-16f, 49.656853f, 0.0f, 48.0f);
                instancePath.lineTo(0.0f, 45.0f);
                instancePath.cubicTo(-2.0290612E-16f, 43.343147f, 1.3431457f, 42.0f, 3.0f, 42.0f);
                instancePath.lineTo(57.0f, 42.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(30.272728f, 24.0f);
                instancePath2.lineTo(75.0f, 24.0f);
                instancePath2.cubicTo(76.65685f, 24.0f, 78.0f, 25.343145f, 78.0f, 27.0f);
                instancePath2.lineTo(78.0f, 30.0f);
                instancePath2.cubicTo(78.0f, 31.656855f, 76.65685f, 33.0f, 75.0f, 33.0f);
                instancePath2.lineTo(21.0f, 33.0f);
                instancePath2.lineTo(3.1639297f, 33.0f);
                instancePath2.cubicTo(1.5070753f, 33.0f, 0.16392961f, 31.656855f, 0.16392961f, 30.0f);
                instancePath2.cubicTo(0.16392961f, 29.044369f, 0.6192133f, 28.14591f, 1.3898386f, 27.580786f);
                instancePath2.lineTo(35.014095f, 2.9229982f);
                instancePath2.cubicTo(35.68214f, 2.4330964f, 36.620846f, 2.5775125f, 37.110744f, 3.2455602f);
                instancePath2.cubicTo(37.406933f, 3.6494505f, 37.48199f, 4.174522f, 37.31083f, 4.6452203f);
                instancePath2.lineTo(30.272728f, 24.0f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
