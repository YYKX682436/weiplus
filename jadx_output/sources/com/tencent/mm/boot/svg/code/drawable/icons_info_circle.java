package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_info_circle extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                instancePaint3.setColor(419430400);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(32.0f, 58.6667f);
                instancePath.cubicTo(17.2724f, 58.6667f, 5.33331f, 46.7276f, 5.33331f, 32.0f);
                instancePath.cubicTo(5.33331f, 17.2724f, 17.2724f, 5.33334f, 32.0f, 5.33334f);
                instancePath.cubicTo(46.7276f, 5.33334f, 58.6666f, 17.2724f, 58.6666f, 32.0f);
                instancePath.cubicTo(58.6666f, 46.7276f, 46.7276f, 58.6667f, 32.0f, 58.6667f);
                instancePath.close();
                instancePath.moveTo(34.0f, 26.6667f);
                instancePath.lineTo(34.0f, 45.3333f);
                instancePath.lineTo(30.0f, 45.3333f);
                instancePath.lineTo(30.0f, 26.6667f);
                instancePath.lineTo(34.0f, 26.6667f);
                instancePath.close();
                instancePath.moveTo(32.0f, 24.0f);
                instancePath.cubicTo(33.4727f, 24.0f, 34.6666f, 22.8061f, 34.6666f, 21.3333f);
                instancePath.cubicTo(34.6666f, 19.8606f, 33.4727f, 18.6667f, 32.0f, 18.6667f);
                instancePath.cubicTo(30.5272f, 18.6667f, 29.3333f, 19.8606f, 29.3333f, 21.3333f);
                instancePath.cubicTo(29.3333f, 22.8061f, 30.5272f, 24.0f, 32.0f, 24.0f);
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
