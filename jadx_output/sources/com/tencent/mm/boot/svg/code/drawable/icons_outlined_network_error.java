package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_network_error extends l95.c {
    private final int width = 15;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 15;
        }
        if (i17 == 1) {
            return 12;
        }
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
            instancePaint3.setColor(-372399);
            instancePaint3.setColor(-372399);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(1.07021f, 4.07035f);
            instancePath.cubicTo(2.84366f, 2.2969f, 5.29366f, 1.2f, 7.99985f, 1.2f);
            instancePath.cubicTo(9.41081f, 1.2f, 10.7521f, 1.49818f, 11.9642f, 2.03496f);
            instancePath.lineTo(11.948f, 0.729773f);
            instancePath.cubicTo(10.7225f, 0.258377f, 9.39136f, 0.0f, 7.99985f, 0.0f);
            instancePath.cubicTo(4.96229f, 0.0f, 2.21229f, 1.23122f, 0.22168f, 3.22183f);
            instancePath.lineTo(1.07021f, 4.07035f);
            instancePath.close();
            instancePath.moveTo(7.99985f, 3.0f);
            instancePath.cubicTo(9.45272f, 3.0f, 10.8151f, 3.38729f, 11.9895f, 4.06427f);
            instancePath.lineTo(12.0074f, 5.50585f);
            instancePath.cubicTo(10.8836f, 4.68469f, 9.49833f, 4.2f, 7.99985f, 4.2f);
            instancePath.cubicTo(6.12209f, 4.2f, 4.42209f, 4.96112f, 3.19153f, 6.19167f);
            instancePath.lineTo(2.343f, 5.34315f);
            instancePath.cubicTo(3.79072f, 3.89543f, 5.79072f, 3.0f, 7.99985f, 3.0f);
            instancePath.close();
            instancePath.moveTo(5.31285f, 8.31299f);
            instancePath.cubicTo(6.00051f, 7.62533f, 6.95051f, 7.2f, 7.99985f, 7.2f);
            instancePath.cubicTo(9.0492f, 7.2f, 9.9992f, 7.62533f, 10.6869f, 8.31299f);
            instancePath.lineTo(11.5354f, 7.46447f);
            instancePath.cubicTo(10.6306f, 6.55964f, 9.38057f, 6.0f, 7.99985f, 6.0f);
            instancePath.cubicTo(6.61914f, 6.0f, 5.36914f, 6.55964f, 4.46432f, 7.46447f);
            instancePath.lineTo(5.31285f, 8.31299f);
            instancePath.close();
            instancePath.moveTo(6.58564f, 9.58579f);
            instancePath.lineTo(7.99985f, 11.0f);
            instancePath.lineTo(9.41407f, 9.58579f);
            instancePath.cubicTo(9.05214f, 9.22386f, 8.55214f, 9.0f, 7.99985f, 9.0f);
            instancePath.cubicTo(7.44757f, 9.0f, 6.94757f, 9.22386f, 6.58564f, 9.58579f);
            instancePath.close();
            instancePath.moveTo(13.1579f, 1.5f);
            instancePath.lineTo(14.3421f, 1.5f);
            instancePath.lineTo(14.2632f, 7.84211f);
            instancePath.lineTo(13.2368f, 7.84211f);
            instancePath.lineTo(13.1579f, 1.5f);
            instancePath.close();
            instancePath.moveTo(13.75f, 11.0592f);
            instancePath.cubicTo(13.3289f, 11.0592f, 13.0f, 10.7303f, 13.0f, 10.3092f);
            instancePath.cubicTo(13.0f, 9.88158f, 13.3289f, 9.55921f, 13.75f, 9.55921f);
            instancePath.cubicTo(14.1776f, 9.55921f, 14.5f, 9.88158f, 14.5f, 10.3092f);
            instancePath.cubicTo(14.5f, 10.7303f, 14.1776f, 11.0592f, 13.75f, 11.0592f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
