package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class personactivity_takephoto_icon_normal extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.001439f, 18.0f);
        instancePath.cubicTo(3.5823665f, 18.0f, 0.0f, 21.582798f, 0.0f, 25.997679f);
        instancePath.lineTo(0.0f, 82.00232f);
        instancePath.cubicTo(0.0f, 86.41932f, 3.5913615f, 90.0f, 8.001439f, 90.0f);
        instancePath.lineTo(111.99856f, 90.0f);
        instancePath.cubicTo(116.41763f, 90.0f, 120.0f, 86.4172f, 120.0f, 82.00232f);
        instancePath.lineTo(120.0f, 25.997679f);
        instancePath.cubicTo(120.0f, 21.580683f, 116.40864f, 18.0f, 111.99856f, 18.0f);
        instancePath.lineTo(8.001439f, 18.0f);
        instancePath.close();
        instancePath.moveTo(47.750492f, 0.0f);
        instancePath.lineTo(60.0f, 0.0f);
        instancePath.lineTo(60.0f, 18.0f);
        instancePath.lineTo(23.340025f, 18.0f);
        instancePath.cubicTo(33.061623f, 18.0f, 38.284004f, 0.0f, 47.750492f, 0.0f);
        instancePath.close();
        instancePath.moveTo(96.65997f, 18.0f);
        instancePath.cubicTo(86.93838f, 18.0f, 81.715996f, 0.0f, 72.2474f, 0.0f);
        instancePath.lineTo(60.0f, 0.0f);
        instancePath.lineTo(60.0f, 18.0f);
        instancePath.lineTo(96.65997f, 18.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 27.0f);
        instancePath.cubicTo(74.91231f, 27.0f, 87.0f, 39.087692f, 87.0f, 54.0f);
        instancePath.cubicTo(87.0f, 68.91231f, 74.91231f, 81.0f, 60.0f, 81.0f);
        instancePath.cubicTo(45.087692f, 81.0f, 33.0f, 68.91231f, 33.0f, 54.0f);
        instancePath.cubicTo(33.0f, 39.087692f, 45.087692f, 27.0f, 60.0f, 27.0f);
        instancePath.close();
        instancePath.moveTo(78.0f, 54.0f);
        instancePath.cubicTo(78.0f, 63.9414f, 69.9414f, 72.0f, 60.0f, 72.0f);
        instancePath.cubicTo(50.0586f, 72.0f, 42.0f, 63.9414f, 42.0f, 54.0f);
        instancePath.cubicTo(42.0f, 44.0586f, 50.0586f, 36.0f, 60.0f, 36.0f);
        instancePath.cubicTo(69.9414f, 36.0f, 78.0f, 44.0586f, 78.0f, 54.0f);
        instancePath.close();
        instancePath.moveTo(5.4545455f, 6.4315085f);
        instancePath.lineTo(21.818182f, 6.4315085f);
        instancePath.lineTo(21.818182f, 12.407947f);
        instancePath.lineTo(5.4545455f, 12.407947f);
        instancePath.lineTo(5.4545455f, 6.4315085f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
