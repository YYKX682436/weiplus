package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_voice_back_play extends l95.c {
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
        instancePaint3.setColor(-436207616);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.8918f, 13.2513f);
        instancePath.lineTo(14.5f, 15.643f);
        instancePath.lineTo(16.8918f, 18.0349f);
        instancePath.cubicTo(17.2795f, 17.3244f, 17.4999f, 16.5095f, 17.4999f, 15.6431f);
        instancePath.cubicTo(17.4999f, 14.7767f, 17.2795f, 13.9617f, 16.8918f, 13.2513f);
        instancePath.close();
        instancePath.moveTo(18.3482f, 19.4913f);
        instancePath.lineTo(20.1431f, 21.2861f);
        instancePath.cubicTo(21.31f, 19.7083f, 22.0f, 17.7563f, 22.0f, 15.6431f);
        instancePath.cubicTo(22.0f, 13.5299f, 21.31f, 11.5779f, 20.143f, 10.0f);
        instancePath.lineTo(18.3482f, 11.7949f);
        instancePath.cubicTo(19.0762f, 12.899f, 19.5f, 14.2216f, 19.5f, 15.6431f);
        instancePath.cubicTo(19.5f, 17.0646f, 19.0762f, 18.3871f, 18.3482f, 19.4913f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        instancePaint4.setColor(-436207616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.6144f, 20.0f);
        instancePath2.lineTo(7.2f, 20.0f);
        instancePath2.cubicTo(6.60695f, 20.0f, 6.28244f, 19.9984f, 6.04927f, 19.9794f);
        instancePath2.lineTo(6.0229f, 19.9771f);
        instancePath2.lineTo(6.02061f, 19.9507f);
        instancePath2.cubicTo(6.00156f, 19.7176f, 6.0f, 19.3931f, 6.0f, 18.8f);
        instancePath2.lineTo(6.0f, 5.2f);
        instancePath2.cubicTo(6.0f, 4.60695f, 6.00156f, 4.28244f, 6.02061f, 4.04927f);
        instancePath2.lineTo(6.0229f, 4.0229f);
        instancePath2.lineTo(6.04927f, 4.02061f);
        instancePath2.cubicTo(6.28244f, 4.00156f, 6.60695f, 4.0f, 7.2f, 4.0f);
        instancePath2.lineTo(14.8f, 4.0f);
        instancePath2.cubicTo(15.3931f, 4.0f, 15.7176f, 4.00156f, 15.9507f, 4.02061f);
        instancePath2.lineTo(15.9771f, 4.0229f);
        instancePath2.lineTo(15.9794f, 4.04927f);
        instancePath2.cubicTo(15.9984f, 4.28244f, 16.0f, 4.60695f, 16.0f, 5.2f);
        instancePath2.lineTo(16.0f, 9.90029f);
        instancePath2.lineTo(18.0f, 7.90029f);
        instancePath2.lineTo(18.0f, 5.2f);
        instancePath2.cubicTo(18.0f, 4.0799f, 18.0f, 3.51984f, 17.782f, 3.09202f);
        instancePath2.cubicTo(17.5903f, 2.71569f, 17.2843f, 2.40973f, 16.908f, 2.21799f);
        instancePath2.cubicTo(16.4802f, 2.0f, 15.9201f, 2.0f, 14.8f, 2.0f);
        instancePath2.lineTo(7.2f, 2.0f);
        instancePath2.cubicTo(6.0799f, 2.0f, 5.51984f, 2.0f, 5.09202f, 2.21799f);
        instancePath2.cubicTo(4.71569f, 2.40973f, 4.40973f, 2.71569f, 4.21799f, 3.09202f);
        instancePath2.cubicTo(4.0f, 3.51984f, 4.0f, 4.0799f, 4.0f, 5.2f);
        instancePath2.lineTo(4.0f, 18.8f);
        instancePath2.cubicTo(4.0f, 19.9201f, 4.0f, 20.4802f, 4.21799f, 20.908f);
        instancePath2.cubicTo(4.40973f, 21.2843f, 4.71569f, 21.5903f, 5.09202f, 21.782f);
        instancePath2.cubicTo(5.51984f, 22.0f, 6.0799f, 22.0f, 7.2f, 22.0f);
        instancePath2.lineTo(14.8f, 22.0f);
        instancePath2.cubicTo(15.6208f, 22.0f, 16.1409f, 22.0f, 16.5286f, 21.9142f);
        instancePath2.lineTo(14.6144f, 20.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
