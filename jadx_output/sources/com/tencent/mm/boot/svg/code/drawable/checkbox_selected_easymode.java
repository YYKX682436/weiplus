package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_easymode extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
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
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 0, 31);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16676542);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(35.5679f, 1.0f);
            instancePath2.cubicTo(55.33037f, 1.0f, 71.0f, 16.66963f, 71.0f, 36.4321f);
            instancePath2.cubicTo(71.0f, 55.33037f, 55.33037f, 71.0f, 35.5679f, 71.0f);
            instancePath2.cubicTo(16.66963f, 71.0f, 1.0f, 55.33037f, 1.0f, 36.4321f);
            instancePath2.cubicTo(1.0f, 16.66963f, 16.66963f, 1.0f, 35.5679f, 1.0f);
            instancePath2.close();
            instancePath2.moveTo(53.03301f, 24.0f);
            instancePath2.lineTo(31.091883f, 45.941124f);
            instancePath2.lineTo(21.18198f, 36.031223f);
            instancePath2.lineTo(18.0f, 39.213203f);
            instancePath2.lineTo(28.970562f, 50.183765f);
            instancePath2.cubicTo(30.142136f, 51.35534f, 32.04163f, 51.35534f, 33.213203f, 50.183765f);
            instancePath2.lineTo(56.21499f, 27.18198f);
            instancePath2.lineTo(53.03301f, 24.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
