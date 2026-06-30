package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_full_share_outlined extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(72.0f, 0.0f);
                instancePath.lineTo(72.0f, 72.0f);
                instancePath.lineTo(0.0f, 72.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(39.011105f, 8.994088f);
                instancePath2.cubicTo(39.8018f, 8.994088f, 40.560524f, 9.306245f, 41.122288f, 9.862679f);
                instancePath2.lineTo(62.636173f, 31.172398f);
                instancePath2.cubicTo(63.722767f, 32.248684f, 63.814068f, 33.94996f, 62.904613f, 35.131184f);
                instancePath2.lineTo(62.636173f, 35.43522f);
                instancePath2.lineTo(41.122288f, 56.744938f);
                instancePath2.cubicTo(39.94514f, 57.91091f, 38.04567f, 57.901855f, 36.879696f, 56.724712f);
                instancePath2.cubicTo(36.32326f, 56.162945f, 36.011105f, 55.404224f, 36.011105f, 54.61353f);
                instancePath2.lineTo(36.011105f, 44.764744f);
                instancePath2.cubicTo(28.995237f, 45.32863f, 18.754921f, 49.474026f, 13.427593f, 62.465485f);
                instancePath2.cubicTo(12.542523f, 64.623856f, 10.371325f, 64.60521f, 9.898796f, 61.807617f);
                instancePath2.cubicTo(6.1593475f, 39.6683f, 18.754921f, 24.644394f, 36.011105f, 21.925137f);
                instancePath2.lineTo(36.011105f, 11.994088f);
                instancePath2.cubicTo(36.011105f, 10.337234f, 37.35425f, 8.994088f, 39.011105f, 8.994088f);
                instancePath2.close();
                instancePath2.moveTo(39.609f, 13.434f);
                instancePath2.lineTo(39.611103f, 25.002266f);
                instancePath2.lineTo(36.571484f, 25.481255f);
                instancePath2.cubicTo(22.094788f, 27.762516f, 12.642968f, 39.040146f, 12.850238f, 54.758244f);
                instancePath2.lineTo(12.87f, 55.62f);
                instancePath2.lineTo(12.945931f, 55.49552f);
                instancePath2.cubicTo(18.267673f, 46.925255f, 26.308218f, 42.200375f, 34.86534f, 41.25795f);
                instancePath2.lineTo(35.722694f, 41.176315f);
                instancePath2.lineTo(39.611103f, 40.863792f);
                instancePath2.lineTo(39.609f, 53.172f);
                instancePath2.lineTo(59.673f, 33.303f);
                instancePath2.lineTo(39.609f, 13.434f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
