package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_download_filled extends l95.c {
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
        instancePaint3.setColor(-16268960);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.5791f, 13.6147f);
        instancePath.lineTo(14.3008f, 11.8931f);
        instancePath.lineTo(15.4316f, 13.0239f);
        instancePath.lineTo(12.332f, 16.1235f);
        instancePath.cubicTo(12.0196f, 16.436f, 11.5126f, 16.436f, 11.2002f, 16.1235f);
        instancePath.lineTo(8.10059f, 13.0239f);
        instancePath.lineTo(9.23242f, 11.8931f);
        instancePath.lineTo(10.9795f, 13.6401f);
        instancePath.lineTo(10.9795f, 7.64404f);
        instancePath.lineTo(12.5791f, 7.64404f);
        instancePath.lineTo(12.5791f, 13.6147f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
