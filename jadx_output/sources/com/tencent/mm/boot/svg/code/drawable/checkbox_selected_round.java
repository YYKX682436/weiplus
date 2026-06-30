package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_round extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(11.0f, 3.0f);
                instancePath.cubicTo(15.970563f, 3.0f, 20.0f, 7.029437f, 20.0f, 12.0f);
                instancePath.cubicTo(20.0f, 16.970562f, 15.970563f, 21.0f, 11.0f, 21.0f);
                instancePath.cubicTo(6.029437f, 21.0f, 2.0f, 16.970562f, 2.0f, 12.0f);
                instancePath.cubicTo(2.0f, 7.029437f, 6.029437f, 3.0f, 11.0f, 3.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16268960);
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(12.0f, 22.0f);
                instancePath2.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                instancePath2.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                instancePath2.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                instancePath2.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                instancePath2.close();
                instancePath2.moveTo(10.823438f, 14.139317f);
                instancePath2.lineTo(8.057538f, 11.373417f);
                instancePath2.lineTo(7.0f, 12.430955f);
                instancePath2.lineTo(10.1187f, 15.552128f);
                instancePath2.cubicTo(10.118736f, 15.552164f, 10.1187725f, 15.5522f, 10.118809f, 15.552237f);
                instancePath2.cubicTo(10.509253f, 15.9428425f, 11.142417f, 15.942974f, 11.533023f, 15.55253f);
                instancePath2.lineTo(17.485281f, 9.602528f);
                instancePath2.lineTo(16.422754f, 8.54f);
                instancePath2.lineTo(10.823438f, 14.139317f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
