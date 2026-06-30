package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_ad_feedback_no_interesting extends l95.c {
    private final int width = 20;
    private final int height = 22;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 20;
        }
        if (i17 == 1) {
            return 22;
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
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -197.0f, 0.0f, 1.0f, -242.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 67.0f, 0.0f, 1.0f, 149.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 118.0f, 0.0f, 1.0f, 85.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray5);
            canvas.concat(instanceMatrix);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.229161f, 5.6932807f);
            instancePath.lineTo(3.9407613f, 6.4062424f);
            instancePath.cubicTo(3.0101392f, 7.633529f, 3.0913734f, 9.385633f, 4.182215f, 10.510514f);
            instancePath.lineTo(10.002209f, 16.330568f);
            instancePath.lineTo(11.933f, 14.398f);
            instancePath.lineTo(12.641f, 15.105f);
            instancePath.lineTo(10.5915f, 17.155502f);
            instancePath.cubicTo(10.26608f, 17.480955f, 9.738442f, 17.480984f, 9.412989f, 17.155563f);
            instancePath.lineTo(3.475105f, 11.217618f);
            instancePath.cubicTo(1.9951364f, 9.691675f, 1.9130619f, 7.3134685f, 3.229161f, 5.6932807f);
            instancePath.close();
            instancePath.moveTo(3.014214f, 2.65f);
            instancePath.lineTo(4.8436174f, 4.4779353f);
            instancePath.cubicTo(6.3596025f, 3.837565f, 8.1776495f, 4.1350493f, 9.412989f, 5.3703885f);
            instancePath.cubicTo(9.565328f, 5.5227275f, 9.761746f, 5.712194f, 10.002245f, 5.938788f);
            instancePath.cubicTo(10.242743f, 5.712194f, 10.439161f, 5.5227275f, 10.5915f, 5.3703885f);
            instancePath.cubicTo(12.218685f, 3.7432039f, 14.856873f, 3.7432039f, 16.484056f, 5.3703885f);
            instancePath.cubicTo(18.096106f, 6.982437f, 18.111101f, 9.586767f, 16.529043f, 11.217276f);
            instancePath.lineTo(14.055f, 13.69f);
            instancePath.lineTo(16.95415f, 16.589935f);
            instancePath.lineTo(16.247042f, 17.297043f);
            instancePath.lineTo(4.6635995f, 5.7128177f);
            instancePath.cubicTo(4.6632724f, 5.7130446f, 4.6629453f, 5.713272f, 4.6626177f, 5.7134995f);
            instancePath.lineTo(3.947121f, 4.997492f);
            instancePath.lineTo(2.3071072f, 3.357107f);
            instancePath.lineTo(3.014214f, 2.65f);
            instancePath.close();
            instancePath.moveTo(11.298611f, 6.077495f);
            instancePath.cubicTo(11.138386f, 6.2377157f, 10.93516f, 6.4337497f, 10.687999f, 6.666621f);
            instancePath.lineTo(10.002245f, 7.3127294f);
            instancePath.lineTo(9.31649f, 6.666621f);
            instancePath.cubicTo(9.069329f, 6.4337497f, 8.866103f, 6.2377157f, 8.705882f, 6.077495f);
            instancePath.cubicTo(7.8722334f, 5.243847f, 6.6894197f, 4.9721713f, 5.6281943f, 5.262469f);
            instancePath.lineTo(13.348f, 12.983f);
            instancePath.lineTo(15.811353f, 10.520913f);
            instancePath.cubicTo(17.014784f, 9.280626f, 17.000736f, 7.301281f, 15.77695f, 6.077495f);
            instancePath.cubicTo(14.54029f, 4.840835f, 12.535267f, 4.840835f, 11.298611f, 6.077495f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(20.0f, 0.0f);
            instancePath2.lineTo(20.0f, 20.0f);
            instancePath2.lineTo(0.0f, 20.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
