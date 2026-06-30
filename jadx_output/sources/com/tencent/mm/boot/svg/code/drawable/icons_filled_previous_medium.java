package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_previous_medium extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(11.9754f, 4.77375f);
            instancePath.lineTo(10.7035f, 3.5f);
            instancePath.lineTo(6.70364f, 7.49387f);
            instancePath.cubicTo(6.50805f, 7.68917f, 6.50802f, 8.0061f, 6.70356f, 8.20143f);
            instancePath.lineTo(10.7073f, 12.2009f);
            instancePath.lineTo(11.9794f, 10.9275f);
            instancePath.lineTo(9.8497f, 8.8f);
            instancePath.lineTo(14.0f, 8.8f);
            instancePath.cubicTo(16.3196f, 8.8f, 18.2f, 10.6804f, 18.2f, 13.0f);
            instancePath.cubicTo(18.2f, 15.3196f, 16.3196f, 17.2f, 14.0f, 17.2f);
            instancePath.lineTo(4.8f, 17.2f);
            instancePath.lineTo(4.8f, 17.1953f);
            instancePath.lineTo(3.0f, 17.1953f);
            instancePath.lineTo(3.0f, 19.0f);
            instancePath.lineTo(14.0f, 19.0f);
            instancePath.cubicTo(17.3137f, 19.0f, 20.0f, 16.3137f, 20.0f, 13.0f);
            instancePath.cubicTo(20.0f, 9.68629f, 17.3137f, 7.0f, 14.0f, 7.0f);
            instancePath.lineTo(9.74576f, 7.0f);
            instancePath.lineTo(11.9754f, 4.77375f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
