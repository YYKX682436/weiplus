package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_openmsg_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(14.6378f, 8.41938f);
        instancePath3.cubicTo(14.6042f, 8.41596f, 14.5701f, 8.41421f, 14.5355f, 8.41421f);
        instancePath3.lineTo(9.53553f, 8.41421f);
        instancePath3.lineTo(9.53553f, 9.61421f);
        instancePath3.lineTo(13.5373f, 9.61421f);
        instancePath3.lineTo(8.04021f, 15.1113f);
        instancePath3.lineTo(8.88873f, 15.9598f);
        instancePath3.lineTo(14.3355f, 10.513f);
        instancePath3.lineTo(14.3355f, 14.4142f);
        instancePath3.lineTo(15.5355f, 14.4142f);
        instancePath3.lineTo(15.5355f, 9.41421f);
        instancePath3.cubicTo(15.5355f, 8.89645f, 15.142f, 8.47059f, 14.6378f, 8.41938f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(19.0711f, 4.92892f);
        instancePath4.cubicTo(15.1658f, 1.02367f, 8.83418f, 1.02367f, 4.92893f, 4.92892f);
        instancePath4.cubicTo(1.02369f, 8.83416f, 1.02369f, 15.1658f, 4.92893f, 19.0711f);
        instancePath4.cubicTo(8.83418f, 22.9763f, 15.1658f, 22.9763f, 19.0711f, 19.0711f);
        instancePath4.cubicTo(22.9763f, 15.1658f, 22.9763f, 8.83416f, 19.0711f, 4.92892f);
        instancePath4.close();
        instancePath4.moveTo(5.77746f, 18.2225f);
        instancePath4.cubicTo(2.34085f, 14.7859f, 2.34085f, 9.21406f, 5.77746f, 5.77744f);
        instancePath4.cubicTo(9.21407f, 2.34083f, 14.7859f, 2.34083f, 18.2225f, 5.77744f);
        instancePath4.cubicTo(21.6592f, 9.21406f, 21.6592f, 14.7859f, 18.2225f, 18.2225f);
        instancePath4.cubicTo(14.7859f, 21.6591f, 9.21407f, 21.6591f, 5.77746f, 18.2225f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
