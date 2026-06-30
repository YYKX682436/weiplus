package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_read_clean extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(34.2f, 15.0f);
                instancePath.lineTo(37.8f, 15.0f);
                instancePath.lineTo(37.8f, 59.001263f);
                instancePath.lineTo(36.0f, 60.0f);
                instancePath.lineTo(34.2f, 59.001263f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
                instancePaint5.setColor(-16777216);
                instancePaint5.setStrokeWidth(3.6f);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(36.0f, 14.785034f);
                instancePath2.lineTo(59.572838f, 11.394009f);
                instancePath2.cubicTo(61.21281f, 11.158093f, 62.733517f, 12.296308f, 62.969433f, 13.936279f);
                instancePath2.cubicTo(62.989784f, 14.077757f, 63.0f, 14.220509f, 63.0f, 14.363441f);
                instancePath2.lineTo(63.0f, 50.394005f);
                instancePath2.cubicTo(63.0f, 53.377686f, 60.807602f, 55.908035f, 57.854324f, 56.332874f);
                instancePath2.lineTo(36.0f, 59.476685f);
                instancePath2.lineTo(14.145676f, 56.332874f);
                instancePath2.cubicTo(11.192398f, 55.908035f, 9.0f, 53.377686f, 9.0f, 50.394005f);
                instancePath2.lineTo(9.0f, 14.363441f);
                instancePath2.cubicTo(9.0f, 14.220509f, 9.010215f, 14.077757f, 9.030567f, 13.936279f);
                instancePath2.cubicTo(9.266482f, 12.296308f, 10.7871895f, 11.158093f, 12.427162f, 11.394009f);
                instancePath2.lineTo(36.0f, 14.785034f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
