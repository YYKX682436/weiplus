package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class new_voice2search_microphone extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        instancePaint3.setColor(-1);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 1.6665f);
        instancePath.cubicTo(7.92893f, 1.6665f, 6.25f, 3.34544f, 6.25f, 5.4165f);
        instancePath.lineTo(6.25f, 10.4165f);
        instancePath.cubicTo(6.25f, 12.4876f, 7.92893f, 14.1665f, 10.0f, 14.1665f);
        instancePath.cubicTo(12.0711f, 14.1665f, 13.75f, 12.4876f, 13.75f, 10.4165f);
        instancePath.lineTo(13.75f, 5.4165f);
        instancePath.cubicTo(13.75f, 3.34544f, 12.0711f, 1.6665f, 10.0f, 1.6665f);
        instancePath.close();
        instancePath.moveTo(12.5f, 10.4165f);
        instancePath.lineTo(12.5f, 5.4165f);
        instancePath.cubicTo(12.5f, 4.03579f, 11.3807f, 2.9165f, 10.0f, 2.9165f);
        instancePath.cubicTo(8.61929f, 2.9165f, 7.5f, 4.03579f, 7.5f, 5.4165f);
        instancePath.lineTo(7.5f, 10.4165f);
        instancePath.cubicTo(7.5f, 11.7972f, 8.61929f, 12.9165f, 10.0f, 12.9165f);
        instancePath.cubicTo(11.3807f, 12.9165f, 12.5f, 11.7972f, 12.5f, 10.4165f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.625f, 16.6356f);
        instancePath2.cubicTo(13.7833f, 16.3221f, 16.25f, 13.6573f, 16.25f, 10.4165f);
        instancePath2.lineTo(16.25f, 9.1665f);
        instancePath2.lineTo(15.0f, 9.1665f);
        instancePath2.lineTo(15.0f, 10.4165f);
        instancePath2.cubicTo(15.0f, 13.1779f, 12.7614f, 15.4165f, 10.0f, 15.4165f);
        instancePath2.cubicTo(7.23858f, 15.4165f, 5.0f, 13.1779f, 5.0f, 10.4165f);
        instancePath2.lineTo(5.0f, 9.1665f);
        instancePath2.lineTo(3.75f, 9.1665f);
        instancePath2.lineTo(3.75f, 10.4165f);
        instancePath2.cubicTo(3.75f, 13.6573f, 6.21667f, 16.3221f, 9.375f, 16.6356f);
        instancePath2.lineTo(9.375f, 19.1665f);
        instancePath2.lineTo(10.625f, 19.1665f);
        instancePath2.lineTo(10.625f, 16.6356f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
