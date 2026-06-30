package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class connect_kidwatch extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.040588f, 1.6f);
        instancePath.cubicTo(14.612605f, 1.6f, 15.144863f, 1.8018758f, 15.562161f, 2.1439788f);
        instancePath.cubicTo(15.979461f, 2.4860818f, 16.2818f, 2.9684122f, 16.393978f, 3.5293012f);
        instancePath.lineTo(16.393978f, 3.5293012f);
        instancePath.lineTo(16.61931f, 4.6561613f);
        instancePath.cubicTo(17.477869f, 4.813973f, 18.223148f, 5.2946806f, 18.725643f, 5.9671397f);
        instancePath.cubicTo(19.14932f, 6.5341234f, 19.4f, 7.2378073f, 19.4f, 8.0f);
        instancePath.lineTo(19.4f, 8.0f);
        instancePath.lineTo(19.4f, 16.0f);
        instancePath.cubicTo(19.4f, 16.762192f, 19.14932f, 17.465878f, 18.725643f, 18.03286f);
        instancePath.cubicTo(18.223148f, 18.70532f, 17.477869f, 19.186028f, 16.61931f, 19.343838f);
        instancePath.lineTo(16.61931f, 19.343838f);
        instancePath.lineTo(16.393982f, 20.470678f);
        instancePath.cubicTo(16.286753f, 21.006828f, 16.00579f, 21.471195f, 15.61674f, 21.809908f);
        instancePath.cubicTo(15.229675f, 22.14689f, 14.735665f, 22.359625f, 14.199301f, 22.39481f);
        instancePath.lineTo(14.199301f, 22.39481f);
        instancePath.lineTo(9.959412f, 22.4f);
        instancePath.cubicTo(9.412643f, 22.4f, 8.902194f, 22.215565f, 8.493759f, 21.900496f);
        instancePath.cubicTo(8.087106f, 21.586802f, 7.7814655f, 21.143675f, 7.6419187f, 20.62412f);
        instancePath.lineTo(7.6419187f, 20.62412f);
        instancePath.lineTo(7.3784494f, 19.343426f);
        instancePath.cubicTo(6.520835f, 19.18519f, 5.776415f, 18.704735f, 5.274358f, 18.03286f);
        instancePath.cubicTo(4.85068f, 17.465878f, 4.6f, 16.762192f, 4.6f, 16.0f);
        instancePath.lineTo(4.6f, 16.0f);
        instancePath.lineTo(4.6f, 8.0f);
        instancePath.cubicTo(4.6f, 7.2378073f, 4.85068f, 6.5341234f, 5.274358f, 5.9671397f);
        instancePath.cubicTo(5.776852f, 5.2946806f, 6.5221314f, 4.813973f, 7.38069f, 4.6561613f);
        instancePath.lineTo(7.38069f, 4.6561613f);
        instancePath.lineTo(7.606018f, 3.5293212f);
        instancePath.cubicTo(7.7181997f, 2.9684122f, 8.020539f, 2.4860818f, 8.437839f, 2.1439788f);
        instancePath.cubicTo(8.855137f, 1.8018758f, 9.387395f, 1.6f, 9.959412f, 1.6f);
        instancePath.lineTo(9.959412f, 1.6f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.6f, 8.6f);
        instancePath2.cubicTo(6.6f, 7.495431f, 7.495431f, 6.6f, 8.6f, 6.6f);
        instancePath2.lineTo(15.4f, 6.6f);
        instancePath2.cubicTo(16.50457f, 6.6f, 17.4f, 7.495431f, 17.4f, 8.6f);
        instancePath2.lineTo(17.4f, 15.4f);
        instancePath2.cubicTo(17.4f, 16.50457f, 16.50457f, 17.4f, 15.4f, 17.4f);
        instancePath2.lineTo(8.6f, 17.4f);
        instancePath2.cubicTo(7.495431f, 17.4f, 6.6f, 16.50457f, 6.6f, 15.4f);
        instancePath2.lineTo(6.6f, 8.6f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.0f, 4.0f);
        instancePath3.cubicTo(11.0f, 3.4477153f, 11.447715f, 3.0f, 12.0f, 3.0f);
        instancePath3.lineTo(12.0f, 3.0f);
        instancePath3.cubicTo(12.552285f, 3.0f, 13.0f, 3.4477153f, 13.0f, 4.0f);
        instancePath3.lineTo(13.0f, 4.0f);
        instancePath3.cubicTo(13.0f, 4.5522847f, 12.552285f, 5.0f, 12.0f, 5.0f);
        instancePath3.lineTo(12.0f, 5.0f);
        instancePath3.cubicTo(11.447715f, 5.0f, 11.0f, 4.5522847f, 11.0f, 4.0f);
        instancePath3.lineTo(11.0f, 4.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
