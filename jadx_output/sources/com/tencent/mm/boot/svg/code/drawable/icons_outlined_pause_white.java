package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pause_white extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-419430401);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.0f, 0.0f);
        instancePath.cubicTo(18.627417f, 0.0f, 24.0f, 5.372583f, 24.0f, 12.0f);
        instancePath.cubicTo(24.0f, 18.627417f, 18.627417f, 24.0f, 12.0f, 24.0f);
        instancePath.cubicTo(5.372583f, 24.0f, 0.0f, 18.627417f, 0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.372583f, 5.372583f, 0.0f, 12.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 0.72f);
        instancePath.cubicTo(5.770228f, 0.72f, 0.72f, 5.770228f, 0.72f, 12.0f);
        instancePath.cubicTo(0.72f, 18.229773f, 5.770228f, 23.28f, 12.0f, 23.28f);
        instancePath.cubicTo(18.229773f, 23.28f, 23.28f, 18.229773f, 23.28f, 12.0f);
        instancePath.cubicTo(23.28f, 5.770228f, 18.229773f, 0.72f, 12.0f, 0.72f);
        instancePath.close();
        instancePath.moveTo(10.2f, 7.8f);
        instancePath.cubicTo(10.531371f, 7.8f, 10.8f, 8.05072f, 10.8f, 8.36f);
        instancePath.lineTo(10.8f, 15.64f);
        instancePath.cubicTo(10.8f, 15.94928f, 10.531371f, 16.2f, 10.2f, 16.2f);
        instancePath.lineTo(9.0f, 16.2f);
        instancePath.cubicTo(8.668629f, 16.2f, 8.4f, 15.94928f, 8.4f, 15.64f);
        instancePath.lineTo(8.4f, 8.36f);
        instancePath.cubicTo(8.4f, 8.05072f, 8.668629f, 7.8f, 9.0f, 7.8f);
        instancePath.lineTo(10.2f, 7.8f);
        instancePath.close();
        instancePath.moveTo(15.0f, 7.8f);
        instancePath.cubicTo(15.33137f, 7.8f, 15.6f, 8.05072f, 15.6f, 8.36f);
        instancePath.lineTo(15.6f, 15.64f);
        instancePath.cubicTo(15.6f, 15.94928f, 15.33137f, 16.2f, 15.0f, 16.2f);
        instancePath.lineTo(13.8f, 16.2f);
        instancePath.cubicTo(13.468629f, 16.2f, 13.2f, 15.94928f, 13.2f, 15.64f);
        instancePath.lineTo(13.2f, 8.36f);
        instancePath.cubicTo(13.2f, 8.05072f, 13.468629f, 7.8f, 13.8f, 7.8f);
        instancePath.lineTo(15.0f, 7.8f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
