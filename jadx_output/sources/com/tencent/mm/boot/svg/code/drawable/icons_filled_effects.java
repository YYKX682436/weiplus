package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_effects extends l95.c {
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
            instancePath.moveTo(6.261719f, 39.98828f);
            instancePath.cubicTo(8.164062f, 41.523438f, 10.117188f, 42.546875f, 12.289062f, 43.07422f);
            instancePath.lineTo(13.113281f, 43.25f);
            instancePath.lineTo(13.316406f, 43.85547f);
            instancePath.cubicTo(16.570312f, 53.253906f, 25.496094f, 60.0f, 36.0f, 60.0f);
            instancePath.cubicTo(46.73047f, 60.0f, 55.816406f, 52.960938f, 58.88672f, 43.246094f);
            instancePath.cubicTo(61.39453f, 42.796875f, 63.59375f, 41.71875f, 65.734375f, 39.996094f);
            instancePath.cubicTo(63.785156f, 54.671875f, 51.214844f, 66.0f, 36.0f, 66.0f);
            instancePath.cubicTo(20.785156f, 66.0f, 8.214844f, 54.671875f, 6.261719f, 39.98828f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.597656f);
            instancePath.cubicTo(39.984375f, 39.597656f, 43.76172f, 39.910156f, 47.335938f, 40.54297f);
            instancePath.cubicTo(47.335938f, 46.648438f, 42.26172f, 51.601562f, 36.0f, 51.601562f);
            instancePath.cubicTo(29.738281f, 51.601562f, 24.664062f, 46.648438f, 24.664062f, 40.54297f);
            instancePath.cubicTo(28.238281f, 39.910156f, 32.015625f, 39.597656f, 36.0f, 39.597656f);
            instancePath.close();
            instancePath.moveTo(64.89453f, 18.898438f);
            instancePath.lineTo(66.21484f, 19.191406f);
            instancePath.cubicTo(68.05078f, 19.675781f, 69.19141f, 21.46875f, 68.90234f, 23.304688f);
            instancePath.lineTo(68.82422f, 23.671875f);
            instancePath.lineTo(68.5625f, 24.648438f);
            instancePath.cubicTo(66.90234f, 30.710938f, 65.20703f, 34.496094f, 63.48047f, 36.01172f);
            instancePath.cubicTo(60.17578f, 38.910156f, 56.902344f, 39.964844f, 49.683594f, 37.98828f);
            instancePath.cubicTo(45.121094f, 36.73828f, 41.84375f, 33.871094f, 39.85547f, 29.378906f);
            instancePath.lineTo(39.535156f, 28.613281f);
            instancePath.lineTo(32.464844f, 28.613281f);
            instancePath.cubicTo(30.515625f, 33.546875f, 27.132812f, 36.671875f, 22.316406f, 37.98828f);
            instancePath.cubicTo(15.097656f, 39.964844f, 11.824219f, 38.910156f, 8.519531f, 36.01172f);
            instancePath.cubicTo(6.792969f, 34.496094f, 5.097656f, 30.710938f, 3.4375f, 24.648438f);
            instancePath.lineTo(3.175781f, 23.671875f);
            instancePath.cubicTo(2.691406f, 21.835938f, 3.6875f, 19.957031f, 5.429688f, 19.304688f);
            instancePath.lineTo(5.875f, 19.171875f);
            instancePath.cubicTo(13.625f, 17.320312f, 22.492188f, 17.664062f, 32.464844f, 20.199219f);
            instancePath.lineTo(33.078125f, 20.269531f);
            instancePath.cubicTo(33.195312f, 20.28125f, 33.320312f, 20.289062f, 33.453125f, 20.300781f);
            instancePath.lineTo(34.335938f, 20.34375f);
            instancePath.lineTo(35.402344f, 20.371094f);
            instancePath.lineTo(36.0f, 20.375f);
            instancePath.lineTo(37.152344f, 20.359375f);
            instancePath.lineTo(38.128906f, 20.324219f);
            instancePath.cubicTo(38.273438f, 20.316406f, 38.414062f, 20.308594f, 38.546875f, 20.300781f);
            instancePath.lineTo(39.25f, 20.238281f);
            instancePath.cubicTo(39.351562f, 20.226562f, 39.445312f, 20.210938f, 39.535156f, 20.199219f);
            instancePath.cubicTo(48.984375f, 17.796875f, 57.4375f, 17.363281f, 64.89453f, 18.898438f);
            instancePath.close();
            instancePath.moveTo(36.0f, 6.0f);
            instancePath.cubicTo(43.609375f, 6.0f, 50.558594f, 8.832031f, 55.847656f, 13.503906f);
            instancePath.cubicTo(52.734375f, 13.492188f, 49.507812f, 13.746094f, 46.16797f, 14.253906f);
            instancePath.cubicTo(43.08203f, 12.808594f, 39.63672f, 12.0f, 36.0f, 12.0f);
            instancePath.cubicTo(32.367188f, 12.0f, 28.921875f, 12.808594f, 25.835938f, 14.253906f);
            instancePath.cubicTo(22.488281f, 13.746094f, 19.261719f, 13.492188f, 16.148438f, 13.5f);
            instancePath.cubicTo(21.4375f, 8.835938f, 28.390625f, 6.0f, 36.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 6.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
