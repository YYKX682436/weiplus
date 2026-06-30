package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_remove_chosen extends l95.c {
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
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.0016f, 2.17811f);
        instancePath.cubicTo(12.3828f, 1.82084f, 11.6204f, 1.82084f, 11.0016f, 2.17811f);
        instancePath.lineTo(5.99118f, 5.07085f);
        instancePath.lineTo(3.8966f, 2.97627f);
        instancePath.lineTo(2.83594f, 4.03693f);
        instancePath.lineTo(19.9533f, 21.1543f);
        instancePath.lineTo(21.014f, 20.0936f);
        instancePath.lineTo(19.1779f, 18.2575f);
        instancePath.lineTo(20.0082f, 17.7781f);
        instancePath.cubicTo(20.627f, 17.4208f, 21.0082f, 16.7606f, 21.0082f, 16.0461f);
        instancePath.lineTo(21.0082f, 7.95546f);
        instancePath.cubicTo(21.0082f, 7.24092f, 20.627f, 6.58067f, 20.0082f, 6.2234f);
        instancePath.lineTo(13.0016f, 2.17811f);
        instancePath.close();
        instancePath.moveTo(14.5194f, 13.5991f);
        instancePath.lineTo(14.3777f, 12.7733f);
        instancePath.lineTo(16.7554f, 10.4557f);
        instancePath.lineTo(13.4696f, 9.9782f);
        instancePath.lineTo(12.0001f, 7.00074f);
        instancePath.lineTo(10.6522f, 9.73188f);
        instancePath.lineTo(14.5194f, 13.5991f);
        instancePath.close();
        instancePath.moveTo(2.9949f, 7.95546f);
        instancePath.cubicTo(2.9949f, 7.47142f, 3.16983f, 7.01229f, 3.47505f, 6.65539f);
        instancePath.lineTo(7.27145f, 10.4518f);
        instancePath.lineTo(7.24482f, 10.4557f);
        instancePath.lineTo(8.45303f, 11.6334f);
        instancePath.lineTo(9.61814f, 12.7985f);
        instancePath.lineTo(9.06118f, 16.0458f);
        instancePath.lineTo(11.5546f, 14.735f);
        instancePath.lineTo(16.5781f, 19.7585f);
        instancePath.lineTo(13.0016f, 21.8234f);
        instancePath.cubicTo(12.3828f, 22.1807f, 11.6204f, 22.1807f, 11.0016f, 21.8234f);
        instancePath.lineTo(3.9949f, 17.7781f);
        instancePath.cubicTo(3.3761f, 17.4208f, 2.9949f, 16.7606f, 2.9949f, 16.0461f);
        instancePath.lineTo(2.9949f, 7.95546f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
