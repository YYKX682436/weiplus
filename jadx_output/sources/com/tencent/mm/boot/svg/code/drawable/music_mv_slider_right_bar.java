package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class music_mv_slider_right_bar extends l95.c {
    private final int width = 16;
    private final int height = 52;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 52;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -301.0f, 0.0f, 1.0f, -680.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 31.0f, 0.0f, 1.0f, 648.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 270.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(12.0f, 0.0f);
        instancePath.cubicTo(14.209139f, -4.0581224E-16f, 16.0f, 1.790861f, 16.0f, 4.0f);
        instancePath.lineTo(16.0f, 48.0f);
        instancePath.cubicTo(16.0f, 50.20914f, 14.209139f, 52.0f, 12.0f, 52.0f);
        instancePath.lineTo(0.0f, 52.0f);
        instancePath.lineTo(0.0f, 52.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.0f, 23.0f);
        instancePath2.cubicTo(6.0f, 21.89543f, 6.8954306f, 21.0f, 8.0f, 21.0f);
        instancePath2.lineTo(8.0f, 21.0f);
        instancePath2.cubicTo(9.104569f, 21.0f, 10.0f, 21.89543f, 10.0f, 23.0f);
        instancePath2.lineTo(10.0f, 29.0f);
        instancePath2.cubicTo(10.0f, 30.10457f, 9.104569f, 31.0f, 8.0f, 31.0f);
        instancePath2.lineTo(8.0f, 31.0f);
        instancePath2.cubicTo(6.8954306f, 31.0f, 6.0f, 30.10457f, 6.0f, 29.0f);
        instancePath2.lineTo(6.0f, 23.0f);
        instancePath2.close();
        canvas.saveLayerAlpha(null, 76, 31);
        canvas.drawPath(instancePath2, l95.c.instancePaint(instancePaint4, looper));
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
