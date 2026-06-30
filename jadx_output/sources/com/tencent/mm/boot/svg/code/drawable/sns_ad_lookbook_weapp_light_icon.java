package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_lookbook_weapp_light_icon extends l95.c {
    private final int width = 13;
    private final int height = 13;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 13;
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
                canvas.saveLayerAlpha(null, 76, 31);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.925f, 4.73582f);
                instancePath.cubicTo(10.925f, 3.54196f, 9.85212f, 2.5752f, 8.52471f, 2.5752f);
                instancePath.cubicTo(7.1973f, 2.5752f, 6.12447f, 3.54196f, 6.12447f, 4.73582f);
                instancePath.lineTo(6.12447f, 8.33007f);
                instancePath.cubicTo(6.12447f, 9.12492f, 5.3761f, 9.76369f, 4.45123f, 9.76369f);
                instancePath.cubicTo(3.52636f, 9.76369f, 2.77799f, 9.12492f, 2.77799f, 8.33007f);
                instancePath.cubicTo(2.77799f, 7.69414f, 3.26962f, 7.13798f, 3.97236f, 6.96836f);
                instancePath.cubicTo(4.20383f, 6.91049f, 4.45597f, 6.7144f, 4.4553f, 6.48502f);
                instancePath.cubicTo(4.4553f, 6.25227f, 4.24339f, 6.18439f, 4.03115f, 6.21652f);
                instancePath.cubicTo(2.90414f, 6.38714f, 2.07495f, 7.28383f, 2.07495f, 8.33007f);
                instancePath.cubicTo(2.07495f, 9.52392f, 3.14778f, 10.4907f, 4.47519f, 10.4907f);
                instancePath.cubicTo(5.8026f, 10.4907f, 6.87543f, 9.52392f, 6.87543f, 8.33007f);
                instancePath.lineTo(6.87543f, 4.73582f);
                instancePath.cubicTo(6.87543f, 3.94097f, 7.6238f, 3.30219f, 8.54867f, 3.30219f);
                instancePath.cubicTo(9.47354f, 3.30219f, 10.2219f, 3.94097f, 10.2219f, 4.73582f);
                instancePath.cubicTo(10.2219f, 5.39096f, 9.73536f, 5.95064f, 9.02562f, 6.12194f);
                instancePath.cubicTo(8.81855f, 6.16795f, 8.64452f, 6.30695f, 8.56849f, 6.48433f);
                instancePath.cubicTo(8.43306f, 6.78904f, 8.73112f, 6.9164f, 8.98662f, 6.87138f);
                instancePath.cubicTo(10.1179f, 6.67203f, 10.925f, 5.78687f, 10.925f, 4.73582f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
