package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_search extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(48.929794f, 46.684208f);
                instancePath.lineTo(61.272793f, 59.027206f);
                instancePath.lineTo(58.727207f, 61.572792f);
                instancePath.lineTo(46.35855f, 49.204136f);
                instancePath.cubicTo(42.728428f, 52.200203f, 38.0744f, 54.0f, 33.0f, 54.0f);
                instancePath.cubicTo(21.402f, 54.0f, 12.0f, 44.598f, 12.0f, 33.0f);
                instancePath.cubicTo(12.0f, 21.402f, 21.402f, 12.0f, 33.0f, 12.0f);
                instancePath.cubicTo(44.598f, 12.0f, 54.0f, 21.402f, 54.0f, 33.0f);
                instancePath.cubicTo(54.0f, 38.22745f, 52.089996f, 43.00879f, 48.929794f, 46.684208f);
                instancePath.close();
                instancePath.moveTo(50.399994f, 33.00004f);
                instancePath.cubicTo(50.399994f, 23.390265f, 42.609764f, 15.600037f, 32.999992f, 15.600037f);
                instancePath.cubicTo(23.39022f, 15.600037f, 15.599991f, 23.390265f, 15.599991f, 33.00004f);
                instancePath.cubicTo(15.599991f, 42.60981f, 23.39022f, 50.40004f, 32.999992f, 50.40004f);
                instancePath.cubicTo(42.609764f, 50.40004f, 50.399994f, 42.60981f, 50.399994f, 33.00004f);
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
