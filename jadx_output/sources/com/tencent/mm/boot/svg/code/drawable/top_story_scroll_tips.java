package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class top_story_scroll_tips extends l95.c {
    private final int width = 50;
    private final int height = 50;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 50;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.8910065f, 0.4539905f, -8.881499f, 0.4539905f, -0.8910065f, 36.994106f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(25.83573f, 29.0f);
        instancePath.cubicTo(26.39911f, 31.619719f, 27.385025f, 33.732395f, 28.793476f, 35.422535f);
        instancePath.cubicTo(29.075167f, 35.84507f, 29.356857f, 36.267605f, 29.638548f, 36.549297f);
        instancePath.cubicTo(31.046997f, 37.957745f, 33.01883f, 38.94366f, 35.131504f, 39.0f);
        instancePath.lineTo(38.793476f, 39.0f);
        instancePath.cubicTo(41.187843f, 38.80282f, 43.300518f, 37.676056f, 44.568123f, 35.84507f);
        instancePath.cubicTo(45.27235f, 34.859154f, 45.83573f, 33.59155f, 45.976574f, 32.323944f);
        instancePath.lineTo(45.976574f, 30.774649f);
        instancePath.cubicTo(45.976574f, 28.802816f, 45.694885f, 26.97183f, 45.131504f, 25.140844f);
        instancePath.cubicTo(44.990658f, 24.71831f, 44.849815f, 24.295774f, 44.70897f, 23.732395f);
        instancePath.cubicTo(44.286434f, 22.183098f, 44.145588f, 20.492958f, 44.145588f, 18.943663f);
        instancePath.cubicTo(44.145588f, 18.239437f, 44.286434f, 16.830986f, 44.286434f, 16.830986f);
        instancePath.cubicTo(44.42728f, 15.845071f, 43.723053f, 15.0f, 42.737137f, 15.0f);
        instancePath.cubicTo(42.032913f, 15.0f, 41.187843f, 15.56338f, 40.76531f, 16.12676f);
        instancePath.cubicTo(39.92024f, 16.97183f, 39.497704f, 18.09859f, 39.497704f, 19.225351f);
        instancePath.lineTo(39.497704f, 22.746479f);
        instancePath.lineTo(39.497704f, 23.169014f);
        instancePath.cubicTo(39.356857f, 24.295774f, 38.37094f, 25.0f, 37.244183f, 25.0f);
        instancePath.lineTo(17.976576f, 25.0f);
        instancePath.cubicTo(16.872005f, 25.0f, 15.976575f, 25.89543f, 15.976575f, 27.0f);
        instancePath.cubicTo(15.976575f, 28.10457f, 16.872005f, 29.0f, 17.976576f, 29.0f);
        instancePath.lineTo(25.83573f, 29.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 0.76604444f, 0.64278764f, -14.573307f, -0.64278764f, 0.76604444f, 12.015224f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(-1.8615476f, 39.6103f);
        instancePath2.cubicTo(2.0552306f, 31.076334f, 14.849355f, 15.051029f, 20.299797f, 12.444754f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-1);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 0.92718387f, 0.37460658f, -4.2529f, -0.37460658f, 0.92718387f, 3.7691882f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(2.5404713f, 13.01096f);
        instancePath3.lineTo(10.597422f, 8.574231f);
        instancePath3.lineTo(12.597422f, 17.074232f);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
