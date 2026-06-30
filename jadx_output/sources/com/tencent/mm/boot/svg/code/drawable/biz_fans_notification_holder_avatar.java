package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_fans_notification_holder_avatar extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15432210);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.3f, 14.6768f);
        instancePath2.cubicTo(12.3003f, 14.0767f, 12.8788f, 13.666f, 13.4245f, 13.8404f);
        instancePath2.lineTo(13.5334f, 13.8831f);
        instancePath2.lineTo(18.3556f, 16.1567f);
        instancePath2.cubicTo(21.2324f, 17.5126f, 23.0712f, 20.4285f, 23.0714f, 23.6344f);
        instancePath2.lineTo(23.0714f, 32.7247f);
        instancePath2.cubicTo(23.0713f, 33.3649f, 22.4126f, 33.7874f, 21.838f, 33.5168f);
        instancePath2.lineTo(17.0158f, 31.2518f);
        instancePath2.cubicTo(14.1387f, 29.8959f, 12.3001f, 26.9698f, 12.3f, 23.7636f);
        instancePath2.lineTo(12.3f, 14.6768f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(34.5755f, 13.8404f);
        instancePath3.cubicTo(35.1212f, 13.666f, 35.6997f, 14.0767f, 35.7f, 14.6768f);
        instancePath3.lineTo(35.7f, 23.7636f);
        instancePath3.cubicTo(35.7f, 26.9698f, 33.8613f, 29.8959f, 30.9842f, 31.2518f);
        instancePath3.lineTo(26.162f, 33.5168f);
        instancePath3.cubicTo(25.5874f, 33.7874f, 24.9287f, 33.3649f, 24.9287f, 32.7247f);
        instancePath3.lineTo(24.9287f, 23.6344f);
        instancePath3.cubicTo(24.9289f, 20.4285f, 26.7676f, 17.5126f, 29.6445f, 16.1567f);
        instancePath3.lineTo(34.4666f, 13.8831f);
        instancePath3.lineTo(34.5755f, 13.8404f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
