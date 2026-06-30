package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class share_regular extends l95.c {
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
                instancePath.moveTo(13.0037f, 2.99805f);
                instancePath.cubicTo(13.2673f, 2.99805f, 13.5202f, 3.1021f, 13.7074f, 3.28758f);
                instancePath.lineTo(20.8787f, 10.3908f);
                instancePath.cubicTo(21.2409f, 10.7496f, 21.2713f, 11.3167f, 20.9682f, 11.7104f);
                instancePath.lineTo(20.8787f, 11.8118f);
                instancePath.lineTo(13.7074f, 18.915f);
                instancePath.cubicTo(13.315f, 19.3037f, 12.6819f, 19.3006f, 12.2932f, 18.9083f);
                instancePath.cubicTo(12.1077f, 18.721f, 12.0037f, 18.4681f, 12.0037f, 18.2045f);
                instancePath.lineTo(12.0037f, 14.9216f);
                instancePath.cubicTo(9.66506f, 15.1096f, 6.25162f, 16.4914f, 4.47585f, 20.8218f);
                instancePath.cubicTo(4.18082f, 21.5413f, 3.45709f, 21.5351f, 3.29958f, 20.6026f);
                instancePath.cubicTo(2.0531f, 13.2228f, 6.25162f, 8.21482f, 12.0037f, 7.3084f);
                instancePath.lineTo(12.0037f, 3.99805f);
                instancePath.cubicTo(12.0037f, 3.44576f, 12.4514f, 2.99805f, 13.0037f, 2.99805f);
                instancePath.close();
                instancePath.moveTo(13.203f, 4.47802f);
                instancePath.lineTo(13.2037f, 8.33411f);
                instancePath.lineTo(12.1905f, 8.49377f);
                instancePath.cubicTo(7.36491f, 9.25419f, 4.21431f, 13.0134f, 4.2834f, 18.2528f);
                instancePath.lineTo(4.28998f, 18.54f);
                instancePath.cubicTo(5.8838f, 15.9271f, 8.55872f, 14.09f, 11.6218f, 13.7527f);
                instancePath.lineTo(13.2037f, 13.6213f);
                instancePath.lineTo(13.203f, 17.724f);
                instancePath.lineTo(19.891f, 11.101f);
                instancePath.lineTo(13.203f, 4.47802f);
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
