package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_add_product_bottom extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-14671840);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.5f, 18.2542f);
        instancePath3.cubicTo(4.5f, 18.5994f, 4.77982f, 18.8792f, 5.125f, 18.8792f);
        instancePath3.lineTo(18.875f, 18.8792f);
        instancePath3.cubicTo(19.2202f, 18.8792f, 19.5f, 18.5994f, 19.5f, 18.2542f);
        instancePath3.cubicTo(19.5f, 17.909f, 19.2202f, 17.6292f, 18.875f, 17.6292f);
        instancePath3.lineTo(5.125f, 17.6292f);
        instancePath3.cubicTo(4.77982f, 17.6292f, 4.5f, 17.909f, 4.5f, 18.2542f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-14671840);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(6.52658f, 9.97603f);
        instancePath4.cubicTo(6.2825f, 10.2201f, 6.2825f, 10.6158f, 6.52658f, 10.8599f);
        instancePath4.lineTo(11.0533f, 15.3866f);
        instancePath4.cubicTo(11.3207f, 15.6541f, 11.6793f, 15.775f, 12.0291f, 15.7493f);
        instancePath4.cubicTo(12.0523f, 15.7483f, 12.0752f, 15.7459f, 12.0977f, 15.7424f);
        instancePath4.cubicTo(12.3622f, 15.7083f, 12.6179f, 15.5897f, 12.821f, 15.3866f);
        instancePath4.lineTo(17.3477f, 10.8599f);
        instancePath4.cubicTo(17.5918f, 10.6158f, 17.5918f, 10.2201f, 17.3477f, 9.97603f);
        instancePath4.cubicTo(17.1036f, 9.73195f, 16.7079f, 9.73195f, 16.4638f, 9.97603f);
        instancePath4.lineTo(12.625f, 13.8148f);
        instancePath4.lineTo(12.625f, 5.125f);
        instancePath4.cubicTo(12.625f, 4.77982f, 12.3452f, 4.5f, 12.0f, 4.5f);
        instancePath4.cubicTo(11.6548f, 4.5f, 11.375f, 4.77982f, 11.375f, 5.125f);
        instancePath4.lineTo(11.375f, 13.9406f);
        instancePath4.lineTo(7.41046f, 9.97603f);
        instancePath4.cubicTo(7.16638f, 9.73195f, 6.77065f, 9.73195f, 6.52658f, 9.97603f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
