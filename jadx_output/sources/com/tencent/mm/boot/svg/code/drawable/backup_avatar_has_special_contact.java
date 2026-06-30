package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_avatar_has_special_contact extends l95.c {
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
        instancePaint3.setColor(-15683841);
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
        instancePath2.moveTo(8.33325f, 32.0f);
        instancePath2.cubicTo(7.78097f, 32.0f, 7.33325f, 31.5523f, 7.33325f, 31.0f);
        instancePath2.lineTo(7.33325f, 29.754f);
        instancePath2.cubicTo(7.33325f, 28.8405f, 7.99745f, 27.7759f, 8.81872f, 27.3751f);
        instancePath2.lineTo(16.3659f, 23.6922f);
        instancePath2.cubicTo(17.4604f, 23.1581f, 17.7149f, 21.975f, 16.9245f, 21.0382f);
        instancePath2.lineTo(16.4425f, 20.4669f);
        instancePath2.cubicTo(15.4617f, 19.3044f, 14.6666f, 17.1327f, 14.6666f, 15.6124f);
        instancePath2.lineTo(14.6666f, 13.3328f);
        instancePath2.cubicTo(14.6666f, 10.3876f, 17.0604f, 8.0f, 19.9999f, 8.0f);
        instancePath2.cubicTo(22.9454f, 8.0f, 25.3333f, 10.3906f, 25.3333f, 13.3336f);
        instancePath2.lineTo(25.3333f, 15.6136f);
        instancePath2.cubicTo(25.3333f, 17.1324f, 24.5345f, 19.3105f, 23.5574f, 20.4688f);
        instancePath2.lineTo(23.0753f, 21.0402f);
        instancePath2.cubicTo(22.2893f, 21.9719f, 22.5348f, 23.1579f, 23.634f, 23.694f);
        instancePath2.lineTo(31.1811f, 27.3754f);
        instancePath2.cubicTo(32.0015f, 27.7756f, 32.6666f, 28.8336f, 32.6666f, 29.754f);
        instancePath2.lineTo(32.6666f, 31.0f);
        instancePath2.cubicTo(32.6666f, 31.5523f, 32.2189f, 32.0f, 31.6666f, 32.0f);
        instancePath2.lineTo(8.33325f, 32.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
