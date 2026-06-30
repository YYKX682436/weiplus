package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class heart_off_filled extends l95.c {
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
                instancePath.moveTo(10.9058f, 5.91504f);
                instancePath.cubicTo(8.94206f, 4.31957f, 6.05014f, 4.43598f, 4.22184f, 6.26427f);
                instancePath.cubicTo(2.28738f, 8.19873f, 2.26939f, 11.3239f, 4.16745f, 13.2809f);
                instancePath.lineTo(11.2929f, 20.4064f);
                instancePath.cubicTo(11.6834f, 20.7969f, 12.3166f, 20.7969f, 12.7071f, 20.4063f);
                instancePath.lineTo(19.8322f, 13.2805f);
                instancePath.cubicTo(21.7306f, 11.3239f, 21.7127f, 8.19873f, 19.7782f, 6.26427f);
                instancePath.cubicTo(17.8256f, 4.31165f, 14.6597f, 4.31165f, 12.7071f, 6.26427f);
                instancePath.cubicTo(12.5243f, 6.44708f, 12.2886f, 6.67444f, 12.0f, 6.94635f);
                instancePath.lineTo(11.9986f, 6.94504f);
                instancePath.lineTo(10.9426f, 7.96313f);
                instancePath.lineTo(13.6554f, 11.0125f);
                instancePath.cubicTo(13.7902f, 11.1641f, 13.8579f, 11.3638f, 13.843f, 11.5661f);
                instancePath.cubicTo(13.8281f, 11.7684f, 13.7319f, 11.9561f, 13.5763f, 12.0863f);
                instancePath.lineTo(11.7827f, 13.5868f);
                instancePath.lineTo(12.757f, 16.1499f);
                instancePath.lineTo(11.3549f, 16.6829f);
                instancePath.lineTo(10.1908f, 13.6206f);
                instancePath.cubicTo(10.0772f, 13.3219f, 10.1655f, 12.984f, 10.4106f, 12.7789f);
                instancePath.lineTo(12.0208f, 11.4319f);
                instancePath.lineTo(9.34303f, 8.42179f);
                instancePath.cubicTo(9.07549f, 8.12105f, 9.09306f, 7.66275f, 9.38283f, 7.38337f);
                instancePath.lineTo(10.9058f, 5.91504f);
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
