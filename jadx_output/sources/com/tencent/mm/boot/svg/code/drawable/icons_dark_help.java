package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_dark_help extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 64;
        }
        if (i17 == 2) {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15616);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.333333f, 0.0f, 1.0f, 5.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(26.666666f, 0.0f);
            instancePath.cubicTo(41.39426f, 0.0f, 53.333332f, 11.939074f, 53.333332f, 26.666666f);
            instancePath.cubicTo(53.333332f, 41.39426f, 41.39426f, 53.333332f, 26.666666f, 53.333332f);
            instancePath.cubicTo(11.939074f, 53.333332f, 0.0f, 41.39426f, 0.0f, 26.666666f);
            instancePath.cubicTo(0.0f, 11.939074f, 11.939074f, 0.0f, 26.666666f, 0.0f);
            instancePath.close();
            instancePath.moveTo(26.666666f, 36.72578f);
            instancePath.cubicTo(25.416666f, 36.72578f, 24.440104f, 37.68281f, 24.440104f, 38.952343f);
            instancePath.cubicTo(24.440104f, 40.202343f, 25.416666f, 41.178905f, 26.666666f, 41.178905f);
            instancePath.cubicTo(27.936197f, 41.178905f, 28.893229f, 40.202343f, 28.893229f, 38.952343f);
            instancePath.cubicTo(28.893229f, 37.68281f, 27.936197f, 36.72578f, 26.666666f, 36.72578f);
            instancePath.close();
            instancePath.moveTo(28.424479f, 12.8f);
            instancePath.lineTo(24.908854f, 12.8f);
            instancePath.lineTo(25.143229f, 31.628126f);
            instancePath.lineTo(28.190104f, 31.628126f);
            instancePath.lineTo(28.424479f, 12.8f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
