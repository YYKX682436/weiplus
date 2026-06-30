package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_select_filled extends l95.c {
    private final int width = 26;
    private final int height = 26;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
        instancePaint3.setColor(-16268960);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 13.0f);
        instancePath.cubicTo(1.0f, 6.3725824f, 6.3725824f, 1.0f, 13.0f, 1.0f);
        instancePath.lineTo(13.0f, 1.0f);
        instancePath.cubicTo(19.627419f, 1.0f, 25.0f, 6.3725824f, 25.0f, 13.0f);
        instancePath.lineTo(25.0f, 13.0f);
        instancePath.cubicTo(25.0f, 19.627419f, 19.627419f, 25.0f, 13.0f, 25.0f);
        instancePath.lineTo(13.0f, 25.0f);
        instancePath.cubicTo(6.3725824f, 25.0f, 1.0f, 19.627419f, 1.0f, 13.0f);
        instancePath.lineTo(1.0f, 13.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.7712f, 17.2902f);
        instancePath2.lineTo(7.0f, 13.5189f);
        instancePath2.lineTo(7.94281f, 12.5761f);
        instancePath2.lineTo(11.2426f, 15.876f);
        instancePath2.lineTo(18.7851f, 8.3335f);
        instancePath2.lineTo(19.7279f, 9.27631f);
        instancePath2.lineTo(11.714f, 17.2902f);
        instancePath2.cubicTo(11.4537f, 17.5505f, 11.0316f, 17.5505f, 10.7712f, 17.2902f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
