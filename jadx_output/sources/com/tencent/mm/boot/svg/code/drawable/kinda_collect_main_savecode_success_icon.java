package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_collect_main_savecode_success_icon extends l95.c {
    private final int width = 56;
    private final int height = 56;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 56;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -593.0f, 0.0f, 1.0f, -303.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 593.0f, 0.0f, 1.0f, 303.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(28.0f, 4.6666665f);
                instancePath.cubicTo(40.886642f, 4.6666665f, 51.333332f, 15.113356f, 51.333332f, 28.0f);
                instancePath.cubicTo(51.333332f, 40.886642f, 40.886642f, 51.333332f, 28.0f, 51.333332f);
                instancePath.cubicTo(15.113356f, 51.333332f, 4.6666665f, 40.886642f, 4.6666665f, 28.0f);
                instancePath.cubicTo(4.6666665f, 15.113356f, 15.113356f, 4.6666665f, 28.0f, 4.6666665f);
                instancePath.close();
                instancePath.moveTo(28.0f, 7.4666667f);
                instancePath.cubicTo(16.659754f, 7.4666667f, 7.4666667f, 16.659754f, 7.4666667f, 28.0f);
                instancePath.cubicTo(7.4666667f, 39.34025f, 16.659754f, 48.533333f, 28.0f, 48.533333f);
                instancePath.cubicTo(39.34025f, 48.533333f, 48.533333f, 39.34025f, 48.533333f, 28.0f);
                instancePath.cubicTo(48.533333f, 16.659754f, 39.34025f, 7.4666667f, 28.0f, 7.4666667f);
                instancePath.close();
                instancePath.moveTo(38.81909f, 20.416666f);
                instancePath.lineTo(40.798992f, 22.396566f);
                instancePath.lineTo(26.916246f, 36.27931f);
                instancePath.cubicTo(26.005022f, 37.190533f, 24.527637f, 37.190533f, 23.616415f, 36.27931f);
                instancePath.lineTo(16.333334f, 28.99623f);
                instancePath.lineTo(18.313232f, 27.016329f);
                instancePath.lineTo(25.26633f, 33.96943f);
                instancePath.lineTo(38.81909f, 20.416666f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
