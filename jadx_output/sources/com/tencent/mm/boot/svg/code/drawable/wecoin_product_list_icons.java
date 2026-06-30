package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wecoin_product_list_icons extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.5f, 0.8660254f, 0.7303667f, -0.8660254f, 0.5f, 13.685536f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.801277f, 0.0f, 1.0f, 0.787784f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-7746194);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.798704f, 0.0015978813f);
            instancePath.cubicTo(10.554192f, 0.0015978813f, 13.598616f, 2.4758546f, 13.598616f, 5.528005f);
            instancePath.cubicTo(13.598616f, 8.580155f, 10.554192f, 11.054413f, 6.798704f, 11.054413f);
            instancePath.cubicTo(3.0432167f, 11.054413f, -0.0012068748f, 8.580155f, -0.0012068748f, 5.528005f);
            instancePath.cubicTo(-0.0012068748f, 2.4758546f, 3.0432167f, 0.0015978813f, 6.798704f, 0.0015978813f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2130706433);
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 0.95105654f, -0.309017f, 1.4288014f, 0.309017f, 0.95105654f, -2.972626f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(10.098612f, 2.0242364f);
            instancePath2.cubicTo(10.834071f, 2.0242364f, 11.430279f, 2.4719517f, 11.430279f, 3.0242364f);
            instancePath2.cubicTo(11.430279f, 3.5765212f, 10.834071f, 4.0242367f, 10.098612f, 4.0242367f);
            instancePath2.cubicTo(9.3631525f, 4.0242367f, 8.766945f, 3.5765212f, 8.766945f, 3.0242364f);
            instancePath2.cubicTo(8.766945f, 2.4719517f, 9.3631525f, 2.0242364f, 10.098612f, 2.0242364f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
