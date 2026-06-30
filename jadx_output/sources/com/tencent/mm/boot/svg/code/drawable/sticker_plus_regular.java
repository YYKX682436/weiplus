package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sticker_plus_regular extends l95.c {
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
                instancePath.moveTo(18.4677f, 12.028f);
                instancePath.cubicTo(18.4891f, 11.7715f, 18.5f, 11.512f, 18.5f, 11.25f);
                instancePath.cubicTo(18.5f, 6.14137f, 14.3586f, 2.0f, 9.25f, 2.0f);
                instancePath.cubicTo(4.14137f, 2.0f, 0.0f, 6.14137f, 0.0f, 11.25f);
                instancePath.cubicTo(0.0f, 16.3586f, 4.14137f, 20.5f, 9.25f, 20.5f);
                instancePath.cubicTo(11.1523f, 20.5f, 12.9206f, 19.9257f, 14.3907f, 18.9411f);
                instancePath.cubicTo(15.1486f, 20.7384f, 16.9269f, 22.0f, 19.0f, 22.0f);
                instancePath.cubicTo(21.7614f, 22.0f, 24.0f, 19.7614f, 24.0f, 17.0f);
                instancePath.cubicTo(24.0f, 14.2386f, 21.7614f, 12.0f, 19.0f, 12.0f);
                instancePath.cubicTo(18.8202f, 12.0f, 18.6426f, 12.0095f, 18.4677f, 12.028f);
                instancePath.close();
                instancePath.moveTo(17.2292f, 12.3227f);
                instancePath.cubicTo(17.2759f, 11.9718f, 17.3f, 11.6137f, 17.3f, 11.25f);
                instancePath.cubicTo(17.3f, 6.80411f, 13.6959f, 3.2f, 9.25f, 3.2f);
                instancePath.cubicTo(4.80411f, 3.2f, 1.2f, 6.80411f, 1.2f, 11.25f);
                instancePath.cubicTo(1.2f, 15.6959f, 4.80411f, 19.3f, 9.25f, 19.3f);
                instancePath.cubicTo(11.049f, 19.3f, 12.7101f, 18.7099f, 14.0504f, 17.7127f);
                instancePath.cubicTo(14.0172f, 17.4799f, 14.0f, 17.242f, 14.0f, 17.0f);
                instancePath.cubicTo(14.0f, 14.8621f, 15.3418f, 13.0376f, 17.2292f, 12.3227f);
                instancePath.close();
                instancePath.moveTo(14.75f, 11.8f);
                instancePath.cubicTo(14.75f, 14.8376f, 12.2876f, 17.3f, 9.25f, 17.3f);
                instancePath.cubicTo(6.28147f, 17.3f, 3.86223f, 14.9482f, 3.75379f, 12.0062f);
                instancePath.lineTo(3.75f, 11.8f);
                instancePath.lineTo(14.75f, 11.8f);
                instancePath.close();
                instancePath.moveTo(13.5107f, 12.9f);
                instancePath.lineTo(4.98938f, 12.9f);
                instancePath.lineTo(4.99974f, 12.943f);
                instancePath.cubicTo(5.48668f, 14.7596f, 7.10683f, 16.1076f, 9.04811f, 16.1954f);
                instancePath.lineTo(9.25005f, 16.2f);
                instancePath.cubicTo(11.2158f, 16.2f, 12.8805f, 14.9109f, 13.4449f, 13.1319f);
                instancePath.lineTo(13.5107f, 12.9f);
                instancePath.close();
                instancePath.moveTo(7.39998f, 8.60001f);
                instancePath.cubicTo(7.39998f, 9.37321f, 6.77317f, 10.0f, 5.99998f, 10.0f);
                instancePath.cubicTo(5.22678f, 10.0f, 4.59998f, 9.37321f, 4.59998f, 8.60001f);
                instancePath.cubicTo(4.59998f, 7.82681f, 5.22678f, 7.20001f, 5.99998f, 7.20001f);
                instancePath.cubicTo(6.77317f, 7.20001f, 7.39998f, 7.82681f, 7.39998f, 8.60001f);
                instancePath.close();
                instancePath.moveTo(12.5f, 10.0f);
                instancePath.cubicTo(13.2732f, 10.0f, 13.9f, 9.37321f, 13.9f, 8.60001f);
                instancePath.cubicTo(13.9f, 7.82681f, 13.2732f, 7.20001f, 12.5f, 7.20001f);
                instancePath.cubicTo(11.7268f, 7.20001f, 11.1f, 7.82681f, 11.1f, 8.60001f);
                instancePath.cubicTo(11.1f, 9.37321f, 11.7268f, 10.0f, 12.5f, 10.0f);
                instancePath.close();
                instancePath.moveTo(19.0f, 20.8f);
                instancePath.cubicTo(21.0987f, 20.8f, 22.8f, 19.0987f, 22.8f, 17.0f);
                instancePath.cubicTo(22.8f, 14.9013f, 21.0987f, 13.2f, 19.0f, 13.2f);
                instancePath.cubicTo(16.9013f, 13.2f, 15.2f, 14.9013f, 15.2f, 17.0f);
                instancePath.cubicTo(15.2f, 19.0987f, 16.9013f, 20.8f, 19.0f, 20.8f);
                instancePath.close();
                instancePath.moveTo(19.564f, 14.35f);
                instancePath.lineTo(18.364f, 14.35f);
                instancePath.lineTo(18.364f, 16.3545f);
                instancePath.lineTo(16.34f, 16.3545f);
                instancePath.lineTo(16.34f, 17.5545f);
                instancePath.lineTo(18.364f, 17.5545f);
                instancePath.lineTo(18.364f, 19.625f);
                instancePath.lineTo(19.564f, 19.625f);
                instancePath.lineTo(19.564f, 17.5545f);
                instancePath.lineTo(21.6646f, 17.5545f);
                instancePath.lineTo(21.6646f, 16.3545f);
                instancePath.lineTo(19.564f, 16.3545f);
                instancePath.lineTo(19.564f, 14.35f);
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
