package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_finder_live_notice extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.0f, 4.84992f);
        instancePath.cubicTo(2.0f, 4.29763f, 2.44772f, 3.84991f, 3.0f, 3.84991f);
        instancePath.lineTo(21.0f, 3.84991f);
        instancePath.cubicTo(21.5523f, 3.84991f, 22.0f, 4.29763f, 22.0f, 4.84991f);
        instancePath.lineTo(22.0f, 19.8499f);
        instancePath.cubicTo(22.0f, 20.4022f, 21.5523f, 20.8499f, 21.0f, 20.8499f);
        instancePath.lineTo(3.0f, 20.8499f);
        instancePath.cubicTo(2.44772f, 20.8499f, 2.0f, 20.4022f, 2.0f, 19.8499f);
        instancePath.lineTo(2.0f, 4.84992f);
        instancePath.close();
        instancePath.moveTo(3.2f, 19.6499f);
        instancePath.lineTo(3.2f, 5.04991f);
        instancePath.lineTo(20.8f, 5.04991f);
        instancePath.lineTo(20.8f, 19.6499f);
        instancePath.lineTo(3.2f, 19.6499f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.5f, 2.20001f);
        instancePath2.lineTo(7.7f, 2.20001f);
        instancePath2.lineTo(7.7f, 4.2000103f);
        instancePath2.lineTo(6.5f, 4.2000103f);
        instancePath2.lineTo(6.5f, 2.20001f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.3f, 2.20001f);
        instancePath3.lineTo(17.5f, 2.20001f);
        instancePath3.lineTo(17.5f, 4.2000103f);
        instancePath3.lineTo(16.3f, 4.2000103f);
        instancePath3.lineTo(16.3f, 2.20001f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(2.0f, 7.59991f);
        instancePath4.lineTo(22.0f, 7.59991f);
        instancePath4.lineTo(22.0f, 8.69991f);
        instancePath4.lineTo(2.0f, 8.69991f);
        instancePath4.lineTo(2.0f, 7.59991f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint7.setColor(-16777216);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeWidth(0.6f);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(10.9169f, 15.9301f);
        instancePath5.lineTo(8.65278f, 13.666f);
        instancePath5.lineTo(8.19995f, 14.1188f);
        instancePath5.lineTo(10.615f, 16.5339f);
        instancePath5.cubicTo(10.7818f, 16.7006f, 11.0521f, 16.7006f, 11.2188f, 16.5339f);
        instancePath5.lineTo(16.2f, 11.5527f);
        instancePath5.lineTo(15.7471f, 11.0999f);
        instancePath5.lineTo(10.9169f, 15.9301f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
