package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_ban_chats extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePath.moveTo(51.0f, 36.0f);
        instancePath.cubicTo(59.285156f, 36.0f, 66.0f, 42.714844f, 66.0f, 51.0f);
        instancePath.cubicTo(66.0f, 59.285156f, 59.285156f, 66.0f, 51.0f, 66.0f);
        instancePath.cubicTo(42.714844f, 66.0f, 36.0f, 59.285156f, 36.0f, 51.0f);
        instancePath.cubicTo(36.0f, 42.714844f, 42.714844f, 36.0f, 51.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(61.5f, 12.0f);
        instancePath.cubicTo(63.984375f, 12.0f, 66.0f, 14.015625f, 66.0f, 16.5f);
        instancePath.lineTo(66.00391f, 40.003906f);
        instancePath.cubicTo(64.97656f, 38.609375f, 63.765625f, 37.36328f, 62.398438f, 36.30078f);
        instancePath.lineTo(62.398438f, 16.5f);
        instancePath.cubicTo(62.398438f, 16.003906f, 61.996094f, 15.601562f, 61.5f, 15.601562f);
        instancePath.lineTo(10.5f, 15.601562f);
        instancePath.cubicTo(10.003906f, 15.601562f, 9.601562f, 16.003906f, 9.601562f, 16.5f);
        instancePath.lineTo(9.601562f, 52.5f);
        instancePath.cubicTo(9.601562f, 52.996094f, 10.003906f, 53.398438f, 10.5f, 53.398438f);
        instancePath.lineTo(24.601562f, 53.398438f);
        instancePath.lineTo(24.601562f, 60.308594f);
        instancePath.lineTo(31.507812f, 53.398438f);
        instancePath.lineTo(32.554688f, 53.402344f);
        instancePath.cubicTo(32.714844f, 54.64453f, 32.996094f, 55.847656f, 33.390625f, 57.003906f);
        instancePath.lineTo(33.0f, 57.0f);
        instancePath.lineTo(26.121094f, 63.878906f);
        instancePath.cubicTo(24.949219f, 65.05078f, 23.050781f, 65.05078f, 21.878906f, 63.878906f);
        instancePath.cubicTo(21.316406f, 63.316406f, 21.0f, 62.554688f, 21.0f, 61.757812f);
        instancePath.lineTo(21.0f, 57.0f);
        instancePath.lineTo(10.5f, 57.0f);
        instancePath.cubicTo(8.015625f, 57.0f, 6.0f, 54.984375f, 6.0f, 52.5f);
        instancePath.lineTo(6.0f, 16.5f);
        instancePath.cubicTo(6.0f, 14.015625f, 8.015625f, 12.0f, 10.5f, 12.0f);
        instancePath.close();
        instancePath.moveTo(41.765625f, 44.3125f);
        instancePath.cubicTo(40.402344f, 46.191406f, 39.601562f, 48.5f, 39.601562f, 51.0f);
        instancePath.cubicTo(39.601562f, 57.296875f, 44.703125f, 62.398438f, 51.0f, 62.398438f);
        instancePath.cubicTo(53.5f, 62.398438f, 55.808594f, 61.597656f, 57.6875f, 60.234375f);
        instancePath.close();
        instancePath.moveTo(51.0f, 39.601562f);
        instancePath.cubicTo(48.5f, 39.601562f, 46.191406f, 40.402344f, 44.3125f, 41.765625f);
        instancePath.lineTo(60.234375f, 57.6875f);
        instancePath.cubicTo(61.597656f, 55.808594f, 62.398438f, 53.5f, 62.398438f, 51.0f);
        instancePath.cubicTo(62.398438f, 44.703125f, 57.296875f, 39.601562f, 51.0f, 39.601562f);
        instancePath.close();
        instancePath.moveTo(51.0f, 39.601562f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
