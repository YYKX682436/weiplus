package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_gobackward_10 extends l95.c {
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
                instancePaint3.setColor(-16777216);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(41.2481f, 4.47824f);
                instancePath.cubicTo(41.4142f, 4.72554f, 41.5029f, 5.0167f, 41.5029f, 5.31461f);
                instancePath.lineTo(41.5034f, 10.2952f);
                instancePath.cubicTo(54.1945f, 12.8472f, 63.7529f, 24.0574f, 63.7529f, 37.5001f);
                instancePath.cubicTo(63.7529f, 52.826f, 51.3288f, 65.2501f, 36.0029f, 65.2501f);
                instancePath.cubicTo(20.677f, 65.2501f, 8.25293f, 52.826f, 8.25293f, 37.5001f);
                instancePath.cubicTo(8.25293f, 29.6206f, 11.5574f, 22.2665f, 17.2507f, 17.0447f);
                instancePath.cubicTo(18.1665f, 16.2047f, 19.5898f, 16.2662f, 20.4297f, 17.182f);
                instancePath.cubicTo(21.2697f, 18.0978f, 21.2082f, 19.5211f, 20.2924f, 20.361f);
                instancePath.cubicTo(15.5189f, 24.7392f, 12.7529f, 30.8949f, 12.7529f, 37.5001f);
                instancePath.cubicTo(12.7529f, 50.3407f, 23.1623f, 60.7501f, 36.0029f, 60.7501f);
                instancePath.cubicTo(48.8435f, 60.7501f, 59.2529f, 50.3407f, 59.2529f, 37.5001f);
                instancePath.cubicTo(59.2529f, 26.5545f, 51.6892f, 17.3754f, 41.5033f, 14.9046f);
                instancePath.lineTo(41.5029f, 20.6856f);
                instancePath.cubicTo(41.5029f, 21.5141f, 40.8314f, 22.1856f, 40.0029f, 22.1856f);
                instancePath.cubicTo(39.705f, 22.1856f, 39.4139f, 22.0969f, 39.1666f, 21.9308f);
                instancePath.lineTo(27.7244f, 14.2453f);
                instancePath.cubicTo(27.0367f, 13.7834f, 26.8537f, 12.8514f, 27.3156f, 12.1637f);
                instancePath.cubicTo(27.4241f, 12.0023f, 27.5629f, 11.8634f, 27.7244f, 11.7549f);
                instancePath.lineTo(39.1666f, 4.06942f);
                instancePath.cubicTo(39.8543f, 3.60751f, 40.7862f, 3.79054f, 41.2481f, 4.47824f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(29.1722f, 26.8107f);
                instancePath2.cubicTo(29.8453f, 27.1792f, 30.2638f, 27.8855f, 30.2638f, 28.6528f);
                instancePath2.lineTo(30.2638f, 46.5805f);
                instancePath2.cubicTo(30.2638f, 47.7403f, 29.3236f, 48.6805f, 28.1638f, 48.6805f);
                instancePath2.cubicTo(27.004f, 48.6805f, 26.0638f, 47.7403f, 26.0638f, 46.5805f);
                instancePath2.lineTo(26.0638f, 32.489f);
                instancePath2.lineTo(23.4968f, 34.131f);
                instancePath2.cubicTo(22.5198f, 34.756f, 21.2212f, 34.4706f, 20.5962f, 33.4936f);
                instancePath2.cubicTo(19.9712f, 32.5166f, 20.2566f, 31.2179f, 21.2336f, 30.5929f);
                instancePath2.lineTo(27.0322f, 26.8838f);
                instancePath2.cubicTo(27.6786f, 26.4703f, 28.4991f, 26.4423f, 29.1722f, 26.8107f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(40.4191f, 31.7949f);
                instancePath3.cubicTo(39.4914f, 33.1451f, 38.859f, 35.1103f, 38.859f, 37.3709f);
                instancePath3.cubicTo(38.859f, 39.6315f, 39.4914f, 41.5967f, 40.4191f, 42.9469f);
                instancePath3.cubicTo(41.3494f, 44.3008f, 42.4655f, 44.9096f, 43.5029f, 44.9096f);
                instancePath3.cubicTo(44.5404f, 44.9096f, 45.6565f, 44.3008f, 46.5868f, 42.9469f);
                instancePath3.cubicTo(47.5144f, 41.5967f, 48.1468f, 39.6315f, 48.1468f, 37.3709f);
                instancePath3.cubicTo(48.1468f, 35.1103f, 47.5144f, 33.1451f, 46.5868f, 31.7949f);
                instancePath3.cubicTo(45.6565f, 30.441f, 44.5404f, 29.8322f, 43.5029f, 29.8322f);
                instancePath3.cubicTo(42.4655f, 29.8322f, 41.3494f, 30.441f, 40.4191f, 31.7949f);
                instancePath3.close();
                instancePath3.moveTo(37.3676f, 29.5288f);
                instancePath3.cubicTo(38.7968f, 27.4488f, 40.9401f, 25.9336f, 43.5029f, 25.9336f);
                instancePath3.cubicTo(46.0658f, 25.9336f, 48.2091f, 27.4488f, 49.6382f, 29.5288f);
                instancePath3.cubicTo(51.0699f, 31.6126f, 51.8968f, 34.3914f, 51.8968f, 37.3709f);
                instancePath3.cubicTo(51.8968f, 40.3504f, 51.0699f, 43.1292f, 49.6382f, 45.213f);
                instancePath3.cubicTo(48.2091f, 47.293f, 46.0658f, 48.8082f, 43.5029f, 48.8082f);
                instancePath3.cubicTo(40.9401f, 48.8082f, 38.7968f, 47.293f, 37.3676f, 45.213f);
                instancePath3.cubicTo(35.9359f, 43.1292f, 35.109f, 40.3504f, 35.109f, 37.3709f);
                instancePath3.cubicTo(35.109f, 34.3914f, 35.9359f, 31.6126f, 37.3676f, 29.5288f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
