package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_edit_photo_rotate extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.9756f, 3.42432f);
        instancePath.lineTo(14.9756f, 5.42432f);
        instancePath.lineTo(15.8241f, 4.57579f);
        instancePath.lineTo(14.8483f, 3.6f);
        instancePath.lineTo(15.3999f, 3.6f);
        instancePath.cubicTo(18.3822f, 3.6f, 20.7999f, 6.01766f, 20.7999f, 9.0f);
        instancePath.lineTo(21.9999f, 9.0f);
        instancePath.cubicTo(21.9999f, 5.35492f, 19.045f, 2.4f, 15.3999f, 2.4f);
        instancePath.lineTo(14.8484f, 2.4f);
        instancePath.lineTo(15.8241f, 1.42432f);
        instancePath.lineTo(14.9756f, 0.575788f);
        instancePath.lineTo(12.9756f, 2.57579f);
        instancePath.cubicTo(12.7413f, 2.8101f, 12.7413f, 3.19f, 12.9756f, 3.42432f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.0f, 9.0f);
        instancePath2.lineTo(7.0f, 18.0f);
        instancePath2.lineTo(16.0f, 18.0f);
        instancePath2.lineTo(16.0f, 9.0f);
        instancePath2.lineTo(7.0f, 9.0f);
        instancePath2.close();
        instancePath2.moveTo(6.0f, 7.0f);
        instancePath2.cubicTo(5.44772f, 7.0f, 5.0f, 7.44772f, 5.0f, 8.0f);
        instancePath2.lineTo(5.0f, 19.0f);
        instancePath2.cubicTo(5.0f, 19.5523f, 5.44772f, 20.0f, 6.0f, 20.0f);
        instancePath2.lineTo(17.0f, 20.0f);
        instancePath2.cubicTo(17.5523f, 20.0f, 18.0f, 19.5523f, 18.0f, 19.0f);
        instancePath2.lineTo(18.0f, 8.0f);
        instancePath2.cubicTo(18.0f, 7.44772f, 17.5523f, 7.0f, 17.0f, 7.0f);
        instancePath2.lineTo(6.0f, 7.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
