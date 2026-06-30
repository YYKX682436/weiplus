package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mall_wallet_icon extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
        }
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(110.0f, 70.0f);
            instancePath.lineTo(110.0f, 71.0f);
            instancePath.cubicTo(110.0f, 71.34247f, 109.96557f, 71.67689f, 109.89998f, 72.0f);
            instancePath.lineTo(110.0f, 72.0f);
            instancePath.lineTo(110.0f, 95.0f);
            instancePath.cubicTo(110.0f, 97.76142f, 107.76142f, 100.0f, 105.0f, 100.0f);
            instancePath.lineTo(15.0f, 100.0f);
            instancePath.cubicTo(12.238576f, 100.0f, 10.0f, 97.76142f, 10.0f, 95.0f);
            instancePath.lineTo(10.0f, 25.0f);
            instancePath.cubicTo(10.0f, 22.238577f, 12.238576f, 20.0f, 15.0f, 20.0f);
            instancePath.lineTo(105.0f, 20.0f);
            instancePath.cubicTo(107.76142f, 20.0f, 110.0f, 22.238577f, 110.0f, 25.0f);
            instancePath.lineTo(110.0f, 48.0f);
            instancePath.lineTo(109.89998f, 48.0f);
            instancePath.cubicTo(109.96557f, 48.32311f, 110.0f, 48.657536f, 110.0f, 49.0f);
            instancePath.lineTo(110.0f, 50.0f);
            instancePath.lineTo(110.0f, 70.0f);
            instancePath.close();
            instancePath.moveTo(104.0f, 70.0f);
            instancePath.lineTo(104.0f, 50.0f);
            instancePath.lineTo(75.0f, 50.0f);
            instancePath.cubicTo(69.47715f, 50.0f, 65.0f, 54.477154f, 65.0f, 60.0f);
            instancePath.cubicTo(65.0f, 65.52285f, 69.47715f, 70.0f, 75.0f, 70.0f);
            instancePath.lineTo(104.0f, 70.0f);
            instancePath.close();
            instancePath.moveTo(104.0f, 44.0f);
            instancePath.lineTo(104.0f, 26.0f);
            instancePath.lineTo(16.0f, 26.0f);
            instancePath.lineTo(16.0f, 94.0f);
            instancePath.lineTo(104.0f, 94.0f);
            instancePath.lineTo(104.0f, 76.0f);
            instancePath.lineTo(75.0f, 76.0f);
            instancePath.cubicTo(66.163445f, 76.0f, 59.0f, 68.836555f, 59.0f, 60.0f);
            instancePath.cubicTo(59.0f, 51.163445f, 66.163445f, 44.0f, 75.0f, 44.0f);
            instancePath.lineTo(104.0f, 44.0f);
            instancePath.close();
            instancePath.moveTo(75.0f, 65.0f);
            instancePath.cubicTo(72.23858f, 65.0f, 70.0f, 62.761425f, 70.0f, 60.0f);
            instancePath.cubicTo(70.0f, 57.238575f, 72.23858f, 55.0f, 75.0f, 55.0f);
            instancePath.cubicTo(77.76142f, 55.0f, 80.0f, 57.238575f, 80.0f, 60.0f);
            instancePath.cubicTo(80.0f, 62.761425f, 77.76142f, 65.0f, 75.0f, 65.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
