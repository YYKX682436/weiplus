package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_move_to_cellphone extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.956522f, 0.0f);
        instancePath.cubicTo(15.532819f, 0.0f, 16.0f, 0.46718112f, 16.0f, 1.0434783f);
        instancePath.lineTo(16.0f, 16.1979f);
        instancePath.cubicTo(16.0f, 16.774199f, 15.532819f, 17.241379f, 14.956522f, 17.241379f);
        instancePath.lineTo(11.13f, 17.241f);
        instancePath.lineTo(11.13f, 16.281f);
        instancePath.lineTo(14.956522f, 16.28138f);
        instancePath.cubicTo(14.991099f, 16.28138f, 15.020767f, 16.260357f, 15.03344f, 16.230394f);
        instancePath.lineTo(15.04f, 16.1979f);
        instancePath.lineTo(15.04f, 1.0434783f);
        instancePath.cubicTo(15.04f, 1.0089004f, 15.018977f, 0.97923285f, 14.989016f, 0.9665601f);
        instancePath.lineTo(14.956522f, 0.96f);
        instancePath.lineTo(5.9130435f, 0.96f);
        instancePath.cubicTo(5.8784657f, 0.96f, 5.8487983f, 0.98102313f, 5.8361254f, 1.0109848f);
        instancePath.lineTo(5.829565f, 1.0434783f);
        instancePath.lineTo(5.829f, 2.758f);
        instancePath.lineTo(4.869f, 2.758f);
        instancePath.lineTo(4.869565f, 1.0434783f);
        instancePath.cubicTo(4.869565f, 0.46718112f, 5.336746f, 0.0f, 5.9130435f, 0.0f);
        instancePath.lineTo(14.956522f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(0.96f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.48f, 4.282099f);
        instancePath2.cubicTo(0.48f, 3.7058015f, 0.9471811f, 3.2386208f, 1.5234783f, 3.2386208f);
        instancePath2.lineTo(9.6069565f, 3.2386208f);
        instancePath2.cubicTo(10.183253f, 3.2386208f, 10.6504345f, 3.7058015f, 10.6504345f, 4.282099f);
        instancePath2.lineTo(10.6504345f, 18.476522f);
        instancePath2.cubicTo(10.6504345f, 19.05282f, 10.183253f, 19.52f, 9.6069565f, 19.52f);
        instancePath2.lineTo(1.5234783f, 19.52f);
        instancePath2.cubicTo(0.9471811f, 19.52f, 0.48f, 19.05282f, 0.48f, 18.476522f);
        instancePath2.lineTo(0.48f, 4.282099f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.019324f, 17.020592f);
        instancePath3.cubicTo(4.019324f, 16.932226f, 4.090958f, 16.860592f, 4.1793237f, 16.860592f);
        instancePath3.lineTo(6.9511113f, 16.860592f);
        instancePath3.cubicTo(7.039477f, 16.860592f, 7.111111f, 16.932226f, 7.111111f, 17.020592f);
        instancePath3.lineTo(7.111111f, 17.700592f);
        instancePath3.cubicTo(7.111111f, 17.788958f, 7.039477f, 17.860592f, 6.9511113f, 17.860592f);
        instancePath3.lineTo(4.1793237f, 17.860592f);
        instancePath3.cubicTo(4.090958f, 17.860592f, 4.019324f, 17.788958f, 4.019324f, 17.700592f);
        instancePath3.lineTo(4.019324f, 17.020592f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
