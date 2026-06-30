package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_product extends l95.c {
    private final int width = 12;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 12;
        }
        if (i17 == 1) {
            return 16;
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
        instancePaint3.setColor(-5066062);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -396.0f, 0.0f, 1.0f, -671.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 327.0f, 0.0f, 1.0f, 68.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.9f, 4.65f);
        instancePath.lineTo(0.9f, 13.506087f);
        instancePath.cubicTo(0.9f, 13.833202f, 1.1669413f, 14.1f, 1.4955453f, 14.1f);
        instancePath.lineTo(10.504455f, 14.1f);
        instancePath.cubicTo(10.832851f, 14.1f, 11.1f, 13.833303f, 11.1f, 13.506087f);
        instancePath.lineTo(11.1f, 4.65f);
        instancePath.lineTo(0.9f, 4.65f);
        instancePath.close();
        instancePath.moveTo(0.0f, 4.505613f);
        instancePath.cubicTo(0.0f, 4.0882993f, 0.33347315f, 3.75f, 0.75065374f, 3.75f);
        instancePath.lineTo(11.249347f, 3.75f);
        instancePath.cubicTo(11.663921f, 3.75f, 12.0f, 4.08669f, 12.0f, 4.505613f);
        instancePath.lineTo(12.0f, 13.506087f);
        instancePath.cubicTo(12.0f, 14.331152f, 11.329115f, 15.0f, 10.504455f, 15.0f);
        instancePath.lineTo(1.4955453f, 15.0f);
        instancePath.cubicTo(0.6695784f, 15.0f, 0.0f, 14.329952f, 0.0f, 13.506087f);
        instancePath.lineTo(0.0f, 4.505613f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.0f, 3.0f);
        instancePath2.cubicTo(3.0f, 1.3431457f, 4.343146f, 0.0f, 6.0f, 0.0f);
        instancePath2.cubicTo(7.656854f, 0.0f, 9.0f, 1.3431457f, 9.0f, 3.0f);
        instancePath2.lineTo(8.999999f, 6.75f);
        instancePath2.lineTo(8.099999f, 6.75f);
        instancePath2.lineTo(8.099999f, 3.0f);
        instancePath2.cubicTo(8.0999975f, 1.8401997f, 7.1597958f, 0.8999977f, 5.9999976f, 0.8999977f);
        instancePath2.cubicTo(4.8402f, 0.8999977f, 3.8999977f, 1.8401997f, 3.8999977f, 2.9999976f);
        instancePath2.lineTo(3.9f, 6.75f);
        instancePath2.lineTo(3.0f, 6.75f);
        instancePath2.lineTo(3.0f, 3.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
