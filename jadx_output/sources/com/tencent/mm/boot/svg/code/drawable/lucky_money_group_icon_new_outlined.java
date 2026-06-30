package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_group_icon_new_outlined extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        instancePaint3.setColor(-1649222);
        instancePaint3.setStrokeWidth(3.0f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.5f, 5.59106f);
        instancePath.cubicTo(1.5f, 3.33163f, 3.33163f, 1.5f, 5.59106f, 1.5f);
        instancePath.lineTo(42.40894f, 1.5f);
        instancePath.cubicTo(44.66837f, 1.5f, 46.5f, 3.33163f, 46.5f, 5.59106f);
        instancePath.lineTo(46.5f, 42.40894f);
        instancePath.cubicTo(46.5f, 44.66837f, 44.66837f, 46.5f, 42.40894f, 46.5f);
        instancePath.lineTo(5.59106f, 46.5f);
        instancePath.cubicTo(3.33163f, 46.5f, 1.5f, 44.66837f, 1.5f, 42.40894f);
        instancePath.lineTo(1.5f, 5.59106f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1649222);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(24.51f, 10.25f);
        instancePath2.cubicTo(25.53f, 11.69f, 26.55f, 13.25f, 27.54f, 14.93f);
        instancePath2.lineTo(25.65f, 15.86f);
        instancePath2.lineTo(30.6f, 15.86f);
        instancePath2.cubicTo(31.53f, 14.09f, 32.34f, 12.17f, 33.06f, 10.13f);
        instancePath2.lineTo(35.73f, 11.09f);
        instancePath2.cubicTo(35.07f, 12.86f, 34.35f, 14.45f, 33.57f, 15.86f);
        instancePath2.lineTo(37.23f, 15.86f);
        instancePath2.lineTo(37.23f, 18.53f);
        instancePath2.lineTo(34.02f, 18.53f);
        instancePath2.lineTo(34.02f, 24.98f);
        instancePath2.lineTo(37.83f, 24.98f);
        instancePath2.lineTo(37.83f, 27.65f);
        instancePath2.lineTo(34.02f, 27.65f);
        instancePath2.lineTo(34.02f, 37.94f);
        instancePath2.lineTo(31.26f, 37.94f);
        instancePath2.lineTo(31.26f, 27.65f);
        instancePath2.lineTo(26.55f, 27.65f);
        instancePath2.cubicTo(26.28f, 29.78f, 25.83f, 31.58f, 25.23f, 33.08f);
        instancePath2.cubicTo(24.27f, 35.3f, 22.71f, 37.01f, 20.55f, 38.21f);
        instancePath2.lineTo(18.99f, 35.75f);
        instancePath2.cubicTo(20.94f, 34.55f, 22.26f, 33.02f, 22.98f, 31.19f);
        instancePath2.cubicTo(23.34f, 30.14f, 23.61f, 28.97f, 23.79f, 27.65f);
        instancePath2.lineTo(20.22f, 27.65f);
        instancePath2.lineTo(20.22f, 24.98f);
        instancePath2.lineTo(24.03f, 24.98f);
        instancePath2.cubicTo(24.06f, 24.5f, 24.09f, 24.02f, 24.09f, 23.54f);
        instancePath2.lineTo(24.09f, 18.53f);
        instancePath2.lineTo(20.76f, 18.53f);
        instancePath2.lineTo(20.76f, 15.86f);
        instancePath2.lineTo(25.02f, 15.86f);
        instancePath2.cubicTo(24.12f, 14.18f, 23.16f, 12.68f, 22.14f, 11.36f);
        instancePath2.lineTo(24.51f, 10.25f);
        instancePath2.close();
        instancePath2.moveTo(26.79f, 24.98f);
        instancePath2.lineTo(31.26f, 24.98f);
        instancePath2.lineTo(31.26f, 18.53f);
        instancePath2.lineTo(26.85f, 18.53f);
        instancePath2.lineTo(26.85f, 23.54f);
        instancePath2.lineTo(26.79f, 24.98f);
        instancePath2.close();
        instancePath2.moveTo(19.71f, 22.01f);
        instancePath2.lineTo(19.71f, 24.92f);
        instancePath2.cubicTo(18.81f, 25.43f, 17.88f, 25.91f, 16.95f, 26.36f);
        instancePath2.lineTo(16.95f, 34.91f);
        instancePath2.cubicTo(16.95f, 36.86f, 15.96f, 37.85f, 14.01f, 37.85f);
        instancePath2.lineTo(11.52f, 37.85f);
        instancePath2.lineTo(10.89f, 35.09f);
        instancePath2.cubicTo(11.64f, 35.18f, 12.36f, 35.24f, 13.02f, 35.24f);
        instancePath2.cubicTo(13.71f, 35.24f, 14.07f, 34.88f, 14.07f, 34.19f);
        instancePath2.lineTo(14.07f, 27.65f);
        instancePath2.cubicTo(12.99f, 28.07f, 11.88f, 28.49f, 10.8f, 28.88f);
        instancePath2.lineTo(10.08f, 26.0f);
        instancePath2.cubicTo(11.43f, 25.67f, 12.75f, 25.25f, 14.07f, 24.77f);
        instancePath2.lineTo(14.07f, 18.41f);
        instancePath2.lineTo(10.5f, 18.41f);
        instancePath2.lineTo(10.5f, 15.68f);
        instancePath2.lineTo(14.07f, 15.68f);
        instancePath2.lineTo(14.07f, 10.49f);
        instancePath2.lineTo(16.95f, 10.49f);
        instancePath2.lineTo(16.95f, 15.68f);
        instancePath2.lineTo(19.77f, 15.68f);
        instancePath2.lineTo(19.77f, 18.41f);
        instancePath2.lineTo(16.95f, 18.41f);
        instancePath2.lineTo(16.95f, 23.51f);
        instancePath2.cubicTo(17.88f, 23.03f, 18.81f, 22.55f, 19.71f, 22.01f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
