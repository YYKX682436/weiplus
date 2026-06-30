package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_litegame_option_bold extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(1711276032);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.0f, 20.0f);
        instancePath.cubicTo(2.0f, 10.058874f, 10.058874f, 2.0f, 20.0f, 2.0f);
        instancePath.lineTo(20.0f, 2.0f);
        instancePath.cubicTo(29.941126f, 2.0f, 38.0f, 10.058874f, 38.0f, 20.0f);
        instancePath.lineTo(38.0f, 20.0f);
        instancePath.cubicTo(38.0f, 29.941126f, 29.941126f, 38.0f, 20.0f, 38.0f);
        instancePath.lineTo(20.0f, 38.0f);
        instancePath.cubicTo(10.058874f, 38.0f, 2.0f, 29.941126f, 2.0f, 20.0f);
        instancePath.lineTo(2.0f, 20.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.saveLayerAlpha(null, 128, 31);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.9997f, 18.542f);
        instancePath2.cubicTo(20.805f, 18.542f, 21.458f, 19.1947f, 21.458f, 20.0003f);
        instancePath2.cubicTo(21.458f, 20.8056f, 20.805f, 21.4587f, 19.9997f, 21.4587f);
        instancePath2.cubicTo(19.1944f, 21.4587f, 18.5413f, 20.8056f, 18.5413f, 20.0003f);
        instancePath2.cubicTo(18.5413f, 19.1947f, 19.1944f, 18.542f, 19.9997f, 18.542f);
        instancePath2.close();
        instancePath2.moveTo(15.6247f, 20.0003f);
        instancePath2.cubicTo(15.6247f, 20.8056f, 14.9716f, 21.4587f, 14.1663f, 21.4587f);
        instancePath2.cubicTo(13.361f, 21.4587f, 12.708f, 20.8056f, 12.708f, 20.0003f);
        instancePath2.cubicTo(12.708f, 19.1948f, 13.361f, 18.542f, 14.1663f, 18.542f);
        instancePath2.cubicTo(14.9716f, 18.542f, 15.6247f, 19.1948f, 15.6247f, 20.0003f);
        instancePath2.close();
        instancePath2.moveTo(27.2913f, 20.0003f);
        instancePath2.cubicTo(27.2913f, 19.1947f, 26.6383f, 18.542f, 25.833f, 18.542f);
        instancePath2.cubicTo(25.0277f, 18.542f, 24.3747f, 19.1947f, 24.3747f, 20.0003f);
        instancePath2.cubicTo(24.3747f, 20.8056f, 25.0277f, 21.4587f, 25.833f, 21.4587f);
        instancePath2.cubicTo(26.6383f, 21.4587f, 27.2913f, 20.8056f, 27.2913f, 20.0003f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
