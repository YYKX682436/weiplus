package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class panel_icon_enterprise extends l95.c {
    private final int width = be1.r0.CTRL_INDEX;
    private final int height = be1.r0.CTRL_INDEX;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return be1.r0.CTRL_INDEX;
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
        instancePaint3.setColor(-8617594);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 49.0f, 0.0f, 1.0f, 46.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.9448406f, 3.0f);
        instancePath.cubicTo(0.42301953f, 3.0f, 0.0f, 3.4298856f, 0.0f, 3.9448407f);
        instancePath.lineTo(0.0f, 36.05516f);
        instancePath.cubicTo(0.0f, 36.57698f, 0.42988563f, 37.0f, 0.9448406f, 37.0f);
        instancePath.lineTo(33.05516f, 37.0f);
        instancePath.cubicTo(33.57698f, 37.0f, 34.0f, 36.570114f, 34.0f, 36.05516f);
        instancePath.lineTo(34.0f, 3.9448407f);
        instancePath.cubicTo(34.0f, 3.4230196f, 33.570114f, 3.0f, 33.05516f, 3.0f);
        instancePath.lineTo(0.9448406f, 3.0f);
        instancePath.lineTo(0.9448406f, 3.0f);
        instancePath.close();
        instancePath.moveTo(0.0f, 42.94484f);
        instancePath.lineTo(0.0f, 75.05516f);
        instancePath.cubicTo(0.0f, 75.57698f, 0.42988563f, 76.0f, 0.9448406f, 76.0f);
        instancePath.lineTo(33.05516f, 76.0f);
        instancePath.cubicTo(33.57698f, 76.0f, 34.0f, 75.570114f, 34.0f, 75.05516f);
        instancePath.lineTo(34.0f, 42.94484f);
        instancePath.cubicTo(34.0f, 42.42302f, 33.570114f, 42.0f, 33.05516f, 42.0f);
        instancePath.lineTo(0.9448406f, 42.0f);
        instancePath.cubicTo(0.42301953f, 42.0f, 0.0f, 42.429886f, 0.0f, 42.94484f);
        instancePath.close();
        instancePath.moveTo(39.94484f, 42.0f);
        instancePath.cubicTo(39.42302f, 42.0f, 39.0f, 42.429886f, 39.0f, 42.94484f);
        instancePath.lineTo(39.0f, 75.05516f);
        instancePath.cubicTo(39.0f, 75.57698f, 39.429886f, 76.0f, 39.94484f, 76.0f);
        instancePath.lineTo(72.05516f, 76.0f);
        instancePath.cubicTo(72.57698f, 76.0f, 73.0f, 75.570114f, 73.0f, 75.05516f);
        instancePath.lineTo(73.0f, 42.94484f);
        instancePath.cubicTo(73.0f, 42.42302f, 72.570114f, 42.0f, 72.05516f, 42.0f);
        instancePath.lineTo(39.94484f, 42.0f);
        instancePath.lineTo(39.94484f, 42.0f);
        instancePath.close();
        instancePath.moveTo(39.461056f, 36.24942f);
        instancePath.cubicTo(39.497868f, 34.750427f, 41.87496f, 16.05255f, 53.198692f, 10.63516f);
        instancePath.cubicTo(64.52242f, 5.217771f, 71.405556f, 7.708689f, 76.82161f, 1.0075728f);
        instancePath.cubicTo(78.15621f, -0.6436917f, 79.45604f, 12.767504f, 74.10915f, 24.23966f);
        instancePath.cubicTo(68.76226f, 35.711815f, 57.2631f, 32.031345f, 51.075695f, 31.984705f);
        instancePath.cubicTo(44.88829f, 31.938068f, 39.42424f, 37.74841f, 39.461056f, 36.24942f);
        instancePath.lineTo(39.461056f, 36.24942f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
