package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_emoji_del extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(61.5f, 12.0f);
            instancePath.cubicTo(63.984375f, 12.0f, 66.0f, 14.015625f, 66.0f, 16.5f);
            instancePath.lineTo(66.0f, 55.5f);
            instancePath.cubicTo(66.0f, 57.984375f, 63.984375f, 60.0f, 61.5f, 60.0f);
            instancePath.lineTo(25.410156f, 60.0f);
            instancePath.cubicTo(24.007812f, 60.0f, 22.6875f, 59.347656f, 21.835938f, 58.234375f);
            instancePath.lineTo(6.925781f, 38.734375f);
            instancePath.cubicTo(5.691406f, 37.121094f, 5.691406f, 34.878906f, 6.925781f, 33.265625f);
            instancePath.lineTo(21.835938f, 13.765625f);
            instancePath.cubicTo(22.6875f, 12.652344f, 24.007812f, 12.0f, 25.410156f, 12.0f);
            instancePath.close();
            instancePath.moveTo(61.5f, 15.601562f);
            instancePath.lineTo(25.410156f, 15.601562f);
            instancePath.cubicTo(25.128906f, 15.601562f, 24.863281f, 15.730469f, 24.695312f, 15.953125f);
            instancePath.lineTo(9.785156f, 35.453125f);
            instancePath.cubicTo(9.539062f, 35.777344f, 9.539062f, 36.222656f, 9.785156f, 36.546875f);
            instancePath.lineTo(24.695312f, 56.046875f);
            instancePath.cubicTo(24.863281f, 56.26953f, 25.128906f, 56.398438f, 25.410156f, 56.398438f);
            instancePath.lineTo(61.5f, 56.398438f);
            instancePath.cubicTo(61.996094f, 56.398438f, 62.398438f, 55.996094f, 62.398438f, 55.5f);
            instancePath.lineTo(62.398438f, 16.5f);
            instancePath.cubicTo(62.398438f, 16.003906f, 61.996094f, 15.601562f, 61.5f, 15.601562f);
            instancePath.close();
            instancePath.moveTo(51.0f, 24.0f);
            instancePath.lineTo(54.0f, 27.0f);
            instancePath.lineTo(45.0f, 36.0f);
            instancePath.lineTo(54.0f, 45.0f);
            instancePath.lineTo(51.0f, 48.0f);
            instancePath.lineTo(42.0f, 39.0f);
            instancePath.lineTo(33.0f, 48.0f);
            instancePath.lineTo(30.0f, 45.0f);
            instancePath.lineTo(39.0f, 36.0f);
            instancePath.lineTo(30.0f, 27.0f);
            instancePath.lineTo(33.0f, 24.0f);
            instancePath.lineTo(42.0f, 33.0f);
            instancePath.close();
            instancePath.moveTo(51.0f, 24.0f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
