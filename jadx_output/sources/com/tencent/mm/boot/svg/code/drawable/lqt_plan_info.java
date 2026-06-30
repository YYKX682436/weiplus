package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lqt_plan_info extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-8421505);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(36.0f, 61.0f);
            instancePath.cubicTo(22.19288f, 61.0f, 11.0f, 49.807117f, 11.0f, 36.0f);
            instancePath.cubicTo(11.0f, 22.19288f, 22.19288f, 11.0f, 36.0f, 11.0f);
            instancePath.cubicTo(49.807117f, 11.0f, 61.0f, 22.19288f, 61.0f, 36.0f);
            instancePath.cubicTo(61.0f, 49.807117f, 49.807117f, 61.0f, 36.0f, 61.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 58.0f);
            instancePath.cubicTo(48.150265f, 58.0f, 58.0f, 48.150265f, 58.0f, 36.0f);
            instancePath.cubicTo(58.0f, 23.849735f, 48.150265f, 14.0f, 36.0f, 14.0f);
            instancePath.cubicTo(23.849735f, 14.0f, 14.0f, 23.849735f, 14.0f, 36.0f);
            instancePath.cubicTo(14.0f, 48.150265f, 23.849735f, 58.0f, 36.0f, 58.0f);
            instancePath.close();
            instancePath.moveTo(34.5f, 31.0f);
            instancePath.lineTo(37.5f, 31.0f);
            instancePath.lineTo(37.5f, 48.5f);
            instancePath.lineTo(34.5f, 48.5f);
            instancePath.lineTo(34.5f, 31.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 28.5f);
            instancePath.cubicTo(34.61929f, 28.5f, 33.5f, 27.380713f, 33.5f, 26.0f);
            instancePath.cubicTo(33.5f, 24.619287f, 34.61929f, 23.5f, 36.0f, 23.5f);
            instancePath.cubicTo(37.38071f, 23.5f, 38.5f, 24.619287f, 38.5f, 26.0f);
            instancePath.cubicTo(38.5f, 27.380713f, 37.38071f, 28.5f, 36.0f, 28.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
