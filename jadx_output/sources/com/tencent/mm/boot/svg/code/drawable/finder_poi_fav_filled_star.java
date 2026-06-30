package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_poi_fav_filled_star extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(35.9998f, 55.4998f);
        instancePath.lineTo(21.9833f, 62.8688f);
        instancePath.cubicTo(20.5167f, 63.6398f, 18.7028f, 63.0759f, 17.9318f, 61.6094f);
        instancePath.cubicTo(17.6248f, 61.0254f, 17.5189f, 60.3565f, 17.6304f, 59.7062f);
        instancePath.lineTo(20.3073f, 44.0986f);
        instancePath.lineTo(8.96773f, 33.0453f);
        instancePath.cubicTo(7.78128f, 31.8888f, 7.75701f, 29.9894f, 8.91351f, 28.803f);
        instancePath.cubicTo(9.37404f, 28.3305f, 9.97746f, 28.0231f, 10.6304f, 27.9282f);
        instancePath.lineTo(26.3013f, 25.6511f);
        instancePath.lineTo(33.3095f, 11.4508f);
        instancePath.cubicTo(34.0428f, 9.96504f, 35.8417f, 9.35503f, 37.3274f, 10.0883f);
        instancePath.cubicTo(37.9191f, 10.3803f, 38.398f, 10.8592f, 38.69f, 11.4508f);
        instancePath.lineTo(45.6982f, 25.6511f);
        instancePath.lineTo(61.3691f, 27.9282f);
        instancePath.cubicTo(63.0088f, 28.1664f, 64.1448f, 29.6888f, 63.9066f, 31.3284f);
        instancePath.cubicTo(63.8117f, 31.9813f, 63.5042f, 32.5847f, 63.0318f, 33.0453f);
        instancePath.lineTo(51.6922f, 44.0986f);
        instancePath.lineTo(54.3691f, 59.7062f);
        instancePath.cubicTo(54.6492f, 61.3392f, 53.5524f, 62.8901f, 51.9194f, 63.1702f);
        instancePath.cubicTo(51.2691f, 63.2817f, 50.6002f, 63.1758f, 50.0162f, 62.8688f);
        instancePath.lineTo(35.9998f, 55.4998f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
