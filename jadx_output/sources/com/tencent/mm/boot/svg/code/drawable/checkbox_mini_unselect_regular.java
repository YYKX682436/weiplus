package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_mini_unselect_regular extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 12;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-16777216);
            instancePaint3.setStrokeWidth(1.2f);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.6f, 6.0f);
            instancePath.cubicTo(0.6f, 3.017662f, 3.017662f, 0.6f, 6.0f, 0.6f);
            instancePath.lineTo(6.0000005f, 0.6f);
            instancePath.cubicTo(8.982338f, 0.6f, 11.400001f, 3.017662f, 11.400001f, 6.0f);
            instancePath.lineTo(11.400001f, 6.0000005f);
            instancePath.cubicTo(11.400001f, 8.982338f, 8.982338f, 11.400001f, 6.0000005f, 11.400001f);
            instancePath.lineTo(6.0f, 11.400001f);
            instancePath.cubicTo(3.017662f, 11.400001f, 0.6f, 8.982338f, 0.6f, 6.0000005f);
            instancePath.lineTo(0.6f, 6.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
