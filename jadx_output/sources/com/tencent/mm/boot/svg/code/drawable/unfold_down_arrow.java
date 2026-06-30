package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class unfold_down_arrow extends l95.c {
    private final int width = 10;
    private final int height = 5;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 10;
        }
        if (i17 == 1) {
            return 5;
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
            instancePaint3.setColor(-7895161);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -355.0f, 0.0f, 1.0f, -462.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 352.0f, 0.0f, -1.0f, 476.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.8369701E-16f, -1.0f, 12.24f, -1.0f, 1.8369701E-16f, 17.24264f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, -0.70710677f, -0.70710677f, 10.242641f, 0.70710677f, -0.70710677f, 4.242641f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(1.7426407f, 1.2426407f);
            instancePath.lineTo(7.2426405f, 1.2426407f);
            instancePath.lineTo(7.2426405f, 1.2426407f);
            instancePath.lineTo(7.2426405f, 2.575974f);
            instancePath.lineTo(2.575974f, 2.575974f);
            instancePath.lineTo(2.575974f, 7.2426405f);
            instancePath.lineTo(1.2426407f, 7.2426405f);
            instancePath.lineTo(1.2426407f, 1.7426407f);
            instancePath.cubicTo(1.2426407f, 1.4664983f, 1.4664983f, 1.2426407f, 1.7426407f, 1.2426407f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
