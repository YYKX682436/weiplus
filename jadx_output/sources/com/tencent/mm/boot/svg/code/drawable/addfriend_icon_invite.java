package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class addfriend_icon_invite extends l95.c {
    private final int width = 108;
    private final int height = 108;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 108;
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
        instancePath.lineTo(108.07031f, 0.0f);
        instancePath.lineTo(108.07031f, 108.07031f);
        instancePath.lineTo(0.0f, 108.07031f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.448853f, 35.66546f);
        instancePath2.lineTo(17.448853f, 75.79919f);
        instancePath2.cubicTo(17.448853f, 77.45719f, 18.7972f, 78.80127f, 20.453722f, 78.80127f);
        instancePath2.lineTo(87.61659f, 78.80127f);
        instancePath2.cubicTo(89.27613f, 78.80127f, 90.62146f, 77.452194f, 90.62146f, 75.79919f);
        instancePath2.lineTo(90.62146f, 35.66546f);
        instancePath2.lineTo(58.135864f, 60.45544f);
        instancePath2.cubicTo(55.81595f, 62.361008f, 52.25586f, 62.362236f, 49.93445f, 60.45544f);
        instancePath2.lineTo(17.448853f, 35.66546f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(19.689577f, 29.269043f);
        instancePath3.cubicTo(18.03435f, 29.269043f, 17.749979f, 30.091743f, 19.05684f, 31.10848f);
        instancePath3.lineTo(51.671455f, 56.482616f);
        instancePath3.cubicTo(52.977234f, 57.49851f, 55.09323f, 57.49935f, 56.400093f, 56.482616f);
        instancePath3.lineTo(89.01471f, 31.10848f);
        instancePath3.cubicTo(90.32048f, 30.092587f, 90.03502f, 29.269043f, 88.38197f, 29.269043f);
        instancePath3.lineTo(19.689577f, 29.269043f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-14187817);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.0f, 0.0f);
        instancePath4.lineTo(108.07031f, 0.0f);
        instancePath4.lineTo(108.07031f, 108.07031f);
        instancePath4.lineTo(0.0f, 108.07031f);
        instancePath4.lineTo(0.0f, 0.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(17.448853f, 35.66546f);
        instancePath5.lineTo(17.448853f, 75.79919f);
        instancePath5.cubicTo(17.448853f, 77.45719f, 18.7972f, 78.80127f, 20.453722f, 78.80127f);
        instancePath5.lineTo(87.61659f, 78.80127f);
        instancePath5.cubicTo(89.27613f, 78.80127f, 90.62146f, 77.452194f, 90.62146f, 75.79919f);
        instancePath5.lineTo(90.62146f, 35.66546f);
        instancePath5.lineTo(58.135864f, 60.45544f);
        instancePath5.cubicTo(55.81595f, 62.361008f, 52.25586f, 62.362236f, 49.93445f, 60.45544f);
        instancePath5.lineTo(17.448853f, 35.66546f);
        instancePath5.lineTo(17.448853f, 35.66546f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-1);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(19.689577f, 29.269043f);
        instancePath6.cubicTo(18.03435f, 29.269043f, 17.749979f, 30.091743f, 19.05684f, 31.10848f);
        instancePath6.lineTo(51.671455f, 56.482616f);
        instancePath6.cubicTo(52.977234f, 57.49851f, 55.09323f, 57.49935f, 56.400093f, 56.482616f);
        instancePath6.lineTo(89.01471f, 31.10848f);
        instancePath6.cubicTo(90.32048f, 30.092587f, 90.03502f, 29.269043f, 88.38197f, 29.269043f);
        instancePath6.lineTo(19.689577f, 29.269043f);
        instancePath6.lineTo(19.689577f, 29.269043f);
        instancePath6.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
