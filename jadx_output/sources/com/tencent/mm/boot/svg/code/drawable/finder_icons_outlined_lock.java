package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_lock extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(10.799999f, 7.0f);
        instancePath.lineTo(10.799999f, 4.0f);
        instancePath.cubicTo(10.799997f, 2.4535997f, 9.546394f, 1.199997f, 8.0f, 1.199997f);
        instancePath.cubicTo(6.4535995f, 1.199997f, 5.199997f, 2.4535997f, 5.199997f, 4.0f);
        instancePath.lineTo(5.2000003f, 7.0f);
        instancePath.lineTo(10.799999f, 7.0f);
        instancePath.close();
        instancePath.moveTo(14.8f, 8.2f);
        instancePath.lineTo(1.2f, 8.2f);
        instancePath.lineTo(1.2f, 18.8f);
        instancePath.lineTo(14.8f, 18.8f);
        instancePath.lineTo(14.8f, 8.2f);
        instancePath.close();
        instancePath.moveTo(8.0f, 11.0f);
        instancePath.cubicTo(8.828427f, 11.0f, 9.5f, 11.671573f, 9.5f, 12.5f);
        instancePath.cubicTo(9.5f, 13.115096f, 9.129771f, 13.64372f, 8.599999f, 13.875187f);
        instancePath.lineTo(8.599999f, 16.0f);
        instancePath.lineTo(7.3999996f, 16.0f);
        instancePath.lineTo(7.3999996f, 13.875187f);
        instancePath.cubicTo(6.8702283f, 13.64372f, 6.5f, 13.115095f, 6.5f, 12.5f);
        instancePath.cubicTo(6.5f, 11.671573f, 7.1715727f, 11.0f, 8.0f, 11.0f);
        instancePath.close();
        instancePath.moveTo(4.0f, 4.0f);
        instancePath.cubicTo(4.0f, 1.790861f, 5.790861f, 0.0f, 8.0f, 0.0f);
        instancePath.cubicTo(10.209139f, 0.0f, 12.0f, 1.790861f, 12.0f, 4.0f);
        instancePath.lineTo(12.0f, 7.0f);
        instancePath.lineTo(14.999128f, 7.0f);
        instancePath.cubicTo(15.551894f, 7.0f, 16.0f, 7.4474893f, 16.0f, 7.9985023f);
        instancePath.lineTo(16.0f, 19.001497f);
        instancePath.cubicTo(16.0f, 19.552956f, 15.555369f, 20.0f, 14.999128f, 20.0f);
        instancePath.lineTo(1.0008717f, 20.0f);
        instancePath.cubicTo(0.4481055f, 20.0f, 0.0f, 19.552511f, 0.0f, 19.001497f);
        instancePath.lineTo(0.0f, 7.9985023f);
        instancePath.cubicTo(0.0f, 7.447045f, 0.44463086f, 7.0f, 1.0008717f, 7.0f);
        instancePath.lineTo(4.0f, 7.0f);
        instancePath.lineTo(4.0f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
