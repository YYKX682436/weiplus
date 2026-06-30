package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class smile_filled extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 22.0f);
                instancePath.cubicTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f);
                instancePath.cubicTo(22.0f, 6.47715f, 17.5228f, 2.0f, 12.0f, 2.0f);
                instancePath.cubicTo(6.47715f, 2.0f, 2.0f, 6.47715f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 17.5228f, 6.47715f, 22.0f, 12.0f, 22.0f);
                instancePath.close();
                instancePath.moveTo(17.4776f, 13.0f);
                instancePath.cubicTo(17.225f, 15.8033f, 14.869f, 18.0f, 12.0f, 18.0f);
                instancePath.cubicTo(9.13098f, 18.0f, 6.77504f, 15.8033f, 6.52242f, 13.0f);
                instancePath.lineTo(17.4776f, 13.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 9.0f);
                instancePath.cubicTo(10.0f, 9.82843f, 9.32843f, 10.5f, 8.5f, 10.5f);
                instancePath.cubicTo(7.67157f, 10.5f, 7.0f, 9.82843f, 7.0f, 9.0f);
                instancePath.cubicTo(7.0f, 8.17157f, 7.67157f, 7.5f, 8.5f, 7.5f);
                instancePath.cubicTo(9.32843f, 7.5f, 10.0f, 8.17157f, 10.0f, 9.0f);
                instancePath.close();
                instancePath.moveTo(15.5f, 10.5f);
                instancePath.cubicTo(16.3284f, 10.5f, 17.0f, 9.82843f, 17.0f, 9.0f);
                instancePath.cubicTo(17.0f, 8.17157f, 16.3284f, 7.5f, 15.5f, 7.5f);
                instancePath.cubicTo(14.6716f, 7.5f, 14.0f, 8.17157f, 14.0f, 9.0f);
                instancePath.cubicTo(14.0f, 9.82843f, 14.6716f, 10.5f, 15.5f, 10.5f);
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
