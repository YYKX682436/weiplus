package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottom_sheet_loading_icon extends l95.c {
    private final int width = 80;
    private final int height = 80;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 80;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(40.0f, 0.0f);
        instancePath.cubicTo(62.09139f, 0.0f, 80.0f, 17.90861f, 80.0f, 40.0f);
        instancePath.cubicTo(80.0f, 62.09139f, 62.09139f, 80.0f, 40.0f, 80.0f);
        instancePath.lineTo(40.0f, 73.0f);
        instancePath.cubicTo(58.225395f, 73.0f, 73.0f, 58.225395f, 73.0f, 40.0f);
        instancePath.cubicTo(73.0f, 21.774603f, 58.225395f, 7.0f, 40.0f, 7.0f);
        instancePath.lineTo(40.0f, 0.0f);
        instancePath.close();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 80.0f, 0.0f, 40.0f, 0.0f, 80.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.94086915f, 0.0f, 0.94086915f, 0.90559083f, new int[]{13421772, -2134061876}, new float[]{0.0f, 0.9971495f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(40.0f, 0.0f);
        instancePath2.lineTo(40.0f, 7.0f);
        instancePath2.cubicTo(21.774603f, 7.0f, 7.0f, 21.774603f, 7.0f, 40.0f);
        instancePath2.cubicTo(7.0f, 58.225395f, 21.774603f, 73.0f, 40.0f, 73.0f);
        instancePath2.lineTo(40.0f, 80.0f);
        instancePath2.cubicTo(17.90861f, 80.0f, 0.0f, 62.09139f, 0.0f, 40.0f);
        instancePath2.cubicTo(0.0f, 17.90861f, 17.90861f, 0.0f, 40.0f, 0.0f);
        instancePath2.close();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect(null);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 40.0f, 0.0f, 0.0f, 0.0f, 80.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.0f, 0.100855626f, 1.0f, 0.89322317f, new int[]{-3355444, -2134061876}, new float[]{9.2377537E-4f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-3355444);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(40.5f, 0.0f);
        instancePath3.cubicTo(42.433f, 0.0f, 44.0f, 1.5670033f, 44.0f, 3.5f);
        instancePath3.cubicTo(44.0f, 5.4329967f, 42.433f, 7.0f, 40.5f, 7.0f);
        instancePath3.cubicTo(38.567f, 7.0f, 37.0f, 5.4329967f, 37.0f, 3.5f);
        instancePath3.cubicTo(37.0f, 1.5670033f, 38.567f, 0.0f, 40.5f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
