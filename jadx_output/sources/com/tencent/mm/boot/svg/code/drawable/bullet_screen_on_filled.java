package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bullet_screen_on_filled extends l95.c {
    private final int width = 72;
    private final int height = 73;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 72;
        }
        if (i17 == 1) {
            return 73;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(32.31f, 9.02557f);
        instancePath.lineTo(37.3367f, 18.1649f);
        instancePath.lineTo(40.3879f, 18.1649f);
        instancePath.lineTo(45.4146f, 9.02557f);
        instancePath.lineTo(50.6719f, 11.9171f);
        instancePath.lineTo(47.2356f, 18.1649f);
        instancePath.lineTo(49.5706f, 18.1649f);
        instancePath.cubicTo(51.9916f, 18.1649f, 53.9542f, 20.1276f, 53.9542f, 22.5486f);
        instancePath.lineTo(53.9542f, 36.5114f);
        instancePath.cubicTo(50.1582f, 37.5561f, 46.8908f, 39.8766f, 44.642f, 42.9828f);
        instancePath.lineTo(41.8594f, 42.9828f);
        instancePath.lineTo(41.8594f, 46.3917f);
        instancePath.lineTo(42.726f, 46.3917f);
        instancePath.cubicTo(41.8734f, 48.4247f, 41.4023f, 50.6573f, 41.4023f, 53.0f);
        instancePath.cubicTo(41.4023f, 54.3573f, 41.5605f, 55.6777f, 41.8594f, 56.9438f);
        instancePath.lineTo(41.8594f, 60.1424f);
        instancePath.lineTo(35.8594f, 60.1446f);
        instancePath.lineTo(35.8594f, 52.3917f);
        instancePath.lineTo(24.0703f, 52.3917f);
        instancePath.lineTo(24.0703f, 46.3917f);
        instancePath.lineTo(35.8594f, 46.3917f);
        instancePath.lineTo(35.8594f, 42.9828f);
        instancePath.lineTo(28.1434f, 42.9828f);
        instancePath.cubicTo(25.7224f, 42.9828f, 23.7598f, 41.0202f, 23.7598f, 38.5992f);
        instancePath.lineTo(23.7598f, 22.5486f);
        instancePath.cubicTo(23.7598f, 20.1275f, 25.7224f, 18.1649f, 28.1434f, 18.1649f);
        instancePath.lineTo(30.489f, 18.1649f);
        instancePath.lineTo(27.0527f, 11.9171f);
        instancePath.lineTo(32.31f, 9.02557f);
        instancePath.close();
        instancePath.moveTo(41.8594f, 36.9828f);
        instancePath.lineTo(47.9542f, 36.9828f);
        instancePath.lineTo(47.9542f, 33.5738f);
        instancePath.lineTo(41.8594f, 33.5738f);
        instancePath.lineTo(41.8594f, 36.9828f);
        instancePath.close();
        instancePath.moveTo(35.8594f, 33.5738f);
        instancePath.lineTo(35.8594f, 36.9828f);
        instancePath.lineTo(29.7598f, 36.9828f);
        instancePath.lineTo(29.7598f, 33.5738f);
        instancePath.lineTo(35.8594f, 33.5738f);
        instancePath.close();
        instancePath.moveTo(41.8594f, 27.5738f);
        instancePath.lineTo(47.9542f, 27.5738f);
        instancePath.lineTo(47.9542f, 24.1649f);
        instancePath.lineTo(41.8594f, 24.1649f);
        instancePath.lineTo(41.8594f, 27.5738f);
        instancePath.close();
        instancePath.moveTo(35.8594f, 24.1649f);
        instancePath.lineTo(35.8594f, 27.5738f);
        instancePath.lineTo(29.7598f, 27.5738f);
        instancePath.lineTo(29.7598f, 24.1649f);
        instancePath.lineTo(35.8594f, 24.1649f);
        instancePath.close();
        instancePath.moveTo(6.59926f, 19.9751f);
        instancePath.lineTo(6.59926f, 13.9751f);
        instancePath.lineTo(15.7215f, 13.9751f);
        instancePath.cubicTo(18.9101f, 13.9751f, 21.4865f, 16.5606f, 21.4865f, 19.7424f);
        instancePath.lineTo(21.4865f, 26.1893f);
        instancePath.cubicTo(21.4865f, 29.3745f, 18.9043f, 31.9566f, 15.7191f, 31.9566f);
        instancePath.lineTo(11.209f, 31.9566f);
        instancePath.lineTo(11.209f, 36.9827f);
        instancePath.lineTo(15.7191f, 36.9827f);
        instancePath.cubicTo(18.9043f, 36.9827f, 21.4865f, 39.5649f, 21.4865f, 42.7501f);
        instancePath.lineTo(21.4865f, 49.1545f);
        instancePath.cubicTo(21.4865f, 55.3964f, 16.4264f, 60.4565f, 10.1844f, 60.4565f);
        instancePath.lineTo(6.59926f, 60.4565f);
        instancePath.lineTo(6.59926f, 54.4565f);
        instancePath.lineTo(10.1844f, 54.4565f);
        instancePath.cubicTo(13.1127f, 54.4565f, 15.4865f, 52.0827f, 15.4865f, 49.1545f);
        instancePath.lineTo(15.4865f, 42.9827f);
        instancePath.lineTo(10.9763f, 42.9827f);
        instancePath.cubicTo(7.79111f, 42.9827f, 5.20898f, 40.4006f, 5.20898f, 37.2154f);
        instancePath.lineTo(5.20898f, 31.7239f);
        instancePath.cubicTo(5.20898f, 28.5387f, 7.79111f, 25.9566f, 10.9763f, 25.9566f);
        instancePath.lineTo(15.4865f, 25.9566f);
        instancePath.lineTo(15.4865f, 19.9751f);
        instancePath.lineTo(6.59926f, 19.9751f);
        instancePath.close();
        instancePath.moveTo(72.0f, 53.0f);
        instancePath.cubicTo(72.0f, 60.4558f, 65.9558f, 66.5f, 58.5f, 66.5f);
        instancePath.cubicTo(51.0442f, 66.5f, 45.0f, 60.4558f, 45.0f, 53.0f);
        instancePath.cubicTo(45.0f, 45.5442f, 51.0442f, 39.5f, 58.5f, 39.5f);
        instancePath.cubicTo(65.9558f, 39.5f, 72.0f, 45.5442f, 72.0f, 53.0f);
        instancePath.close();
        instancePath.moveTo(68.2359f, 48.2847f);
        instancePath.lineTo(68.2377f, 48.2827f);
        instancePath.lineTo(65.584f, 45.8501f);
        instancePath.lineTo(65.5821f, 45.8521f);
        instancePath.lineTo(65.2482f, 45.5461f);
        instancePath.lineTo(56.0851f, 55.5422f);
        instancePath.lineTo(51.8034f, 50.5468f);
        instancePath.lineTo(48.3867f, 53.4754f);
        instancePath.lineTo(54.1182f, 60.1621f);
        instancePath.cubicTo(55.104f, 61.3122f, 56.8735f, 61.3416f, 57.8971f, 60.225f);
        instancePath.lineTo(68.5654f, 48.5868f);
        instancePath.lineTo(68.2359f, 48.2847f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
