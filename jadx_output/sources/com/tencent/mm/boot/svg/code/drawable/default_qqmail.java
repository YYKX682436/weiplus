package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class default_qqmail extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        instancePaint3.setColor(-14187817);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(192.0f, 0.0f);
        instancePath.lineTo(192.0f, 192.0f);
        instancePath.lineTo(0.0f, 192.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(31.0f, 60.0f);
        instancePath2.lineTo(31.0f, 136.9996f);
        instancePath2.cubicTo(31.0f, 138.65668f, 32.350418f, 140.0f, 33.990707f, 140.0f);
        instancePath2.lineTo(158.0093f, 140.0f);
        instancePath2.cubicTo(159.66101f, 140.0f, 161.0f, 138.65442f, 161.0f, 136.9996f);
        instancePath2.lineTo(161.0f, 60.0f);
        instancePath2.lineTo(103.2854f, 107.40642f);
        instancePath2.cubicTo(99.16379f, 110.791885f, 92.83887f, 110.79407f, 88.7146f, 107.40642f);
        instancePath2.lineTo(31.0f, 60.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(32.66113f, 52.0f);
        instancePath3.cubicTo(31.001602f, 52.0f, 30.711802f, 52.82119f, 32.017536f, 53.837048f);
        instancePath3.lineTo(93.63985f, 101.779144f);
        instancePath3.cubicTo(94.94393f, 102.79372f, 97.05661f, 102.795f, 98.36234f, 101.779144f);
        instancePath3.lineTo(159.98466f, 53.837048f);
        instancePath3.cubicTo(161.28874f, 52.822475f, 161.01111f, 52.0f, 159.34106f, 52.0f);
        instancePath3.lineTo(32.66113f, 52.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
