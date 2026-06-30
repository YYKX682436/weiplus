package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class gift_effect_on_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePath.moveTo(19.029f, 15.9995f);
                instancePath.lineTo(19.7862f, 18.2133f);
                instancePath.lineTo(22.0f, 18.9705f);
                instancePath.lineTo(19.7862f, 19.7278f);
                instancePath.lineTo(19.029f, 21.9995f);
                instancePath.lineTo(18.2717f, 19.7278f);
                instancePath.lineTo(16.0f, 18.9705f);
                instancePath.lineTo(18.2717f, 18.2133f);
                instancePath.lineTo(19.029f, 15.9995f);
                instancePath.close();
                instancePath.moveTo(9.89283f, 12.6925f);
                instancePath.lineTo(11.3072f, 14.1066f);
                instancePath.lineTo(3.70851f, 21.7066f);
                instancePath.lineTo(2.29417f, 20.2925f);
                instancePath.lineTo(9.89283f, 12.6925f);
                instancePath.close();
                instancePath.moveTo(12.1436f, 0.995726f);
                instancePath.lineTo(12.2258f, 1.04802f);
                instancePath.lineTo(16.1624f, 4.00102f);
                instancePath.lineTo(20.7618f, 2.48031f);
                instancePath.cubicTo(21.23f, 2.32545f, 21.6747f, 2.77018f, 21.5199f, 3.23838f);
                instancePath.lineTo(19.9984f, 7.83708f);
                instancePath.lineTo(22.9522f, 11.7744f);
                instancePath.cubicTo(23.2326f, 12.1482f, 22.9959f, 12.6702f, 22.5562f, 12.7291f);
                instancePath.lineTo(22.4589f, 12.7344f);
                instancePath.lineTo(17.5915f, 12.6256f);
                instancePath.lineTo(14.8193f, 16.572f);
                instancePath.cubicTo(14.552f, 16.9525f, 13.9846f, 16.8921f, 13.7904f, 16.4937f);
                instancePath.lineTo(13.7568f, 16.4096f);
                instancePath.lineTo(12.2641f, 11.7346f);
                instancePath.lineTo(7.59059f, 10.2434f);
                instancePath.cubicTo(7.14758f, 10.1019f, 7.03575f, 9.54245f, 7.35795f, 9.23813f);
                instancePath.lineTo(7.42821f, 9.18087f);
                instancePath.lineTo(11.3739f, 6.40801f);
                instancePath.lineTo(11.2658f, 1.54124f);
                instancePath.cubicTo(11.2554f, 1.07408f, 11.7518f, 0.787545f, 12.1436f, 0.995726f);
                instancePath.close();
                instancePath.moveTo(4.03913f, 1.99952f);
                instancePath.lineTo(4.50863f, 3.49089f);
                instancePath.lineTo(6.0f, 4.03864f);
                instancePath.lineTo(4.50863f, 4.50815f);
                instancePath.lineTo(4.03913f, 5.99952f);
                instancePath.lineTo(3.49137f, 4.50815f);
                instancePath.lineTo(2.0f, 4.03864f);
                instancePath.lineTo(3.49137f, 3.49089f);
                instancePath.lineTo(4.03913f, 1.99952f);
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
