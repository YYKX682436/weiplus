package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ofm_favourite_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.instanceMatrix(looper);
                l95.c.instanceMatrixArray(looper);
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(44.10407f, 48.572086f);
                instancePath.lineTo(20.999926f, 35.23115f);
                instancePath.cubicTo(19.958965f, 34.62973f, 19.004f, 35.25858f, 19.0f, 36.462433f);
                instancePath.lineTo(19.004f, 62.93198f);
                instancePath.cubicTo(19.0f, 64.13482f, 19.846968f, 65.615f, 20.88693f, 66.21947f);
                instancePath.lineTo(44.10907f, 79.74022f);
                instancePath.cubicTo(45.149033f, 80.345695f, 46.0f, 79.85603f, 46.0f, 78.65319f);
                instancePath.lineTo(46.0f, 51.85246f);
                instancePath.cubicTo(45.999f, 50.648605f, 45.14603f, 49.17249f, 44.10407f, 48.572086f);
                instancePath.close();
                instancePath.moveTo(73.216934f, 29.458399f);
                instancePath.lineTo(50.073246f, 16.4451f);
                instancePath.cubicTo(49.02697f, 15.856779f, 47.311195f, 15.850846f, 46.259857f, 16.432247f);
                instancePath.lineTo(22.789015f, 29.413904f);
                instancePath.cubicTo(21.738686f, 29.994316f, 21.73666f, 30.948486f, 22.784964f, 31.533842f);
                instancePath.lineTo(46.14338f, 44.56098f);
                instancePath.cubicTo(47.19168f, 45.14634f, 48.90745f, 45.14634f, 49.956768f, 44.56098f);
                instancePath.lineTo(73.21288f, 31.591192f);
                instancePath.cubicTo(74.261185f, 31.006824f, 74.2622f, 30.046722f, 73.216934f, 29.458399f);
                instancePath.close();
                instancePath.moveTo(76.997f, 36.350918f);
                instancePath.cubicTo(77.001f, 35.14774f, 76.151f, 34.6553f, 75.11f, 35.256382f);
                instancePath.lineTo(51.895f, 48.66497f);
                instancePath.cubicTo(50.853f, 49.267067f, 50.0f, 50.74337f, 50.0f, 51.94655f);
                instancePath.lineTo(50.0f, 78.64493f);
                instancePath.cubicTo(50.0f, 79.84912f, 50.854f, 80.34461f, 51.898f, 79.74556f);
                instancePath.lineTo(74.994f, 66.51567f);
                instancePath.cubicTo(76.037f, 65.91763f, 76.996f, 64.287f, 77.0f, 63.082806f);
                instancePath.lineTo(76.997f, 36.350918f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
