package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_eyes_off_new extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.73f, 17.735f);
        instancePath.lineTo(14.05f, 19.705f);
        instancePath.cubicTo(13.37f, 19.815f, 12.68f, 19.875f, 11.99f, 19.875f);
        instancePath.cubicTo(11.3f, 19.875f, 10.61f, 19.815f, 9.94f, 19.705f);
        instancePath.lineTo(9.94f, 19.705f);
        instancePath.lineTo(10.26f, 17.735f);
        instancePath.cubicTo(11.4f, 17.925f, 12.59f, 17.925f, 13.73f, 17.735f);
        instancePath.lineTo(13.73f, 17.735f);
        instancePath.close();
        instancePath.moveTo(4.84f, 15.135f);
        instancePath.cubicTo(5.72f, 15.925f, 6.71f, 16.545f, 7.77f, 17.005f);
        instancePath.lineTo(7.77f, 17.005f);
        instancePath.lineTo(6.98f, 18.845f);
        instancePath.cubicTo(5.72f, 18.295f, 4.55f, 17.555f, 3.51f, 16.635f);
        instancePath.lineTo(3.51f, 16.635f);
        instancePath.close();
        instancePath.moveTo(19.15f, 15.135f);
        instancePath.lineTo(20.48f, 16.635f);
        instancePath.cubicTo(19.45f, 17.555f, 18.28f, 18.305f, 17.02f, 18.845f);
        instancePath.lineTo(17.02f, 18.845f);
        instancePath.lineTo(16.23f, 17.005f);
        instancePath.lineTo(16.22f, 17.005f);
        instancePath.cubicTo(17.28f, 16.545f, 18.27f, 15.915f, 19.15f, 15.135f);
        instancePath.lineTo(19.15f, 15.135f);
        instancePath.close();
        instancePath.moveTo(11.99f, 8.035f);
        instancePath.cubicTo(14.2f, 8.035f, 15.99f, 9.825f, 15.99f, 12.035f);
        instancePath.cubicTo(15.99f, 14.245f, 14.2f, 16.035f, 11.99f, 16.035f);
        instancePath.cubicTo(9.78f, 16.035f, 7.99f, 14.245f, 7.99f, 12.035f);
        instancePath.cubicTo(7.99f, 9.825f, 9.78f, 8.035f, 11.99f, 8.035f);
        instancePath.close();
        instancePath.moveTo(11.99f, 9.535f);
        instancePath.cubicTo(10.61f, 9.535f, 9.49f, 10.655f, 9.49f, 12.035f);
        instancePath.cubicTo(9.49f, 13.415f, 10.61f, 14.535f, 11.99f, 14.535f);
        instancePath.cubicTo(13.37f, 14.535f, 14.49f, 13.415f, 14.49f, 12.035f);
        instancePath.cubicTo(14.49f, 10.655f, 13.37f, 9.535f, 11.99f, 9.535f);
        instancePath.close();
        instancePath.moveTo(1.45f, 9.735f);
        instancePath.lineTo(3.08f, 10.885f);
        instancePath.cubicTo(2.82f, 11.255f, 2.58f, 11.635f, 2.37f, 12.035f);
        instancePath.cubicTo(2.58f, 12.435f, 2.82f, 12.815f, 3.08f, 13.185f);
        instancePath.lineTo(3.08f, 13.185f);
        instancePath.lineTo(1.45f, 14.335f);
        instancePath.cubicTo(1.04f, 13.745f, 0.67f, 13.125f, 0.35f, 12.475f);
        instancePath.lineTo(0.35f, 12.475f);
        instancePath.lineTo(0.14f, 12.035f);
        instancePath.lineTo(0.35f, 11.595f);
        instancePath.cubicTo(0.66f, 10.955f, 1.03f, 10.325f, 1.45f, 9.735f);
        instancePath.lineTo(1.45f, 9.735f);
        instancePath.close();
        instancePath.moveTo(22.54f, 9.735f);
        instancePath.cubicTo(22.95f, 10.315f, 23.32f, 10.945f, 23.64f, 11.595f);
        instancePath.lineTo(23.64f, 11.595f);
        instancePath.lineTo(23.85f, 12.035f);
        instancePath.lineTo(23.64f, 12.475f);
        instancePath.cubicTo(23.32f, 13.125f, 22.95f, 13.755f, 22.54f, 14.335f);
        instancePath.lineTo(22.54f, 14.335f);
        instancePath.lineTo(20.91f, 13.185f);
        instancePath.cubicTo(21.16f, 12.815f, 21.4f, 12.435f, 21.62f, 12.035f);
        instancePath.cubicTo(21.41f, 11.635f, 21.17f, 11.245f, 20.91f, 10.885f);
        instancePath.lineTo(20.91f, 10.885f);
        instancePath.close();
        instancePath.moveTo(6.97f, 5.225f);
        instancePath.lineTo(7.76f, 7.065f);
        instancePath.lineTo(7.77f, 7.065f);
        instancePath.cubicTo(6.71f, 7.525f, 5.72f, 8.155f, 4.84f, 8.935f);
        instancePath.lineTo(4.84f, 8.935f);
        instancePath.lineTo(3.51f, 7.435f);
        instancePath.cubicTo(4.54f, 6.515f, 5.71f, 5.775f, 6.97f, 5.225f);
        instancePath.lineTo(6.97f, 5.225f);
        instancePath.close();
        instancePath.moveTo(17.02f, 5.225f);
        instancePath.cubicTo(18.27f, 5.765f, 19.44f, 6.505f, 20.48f, 7.425f);
        instancePath.lineTo(20.48f, 7.425f);
        instancePath.lineTo(19.16f, 8.925f);
        instancePath.cubicTo(18.28f, 8.145f, 17.29f, 7.525f, 16.23f, 7.065f);
        instancePath.lineTo(16.23f, 7.065f);
        instancePath.close();
        instancePath.moveTo(9.93f, 4.365f);
        instancePath.cubicTo(11.28f, 4.145f, 12.69f, 4.145f, 14.04f, 4.365f);
        instancePath.lineTo(14.04f, 4.365f);
        instancePath.lineTo(13.72f, 6.335f);
        instancePath.cubicTo(12.58f, 6.145f, 11.39f, 6.145f, 10.25f, 6.335f);
        instancePath.lineTo(10.25f, 6.335f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
