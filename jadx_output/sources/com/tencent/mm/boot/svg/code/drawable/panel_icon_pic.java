package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class panel_icon_pic extends l95.c {
    private final int width = 192;
    private final int height = 192;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 192;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-13421773);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(64.663895f, 28.437271f);
        instancePath.cubicTo(62.8161f, 26.772472f, 59.729828f, 26.66011f, 57.775352f, 28.182531f);
        instancePath.lineTo(49.72013f, 34.45708f);
        instancePath.lineTo(53.791866f, 42.888355f);
        instancePath.lineTo(28.658388f, 19.66337f);
        instancePath.cubicTo(26.833735f, 17.977272f, 23.881802f, 17.99533f, 22.078856f, 19.690735f);
        instancePath.lineTo(0.0f, 40.45262f);
        instancePath.lineTo(0.0f, 57.0f);
        instancePath.lineTo(78.0f, 57.0f);
        instancePath.lineTo(78.0f, 40.45262f);
        instancePath.lineTo(64.663895f, 28.437271f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-13421773);
        instancePaint5.setStrokeWidth(6.0f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.0f, 6.0f);
        instancePath2.cubicTo(3.0f, 4.3431454f, 4.3431454f, 3.0f, 6.0f, 3.0f);
        instancePath2.lineTo(72.0f, 3.0f);
        instancePath2.cubicTo(73.65685f, 3.0f, 75.0f, 4.3431454f, 75.0f, 6.0f);
        instancePath2.lineTo(75.0f, 54.0f);
        instancePath2.cubicTo(75.0f, 55.656853f, 73.65685f, 57.0f, 72.0f, 57.0f);
        instancePath2.lineTo(6.0f, 57.0f);
        instancePath2.cubicTo(4.3431454f, 57.0f, 3.0f, 55.656853f, 3.0f, 54.0f);
        instancePath2.lineTo(3.0f, 6.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
