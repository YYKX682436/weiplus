package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bubble_3_dot extends l95.c {
    private final int width = 17;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 17;
        }
        if (i17 == 1) {
            return 16;
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
            instancePaint3.setColor(-1946157056);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.77458f, 2.0f);
            instancePath.cubicTo(12.4565f, 2.0f, 15.4412f, 4.53705f, 15.4412f, 7.66667f);
            instancePath.cubicTo(15.4412f, 10.7963f, 12.4565f, 13.3333f, 8.77458f, 13.3333f);
            instancePath.cubicTo(8.02192f, 13.3333f, 7.2984f, 13.2273f, 6.62355f, 13.0319f);
            instancePath.lineTo(4.63491f, 13.9855f);
            instancePath.cubicTo(4.57815f, 14.0127f, 4.51483f, 14.0233f, 4.4523f, 14.016f);
            instancePath.cubicTo(4.26944f, 13.9947f, 4.13843f, 13.8293f, 4.15968f, 13.6464f);
            instancePath.lineTo(4.36108f, 11.9138f);
            instancePath.cubicTo(2.97924f, 10.8756f, 2.10791f, 9.3576f, 2.10791f, 7.66667f);
            instancePath.cubicTo(2.10791f, 4.53705f, 5.09268f, 2.0f, 8.77458f, 2.0f);
            instancePath.close();
            instancePath.moveTo(8.77458f, 2.8f);
            instancePath.cubicTo(5.50829f, 2.8f, 2.90791f, 5.01032f, 2.90791f, 7.66667f);
            instancePath.cubicTo(2.90791f, 9.05062f, 3.61253f, 10.3507f, 4.84164f, 11.2742f);
            instancePath.lineTo(5.20875f, 11.5501f);
            instancePath.lineTo(5.05204f, 12.8982f);
            instancePath.lineTo(6.55288f, 12.1786f);
            instancePath.lineTo(6.84607f, 12.2635f);
            instancePath.cubicTo(7.46027f, 12.4413f, 8.10938f, 12.5333f, 8.77458f, 12.5333f);
            instancePath.cubicTo(12.0409f, 12.5333f, 14.6412f, 10.323f, 14.6412f, 7.66667f);
            instancePath.cubicTo(14.6412f, 5.01032f, 12.0409f, 2.8f, 8.77458f, 2.8f);
            instancePath.close();
            instancePath.moveTo(6.10791f, 7.0f);
            instancePath.cubicTo(6.4761f, 7.0f, 6.77458f, 7.29848f, 6.77458f, 7.66667f);
            instancePath.cubicTo(6.77458f, 8.03486f, 6.4761f, 8.33333f, 6.10791f, 8.33333f);
            instancePath.cubicTo(5.73972f, 8.33333f, 5.44124f, 8.03486f, 5.44124f, 7.66667f);
            instancePath.cubicTo(5.44124f, 7.29848f, 5.73972f, 7.0f, 6.10791f, 7.0f);
            instancePath.close();
            instancePath.moveTo(8.77458f, 7.0f);
            instancePath.cubicTo(9.14277f, 7.0f, 9.44124f, 7.29848f, 9.44124f, 7.66667f);
            instancePath.cubicTo(9.44124f, 8.03486f, 9.14277f, 8.33333f, 8.77458f, 8.33333f);
            instancePath.cubicTo(8.40639f, 8.33333f, 8.10791f, 8.03486f, 8.10791f, 7.66667f);
            instancePath.cubicTo(8.10791f, 7.29848f, 8.40639f, 7.0f, 8.77458f, 7.0f);
            instancePath.close();
            instancePath.moveTo(11.4412f, 7.0f);
            instancePath.cubicTo(11.8094f, 7.0f, 12.1079f, 7.29848f, 12.1079f, 7.66667f);
            instancePath.cubicTo(12.1079f, 8.03486f, 11.8094f, 8.33333f, 11.4412f, 8.33333f);
            instancePath.cubicTo(11.0731f, 8.33333f, 10.7746f, 8.03486f, 10.7746f, 7.66667f);
            instancePath.cubicTo(10.7746f, 7.29848f, 11.0731f, 7.0f, 11.4412f, 7.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
