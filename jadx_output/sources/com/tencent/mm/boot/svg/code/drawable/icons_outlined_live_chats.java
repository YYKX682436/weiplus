package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_live_chats extends l95.c {
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
        instancePath.moveTo(61.5f, 12.0f);
        instancePath.cubicTo(63.984375f, 12.0f, 66.0f, 14.015625f, 66.0f, 16.5f);
        instancePath.lineTo(66.0f, 52.5f);
        instancePath.cubicTo(66.0f, 54.984375f, 63.984375f, 57.0f, 61.5f, 57.0f);
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
        instancePath.moveTo(61.5f, 15.601562f);
        instancePath.lineTo(10.5f, 15.601562f);
        instancePath.cubicTo(10.003906f, 15.601562f, 9.601562f, 16.003906f, 9.601562f, 16.5f);
        instancePath.lineTo(9.601562f, 52.5f);
        instancePath.cubicTo(9.601562f, 52.996094f, 10.003906f, 53.398438f, 10.5f, 53.398438f);
        instancePath.lineTo(24.601562f, 53.398438f);
        instancePath.lineTo(24.601562f, 60.308594f);
        instancePath.lineTo(31.507812f, 53.398438f);
        instancePath.lineTo(61.5f, 53.398438f);
        instancePath.cubicTo(61.996094f, 53.398438f, 62.398438f, 52.996094f, 62.398438f, 52.5f);
        instancePath.lineTo(62.398438f, 16.5f);
        instancePath.cubicTo(62.398438f, 16.003906f, 61.996094f, 15.601562f, 61.5f, 15.601562f);
        instancePath.close();
        instancePath.moveTo(61.5f, 15.601562f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
