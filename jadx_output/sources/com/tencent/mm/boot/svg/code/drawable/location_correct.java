package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class location_correct extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -92.0f, 0.0f, 1.0f, -710.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 427.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, -103.0f, 0.0f, 1.0f, 147.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 82.4f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 195.0f, 0.0f, 1.0f, 53.6f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray5);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(16.0f, 2.6666667f);
                instancePath.cubicTo(23.363796f, 2.6666667f, 29.333334f, 8.636204f, 29.333334f, 16.0f);
                instancePath.cubicTo(29.333334f, 23.363796f, 23.363796f, 29.333334f, 16.0f, 29.333334f);
                instancePath.cubicTo(8.636204f, 29.333334f, 2.6666667f, 23.363796f, 2.6666667f, 16.0f);
                instancePath.cubicTo(2.6666667f, 8.636204f, 8.636204f, 2.6666667f, 16.0f, 2.6666667f);
                instancePath.close();
                instancePath.moveTo(16.0f, 4.266667f);
                instancePath.cubicTo(9.519859f, 4.266667f, 4.266667f, 9.519859f, 4.266667f, 16.0f);
                instancePath.cubicTo(4.266667f, 22.48014f, 9.519859f, 27.733334f, 16.0f, 27.733334f);
                instancePath.cubicTo(22.48014f, 27.733334f, 27.733334f, 22.48014f, 27.733334f, 16.0f);
                instancePath.cubicTo(27.733334f, 9.519859f, 22.48014f, 4.266667f, 16.0f, 4.266667f);
                instancePath.close();
                instancePath.moveTo(16.0f, 20.53776f);
                instancePath.cubicTo(16.634766f, 20.53776f, 17.113281f, 21.016275f, 17.113281f, 21.651041f);
                instancePath.cubicTo(17.113281f, 22.276041f, 16.634766f, 22.764322f, 16.0f, 22.764322f);
                instancePath.cubicTo(15.375f, 22.764322f, 14.886719f, 22.276041f, 14.886719f, 21.651041f);
                instancePath.cubicTo(14.886719f, 21.016275f, 15.375f, 20.53776f, 16.0f, 20.53776f);
                instancePath.close();
                instancePath.moveTo(16.878906f, 8.57487f);
                instancePath.lineTo(16.761719f, 17.988932f);
                instancePath.lineTo(15.238281f, 17.988932f);
                instancePath.lineTo(15.121094f, 8.57487f);
                instancePath.lineTo(16.878906f, 8.57487f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
