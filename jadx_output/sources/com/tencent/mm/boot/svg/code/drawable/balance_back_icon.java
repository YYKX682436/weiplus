package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class balance_back_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 23.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 25.019958f);
        instancePath.cubicTo(9.014991f, 17.016632f, 17.029982f, 9.003326f, 25.054966f, 1.0f);
        instancePath.cubicTo(26.47408f, 2.4370062f, 27.893192f, 3.8740125f, 29.292316f, 5.3209977f);
        instancePath.cubicTo(23.73579f, 10.869439f, 18.179262f, 16.4079f, 12.63273f, 21.95634f);
        instancePath.cubicTo(24.755154f, 21.96632f, 36.877575f, 21.95634f, 49.0f, 21.96632f);
        instancePath.lineTo(49.0f, 28.013721f);
        instancePath.lineTo(12.582761f, 28.013721f);
        instancePath.cubicTo(18.129293f, 33.612057f, 23.725796f, 39.15052f, 29.292316f, 44.728897f);
        instancePath.cubicTo(27.873203f, 46.155926f, 26.444098f, 47.57297f, 25.01499f, 49.0f);
        instancePath.cubicTo(17.009995f, 41.006653f, 9.004997f, 33.013306f, 1.0f, 25.019958f);
        instancePath.lineTo(1.0f, 25.019958f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
