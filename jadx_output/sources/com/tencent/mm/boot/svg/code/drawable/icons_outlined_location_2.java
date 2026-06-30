package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_location_2 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 7.5f);
        instancePath.cubicTo(48.426407f, 7.5f, 58.5f, 17.502045f, 58.5f, 29.840193f);
        instancePath.cubicTo(58.5f, 37.801018f, 53.917423f, 45.823196f, 49.09366f, 52.06238f);
        instancePath.lineTo(48.019505f, 53.41877f);
        instancePath.lineTo(46.947998f, 54.711956f);
        instancePath.lineTo(46.416546f, 55.333447f);
        instancePath.lineTo(46.416546f, 55.333447f);
        instancePath.lineTo(45.36886f, 56.523407f);
        instancePath.lineTo(44.35029f, 57.638927f);
        instancePath.lineTo(43.371418f, 58.675507f);
        instancePath.lineTo(42.000717f, 60.072525f);
        instancePath.lineTo(40.778893f, 61.266632f);
        instancePath.lineTo(39.741684f, 62.242645f);
        instancePath.lineTo(38.076416f, 63.72601f);
        instancePath.cubicTo(37.033005f, 64.67709f, 35.37659f, 64.746994f, 34.22446f, 63.96144f);
        instancePath.lineTo(33.635967f, 63.479675f);
        instancePath.lineTo(32.258316f, 62.242645f);
        instancePath.lineTo(30.83258f, 60.89208f);
        instancePath.lineTo(29.999285f, 60.072525f);
        instancePath.lineTo(28.62858f, 58.675507f);
        instancePath.lineTo(27.649712f, 57.638927f);
        instancePath.lineTo(26.63114f, 56.523407f);
        instancePath.lineTo(25.583454f, 55.333447f);
        instancePath.lineTo(25.052002f, 54.711956f);
        instancePath.lineTo(25.052002f, 54.711956f);
        instancePath.lineTo(23.980495f, 53.41877f);
        instancePath.lineTo(22.906342f, 52.06238f);
        instancePath.cubicTo(18.082577f, 45.823196f, 13.5f, 37.801018f, 13.5f, 29.840193f);
        instancePath.cubicTo(13.5f, 17.502045f, 23.573593f, 7.5f, 36.0f, 7.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 14.1f);
        instancePath.cubicTo(27.427979f, 14.1f, 20.45646f, 20.809223f, 20.113243f, 29.192137f);
        instancePath.lineTo(20.1f, 29.840193f);
        instancePath.cubicTo(20.1f, 30.020752f, 20.103458f, 30.202772f, 20.110373f, 30.386261f);
        instancePath.cubicTo(20.314962f, 35.8151f, 23.523222f, 42.29678f, 28.861837f, 48.957825f);
        instancePath.cubicTo(30.91333f, 51.517498f, 33.125935f, 53.914043f, 35.33602f, 56.06538f);
        instancePath.lineTo(36.0f, 56.703f);
        instancePath.lineTo(36.66398f, 56.06538f);
        instancePath.cubicTo(38.874065f, 53.914043f, 41.08667f, 51.517498f, 43.138165f, 48.957825f);
        instancePath.cubicTo(48.476776f, 42.29678f, 51.685036f, 35.8151f, 51.88963f, 30.386261f);
        instancePath.lineTo(51.9f, 29.840193f);
        instancePath.cubicTo(51.9f, 21.157696f, 44.791817f, 14.1f, 36.0f, 14.1f);
        instancePath.close();
        instancePath.moveTo(36.0f, 19.5f);
        instancePath.cubicTo(41.79899f, 19.5f, 46.5f, 24.20101f, 46.5f, 30.0f);
        instancePath.cubicTo(46.5f, 35.79899f, 41.79899f, 40.5f, 36.0f, 40.5f);
        instancePath.cubicTo(30.20101f, 40.5f, 25.5f, 35.79899f, 25.5f, 30.0f);
        instancePath.cubicTo(25.5f, 24.20101f, 30.20101f, 19.5f, 36.0f, 19.5f);
        instancePath.close();
        instancePath.moveTo(36.0f, 26.1f);
        instancePath.cubicTo(33.84609f, 26.1f, 32.1f, 27.84609f, 32.1f, 30.0f);
        instancePath.cubicTo(32.1f, 32.15391f, 33.84609f, 33.9f, 36.0f, 33.9f);
        instancePath.cubicTo(38.15391f, 33.9f, 39.9f, 32.15391f, 39.9f, 30.0f);
        instancePath.cubicTo(39.9f, 27.84609f, 38.15391f, 26.1f, 36.0f, 26.1f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
