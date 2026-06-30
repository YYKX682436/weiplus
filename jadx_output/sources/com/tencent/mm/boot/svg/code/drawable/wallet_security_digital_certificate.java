package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_security_digital_certificate extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 64;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.666667f, 0.0f, 1.0f, 0.333333f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-15616);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(40.0f, 0.0f);
            instancePath.cubicTo(41.47276f, 0.0f, 42.666668f, 1.1939074f, 42.666668f, 2.6666667f);
            instancePath.lineTo(42.666668f, 50.666668f);
            instancePath.cubicTo(42.666668f, 52.139427f, 41.47276f, 53.333332f, 40.0f, 53.333332f);
            instancePath.lineTo(2.6666667f, 53.333332f);
            instancePath.cubicTo(1.1939074f, 53.333332f, 0.0f, 52.139427f, 0.0f, 50.666668f);
            instancePath.lineTo(0.0f, 2.6666667f);
            instancePath.cubicTo(0.0f, 1.1939074f, 1.1939074f, 0.0f, 2.6666667f, 0.0f);
            instancePath.lineTo(40.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(39.466667f, 3.2f);
            instancePath.lineTo(3.2f, 3.2f);
            instancePath.lineTo(3.2f, 50.133335f);
            instancePath.lineTo(39.466667f, 50.133335f);
            instancePath.lineTo(39.466667f, 3.2f);
            instancePath.close();
            instancePath.moveTo(18.666666f, 18.666666f);
            instancePath.lineTo(18.666666f, 21.866667f);
            instancePath.lineTo(8.0f, 21.866667f);
            instancePath.lineTo(8.0f, 18.666666f);
            instancePath.lineTo(18.666666f, 18.666666f);
            instancePath.close();
            instancePath.moveTo(24.0f, 10.666667f);
            instancePath.lineTo(24.0f, 13.866667f);
            instancePath.lineTo(8.0f, 13.866667f);
            instancePath.lineTo(8.0f, 10.666667f);
            instancePath.lineTo(24.0f, 10.666667f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(64.0f, 0.0f);
            instancePath2.lineTo(64.0f, 64.0f);
            instancePath2.lineTo(0.0f, 64.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            l95.c.done(looper);
        }
        return 0;
    }
}
