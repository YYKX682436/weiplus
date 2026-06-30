package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_multiple_choice extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 7.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(55.334522f, 27.0f);
                instancePath.lineTo(61.698486f, 33.36396f);
                instancePath.lineTo(43.879395f, 51.183052f);
                instancePath.cubicTo(43.566975f, 51.495472f, 43.16828f, 51.669037f, 42.760006f, 51.70375f);
                instancePath.lineTo(42.6066f, 51.71026f);
                instancePath.cubicTo(42.145943f, 51.71026f, 41.68528f, 51.534523f, 41.33381f, 51.183052f);
                instancePath.lineTo(32.0f, 41.849243f);
                instancePath.lineTo(38.36396f, 35.485283f);
                instancePath.lineTo(42.606f, 39.727f);
                instancePath.lineTo(55.334522f, 27.0f);
                instancePath.close();
                instancePath.moveTo(29.0f, 39.0f);
                instancePath.lineTo(29.0f, 48.0f);
                instancePath.lineTo(14.0f, 48.0f);
                instancePath.lineTo(14.0f, 39.0f);
                instancePath.lineTo(29.0f, 39.0f);
                instancePath.close();
                instancePath.moveTo(9.5f, 39.0f);
                instancePath.lineTo(9.5f, 48.0f);
                instancePath.lineTo(0.5f, 48.0f);
                instancePath.lineTo(0.5f, 39.0f);
                instancePath.lineTo(9.5f, 39.0f);
                instancePath.close();
                instancePath.moveTo(47.0f, 19.5f);
                instancePath.lineTo(47.0f, 28.5f);
                instancePath.lineTo(14.0f, 28.5f);
                instancePath.lineTo(14.0f, 19.5f);
                instancePath.lineTo(47.0f, 19.5f);
                instancePath.close();
                instancePath.moveTo(9.5f, 19.5f);
                instancePath.lineTo(9.5f, 28.5f);
                instancePath.lineTo(0.5f, 28.5f);
                instancePath.lineTo(0.5f, 19.5f);
                instancePath.lineTo(9.5f, 19.5f);
                instancePath.close();
                instancePath.moveTo(53.0f, 0.0f);
                instancePath.lineTo(53.0f, 9.0f);
                instancePath.lineTo(14.0f, 9.0f);
                instancePath.lineTo(14.0f, 0.0f);
                instancePath.lineTo(53.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(9.5f, 0.0f);
                instancePath.lineTo(9.5f, 9.0f);
                instancePath.lineTo(0.5f, 9.0f);
                instancePath.lineTo(0.5f, 0.0f);
                instancePath.lineTo(9.5f, 0.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
