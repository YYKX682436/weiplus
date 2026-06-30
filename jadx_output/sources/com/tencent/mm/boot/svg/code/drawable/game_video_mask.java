package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_video_mask extends l95.c {
    private final int width = 179;
    private final int height = 134;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 179;
        }
        if (i17 == 1) {
            return 134;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -248.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 80.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 168.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(179.0f, 0.0f);
            instancePath.lineTo(179.0f, 134.0f);
            instancePath.lineTo(0.0f, 134.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
            instancePaint4.setFlags(385);
            instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
            instancePaint5.setFlags(385);
            instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
            instancePaint4.setColor(-16777216);
            instancePaint5.setStrokeWidth(1.0f);
            instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
            instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
            instancePaint5.setStrokeMiter(4.0f);
            instancePaint5.setPathEffect(null);
            float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 179.0f, 0.0f, 0.0f, 0.0f, 134.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{0, -1291845632}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
