package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_subtitle_icon extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.19531f, 20.9997f);
        instancePath.cubicTo(7.19531f, 16.6919f, 10.6875f, 13.1997f, 14.9953f, 13.1997f);
        instancePath.lineTo(56.9953f, 13.1997f);
        instancePath.cubicTo(61.3031f, 13.1997f, 64.7953f, 16.6919f, 64.7953f, 20.9997f);
        instancePath.lineTo(64.7953f, 50.9997f);
        instancePath.cubicTo(64.7953f, 55.3075f, 61.3031f, 58.7997f, 56.9953f, 58.7997f);
        instancePath.lineTo(14.9953f, 58.7997f);
        instancePath.cubicTo(10.6875f, 58.7997f, 7.19531f, 55.3075f, 7.19531f, 50.9997f);
        instancePath.lineTo(7.19531f, 20.9997f);
        instancePath.close();
        instancePath.moveTo(14.9953f, 16.7997f);
        instancePath.cubicTo(12.6757f, 16.7997f, 10.7953f, 18.6801f, 10.7953f, 20.9997f);
        instancePath.lineTo(10.7953f, 50.9997f);
        instancePath.cubicTo(10.7953f, 53.3193f, 12.6757f, 55.1997f, 14.9953f, 55.1997f);
        instancePath.lineTo(56.9953f, 55.1997f);
        instancePath.cubicTo(59.3149f, 55.1997f, 61.1953f, 53.3193f, 61.1953f, 50.9997f);
        instancePath.lineTo(61.1953f, 20.9997f);
        instancePath.cubicTo(61.1953f, 18.6801f, 59.3149f, 16.7997f, 56.9953f, 16.7997f);
        instancePath.lineTo(14.9953f, 16.7997f);
        instancePath.close();
        instancePath.moveTo(50.9953f, 46.7997f);
        instancePath.lineTo(35.9953f, 46.7997f);
        instancePath.cubicTo(35.0012f, 46.7997f, 34.1953f, 45.9938f, 34.1953f, 44.9997f);
        instancePath.cubicTo(34.1953f, 44.0056f, 35.0012f, 43.1997f, 35.9953f, 43.1997f);
        instancePath.lineTo(50.9953f, 43.1997f);
        instancePath.cubicTo(51.9894f, 43.1997f, 52.7953f, 44.0056f, 52.7953f, 44.9997f);
        instancePath.cubicTo(52.7953f, 45.9938f, 51.9894f, 46.7997f, 50.9953f, 46.7997f);
        instancePath.close();
        instancePath.moveTo(20.9953f, 43.1997f);
        instancePath.cubicTo(20.0012f, 43.1997f, 19.1953f, 44.0056f, 19.1953f, 44.9997f);
        instancePath.cubicTo(19.1953f, 45.9938f, 20.0012f, 46.7997f, 20.9953f, 46.7997f);
        instancePath.lineTo(26.9953f, 46.7997f);
        instancePath.cubicTo(27.9894f, 46.7997f, 28.7953f, 45.9938f, 28.7953f, 44.9997f);
        instancePath.cubicTo(28.7953f, 44.0056f, 27.9894f, 43.1997f, 26.9953f, 43.1997f);
        instancePath.lineTo(20.9953f, 43.1997f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
