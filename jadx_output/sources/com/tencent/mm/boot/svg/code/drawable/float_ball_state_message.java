package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_state_message extends l95.c {
    private final int width = 32;
    private final int height = 33;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 32;
        }
        if (i17 == 1) {
            return 33;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -374.0f, 0.0f, 1.0f, -200.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 366.0f, 0.0f, 1.0f, 192.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16268960);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(16.0f, 0.0f);
        instancePath.cubicTo(24.836555f, 0.0f, 32.0f, 7.1634436f, 32.0f, 16.0f);
        instancePath.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
        instancePath.cubicTo(7.1634436f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
        instancePath.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.833333f, 1.6666666f);
        instancePath2.cubicTo(16.293571f, 1.6666666f, 16.666666f, 2.0397627f, 16.666666f, 2.5f);
        instancePath2.lineTo(16.666666f, 2.5f);
        instancePath2.lineTo(16.666666f, 17.5f);
        instancePath2.cubicTo(16.666666f, 17.960238f, 16.293571f, 18.333334f, 15.833333f, 18.333334f);
        instancePath2.lineTo(15.833333f, 18.333334f);
        instancePath2.lineTo(4.1666665f, 18.333334f);
        instancePath2.cubicTo(3.7064295f, 18.333334f, 3.3333333f, 17.960238f, 3.3333333f, 17.5f);
        instancePath2.lineTo(3.3333333f, 17.5f);
        instancePath2.lineTo(3.3333333f, 2.5f);
        instancePath2.cubicTo(3.3333333f, 2.0397627f, 3.7064295f, 1.6666666f, 4.1666665f, 1.6666666f);
        instancePath2.lineTo(4.1666665f, 1.6666666f);
        instancePath2.close();
        instancePath2.moveTo(9.166667f, 13.333333f);
        instancePath2.lineTo(5.8333335f, 13.333333f);
        instancePath2.lineTo(5.8333335f, 14.583333f);
        instancePath2.lineTo(9.166667f, 14.583333f);
        instancePath2.lineTo(9.166667f, 13.333333f);
        instancePath2.close();
        instancePath2.moveTo(9.166667f, 10.833333f);
        instancePath2.lineTo(5.8333335f, 10.833333f);
        instancePath2.lineTo(5.8333335f, 12.083333f);
        instancePath2.lineTo(9.166667f, 12.083333f);
        instancePath2.lineTo(9.166667f, 10.833333f);
        instancePath2.close();
        instancePath2.moveTo(12.083333f, 8.333333f);
        instancePath2.lineTo(5.8333335f, 8.333333f);
        instancePath2.lineTo(5.8333335f, 9.583333f);
        instancePath2.lineTo(12.083333f, 9.583333f);
        instancePath2.lineTo(12.083333f, 8.333333f);
        instancePath2.close();
        instancePath2.moveTo(7.0833335f, 4.1666665f);
        instancePath2.cubicTo(6.392977f, 4.1666665f, 5.8333335f, 4.7263107f, 5.8333335f, 5.4166665f);
        instancePath2.cubicTo(5.8333335f, 6.107023f, 6.392977f, 6.6666665f, 7.0833335f, 6.6666665f);
        instancePath2.cubicTo(7.7736893f, 6.6666665f, 8.333333f, 6.107023f, 8.333333f, 5.4166665f);
        instancePath2.cubicTo(8.333333f, 4.7263107f, 7.7736893f, 4.1666665f, 7.0833335f, 4.1666665f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
