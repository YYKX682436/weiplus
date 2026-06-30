package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icons_outlined_cast_screen extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.0f, 36.0f);
        instancePath.lineTo(12.0f, 36.0f);
        instancePath.lineTo(12.0f, 33.0f);
        instancePath.lineTo(7.75f, 33.0f);
        instancePath.cubicTo(7.33579f, 33.0f, 7.0f, 32.6642f, 7.0f, 32.25f);
        instancePath.lineTo(7.0f, 9.75f);
        instancePath.cubicTo(7.0f, 9.33579f, 7.33579f, 9.0f, 7.75f, 9.0f);
        instancePath.lineTo(40.75f, 9.0f);
        instancePath.cubicTo(41.1642f, 9.0f, 41.5f, 9.33579f, 41.5f, 9.75f);
        instancePath.lineTo(41.5f, 32.25f);
        instancePath.cubicTo(41.5f, 32.6642f, 41.1642f, 33.0f, 40.75f, 33.0f);
        instancePath.lineTo(36.0f, 33.0f);
        instancePath.lineTo(36.0f, 36.0f);
        instancePath.lineTo(42.0f, 36.0f);
        instancePath.cubicTo(43.1046f, 36.0f, 44.0f, 35.1046f, 44.0f, 34.0f);
        instancePath.lineTo(44.0f, 8.0f);
        instancePath.cubicTo(44.0f, 6.89543f, 43.1046f, 6.0f, 42.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.cubicTo(4.89543f, 6.0f, 4.0f, 6.89543f, 4.0f, 8.0f);
        instancePath.lineTo(4.0f, 34.0f);
        instancePath.cubicTo(4.0f, 35.1046f, 4.89543f, 36.0f, 6.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(25.239f, 28.1488f);
        instancePath.cubicTo(24.5627f, 27.3034f, 23.4453f, 27.2934f, 22.761f, 28.1488f);
        instancePath.lineTo(13.239f, 40.0512f);
        instancePath.cubicTo(12.5627f, 40.8966f, 12.8976f, 41.6f, 14.0049f, 41.6f);
        instancePath.lineTo(33.9951f, 41.6f);
        instancePath.cubicTo(35.0885f, 41.6f, 35.4453f, 40.9066f, 34.761f, 40.0512f);
        instancePath.lineTo(25.239f, 28.1488f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
