package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_complain extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(88.0f, 74.0f);
                instancePath.lineTo(88.0f, 74.0f);
                instancePath.lineTo(56.0f, 15.0f);
                instancePath.lineTo(56.0f, 15.0f);
                instancePath.cubicTo(54.97f, 11.577649f, 51.78977f, 9.0f, 48.0f, 9.0f);
                instancePath.cubicTo(44.21023f, 9.0f, 41.029545f, 11.577649f, 40.0f, 15.0f);
                instancePath.lineTo(40.0f, 15.0f);
                instancePath.lineTo(8.0f, 74.0f);
                instancePath.lineTo(8.0f, 74.0f);
                instancePath.cubicTo(7.5070333f, 75.54358f, 7.0f, 77.10677f, 7.0f, 79.0f);
                instancePath.cubicTo(7.0f, 83.32397f, 10.671322f, 87.0f, 15.0f, 87.0f);
                instancePath.cubicTo(15.497933f, 87.0f, 15.791311f, 86.98221f, 16.0f, 87.0f);
                instancePath.lineTo(16.0f, 87.0f);
                instancePath.lineTo(48.0f, 87.0f);
                instancePath.lineTo(48.0f, 79.0f);
                instancePath.lineTo(44.0f, 79.0f);
                instancePath.lineTo(44.0f, 71.0f);
                instancePath.lineTo(48.0f, 71.0f);
                instancePath.lineTo(48.0f, 62.0f);
                instancePath.lineTo(44.0f, 62.0f);
                instancePath.lineTo(42.0f, 34.0f);
                instancePath.lineTo(48.0f, 34.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 34.0f);
                instancePath.lineTo(54.0f, 34.0f);
                instancePath.lineTo(52.0f, 62.0f);
                instancePath.lineTo(48.0f, 62.0f);
                instancePath.lineTo(48.0f, 71.0f);
                instancePath.lineTo(52.0f, 71.0f);
                instancePath.lineTo(52.0f, 79.0f);
                instancePath.lineTo(48.0f, 79.0f);
                instancePath.lineTo(48.0f, 87.0f);
                instancePath.lineTo(80.0f, 87.0f);
                instancePath.lineTo(80.0f, 87.0f);
                instancePath.cubicTo(80.20824f, 86.98221f, 80.50207f, 87.0f, 81.0f, 87.0f);
                instancePath.cubicTo(85.328674f, 87.0f, 89.0f, 83.32397f, 89.0f, 79.0f);
                instancePath.cubicTo(89.0f, 77.10677f, 88.49251f, 75.54358f, 88.0f, 74.0f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
