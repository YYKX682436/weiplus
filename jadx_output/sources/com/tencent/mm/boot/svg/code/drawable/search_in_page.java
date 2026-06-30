package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class search_in_page extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setStrokeWidth(1.6f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.80005f, 8.79999f);
        instancePath.lineTo(20.8f, 8.79999f);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.6f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.80005f, 12.8f);
        instancePath2.lineTo(14.8f, 12.8f);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.6f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(24.8f, 25.8f);
        instancePath3.lineTo(28.3f, 29.8f);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(1.6f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(20.3f, 14.599999f);
        instancePath4.cubicTo(24.000307f, 14.599999f, 27.0f, 17.599691f, 27.0f, 21.3f);
        instancePath4.cubicTo(27.0f, 25.000307f, 24.000307f, 28.0f, 20.3f, 28.0f);
        instancePath4.cubicTo(16.599691f, 28.0f, 13.599999f, 25.000307f, 13.599999f, 21.3f);
        instancePath4.cubicTo(13.599999f, 17.599691f, 16.599691f, 14.599999f, 20.3f, 14.599999f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(6.8f, 3.0f);
        instancePath5.cubicTo(5.80589f, 3.0f, 5.0f, 3.80589f, 5.0f, 4.8f);
        instancePath5.lineTo(5.0f, 26.8f);
        instancePath5.cubicTo(5.0f, 27.7941f, 5.80589f, 28.6f, 6.8f, 28.6f);
        instancePath5.lineTo(15.0348f, 28.6f);
        instancePath5.cubicTo(14.4011f, 28.1422f, 13.8295f, 27.6038f, 13.3347f, 27.0f);
        instancePath5.lineTo(6.8f, 27.0f);
        instancePath5.cubicTo(6.68954f, 27.0f, 6.6f, 26.9105f, 6.6f, 26.8f);
        instancePath5.lineTo(6.6f, 4.8f);
        instancePath5.cubicTo(6.6f, 4.68954f, 6.68954f, 4.6f, 6.8f, 4.6f);
        instancePath5.lineTo(23.3f, 4.6f);
        instancePath5.cubicTo(23.4105f, 4.6f, 23.5f, 4.68954f, 23.5f, 4.8f);
        instancePath5.lineTo(23.5f, 12.8855f);
        instancePath5.cubicTo(24.0625f, 13.0996f, 24.598f, 13.3684f, 25.1f, 13.6855f);
        instancePath5.lineTo(25.1f, 4.8f);
        instancePath5.cubicTo(25.1f, 3.80589f, 24.2941f, 3.0f, 23.3f, 3.0f);
        instancePath5.lineTo(6.8f, 3.0f);
        instancePath5.close();
        instancePath5.moveTo(25.1f, 15.6678f);
        instancePath5.cubicTo(24.6164f, 15.2553f, 24.0791f, 14.904f, 23.5f, 14.6258f);
        instancePath5.lineTo(23.5f, 15.8f);
        instancePath5.lineTo(25.1f, 15.8f);
        instancePath5.lineTo(25.1f, 15.6678f);
        instancePath5.close();
        instancePath5.moveTo(15.5806f, 27.0f);
        instancePath5.cubicTo(15.8092f, 27.1895f, 16.0494f, 27.3655f, 16.3f, 27.5268f);
        instancePath5.lineTo(16.3f, 27.0f);
        instancePath5.lineTo(15.5806f, 27.0f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
