package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_attach_file_icon_url_in_gird extends l95.c {
    private final int width = 80;
    private final int height = 71;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 80;
        }
        if (i17 == 1) {
            return 71;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(19.357758f, 25.260746f);
        instancePath.lineTo(28.45082f, 25.260746f);
        instancePath.cubicTo(34.51505f, 25.260746f, 39.44799f, 20.333082f, 39.44799f, 14.254499f);
        instancePath.lineTo(39.44799f, 11.0062475f);
        instancePath.cubicTo(39.44799f, 4.930493f, 34.52439f, 1.2726757E-7f, 28.45082f, 1.046543E-7f);
        instancePath.lineTo(11.339516f, 4.0945043E-8f);
        instancePath.cubicTo(5.2752895f, 1.8366562E-8f, 0.34234652f, 4.9276648f, 0.34234652f, 11.006247f);
        instancePath.lineTo(0.34234652f, 14.160372f);
        instancePath.lineTo(4.420356f, 14.160372f);
        instancePath.cubicTo(4.3753934f, 13.817222f, 4.3521967f, 13.467262f, 4.3521967f, 13.111929f);
        instancePath.lineTo(4.352197f, 12.010028f);
        instancePath.cubicTo(4.352197f, 7.5904274f, 7.9322853f, 4.0076337f, 12.355284f, 4.0076337f);
        instancePath.lineTo(27.42606f, 4.0076337f);
        instancePath.cubicTo(31.846043f, 4.0076337f, 35.429146f, 7.593756f, 35.429146f, 12.010028f);
        instancePath.lineTo(35.429146f, 13.111929f);
        instancePath.cubicTo(35.429146f, 17.531528f, 31.849058f, 21.114323f, 27.42606f, 21.114323f);
        instancePath.lineTo(19.357758f, 21.114323f);
        instancePath.lineTo(19.357758f, 25.260746f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 40.0f, 0.0f, -1.0f, 26.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.357758f, 25.260746f);
        instancePath2.lineTo(28.45082f, 25.260746f);
        instancePath2.cubicTo(34.51505f, 25.260746f, 39.44799f, 20.333082f, 39.44799f, 14.254499f);
        instancePath2.lineTo(39.44799f, 11.0062475f);
        instancePath2.cubicTo(39.44799f, 4.930493f, 34.52439f, 1.2726757E-7f, 28.45082f, 1.046543E-7f);
        instancePath2.lineTo(11.339516f, 4.0945043E-8f);
        instancePath2.cubicTo(5.2752895f, 1.8366562E-8f, 0.34234652f, 4.9276648f, 0.34234652f, 11.006247f);
        instancePath2.lineTo(0.34234652f, 14.160372f);
        instancePath2.lineTo(4.420356f, 14.160372f);
        instancePath2.cubicTo(4.3753934f, 13.817222f, 4.3521967f, 13.467262f, 4.3521967f, 13.111929f);
        instancePath2.lineTo(4.352197f, 12.010028f);
        instancePath2.cubicTo(4.352197f, 7.5904274f, 7.9322853f, 4.0076337f, 12.355284f, 4.0076337f);
        instancePath2.lineTo(27.42606f, 4.0076337f);
        instancePath2.cubicTo(31.846043f, 4.0076337f, 35.429146f, 7.593756f, 35.429146f, 12.010028f);
        instancePath2.lineTo(35.429146f, 13.111929f);
        instancePath2.cubicTo(35.429146f, 17.531528f, 31.849058f, 21.114323f, 27.42606f, 21.114323f);
        instancePath2.lineTo(19.357758f, 21.114323f);
        instancePath2.lineTo(19.357758f, 25.260746f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
