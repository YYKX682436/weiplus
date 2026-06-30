package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class confirm_dialog_successful_icon extends l95.c {
    private final int width = 120;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 120;
        }
        if (i17 == 1) {
            return 80;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-12206054);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(46.16f, 67.69f);
            instancePath.cubicTo(68.72f, 45.13f, 91.28f, 22.57f, 113.84f, 0.01f);
            instancePath.cubicTo(115.9f, 2.05f, 117.95f, 4.1f, 119.99f, 6.16f);
            instancePath.cubicTo(95.39f, 30.78f, 70.77f, 55.38f, 46.16f, 79.99f);
            instancePath.cubicTo(30.77f, 64.62f, 15.38f, 49.24f, 0.01f, 33.85f);
            instancePath.cubicTo(2.05f, 31.79f, 4.1f, 29.74f, 6.16f, 27.71f);
            instancePath.cubicTo(19.5f, 41.02f, 32.81f, 54.37f, 46.16f, 67.69f);
            instancePath.lineTo(46.16f, 67.69f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
