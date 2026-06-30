package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class tips_background_dark extends l95.c {
    private final int width = 200;
    private final int height = 101;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 200;
        }
        if (i17 == 1) {
            return 101;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-13882324);
            instancePaint5.setColor(268435455);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.5f, 8.5f);
            instancePath.cubicTo(0.5f, 4.081722f, 4.081722f, 0.5f, 8.5f, 0.5f);
            instancePath.lineTo(191.5f, 0.5f);
            instancePath.cubicTo(195.91827f, 0.5f, 199.5f, 4.081722f, 199.5f, 8.5f);
            instancePath.lineTo(199.5f, 92.5f);
            instancePath.cubicTo(199.5f, 96.91828f, 195.91827f, 100.5f, 191.5f, 100.5f);
            instancePath.lineTo(8.5f, 100.5f);
            instancePath.cubicTo(4.081722f, 100.5f, 0.5f, 96.91828f, 0.5f, 92.5f);
            instancePath.lineTo(0.5f, 8.5f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
