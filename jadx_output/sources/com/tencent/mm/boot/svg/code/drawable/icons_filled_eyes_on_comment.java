package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eyes_on_comment extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 5.0f);
                instancePath.cubicTo(16.807985f, 5.0f, 20.972399f, 7.847857f, 23.000246f, 12.000502f);
                instancePath.cubicTo(20.971735f, 16.152597f, 16.807602f, 19.0f, 12.0f, 19.0f);
                instancePath.cubicTo(7.192399f, 19.0f, 3.0282645f, 16.152597f, 1.0002397f, 12.000491f);
                instancePath.cubicTo(3.0276008f, 7.847857f, 7.1920156f, 5.0f, 12.0f, 5.0f);
                instancePath.close();
                instancePath.moveTo(12.0f, 8.5f);
                instancePath.cubicTo(10.067003f, 8.5f, 8.5f, 10.067003f, 8.5f, 12.0f);
                instancePath.cubicTo(8.5f, 13.932997f, 10.067003f, 15.5f, 12.0f, 15.5f);
                instancePath.cubicTo(13.932997f, 15.5f, 15.5f, 13.932997f, 15.5f, 12.0f);
                instancePath.cubicTo(15.5f, 10.067003f, 13.932997f, 8.5f, 12.0f, 8.5f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
