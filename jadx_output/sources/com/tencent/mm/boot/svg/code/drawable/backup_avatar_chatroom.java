package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_avatar_chatroom extends l95.c {
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
        instancePaint3.setColor(-16268960);
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
        instancePath2.moveTo(12.6666f, 15.6124f);
        instancePath2.cubicTo(12.6666f, 17.1327f, 13.4617f, 19.3044f, 14.4425f, 20.4669f);
        instancePath2.lineTo(14.9245f, 21.0382f);
        instancePath2.cubicTo(15.7149f, 21.975f, 15.4604f, 23.1581f, 14.3659f, 23.6922f);
        instancePath2.lineTo(6.81872f, 27.3751f);
        instancePath2.cubicTo(5.99745f, 27.7759f, 5.33325f, 28.8405f, 5.33325f, 29.754f);
        instancePath2.lineTo(5.33325f, 30.6688f);
        instancePath2.cubicTo(5.33325f, 31.4077f, 5.93106f, 32.0f, 6.66849f, 32.0f);
        instancePath2.lineTo(29.3313f, 32.0f);
        instancePath2.cubicTo(30.0653f, 32.0f, 30.6666f, 31.404f, 30.6666f, 30.6688f);
        instancePath2.lineTo(30.6666f, 29.754f);
        instancePath2.cubicTo(30.6666f, 28.8336f, 30.0015f, 27.7756f, 29.1811f, 27.3754f);
        instancePath2.lineTo(21.634f, 23.694f);
        instancePath2.cubicTo(20.5348f, 23.1579f, 20.2893f, 21.9719f, 21.0753f, 21.0402f);
        instancePath2.lineTo(21.5574f, 20.4688f);
        instancePath2.cubicTo(22.5345f, 19.3105f, 23.3333f, 17.1324f, 23.3333f, 15.6136f);
        instancePath2.lineTo(23.3333f, 13.3336f);
        instancePath2.cubicTo(23.3333f, 10.3906f, 20.9454f, 8.0f, 17.9999f, 8.0f);
        instancePath2.cubicTo(15.0604f, 8.0f, 12.6666f, 10.3876f, 12.6666f, 13.3328f);
        instancePath2.lineTo(12.6666f, 15.6124f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(28.4911f, 13.778f);
        instancePath3.cubicTo(28.4911f, 11.3745f, 26.5599f, 9.41312f, 24.148f, 9.33571f);
        instancePath3.cubicTo(24.8976f, 10.4859f, 25.3333f, 11.8591f, 25.3333f, 13.3336f);
        instancePath3.lineTo(25.3333f, 15.6136f);
        instancePath3.cubicTo(25.3333f, 17.6028f, 24.3686f, 20.2381f, 23.0861f, 21.7584f);
        instancePath3.lineTo(22.8358f, 22.055f);
        instancePath3.lineTo(30.0579f, 25.5779f);
        instancePath3.cubicTo(31.4418f, 26.2529f, 32.481f, 27.7858f, 32.6442f, 29.3333f);
        instancePath3.lineTo(33.5422f, 29.3333f);
        instancePath3.cubicTo(34.1603f, 29.3333f, 34.6666f, 28.8367f, 34.6666f, 28.224f);
        instancePath3.lineTo(34.6666f, 27.4616f);
        instancePath3.cubicTo(34.6666f, 26.6946f, 34.1065f, 25.813f, 33.4157f, 25.4795f);
        instancePath3.lineTo(27.0602f, 22.4117f);
        instancePath3.cubicTo(26.1346f, 21.9649f, 25.9278f, 20.9766f, 26.5897f, 20.2001f);
        instancePath3.lineTo(26.9957f, 19.724f);
        instancePath3.cubicTo(27.8185f, 18.7587f, 28.4911f, 16.9437f, 28.4911f, 15.678f);
        instancePath3.lineTo(28.4911f, 13.778f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
