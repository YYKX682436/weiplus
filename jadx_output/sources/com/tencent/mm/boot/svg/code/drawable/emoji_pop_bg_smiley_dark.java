package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class emoji_pop_bg_smiley_dark extends l95.c {
    private final int width = 192;
    private final int height = 405;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 192;
        }
        if (i17 == 1) {
            return 405;
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
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-13882324);
        instancePaint5.setColor(234881023);
        instancePaint5.setStrokeWidth(1.5f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(155.25f, 272.53323f);
        instancePath.cubicTo(155.25f, 262.90875f, 158.09885f, 253.49963f, 163.43755f, 245.4916f);
        instancePath.lineTo(183.31438f, 215.67636f);
        instancePath.cubicTo(188.4888f, 207.91472f, 191.25f, 198.7951f, 191.25f, 189.46677f);
        instancePath.lineTo(191.25f, 48.0f);
        instancePath.cubicTo(191.25f, 21.904545f, 170.09546f, 0.75f, 144.0f, 0.75f);
        instancePath.lineTo(48.0f, 0.75f);
        instancePath.cubicTo(21.904545f, 0.75f, 0.75f, 21.904545f, 0.75f, 48.0f);
        instancePath.lineTo(0.75f, 189.46677f);
        instancePath.cubicTo(0.75f, 198.7951f, 3.5111969f, 207.91472f, 8.685623f, 215.67636f);
        instancePath.lineTo(28.562452f, 245.4916f);
        instancePath.cubicTo(33.901146f, 253.49963f, 36.75f, 262.90875f, 36.75f, 272.53323f);
        instancePath.lineTo(36.75f, 381.0f);
        instancePath.cubicTo(36.75f, 393.8406f, 47.159378f, 404.25f, 60.0f, 404.25f);
        instancePath.lineTo(132.0f, 404.25f);
        instancePath.cubicTo(144.84062f, 404.25f, 155.25f, 393.8406f, 155.25f, 381.0f);
        instancePath.lineTo(155.25f, 272.53323f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
