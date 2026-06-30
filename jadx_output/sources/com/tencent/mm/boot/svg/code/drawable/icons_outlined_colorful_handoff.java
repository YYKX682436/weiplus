package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_colorful_handoff extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
            instancePaint3.setColor(-15683841);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(52.60848f, 61.8f);
            instancePath.lineTo(57.329025f, 74.779816f);
            instancePath.cubicTo(57.781998f, 76.0255f, 57.139385f, 77.40253f, 55.893703f, 77.85551f);
            instancePath.cubicTo(55.630817f, 77.951096f, 55.353245f, 78.0f, 55.07352f, 78.0f);
            instancePath.lineTo(25.92648f, 78.0f);
            instancePath.cubicTo(24.600996f, 78.0f, 23.52648f, 76.92548f, 23.52648f, 75.6f);
            instancePath.cubicTo(23.52648f, 75.320274f, 23.57538f, 75.0427f, 23.670977f, 74.779816f);
            instancePath.lineTo(28.38948f, 61.8f);
            instancePath.lineTo(52.60848f, 61.8f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(76.8f, 0.0f);
            instancePath2.cubicTo(79.1196f, 0.0f, 81.0f, 1.880404f, 81.0f, 4.2f);
            instancePath2.lineTo(81.0f, 52.8f);
            instancePath2.cubicTo(81.0f, 55.119595f, 79.1196f, 57.0f, 76.8f, 57.0f);
            instancePath2.lineTo(4.2f, 57.0f);
            instancePath2.cubicTo(1.880404f, 57.0f, 0.0f, 55.119595f, 0.0f, 52.8f);
            instancePath2.lineTo(0.0f, 4.2f);
            instancePath2.cubicTo(0.0f, 1.880404f, 1.880404f, 0.0f, 4.2f, 0.0f);
            instancePath2.lineTo(76.8f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(41.73377f, 13.646538f);
            instancePath2.cubicTo(41.009914f, 12.965146f, 39.87074f, 12.999569f, 39.189346f, 13.723424f);
            instancePath2.lineTo(39.189346f, 13.723424f);
            instancePath2.lineTo(25.5f, 28.265858f);
            instancePath2.lineTo(29.25f, 32.24955f);
            instancePath2.lineTo(37.851f, 23.114187f);
            instancePath2.lineTo(37.84835f, 43.84281f);
            instancePath2.lineTo(43.15165f, 43.84281f);
            instancePath2.lineTo(43.152f, 23.111187f);
            instancePath2.lineTo(51.75f, 32.24955f);
            instancePath2.lineTo(55.5f, 28.265858f);
            instancePath2.lineTo(44.25f, 16.314783f);
            instancePath2.lineTo(41.810654f, 13.723424f);
            instancePath2.cubicTo(41.785805f, 13.697027f, 41.760166f, 13.671387f, 41.73377f, 13.646538f);
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
