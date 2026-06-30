package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_multitask extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(49.5f, 30.0f);
                instancePath.cubicTo(52.81371f, 30.0f, 55.5f, 32.68629f, 55.5f, 36.0f);
                instancePath.cubicTo(55.5f, 39.31371f, 52.81371f, 42.0f, 49.5f, 42.0f);
                instancePath.cubicTo(46.18629f, 42.0f, 43.5f, 39.31371f, 43.5f, 36.0f);
                instancePath.cubicTo(43.5f, 32.68629f, 46.18629f, 30.0f, 49.5f, 30.0f);
                instancePath.close();
                instancePath.moveTo(22.5f, 30.0f);
                instancePath.cubicTo(25.81371f, 30.0f, 28.5f, 32.68629f, 28.5f, 36.0f);
                instancePath.cubicTo(28.5f, 39.31371f, 25.81371f, 42.0f, 22.5f, 42.0f);
                instancePath.cubicTo(19.18629f, 42.0f, 16.5f, 39.31371f, 16.5f, 36.0f);
                instancePath.cubicTo(16.5f, 32.68629f, 19.18629f, 30.0f, 22.5f, 30.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
