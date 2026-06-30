package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_post_mode_arrow_down extends l95.c {
    private final int width = 16;
    private final int height = 8;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 8;
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
            instancePaint3.setColor(-419430401);
            instancePaint3.setColor(-419430401);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(7.52567f, 6.41629f);
            instancePath.lineTo(3.75443f, 2.64505f);
            instancePath.lineTo(4.69724f, 1.70225f);
            instancePath.lineTo(7.99707f, 5.00208f);
            instancePath.lineTo(11.2969f, 1.70225f);
            instancePath.lineTo(12.2397f, 2.64506f);
            instancePath.lineTo(8.46847f, 6.41629f);
            instancePath.cubicTo(8.20813f, 6.67664f, 7.78602f, 6.67664f, 7.52567f, 6.41629f);
            instancePath.lineTo(7.52567f, 6.41629f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
