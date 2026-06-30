package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class filing_filled extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.0f, 2.5f);
        instancePath.lineTo(4.0f, 5.5f);
        instancePath.lineTo(4.0f, 11.2538f);
        instancePath.cubicTo(4.0f, 16.1001f, 7.29835f, 20.3246f, 12.0f, 21.5f);
        instancePath.cubicTo(16.7017f, 20.3246f, 20.0f, 16.1001f, 20.0f, 11.2538f);
        instancePath.lineTo(20.0f, 5.5f);
        instancePath.lineTo(12.0f, 2.5f);
        instancePath.close();
        instancePath.moveTo(17.531f, 8.97838f);
        instancePath.lineTo(12.555f, 13.9544f);
        instancePath.cubicTo(12.0281f, 14.4813f, 11.1732f, 14.4813f, 10.6463f, 13.9544f);
        instancePath.lineTo(8.07031f, 11.3784f);
        instancePath.lineTo(9.13097f, 10.3177f);
        instancePath.lineTo(11.6006f, 12.7874f);
        instancePath.lineTo(16.4703f, 7.91772f);
        instancePath.lineTo(17.531f, 8.97838f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
