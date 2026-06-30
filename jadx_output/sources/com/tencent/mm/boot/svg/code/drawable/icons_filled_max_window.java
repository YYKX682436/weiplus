package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_max_window extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(54.0f, 36.0f);
        instancePath.lineTo(54.0f, 51.0f);
        instancePath.cubicTo(54.0f, 52.656853f, 52.656853f, 54.0f, 51.0f, 54.0f);
        instancePath.lineTo(36.0f, 54.0f);
        instancePath.lineTo(36.0f, 48.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(48.0f, 36.0f);
        instancePath.lineTo(54.0f, 36.0f);
        instancePath.close();
        instancePath.moveTo(18.0f, 0.0f);
        instancePath.lineTo(18.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 18.0f);
        instancePath.lineTo(0.0f, 18.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(0.0f, 1.3431457f, 1.3431457f, 1.9984014E-15f, 3.0f, 1.9984014E-15f);
        instancePath.lineTo(18.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(43.751884f, 6.0f);
        instancePath.lineTo(36.0f, 6.0f);
        instancePath.lineTo(36.0f, 0.0f);
        instancePath.lineTo(51.0f, 0.0f);
        instancePath.cubicTo(52.656853f, -3.043592E-16f, 54.0f, 1.3431457f, 54.0f, 3.0f);
        instancePath.lineTo(54.0f, 18.0f);
        instancePath.lineTo(48.0f, 18.0f);
        instancePath.lineTo(48.0f, 10.240922f);
        instancePath.lineTo(34.90264f, 23.334524f);
        instancePath.lineTo(30.66f, 19.091883f);
        instancePath.lineTo(43.751884f, 6.0f);
        instancePath.close();
        instancePath.moveTo(10.2481165f, 47.994526f);
        instancePath.lineTo(18.0f, 47.994526f);
        instancePath.lineTo(18.0f, 53.994526f);
        instancePath.lineTo(3.0f, 53.994526f);
        instancePath.cubicTo(1.3431457f, 53.994526f, 0.0f, 52.65138f, 0.0f, 50.994526f);
        instancePath.lineTo(0.0f, 35.994526f);
        instancePath.lineTo(6.0f, 35.994526f);
        instancePath.lineTo(6.0f, 43.7536f);
        instancePath.lineTo(19.097359f, 30.66f);
        instancePath.lineTo(23.34f, 34.90264f);
        instancePath.lineTo(10.2481165f, 47.994526f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
