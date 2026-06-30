package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_eyes_on_filled extends l95.c {
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
                instancePath.moveTo(1.0f, 12.0f);
                instancePath.cubicTo(3.02794f, 7.84763f, 7.19221f, 5.0f, 12.0f, 5.0f);
                instancePath.cubicTo(16.8078f, 5.0f, 20.9721f, 7.84763f, 23.0f, 12.0f);
                instancePath.cubicTo(20.9721f, 16.1524f, 16.8078f, 19.0f, 12.0f, 19.0f);
                instancePath.cubicTo(7.19221f, 19.0f, 3.02794f, 16.1524f, 1.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(15.5f, 12.0f);
                instancePath.cubicTo(15.5f, 13.933f, 13.933f, 15.5f, 12.0f, 15.5f);
                instancePath.cubicTo(10.067f, 15.5f, 8.5f, 13.933f, 8.5f, 12.0f);
                instancePath.cubicTo(8.5f, 10.067f, 10.067f, 8.5f, 12.0f, 8.5f);
                instancePath.cubicTo(13.933f, 8.5f, 15.5f, 10.067f, 15.5f, 12.0f);
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
