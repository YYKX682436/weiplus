package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_brand_contact extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 192;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15432210);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(192.0f, 0.0f);
                instancePath.lineTo(192.0f, 192.0f);
                instancePath.lineTo(0.0f, 192.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(56.891357f, 44.8f);
                instancePath2.cubicTo(54.926315f, 44.8f, 53.333332f, 46.40846f, 53.333332f, 48.354576f);
                instancePath2.lineTo(53.333332f, 143.64542f);
                instancePath2.cubicTo(53.333332f, 145.60857f, 54.924335f, 147.2f, 56.891357f, 147.2f);
                instancePath2.lineTo(135.10864f, 147.2f);
                instancePath2.cubicTo(137.07368f, 147.2f, 138.66667f, 145.59154f, 138.66667f, 143.64542f);
                instancePath2.lineTo(138.66667f, 48.354576f);
                instancePath2.cubicTo(138.66667f, 46.391438f, 137.07567f, 44.8f, 135.10864f, 44.8f);
                instancePath2.lineTo(56.891357f, 44.8f);
                instancePath2.lineTo(56.891357f, 44.8f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 76.8f);
                instancePath2.lineTo(64.0f, 83.2f);
                instancePath2.lineTo(108.8f, 83.2f);
                instancePath2.lineTo(108.8f, 76.8f);
                instancePath2.lineTo(64.0f, 76.8f);
                instancePath2.lineTo(64.0f, 76.8f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 89.6f);
                instancePath2.lineTo(64.0f, 96.0f);
                instancePath2.lineTo(87.46667f, 96.0f);
                instancePath2.lineTo(87.46667f, 89.6f);
                instancePath2.lineTo(64.0f, 89.6f);
                instancePath2.lineTo(64.0f, 89.6f);
                instancePath2.close();
                instancePath2.moveTo(64.0f, 102.4f);
                instancePath2.lineTo(64.0f, 108.8f);
                instancePath2.lineTo(91.73333f, 108.8f);
                instancePath2.lineTo(91.73333f, 102.4f);
                instancePath2.lineTo(64.0f, 102.4f);
                instancePath2.lineTo(64.0f, 102.4f);
                instancePath2.close();
                instancePath2.moveTo(70.4f, 55.466667f);
                instancePath2.cubicTo(73.93463f, 55.466667f, 76.8f, 58.33163f, 76.8f, 61.865753f);
                instancePath2.cubicTo(76.8f, 65.39988f, 73.93463f, 68.26667f, 70.4f, 68.26667f);
                instancePath2.cubicTo(66.86537f, 68.26667f, 64.0f, 65.39988f, 64.0f, 61.865753f);
                instancePath2.cubicTo(64.0f, 58.33163f, 66.86537f, 55.466667f, 70.4f, 55.466667f);
                instancePath2.lineTo(70.4f, 55.466667f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
