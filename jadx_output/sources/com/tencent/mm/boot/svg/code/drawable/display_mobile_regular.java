package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class display_mobile_regular extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.2f, 4.7f);
        instancePath.lineTo(2.2f, 17.5f);
        instancePath.lineTo(13.5049f, 17.5f);
        instancePath.lineTo(13.5049f, 18.7f);
        instancePath.lineTo(2.0f, 18.7f);
        instancePath.cubicTo(1.44772f, 18.7f, 1.0f, 18.2522f, 1.0f, 17.7f);
        instancePath.lineTo(1.0f, 4.5f);
        instancePath.cubicTo(1.0f, 3.94772f, 1.44772f, 3.5f, 2.0f, 3.5f);
        instancePath.lineTo(20.2002f, 3.5f);
        instancePath.cubicTo(20.7525f, 3.5f, 21.2002f, 3.94772f, 21.2002f, 4.5f);
        instancePath.lineTo(21.2002f, 7.6001f);
        instancePath.lineTo(20.0002f, 7.6001f);
        instancePath.lineTo(20.0002f, 4.7f);
        instancePath.lineTo(2.2f, 4.7f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.5049f, 19.9001f);
        instancePath2.lineTo(13.5049f, 20.1001f);
        instancePath2.cubicTo(13.5049f, 20.4557f, 13.5791f, 20.7939f, 13.7129f, 21.1002f);
        instancePath2.lineTo(6.59961f, 21.1002f);
        instancePath2.lineTo(6.59961f, 20.9001f);
        instancePath2.cubicTo(6.59961f, 20.3479f, 7.04732f, 19.9001f, 7.59961f, 19.9001f);
        instancePath2.lineTo(13.5049f, 19.9001f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.0049f, 9.1001f);
        instancePath3.cubicTo(15.4526f, 9.1001f, 15.0049f, 9.54781f, 15.0049f, 10.1001f);
        instancePath3.lineTo(15.0049f, 20.1001f);
        instancePath3.cubicTo(15.0049f, 20.6524f, 15.4526f, 21.1001f, 16.0049f, 21.1001f);
        instancePath3.lineTo(22.0049f, 21.1001f);
        instancePath3.cubicTo(22.5572f, 21.1001f, 23.0049f, 20.6524f, 23.0049f, 20.1001f);
        instancePath3.lineTo(23.0049f, 10.1001f);
        instancePath3.cubicTo(23.0049f, 9.54781f, 22.5572f, 9.1001f, 22.0049f, 9.1001f);
        instancePath3.lineTo(16.0049f, 9.1001f);
        instancePath3.close();
        instancePath3.moveTo(16.2049f, 10.3001f);
        instancePath3.lineTo(16.2049f, 19.9001f);
        instancePath3.lineTo(21.8049f, 19.9001f);
        instancePath3.lineTo(21.8049f, 10.3001f);
        instancePath3.lineTo(16.2049f, 10.3001f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
