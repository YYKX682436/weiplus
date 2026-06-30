package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class album_location_icon_pressed extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(33.785156f, 66.40234f);
            instancePath.cubicTo(33.785156f, 66.40234f, 12.0f, 48.054688f, 12.0f, 30.0f);
            instancePath.cubicTo(12.0f, 16.746094f, 22.746094f, 6.0f, 36.0f, 6.0f);
            instancePath.cubicTo(49.253906f, 6.0f, 60.0f, 16.746094f, 60.0f, 30.0f);
            instancePath.cubicTo(60.0f, 48.054688f, 38.214844f, 66.40234f, 38.214844f, 66.40234f);
            instancePath.cubicTo(37.0f, 67.51953f, 35.007812f, 67.50781f, 33.785156f, 66.40234f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.601562f);
            instancePath.cubicTo(41.30078f, 39.601562f, 45.601562f, 35.30078f, 45.601562f, 30.0f);
            instancePath.cubicTo(45.601562f, 24.699219f, 41.30078f, 20.398438f, 36.0f, 20.398438f);
            instancePath.cubicTo(30.699219f, 20.398438f, 26.398438f, 24.699219f, 26.398438f, 30.0f);
            instancePath.cubicTo(26.398438f, 35.30078f, 30.699219f, 39.601562f, 36.0f, 39.601562f);
            instancePath.close();
            instancePath.moveTo(36.0f, 39.601562f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
