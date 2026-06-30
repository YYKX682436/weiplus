package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ofm_card_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 19.0f, 0.0f, 1.0f, 21.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.0f, 6.0f);
        instancePath.cubicTo(19.673405f, 4.218915f, 36.356895f, 2.132536f, 53.0f, -3.5527137E-15f);
        instancePath.cubicTo(54.563484f, -0.26629594f, 56.399273f, 0.39892635f, 57.0f, 2.0f);
        instancePath.cubicTo(57.15578f, 5.3276186f, 56.88344f, 8.673888f, 57.0f, 12.0f);
        instancePath.cubicTo(38.97945f, 10.115204f, 20.994768f, 8.169932f, 3.0f, 6.0f);
        instancePath.lineTo(3.0f, 6.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(1.0f, 10.0f);
        instancePath2.cubicTo(2.8582108f, 9.652563f, 4.5471535f, 10.303478f, 6.0f, 10.0f);
        instancePath2.cubicTo(22.725773f, 12.346351f, 39.365356f, 14.088799f, 56.0f, 16.0f);
        instancePath2.cubicTo(57.334106f, 16.161715f, 58.083637f, 17.643797f, 58.0f, 19.0f);
        instancePath2.cubicTo(58.00369f, 29.600607f, 57.993694f, 40.325684f, 58.0f, 51.0f);
        instancePath2.cubicTo(58.253532f, 52.72311f, 56.764465f, 54.375435f, 55.0f, 54.0f);
        instancePath2.cubicTo(37.66642f, 51.972057f, 20.307287f, 49.959225f, 3.0f, 48.0f);
        instancePath2.cubicTo(1.2891929f, 48.07658f, -0.20986862f, 46.794777f, -3.5527137E-15f, 45.0f);
        instancePath2.cubicTo(-0.039974976f, 34.657715f, 0.069956206f, 24.263103f, -3.5527137E-15f, 14.0f);
        instancePath2.cubicTo(0.07994995f, 12.616731f, -0.14990616f, 10.82421f, 1.0f, 10.0f);
        instancePath2.lineTo(1.0f, 10.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
