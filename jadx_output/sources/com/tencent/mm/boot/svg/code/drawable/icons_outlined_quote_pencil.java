package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_quote_pencil extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.5f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 7.75f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(33.0f, 2.0f);
        instancePath.lineTo(33.0f, 5.6f);
        instancePath.lineTo(3.6f, 5.6f);
        instancePath.lineTo(3.6f, 52.4f);
        instancePath.lineTo(50.4f, 52.4f);
        instancePath.lineTo(50.4f, 23.0f);
        instancePath.lineTo(54.0f, 23.0f);
        instancePath.lineTo(54.0f, 53.0f);
        instancePath.cubicTo(54.0f, 54.656853f, 52.656853f, 56.0f, 51.0f, 56.0f);
        instancePath.lineTo(3.0f, 56.0f);
        instancePath.cubicTo(1.3431457f, 56.0f, 0.0f, 54.656853f, 0.0f, 53.0f);
        instancePath.lineTo(0.0f, 5.0f);
        instancePath.cubicTo(0.0f, 3.3431458f, 1.3431457f, 2.0f, 3.0f, 2.0f);
        instancePath.lineTo(33.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(52.698658f, 1.2382401f);
        instancePath.lineTo(54.814667f, 3.354252f);
        instancePath.cubicTo(55.39899f, 3.9385726f, 55.39899f, 4.8859434f, 54.814667f, 5.470264f);
        instancePath.lineTo(26.285717f, 33.999214f);
        instancePath.lineTo(19.335936f, 37.885635f);
        instancePath.cubicTo(18.903196f, 38.12764f, 18.356207f, 37.97302f, 18.114202f, 37.54028f);
        instancePath.cubicTo(17.960512f, 37.265457f, 17.962038f, 36.930202f, 18.118221f, 36.65679f);
        instancePath.lineTo(22.054068f, 29.766817f);
        instancePath.lineTo(50.582645f, 1.2382401f);
        instancePath.cubicTo(51.166965f, 0.6539196f, 52.114338f, 0.6539196f, 52.698658f, 1.2382401f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
