package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kidwatch_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(14.3408f, 1.10059f);
        instancePath.cubicTo(15.6484f, 1.10079f, 16.7522f, 2.07216f, 16.9189f, 3.36914f);
        instancePath.lineTo(17.0449f, 4.34863f);
        instancePath.cubicTo(18.6523f, 4.73631f, 19.7998f, 6.17462f, 19.7998f, 7.84473f);
        instancePath.lineTo(19.7998f, 16.1553f);
        instancePath.cubicTo(19.7998f, 17.8254f, 18.6523f, 19.2637f, 17.0449f, 19.6514f);
        instancePath.lineTo(16.9189f, 20.6318f);
        instancePath.cubicTo(16.7521f, 21.9287f, 15.6484f, 22.9002f, 14.3408f, 22.9004f);
        instancePath.lineTo(9.65918f, 22.9004f);
        instancePath.cubicTo(8.35152f, 22.9003f, 7.24685f, 21.9288f, 7.08008f, 20.6318f);
        instancePath.lineTo(6.95312f, 19.6504f);
        instancePath.cubicTo(5.34675f, 19.262f, 4.2002f, 17.8247f, 4.2002f, 16.1553f);
        instancePath.lineTo(4.2002f, 7.84473f);
        instancePath.cubicTo(4.20024f, 6.17519f, 5.34662f, 4.7369f, 6.95312f, 4.34863f);
        instancePath.lineTo(7.08008f, 3.36914f);
        instancePath.cubicTo(7.24678f, 2.07207f, 8.35147f, 1.10069f, 9.65918f, 1.10059f);
        instancePath.lineTo(14.3408f, 1.10059f);
        instancePath.close();
        instancePath.moveTo(9.65918f, 2.2998f);
        instancePath.cubicTo(8.95514f, 2.29991f, 8.36037f, 2.82321f, 8.27051f, 3.52148f);
        instancePath.lineTo(8.1084f, 4.78223f);
        instancePath.cubicTo(8.06405f, 5.12675f, 7.80249f, 5.40343f, 7.46094f, 5.4668f);
        instancePath.lineTo(7.3623f, 5.48535f);
        instancePath.cubicTo(6.22519f, 5.69639f, 5.39946f, 6.68818f, 5.39941f, 7.84473f);
        instancePath.lineTo(5.39941f, 16.1553f);
        instancePath.cubicTo(5.39941f, 17.3119f, 6.22515f, 18.3046f, 7.3623f, 18.5156f);
        instancePath.lineTo(7.46094f, 18.5332f);
        instancePath.cubicTo(7.7599f, 18.5887f, 7.99765f, 18.808f, 8.08203f, 19.0928f);
        instancePath.lineTo(8.1084f, 19.2188f);
        instancePath.lineTo(8.27051f, 20.4785f);
        instancePath.cubicTo(8.36027f, 21.1769f, 8.95507f, 21.7001f, 9.65918f, 21.7002f);
        instancePath.lineTo(14.3408f, 21.7002f);
        instancePath.cubicTo(15.0448f, 21.7f, 15.6388f, 21.1768f, 15.7285f, 20.4785f);
        instancePath.lineTo(15.8906f, 19.2188f);
        instancePath.lineTo(15.918f, 19.0928f);
        instancePath.cubicTo(16.0023f, 18.8082f, 16.2394f, 18.5888f, 16.5381f, 18.5332f);
        instancePath.lineTo(16.6377f, 18.5156f);
        instancePath.cubicTo(17.7749f, 18.3046f, 18.5996f, 17.3119f, 18.5996f, 16.1553f);
        instancePath.lineTo(18.5996f, 7.84473f);
        instancePath.cubicTo(18.5996f, 6.68818f, 17.7748f, 5.69639f, 16.6377f, 5.48535f);
        instancePath.lineTo(16.5381f, 5.4668f);
        instancePath.cubicTo(16.1968f, 5.40322f, 15.9349f, 5.1266f, 15.8906f, 4.78223f);
        instancePath.lineTo(15.7285f, 3.52148f);
        instancePath.cubicTo(15.6386f, 2.82333f, 15.0447f, 2.30001f, 14.3408f, 2.2998f);
        instancePath.lineTo(9.65918f, 2.2998f);
        instancePath.close();
        instancePath.moveTo(16.3994f, 6.30078f);
        instancePath.cubicTo(17.1725f, 6.30078f, 17.7997f, 6.92709f, 17.7998f, 7.7002f);
        instancePath.lineTo(17.7998f, 16.3008f);
        instancePath.cubicTo(17.7993f, 17.0736f, 17.1723f, 17.7002f, 16.3994f, 17.7002f);
        instancePath.lineTo(7.59961f, 17.7002f);
        instancePath.cubicTo(6.82688f, 17.7f, 6.20067f, 17.0735f, 6.2002f, 16.3008f);
        instancePath.lineTo(6.2002f, 7.7002f);
        instancePath.cubicTo(6.2003f, 6.92721f, 6.82665f, 6.30099f, 7.59961f, 6.30078f);
        instancePath.lineTo(16.3994f, 6.30078f);
        instancePath.close();
        instancePath.moveTo(7.59961f, 7.5f);
        instancePath.cubicTo(7.48939f, 7.50021f, 7.39952f, 7.58995f, 7.39941f, 7.7002f);
        instancePath.lineTo(7.39941f, 16.3008f);
        instancePath.cubicTo(7.39989f, 16.4107f, 7.48962f, 16.4998f, 7.59961f, 16.5f);
        instancePath.lineTo(16.3994f, 16.5f);
        instancePath.cubicTo(16.5096f, 16.5f, 16.5991f, 16.4108f, 16.5996f, 16.3008f);
        instancePath.lineTo(16.5996f, 7.7002f);
        instancePath.cubicTo(16.5995f, 7.58983f, 16.5098f, 7.5f, 16.3994f, 7.5f);
        instancePath.lineTo(7.59961f, 7.5f);
        instancePath.close();
        instancePath.moveTo(12.0f, 3.7998f);
        instancePath.cubicTo(12.5523f, 3.7998f, 13.0f, 4.24752f, 13.0f, 4.7998f);
        instancePath.cubicTo(13.0f, 5.35209f, 12.5523f, 5.7998f, 12.0f, 5.7998f);
        instancePath.cubicTo(11.4477f, 5.7998f, 11.0f, 5.35209f, 11.0f, 4.7998f);
        instancePath.cubicTo(11.0f, 4.24752f, 11.4477f, 3.7998f, 12.0f, 3.7998f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
