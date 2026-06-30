package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_newlifeshare extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 90;
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(45.0139f, 27.4065f);
                instancePath.cubicTo(24.0616f, 30.7082f, 8.60605f, 48.522f, 12.0217f, 74.9032f);
                instancePath.cubicTo(12.0388f, 75.0351f, 12.0563f, 75.1672f, 12.0743f, 75.2995f);
                instancePath.cubicTo(12.1152f, 75.5998f, 12.1586f, 75.9013f, 12.2044f, 76.2038f);
                instancePath.cubicTo(12.2574f, 76.5543f, 12.3138f, 76.9062f, 12.3735f, 77.2596f);
                instancePath.cubicTo(12.9641f, 80.7566f, 15.6781f, 80.7799f, 16.7845f, 78.0819f);
                instancePath.cubicTo(17.0214f, 77.5043f, 17.266f, 76.9406f, 17.518f, 76.3907f);
                instancePath.cubicTo(17.5827f, 76.2494f, 17.6479f, 76.1091f, 17.7135f, 75.9696f);
                instancePath.cubicTo(17.7502f, 75.8917f, 17.7871f, 75.8141f, 17.824f, 75.7367f);
                instancePath.cubicTo(23.2692f, 64.3484f, 31.8965f, 59.0198f, 39.3889f, 56.958f);
                instancePath.cubicTo(41.3698f, 56.4128f, 43.2714f, 56.096f, 45.0139f, 55.956f);
                instancePath.lineTo(45.0139f, 68.267f);
                instancePath.cubicTo(45.0139f, 69.2553f, 45.4041f, 70.2037f, 46.0996f, 70.906f);
                instancePath.cubicTo(47.5571f, 72.3774f, 49.9314f, 72.3887f, 51.4029f, 70.9312f);
                instancePath.lineTo(78.2952f, 44.2941f);
                instancePath.lineTo(78.6308f, 43.914f);
                instancePath.cubicTo(79.7676f, 42.4375f, 79.6535f, 40.3109f, 78.2952f, 38.9656f);
                instancePath.lineTo(51.4029f, 12.3284f);
                instancePath.cubicTo(50.7007f, 11.6329f, 49.7522f, 11.2427f, 48.7639f, 11.2427f);
                instancePath.cubicTo(46.6928f, 11.2427f, 45.0139f, 12.9216f, 45.0139f, 14.9927f);
                instancePath.lineTo(45.0139f, 27.4065f);
                instancePath.close();
                instancePath.moveTo(72.9918f, 41.6298f);
                instancePath.lineTo(50.6389f, 63.7707f);
                instancePath.lineTo(50.6389f, 49.8608f);
                instancePath.lineTo(44.5632f, 50.3491f);
                instancePath.cubicTo(36.2742f, 51.0153f, 25.2298f, 55.0377f, 17.2101f, 65.8548f);
                instancePath.cubicTo(17.5319f, 58.0589f, 19.8646f, 51.5559f, 23.4494f, 46.471f);
                instancePath.cubicTo(28.5538f, 39.2304f, 36.4878f, 34.4445f, 45.8895f, 32.9629f);
                instancePath.lineTo(50.6389f, 32.2145f);
                instancePath.lineTo(50.6389f, 19.489f);
                instancePath.lineTo(72.9918f, 41.6298f);
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
