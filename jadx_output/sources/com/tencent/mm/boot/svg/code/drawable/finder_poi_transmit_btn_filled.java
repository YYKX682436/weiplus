package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_poi_transmit_btn_filled extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(41.1222f, 9.86273f);
                instancePath.lineTo(62.6361f, 31.1724f);
                instancePath.cubicTo(63.7227f, 32.2487f, 63.814f, 33.95f, 62.9046f, 35.1312f);
                instancePath.lineTo(62.6361f, 35.4353f);
                instancePath.lineTo(62.6361f, 35.4353f);
                instancePath.lineTo(41.1222f, 56.745f);
                instancePath.cubicTo(39.9451f, 57.911f, 38.0456f, 57.9019f, 36.8796f, 56.7248f);
                instancePath.cubicTo(36.3232f, 56.163f, 36.0111f, 55.4043f, 36.0111f, 54.6136f);
                instancePath.lineTo(36.0111f, 44.7648f);
                instancePath.lineTo(36.0111f, 44.7648f);
                instancePath.cubicTo(28.9952f, 45.3287f, 18.7549f, 49.4741f, 13.4275f, 62.4655f);
                instancePath.cubicTo(12.5425f, 64.6239f, 10.3713f, 64.6053f, 9.89875f, 61.8077f);
                instancePath.cubicTo(6.1593f, 39.6684f, 18.7549f, 24.6444f, 36.0111f, 21.9252f);
                instancePath.lineTo(36.0111f, 11.9941f);
                instancePath.cubicTo(36.0111f, 10.3373f, 37.3542f, 8.99414f, 39.0111f, 8.99414f);
                instancePath.cubicTo(39.8017f, 8.99414f, 40.5605f, 9.3063f, 41.1222f, 9.86273f);
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
