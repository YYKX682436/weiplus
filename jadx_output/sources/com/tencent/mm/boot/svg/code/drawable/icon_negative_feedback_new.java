package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_negative_feedback_new extends l95.c {
    private final int width = 24;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 14;
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
        instancePaint3.setColor(-16777216);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.5f, 13.417f);
        instancePath.lineTo(15.5f, 14.0f);
        instancePath.lineTo(8.5f, 14.0f);
        instancePath.lineTo(8.5f, 13.417f);
        instancePath.lineTo(15.5f, 13.417f);
        instancePath.close();
        instancePath.moveTo(21.917f, 7.0f);
        instancePath.cubicTo(21.917f, 3.45617f, 19.0438f, 0.583008f, 15.5f, 0.583008f);
        instancePath.lineTo(8.5f, 0.583008f);
        instancePath.cubicTo(4.95617f, 0.583008f, 2.08301f, 3.45617f, 2.08301f, 7.0f);
        instancePath.cubicTo(2.08301f, 10.5438f, 4.95617f, 13.417f, 8.5f, 13.417f);
        instancePath.lineTo(8.5f, 14.0f);
        instancePath.lineTo(8.13965f, 13.9912f);
        instancePath.cubicTo(4.44111f, 13.8037f, 1.5f, 10.7451f, 1.5f, 7.0f);
        instancePath.cubicTo(1.5f, 3.13401f, 4.63401f, 1.12745E-7f, 8.5f, 0.0f);
        instancePath.lineTo(15.5f, 0.0f);
        instancePath.cubicTo(19.366f, 0.0f, 22.5f, 3.13401f, 22.5f, 7.0f);
        instancePath.cubicTo(22.5f, 10.7451f, 19.5589f, 13.8037f, 15.8604f, 13.9912f);
        instancePath.lineTo(15.5f, 14.0f);
        instancePath.lineTo(15.5f, 13.417f);
        instancePath.cubicTo(19.0438f, 13.417f, 21.917f, 10.5438f, 21.917f, 7.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.1001f, 6.0f);
        instancePath2.cubicTo(8.65238f, 6.0f, 9.10009f, 6.44772f, 9.1001f, 7.0f);
        instancePath2.cubicTo(9.1001f, 7.55228f, 8.65238f, 8.0f, 8.1001f, 8.0f);
        instancePath2.cubicTo(7.54782f, 8.0f, 7.1001f, 7.55228f, 7.1001f, 7.0f);
        instancePath2.cubicTo(7.10011f, 6.44772f, 7.54782f, 6.0f, 8.1001f, 6.0f);
        instancePath2.close();
        instancePath2.moveTo(11.8579f, 6.0f);
        instancePath2.cubicTo(12.41f, 6.0002f, 12.8579f, 6.44784f, 12.8579f, 7.0f);
        instancePath2.cubicTo(12.8579f, 7.55216f, 12.41f, 7.9998f, 11.8579f, 8.0f);
        instancePath2.cubicTo(11.3056f, 8.0f, 10.8579f, 7.55228f, 10.8579f, 7.0f);
        instancePath2.cubicTo(10.8579f, 6.44772f, 11.3056f, 6.0f, 11.8579f, 6.0f);
        instancePath2.close();
        instancePath2.moveTo(15.8579f, 6.0f);
        instancePath2.cubicTo(16.4101f, 6.00013f, 16.8579f, 6.4478f, 16.8579f, 7.0f);
        instancePath2.cubicTo(16.8579f, 7.5522f, 16.4101f, 7.99987f, 15.8579f, 8.0f);
        instancePath2.cubicTo(15.3056f, 8.0f, 14.8579f, 7.55228f, 14.8579f, 7.0f);
        instancePath2.cubicTo(14.8579f, 6.44772f, 15.3056f, 6.0f, 15.8579f, 6.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
