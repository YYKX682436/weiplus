package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_folder extends l95.c {
    private final int width = 104;
    private final int height = 104;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 104;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(104.0f, 0.0f);
        instancePath.lineTo(104.0f, 104.0f);
        instancePath.lineTo(0.0f, 104.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(37.7062f, 17.933332f);
        instancePath2.lineTo(45.8312f, 24.433332f);
        instancePath2.lineTo(91.0f, 24.433332f);
        instancePath2.cubicTo(92.03093f, 24.433332f, 92.964264f, 24.8512f, 93.63986f, 25.526802f);
        instancePath2.cubicTo(94.31547f, 26.202402f, 94.73333f, 27.135735f, 94.73333f, 28.166666f);
        instancePath2.lineTo(94.73333f, 28.166666f);
        instancePath2.lineTo(94.73333f, 82.333336f);
        instancePath2.cubicTo(94.73333f, 83.364265f, 94.31547f, 84.2976f, 93.63986f, 84.9732f);
        instancePath2.cubicTo(92.964264f, 85.648796f, 92.03093f, 86.066666f, 91.0f, 86.066666f);
        instancePath2.lineTo(91.0f, 86.066666f);
        instancePath2.lineTo(13.0f, 86.066666f);
        instancePath2.cubicTo(11.969069f, 86.066666f, 11.035735f, 85.648796f, 10.360135f, 84.9732f);
        instancePath2.cubicTo(9.684534f, 84.2976f, 9.266666f, 83.364265f, 9.266666f, 82.333336f);
        instancePath2.lineTo(9.266666f, 82.333336f);
        instancePath2.lineTo(9.266666f, 21.666666f);
        instancePath2.cubicTo(9.266666f, 20.635735f, 9.684534f, 19.702402f, 10.360135f, 19.026802f);
        instancePath2.cubicTo(11.035735f, 18.3512f, 11.969069f, 17.933332f, 13.0f, 17.933332f);
        instancePath2.lineTo(13.0f, 17.933332f);
        instancePath2.lineTo(37.7062f, 17.933332f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.666667f, 41.166668f);
        instancePath3.lineTo(95.333336f, 41.166668f);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
