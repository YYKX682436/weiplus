package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_bottle extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-14187817);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(192.0f, 0.0f);
                instancePath.lineTo(192.0f, 192.0f);
                instancePath.lineTo(0.0f, 192.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(110.90694f, 140.57062f);
                instancePath2.cubicTo(115.39648f, 133.81949f, 120.514946f, 125.826996f, 125.18189f, 117.83344f);
                instancePath2.cubicTo(132.5147f, 105.2738f, 118.942276f, 91.864136f, 121.05859f, 88.2393f);
                instancePath2.lineTo(133.6816f, 66.618614f);
                instancePath2.lineTo(137.24696f, 68.6542f);
                instancePath2.lineTo(140.59984f, 62.91139f);
                instancePath2.lineTo(114.816216f, 48.190643f);
                instancePath2.lineTo(111.46334f, 53.933456f);
                instancePath2.lineTo(113.825035f, 55.28183f);
                instancePath2.lineTo(113.825035f, 55.28183f);
                instancePath2.cubicTo(110.083145f, 61.69095f, 102.824165f, 74.12414f, 101.20204f, 76.90253f);
                instancePath2.cubicTo(98.99318f, 80.68586f, 81.064964f, 75.49447f, 73.554855f, 88.35781f);
                instancePath2.cubicTo(67.73289f, 98.32967f, 53.740925f, 118.98361f, 48.758373f, 126.291245f);
                instancePath2.cubicTo(59.07041f, 125.45091f, 74.24749f, 125.95091f, 88.1873f, 133.06181f);
                instancePath2.cubicTo(96.19743f, 137.1479f, 103.822685f, 139.4944f, 110.90694f, 140.57062f);
                instancePath2.lineTo(110.90694f, 140.57062f);
                instancePath2.close();
                instancePath2.moveTo(132.08064f, 36.41379f);
                instancePath2.lineTo(124.87423f, 49.809467f);
                instancePath2.lineTo(135.35979f, 56.026367f);
                instancePath2.lineTo(149.97533f, 45.104786f);
                instancePath2.lineTo(132.08064f, 36.41379f);
                instancePath2.close();
                instancePath2.moveTo(157.39185f, 138.754f);
                instancePath2.cubicTo(157.39185f, 138.754f, 137.7422f, 158.59561f, 114.86281f, 158.59561f);
                instancePath2.cubicTo(65.0383f, 158.59561f, 84.342834f, 136.6334f, 26.48276f, 134.37212f);
                instancePath2.cubicTo(26.479265f, 134.37747f, 58.087933f, 125.80052f, 85.2693f, 138.754f);
                instancePath2.cubicTo(126.68277f, 158.48987f, 157.39185f, 138.754f, 157.39185f, 138.754f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
