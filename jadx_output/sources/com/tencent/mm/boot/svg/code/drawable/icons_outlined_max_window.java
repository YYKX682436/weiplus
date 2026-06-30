package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_max_window extends l95.c {
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(54.0f, 42.0f);
            instancePath.lineTo(54.0f, 54.0f);
            instancePath.cubicTo(54.0f, 55.656853f, 52.656853f, 57.0f, 51.0f, 57.0f);
            instancePath.lineTo(39.0f, 57.0f);
            instancePath.lineTo(39.0f, 53.4f);
            instancePath.lineTo(50.4f, 53.4f);
            instancePath.lineTo(50.4f, 42.0f);
            instancePath.lineTo(54.0f, 42.0f);
            instancePath.close();
            instancePath.moveTo(15.0f, 3.0f);
            instancePath.lineTo(15.0f, 6.6f);
            instancePath.lineTo(3.6f, 6.6f);
            instancePath.lineTo(3.6f, 18.0f);
            instancePath.lineTo(0.0f, 18.0f);
            instancePath.lineTo(0.0f, 6.0f);
            instancePath.cubicTo(0.0f, 4.343146f, 1.3431457f, 3.0f, 3.0f, 3.0f);
            instancePath.lineTo(15.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(50.390564f, 9.136879f);
            instancePath.lineTo(33.974762f, 25.552683f);
            instancePath.lineTo(31.429176f, 23.007097f);
            instancePath.lineTo(47.84495f, 6.5913205f);
            instancePath.lineTo(38.990562f, 6.5913205f);
            instancePath.lineTo(38.990562f, 2.9913204f);
            instancePath.lineTo(50.990562f, 2.9913204f);
            instancePath.cubicTo(52.64742f, 2.9913204f, 53.990562f, 4.334466f, 53.990562f, 5.9913206f);
            instancePath.lineTo(53.990562f, 17.99132f);
            instancePath.lineTo(50.390564f, 17.99132f);
            instancePath.lineTo(50.390564f, 9.136879f);
            instancePath.close();
            instancePath.moveTo(3.609437f, 50.86312f);
            instancePath.lineTo(20.02524f, 34.44732f);
            instancePath.lineTo(22.570824f, 36.9929f);
            instancePath.lineTo(6.1550474f, 53.40868f);
            instancePath.lineTo(15.009437f, 53.40868f);
            instancePath.lineTo(15.009437f, 57.00868f);
            instancePath.lineTo(3.0094368f, 57.00868f);
            instancePath.cubicTo(1.3525826f, 57.00868f, 0.009436794f, 55.665535f, 0.009436794f, 54.00868f);
            instancePath.lineTo(0.009436794f, 42.00868f);
            instancePath.lineTo(3.609437f, 42.00868f);
            instancePath.lineTo(3.609437f, 50.86312f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
