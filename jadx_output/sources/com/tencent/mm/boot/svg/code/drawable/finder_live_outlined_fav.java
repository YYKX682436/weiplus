package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_outlined_fav extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(-1946157056);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.99992f, 11.3023f);
                instancePath.lineTo(11.6286f, 13.2099f);
                instancePath.lineTo(10.9356f, 9.16939f);
                instancePath.lineTo(13.8712f, 6.30786f);
                instancePath.lineTo(9.81424f, 5.71835f);
                instancePath.lineTo(7.99992f, 2.04213f);
                instancePath.lineTo(6.1856f, 5.71835f);
                instancePath.lineTo(2.12865f, 6.30786f);
                instancePath.lineTo(5.06429f, 9.16939f);
                instancePath.lineTo(4.37128f, 13.2099f);
                instancePath.lineTo(7.99992f, 11.3023f);
                instancePath.close();
                instancePath.moveTo(4.2047f, 9.44869f);
                instancePath.lineTo(3.55729f, 13.2234f);
                instancePath.cubicTo(3.45914f, 13.7956f, 4.08372f, 14.2649f, 4.61003f, 13.9882f);
                instancePath.lineTo(7.99992f, 12.2061f);
                instancePath.lineTo(11.3898f, 13.9882f);
                instancePath.cubicTo(11.9037f, 14.2584f, 12.5431f, 13.8094f, 12.4425f, 13.2234f);
                instancePath.lineTo(11.7951f, 9.44869f);
                instancePath.lineTo(14.5376f, 6.77543f);
                instancePath.cubicTo(14.9534f, 6.37015f, 14.7239f, 5.62337f, 14.1355f, 5.53786f);
                instancePath.lineTo(10.3455f, 4.98714f);
                instancePath.lineTo(8.65055f, 1.5528f);
                instancePath.cubicTo(8.39359f, 1.03215f, 7.61244f, 1.0196f, 7.34929f, 1.5528f);
                instancePath.lineTo(5.65435f, 4.98714f);
                instancePath.lineTo(1.86433f, 5.53786f);
                instancePath.cubicTo(1.28975f, 5.62135f, 1.03643f, 6.36039f, 1.46222f, 6.77543f);
                instancePath.lineTo(4.2047f, 9.44869f);
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
