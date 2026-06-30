package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_quote_location extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-16777216);
            instancePaint4.setStrokeWidth(5.0625f);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.6875f, 0.0f, 1.0f, 3.9375f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(25.3125f, 2.53125f);
            instancePath.cubicTo(31.605444f, 2.53125f, 37.303436f, 5.0624957f, 41.427666f, 9.1574335f);
            instancePath.cubicTo(45.545345f, 13.245865f, 48.09375f, 18.893545f, 48.09375f, 25.132717f);
            instancePath.cubicTo(48.09375f, 43.167248f, 26.02464f, 61.312508f, 26.02464f, 61.312508f);
            instancePath.cubicTo(25.772068f, 61.53961f, 25.541258f, 61.596313f, 25.320568f, 61.59681f);
            instancePath.cubicTo(25.09186f, 61.59732f, 24.853292f, 61.537315f, 24.675802f, 61.378483f);
            instancePath.cubicTo(24.611698f, 61.32302f, 2.53125f, 43.167595f, 2.53125f, 25.132717f);
            instancePath.cubicTo(2.53125f, 18.893545f, 5.079656f, 13.245865f, 9.197333f, 9.1574335f);
            instancePath.cubicTo(13.321564f, 5.0624957f, 19.019556f, 2.53125f, 25.3125f, 2.53125f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(25.3125f, 16.03125f);
            instancePath2.cubicTo(30.438393f, 16.03125f, 34.59375f, 20.186607f, 34.59375f, 25.3125f);
            instancePath2.cubicTo(34.59375f, 30.438393f, 30.438393f, 34.59375f, 25.3125f, 34.59375f);
            instancePath2.cubicTo(20.186607f, 34.59375f, 16.03125f, 30.438393f, 16.03125f, 25.3125f);
            instancePath2.cubicTo(16.03125f, 20.186607f, 20.186607f, 16.03125f, 25.3125f, 16.03125f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
