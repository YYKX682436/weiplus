package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_ret_dot_with_frame extends l95.c {
    private final int width = 11;
    private final int height = 11;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 11;
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
            instancePaint3.setColor(-372399);
            instancePaint3.setColor(-372399);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(1.5f, 5.5f);
            instancePath.cubicTo(1.5f, 3.290861f, 3.290861f, 1.5f, 5.5f, 1.5f);
            instancePath.lineTo(5.5f, 1.5f);
            instancePath.cubicTo(7.709139f, 1.5f, 9.5f, 3.290861f, 9.5f, 5.5f);
            instancePath.lineTo(9.5f, 5.5f);
            instancePath.cubicTo(9.5f, 7.709139f, 7.709139f, 9.5f, 5.5f, 9.5f);
            instancePath.lineTo(5.5f, 9.5f);
            instancePath.cubicTo(3.290861f, 9.5f, 1.5f, 7.709139f, 1.5f, 5.5f);
            instancePath.lineTo(1.5f, 5.5f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-1275068417);
            instancePaint4.setStrokeWidth(1.5f);
            instancePaint4.setColor(-1275068417);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.75f, 5.5f);
            instancePath2.cubicTo(0.75f, 2.8766472f, 2.8766472f, 0.75f, 5.5f, 0.75f);
            instancePath2.lineTo(5.5f, 0.75f);
            instancePath2.cubicTo(8.123353f, 0.75f, 10.25f, 2.8766472f, 10.25f, 5.5f);
            instancePath2.lineTo(10.25f, 5.5f);
            instancePath2.cubicTo(10.25f, 8.123353f, 8.123353f, 10.25f, 5.5f, 10.25f);
            instancePath2.lineTo(5.5f, 10.25f);
            instancePath2.cubicTo(2.8766472f, 10.25f, 0.75f, 8.123353f, 0.75f, 5.5f);
            instancePath2.lineTo(0.75f, 5.5f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
