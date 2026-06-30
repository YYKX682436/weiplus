package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_headset extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 9.0f);
        instancePath.cubicTo(50.91169f, 9.0f, 63.0f, 21.088312f, 63.0f, 36.0f);
        instancePath.lineTo(63.0f, 54.0f);
        instancePath.lineTo(62.997f, 54.0f);
        instancePath.lineTo(63.0f, 57.0f);
        instancePath.cubicTo(63.0f, 60.31371f, 60.31371f, 63.0f, 57.0f, 63.0f);
        instancePath.lineTo(51.0f, 63.0f);
        instancePath.cubicTo(49.343147f, 63.0f, 48.0f, 61.656853f, 48.0f, 60.0f);
        instancePath.lineTo(48.0f, 45.0f);
        instancePath.cubicTo(48.0f, 43.343147f, 49.343147f, 42.0f, 51.0f, 42.0f);
        instancePath.lineTo(57.0f, 42.0f);
        instancePath.lineTo(57.0f, 36.0f);
        instancePath.cubicTo(57.0f, 24.40202f, 47.59798f, 15.0f, 36.0f, 15.0f);
        instancePath.cubicTo(24.40202f, 15.0f, 15.0f, 24.40202f, 15.0f, 36.0f);
        instancePath.lineTo(15.0f, 42.0f);
        instancePath.lineTo(21.0f, 42.0f);
        instancePath.cubicTo(22.656855f, 42.0f, 24.0f, 43.343147f, 24.0f, 45.0f);
        instancePath.lineTo(24.0f, 60.0f);
        instancePath.cubicTo(24.0f, 61.656853f, 22.656855f, 63.0f, 21.0f, 63.0f);
        instancePath.lineTo(15.0f, 63.0f);
        instancePath.cubicTo(11.686292f, 63.0f, 9.0f, 60.31371f, 9.0f, 57.0f);
        instancePath.lineTo(9.0f, 36.0f);
        instancePath.cubicTo(9.0f, 21.088312f, 21.088312f, 9.0f, 36.0f, 9.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
