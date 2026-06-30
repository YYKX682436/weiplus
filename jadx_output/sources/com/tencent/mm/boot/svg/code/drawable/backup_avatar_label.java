package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_avatar_label extends l95.c {
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
        instancePaint3.setColor(-15432210);
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
        instancePath2.moveTo(8.27602f, 21.0572f);
        instancePath2.cubicTo(7.75532f, 21.5779f, 7.75532f, 22.4221f, 8.27602f, 22.9428f);
        instancePath2.lineTo(17.0571f, 31.7239f);
        instancePath2.cubicTo(17.5778f, 32.2446f, 18.422f, 32.2446f, 18.9427f, 31.7239f);
        instancePath2.lineTo(31.6094f, 19.0572f);
        instancePath2.cubicTo(31.8594f, 18.8071f, 31.9999f, 18.468f, 31.9999f, 18.1144f);
        instancePath2.lineTo(31.9999f, 9.33333f);
        instancePath2.cubicTo(31.9999f, 8.59695f, 31.4029f, 8.0f, 30.6665f, 8.0f);
        instancePath2.lineTo(21.8855f, 8.0f);
        instancePath2.cubicTo(21.5319f, 8.0f, 21.1927f, 8.14048f, 20.9427f, 8.39052f);
        instancePath2.lineTo(8.27602f, 21.0572f);
        instancePath2.close();
        instancePath2.moveTo(25.3332f, 17.3333f);
        instancePath2.cubicTo(26.806f, 17.3333f, 27.9999f, 16.1394f, 27.9999f, 14.6667f);
        instancePath2.cubicTo(27.9999f, 13.1939f, 26.806f, 12.0f, 25.3332f, 12.0f);
        instancePath2.cubicTo(23.8605f, 12.0f, 22.6665f, 13.1939f, 22.6665f, 14.6667f);
        instancePath2.cubicTo(22.6665f, 16.1394f, 23.8605f, 17.3333f, 25.3332f, 17.3333f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
