package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_menu_copy_path extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -77.0f, 0.0f, 1.0f, -93.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 77.0f, 0.0f, 1.0f, 93.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.866667f, 4.0f);
        instancePath.lineTo(5.866667f, 26.666666f);
        instancePath.lineTo(4.0f, 26.666666f);
        instancePath.lineTo(12.0f, 4.0f);
        instancePath.lineTo(13.866667f, 4.0f);
        instancePath.close();
        instancePath.moveTo(12.8f, 24.0f);
        instancePath.cubicTo(13.53638f, 24.0f, 14.133333f, 24.596954f, 14.133333f, 25.333334f);
        instancePath.cubicTo(14.133333f, 26.069714f, 13.53638f, 26.666666f, 12.8f, 26.666666f);
        instancePath.cubicTo(12.063621f, 26.666666f, 11.466667f, 26.069714f, 11.466667f, 25.333334f);
        instancePath.cubicTo(11.466667f, 24.596954f, 12.063621f, 24.0f, 12.8f, 24.0f);
        instancePath.close();
        instancePath.moveTo(19.733334f, 24.0f);
        instancePath.cubicTo(20.469713f, 24.0f, 21.066668f, 24.596954f, 21.066668f, 25.333334f);
        instancePath.cubicTo(21.066668f, 26.069714f, 20.469713f, 26.666666f, 19.733334f, 26.666666f);
        instancePath.cubicTo(18.996954f, 26.666666f, 18.4f, 26.069714f, 18.4f, 25.333334f);
        instancePath.cubicTo(18.4f, 24.596954f, 18.996954f, 24.0f, 19.733334f, 24.0f);
        instancePath.close();
        instancePath.moveTo(26.666666f, 24.0f);
        instancePath.cubicTo(27.403046f, 24.0f, 28.0f, 24.596954f, 28.0f, 25.333334f);
        instancePath.cubicTo(28.0f, 26.069714f, 27.403046f, 26.666666f, 26.666666f, 26.666666f);
        instancePath.cubicTo(25.930286f, 26.666666f, 25.333334f, 26.069714f, 25.333334f, 25.333334f);
        instancePath.cubicTo(25.333334f, 24.596954f, 25.930286f, 24.0f, 26.666666f, 24.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
