package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_icons_outlined_share extends l95.c {
    private final int width = 19;
    private final int height = 19;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 19;
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
                instancePaint3.setColor(-11048043);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.2528f, 2.74854f);
                instancePath.cubicTo(10.4505f, 2.74854f, 10.6402f, 2.82657f, 10.7806f, 2.96568f);
                instancePath.lineTo(16.1591f, 8.29311f);
                instancePath.cubicTo(16.4307f, 8.56218f, 16.4536f, 8.9875f, 16.2262f, 9.28281f);
                instancePath.lineTo(16.1591f, 9.35882f);
                instancePath.lineTo(10.7806f, 14.6862f);
                instancePath.cubicTo(10.4863f, 14.9777f, 10.0115f, 14.9755f, 9.71997f, 14.6812f);
                instancePath.cubicTo(9.58086f, 14.5407f, 9.50282f, 14.3511f, 9.50282f, 14.1534f);
                instancePath.lineTo(9.50282f, 11.6912f);
                instancePath.cubicTo(7.74886f, 11.8322f, 5.18878f, 12.8685f, 3.85695f, 16.1164f);
                instancePath.cubicTo(3.63568f, 16.656f, 3.09288f, 16.6513f, 2.97475f, 15.9519f);
                instancePath.cubicTo(2.03989f, 10.4171f, 5.18878f, 6.66111f, 9.50282f, 5.9813f);
                instancePath.lineTo(9.50282f, 3.49854f);
                instancePath.cubicTo(9.50282f, 3.08432f, 9.83861f, 2.74854f, 10.2528f, 2.74854f);
                instancePath.close();
                instancePath.moveTo(10.4023f, 3.85851f);
                instancePath.lineTo(10.4028f, 6.75058f);
                instancePath.lineTo(9.64292f, 6.87033f);
                instancePath.cubicTo(6.02375f, 7.44064f, 3.66079f, 10.26f, 3.71261f, 14.1896f);
                instancePath.lineTo(3.71755f, 14.405f);
                instancePath.cubicTo(4.91291f, 12.4453f, 6.9191f, 11.0675f, 9.21638f, 10.8145f);
                instancePath.lineTo(10.4028f, 10.716f);
                instancePath.lineTo(10.4023f, 13.793f);
                instancePath.lineTo(15.4183f, 8.82576f);
                instancePath.lineTo(10.4023f, 3.85851f);
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
