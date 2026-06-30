package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_star_self extends l95.c {
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
                instancePath.moveTo(22.0f, 20.8f);
                instancePath.lineTo(22.0f, 22.0f);
                instancePath.lineTo(15.5f, 22.0f);
                instancePath.lineTo(15.5f, 20.8f);
                instancePath.lineTo(22.0f, 20.8f);
                instancePath.close();
                instancePath.moveTo(12.442566f, 3.1977727f);
                instancePath.cubicTo(12.639778f, 3.2951028f, 12.799406f, 3.4547305f, 12.896736f, 3.651943f);
                instancePath.lineTo(15.232819f, 8.385364f);
                instancePath.lineTo(20.456459f, 9.144403f);
                instancePath.cubicTo(21.003004f, 9.223821f, 21.381685f, 9.731263f, 21.302267f, 10.277808f);
                instancePath.cubicTo(21.270643f, 10.495445f, 21.168156f, 10.696588f, 21.010672f, 10.850097f);
                instancePath.lineTo(17.881338f, 13.899285f);
                instancePath.lineTo(16.16334f, 13.899285f);
                instancePath.lineTo(19.883f, 10.273f);
                instancePath.lineTo(14.435941f, 9.482173f);
                instancePath.lineTo(12.0f, 4.547f);
                instancePath.lineTo(9.564059f, 9.482173f);
                instancePath.lineTo(4.116f, 10.273f);
                instancePath.lineTo(8.058566f, 14.115607f);
                instancePath.lineTo(7.127f, 19.541f);
                instancePath.lineTo(12.0f, 16.979227f);
                instancePath.lineTo(13.999339f, 18.030285f);
                instancePath.lineTo(13.999339f, 19.385286f);
                instancePath.lineTo(12.0f, 18.334957f);
                instancePath.lineTo(7.3278346f, 20.79126f);
                instancePath.cubicTo(6.8389897f, 21.048262f, 6.2343626f, 20.860315f, 5.9773617f, 20.37147f);
                instancePath.cubicTo(5.875023f, 20.17681f, 5.839708f, 19.953842f, 5.876885f, 19.737083f);
                instancePath.lineTo(6.7691894f, 14.534551f);
                instancePath.lineTo(2.9893277f, 10.850097f);
                instancePath.cubicTo(2.5938442f, 10.464595f, 2.5857518f, 9.831482f, 2.9712532f, 9.435999f);
                instancePath.cubicTo(3.1247616f, 9.278515f, 3.3259041f, 9.176027f, 3.5435412f, 9.144403f);
                instancePath.lineTo(8.767181f, 8.385364f);
                instancePath.lineTo(11.103264f, 3.651943f);
                instancePath.cubicTo(11.347686f, 3.1566894f, 11.947312f, 2.9533503f, 12.442566f, 3.1977727f);
                instancePath.close();
                instancePath.moveTo(22.0f, 18.1f);
                instancePath.lineTo(22.0f, 19.3f);
                instancePath.lineTo(15.5f, 19.3f);
                instancePath.lineTo(15.5f, 18.1f);
                instancePath.lineTo(22.0f, 18.1f);
                instancePath.close();
                instancePath.moveTo(22.0f, 15.4f);
                instancePath.lineTo(22.0f, 16.6f);
                instancePath.lineTo(15.5f, 16.6f);
                instancePath.lineTo(15.5f, 15.4f);
                instancePath.lineTo(22.0f, 15.4f);
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
