package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_rectangle_dark extends l95.c {
    private final int width = 2;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 2;
        }
        if (i17 == 1) {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(436207615);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 1.0f);
            instancePath.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
            instancePath.lineTo(1.0f, 0.0f);
            instancePath.cubicTo(1.5522847f, 0.0f, 2.0f, 0.44771522f, 2.0f, 1.0f);
            instancePath.lineTo(2.0f, 15.0f);
            instancePath.cubicTo(2.0f, 15.552285f, 1.5522847f, 16.0f, 1.0f, 16.0f);
            instancePath.lineTo(1.0f, 16.0f);
            instancePath.cubicTo(0.44771522f, 16.0f, 0.0f, 15.552285f, 0.0f, 15.0f);
            instancePath.lineTo(0.0f, 1.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
