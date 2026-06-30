package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_multi_task_star_line_filled extends l95.c {
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
        instancePath.moveTo(12.0f, 18.5534f);
        instancePath.lineTo(7.07833f, 21.1409f);
        instancePath.cubicTo(6.31422f, 21.5426f, 5.40742f, 20.8613f, 5.54991f, 20.0304f);
        instancePath.lineTo(6.48986f, 14.5501f);
        instancePath.lineTo(2.50819f, 10.669f);
        instancePath.cubicTo(1.89f, 10.0664f, 2.25779f, 8.99341f, 3.09199f, 8.8722f);
        instancePath.lineTo(8.59453f, 8.07263f);
        instancePath.lineTo(11.0553f, 3.08648f);
        instancePath.cubicTo(11.4374f, 2.31235f, 12.5715f, 2.33057f, 12.9446f, 3.08648f);
        instancePath.lineTo(15.4054f, 8.07263f);
        instancePath.lineTo(20.9079f, 8.8722f);
        instancePath.cubicTo(21.7622f, 8.99633f, 22.0954f, 10.0806f, 21.4917f, 10.669f);
        instancePath.lineTo(17.51f, 14.5501f);
        instancePath.lineTo(18.45f, 20.0304f);
        instancePath.cubicTo(18.5959f, 20.8813f, 17.6677f, 21.5332f, 16.9216f, 21.1409f);
        instancePath.lineTo(12.0f, 18.5534f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
