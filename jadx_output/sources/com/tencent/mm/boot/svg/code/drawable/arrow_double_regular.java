package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class arrow_double_regular extends l95.c {
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
        instancePath.moveTo(5.51953f, 11.4851f);
        instancePath.lineTo(6.58019f, 12.5458f);
        instancePath.lineTo(12.0048f, 7.12119f);
        instancePath.lineTo(17.4294f, 12.5458f);
        instancePath.lineTo(18.4901f, 11.4851f);
        instancePath.lineTo(12.7112f, 5.70625f);
        instancePath.cubicTo(12.3176f, 5.31266f, 11.6886f, 5.31612f, 11.2984f, 5.70625f);
        instancePath.lineTo(5.51953f, 11.4851f);
        instancePath.close();
        instancePath.moveTo(5.51953f, 17.4851f);
        instancePath.lineTo(6.58019f, 18.5458f);
        instancePath.lineTo(12.0048f, 13.1212f);
        instancePath.lineTo(17.4294f, 18.5458f);
        instancePath.lineTo(18.4901f, 17.4851f);
        instancePath.lineTo(12.7112f, 11.7062f);
        instancePath.cubicTo(12.3176f, 11.3127f, 11.6886f, 11.3161f, 11.2984f, 11.7062f);
        instancePath.lineTo(5.51953f, 17.4851f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
