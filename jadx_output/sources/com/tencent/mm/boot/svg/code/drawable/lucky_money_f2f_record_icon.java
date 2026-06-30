package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_f2f_record_icon extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -257.0f, 0.0f, 1.0f, -307.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 257.0f, 0.0f, 1.0f, 307.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-3232652);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 5.3333335f);
        instancePath.cubicTo(0.0f, 2.3878145f, 2.3878145f, 0.0f, 5.3333335f, 0.0f);
        instancePath.lineTo(42.666668f, 0.0f);
        instancePath.cubicTo(45.612186f, 0.0f, 48.0f, 2.3878145f, 48.0f, 5.3333335f);
        instancePath.lineTo(48.0f, 42.666668f);
        instancePath.cubicTo(48.0f, 45.612186f, 45.612186f, 48.0f, 42.666668f, 48.0f);
        instancePath.lineTo(5.3333335f, 48.0f);
        instancePath.cubicTo(2.3878145f, 48.0f, 0.0f, 45.612186f, 0.0f, 42.666668f);
        instancePath.lineTo(0.0f, 5.3333335f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(14.822541f, 37.75567f);
        instancePath2.lineTo(14.822541f, 36.495667f);
        instancePath2.lineTo(33.27254f, 36.495667f);
        instancePath2.lineTo(33.27254f, 37.75567f);
        instancePath2.lineTo(36.032543f, 37.75567f);
        instancePath2.lineTo(36.032543f, 16.875668f);
        instancePath2.lineTo(24.692541f, 16.875668f);
        instancePath2.cubicTo(25.082542f, 15.855667f, 25.382542f, 14.805667f, 25.622541f, 13.725667f);
        instancePath2.lineTo(37.442543f, 13.725667f);
        instancePath2.lineTo(37.442543f, 10.995667f);
        instancePath2.lineTo(10.562542f, 10.995667f);
        instancePath2.lineTo(10.562542f, 13.725667f);
        instancePath2.lineTo(22.712542f, 13.725667f);
        instancePath2.cubicTo(22.502542f, 14.805667f, 22.202541f, 15.855667f, 21.812542f, 16.875668f);
        instancePath2.lineTo(12.062542f, 16.875668f);
        instancePath2.lineTo(12.062542f, 37.75567f);
        instancePath2.lineTo(14.822541f, 37.75567f);
        instancePath2.close();
        instancePath2.moveTo(18.242542f, 33.855667f);
        instancePath2.lineTo(14.822541f, 33.855667f);
        instancePath2.lineTo(14.822541f, 19.485668f);
        instancePath2.lineTo(18.242542f, 19.485668f);
        instancePath2.lineTo(18.242542f, 33.855667f);
        instancePath2.close();
        instancePath2.moveTo(33.27254f, 33.855667f);
        instancePath2.lineTo(29.76254f, 33.855667f);
        instancePath2.lineTo(29.76254f, 19.485668f);
        instancePath2.lineTo(33.27254f, 19.485668f);
        instancePath2.lineTo(33.27254f, 33.855667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 22.605667f);
        instancePath2.lineTo(20.912542f, 22.605667f);
        instancePath2.lineTo(20.912542f, 19.485668f);
        instancePath2.lineTo(27.09254f, 19.485668f);
        instancePath2.lineTo(27.09254f, 22.605667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 28.185667f);
        instancePath2.lineTo(20.912542f, 28.185667f);
        instancePath2.lineTo(20.912542f, 25.065668f);
        instancePath2.lineTo(27.09254f, 25.065668f);
        instancePath2.lineTo(27.09254f, 28.185667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 33.855667f);
        instancePath2.lineTo(20.912542f, 33.855667f);
        instancePath2.lineTo(20.912542f, 30.615667f);
        instancePath2.lineTo(27.09254f, 30.615667f);
        instancePath2.lineTo(27.09254f, 33.855667f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
