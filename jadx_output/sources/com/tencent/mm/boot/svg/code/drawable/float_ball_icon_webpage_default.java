package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_webpage_default extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
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
        instancePaint3.setColor(-855310);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.lineTo(48.0f, 48.0f);
        instancePath.lineTo(0.0f, 48.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 29.803303f, 0.70710677f, 0.70710677f, 13.332738f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 16.5f);
        instancePath2.lineTo(1.7777778f, 16.5f);
        instancePath2.lineTo(1.7777778f, 19.5f);
        instancePath2.cubicTo(1.7777778f, 21.00344f, 2.9965582f, 22.222221f, 4.5f, 22.222221f);
        instancePath2.cubicTo(6.003442f, 22.222221f, 7.2222223f, 21.00344f, 7.2222223f, 19.5f);
        instancePath2.lineTo(7.2222223f, 13.5f);
        instancePath2.cubicTo(7.2222223f, 11.996558f, 6.003442f, 10.777778f, 4.5f, 10.777778f);
        instancePath2.lineTo(4.5f, 9.0f);
        instancePath2.cubicTo(6.9852815f, 9.0f, 9.0f, 11.014719f, 9.0f, 13.5f);
        instancePath2.lineTo(9.0f, 19.5f);
        instancePath2.cubicTo(9.0f, 21.985281f, 6.9852815f, 24.0f, 4.5f, 24.0f);
        instancePath2.cubicTo(2.0147185f, 24.0f, 0.0f, 21.985281f, 0.0f, 19.5f);
        instancePath2.lineTo(0.0f, 16.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(9.0f, 7.5f);
        instancePath3.lineTo(7.2222223f, 7.5f);
        instancePath3.lineTo(7.2222223f, 4.5f);
        instancePath3.cubicTo(7.2222223f, 2.9965582f, 6.003442f, 1.7777778f, 4.5f, 1.7777778f);
        instancePath3.cubicTo(2.9965582f, 1.7777778f, 1.7777778f, 2.9965582f, 1.7777778f, 4.5f);
        instancePath3.lineTo(1.7777778f, 10.5f);
        instancePath3.cubicTo(1.7777778f, 12.003442f, 2.9965582f, 13.222222f, 4.5f, 13.222222f);
        instancePath3.lineTo(4.5f, 15.0f);
        instancePath3.cubicTo(2.0147185f, 15.0f, 0.0f, 12.985281f, 0.0f, 10.5f);
        instancePath3.lineTo(0.0f, 4.5f);
        instancePath3.cubicTo(0.0f, 2.0147185f, 2.0147185f, 4.565388E-16f, 4.5f, 0.0f);
        instancePath3.cubicTo(6.9852815f, -4.565388E-16f, 9.0f, 2.0147185f, 9.0f, 4.5f);
        instancePath3.lineTo(9.0f, 7.5f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
