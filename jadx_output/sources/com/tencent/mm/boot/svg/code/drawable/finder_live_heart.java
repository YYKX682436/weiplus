package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_heart extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePath.moveTo(15.0541f, 8.35265f);
                instancePath.lineTo(15.569f, 8.85554f);
                instancePath.lineTo(15.9969f, 9.26209f);
                instancePath.lineTo(16.6134f, 8.67365f);
                instancePath.lineTo(16.9397f, 8.35265f);
                instancePath.cubicTo(19.5432f, 5.74915f, 23.7643f, 5.74915f, 26.3678f, 8.35265f);
                instancePath.cubicTo(28.9471f, 10.9319f, 28.9711f, 15.0989f, 26.4398f, 17.7077f);
                instancePath.lineTo(16.9397f, 27.2088f);
                instancePath.cubicTo(16.4591f, 27.6895f, 15.7028f, 27.7265f, 15.1797f, 27.3198f);
                instancePath.lineTo(15.0541f, 27.2088f);
                instancePath.lineTo(5.55351f, 17.7082f);
                instancePath.cubicTo(3.02276f, 15.0989f, 3.04675f, 10.9319f, 5.62603f, 8.35265f);
                instancePath.cubicTo(8.22953f, 5.74915f, 12.4506f, 5.74915f, 15.0541f, 8.35265f);
                instancePath.close();
                instancePath.moveTo(13.6399f, 9.76686f);
                instancePath.cubicTo(11.8175f, 7.94441f, 8.86269f, 7.94441f, 7.04025f, 9.76686f);
                instancePath.cubicTo(5.30121f, 11.5059f, 5.21974f, 14.2806f, 6.78682f, 16.0963f);
                instancePath.lineTo(6.96772f, 16.294f);
                instancePath.lineTo(15.9933f, 25.3254f);
                instancePath.lineTo(25.0044f, 16.3149f);
                instancePath.cubicTo(26.7144f, 14.5526f, 26.7563f, 11.7773f, 25.14f, 9.96425f);
                instancePath.lineTo(24.9536f, 9.76686f);
                instancePath.cubicTo(23.1963f, 8.0095f, 20.386f, 7.94674f, 18.5429f, 9.58899f);
                instancePath.lineTo(18.3422f, 9.77847f);
                instancePath.lineTo(17.9943f, 10.1204f);
                instancePath.lineTo(16.0001f, 12.0239f);
                instancePath.lineTo(14.1716f, 10.2863f);
                instancePath.lineTo(13.6399f, 9.76686f);
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
