package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_unselected_round extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(419430400);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        instancePath.cubicTo(15.522848f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        instancePath.cubicTo(20.0f, 15.522848f, 15.522848f, 20.0f, 10.0f, 20.0f);
        instancePath.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522848f, 0.0f, 10.0f);
        instancePath.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setStrokeWidth(1.2f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.0f, 19.4f);
        instancePath2.cubicTo(15.191477f, 19.4f, 19.4f, 15.191477f, 19.4f, 10.0f);
        instancePath2.cubicTo(19.4f, 4.808523f, 15.191477f, 0.6f, 10.0f, 0.6f);
        instancePath2.cubicTo(4.808523f, 0.6f, 0.6f, 4.808523f, 0.6f, 10.0f);
        instancePath2.cubicTo(0.6f, 15.191477f, 4.808523f, 19.4f, 10.0f, 19.4f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 230, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint5, looper));
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
