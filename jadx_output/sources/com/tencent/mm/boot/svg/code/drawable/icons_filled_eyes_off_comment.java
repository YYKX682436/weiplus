package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eyes_off_comment extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(17.0f, 12.0f);
        instancePath.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
        instancePath.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
        instancePath.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
        instancePath.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(14.051692f, 15.113071f);
        instancePath.cubicTo(13.702494f, 15.657558f, 13.5f, 16.305132f, 13.5f, 17.0f);
        instancePath.cubicTo(13.5f, 18.932997f, 15.067003f, 20.5f, 17.0f, 20.5f);
        instancePath.cubicTo(17.694868f, 20.5f, 18.342442f, 20.297506f, 18.886929f, 19.948309f);
        instancePath.lineTo(14.051692f, 15.113071f);
        instancePath.close();
        instancePath.moveTo(17.0f, 13.5f);
        instancePath.cubicTo(16.305132f, 13.5f, 15.657558f, 13.702494f, 15.113071f, 14.051692f);
        instancePath.lineTo(19.948309f, 18.886929f);
        instancePath.cubicTo(20.297506f, 18.342442f, 20.5f, 17.694868f, 20.5f, 17.0f);
        instancePath.cubicTo(20.5f, 15.067003f, 18.932997f, 13.5f, 17.0f, 13.5f);
        instancePath.close();
        instancePath.moveTo(12.0f, 2.8f);
        instancePath.cubicTo(16.807985f, 2.8f, 20.972399f, 5.647857f, 23.000246f, 9.800502f);
        instancePath.cubicTo(22.59191f, 10.636313f, 22.097034f, 11.419257f, 21.527794f, 12.136749f);
        instancePath.cubicTo(20.356958f, 10.999647f, 18.760185f, 10.3f, 17.0f, 10.3f);
        instancePath.cubicTo(16.459064f, 10.3f, 15.93356f, 10.366077f, 15.431122f, 10.490602f);
        instancePath.cubicTo(15.4765215f, 10.267731f, 15.5f, 10.036607f, 15.5f, 9.8f);
        instancePath.cubicTo(15.5f, 7.8670034f, 13.932997f, 6.3f, 12.0f, 6.3f);
        instancePath.cubicTo(10.067003f, 6.3f, 8.5f, 7.8670034f, 8.5f, 9.8f);
        instancePath.cubicTo(8.5f, 11.577803f, 9.825485f, 13.046021f, 11.542117f, 13.270319f);
        instancePath.cubicTo(10.898822f, 14.260761f, 10.518794f, 15.439152f, 10.500678f, 16.70511f);
        instancePath.cubicTo(6.33763f, 16.184742f, 2.8143306f, 13.514596f, 1.0002397f, 9.80049f);
        instancePath.cubicTo(3.0276008f, 5.647857f, 7.1920156f, 2.8f, 12.0f, 2.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
