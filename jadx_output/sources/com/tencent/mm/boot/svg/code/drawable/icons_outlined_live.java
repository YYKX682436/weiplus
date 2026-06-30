package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_live extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(5.4f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(36.0f, 8.700001f);
            instancePath2.cubicTo(51.077374f, 8.700001f, 63.3f, 20.922626f, 63.3f, 36.0f);
            instancePath2.cubicTo(63.3f, 51.077374f, 51.077374f, 63.3f, 36.0f, 63.3f);
            instancePath2.cubicTo(20.922626f, 63.3f, 8.700001f, 51.077374f, 8.700001f, 36.0f);
            instancePath2.cubicTo(8.700001f, 20.922626f, 20.922626f, 8.700001f, 36.0f, 8.700001f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(36.0f, 19.5f);
            instancePath3.cubicTo(45.112698f, 19.5f, 52.5f, 26.887302f, 52.5f, 36.0f);
            instancePath3.cubicTo(52.5f, 45.112698f, 45.112698f, 52.5f, 36.0f, 52.5f);
            instancePath3.cubicTo(26.887302f, 52.5f, 19.5f, 45.112698f, 19.5f, 36.0f);
            instancePath3.cubicTo(19.5f, 26.887302f, 26.887302f, 19.5f, 36.0f, 19.5f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
