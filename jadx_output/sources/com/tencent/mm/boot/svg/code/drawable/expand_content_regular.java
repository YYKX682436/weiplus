package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class expand_content_regular extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(4.0f, 17.8f);
        instancePath.lineTo(4.0f, 11.4f);
        instancePath.lineTo(5.2f, 11.4f);
        instancePath.lineTo(5.2f, 17.8f);
        instancePath.cubicTo(5.2f, 18.0899f, 5.20046f, 18.2713f, 5.21162f, 18.4079f);
        instancePath.cubicTo(5.22222f, 18.5376f, 5.23934f, 18.5734f, 5.24356f, 18.5816f);
        instancePath.cubicTo(5.2819f, 18.6569f, 5.34311f, 18.7181f, 5.41836f, 18.7564f);
        instancePath.cubicTo(5.42664f, 18.7607f, 5.46244f, 18.7778f, 5.59209f, 18.7884f);
        instancePath.cubicTo(5.72874f, 18.7995f, 5.9101f, 18.8f, 6.2f, 18.8f);
        instancePath.lineTo(12.6f, 18.8f);
        instancePath.lineTo(12.6f, 20.0f);
        instancePath.lineTo(6.2f, 20.0f);
        instancePath.cubicTo(5.92988f, 20.0f, 5.69119f, 20.0005f, 5.49434f, 19.9844f);
        instancePath.cubicTo(5.29048f, 19.9677f, 5.07927f, 19.9304f, 4.87363f, 19.8256f);
        instancePath.cubicTo(4.57257f, 19.6722f, 4.32781f, 19.4274f, 4.17442f, 19.1264f);
        instancePath.cubicTo(4.06964f, 18.9207f, 4.03228f, 18.7095f, 4.01563f, 18.5057f);
        instancePath.cubicTo(3.99954f, 18.3088f, 4.0f, 18.0701f, 4.0f, 17.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(20.0f, 6.2f);
        instancePath2.lineTo(20.0f, 12.6f);
        instancePath2.lineTo(18.8f, 12.6f);
        instancePath2.lineTo(18.8f, 6.2f);
        instancePath2.cubicTo(18.8f, 5.9101f, 18.7995f, 5.72874f, 18.7884f, 5.59209f);
        instancePath2.cubicTo(18.7778f, 5.46244f, 18.7607f, 5.42664f, 18.7564f, 5.41836f);
        instancePath2.cubicTo(18.7181f, 5.34311f, 18.6569f, 5.2819f, 18.5816f, 5.24356f);
        instancePath2.cubicTo(18.5734f, 5.23934f, 18.5376f, 5.22222f, 18.4079f, 5.21162f);
        instancePath2.cubicTo(18.2713f, 5.20046f, 18.0899f, 5.2f, 17.8f, 5.2f);
        instancePath2.lineTo(11.4f, 5.2f);
        instancePath2.lineTo(11.4f, 4.0f);
        instancePath2.lineTo(17.8f, 4.0f);
        instancePath2.cubicTo(18.0701f, 4.0f, 18.3088f, 3.99954f, 18.5057f, 4.01563f);
        instancePath2.cubicTo(18.7095f, 4.03228f, 18.9207f, 4.06964f, 19.1264f, 4.17442f);
        instancePath2.cubicTo(19.4274f, 4.32781f, 19.6722f, 4.57258f, 19.8256f, 4.87363f);
        instancePath2.cubicTo(19.9304f, 5.07927f, 19.9677f, 5.29048f, 19.9844f, 5.49434f);
        instancePath2.cubicTo(20.0005f, 5.69119f, 20.0f, 5.92988f, 20.0f, 6.2f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
