package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_screen_cast extends l95.c {
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
        instancePath.moveTo(21.0f, 3.0f);
        instancePath.cubicTo(21.5523f, 3.0f, 22.0f, 3.44772f, 22.0f, 4.0f);
        instancePath.lineTo(22.0f, 15.0f);
        instancePath.cubicTo(22.0f, 15.5523f, 21.5523f, 16.0f, 21.0f, 16.0f);
        instancePath.lineTo(16.098f, 16.0f);
        instancePath.lineTo(16.964f, 17.5f);
        instancePath.lineTo(17.0f, 17.5f);
        instancePath.lineTo(17.0f, 17.563f);
        instancePath.lineTo(19.0021f, 21.0311f);
        instancePath.lineTo(17.27f, 22.0311f);
        instancePath.lineTo(15.808f, 19.5f);
        instancePath.lineTo(8.193f, 19.5f);
        instancePath.lineTo(6.73205f, 22.0311f);
        instancePath.lineTo(5.0f, 21.0311f);
        instancePath.lineTo(7.0f, 17.565f);
        instancePath.lineTo(7.0f, 17.5f);
        instancePath.lineTo(7.037f, 17.5f);
        instancePath.lineTo(7.903f, 16.0f);
        instancePath.lineTo(3.0f, 16.0f);
        instancePath.cubicTo(2.44772f, 16.0f, 2.0f, 15.5523f, 2.0f, 15.0f);
        instancePath.lineTo(2.0f, 4.0f);
        instancePath.cubicTo(2.0f, 3.44772f, 2.44772f, 3.0f, 3.0f, 3.0f);
        instancePath.lineTo(21.0f, 3.0f);
        instancePath.close();
        instancePath.moveTo(13.7871f, 16.0f);
        instancePath.lineTo(10.2141f, 16.0f);
        instancePath.lineTo(9.34814f, 17.5f);
        instancePath.lineTo(14.6531f, 17.5f);
        instancePath.lineTo(13.7871f, 16.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
