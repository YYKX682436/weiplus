package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_photo_crop extends l95.c {
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
        instancePath.moveTo(7.5f, 6.5f);
        instancePath.lineTo(7.5f, 3.5f);
        instancePath.lineTo(5.5f, 3.5f);
        instancePath.lineTo(5.5f, 6.5f);
        instancePath.lineTo(2.5f, 6.5f);
        instancePath.lineTo(2.5f, 8.5f);
        instancePath.lineTo(5.5f, 8.5f);
        instancePath.lineTo(5.5f, 17.5f);
        instancePath.cubicTo(5.5f, 18.0523f, 5.94772f, 18.5f, 6.5f, 18.5f);
        instancePath.lineTo(15.5f, 18.5f);
        instancePath.lineTo(15.5f, 21.5f);
        instancePath.lineTo(17.5f, 21.5f);
        instancePath.lineTo(17.5f, 18.5f);
        instancePath.lineTo(20.5f, 18.5f);
        instancePath.lineTo(20.5f, 16.5f);
        instancePath.lineTo(17.5f, 16.5f);
        instancePath.lineTo(17.5f, 7.5f);
        instancePath.cubicTo(17.5f, 6.94772f, 17.0523f, 6.5f, 16.5f, 6.5f);
        instancePath.lineTo(7.5f, 6.5f);
        instancePath.close();
        instancePath.moveTo(7.5f, 8.5f);
        instancePath.lineTo(7.5f, 16.5f);
        instancePath.lineTo(15.5f, 16.5f);
        instancePath.lineTo(15.5f, 8.5f);
        instancePath.lineTo(7.5f, 8.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.9757f, 3.42432f);
        instancePath2.lineTo(14.9757f, 5.42432f);
        instancePath2.lineTo(15.8242f, 4.57579f);
        instancePath2.lineTo(14.8484f, 3.6f);
        instancePath2.lineTo(15.4f, 3.6f);
        instancePath2.cubicTo(18.3823f, 3.6f, 20.8f, 6.01766f, 20.8f, 9.0f);
        instancePath2.lineTo(22.0f, 9.0f);
        instancePath2.cubicTo(22.0f, 5.35492f, 19.0451f, 2.4f, 15.4f, 2.4f);
        instancePath2.lineTo(14.8485f, 2.4f);
        instancePath2.lineTo(15.8242f, 1.42432f);
        instancePath2.lineTo(14.9757f, 0.575788f);
        instancePath2.lineTo(12.9757f, 2.57579f);
        instancePath2.cubicTo(12.7414f, 2.8101f, 12.7414f, 3.19f, 12.9757f, 3.42432f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
