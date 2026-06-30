package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_location_icon_normal extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.195312f, 63.73047f);
            instancePath.cubicTo(36.1875f, 63.722656f, 36.183594f, 63.71875f, 36.17578f, 63.710938f);
            instancePath.close();
            instancePath.moveTo(36.742188f, 62.90625f);
            instancePath.cubicTo(37.44922f, 62.265625f, 38.242188f, 61.523438f, 39.097656f, 60.683594f);
            instancePath.cubicTo(41.55078f, 58.277344f, 44.007812f, 55.601562f, 46.289062f, 52.73047f);
            instancePath.cubicTo(52.40625f, 45.04297f, 56.132812f, 37.460938f, 56.38672f, 30.71875f);
            instancePath.cubicTo(56.39453f, 30.476562f, 56.398438f, 30.238281f, 56.398438f, 30.0f);
            instancePath.cubicTo(56.398438f, 18.734375f, 47.265625f, 9.601562f, 36.0f, 9.601562f);
            instancePath.cubicTo(24.734375f, 9.601562f, 15.601562f, 18.734375f, 15.601562f, 30.0f);
            instancePath.cubicTo(15.601562f, 30.238281f, 15.605469f, 30.476562f, 15.613281f, 30.71875f);
            instancePath.cubicTo(15.867188f, 37.460938f, 19.59375f, 45.04297f, 25.710938f, 52.73047f);
            instancePath.cubicTo(27.992188f, 55.601562f, 30.449219f, 58.277344f, 32.902344f, 60.683594f);
            instancePath.cubicTo(33.757812f, 61.523438f, 34.55078f, 62.265625f, 35.257812f, 62.90625f);
            instancePath.cubicTo(35.589844f, 63.203125f, 35.839844f, 63.42578f, 36.0f, 63.5625f);
            instancePath.cubicTo(36.160156f, 63.42578f, 36.410156f, 63.203125f, 36.742188f, 62.90625f);
            instancePath.close();
            instancePath.moveTo(36.10547f, 63.648438f);
            instancePath.cubicTo(36.07422f, 63.625f, 36.039062f, 63.597656f, 36.0f, 63.5625f);
            instancePath.cubicTo(35.960938f, 63.597656f, 35.92578f, 63.625f, 35.89453f, 63.648438f);
            instancePath.cubicTo(35.945312f, 63.601562f, 36.04297f, 63.601562f, 36.17578f, 63.710938f);
            instancePath.close();
            instancePath.moveTo(33.785156f, 66.40234f);
            instancePath.cubicTo(33.785156f, 66.40234f, 12.0f, 48.054688f, 12.0f, 30.0f);
            instancePath.cubicTo(12.0f, 16.746094f, 22.746094f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(49.253906f, 6.0f, 60.0f, 16.746094f, 60.0f, 30.0f);
            instancePath.cubicTo(60.0f, 48.054688f, 38.214844f, 66.40234f, 38.214844f, 66.40234f);
            instancePath.cubicTo(37.0f, 67.51953f, 35.007812f, 67.50781f, 33.785156f, 66.40234f);
            instancePath.close();
            instancePath.moveTo(33.785156f, 66.40234f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(36.0f, 36.0f);
            instancePath2.cubicTo(39.3125f, 36.0f, 42.0f, 33.3125f, 42.0f, 30.0f);
            instancePath2.cubicTo(42.0f, 26.6875f, 39.3125f, 24.0f, 36.0f, 24.0f);
            instancePath2.cubicTo(32.6875f, 24.0f, 30.0f, 26.6875f, 30.0f, 30.0f);
            instancePath2.cubicTo(30.0f, 33.3125f, 32.6875f, 36.0f, 36.0f, 36.0f);
            instancePath2.close();
            instancePath2.moveTo(36.0f, 39.601562f);
            instancePath2.cubicTo(30.699219f, 39.601562f, 26.398438f, 35.30078f, 26.398438f, 30.0f);
            instancePath2.cubicTo(26.398438f, 24.699219f, 30.699219f, 20.398438f, 36.0f, 20.398438f);
            instancePath2.cubicTo(41.30078f, 20.398438f, 45.601562f, 24.699219f, 45.601562f, 30.0f);
            instancePath2.cubicTo(45.601562f, 35.30078f, 41.30078f, 39.601562f, 36.0f, 39.601562f);
            instancePath2.close();
            instancePath2.moveTo(36.0f, 39.601562f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
