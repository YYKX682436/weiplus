package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_float_window_on extends l95.c {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(3.6f);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 7.799999f);
            instancePath.cubicTo(51.574432f, 7.799999f, 64.2f, 20.425568f, 64.2f, 36.0f);
            instancePath.cubicTo(64.2f, 51.574432f, 51.574432f, 64.2f, 36.0f, 64.2f);
            instancePath.cubicTo(20.425568f, 64.2f, 7.799999f, 51.574432f, 7.799999f, 36.0f);
            instancePath.cubicTo(7.799999f, 20.425568f, 20.425568f, 7.799999f, 36.0f, 7.799999f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(36.0f, 19.8f);
            instancePath2.cubicTo(44.947014f, 19.8f, 52.2f, 27.052986f, 52.2f, 36.0f);
            instancePath2.cubicTo(52.2f, 44.947014f, 44.947014f, 52.2f, 36.0f, 52.2f);
            instancePath2.cubicTo(27.052986f, 52.2f, 19.8f, 44.947014f, 19.8f, 36.0f);
            instancePath2.cubicTo(19.8f, 27.052986f, 27.052986f, 19.8f, 36.0f, 19.8f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
