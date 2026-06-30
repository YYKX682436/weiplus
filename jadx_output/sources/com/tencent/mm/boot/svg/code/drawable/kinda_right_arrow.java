package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_right_arrow extends l95.c {
    private final int width = 10;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 10;
        }
        if (i17 == 1) {
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(-16777216);
            instancePaint4.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha(null, 204, 31);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.666667f, 0.0f, 1.0f, 4.166667f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint5.setColor(-436207616);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, -1.0f, 1.2246469E-16f, 6.701306f, -1.2246469E-16f, -1.0f, 11.67545f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint5, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(6.322924f, 10.358243f);
            instancePath.lineTo(5.4390407f, 11.242126f);
            instancePath.lineTo(0.6232929f, 6.4263787f);
            instancePath.cubicTo(0.29818854f, 6.1012745f, 0.29530483f, 5.5770597f, 0.6232929f, 5.2490716f);
            instancePath.lineTo(5.4390407f, 0.4333242f);
            instancePath.lineTo(6.322924f, 1.3172077f);
            instancePath.lineTo(1.8024063f, 5.837725f);
            instancePath.lineTo(6.322924f, 10.358243f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint6);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
