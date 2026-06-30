package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ask_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-16777216);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(4.5f, 7.48f);
            instancePath.cubicTo(4.5f, 4.19f, 7.86f, 1.51f, 12.0f, 1.51f);
            instancePath.lineTo(12.0f, 1.5f);
            instancePath.cubicTo(16.14f, 1.5f, 19.5f, 4.18f, 19.5f, 7.47f);
            instancePath.cubicTo(19.5f, 9.14f, 18.62f, 10.69f, 16.94f, 11.96f);
            instancePath.cubicTo(16.92f, 11.96f, 15.87f, 12.77f, 15.15f, 13.77f);
            instancePath.cubicTo(14.77f, 14.29f, 14.5f, 15.18f, 14.36f, 16.01f);
            instancePath.cubicTo(14.26f, 16.59f, 13.76f, 17.0f, 13.18f, 17.0f);
            instancePath.lineTo(10.86f, 17.0f);
            instancePath.cubicTo(10.39f, 17.0f, 10.0f, 16.62f, 10.0f, 16.14f);
            instancePath.cubicTo(10.0f, 15.66f, 10.38f, 15.28f, 10.86f, 15.28f);
            instancePath.lineTo(11.68f, 15.28f);
            instancePath.cubicTo(12.1f, 15.28f, 12.91f, 15.35f, 12.91f, 15.35f);
            instancePath.cubicTo(13.08f, 14.46f, 13.39f, 13.61f, 13.91f, 12.89f);
            instancePath.cubicTo(14.7324f, 11.7521f, 15.8656f, 10.8702f, 16.007f, 10.7602f);
            instancePath.cubicTo(16.0134f, 10.7552f, 16.0178f, 10.7517f, 16.02f, 10.75f);
            instancePath.cubicTo(16.91f, 10.08f, 17.98f, 8.96f, 17.98f, 7.47f);
            instancePath.cubicTo(17.98f, 5.33f, 15.69f, 3.02f, 12.0f, 3.02f);
            instancePath.cubicTo(8.31f, 3.02f, 6.02f, 5.33f, 6.02f, 7.47f);
            instancePath.cubicTo(6.02f, 8.99f, 7.11f, 10.44f, 8.86f, 11.26f);
            instancePath.cubicTo(9.24f, 11.44f, 9.41f, 11.89f, 9.23f, 12.27f);
            instancePath.cubicTo(9.05f, 12.65f, 8.6f, 12.82f, 8.22f, 12.64f);
            instancePath.cubicTo(5.92f, 11.57f, 4.5f, 9.59f, 4.5f, 7.48f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-16777216);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.0f, 21.0f);
            instancePath2.cubicTo(14.0f, 21.8284f, 13.1941f, 22.5f, 12.2f, 22.5f);
            instancePath2.cubicTo(11.2059f, 22.5f, 10.4f, 21.8284f, 10.4f, 21.0f);
            instancePath2.cubicTo(10.4f, 20.1716f, 11.2059f, 19.5f, 12.2f, 19.5f);
            instancePath2.cubicTo(13.1941f, 19.5f, 14.0f, 20.1716f, 14.0f, 21.0f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
