package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sticker_filled extends l95.c {
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.8574f, 3.0f);
        instancePath.cubicTo(19.4256f, 3.00007f, 19.9703f, 3.22613f, 20.3721f, 3.62793f);
        instancePath.cubicTo(20.7739f, 4.02973f, 20.9999f, 4.57436f, 21.0f, 5.14258f);
        instancePath.lineTo(21.0f, 12.8574f);
        instancePath.lineTo(15.4287f, 12.8574f);
        instancePath.cubicTo(14.8353f, 12.8575f, 14.2601f, 13.0628f, 13.8008f, 13.4385f);
        instancePath.cubicTo(13.3415f, 13.8142f, 13.0259f, 14.3374f, 12.9082f, 14.9189f);
        instancePath.cubicTo(12.6087f, 14.9742f, 12.3046f, 15.0011f, 12.0f, 15.0f);
        instancePath.cubicTo(11.3249f, 15.0021f, 10.656f, 14.8705f, 10.0322f, 14.6123f);
        instancePath.cubicTo(9.40839f, 14.3541f, 8.84142f, 13.9747f, 8.36523f, 13.4961f);
        instancePath.cubicTo(8.28747f, 13.41f, 8.19329f, 13.3405f, 8.08789f, 13.292f);
        instancePath.cubicTo(7.98242f, 13.2434f, 7.86802f, 13.216f, 7.75195f, 13.2129f);
        instancePath.cubicTo(7.6361f, 13.2099f, 7.52079f, 13.2307f, 7.41309f, 13.2734f);
        instancePath.cubicTo(7.30532f, 13.3163f, 7.20719f, 13.3811f, 7.125f, 13.4629f);
        instancePath.cubicTo(7.04289f, 13.5447f, 6.97787f, 13.6425f, 6.93457f, 13.75f);
        instancePath.cubicTo(6.89127f, 13.8577f, 6.8704f, 13.9738f, 6.87305f, 14.0898f);
        instancePath.cubicTo(6.87572f, 14.2058f, 6.90111f, 14.3202f, 6.94922f, 14.4258f);
        instancePath.cubicTo(6.99739f, 14.5314f, 7.06742f, 14.626f, 7.15332f, 14.7041f);
        instancePath.cubicTo(7.78773f, 15.3436f, 8.54294f, 15.8513f, 9.375f, 16.1963f);
        instancePath.cubicTo(10.207f, 16.5412f, 11.0993f, 16.7167f, 12.0f, 16.7139f);
        instancePath.cubicTo(12.2866f, 16.7148f, 12.5733f, 16.6962f, 12.8574f, 16.6582f);
        instancePath.lineTo(12.8574f, 21.0f);
        instancePath.lineTo(5.14258f, 21.0f);
        instancePath.cubicTo(4.57436f, 20.9999f, 4.02973f, 20.7739f, 3.62793f, 20.3721f);
        instancePath.cubicTo(3.22613f, 19.9703f, 3.00007f, 19.4256f, 3.0f, 18.8574f);
        instancePath.lineTo(3.0f, 5.14258f);
        instancePath.cubicTo(3.00007f, 4.57436f, 3.22613f, 4.02973f, 3.62793f, 3.62793f);
        instancePath.cubicTo(4.02973f, 3.22613f, 4.57436f, 3.00007f, 5.14258f, 3.0f);
        instancePath.lineTo(18.8574f, 3.0f);
        instancePath.close();
        instancePath.moveTo(21.002f, 14.5713f);
        instancePath.lineTo(14.5732f, 21.0f);
        instancePath.lineTo(14.5732f, 15.8574f);
        instancePath.cubicTo(14.5732f, 15.5166f, 14.7083f, 15.1893f, 14.9492f, 14.9482f);
        instancePath.cubicTo(15.1903f, 14.7072f, 15.5175f, 14.5714f, 15.8584f, 14.5713f);
        instancePath.lineTo(21.002f, 14.5713f);
        instancePath.close();
        instancePath.moveTo(8.74902f, 7.31055f);
        instancePath.cubicTo(8.49972f, 7.36017f, 8.27058f, 7.48238f, 8.09082f, 7.66211f);
        instancePath.cubicTo(7.91109f, 7.84184f, 7.78891f, 8.07103f, 7.73926f, 8.32031f);
        instancePath.cubicTo(7.68965f, 8.56972f, 7.71519f, 8.82854f, 7.8125f, 9.06348f);
        instancePath.cubicTo(7.90982f, 9.29835f, 8.07474f, 9.49938f, 8.28613f, 9.64062f);
        instancePath.cubicTo(8.49749f, 9.78174f, 8.74586f, 9.85742f, 9.0f, 9.85742f);
        instancePath.cubicTo(9.34099f, 9.85742f, 9.66806f, 9.72159f, 9.90918f, 9.48047f);
        instancePath.cubicTo(10.1503f, 9.23936f, 10.2861f, 8.91225f, 10.2861f, 8.57129f);
        instancePath.cubicTo(10.2861f, 8.31719f, 10.2104f, 8.06874f, 10.0693f, 7.85742f);
        instancePath.cubicTo(9.9281f, 7.64605f, 9.72703f, 7.48111f, 9.49219f, 7.38379f);
        instancePath.cubicTo(9.25725f, 7.28648f, 8.99843f, 7.26094f, 8.74902f, 7.31055f);
        instancePath.close();
        instancePath.moveTo(14.749f, 7.31055f);
        instancePath.cubicTo(14.4997f, 7.36017f, 14.2706f, 7.48238f, 14.0908f, 7.66211f);
        instancePath.cubicTo(13.9111f, 7.84184f, 13.7889f, 8.07103f, 13.7393f, 8.32031f);
        instancePath.cubicTo(13.6896f, 8.56972f, 13.7152f, 8.82854f, 13.8125f, 9.06348f);
        instancePath.cubicTo(13.9098f, 9.29835f, 14.0747f, 9.49938f, 14.2861f, 9.64062f);
        instancePath.cubicTo(14.4975f, 9.78174f, 14.7459f, 9.85742f, 15.0f, 9.85742f);
        instancePath.cubicTo(15.341f, 9.85742f, 15.6681f, 9.72159f, 15.9092f, 9.48047f);
        instancePath.cubicTo(16.1503f, 9.23936f, 16.2861f, 8.91225f, 16.2861f, 8.57129f);
        instancePath.cubicTo(16.2861f, 8.31719f, 16.2104f, 8.06874f, 16.0693f, 7.85742f);
        instancePath.cubicTo(15.9281f, 7.64605f, 15.727f, 7.48111f, 15.4922f, 7.38379f);
        instancePath.cubicTo(15.2573f, 7.28648f, 14.9984f, 7.26094f, 14.749f, 7.31055f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
