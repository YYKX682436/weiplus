package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class display_regular extends l95.c {
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
        instancePath.moveTo(2.0f, 4.5f);
        instancePath.cubicTo(2.0f, 3.94772f, 2.44772f, 3.5f, 3.0f, 3.5f);
        instancePath.lineTo(21.0f, 3.5f);
        instancePath.cubicTo(21.5523f, 3.5f, 22.0f, 3.94772f, 22.0f, 4.5f);
        instancePath.lineTo(22.0f, 17.5f);
        instancePath.cubicTo(22.0f, 18.0523f, 21.5523f, 18.5f, 21.0f, 18.5f);
        instancePath.lineTo(3.0f, 18.5f);
        instancePath.cubicTo(2.44772f, 18.5f, 2.0f, 18.0523f, 2.0f, 17.5f);
        instancePath.lineTo(2.0f, 4.5f);
        instancePath.close();
        instancePath.moveTo(3.2f, 17.3f);
        instancePath.lineTo(3.2f, 4.7f);
        instancePath.lineTo(20.8f, 4.7f);
        instancePath.lineTo(20.8f, 17.3f);
        instancePath.lineTo(3.2f, 17.3f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.0f, 20.8f);
        instancePath2.cubicTo(8.0f, 20.2478f, 8.44772f, 19.8f, 9.0f, 19.8f);
        instancePath2.lineTo(15.0f, 19.8f);
        instancePath2.cubicTo(15.5523f, 19.8f, 16.0f, 20.2478f, 16.0f, 20.8f);
        instancePath2.lineTo(16.0f, 21.0001f);
        instancePath2.lineTo(8.0f, 21.0001f);
        instancePath2.lineTo(8.0f, 20.8f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
