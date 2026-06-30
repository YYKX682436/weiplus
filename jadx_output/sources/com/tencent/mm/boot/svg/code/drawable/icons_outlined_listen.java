package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_listen extends l95.c {
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
                instancePath.moveTo(13.8153f, 36.8019f);
                instancePath.cubicTo(13.9675f, 31.3275f, 15.4362f, 26.3175f, 17.9426f, 22.2791f);
                instancePath.cubicTo(21.7732f, 16.1072f, 28.0453f, 12.1499f, 36.0024f, 12.1499f);
                instancePath.cubicTo(44.0208f, 12.1499f, 50.2747f, 15.8018f, 54.074f, 21.7579f);
                instancePath.cubicTo(56.6396f, 25.78f, 58.1256f, 30.9232f, 58.1998f, 36.8054f);
                instancePath.cubicTo(57.4039f, 36.3172f, 56.4919f, 35.9871f, 55.5007f, 35.8653f);
                instancePath.cubicTo(51.9698f, 35.4318f, 48.7103f, 37.8184f, 48.0573f, 41.3155f);
                instancePath.lineTo(46.1215f, 51.6831f);
                instancePath.cubicTo(45.4082f, 55.5031f, 48.0659f, 59.1327f, 51.9229f, 59.6063f);
                instancePath.cubicTo(55.4538f, 60.0398f, 58.7133f, 57.6532f, 59.3663f, 54.1562f);
                instancePath.lineTo(60.754f, 46.7239f);
                instancePath.lineTo(60.7663f, 46.7265f);
                instancePath.cubicTo(60.9778f, 45.7381f, 61.1562f, 44.7581f, 61.3022f, 43.7879f);
                instancePath.cubicTo(61.3371f, 43.6009f, 61.3639f, 43.4144f, 61.3829f, 43.2287f);
                instancePath.cubicTo(62.634f, 34.1735f, 61.0476f, 25.9962f, 57.1091f, 19.8219f);
                instancePath.cubicTo(52.6414f, 12.818f, 45.2369f, 8.54993f, 36.0024f, 8.54993f);
                instancePath.cubicTo(26.7066f, 8.54993f, 19.3203f, 13.2326f, 14.8838f, 20.3807f);
                instancePath.cubicTo(10.4739f, 27.4861f, 8.99795f, 36.9708f, 11.2376f, 46.724f);
                instancePath.lineTo(12.6272f, 54.1659f);
                instancePath.cubicTo(13.2801f, 57.6629f, 16.5396f, 60.0495f, 20.0706f, 59.616f);
                instancePath.cubicTo(23.9276f, 59.1424f, 26.5852f, 55.5128f, 25.872f, 51.6928f);
                instancePath.lineTo(23.9361f, 41.3252f);
                instancePath.cubicTo(23.2832f, 37.8281f, 20.0237f, 35.4415f, 16.4927f, 35.875f);
                instancePath.cubicTo(15.5105f, 35.9956f, 14.6061f, 36.3209f, 13.8153f, 36.8019f);
                instancePath.close();
                instancePath.moveTo(57.8053f, 42.8212f);
                instancePath.cubicTo(57.7883f, 42.9419f, 57.7708f, 43.0628f, 57.7528f, 43.1839f);
                instancePath.lineTo(55.8274f, 53.4954f);
                instancePath.cubicTo(55.5234f, 55.1237f, 54.0057f, 56.235f, 52.3616f, 56.0331f);
                instancePath.cubicTo(50.5657f, 55.8126f, 49.3282f, 54.1225f, 49.6603f, 52.3439f);
                instancePath.lineTo(51.5961f, 41.9762f);
                instancePath.cubicTo(51.9002f, 40.3479f, 53.4179f, 39.2366f, 55.062f, 39.4385f);
                instancePath.cubicTo(56.7543f, 39.6463f, 57.9508f, 41.159f, 57.8053f, 42.8212f);
                instancePath.close();
                instancePath.moveTo(20.3973f, 41.9859f);
                instancePath.lineTo(22.3331f, 52.3536f);
                instancePath.cubicTo(22.6652f, 54.1322f, 21.4278f, 55.8223f, 19.6319f, 56.0428f);
                instancePath.cubicTo(17.9877f, 56.2447f, 16.47f, 55.1334f, 16.166f, 53.5051f);
                instancePath.lineTo(14.2302f, 43.1374f);
                instancePath.cubicTo(13.8981f, 41.3588f, 15.1355f, 39.6687f, 16.9315f, 39.4482f);
                instancePath.cubicTo(18.5756f, 39.2463f, 20.0933f, 40.3576f, 20.3973f, 41.9859f);
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
