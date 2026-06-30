package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_edit_photo_mosaic extends l95.c {
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
        instancePath.moveTo(4.0f, 3.0f);
        instancePath.cubicTo(3.44772f, 3.0f, 3.0f, 3.44772f, 3.0f, 4.0f);
        instancePath.lineTo(3.0f, 20.0f);
        instancePath.cubicTo(3.0f, 20.5523f, 3.44772f, 21.0f, 4.0f, 21.0f);
        instancePath.lineTo(20.0f, 21.0f);
        instancePath.cubicTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f);
        instancePath.lineTo(21.0f, 4.0f);
        instancePath.cubicTo(21.0f, 3.44772f, 20.5523f, 3.0f, 20.0f, 3.0f);
        instancePath.lineTo(4.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(15.6f, 6.0f);
        instancePath.lineTo(18.0f, 6.0f);
        instancePath.lineTo(18.0f, 8.4f);
        instancePath.lineTo(15.6f, 8.4f);
        instancePath.lineTo(15.6f, 6.0f);
        instancePath.close();
        instancePath.moveTo(15.6f, 10.8f);
        instancePath.lineTo(15.6f, 8.4f);
        instancePath.lineTo(13.2f, 8.40002f);
        instancePath.lineTo(13.2f, 6.0f);
        instancePath.lineTo(10.8f, 6.0f);
        instancePath.lineTo(10.8f, 8.40002f);
        instancePath.lineTo(8.4f, 8.4f);
        instancePath.lineTo(8.4f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 8.4f);
        instancePath.lineTo(8.4f, 8.4f);
        instancePath.lineTo(8.4f, 10.8f);
        instancePath.lineTo(6.0f, 10.8f);
        instancePath.lineTo(6.0f, 13.2f);
        instancePath.lineTo(8.4f, 13.2f);
        instancePath.lineTo(8.4f, 15.6f);
        instancePath.lineTo(6.0f, 15.6f);
        instancePath.lineTo(6.0f, 18.0f);
        instancePath.lineTo(8.4f, 18.0f);
        instancePath.lineTo(8.4f, 15.6f);
        instancePath.lineTo(10.8f, 15.6f);
        instancePath.lineTo(10.8f, 18.0f);
        instancePath.lineTo(13.2f, 18.0f);
        instancePath.lineTo(13.2f, 15.6f);
        instancePath.lineTo(15.6f, 15.6f);
        instancePath.lineTo(15.6f, 18.0f);
        instancePath.lineTo(18.0f, 18.0f);
        instancePath.lineTo(18.0f, 15.6f);
        instancePath.lineTo(15.6f, 15.6f);
        instancePath.lineTo(15.6f, 13.2f);
        instancePath.lineTo(18.0f, 13.2f);
        instancePath.lineTo(18.0f, 10.8f);
        instancePath.lineTo(15.6f, 10.8f);
        instancePath.close();
        instancePath.moveTo(13.2f, 10.8f);
        instancePath.lineTo(15.6f, 10.8f);
        instancePath.lineTo(15.6f, 13.2f);
        instancePath.lineTo(13.2f, 13.2f);
        instancePath.lineTo(13.2f, 10.8f);
        instancePath.close();
        instancePath.moveTo(10.8f, 10.8f);
        instancePath.lineTo(8.4f, 10.8f);
        instancePath.lineTo(8.4f, 13.2f);
        instancePath.lineTo(10.8f, 13.2f);
        instancePath.lineTo(10.8f, 15.6f);
        instancePath.lineTo(13.2f, 15.6f);
        instancePath.lineTo(13.2f, 13.2f);
        instancePath.lineTo(10.8f, 13.2f);
        instancePath.lineTo(10.8f, 10.8f);
        instancePath.close();
        instancePath.moveTo(10.8f, 10.8f);
        instancePath.lineTo(10.8f, 8.40002f);
        instancePath.lineTo(13.2f, 8.40002f);
        instancePath.lineTo(13.2f, 10.8f);
        instancePath.lineTo(10.8f, 10.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
