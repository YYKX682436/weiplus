package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pause_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.5f, 5.5f);
        instancePath.cubicTo(5.5f, 4.94772f, 5.94772f, 4.5f, 6.5f, 4.5f);
        instancePath.lineTo(8.5f, 4.5f);
        instancePath.cubicTo(9.05228f, 4.5f, 9.5f, 4.94772f, 9.5f, 5.5f);
        instancePath.lineTo(9.5f, 18.5f);
        instancePath.cubicTo(9.5f, 19.0523f, 9.05228f, 19.5f, 8.5f, 19.5f);
        instancePath.lineTo(6.5f, 19.5f);
        instancePath.cubicTo(5.94772f, 19.5f, 5.5f, 19.0523f, 5.5f, 18.5f);
        instancePath.lineTo(5.5f, 5.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.5f, 5.5f);
        instancePath2.cubicTo(14.5f, 4.94772f, 14.9477f, 4.5f, 15.5f, 4.5f);
        instancePath2.lineTo(17.5f, 4.5f);
        instancePath2.cubicTo(18.0523f, 4.5f, 18.5f, 4.94772f, 18.5f, 5.5f);
        instancePath2.lineTo(18.5f, 18.5f);
        instancePath2.cubicTo(18.5f, 19.0523f, 18.0523f, 19.5f, 17.5f, 19.5f);
        instancePath2.lineTo(15.5f, 19.5f);
        instancePath2.cubicTo(14.9477f, 19.5f, 14.5f, 19.0523f, 14.5f, 18.5f);
        instancePath2.lineTo(14.5f, 5.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
