package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_movie extends l95.c {
    private final int width = 14;
    private final int height = 15;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 14;
        }
        if (i17 == 1) {
            return 15;
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
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-5066062);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -74.0f, 0.0f, 1.0f, -747.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 143.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(14.393222f, 10.420385f);
            instancePath.lineTo(4.321909f, 15.7654f);
            instancePath.cubicTo(3.882854f, 15.998414f, 3.3380342f, 15.831385f, 3.1050203f, 15.392329f);
            instancePath.cubicTo(3.036059f, 15.262389f, 3.0f, 15.117526f, 3.0f, 14.970421f);
            instancePath.lineTo(3.0f, 4.153231f);
            instancePath.cubicTo(3.0f, 3.6009462f, 3.4477153f, 3.153231f, 4.0f, 3.153231f);
            instancePath.cubicTo(4.171167f, 3.153231f, 4.3394685f, 3.1971664f, 4.4887943f, 3.2808318f);
            instancePath.lineTo(14.411227f, 8.840247f);
            instancePath.cubicTo(14.844859f, 9.083205f, 14.99943f, 9.631689f, 14.756472f, 10.065321f);
            instancePath.cubicTo(14.671992f, 10.216099f, 14.545886f, 10.339364f, 14.393222f, 10.420385f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
