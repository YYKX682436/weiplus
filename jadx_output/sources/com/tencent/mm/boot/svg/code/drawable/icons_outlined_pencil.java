package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pencil extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(33.0f, 3.0f);
            instancePath.lineTo(33.0f, 6.6f);
            instancePath.lineTo(3.6f, 6.6f);
            instancePath.lineTo(3.6f, 53.4f);
            instancePath.lineTo(50.4f, 53.4f);
            instancePath.lineTo(50.4f, 24.0f);
            instancePath.lineTo(54.0f, 24.0f);
            instancePath.lineTo(54.0f, 54.0f);
            instancePath.cubicTo(54.0f, 55.656853f, 52.656853f, 57.0f, 51.0f, 57.0f);
            instancePath.lineTo(3.0f, 57.0f);
            instancePath.cubicTo(1.3431457f, 57.0f, 0.0f, 55.656853f, 0.0f, 54.0f);
            instancePath.lineTo(0.0f, 6.0f);
            instancePath.cubicTo(0.0f, 4.343146f, 1.3431457f, 3.0f, 3.0f, 3.0f);
            instancePath.lineTo(33.0f, 3.0f);
            instancePath.close();
            instancePath.moveTo(50.582645f, 2.23824f);
            instancePath.cubicTo(51.166965f, 1.6539196f, 52.114338f, 1.6539196f, 52.698658f, 2.23824f);
            instancePath.lineTo(54.814667f, 4.354252f);
            instancePath.cubicTo(55.39899f, 4.9385724f, 55.39899f, 5.8859434f, 54.814667f, 6.470264f);
            instancePath.lineTo(26.285717f, 34.999214f);
            instancePath.lineTo(19.335936f, 38.885635f);
            instancePath.cubicTo(18.903196f, 39.12764f, 18.356207f, 38.97302f, 18.114202f, 38.54028f);
            instancePath.cubicTo(17.960512f, 38.265457f, 17.962038f, 37.930202f, 18.118221f, 37.65679f);
            instancePath.lineTo(22.054068f, 30.766817f);
            instancePath.lineTo(50.582645f, 2.23824f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
