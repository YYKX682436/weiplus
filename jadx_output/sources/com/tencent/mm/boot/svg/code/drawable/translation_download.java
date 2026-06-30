package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class translation_download extends l95.c {
    private final int width = 131;
    private final int height = 131;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 131;
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
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 28.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 45.69477f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(34.39553f, 7.9594493f);
            instancePath.lineTo(34.39553f, 45.435207f);
            instancePath.lineTo(29.60442f, 45.435207f);
            instancePath.lineTo(29.60442f, 7.90054f);
            instancePath.lineTo(21.149052f, 16.35591f);
            instancePath.lineTo(17.761225f, 12.968081f);
            instancePath.lineTo(31.33464f, -0.60533595f);
            instancePath.cubicTo(31.769945f, -1.0406404f, 32.47571f, -1.0406404f, 32.91102f, -0.60533595f);
            instancePath.lineTo(35.51066f, 1.994303f);
            instancePath.lineTo(35.417305f, 2.0876534f);
            instancePath.lineTo(46.145424f, 12.815773f);
            instancePath.lineTo(42.69864f, 16.262558f);
            instancePath.lineTo(34.39553f, 7.9594493f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(59.14963f, 19.84413f);
            instancePath2.lineTo(47.97037f, 19.84413f);
            instancePath2.lineTo(47.97037f, 14.96964f);
            instancePath2.lineTo(59.952312f, 14.96964f);
            instancePath2.cubicTo(62.147545f, 14.96964f, 63.940742f, 16.78067f, 63.940742f, 19.014688f);
            instancePath2.lineTo(63.940742f, 71.85572f);
            instancePath2.cubicTo(63.940742f, 74.077225f, 62.16069f, 75.90077f, 59.96488f, 75.90077f);
            instancePath2.lineTo(4.035117f, 75.90077f);
            instancePath2.cubicTo(1.8516147f, 75.90077f, 0.05925926f, 74.089745f, 0.05925926f, 71.85572f);
            instancePath2.lineTo(0.05925926f, 19.014688f);
            instancePath2.cubicTo(0.05925926f, 16.793188f, 1.8449386f, 14.96964f, 4.0476856f, 14.96964f);
            instancePath2.lineTo(16.029629f, 14.96964f);
            instancePath2.lineTo(16.029629f, 19.84413f);
            instancePath2.lineTo(4.8503704f, 19.84413f);
            instancePath2.lineTo(4.8503704f, 71.02628f);
            instancePath2.lineTo(59.14963f, 71.02628f);
            instancePath2.lineTo(59.14963f, 19.84413f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
