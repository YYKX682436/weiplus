package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_device_phone_large extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-436207616);
        instancePaint3.setStrokeWidth(1.2f);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(30.6f, 17.0f);
        instancePath.cubicTo(30.6f, 14.569947f, 32.569946f, 12.6f, 35.0f, 12.6f);
        instancePath.lineTo(69.0f, 12.6f);
        instancePath.cubicTo(71.43005f, 12.6f, 73.4f, 14.569947f, 73.4f, 17.0f);
        instancePath.lineTo(73.4f, 87.0f);
        instancePath.cubicTo(73.4f, 89.43005f, 71.43005f, 91.4f, 69.0f, 91.4f);
        instancePath.lineTo(35.0f, 91.4f);
        instancePath.cubicTo(32.569946f, 91.4f, 30.6f, 89.43005f, 30.6f, 87.0f);
        instancePath.lineTo(30.6f, 17.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(44.0f, 87.0f);
        instancePath2.lineTo(60.0f, 87.0f);
        instancePath2.lineTo(60.0f, 88.2f);
        instancePath2.lineTo(44.0f, 88.2f);
        instancePath2.lineTo(44.0f, 87.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
