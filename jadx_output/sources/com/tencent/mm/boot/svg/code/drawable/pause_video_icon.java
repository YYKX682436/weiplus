package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pause_video_icon extends l95.c {
    private final int width = 9;
    private final int height = 10;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 9;
        }
        if (i17 == 1) {
            return 10;
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
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -162.0f, 0.0f, 1.0f, -172.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 162.0f, 0.0f, 1.0f, 172.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 1.0f);
        instancePath.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
        instancePath.lineTo(2.0f, 0.0f);
        instancePath.cubicTo(2.5522847f, 0.0f, 3.0f, 0.44771522f, 3.0f, 1.0f);
        instancePath.lineTo(3.0f, 9.0f);
        instancePath.cubicTo(3.0f, 9.552285f, 2.5522847f, 10.0f, 2.0f, 10.0f);
        instancePath.lineTo(1.0f, 10.0f);
        instancePath.cubicTo(0.44771522f, 10.0f, 0.0f, 9.552285f, 0.0f, 9.0f);
        instancePath.lineTo(0.0f, 1.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.0f, 1.0f);
        instancePath2.cubicTo(6.0f, 0.44771522f, 6.4477153f, 0.0f, 7.0f, 0.0f);
        instancePath2.lineTo(8.0f, 0.0f);
        instancePath2.cubicTo(8.552285f, 0.0f, 9.0f, 0.44771522f, 9.0f, 1.0f);
        instancePath2.lineTo(9.0f, 9.0f);
        instancePath2.cubicTo(9.0f, 9.552285f, 8.552285f, 10.0f, 8.0f, 10.0f);
        instancePath2.lineTo(7.0f, 10.0f);
        instancePath2.cubicTo(6.4477153f, 10.0f, 6.0f, 9.552285f, 6.0f, 9.0f);
        instancePath2.lineTo(6.0f, 1.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
