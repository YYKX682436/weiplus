package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_min_window extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(72.0f, 0.0f);
        instancePath.lineTo(72.0f, 72.0f);
        instancePath.lineTo(0.0f, 72.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 35.5717f, 0.70710677f, 0.70710677f, -16.49164f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(38.400127f, 39.172203f);
        instancePath2.lineTo(50.42094f, 51.19302f);
        instancePath2.lineTo(47.23896f, 54.375f);
        instancePath2.lineTo(39.942097f, 47.079018f);
        instancePath2.lineTo(39.94302f, 67.693016f);
        instancePath2.lineTo(35.44302f, 67.693016f);
        instancePath2.lineTo(35.442097f, 47.07702f);
        instancePath2.lineTo(28.147078f, 54.375f);
        instancePath2.lineTo(24.965097f, 51.19302f);
        instancePath2.lineTo(36.985912f, 39.172203f);
        instancePath2.cubicTo(37.37644f, 38.78168f, 38.0096f, 38.78168f, 38.400127f, 39.172203f);
        instancePath2.close();
        instancePath2.moveTo(39.94302f, 1.6930195f);
        instancePath2.lineTo(39.942097f, 22.30502f);
        instancePath2.lineTo(47.23896f, 15.011039f);
        instancePath2.lineTo(50.42094f, 18.19302f);
        instancePath2.lineTo(38.400127f, 30.213835f);
        instancePath2.cubicTo(38.0096f, 30.604359f, 37.37644f, 30.604359f, 36.985912f, 30.213835f);
        instancePath2.lineTo(36.985912f, 30.213835f);
        instancePath2.lineTo(24.965097f, 18.19302f);
        instancePath2.lineTo(28.147078f, 15.011039f);
        instancePath2.lineTo(35.442097f, 22.30902f);
        instancePath2.lineTo(35.44302f, 1.6930195f);
        instancePath2.lineTo(39.94302f, 1.6930195f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
