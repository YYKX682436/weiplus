package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_balance_manager_logo extends l95.c {
    private final int width = 240;
    private final int height = 240;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 240;
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
        instancePaint3.setColor(-407039);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(120.0f, 0.0f);
        instancePath.cubicTo(186.27417f, 0.0f, 240.0f, 53.72583f, 240.0f, 120.0f);
        instancePath.cubicTo(240.0f, 186.27417f, 186.27417f, 240.0f, 120.0f, 240.0f);
        instancePath.cubicTo(53.72583f, 240.0f, 0.0f, 186.27417f, 0.0f, 120.0f);
        instancePath.cubicTo(0.0f, 53.72583f, 53.72583f, 0.0f, 120.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(120.0f, 21.0f);
        instancePath2.cubicTo(174.6762f, 21.0f, 219.0f, 65.32381f, 219.0f, 120.0f);
        instancePath2.cubicTo(219.0f, 174.6762f, 174.6762f, 219.0f, 120.0f, 219.0f);
        instancePath2.cubicTo(65.32381f, 219.0f, 21.0f, 174.6762f, 21.0f, 120.0f);
        instancePath2.cubicTo(21.0f, 65.32381f, 65.32381f, 21.0f, 120.0f, 21.0f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 102, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-407039);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(125.57143f, 108.0f);
        instancePath3.lineTo(142.28572f, 72.0f);
        instancePath3.lineTo(159.0f, 72.0f);
        instancePath3.lineTo(142.28572f, 108.0f);
        instancePath3.lineTo(159.0f, 108.0f);
        instancePath3.lineTo(159.0f, 123.0f);
        instancePath3.lineTo(126.0f, 123.0f);
        instancePath3.lineTo(126.0f, 135.0f);
        instancePath3.lineTo(159.0f, 135.0f);
        instancePath3.lineTo(159.0f, 150.0f);
        instancePath3.lineTo(126.0f, 150.0f);
        instancePath3.lineTo(126.0f, 171.0f);
        instancePath3.lineTo(114.0f, 171.0f);
        instancePath3.lineTo(114.0f, 150.0f);
        instancePath3.lineTo(81.0f, 150.0f);
        instancePath3.lineTo(81.0f, 135.0f);
        instancePath3.lineTo(114.0f, 135.0f);
        instancePath3.lineTo(114.0f, 123.0f);
        instancePath3.lineTo(81.0f, 123.0f);
        instancePath3.lineTo(81.0f, 108.0f);
        instancePath3.lineTo(97.71429f, 108.0f);
        instancePath3.lineTo(81.0f, 72.0f);
        instancePath3.lineTo(97.71429f, 72.0f);
        instancePath3.lineTo(114.42857f, 108.0f);
        instancePath3.lineTo(125.57143f, 108.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
