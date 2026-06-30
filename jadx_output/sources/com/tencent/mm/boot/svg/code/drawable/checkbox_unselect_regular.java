package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_unselect_regular extends l95.c {
    private final int width = 26;
    private final int height = 26;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
            instancePath.moveTo(1.6f, 13.0f);
            instancePath.cubicTo(1.6f, 6.7039537f, 6.7039537f, 1.6f, 13.0f, 1.6f);
            instancePath.lineTo(13.0f, 1.6f);
            instancePath.cubicTo(19.296047f, 1.6f, 24.4f, 6.7039537f, 24.4f, 13.0f);
            instancePath.lineTo(24.4f, 13.0f);
            instancePath.cubicTo(24.4f, 19.296047f, 19.296047f, 24.4f, 13.0f, 24.4f);
            instancePath.lineTo(13.0f, 24.4f);
            instancePath.cubicTo(6.7039537f, 24.4f, 1.6f, 19.296047f, 1.6f, 13.0f);
            instancePath.lineTo(1.6f, 13.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
