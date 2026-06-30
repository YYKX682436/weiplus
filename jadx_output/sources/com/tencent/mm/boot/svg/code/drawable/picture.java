package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class picture extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.0f, 5.0f);
                instancePath.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
                instancePath.lineTo(21.0f, 4.0f);
                instancePath.cubicTo(21.5523f, 4.0f, 22.0f, 4.44772f, 22.0f, 5.0f);
                instancePath.lineTo(22.0f, 19.0f);
                instancePath.cubicTo(22.0f, 19.5523f, 21.5523f, 20.0f, 21.0f, 20.0f);
                instancePath.lineTo(3.0f, 20.0f);
                instancePath.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
                instancePath.lineTo(2.0f, 5.0f);
                instancePath.close();
                instancePath.moveTo(3.5f, 5.5f);
                instancePath.lineTo(20.5f, 5.5f);
                instancePath.lineTo(20.5f, 13.9008f);
                instancePath.lineTo(18.2381f, 11.9308f);
                instancePath.cubicTo(17.7785f, 11.5305f, 17.0973f, 11.52f, 16.6256f, 11.9059f);
                instancePath.lineTo(14.3182f, 13.7938f);
                instancePath.lineTo(9.81086f, 9.86805f);
                instancePath.cubicTo(9.35128f, 9.46778f, 8.67002f, 9.45728f, 8.19833f, 9.84321f);
                instancePath.lineTo(3.5f, 13.6873f);
                instancePath.lineTo(3.5f, 5.5f);
                instancePath.close();
                instancePath.moveTo(3.5f, 15.6254f);
                instancePath.lineTo(3.5f, 18.5f);
                instancePath.lineTo(20.5f, 18.5f);
                instancePath.lineTo(20.5f, 15.89f);
                instancePath.lineTo(17.4121f, 13.2005f);
                instancePath.lineTo(15.4656f, 14.7931f);
                instancePath.lineTo(16.8516f, 16.0003f);
                instancePath.lineTo(14.5677f, 16.0003f);
                instancePath.lineTo(8.98484f, 11.1378f);
                instancePath.lineTo(3.5f, 15.6254f);
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
