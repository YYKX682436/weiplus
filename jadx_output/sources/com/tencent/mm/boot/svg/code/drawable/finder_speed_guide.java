package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_speed_guide extends l95.c {
    private final int width = 91;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 91;
        }
        if (i17 == 1) {
            return 96;
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
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(32.3575f, 58.2393f);
            instancePath.lineTo(20.2149f, 22.4082f);
            instancePath.cubicTo(18.9422f, 18.6526f, 20.8247f, 14.5569f, 24.5037f, 13.0774f);
            instancePath.cubicTo(28.2111f, 11.5864f, 32.4353f, 13.2761f, 34.0917f, 16.9125f);
            instancePath.lineTo(42.3406f, 35.0218f);
            instancePath.lineTo(60.1161f, 33.2356f);
            instancePath.cubicTo(70.1537f, 32.2269f, 79.0603f, 39.6633f, 79.8593f, 49.7197f);
            instancePath.lineTo(81.7014f, 72.905f);
            instancePath.cubicTo(82.007f, 76.7511f, 79.5239f, 80.2674f, 75.7971f, 81.266f);
            instancePath.lineTo(47.3008f, 88.9016f);
            instancePath.cubicTo(46.0981f, 89.2238f, 44.8139f, 88.9608f, 43.8347f, 88.1917f);
            instancePath.lineTo(17.0914f, 67.1848f);
            instancePath.cubicTo(14.4019f, 65.0722f, 13.5497f, 61.37f, 15.045f, 58.2942f);
            instancePath.cubicTo(16.7478f, 54.7914f, 20.9097f, 53.2542f, 24.4806f, 54.8092f);
            instancePath.lineTo(32.3575f, 58.2393f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
