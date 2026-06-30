package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_view_setting_icon_regular extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        instancePath.moveTo(10.6667f, 18.6667f);
        instancePath.cubicTo(12.6014f, 18.6667f, 14.2153f, 20.0402f, 14.5864f, 21.8652f);
        instancePath.lineTo(29.3334f, 21.8667f);
        instancePath.lineTo(29.3334f, 23.4667f);
        instancePath.lineTo(14.5867f, 23.4668f);
        instancePath.cubicTo(14.216f, 25.2925f, 12.6019f, 26.6667f, 10.6667f, 26.6667f);
        instancePath.cubicTo(8.73163f, 26.6667f, 7.11745f, 25.2925f, 6.74679f, 23.4668f);
        instancePath.lineTo(2.66675f, 23.4667f);
        instancePath.lineTo(2.66675f, 21.8667f);
        instancePath.lineTo(6.74706f, 21.8652f);
        instancePath.cubicTo(7.11824f, 20.0402f, 8.7321f, 18.6667f, 10.6667f, 18.6667f);
        instancePath.close();
        instancePath.moveTo(10.6667f, 20.2667f);
        instancePath.cubicTo(9.34126f, 20.2667f, 8.26675f, 21.3412f, 8.26675f, 22.6667f);
        instancePath.cubicTo(8.26675f, 23.9922f, 9.34126f, 25.0667f, 10.6667f, 25.0667f);
        instancePath.cubicTo(11.9922f, 25.0667f, 13.0667f, 23.9922f, 13.0667f, 22.6667f);
        instancePath.cubicTo(13.0667f, 21.3412f, 11.9922f, 20.2667f, 10.6667f, 20.2667f);
        instancePath.close();
        instancePath.moveTo(21.3334f, 5.33334f);
        instancePath.cubicTo(24.007f, 5.33334f, 26.221f, 7.30055f, 26.6071f, 9.86644f);
        instancePath.lineTo(29.3334f, 9.86668f);
        instancePath.lineTo(29.3334f, 11.4667f);
        instancePath.lineTo(26.6073f, 11.4656f);
        instancePath.cubicTo(26.2218f, 14.0321f, 24.0074f, 16.0f, 21.3334f, 16.0f);
        instancePath.cubicTo(18.6594f, 16.0f, 16.445f, 14.0321f, 16.0595f, 11.4656f);
        instancePath.lineTo(2.66675f, 11.4667f);
        instancePath.lineTo(2.66675f, 9.86668f);
        instancePath.lineTo(16.0597f, 9.86644f);
        instancePath.cubicTo(16.4458f, 7.30055f, 18.6599f, 5.33334f, 21.3334f, 5.33334f);
        instancePath.close();
        instancePath.moveTo(21.3334f, 6.93334f);
        instancePath.cubicTo(19.2716f, 6.93334f, 17.6001f, 8.60481f, 17.6001f, 10.6667f);
        instancePath.cubicTo(17.6001f, 12.7285f, 19.2716f, 14.4f, 21.3334f, 14.4f);
        instancePath.cubicTo(23.3953f, 14.4f, 25.0667f, 12.7285f, 25.0667f, 10.6667f);
        instancePath.cubicTo(25.0667f, 8.60481f, 23.3953f, 6.93334f, 21.3334f, 6.93334f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
