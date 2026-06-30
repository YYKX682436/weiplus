package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_down_bubble extends l95.c {
    private final int width = 80;
    private final int height = 41;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 41;
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
        instancePaint3.setColor(-526345);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(76.0f, 0.0f);
        instancePath.cubicTo(78.20914f, 0.0f, 80.0f, 1.7908609f, 80.0f, 4.0f);
        instancePath.lineTo(80.0f, 32.0f);
        instancePath.cubicTo(80.0f, 34.20914f, 78.20914f, 36.0f, 76.0f, 36.0f);
        instancePath.lineTo(4.0f, 36.0f);
        instancePath.cubicTo(1.7908609f, 36.0f, 0.0f, 34.20914f, 0.0f, 32.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-526345);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(64.0f, 35.0005f);
        instancePath2.cubicTo(64.0f, 35.5529f, 63.5369f, 36.0043f, 63.0364f, 36.238f);
        instancePath2.cubicTo(62.5985f, 36.4425f, 62.1833f, 36.7601f, 61.859f, 37.1152f);
        instancePath2.lineTo(58.7688f, 40.4994f);
        instancePath2.cubicTo(58.1567f, 41.1696f, 57.1811f, 41.1693f, 56.5694f, 40.4994f);
        instancePath2.lineTo(53.4791f, 37.1152f);
        instancePath2.cubicTo(53.1239f, 36.7262f, 52.5576f, 36.3829f, 51.9789f, 36.1835f);
        instancePath2.cubicTo(51.4566f, 36.0035f, 51.0f, 35.5529f, 51.0f, 35.0005f);
        instancePath2.lineTo(51.0f, 35.0005f);
        instancePath2.cubicTo(51.0f, 34.4481f, 51.4478f, 34.0002f, 52.0002f, 34.0002f);
        instancePath2.lineTo(62.9998f, 34.0002f);
        instancePath2.cubicTo(63.5522f, 34.0002f, 64.0f, 34.4481f, 64.0f, 35.0005f);
        instancePath2.lineTo(64.0f, 35.0005f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
