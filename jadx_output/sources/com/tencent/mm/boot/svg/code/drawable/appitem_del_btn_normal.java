package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class appitem_del_btn_normal extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
            instancePaint3.setColor(-1158579);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(28.12f, 0.0f);
            instancePath.lineTo(31.27f, 0.0f);
            instancePath.cubicTo(46.17f, 0.38f, 59.22f, 13.21f, 60.0f, 28.08f);
            instancePath.lineTo(60.0f, 31.41f);
            instancePath.cubicTo(59.54f, 46.48f, 46.34f, 59.63f, 31.27f, 60.0f);
            instancePath.lineTo(28.62f, 60.0f);
            instancePath.cubicTo(13.75f, 59.56f, 0.77f, 46.74f, 0.0f, 31.91f);
            instancePath.lineTo(0.0f, 28.41f);
            instancePath.cubicTo(0.57f, 13.61f, 13.35f, 0.76f, 28.12f, 0.0f);
            instancePath.moveTo(13.33f, 25.52f);
            instancePath.cubicTo(11.45f, 26.76f, 12.08f, 29.29f, 11.98f, 31.17f);
            instancePath.cubicTo(11.71f, 32.93f, 12.93f, 35.04f, 14.88f, 34.94f);
            instancePath.cubicTo(24.96f, 35.04f, 35.06f, 35.05f, 45.14f, 34.93f);
            instancePath.cubicTo(47.09f, 35.04f, 48.25f, 32.9f, 48.02f, 31.17f);
            instancePath.cubicTo(48.05f, 29.08f, 48.46f, 26.07f, 46.0f, 25.17f);
            instancePath.cubicTo(36.68f, 24.75f, 27.32f, 25.15f, 17.99f, 24.97f);
            instancePath.cubicTo(16.46f, 25.14f, 14.7f, 24.67f, 13.33f, 25.52f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(13.33f, 25.52f);
            instancePath2.cubicTo(14.7f, 24.67f, 16.46f, 25.14f, 17.99f, 24.97f);
            instancePath2.cubicTo(27.32f, 25.15f, 36.68f, 24.75f, 46.0f, 25.17f);
            instancePath2.cubicTo(48.46f, 26.07f, 48.05f, 29.08f, 48.02f, 31.17f);
            instancePath2.cubicTo(48.25f, 32.9f, 47.09f, 35.04f, 45.14f, 34.93f);
            instancePath2.cubicTo(35.06f, 35.05f, 24.96f, 35.04f, 14.88f, 34.94f);
            instancePath2.cubicTo(12.93f, 35.04f, 11.71f, 32.93f, 11.98f, 31.17f);
            instancePath2.cubicTo(12.08f, 29.29f, 11.45f, 26.76f, 13.33f, 25.52f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
