package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_improve_camera_expo_sun extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(38.16f, 61.2f);
        instancePath.lineTo(38.16f, 72.0f);
        instancePath.lineTo(33.84f, 72.0f);
        instancePath.lineTo(33.84f, 61.2f);
        instancePath.lineTo(38.16f, 61.2f);
        instancePath.close();
        instancePath.moveTo(16.6536f, 52.2917f);
        instancePath.lineTo(19.7083f, 55.3464f);
        instancePath.lineTo(12.0715f, 62.9832f);
        instancePath.lineTo(9.01681f, 59.9285f);
        instancePath.lineTo(16.6536f, 52.2917f);
        instancePath.close();
        instancePath.moveTo(55.3464f, 52.2917f);
        instancePath.lineTo(62.9832f, 59.9285f);
        instancePath.lineTo(59.9285f, 62.9832f);
        instancePath.lineTo(52.2917f, 55.3464f);
        instancePath.lineTo(55.3464f, 52.2917f);
        instancePath.close();
        instancePath.moveTo(36.0f, 18.0f);
        instancePath.cubicTo(45.9411f, 18.0f, 54.0f, 26.0589f, 54.0f, 36.0f);
        instancePath.cubicTo(54.0f, 45.9411f, 45.9411f, 54.0f, 36.0f, 54.0f);
        instancePath.cubicTo(26.0589f, 54.0f, 18.0f, 45.9411f, 18.0f, 36.0f);
        instancePath.cubicTo(18.0f, 26.0589f, 26.0589f, 18.0f, 36.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 22.32f);
        instancePath.cubicTo(28.4447f, 22.32f, 22.32f, 28.4447f, 22.32f, 36.0f);
        instancePath.cubicTo(22.32f, 43.5553f, 28.4447f, 49.68f, 36.0f, 49.68f);
        instancePath.cubicTo(43.5553f, 49.68f, 49.68f, 43.5553f, 49.68f, 36.0f);
        instancePath.cubicTo(49.68f, 28.4447f, 43.5553f, 22.32f, 36.0f, 22.32f);
        instancePath.close();
        instancePath.moveTo(10.8f, 33.84f);
        instancePath.lineTo(10.8f, 38.16f);
        instancePath.lineTo(0.0f, 38.16f);
        instancePath.lineTo(0.0f, 33.84f);
        instancePath.lineTo(10.8f, 33.84f);
        instancePath.close();
        instancePath.moveTo(72.0f, 33.84f);
        instancePath.lineTo(72.0f, 38.16f);
        instancePath.lineTo(61.2f, 38.16f);
        instancePath.lineTo(61.2f, 33.84f);
        instancePath.lineTo(72.0f, 33.84f);
        instancePath.close();
        instancePath.moveTo(59.9285f, 9.01681f);
        instancePath.lineTo(62.9832f, 12.0715f);
        instancePath.lineTo(55.3464f, 19.7083f);
        instancePath.lineTo(52.2917f, 16.6536f);
        instancePath.lineTo(59.9285f, 9.01681f);
        instancePath.close();
        instancePath.moveTo(12.0715f, 9.01681f);
        instancePath.lineTo(19.7083f, 16.6536f);
        instancePath.lineTo(16.6536f, 19.7083f);
        instancePath.lineTo(9.01681f, 12.0715f);
        instancePath.lineTo(12.0715f, 9.01681f);
        instancePath.close();
        instancePath.moveTo(38.16f, 0.0f);
        instancePath.lineTo(38.16f, 10.8f);
        instancePath.lineTo(33.84f, 10.8f);
        instancePath.lineTo(33.84f, 0.0f);
        instancePath.lineTo(38.16f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(36.0f, 21.600098f);
        instancePath2.cubicTo(44.947014f, 21.600098f, 52.2f, 28.853085f, 52.2f, 37.8001f);
        instancePath2.cubicTo(52.2f, 46.747112f, 44.947014f, 54.0001f, 36.0f, 54.0001f);
        instancePath2.cubicTo(27.052986f, 54.0001f, 19.8f, 46.747112f, 19.8f, 37.8001f);
        instancePath2.cubicTo(19.8f, 28.853085f, 27.052986f, 21.600098f, 36.0f, 21.600098f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
