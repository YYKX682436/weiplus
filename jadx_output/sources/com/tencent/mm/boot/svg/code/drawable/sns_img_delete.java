package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_img_delete extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(15.0f, 1.0f);
        instancePath.cubicTo(15.0f, 0.44771522f, 15.447715f, 0.0f, 16.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.cubicTo(32.552284f, 0.0f, 33.0f, 0.44771522f, 33.0f, 1.0f);
        instancePath.lineTo(33.0f, 6.0f);
        instancePath.cubicTo(33.0f, 6.5522847f, 32.552284f, 7.0f, 32.0f, 7.0f);
        instancePath.lineTo(16.0f, 7.0f);
        instancePath.cubicTo(15.447715f, 7.0f, 15.0f, 6.5522847f, 15.0f, 6.0f);
        instancePath.lineTo(15.0f, 1.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setStrokeWidth(4.5f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.25f, 8.25f);
        instancePath2.lineTo(40.75f, 8.25f);
        instancePath2.lineTo(40.75f, 50.75f);
        instancePath2.lineTo(7.25f, 50.75f);
        instancePath2.lineTo(7.25f, 8.25f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 17.0f, 0.0f, 1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 1.0f);
        instancePath3.cubicTo(0.0f, 0.44771522f, 0.44771522f, -2.6645353E-15f, 1.0f, -2.6645353E-15f);
        instancePath3.lineTo(2.0f, -2.6645353E-15f);
        instancePath3.cubicTo(2.5522847f, -2.6645353E-15f, 3.0f, 0.44771522f, 3.0f, 1.0f);
        instancePath3.lineTo(3.0f, 21.0f);
        instancePath3.cubicTo(3.0f, 21.552284f, 2.5522847f, 22.0f, 2.0f, 22.0f);
        instancePath3.lineTo(1.0f, 22.0f);
        instancePath3.cubicTo(0.44771522f, 22.0f, 0.0f, 21.552284f, 0.0f, 21.0f);
        instancePath3.lineTo(0.0f, 1.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint6, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(11.998957f, -1.7763568E-15f);
        instancePath4.cubicTo(11.447248f, -1.7763568E-15f, 11.0f, 0.43945834f, 11.0f, 1.0024617f);
        instancePath4.lineTo(11.0f, 20.997538f);
        instancePath4.cubicTo(11.0f, 21.551182f, 11.44266f, 22.0f, 11.998957f, 22.0f);
        instancePath4.lineTo(13.001043f, 22.0f);
        instancePath4.cubicTo(13.552752f, 22.0f, 14.0f, 21.560541f, 14.0f, 20.997538f);
        instancePath4.lineTo(14.0f, 1.0024617f);
        instancePath4.cubicTo(14.0f, 0.44881737f, 13.55734f, -1.7763568E-15f, 13.001043f, -1.7763568E-15f);
        instancePath4.lineTo(11.998957f, -1.7763568E-15f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(0.0f, 7.0f);
        instancePath5.cubicTo(0.0f, 6.4477153f, 0.44771522f, 6.0f, 1.0f, 6.0f);
        instancePath5.lineTo(47.0f, 6.0f);
        instancePath5.cubicTo(47.552284f, 6.0f, 48.0f, 6.4477153f, 48.0f, 7.0f);
        instancePath5.lineTo(48.0f, 8.0f);
        instancePath5.cubicTo(48.0f, 8.552285f, 47.552284f, 9.0f, 47.0f, 9.0f);
        instancePath5.lineTo(1.0f, 9.0f);
        instancePath5.cubicTo(0.44771522f, 9.0f, 0.0f, 8.552285f, 0.0f, 8.0f);
        instancePath5.lineTo(0.0f, 7.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
