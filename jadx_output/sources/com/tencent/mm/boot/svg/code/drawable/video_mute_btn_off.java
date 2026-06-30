package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class video_mute_btn_off extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-419430401);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.06066f, 6.9393396f);
        instancePath.lineTo(11.3f, 4.7f);
        instancePath.cubicTo(11.7f, 4.3f, 12.3f, 4.3f, 12.7f, 4.7f);
        instancePath.cubicTo(12.9f, 4.9f, 13.0f, 5.1f, 13.0f, 5.4f);
        instancePath.lineTo(13.0f, 10.878679f);
        instancePath.lineTo(15.878548f, 13.757228f);
        instancePath.cubicTo(16.152016f, 13.216491f, 16.3f, 12.608245f, 16.3f, 12.0f);
        instancePath.cubicTo(16.3f, 11.0f, 15.9f, 10.0f, 15.2f, 9.3f);
        instancePath.lineTo(15.1f, 9.2f);
        instancePath.lineTo(16.2f, 8.1f);
        instancePath.lineTo(16.3f, 8.2f);
        instancePath.cubicTo(17.3f, 9.2f, 17.9f, 10.6f, 17.9f, 12.0f);
        instancePath.cubicTo(17.9f, 13.0188675f, 17.582216f, 14.037734f, 17.023743f, 14.902421f);
        instancePath.lineTo(17.942335f, 15.821014f);
        instancePath.cubicTo(18.730238f, 14.702849f, 19.1f, 13.413052f, 19.1f, 12.0f);
        instancePath.cubicTo(19.1f, 10.2f, 18.4f, 8.6f, 17.2f, 7.3f);
        instancePath.lineTo(17.1f, 7.2f);
        instancePath.lineTo(18.2f, 6.1f);
        instancePath.lineTo(18.3f, 6.2f);
        instancePath.cubicTo(19.8f, 7.7f, 20.7f, 9.8f, 20.7f, 12.0f);
        instancePath.cubicTo(20.7f, 13.820007f, 20.152493f, 15.503137f, 19.057474f, 16.936155f);
        instancePath.lineTo(22.091883f, 19.970562f);
        instancePath.lineTo(21.031223f, 21.031223f);
        instancePath.lineTo(4.0606604f, 4.0606604f);
        instancePath.lineTo(5.1213202f, 3.0f);
        instancePath.lineTo(9.06066f, 6.9393396f);
        instancePath.close();
        instancePath.moveTo(13.0f, 15.121321f);
        instancePath.lineTo(13.0f, 18.6f);
        instancePath.cubicTo(13.0f, 19.2f, 12.6f, 19.6f, 12.0f, 19.6f);
        instancePath.cubicTo(11.7f, 19.6f, 11.5f, 19.5f, 11.3f, 19.3f);
        instancePath.lineTo(7.5f, 15.5f);
        instancePath.lineTo(3.0f, 15.5f);
        instancePath.cubicTo(2.4f, 15.5f, 2.0f, 15.1f, 2.0f, 14.5f);
        instancePath.lineTo(2.0f, 9.5f);
        instancePath.cubicTo(2.0f, 8.9f, 2.4f, 8.5f, 3.0f, 8.5f);
        instancePath.lineTo(6.3786798f, 8.5f);
        instancePath.lineTo(13.0f, 15.121321f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
