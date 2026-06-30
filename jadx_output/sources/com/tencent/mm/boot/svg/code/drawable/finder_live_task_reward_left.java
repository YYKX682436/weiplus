package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_task_reward_left extends l95.c {
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
        instancePaint3.setColor(-26527);
        instancePaint3.setStrokeWidth(2.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(70.0f, 39.0f);
        instancePath.cubicTo(72.2091f, 39.0f, 74.0f, 37.2091f, 74.0f, 35.0f);
        instancePath.cubicTo(74.0f, 32.7909f, 72.2091f, 31.0f, 70.0f, 31.0f);
        instancePath.cubicTo(67.7909f, 31.0f, 66.0f, 32.7909f, 66.0f, 35.0f);
        instancePath.cubicTo(66.0f, 37.2091f, 67.7909f, 39.0f, 70.0f, 39.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-14080);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(74.3554f, 4.0f);
        instancePath2.lineTo(80.0f, 11.0f);
        instancePath2.lineTo(70.0f, 8.03291f);
        instancePath2.lineTo(74.3554f, 4.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint5.setColor(-299695);
        instancePaint5.setStrokeWidth(2.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(20.0f, 17.79f);
        instancePath3.cubicTo(29.2925f, 9.62301f, 33.0981f, 8.82343f, 31.417f, 15.3913f);
        instancePath3.cubicTo(29.7359f, 21.9592f, 32.5969f, 22.7587f, 40.0f, 17.79f);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
