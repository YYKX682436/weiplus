package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_delete extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(46.235294f, 13.500007f);
                instancePath.lineTo(43.832214f, 54.352333f);
                instancePath.cubicTo(43.645664f, 57.52371f, 41.01943f, 60.0f, 37.84257f, 60.0f);
                instancePath.lineTo(16.15743f, 60.0f);
                instancePath.cubicTo(12.980573f, 60.0f, 10.354336f, 57.52371f, 10.167784f, 54.352333f);
                instancePath.lineTo(7.764706f, 13.500007f);
                instancePath.lineTo(1.5f, 13.500007f);
                instancePath.lineTo(1.5f, 10.5f);
                instancePath.cubicTo(1.5f, 9.671573f, 2.171573f, 9.0f, 3.0f, 9.0f);
                instancePath.lineTo(51.0f, 9.0f);
                instancePath.cubicTo(51.828426f, 9.0f, 52.5f, 9.671573f, 52.5f, 10.5f);
                instancePath.lineTo(52.5f, 13.500007f);
                instancePath.lineTo(46.235294f, 13.500007f);
                instancePath.close();
                instancePath.moveTo(21.0f, 1.5001023f);
                instancePath.lineTo(33.0f, 1.5001023f);
                instancePath.cubicTo(33.828426f, 1.5001023f, 34.5f, 2.1716752f, 34.5f, 3.0001023f);
                instancePath.lineTo(34.5f, 6.0f);
                instancePath.lineTo(19.5f, 6.0f);
                instancePath.lineTo(19.5f, 3.0001023f);
                instancePath.cubicTo(19.5f, 2.1716752f, 20.171574f, 1.5001023f, 21.0f, 1.5001023f);
                instancePath.close();
                instancePath.moveTo(18.0f, 20.999945f);
                instancePath.lineTo(19.5f, 47.99998f);
                instancePath.lineTo(24.0f, 47.99998f);
                instancePath.lineTo(22.800001f, 20.999945f);
                instancePath.lineTo(18.0f, 20.999945f);
                instancePath.close();
                instancePath.moveTo(31.5f, 20.999945f);
                instancePath.lineTo(30.0f, 47.99998f);
                instancePath.lineTo(34.5f, 47.99998f);
                instancePath.lineTo(36.0f, 20.999945f);
                instancePath.lineTo(31.5f, 20.999945f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
