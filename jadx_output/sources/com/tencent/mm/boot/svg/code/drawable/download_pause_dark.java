package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class download_pause_dark extends l95.c {
    private final int width = 25;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 25;
        }
        if (i17 == 1) {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -264.0f, 0.0f, 1.0f, -296.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 256.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 264.0f, 0.0f, 1.0f, 36.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray5 = l95.c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-2130706433);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.0f, 0.0f);
        instancePath.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        instancePath.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
        instancePath.cubicTo(4.4771523f, 20.0f, 0.0f, 15.522847f, 0.0f, 10.0f);
        instancePath.cubicTo(0.0f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(10.0f, 1.6666666f);
        instancePath.cubicTo(5.397627f, 1.6666666f, 1.6666666f, 5.397627f, 1.6666666f, 10.0f);
        instancePath.cubicTo(1.6666666f, 14.602373f, 5.397627f, 18.333334f, 10.0f, 18.333334f);
        instancePath.cubicTo(14.602373f, 18.333334f, 18.333334f, 14.602373f, 18.333334f, 10.0f);
        instancePath.cubicTo(18.333334f, 5.397627f, 14.602373f, 1.6666666f, 10.0f, 1.6666666f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-855638017);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(10.000875f, 0.0f);
        instancePath2.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        instancePath2.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
        instancePath2.cubicTo(4.528486f, 20.0f, 0.08331788f, 15.605688f, 0.0011576068f, 10.153726f);
        instancePath2.lineTo(8.750172E-4f, 10.133333f);
        instancePath2.cubicTo(8.750172E-4f, 9.673096f, 0.37397105f, 9.3f, 0.83420837f, 9.3f);
        instancePath2.cubicTo(1.2944456f, 9.3f, 1.6675416f, 9.673096f, 1.6675416f, 10.133333f);
        instancePath2.lineTo(1.6658751f, 10.111f);
        instancePath2.lineTo(1.667875f, 10.111f);
        instancePath2.lineTo(1.6704869f, 10.254773f);
        instancePath2.cubicTo(1.8051492f, 14.739277f, 5.4828563f, 18.333334f, 10.0f, 18.333334f);
        instancePath2.cubicTo(14.602373f, 18.333334f, 18.333334f, 14.602373f, 18.333334f, 10.0f);
        instancePath2.cubicTo(18.333334f, 5.3979626f, 14.602917f, 1.6672107f, 10.001006f, 1.6666667f);
        instancePath2.cubicTo(9.5397625f, 1.6666666f, 9.166667f, 1.2935706f, 9.166667f, 0.8333333f);
        instancePath2.cubicTo(9.166667f, 0.37309605f, 9.5397625f, 0.0f, 10.0f, 0.0f);
        instancePath2.lineTo(10.0f, 0.0f);
        instancePath2.lineTo(10.000875f, 0.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-855638017);
        float[] matrixFloatArray6 = l95.c.setMatrixFloatArray(matrixFloatArray5, 1.0f, 0.0f, 6.451329f, 0.0f, 1.0f, 6.496923f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray6);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(6.4001856f, -4.5474735E-13f);
        instancePath3.lineTo(6.400015f, 8.271f);
        instancePath3.lineTo(8.856973f, 5.815717f);
        instancePath3.lineTo(10.104809f, 7.063553f);
        instancePath3.lineTo(6.1533294f, 11.015032f);
        instancePath3.cubicTo(5.8352556f, 11.333106f, 5.3347573f, 11.3575735f, 4.9886184f, 11.088433f);
        instancePath3.lineTo(4.905494f, 11.015032f);
        instancePath3.lineTo(0.95401496f, 7.063553f);
        instancePath3.lineTo(2.2018504f, 5.815717f);
        instancePath3.lineTo(4.635015f, 8.25f);
        instancePath3.lineTo(4.63548f, -4.5474735E-13f);
        instancePath3.lineTo(6.4001856f, -4.5474735E-13f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
