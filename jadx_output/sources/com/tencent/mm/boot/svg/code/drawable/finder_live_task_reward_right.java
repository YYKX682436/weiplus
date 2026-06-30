package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_task_reward_right extends l95.c {
    private final int width = 80;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 48;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-31579);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.3963f, 43.7118f);
            instancePath.lineTo(20.4102f, 37.2642f);
            instancePath.lineTo(11.6738f, 39.5469f);
            instancePath.lineTo(18.3963f, 43.7118f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint4.setColor(-27543);
            instancePaint4.setStrokeWidth(2.0f);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(60.0f, 27.0f);
            instancePath2.cubicTo(62.2091f, 27.0f, 64.0f, 25.2091f, 64.0f, 23.0f);
            instancePath2.cubicTo(64.0f, 20.7909f, 62.2091f, 19.0f, 60.0f, 19.0f);
            instancePath2.cubicTo(57.7909f, 19.0f, 56.0f, 20.7909f, 56.0f, 23.0f);
            instancePath2.cubicTo(56.0f, 25.2091f, 57.7909f, 27.0f, 60.0f, 27.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint5.setColor(-15616);
            instancePaint5.setStrokeWidth(2.0f);
            instancePaint5.setStrokeCap(android.graphics.Paint.Cap.ROUND);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(13.3107f, 3.0f);
            instancePath3.cubicTo(12.1615f, 10.2562f, 14.2004f, 12.3245f, 19.4273f, 9.20509f);
            instancePath3.cubicTo(24.6542f, 6.08565f, 26.2042f, 9.01728f, 24.0773f, 18.0f);
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
