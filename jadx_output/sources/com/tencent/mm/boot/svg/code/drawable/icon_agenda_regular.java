package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_agenda_regular extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 28;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.5f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.0f, 8.0f);
        instancePath.lineTo(21.0f, 8.0f);
        instancePath.cubicTo(22.1f, 8.0f, 23.0f, 8.9f, 23.0f, 10.0f);
        instancePath.lineTo(23.0f, 23.0f);
        instancePath.cubicTo(23.0f, 24.1f, 22.1f, 25.0f, 21.0f, 25.0f);
        instancePath.lineTo(7.0f, 25.0f);
        instancePath.cubicTo(5.9f, 25.0f, 5.0f, 24.1f, 5.0f, 23.0f);
        instancePath.lineTo(5.0f, 10.0f);
        instancePath.cubicTo(5.0f, 8.9f, 5.9f, 8.0f, 7.0f, 8.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.0f, 4.0f);
        instancePath2.lineTo(17.0f, 4.0f);
        instancePath2.cubicTo(18.1f, 4.0f, 19.0f, 4.9f, 19.0f, 6.0f);
        instancePath2.lineTo(19.0f, 8.0f);
        instancePath2.lineTo(9.0f, 8.0f);
        instancePath2.lineTo(9.0f, 6.0f);
        instancePath2.cubicTo(9.0f, 4.9f, 9.9f, 4.0f, 11.0f, 4.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.0f, 13.0f);
        instancePath3.lineTo(20.0f, 13.0f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(8.0f, 17.0f);
        instancePath4.lineTo(20.0f, 17.0f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(8.0f, 21.0f);
        instancePath5.lineTo(17.0f, 21.0f);
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
