package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_filled extends l95.c {
    private final int width = 70;
    private final int height = 70;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 70;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16268960);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(34.5679f, 0.0f);
            instancePath.cubicTo(54.33037f, 0.0f, 70.0f, 15.66963f, 70.0f, 35.4321f);
            instancePath.cubicTo(70.0f, 54.33037f, 54.33037f, 70.0f, 34.5679f, 70.0f);
            instancePath.cubicTo(15.66963f, 70.0f, 0.0f, 54.33037f, 0.0f, 35.4321f);
            instancePath.cubicTo(0.0f, 15.66963f, 15.66963f, 0.0f, 34.5679f, 0.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(52.03301f, 23.0f);
            instancePath2.lineTo(30.091883f, 44.941124f);
            instancePath2.lineTo(20.18198f, 35.031223f);
            instancePath2.lineTo(17.0f, 38.213203f);
            instancePath2.lineTo(27.970562f, 49.183765f);
            instancePath2.cubicTo(29.142136f, 50.35534f, 31.04163f, 50.35534f, 32.213203f, 49.183765f);
            instancePath2.lineTo(55.21499f, 26.18198f);
            instancePath2.lineTo(52.03301f, 23.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
