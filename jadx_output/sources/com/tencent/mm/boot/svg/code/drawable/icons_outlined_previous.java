package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_previous extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(31.322699f, 25.5f);
        instancePath.lineTo(38.61396f, 32.791264f);
        instancePath.lineTo(35.43198f, 35.973244f);
        instancePath.lineTo(25.88604f, 26.427301f);
        instancePath.lineTo(23.764719f, 24.305983f);
        instancePath.cubicTo(23.178932f, 23.720196f, 23.178932f, 22.770449f, 23.764719f, 22.184662f);
        instancePath.lineTo(35.43198f, 10.5174f);
        instancePath.lineTo(38.61396f, 13.69938f);
        instancePath.lineTo(31.313341f, 21.0f);
        instancePath.lineTo(45.0f, 21.0f);
        instancePath.cubicTo(54.941124f, 21.0f, 63.0f, 29.058874f, 63.0f, 39.0f);
        instancePath.cubicTo(63.0f, 48.941124f, 54.941124f, 57.0f, 45.0f, 57.0f);
        instancePath.lineTo(12.0f, 57.0f);
        instancePath.lineTo(12.0f, 52.5f);
        instancePath.lineTo(45.0f, 52.5f);
        instancePath.cubicTo(52.455845f, 52.5f, 58.5f, 46.455845f, 58.5f, 39.0f);
        instancePath.cubicTo(58.5f, 31.544155f, 52.455845f, 25.5f, 45.0f, 25.5f);
        instancePath.lineTo(31.322699f, 25.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
