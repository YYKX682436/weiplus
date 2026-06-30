package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_cart_icon extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePath.moveTo(3.22882f, 5.28054f);
                instancePath.lineTo(2.80389f, 3.46605f);
                instancePath.lineTo(1.28901f, 3.33138f);
                instancePath.cubicTo(1.01395f, 3.30693f, 0.810796f, 3.06413f, 0.835247f, 2.78907f);
                instancePath.cubicTo(0.859698f, 2.51401f, 1.1025f, 2.31086f, 1.37756f, 2.33531f);
                instancePath.lineTo(2.95246f, 2.47531f);
                instancePath.cubicTo(3.34649f, 2.51034f, 3.67361f, 2.79419f, 3.76381f, 3.17936f);
                instancePath.lineTo(4.03817f, 4.35088f);
                instancePath.cubicTo(4.04882f, 4.35066f, 4.05952f, 4.35063f, 4.07028f, 4.3508f);
                instancePath.lineTo(17.3589f, 4.56746f);
                instancePath.cubicTo(17.8706f, 4.5758f, 18.254f, 5.03921f, 18.1663f, 5.54346f);
                instancePath.lineTo(16.7823f, 13.5017f);
                instancePath.cubicTo(16.7148f, 13.8894f, 16.3854f, 14.1771f, 15.9921f, 14.1917f);
                instancePath.lineTo(6.10131f, 14.558f);
                instancePath.cubicTo(5.70345f, 14.5727f, 5.35074f, 14.304f, 5.25938f, 13.9165f);
                instancePath.lineTo(3.2456f, 5.37526f);
                instancePath.cubicTo(3.23813f, 5.34357f, 3.23256f, 5.31196f, 3.22882f, 5.28054f);
                instancePath.close();
                instancePath.moveTo(4.84351f, 7.79494f);
                instancePath.lineTo(6.20124f, 13.5536f);
                instancePath.lineTo(15.8202f, 13.1973f);
                instancePath.lineTo(17.1477f, 5.56415f);
                instancePath.lineTo(4.27314f, 5.35424f);
                instancePath.lineTo(4.83678f, 7.76103f);
                instancePath.cubicTo(4.83943f, 7.77234f, 4.84167f, 7.78365f, 4.84351f, 7.79494f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(4.16662f, 17.5f);
                instancePath2.cubicTo(4.62685f, 17.5f, 4.99995f, 17.1269f, 4.99995f, 16.6667f);
                instancePath2.cubicTo(4.99995f, 16.2064f, 4.62685f, 15.8333f, 4.16662f, 15.8333f);
                instancePath2.cubicTo(3.70638f, 15.8333f, 3.33328f, 16.2064f, 3.33328f, 16.6667f);
                instancePath2.cubicTo(3.33328f, 17.1269f, 3.70638f, 17.5f, 4.16662f, 17.5f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
                instancePaint5.setColor(-16777216);
                android.graphics.Path instancePath3 = l95.c.instancePath(looper);
                instancePath3.moveTo(16.6666f, 16.6667f);
                instancePath3.cubicTo(16.6666f, 17.1269f, 16.2935f, 17.5f, 15.8333f, 17.5f);
                instancePath3.cubicTo(15.373f, 17.5f, 15.0f, 17.1269f, 15.0f, 16.6667f);
                instancePath3.cubicTo(15.0f, 16.2064f, 15.373f, 15.8333f, 15.8333f, 15.8333f);
                instancePath3.cubicTo(16.2935f, 15.8333f, 16.6666f, 16.2064f, 16.6666f, 16.6667f);
                instancePath3.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
                canvas.drawPath(instancePath3, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
