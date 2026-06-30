package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class live_net_bad_icon extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
            instancePaint3.setColor(-372399);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.0f, 4.0f);
            instancePath.cubicTo(10.209139f, 4.0f, 12.0f, 5.790861f, 12.0f, 8.0f);
            instancePath.cubicTo(12.0f, 10.209139f, 10.209139f, 12.0f, 8.0f, 12.0f);
            instancePath.cubicTo(5.790861f, 12.0f, 4.0f, 10.209139f, 4.0f, 8.0f);
            instancePath.cubicTo(4.0f, 5.790861f, 5.790861f, 4.0f, 8.0f, 4.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(16777215);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(16.0f, 0.0f);
            instancePath2.lineTo(16.0f, 16.0f);
            instancePath2.lineTo(0.0f, 16.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
