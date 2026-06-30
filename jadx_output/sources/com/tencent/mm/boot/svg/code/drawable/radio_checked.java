package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class radio_checked extends l95.c {
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
        instancePaint3.setColor(-16268960);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 12.0f);
        instancePath.cubicTo(1.0f, 5.92487f, 5.92487f, 1.0f, 12.0f, 1.0f);
        instancePath.lineTo(12.0f, 1.0f);
        instancePath.cubicTo(18.0751f, 1.0f, 23.0f, 5.92487f, 23.0f, 12.0f);
        instancePath.lineTo(23.0f, 12.0f);
        instancePath.cubicTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f);
        instancePath.lineTo(12.0f, 23.0f);
        instancePath.cubicTo(5.92487f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f);
        instancePath.lineTo(1.0f, 12.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(9.85638f, 16.1306f);
        instancePath2.lineTo(6.22656f, 12.5008f);
        instancePath2.lineTo(7.13402f, 11.5933f);
        instancePath2.lineTo(10.3101f, 14.7694f);
        instancePath2.lineTo(17.5697f, 7.50977f);
        instancePath2.lineTo(18.4772f, 8.41722f);
        instancePath2.lineTo(10.7638f, 16.1306f);
        instancePath2.cubicTo(10.5132f, 16.3812f, 10.107f, 16.3812f, 9.85638f, 16.1306f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
