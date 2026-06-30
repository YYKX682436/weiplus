package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_content_collapse_icon extends l95.c {
    private final int width = 12;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 12;
        }
        if (i17 == 1) {
            return 24;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-855638017);
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.5f, 17.0f);
        instancePath.cubicTo(4.5f, 16.171574f, 5.1715727f, 15.5f, 6.0f, 15.5f);
        instancePath.lineTo(6.0f, 15.5f);
        instancePath.cubicTo(6.8284273f, 15.5f, 7.5f, 16.171574f, 7.5f, 17.0f);
        instancePath.lineTo(7.5f, 17.0f);
        instancePath.cubicTo(7.5f, 17.828426f, 6.8284273f, 18.5f, 6.0f, 18.5f);
        instancePath.lineTo(6.0f, 18.5f);
        instancePath.cubicTo(5.1715727f, 18.5f, 4.5f, 17.828426f, 4.5f, 17.0f);
        instancePath.lineTo(4.5f, 17.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-855638017);
        instancePaint4.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.5f, 12.0f);
        instancePath2.cubicTo(4.5f, 11.171573f, 5.1715727f, 10.5f, 6.0f, 10.5f);
        instancePath2.lineTo(6.0f, 10.5f);
        instancePath2.cubicTo(6.8284273f, 10.5f, 7.5f, 11.171573f, 7.5f, 12.0f);
        instancePath2.lineTo(7.5f, 12.0f);
        instancePath2.cubicTo(7.5f, 12.828427f, 6.8284273f, 13.5f, 6.0f, 13.5f);
        instancePath2.lineTo(6.0f, 13.5f);
        instancePath2.cubicTo(5.1715727f, 13.5f, 4.5f, 12.828427f, 4.5f, 12.0f);
        instancePath2.lineTo(4.5f, 12.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-855638017);
        instancePaint5.setColor(-855638017);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.5f, 7.0f);
        instancePath3.cubicTo(4.5f, 6.1715727f, 5.1715727f, 5.5f, 6.0f, 5.5f);
        instancePath3.lineTo(6.0f, 5.5f);
        instancePath3.cubicTo(6.8284273f, 5.5f, 7.5f, 6.1715727f, 7.5f, 7.0f);
        instancePath3.lineTo(7.5f, 7.0f);
        instancePath3.cubicTo(7.5f, 7.8284273f, 6.8284273f, 8.5f, 6.0f, 8.5f);
        instancePath3.lineTo(6.0f, 8.5f);
        instancePath3.cubicTo(5.1715727f, 8.5f, 4.5f, 7.8284273f, 4.5f, 7.0f);
        instancePath3.lineTo(4.5f, 7.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
