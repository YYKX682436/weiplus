package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class floating_window_regular extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.59993f, 4.2f);
        instancePath.lineTo(13.9999f, 4.2f);
        instancePath.cubicTo(14.3313f, 4.2f, 14.5999f, 4.46863f, 14.5999f, 4.8f);
        instancePath.lineTo(14.5999f, 19.2f);
        instancePath.cubicTo(14.5999f, 19.5314f, 14.3313f, 19.8f, 13.9999f, 19.8f);
        instancePath.lineTo(5.59993f, 19.8f);
        instancePath.cubicTo(5.26856f, 19.8f, 4.99993f, 19.5314f, 4.99993f, 19.2f);
        instancePath.lineTo(4.99993f, 4.8f);
        instancePath.cubicTo(4.99993f, 4.46863f, 5.26856f, 4.2f, 5.59993f, 4.2f);
        instancePath.close();
        instancePath.moveTo(3.79993f, 4.8f);
        instancePath.cubicTo(3.79993f, 3.80589f, 4.60581f, 3.0f, 5.59993f, 3.0f);
        instancePath.lineTo(13.9999f, 3.0f);
        instancePath.cubicTo(14.994f, 3.0f, 15.7999f, 3.80589f, 15.7999f, 4.8f);
        instancePath.lineTo(15.7999f, 19.2f);
        instancePath.cubicTo(15.7999f, 20.1941f, 14.994f, 21.0f, 13.9999f, 21.0f);
        instancePath.lineTo(5.59993f, 21.0f);
        instancePath.cubicTo(4.60581f, 21.0f, 3.79993f, 20.1941f, 3.79993f, 19.2f);
        instancePath.lineTo(3.79993f, 4.8f);
        instancePath.close();
        instancePath.moveTo(18.5f, 19.0f);
        instancePath.lineTo(17.5f, 19.0f);
        instancePath.lineTo(17.5f, 17.8f);
        instancePath.lineTo(18.5f, 17.8f);
        instancePath.cubicTo(18.8314f, 17.8f, 19.1f, 17.5314f, 19.1f, 17.2f);
        instancePath.lineTo(19.1f, 6.8f);
        instancePath.cubicTo(19.1f, 6.46863f, 18.8314f, 6.2f, 18.5f, 6.2f);
        instancePath.lineTo(17.5f, 6.2f);
        instancePath.lineTo(17.5f, 5.0f);
        instancePath.lineTo(18.5f, 5.0f);
        instancePath.cubicTo(19.4942f, 5.0f, 20.3f, 5.80589f, 20.3f, 6.8f);
        instancePath.lineTo(20.3f, 17.2f);
        instancePath.cubicTo(20.3f, 18.1941f, 19.4942f, 19.0f, 18.5f, 19.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
