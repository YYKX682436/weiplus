package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class news_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.39055f, 10.3148f);
        instancePath.lineTo(4.06097f, 12.2024f);
        instancePath.lineTo(2.94388f, 8.07319f);
        instancePath.cubicTo(2.75951f, 7.38678f, 3.17164f, 6.67891f, 3.86575f, 6.49658f);
        instancePath.lineTo(8.03044f, 5.39187f);
        instancePath.lineTo(8.04128f, 9.18862f);
        instancePath.cubicTo(8.04128f, 9.64981f, 7.79184f, 10.0788f, 7.39055f, 10.3148f);
        instancePath.close();
        instancePath.moveTo(8.04128f, 15.2055f);
        instancePath.lineTo(8.03044f, 19.0023f);
        instancePath.lineTo(3.86575f, 17.8976f);
        instancePath.cubicTo(3.17164f, 17.7152f, 2.75951f, 17.0074f, 2.94388f, 16.3209f);
        instancePath.lineTo(4.06097f, 12.2024f);
        instancePath.lineTo(7.39055f, 14.0901f);
        instancePath.cubicTo(7.79184f, 14.3153f, 8.04128f, 14.7443f, 8.04128f, 15.2055f);
        instancePath.close();
        instancePath.moveTo(12.6615f, 17.0932f);
        instancePath.lineTo(15.9802f, 19.0023f);
        instancePath.lineTo(12.9218f, 22.0161f);
        instancePath.cubicTo(12.412f, 22.5202f, 11.5878f, 22.5202f, 11.078f, 22.0161f);
        instancePath.lineTo(8.03044f, 19.0023f);
        instancePath.lineTo(11.3492f, 17.0932f);
        instancePath.cubicTo(11.7505f, 16.8572f, 12.2493f, 16.8572f, 12.6615f, 17.0932f);
        instancePath.close();
        instancePath.moveTo(16.6093f, 14.0794f);
        instancePath.lineTo(19.9388f, 12.1917f);
        instancePath.lineTo(21.0559f, 16.3102f);
        instancePath.cubicTo(21.2403f, 16.9966f, 20.8282f, 17.7045f, 20.1341f, 17.8868f);
        instancePath.lineTo(15.9694f, 18.9915f);
        instancePath.lineTo(15.9585f, 15.1948f);
        instancePath.cubicTo(15.9585f, 14.7443f, 16.208f, 14.3153f, 16.6093f, 14.0794f);
        instancePath.close();
        instancePath.moveTo(15.9585f, 9.18862f);
        instancePath.lineTo(15.9694f, 5.39187f);
        instancePath.lineTo(20.1341f, 6.49658f);
        instancePath.cubicTo(20.8282f, 6.67891f, 21.2403f, 7.38678f, 21.0559f, 8.07319f);
        instancePath.lineTo(19.9388f, 12.1917f);
        instancePath.lineTo(16.6093f, 10.3041f);
        instancePath.cubicTo(16.208f, 10.0788f, 15.9585f, 9.64981f, 15.9585f, 9.18862f);
        instancePath.close();
        instancePath.moveTo(11.3492f, 7.30097f);
        instancePath.lineTo(8.03044f, 5.39187f);
        instancePath.lineTo(11.078f, 2.37807f);
        instancePath.cubicTo(11.5878f, 1.87398f, 12.412f, 1.87398f, 12.9218f, 2.37807f);
        instancePath.lineTo(15.9694f, 5.39187f);
        instancePath.lineTo(12.6506f, 7.30097f);
        instancePath.cubicTo(12.2493f, 7.53693f, 11.7505f, 7.53693f, 11.3492f, 7.30097f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
