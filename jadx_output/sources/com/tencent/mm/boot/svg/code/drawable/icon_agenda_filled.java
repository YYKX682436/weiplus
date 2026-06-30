package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_agenda_filled extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
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
        instancePath.moveTo(11.0f, 4.0f);
        instancePath.lineTo(17.0f, 4.0f);
        instancePath.cubicTo(18.1f, 4.0f, 19.0f, 4.9f, 19.0f, 6.0f);
        instancePath.lineTo(19.0f, 8.0f);
        instancePath.lineTo(9.0f, 8.0f);
        instancePath.lineTo(9.0f, 6.0f);
        instancePath.cubicTo(9.0f, 4.9f, 9.9f, 4.0f, 11.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(8.0f, 13.0f);
        instancePath.lineTo(20.0f, 13.0f);
        instancePath.lineTo(20.0f, 15.0f);
        instancePath.lineTo(8.0f, 15.0f);
        instancePath.close();
        instancePath.moveTo(8.0f, 17.0f);
        instancePath.lineTo(20.0f, 17.0f);
        instancePath.lineTo(20.0f, 19.0f);
        instancePath.lineTo(8.0f, 19.0f);
        instancePath.close();
        instancePath.moveTo(8.0f, 21.0f);
        instancePath.lineTo(17.0f, 21.0f);
        instancePath.lineTo(17.0f, 23.0f);
        instancePath.lineTo(8.0f, 23.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
