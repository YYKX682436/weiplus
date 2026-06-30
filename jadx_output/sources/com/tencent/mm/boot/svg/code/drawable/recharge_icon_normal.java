package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class recharge_icon_normal extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-11487894);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.0f, 64.0f);
                instancePath.cubicTo(49.67311f, 64.0f, 64.0f, 49.67311f, 64.0f, 32.0f);
                instancePath.cubicTo(64.0f, 14.326888f, 49.67311f, 0.0f, 32.0f, 0.0f);
                instancePath.cubicTo(14.326888f, 0.0f, 0.0f, 14.326888f, 0.0f, 32.0f);
                instancePath.cubicTo(0.0f, 49.67311f, 14.326888f, 64.0f, 32.0f, 64.0f);
                instancePath.close();
                instancePath.moveTo(3.0553617f, 31.019482f);
                instancePath.cubicTo(2.559515f, 38.25722f, 5.4354253f, 45.386047f, 10.036881f, 50.881187f);
                instancePath.cubicTo(14.08299f, 46.57419f, 20.043064f, 45.029606f, 24.71394f, 41.613712f);
                instancePath.cubicTo(26.132061f, 40.73251f, 26.608074f, 38.811687f, 25.626297f, 37.415623f);
                instancePath.cubicTo(23.623077f, 34.207653f, 20.757084f, 31.088789f, 21.104177f, 27.009516f);
                instancePath.cubicTo(20.63808f, 20.05891f, 27.689018f, 13.524151f, 34.63087f, 15.623195f);
                instancePath.cubicTo(41.850395f, 17.46481f, 45.093235f, 26.979813f, 41.13638f, 33.078922f);
                instancePath.cubicTo(39.926514f, 35.42549f, 37.06052f, 37.47503f, 38.012543f, 40.415672f);
                instancePath.cubicTo(42.495f, 45.019707f, 49.63519f, 46.00982f, 53.849884f, 51.0f);
                instancePath.cubicTo(60.008297f, 43.910778f, 62.497448f, 33.890816f, 60.09755f, 24.80156f);
                instancePath.cubicTo(57.16214f, 13.048896f, 46.14443f, 3.652706f, 33.9466f, 3.127945f);
                instancePath.cubicTo(18.21835f, 1.5239588f, 3.015694f, 15.23705f, 3.0553617f, 31.019482f);
                instancePath.lineTo(3.0553617f, 31.019482f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
