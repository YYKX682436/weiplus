package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_microphone_mute_on_light extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
        }
        if (i17 != 2) {
            return 0;
        }
        android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
        android.os.Looper looper = (android.os.Looper) objArr[1];
        android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
        float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.5f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        instancePath.cubicTo(6.6863f, 0.0f, 4.0f, 2.68629f, 4.0f, 6.0f);
        instancePath.lineTo(4.0f, 14.0f);
        instancePath.cubicTo(4.0f, 16.76061f, 5.8644f, 19.08581f, 8.4027f, 19.78511f);
        instancePath.cubicTo(8.4168f, 19.23271f, 8.4851f, 18.69371f, 8.6025f, 18.17341f);
        instancePath.cubicTo(6.8575f, 17.58931f, 5.6f, 15.94151f, 5.6f, 14.0f);
        instancePath.lineTo(5.6f, 6.0f);
        instancePath.cubicTo(5.6f, 3.56995f, 7.5699f, 1.6f, 10.0f, 1.6f);
        instancePath.cubicTo(12.4301f, 1.6f, 14.4f, 3.56995f, 14.4f, 6.0f);
        instancePath.lineTo(14.4f, 12.04791f);
        instancePath.cubicTo(14.9146f, 11.90151f, 15.4497f, 11.80371f, 16.0f, 11.75981f);
        instancePath.lineTo(16.0f, 6.0f);
        instancePath.cubicTo(16.0f, 2.68629f, 13.3137f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(8.7253f, 22.30391f);
        instancePath.cubicTo(9.1153f, 23.65061f, 9.8386f, 24.85571f, 10.8f, 25.82411f);
        instancePath.lineTo(10.8f, 28.00001f);
        instancePath.lineTo(9.2f, 28.00001f);
        instancePath.lineTo(9.2f, 23.96851f);
        instancePath.cubicTo(4.0512f, 23.56091f, 0.0f, 19.25361f, 0.0f, 14.00001f);
        instancePath.lineTo(0.0f, 12.00001f);
        instancePath.lineTo(1.6f, 12.00001f);
        instancePath.lineTo(1.6f, 14.00001f);
        instancePath.cubicTo(1.6f, 18.20581f, 4.691f, 21.68971f, 8.7253f, 22.30391f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-372399);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.6667f, 13.33301f);
        instancePath2.cubicTo(20.3486f, 13.33301f, 23.3333f, 16.31781f, 23.3333f, 19.99971f);
        instancePath2.cubicTo(23.3333f, 23.68161f, 20.3486f, 26.66631f, 16.6667f, 26.66631f);
        instancePath2.cubicTo(12.9848f, 26.66631f, 10.0f, 23.68161f, 10.0f, 19.99971f);
        instancePath2.cubicTo(10.0f, 16.31781f, 12.9848f, 13.33301f, 16.6667f, 13.33301f);
        instancePath2.close();
        instancePath2.moveTo(12.563f, 17.02741f);
        instancePath2.cubicTo(11.9572f, 17.86231f, 11.6f, 18.88931f, 11.6f, 19.99971f);
        instancePath2.cubicTo(11.6f, 22.79791f, 13.8684f, 25.06631f, 16.6667f, 25.06631f);
        instancePath2.cubicTo(17.7771f, 25.06631f, 18.8041f, 24.70911f, 19.639f, 24.10331f);
        instancePath2.lineTo(12.563f, 17.02741f);
        instancePath2.close();
        instancePath2.moveTo(13.6944f, 15.89601f);
        instancePath2.lineTo(20.7703f, 22.97201f);
        instancePath2.cubicTo(21.3761f, 22.13711f, 21.7333f, 21.11011f, 21.7333f, 19.99971f);
        instancePath2.cubicTo(21.7333f, 17.20141f, 19.4649f, 14.93301f, 16.6667f, 14.93301f);
        instancePath2.cubicTo(15.5563f, 14.93301f, 14.5293f, 15.29021f, 13.6944f, 15.89601f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
