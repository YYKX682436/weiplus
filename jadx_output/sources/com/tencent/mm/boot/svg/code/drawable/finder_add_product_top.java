package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_add_product_top extends l95.c {
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
        instancePath3.moveTo(19.5f, 5.74581f);
        instancePath3.cubicTo(19.5f, 5.40064f, 19.2202f, 5.12081f, 18.875f, 5.12081f);
        instancePath3.lineTo(5.125f, 5.12081f);
        instancePath3.cubicTo(4.77982f, 5.12081f, 4.5f, 5.40064f, 4.5f, 5.74581f);
        instancePath3.cubicTo(4.5f, 6.09099f, 4.77982f, 6.37082f, 5.125f, 6.37082f);
        instancePath3.lineTo(18.875f, 6.37081f);
        instancePath3.cubicTo(19.2202f, 6.37081f, 19.5f, 6.09099f, 19.5f, 5.74581f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-14671840);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(17.4734f, 14.024f);
        instancePath4.cubicTo(17.7175f, 13.7799f, 17.7175f, 13.3842f, 17.4734f, 13.1401f);
        instancePath4.lineTo(12.9467f, 8.61341f);
        instancePath4.cubicTo(12.6793f, 8.34592f, 12.3207f, 8.22501f, 11.9709f, 8.25067f);
        instancePath4.cubicTo(11.9477f, 8.25173f, 11.9248f, 8.25406f, 11.9023f, 8.25759f);
        instancePath4.cubicTo(11.6378f, 8.29166f, 11.3821f, 8.41027f, 11.179f, 8.61342f);
        instancePath4.lineTo(6.65231f, 13.1401f);
        instancePath4.cubicTo(6.40823f, 13.3842f, 6.40823f, 13.7799f, 6.65231f, 14.024f);
        instancePath4.cubicTo(6.89638f, 14.2681f, 7.29211f, 14.2681f, 7.53619f, 14.024f);
        instancePath4.lineTo(11.375f, 10.1852f);
        instancePath4.lineTo(11.375f, 18.875f);
        instancePath4.cubicTo(11.375f, 19.2202f, 11.6548f, 19.5f, 12.0f, 19.5f);
        instancePath4.cubicTo(12.3452f, 19.5f, 12.625f, 19.2202f, 12.625f, 18.875f);
        instancePath4.lineTo(12.625f, 10.0594f);
        instancePath4.lineTo(16.5895f, 14.024f);
        instancePath4.cubicTo(16.8336f, 14.2681f, 17.2293f, 14.2681f, 17.4734f, 14.024f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
