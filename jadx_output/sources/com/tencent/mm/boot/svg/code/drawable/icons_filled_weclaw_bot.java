package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_weclaw_bot extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePaint3.setColor(-1947320);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.6667f, 5.6667f);
        instancePath.cubicTo(2.6667f, 4.0098457f, 4.0098457f, 2.6667f, 5.6667f, 2.6667f);
        instancePath.lineTo(26.3333f, 2.6667f);
        instancePath.cubicTo(27.990154f, 2.6667f, 29.3333f, 4.0098457f, 29.3333f, 5.6667f);
        instancePath.lineTo(29.3333f, 26.3333f);
        instancePath.cubicTo(29.3333f, 27.990154f, 27.990154f, 29.3333f, 26.3333f, 29.3333f);
        instancePath.lineTo(5.6667f, 29.3333f);
        instancePath.cubicTo(4.0098457f, 29.3333f, 2.6667f, 27.990154f, 2.6667f, 26.3333f);
        instancePath.lineTo(2.6667f, 5.6667f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.6667f, 9.99969f);
        instancePath2.cubicTo(13.7711f, 9.99987f, 14.6666f, 10.8954f, 14.6667f, 11.9997f);
        instancePath2.cubicTo(14.6667f, 13.1042f, 13.7712f, 13.9995f, 12.6667f, 13.9997f);
        instancePath2.cubicTo(11.5623f, 13.9995f, 10.6667f, 13.1042f, 10.6667f, 11.9997f);
        instancePath2.cubicTo(10.6669f, 10.8954f, 11.5624f, 9.99987f, 12.6667f, 9.99969f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(19.3337f, 9.99969f);
        instancePath3.cubicTo(20.4379f, 10.0f, 21.3336f, 10.8955f, 21.3337f, 11.9997f);
        instancePath3.cubicTo(21.3337f, 13.104f, 20.438f, 13.9993f, 19.3337f, 13.9997f);
        instancePath3.cubicTo(18.2293f, 13.9995f, 17.3337f, 13.1042f, 17.3337f, 11.9997f);
        instancePath3.cubicTo(17.3339f, 10.8954f, 18.2294f, 9.99987f, 19.3337f, 9.99969f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
