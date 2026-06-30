package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_random_pick_card_ellipse_light_icon extends l95.c {
    private final int width = 87;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 87;
        }
        if (i17 == 1) {
            return 18;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-986896);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(43.5f, 0.0f);
            instancePath.cubicTo(67.52438f, 0.0f, 87.0f, 4.029437f, 87.0f, 9.0f);
            instancePath.cubicTo(87.0f, 13.970563f, 67.52438f, 18.0f, 43.5f, 18.0f);
            instancePath.cubicTo(19.475613f, 18.0f, 0.0f, 13.970563f, 0.0f, 9.0f);
            instancePath.cubicTo(0.0f, 4.029437f, 19.475613f, 0.0f, 43.5f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
