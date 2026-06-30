package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class cancel_crop_normal extends l95.c {
    private final int width = 63;
    private final int height = 63;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 63;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            instancePaint3.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(7.5f);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.5f, 0.0f, 1.0f, 13.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.6666667f, 0.6666667f);
            instancePath.lineTo(14.956543f, 14.956543f);
            instancePath.lineTo(35.333332f, 35.333332f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 36.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.6666667f, 0.6666667f);
            instancePath2.lineTo(14.956543f, 14.956543f);
            instancePath2.lineTo(35.333332f, 35.333332f);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
