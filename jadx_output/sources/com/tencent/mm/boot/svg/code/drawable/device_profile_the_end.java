package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class device_profile_the_end extends l95.c {
    private final int width = 242;
    private final int height = 8;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 242;
        }
        if (i17 == 1) {
            return 8;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1498304079);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(119.5f, 0.0f);
            instancePath.cubicTo(121.433f, 0.0f, 123.0f, 1.5670033f, 123.0f, 3.5f);
            instancePath.cubicTo(123.0f, 5.4329967f, 121.433f, 7.0f, 119.5f, 7.0f);
            instancePath.cubicTo(117.567f, 7.0f, 116.0f, 5.4329967f, 116.0f, 3.5f);
            instancePath.cubicTo(116.0f, 1.5670033f, 117.567f, 0.0f, 119.5f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(-1716407887);
            instancePaint5.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(130.5f, 3.5f);
            instancePath2.lineTo(238.51852f, 3.5f);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint6.setColor(-1716407887);
            instancePaint6.setStrokeCap(android.graphics.Paint.Cap.SQUARE);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(0.5f, 3.5f);
            instancePath3.lineTo(108.51852f, 3.5f);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
