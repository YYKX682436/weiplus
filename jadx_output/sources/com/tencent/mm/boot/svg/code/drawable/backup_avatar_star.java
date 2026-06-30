package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_avatar_star extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        instancePaint3.setColor(-15616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.cubicTo(0.0f, 1.7908609f, 1.7908609f, 0.0f, 4.0f, 0.0f);
        instancePath.lineTo(36.0f, 0.0f);
        instancePath.cubicTo(38.20914f, 0.0f, 40.0f, 1.7908609f, 40.0f, 4.0f);
        instancePath.lineTo(40.0f, 36.0f);
        instancePath.cubicTo(40.0f, 38.20914f, 38.20914f, 40.0f, 36.0f, 40.0f);
        instancePath.lineTo(4.0f, 40.0f);
        instancePath.cubicTo(1.7908609f, 40.0f, 0.0f, 38.20914f, 0.0f, 36.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.9999f, 28.6667f);
        instancePath2.lineTo(13.7704f, 31.9417f);
        instancePath2.cubicTo(12.8032f, 32.4502f, 11.6554f, 31.5878f, 11.8358f, 30.5362f);
        instancePath2.lineTo(13.0255f, 23.5995f);
        instancePath2.lineTo(7.98571f, 18.6869f);
        instancePath2.cubicTo(7.20325f, 17.9241f, 7.66877f, 16.566f, 8.72466f, 16.4126f);
        instancePath2.lineTo(15.6895f, 15.4005f);
        instancePath2.lineTo(18.8043f, 9.08931f);
        instancePath2.cubicTo(19.2879f, 8.10945f, 20.7234f, 8.13251f, 21.1956f, 9.08931f);
        instancePath2.lineTo(24.3104f, 15.4005f);
        instancePath2.lineTo(31.2752f, 16.4126f);
        instancePath2.cubicTo(32.3566f, 16.5697f, 32.7782f, 17.9421f, 32.0142f, 18.6869f);
        instancePath2.lineTo(26.9744f, 23.5995f);
        instancePath2.lineTo(28.1641f, 30.5362f);
        instancePath2.cubicTo(28.3488f, 31.6131f, 27.1739f, 32.4382f, 26.2295f, 31.9417f);
        instancePath2.lineTo(19.9999f, 28.6667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
