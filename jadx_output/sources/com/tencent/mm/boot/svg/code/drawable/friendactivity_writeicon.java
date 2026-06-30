package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class friendactivity_writeicon extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 90;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(40.7971f, 61.875f);
        instancePath.lineTo(71.25f, 61.875f);
        instancePath.cubicTo(73.3211f, 61.875f, 75.0f, 60.1961f, 75.0f, 58.125f);
        instancePath.lineTo(75.0f, 26.25f);
        instancePath.cubicTo(75.0f, 24.1789f, 73.3211f, 22.5f, 71.25f, 22.5f);
        instancePath.lineTo(18.75f, 22.5f);
        instancePath.cubicTo(16.6789f, 22.5f, 15.0f, 24.1789f, 15.0f, 26.25f);
        instancePath.lineTo(15.0f, 58.125f);
        instancePath.cubicTo(15.0f, 60.1961f, 16.6789f, 61.875f, 18.75f, 61.875f);
        instancePath.lineTo(33.75f, 61.875f);
        instancePath.lineTo(33.75f, 68.9132f);
        instancePath.lineTo(40.7971f, 61.875f);
        instancePath.close();
        instancePath.moveTo(18.75f, 67.5f);
        instancePath.cubicTo(13.5723f, 67.5f, 9.375f, 63.3027f, 9.375f, 58.125f);
        instancePath.lineTo(9.375f, 26.25f);
        instancePath.cubicTo(9.375f, 21.0723f, 13.5723f, 16.875f, 18.75f, 16.875f);
        instancePath.lineTo(71.25f, 16.875f);
        instancePath.cubicTo(76.4277f, 16.875f, 80.625f, 21.0723f, 80.625f, 26.25f);
        instancePath.lineTo(80.625f, 58.125f);
        instancePath.cubicTo(80.625f, 63.3027f, 76.4277f, 67.5f, 71.25f, 67.5f);
        instancePath.lineTo(43.125f, 67.5f);
        instancePath.lineTo(34.5266f, 76.0875f);
        instancePath.cubicTo(33.0622f, 77.552f, 30.6878f, 77.552f, 29.2234f, 76.0875f);
        instancePath.cubicTo(28.5201f, 75.3842f, 28.125f, 74.4571f, 28.125f, 73.4625f);
        instancePath.lineTo(28.125f, 67.5f);
        instancePath.lineTo(18.75f, 67.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
