package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class multitalk_loading2 extends l95.c {
    private final int width = 120;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 120;
        }
        if (i17 == 1) {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(60.0f, 24.0f);
        instancePath.cubicTo(66.62742f, 24.0f, 72.0f, 18.627417f, 72.0f, 12.0f);
        instancePath.cubicTo(72.0f, 5.372583f, 66.62742f, 0.0f, 60.0f, 0.0f);
        instancePath.cubicTo(53.37258f, 0.0f, 48.0f, 5.372583f, 48.0f, 12.0f);
        instancePath.cubicTo(48.0f, 18.627417f, 53.37258f, 24.0f, 60.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 24.0f);
        instancePath.cubicTo(18.627417f, 24.0f, 24.0f, 18.627417f, 24.0f, 12.0f);
        instancePath.cubicTo(24.0f, 5.372583f, 18.627417f, 0.0f, 12.0f, 0.0f);
        instancePath.cubicTo(5.372583f, 0.0f, 0.0f, 5.372583f, 0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 18.627417f, 5.372583f, 24.0f, 12.0f, 24.0f);
        instancePath.close();
        instancePath.moveTo(108.0f, 24.0f);
        instancePath.cubicTo(114.62742f, 24.0f, 120.0f, 18.627417f, 120.0f, 12.0f);
        instancePath.cubicTo(120.0f, 5.372583f, 114.62742f, 0.0f, 108.0f, 0.0f);
        instancePath.cubicTo(101.37258f, 0.0f, 96.0f, 5.372583f, 96.0f, 12.0f);
        instancePath.cubicTo(96.0f, 18.627417f, 101.37258f, 24.0f, 108.0f, 24.0f);
        instancePath.close();
        canvas.saveLayerAlpha(null, 76, 31);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(60.0f, 0.0f);
        instancePath2.cubicTo(66.62742f, 0.0f, 72.0f, 5.3725824f, 72.0f, 12.0f);
        instancePath2.cubicTo(72.0f, 18.627419f, 66.62742f, 24.0f, 60.0f, 24.0f);
        instancePath2.cubicTo(53.37258f, 24.0f, 48.0f, 18.627419f, 48.0f, 12.0f);
        instancePath2.cubicTo(48.0f, 5.3725824f, 53.37258f, 0.0f, 60.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint6, looper));
        canvas.restore();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.0f, 0.0f);
        instancePath3.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
        instancePath3.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
        instancePath3.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
        instancePath3.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha(null, 76, 31);
        canvas.drawPath(instancePath3, l95.c.instancePaint(instancePaint7, looper));
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
