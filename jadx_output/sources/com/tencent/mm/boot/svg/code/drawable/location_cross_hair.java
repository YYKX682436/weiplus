package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class location_cross_hair extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 9.285714f);
        instancePath.lineTo(18.535715f, 9.285714f);
        instancePath.cubicTo(18.196428f, 5.125f, 14.875f, 1.8035715f, 10.714286f, 1.4642857f);
        instancePath.lineTo(10.714286f, 0.0f);
        instancePath.lineTo(9.285714f, 0.0f);
        instancePath.lineTo(9.285714f, 1.4642857f);
        instancePath.cubicTo(5.125f, 1.8035715f, 1.8035715f, 5.125f, 1.4642857f, 9.285714f);
        instancePath.lineTo(0.0f, 9.285714f);
        instancePath.lineTo(0.0f, 10.714286f);
        instancePath.lineTo(1.4642857f, 10.714286f);
        instancePath.cubicTo(1.8035715f, 14.875f, 5.125f, 18.196428f, 9.285714f, 18.535715f);
        instancePath.lineTo(9.285714f, 20.0f);
        instancePath.lineTo(10.714286f, 20.0f);
        instancePath.lineTo(10.714286f, 18.535715f);
        instancePath.cubicTo(14.875f, 18.196428f, 18.196428f, 14.875f, 18.535715f, 10.714286f);
        instancePath.lineTo(20.0f, 10.714286f);
        instancePath.lineTo(20.0f, 9.285714f);
        instancePath.close();
        instancePath.moveTo(10.0f, 17.142857f);
        instancePath.cubicTo(6.053571f, 17.142857f, 2.857143f, 13.946428f, 2.857143f, 10.0f);
        instancePath.cubicTo(2.857143f, 6.053571f, 6.053571f, 2.857143f, 10.0f, 2.857143f);
        instancePath.cubicTo(13.946428f, 2.857143f, 17.142857f, 6.053571f, 17.142857f, 10.0f);
        instancePath.cubicTo(17.142857f, 13.946428f, 13.946428f, 17.142857f, 10.0f, 17.142857f);
        instancePath.close();
        instancePath.moveTo(12.857142f, 10.0f);
        instancePath.cubicTo(12.857142f, 11.571428f, 11.571428f, 12.857142f, 10.0f, 12.857142f);
        instancePath.cubicTo(8.428572f, 12.857142f, 7.142857f, 11.571428f, 7.142857f, 10.0f);
        instancePath.cubicTo(7.142857f, 8.428572f, 8.428572f, 7.142857f, 10.0f, 7.142857f);
        instancePath.cubicTo(11.571428f, 7.142857f, 12.857142f, 8.428572f, 12.857142f, 10.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        l95.c.done(looper);
        return 0;
    }
}
