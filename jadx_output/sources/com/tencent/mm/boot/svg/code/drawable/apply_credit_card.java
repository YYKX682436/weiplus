package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class apply_credit_card extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -160.0f, 0.0f, 1.0f, -984.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 160.0f, 0.0f, 1.0f, 984.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-15658735);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(17.50683f, 3.3333333f);
        instancePath.cubicTo(17.963295f, 3.3333333f, 18.333334f, 3.703859f, 18.333334f, 4.167393f);
        instancePath.lineTo(18.333334f, 15.832607f);
        instancePath.cubicTo(18.333334f, 16.293245f, 17.953913f, 16.666666f, 17.50683f, 16.666666f);
        instancePath.lineTo(2.4931693f, 16.666666f);
        instancePath.cubicTo(2.0367045f, 16.666666f, 1.6666666f, 16.29614f, 1.6666666f, 15.832607f);
        instancePath.lineTo(1.6666666f, 4.167393f);
        instancePath.cubicTo(1.6666666f, 3.7067547f, 2.046088f, 3.3333333f, 2.4931693f, 3.3333333f);
        instancePath.lineTo(17.50683f, 3.3333333f);
        instancePath.close();
        instancePath.moveTo(17.333334f, 4.3333335f);
        instancePath.lineTo(2.6666667f, 4.3333335f);
        instancePath.lineTo(2.6666667f, 15.666667f);
        instancePath.lineTo(17.333334f, 15.666667f);
        instancePath.lineTo(17.333334f, 4.3333335f);
        instancePath.close();
        instancePath.moveTo(6.6666665f, 10.0f);
        instancePath.cubicTo(7.126904f, 10.0f, 7.5f, 10.373096f, 7.5f, 10.833333f);
        instancePath.lineTo(7.5f, 12.5f);
        instancePath.cubicTo(7.5f, 12.9602375f, 7.126904f, 13.333333f, 6.6666665f, 13.333333f);
        instancePath.lineTo(5.0f, 13.333333f);
        instancePath.cubicTo(4.5397625f, 13.333333f, 4.1666665f, 12.9602375f, 4.1666665f, 12.5f);
        instancePath.lineTo(4.1666665f, 10.833333f);
        instancePath.cubicTo(4.1666665f, 10.373096f, 4.5397625f, 10.0f, 5.0f, 10.0f);
        instancePath.lineTo(6.6666665f, 10.0f);
        instancePath.close();
        instancePath.moveTo(6.5f, 11.0f);
        instancePath.lineTo(5.1666665f, 11.0f);
        instancePath.lineTo(5.1666665f, 12.333333f);
        instancePath.lineTo(6.5f, 12.333333f);
        instancePath.lineTo(6.5f, 11.0f);
        instancePath.close();
        instancePath.moveTo(15.833333f, 6.6666665f);
        instancePath.lineTo(15.833333f, 7.6666665f);
        instancePath.lineTo(4.1666665f, 7.6666665f);
        instancePath.lineTo(4.1666665f, 6.6666665f);
        instancePath.lineTo(15.833333f, 6.6666665f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2565928);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(20.0f, 0.0f);
        instancePath2.lineTo(20.0f, 20.0f);
        instancePath2.lineTo(0.0f, 20.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 0, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint6, looper));
        canvas.restore();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-2565928);
        instancePaint8.setColor(-6842473);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(20.0f, 0.0f);
        instancePath3.lineTo(20.0f, 20.0f);
        instancePath3.lineTo(0.0f, 20.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha(null, 0, 31);
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint7, looper);
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint8, looper);
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.drawPath(instancePath3, instancePaint10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
