package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_mic_on extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(34.640625f, 24.0f);
        instancePath.lineTo(34.640625f, 48.0f);
        instancePath.cubicTo(34.640625f, 55.289062f, 40.597656f, 61.19922f, 47.94922f, 61.19922f);
        instancePath.cubicTo(55.30078f, 61.19922f, 61.26172f, 55.289062f, 61.26172f, 48.0f);
        instancePath.lineTo(61.26172f, 24.0f);
        instancePath.cubicTo(61.26172f, 16.710938f, 55.30078f, 10.800781f, 47.94922f, 10.800781f);
        instancePath.cubicTo(40.597656f, 10.800781f, 34.640625f, 16.710938f, 34.640625f, 24.0f);
        instancePath.close();
        instancePath.moveTo(22.539062f, 42.0f);
        instancePath.lineTo(22.539062f, 48.0f);
        instancePath.cubicTo(22.539062f, 61.91797f, 33.91797f, 73.19922f, 47.94922f, 73.19922f);
        instancePath.cubicTo(61.984375f, 73.19922f, 73.359375f, 61.91797f, 73.359375f, 48.0f);
        instancePath.lineTo(73.359375f, 42.0f);
        instancePath.lineTo(78.19922f, 42.0f);
        instancePath.lineTo(78.19922f, 48.0f);
        instancePath.cubicTo(78.19922f, 63.76172f, 65.94531f, 76.68359f, 50.371094f, 77.90625f);
        instancePath.lineTo(50.371094f, 90.0f);
        instancePath.lineTo(45.53125f, 90.0f);
        instancePath.lineTo(45.53125f, 77.90625f);
        instancePath.cubicTo(29.953125f, 76.68359f, 17.699219f, 63.76172f, 17.699219f, 48.0f);
        instancePath.lineTo(17.699219f, 42.0f);
        instancePath.close();
        instancePath.moveTo(47.94922f, 6.0f);
        instancePath.cubicTo(57.972656f, 6.0f, 66.10156f, 14.058594f, 66.10156f, 24.0f);
        instancePath.lineTo(66.10156f, 48.0f);
        instancePath.cubicTo(66.10156f, 57.941406f, 57.972656f, 66.0f, 47.94922f, 66.0f);
        instancePath.cubicTo(37.92578f, 66.0f, 29.800781f, 57.941406f, 29.800781f, 48.0f);
        instancePath.lineTo(29.800781f, 24.0f);
        instancePath.cubicTo(29.800781f, 14.058594f, 37.92578f, 6.0f, 47.94922f, 6.0f);
        instancePath.close();
        instancePath.moveTo(47.94922f, 6.0f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
