package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_down_arrow extends l95.c {
    private final int width = 8;
    private final int height = 6;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 8;
        }
        if (i17 == 1) {
            return 6;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.649878f, 1.31235f);
            instancePath.cubicTo(0.387973f, 0.984966f, 0.621059f, 0.5f, 1.04031f, 0.5f);
            instancePath.lineTo(6.95969f, 0.5f);
            instancePath.cubicTo(7.37894f, 0.5f, 7.61203f, 0.984966f, 7.35012f, 1.31235f);
            instancePath.lineTo(4.39043f, 5.01196f);
            instancePath.cubicTo(4.19027f, 5.26216f, 3.80973f, 5.26216f, 3.60957f, 5.01196f);
            instancePath.lineTo(0.649878f, 1.31235f);
            instancePath.close();
            canvas.saveLayerAlpha(null, 128, 31);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
