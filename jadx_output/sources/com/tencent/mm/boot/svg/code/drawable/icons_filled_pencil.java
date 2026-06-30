package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_pencil extends l95.c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(42.0f, 9.0f);
        instancePath.lineTo(42.0f, 15.0f);
        instancePath.lineTo(15.0f, 15.0f);
        instancePath.lineTo(15.0f, 57.0f);
        instancePath.lineTo(57.0f, 57.0f);
        instancePath.lineTo(57.0f, 30.0f);
        instancePath.lineTo(63.0f, 30.0f);
        instancePath.lineTo(63.0f, 60.0f);
        instancePath.cubicTo(63.0f, 61.656853f, 61.656853f, 63.0f, 60.0f, 63.0f);
        instancePath.lineTo(12.0f, 63.0f);
        instancePath.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        instancePath.lineTo(9.0f, 12.0f);
        instancePath.cubicTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f);
        instancePath.lineTo(42.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(59.8211f, 10.06066f);
        instancePath.lineTo(61.94242f, 12.18198f);
        instancePath.cubicTo(62.528206f, 12.767767f, 62.528206f, 13.717514f, 61.94242f, 14.303301f);
        instancePath.lineTo(33.94283f, 42.302895f);
        instancePath.lineTo(27.965082f, 45.2428f);
        instancePath.cubicTo(27.51905f, 45.462166f, 26.979641f, 45.27841f, 26.760279f, 44.832382f);
        instancePath.cubicTo(26.637094f, 44.581913f, 26.637094f, 44.288467f, 26.760279f, 44.038f);
        instancePath.lineTo(29.700188f, 38.060253f);
        instancePath.lineTo(57.69978f, 10.06066f);
        instancePath.cubicTo(58.285564f, 9.474874f, 59.235313f, 9.474874f, 59.8211f, 10.06066f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
