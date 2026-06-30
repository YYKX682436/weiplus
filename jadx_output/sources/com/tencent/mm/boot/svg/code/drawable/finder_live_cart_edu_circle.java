package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_cart_edu_circle extends l95.c {
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-2130706433);
            instancePaint3.setStrokeWidth(1.8f);
            instancePaint3.setColor(-2130706433);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.0f, 0.9000001f);
            instancePath.cubicTo(11.921222f, 0.9000001f, 15.1f, 4.0787783f, 15.1f, 8.0f);
            instancePath.cubicTo(15.1f, 11.921222f, 11.921222f, 15.1f, 8.0f, 15.1f);
            instancePath.cubicTo(4.0787783f, 15.1f, 0.9000001f, 11.921222f, 0.9000001f, 8.0f);
            instancePath.cubicTo(0.9000001f, 4.0787783f, 4.0787783f, 0.9000001f, 8.0f, 0.9000001f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
