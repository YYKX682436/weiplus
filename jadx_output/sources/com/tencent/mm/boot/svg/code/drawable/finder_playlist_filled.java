package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_playlist_filled extends l95.c {
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
        instancePath.moveTo(6.0f, 1.7002f);
        instancePath.cubicTo(5.44772f, 1.7002f, 5.0f, 2.14791f, 5.0f, 2.7002f);
        instancePath.lineTo(5.0f, 3.5002f);
        instancePath.lineTo(19.0f, 3.5002f);
        instancePath.lineTo(19.0f, 2.7002f);
        instancePath.cubicTo(19.0f, 2.14791f, 18.5523f, 1.7002f, 18.0f, 1.7002f);
        instancePath.lineTo(6.0f, 1.7002f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.0f, 5.99609f);
        instancePath2.cubicTo(3.0f, 5.44381f, 3.44772f, 4.99609f, 4.0f, 4.99609f);
        instancePath2.lineTo(20.0f, 4.99609f);
        instancePath2.cubicTo(20.5523f, 4.99609f, 21.0f, 5.44381f, 21.0f, 5.99609f);
        instancePath2.lineTo(21.0f, 20.9961f);
        instancePath2.cubicTo(21.0f, 21.5484f, 20.5523f, 21.9961f, 20.0f, 21.9961f);
        instancePath2.lineTo(4.0f, 21.9961f);
        instancePath2.cubicTo(3.44772f, 21.9961f, 3.0f, 21.5484f, 3.0f, 20.9961f);
        instancePath2.lineTo(3.0f, 5.99609f);
        instancePath2.close();
        instancePath2.moveTo(10.4996f, 9.53418f);
        instancePath2.cubicTo(10.6279f, 9.53418f, 10.7534f, 9.57216f, 10.8602f, 9.64335f);
        instancePath2.lineTo(15.4588f, 12.7091f);
        instancePath2.cubicTo(15.7575f, 12.9082f, 15.8382f, 13.3118f, 15.6391f, 13.6105f);
        instancePath2.cubicTo(15.5915f, 13.6819f, 15.5302f, 13.7432f, 15.4588f, 13.7908f);
        instancePath2.lineTo(10.8602f, 16.8565f);
        instancePath2.cubicTo(10.5615f, 17.0556f, 10.1579f, 16.9749f, 9.95878f, 16.6762f);
        instancePath2.cubicTo(9.88759f, 16.5694f, 9.84961f, 16.444f, 9.84961f, 16.3157f);
        instancePath2.lineTo(9.84961f, 10.1842f);
        instancePath2.cubicTo(9.84961f, 9.82519f, 10.1406f, 9.53418f, 10.4996f, 9.53418f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
