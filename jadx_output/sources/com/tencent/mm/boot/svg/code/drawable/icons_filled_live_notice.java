package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_live_notice extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePath.moveTo(5.57857f, 3.21429f);
                instancePath.lineTo(6.82857f, 3.21429f);
                instancePath.lineTo(6.82857f, 4.41484f);
                instancePath.lineTo(13.1714f, 4.41484f);
                instancePath.lineTo(13.1714f, 3.21429f);
                instancePath.lineTo(14.4214f, 3.21429f);
                instancePath.lineTo(14.4214f, 4.41484f);
                instancePath.lineTo(16.5495f, 4.41484f);
                instancePath.cubicTo(16.9514f, 4.41484f, 17.2772f, 4.74064f, 17.2772f, 5.14254f);
                instancePath.lineTo(17.2772f, 16.058f);
                instancePath.cubicTo(17.2772f, 16.4599f, 16.9514f, 16.7857f, 16.5495f, 16.7857f);
                instancePath.lineTo(3.45091f, 16.7857f);
                instancePath.cubicTo(3.04901f, 16.7857f, 2.72321f, 16.4599f, 2.72321f, 16.058f);
                instancePath.lineTo(2.72321f, 5.14254f);
                instancePath.cubicTo(2.72321f, 4.74064f, 3.04901f, 4.41484f, 3.45091f, 4.41484f);
                instancePath.lineTo(5.57857f, 4.41484f);
                instancePath.lineTo(5.57857f, 3.21429f);
                instancePath.close();
                instancePath.moveTo(16.0268f, 5.66432f);
                instancePath.lineTo(3.97321f, 5.66432f);
                instancePath.lineTo(3.97321f, 7.80718f);
                instancePath.lineTo(16.0268f, 7.80718f);
                instancePath.lineTo(16.0268f, 5.66432f);
                instancePath.close();
                instancePath.moveTo(13.6939f, 10.4451f);
                instancePath.lineTo(9.77916f, 14.3599f);
                instancePath.cubicTo(9.38039f, 14.7586f, 8.73387f, 14.7586f, 8.33511f, 14.3599f);
                instancePath.lineTo(6.31126f, 12.336f);
                instancePath.lineTo(7.11351f, 11.5338f);
                instancePath.lineTo(9.05713f, 13.4774f);
                instancePath.lineTo(12.8917f, 9.64285f);
                instancePath.lineTo(13.6939f, 10.4451f);
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
