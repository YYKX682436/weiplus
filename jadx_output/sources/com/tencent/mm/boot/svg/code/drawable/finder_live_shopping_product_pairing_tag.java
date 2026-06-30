package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_shopping_product_pairing_tag extends l95.c {
    private final int width = 8;
    private final int height = 8;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 8;
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
            instancePaint3.setColor(-1);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.0f, 0.0f);
            instancePath.cubicTo(6.209139f, 0.0f, 8.0f, 1.7908609f, 8.0f, 4.0f);
            instancePath.cubicTo(8.0f, 6.209139f, 6.209139f, 8.0f, 4.0f, 8.0f);
            instancePath.cubicTo(1.7908609f, 8.0f, 0.0f, 6.209139f, 0.0f, 4.0f);
            instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-2142483380);
            instancePaint4.setStrokeWidth(2.0f);
            instancePaint4.setColor(-2142483380);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(4.0f, 1.0f);
            instancePath2.cubicTo(5.6568546f, 1.0f, 7.0f, 2.3431456f, 7.0f, 4.0f);
            instancePath2.cubicTo(7.0f, 5.6568546f, 5.6568546f, 7.0f, 4.0f, 7.0f);
            instancePath2.cubicTo(2.3431456f, 7.0f, 1.0f, 5.6568546f, 1.0f, 4.0f);
            instancePath2.cubicTo(1.0f, 2.3431456f, 2.3431456f, 1.0f, 4.0f, 1.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
