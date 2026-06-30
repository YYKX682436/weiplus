package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_to_short extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 80;
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
                instancePaint3.setColor(-1);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(40.0f, 73.333336f);
                instancePath.cubicTo(21.590508f, 73.333336f, 6.6666665f, 58.409492f, 6.6666665f, 40.0f);
                instancePath.cubicTo(6.6666665f, 21.590508f, 21.590508f, 6.6666665f, 40.0f, 6.6666665f);
                instancePath.cubicTo(58.409492f, 6.6666665f, 73.333336f, 21.590508f, 73.333336f, 40.0f);
                instancePath.cubicTo(73.333336f, 58.409492f, 58.409492f, 73.333336f, 40.0f, 73.333336f);
                instancePath.close();
                instancePath.moveTo(37.45573f, 20.452475f);
                instancePath.lineTo(37.820312f, 45.77474f);
                instancePath.lineTo(42.172527f, 45.77474f);
                instancePath.lineTo(42.53711f, 20.452475f);
                instancePath.lineTo(37.45573f, 20.452475f);
                instancePath.close();
                instancePath.moveTo(39.985027f, 57.008465f);
                instancePath.cubicTo(41.69401f, 57.008465f, 42.99284f, 55.73242f, 42.99284f, 54.06901f);
                instancePath.cubicTo(42.99284f, 52.405598f, 41.69401f, 51.12956f, 39.985027f, 51.12956f);
                instancePath.cubicTo(38.321617f, 51.12956f, 37.0f, 52.405598f, 37.0f, 54.06901f);
                instancePath.cubicTo(37.0f, 55.73242f, 38.321617f, 57.008465f, 39.985027f, 57.008465f);
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
