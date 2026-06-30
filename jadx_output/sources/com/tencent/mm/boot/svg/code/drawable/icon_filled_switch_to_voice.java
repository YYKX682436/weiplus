package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_switch_to_voice extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(10.5f, 7.2f);
                instancePath2.lineTo(14.035534f, 10.735534f);
                instancePath2.cubicTo(14.426058f, 11.126059f, 14.426058f, 11.759223f, 14.035534f, 12.149748f);
                instancePath2.lineTo(10.5f, 15.685282f);
                instancePath2.lineTo(9.085787f, 14.271068f);
                instancePath2.lineTo(10.82321f, 12.532297f);
                instancePath2.cubicTo(7.353332f, 12.865187f, 4.623251f, 15.7312355f, 4.504059f, 19.25935f);
                instancePath2.lineTo(4.5f, 19.5f);
                instancePath2.lineTo(2.5f, 19.5f);
                instancePath2.cubicTo(2.5f, 14.701895f, 6.2546787f, 10.780743f, 10.986155f, 10.514423f);
                instancePath2.lineTo(9.085787f, 8.614214f);
                instancePath2.lineTo(10.5f, 7.2f);
                instancePath2.close();
                instancePath2.moveTo(18.536373f, 4.8759956f);
                instancePath2.cubicTo(20.201252f, 6.5872645f, 21.226625f, 8.923888f, 21.226625f, 11.5f);
                instancePath2.cubicTo(21.226625f, 14.076112f, 20.201252f, 16.412735f, 18.536373f, 18.124004f);
                instancePath2.lineTo(17.476358f, 17.062435f);
                instancePath2.cubicTo(18.869394f, 15.622788f, 19.726625f, 13.661503f, 19.726625f, 11.5f);
                instancePath2.cubicTo(19.726625f, 9.338497f, 18.869394f, 7.3772116f, 17.476358f, 5.9375653f);
                instancePath2.lineTo(18.536373f, 4.8759956f);
                instancePath2.close();
                instancePath2.moveTo(16.061394f, 7.351521f);
                instancePath2.cubicTo(17.092913f, 8.429066f, 17.726625f, 9.890527f, 17.726625f, 11.5f);
                instancePath2.cubicTo(17.726625f, 13.109473f, 17.092913f, 14.570934f, 16.061394f, 15.648479f);
                instancePath2.lineTo(15.000154f, 14.587736f);
                instancePath2.cubicTo(15.760526f, 13.781904f, 16.226625f, 12.695384f, 16.226625f, 11.5f);
                instancePath2.cubicTo(16.226625f, 10.304616f, 15.760526f, 9.218096f, 15.000154f, 8.412264f);
                instancePath2.lineTo(16.061394f, 7.351521f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
