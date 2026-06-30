package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_usb extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 64;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.71356f, 43.2083f);
        instancePath.cubicTo(1.71356f, 42.2881f, 1.82641f, 41.4027f, 2.0521f, 40.552f);
        instancePath.cubicTo(2.29516f, 39.7013f, 2.58162f, 38.894f, 2.91148f, 38.1301f);
        instancePath.lineTo(12.2344f, 16.6978f);
        instancePath.cubicTo(13.0504f, 14.7881f, 14.2309f, 13.3558f, 15.7761f, 12.401f);
        instancePath.cubicTo(17.3212f, 11.4287f, 19.1441f, 10.9426f, 21.2448f, 10.9426f);
        instancePath.lineTo(42.4948f, 10.9426f);
        instancePath.cubicTo(44.5955f, 10.9426f, 46.4184f, 11.4287f, 47.9636f, 12.401f);
        instancePath.cubicTo(49.5087f, 13.3558f, 50.6893f, 14.7881f, 51.5052f, 16.6978f);
        instancePath.lineTo(60.8021f, 38.1301f);
        instancePath.cubicTo(61.132f, 38.9114f, 61.4184f, 39.7273f, 61.6615f, 40.578f);
        instancePath.cubicTo(61.9045f, 41.4114f, 62.0261f, 42.2881f, 62.0261f, 43.2083f);
        instancePath.cubicTo(62.0261f, 45.2569f, 61.5313f, 47.1232f, 60.5417f, 48.8072f);
        instancePath.cubicTo(59.5521f, 50.4739f, 58.1979f, 51.7933f, 56.4792f, 52.7655f);
        instancePath.cubicTo(54.7604f, 53.7378f, 52.7986f, 54.2239f, 50.5938f, 54.2239f);
        instancePath.lineTo(13.1459f, 54.2239f);
        instancePath.cubicTo(10.9584f, 54.2239f, 8.99655f, 53.7378f, 7.26044f, 52.7655f);
        instancePath.cubicTo(5.54169f, 51.7933f, 4.18752f, 50.4739f, 3.19794f, 48.8072f);
        instancePath.cubicTo(2.20835f, 47.1232f, 1.71356f, 45.2569f, 1.71356f, 43.2083f);
        instancePath.close();
        instancePath.moveTo(4.91669f, 43.2083f);
        instancePath.cubicTo(4.91669f, 44.6839f, 5.26391f, 46.0121f, 5.95835f, 47.1926f);
        instancePath.cubicTo(6.67016f, 48.3558f, 7.64238f, 49.2846f, 8.87502f, 49.9791f);
        instancePath.cubicTo(10.125f, 50.6735f, 11.5486f, 51.0208f, 13.1459f, 51.0208f);
        instancePath.lineTo(50.5938f, 51.0208f);
        instancePath.cubicTo(52.2084f, 51.0208f, 53.632f, 50.6996f, 54.8646f, 50.0572f);
        instancePath.cubicTo(56.0972f, 49.4148f, 57.0608f, 48.5121f, 57.7552f, 47.3489f);
        instancePath.cubicTo(58.467f, 46.1683f, 58.8229f, 44.7881f, 58.8229f, 43.2083f);
        instancePath.cubicTo(58.8229f, 41.7499f, 58.467f, 40.4305f, 57.7552f, 39.2499f);
        instancePath.cubicTo(57.0608f, 38.052f, 56.0972f, 37.1145f, 54.8646f, 36.4374f);
        instancePath.cubicTo(53.632f, 35.743f, 52.2084f, 35.3958f, 50.5938f, 35.3958f);
        instancePath.lineTo(13.1459f, 35.3958f);
        instancePath.cubicTo(11.5486f, 35.3958f, 10.125f, 35.743f, 8.87502f, 36.4374f);
        instancePath.cubicTo(7.64238f, 37.1145f, 6.67016f, 38.052f, 5.95835f, 39.2499f);
        instancePath.cubicTo(5.26391f, 40.4305f, 4.91669f, 41.7499f, 4.91669f, 43.2083f);
        instancePath.close();
        instancePath.moveTo(8.66669f, 33.2083f);
        instancePath.cubicTo(9.32641f, 32.8784f, 10.0295f, 32.6267f, 10.7761f, 32.453f);
        instancePath.cubicTo(11.54f, 32.2794f, 12.3299f, 32.1926f, 13.1459f, 32.1926f);
        instancePath.lineTo(50.5938f, 32.1926f);
        instancePath.cubicTo(51.4097f, 32.1926f, 52.191f, 32.2794f, 52.9375f, 32.453f);
        instancePath.cubicTo(53.7014f, 32.6267f, 54.4132f, 32.8784f, 55.0729f, 33.2083f);
        instancePath.lineTo(48.4063f, 17.5312f);
        instancePath.cubicTo(47.8854f, 16.2812f, 47.1129f, 15.3437f, 46.0886f, 14.7187f);
        instancePath.cubicTo(45.0816f, 14.0763f, 43.875f, 13.7551f, 42.4688f, 13.7551f);
        instancePath.lineTo(21.2709f, 13.7551f);
        instancePath.cubicTo(19.8646f, 13.7551f, 18.6493f, 14.0763f, 17.625f, 14.7187f);
        instancePath.cubicTo(16.6181f, 15.3437f, 15.8542f, 16.2812f, 15.3334f, 17.5312f);
        instancePath.lineTo(8.66669f, 33.2083f);
        instancePath.close();
        instancePath.moveTo(47.3646f, 43.2083f);
        instancePath.cubicTo(47.3646f, 42.3749f, 47.6771f, 41.6458f, 48.3021f, 41.0208f);
        instancePath.cubicTo(48.9445f, 40.3958f, 49.691f, 40.0833f, 50.5417f, 40.0833f);
        instancePath.cubicTo(51.375f, 40.0833f, 52.1042f, 40.3958f, 52.7292f, 41.0208f);
        instancePath.cubicTo(53.3542f, 41.6458f, 53.6667f, 42.3749f, 53.6667f, 43.2083f);
        instancePath.cubicTo(53.6667f, 44.0763f, 53.3542f, 44.8142f, 52.7292f, 45.4218f);
        instancePath.cubicTo(52.1042f, 46.0294f, 51.375f, 46.3333f, 50.5417f, 46.3333f);
        instancePath.cubicTo(49.691f, 46.3333f, 48.9445f, 46.0381f, 48.3021f, 45.4478f);
        instancePath.cubicTo(47.6771f, 44.8402f, 47.3646f, 44.0937f, 47.3646f, 43.2083f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
