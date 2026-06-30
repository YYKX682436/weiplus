package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_random_pick_card_landingpage_ellipse_icon extends l95.c {
    private final int width = 108;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 108;
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
            instancePaint3.setColor(855638016);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(54.0f, 0.0f);
            instancePath.cubicTo(83.82338f, 0.0f, 108.0f, 4.029437f, 108.0f, 9.0f);
            instancePath.cubicTo(108.0f, 13.970563f, 83.82338f, 18.0f, 54.0f, 18.0f);
            instancePath.cubicTo(24.176622f, 18.0f, 0.0f, 13.970563f, 0.0f, 9.0f);
            instancePath.cubicTo(0.0f, 4.029437f, 24.176622f, 0.0f, 54.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
