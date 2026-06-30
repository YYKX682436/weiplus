package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class image_gallery_search_image_bubble_triangle extends l95.c {
    private final int width = 14;
    private final int height = 5;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 14;
        }
        if (i17 == 1) {
            return 5;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1284016265);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -273.0f, 0.0f, 1.0f, -738.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 6.123234E-17f, 1.0f, -460.50168f, -1.0f, 6.123234E-17f, 1020.4983f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(281.20755f, 736.37714f);
            instancePath.lineTo(277.97794f, 739.54205f);
            instancePath.cubicTo(277.33832f, 740.1688f, 277.33862f, 741.168f, 277.97794f, 741.79456f);
            instancePath.lineTo(281.20755f, 744.9594f);
            instancePath.cubicTo(281.79355f, 745.5337f, 282.49832f, 746.6472f, 282.49832f, 747.49835f);
            instancePath.lineTo(282.49832f, 733.50165f);
            instancePath.cubicTo(282.49832f, 735.33954f, 281.7925f, 735.8039f, 281.20755f, 736.37714f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
