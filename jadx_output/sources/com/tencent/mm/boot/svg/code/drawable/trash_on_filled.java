package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class trash_on_filled extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(18.4118f, 6.5f);
                instancePath.lineTo(17.6107f, 20.1174f);
                instancePath.cubicTo(17.5486f, 21.1746f, 16.6731f, 22.0f, 15.6142f, 22.0f);
                instancePath.lineTo(8.38581f, 22.0f);
                instancePath.cubicTo(7.32686f, 22.0f, 6.45145f, 21.1746f, 6.38926f, 20.1174f);
                instancePath.lineTo(5.58824f, 6.5f);
                instancePath.lineTo(3.5f, 6.5f);
                instancePath.lineTo(3.5f, 5.5f);
                instancePath.cubicTo(3.5f, 5.22385f, 3.72386f, 5.0f, 4.0f, 5.0f);
                instancePath.lineTo(20.0f, 5.0f);
                instancePath.cubicTo(20.2761f, 5.0f, 20.5f, 5.22385f, 20.5f, 5.5f);
                instancePath.lineTo(20.5f, 6.5f);
                instancePath.lineTo(18.4118f, 6.5f);
                instancePath.close();
                instancePath.moveTo(10.0f, 2.50003f);
                instancePath.lineTo(14.0f, 2.50003f);
                instancePath.cubicTo(14.2761f, 2.50003f, 14.5f, 2.72389f, 14.5f, 3.00003f);
                instancePath.lineTo(14.5f, 4.0f);
                instancePath.lineTo(9.5f, 4.0f);
                instancePath.lineTo(9.5f, 3.00003f);
                instancePath.cubicTo(9.5f, 2.72389f, 9.72386f, 2.50003f, 10.0f, 2.50003f);
                instancePath.close();
                instancePath.moveTo(9.0f, 8.99998f);
                instancePath.lineTo(9.5f, 18.0f);
                instancePath.lineTo(11.0f, 18.0f);
                instancePath.lineTo(10.6f, 8.99998f);
                instancePath.lineTo(9.0f, 8.99998f);
                instancePath.close();
                instancePath.moveTo(13.5f, 8.99998f);
                instancePath.lineTo(13.0f, 18.0f);
                instancePath.lineTo(14.5f, 18.0f);
                instancePath.lineTo(15.0f, 8.99998f);
                instancePath.lineTo(13.5f, 8.99998f);
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
