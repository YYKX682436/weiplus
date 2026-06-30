package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_product_gift extends l95.c {
    private final int width = 25;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 25;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.5f, 6.155f);
        instancePath.cubicTo(6.5f, 5.31f, 7.185f, 4.625f, 8.03f, 4.625f);
        instancePath.lineTo(16.97f, 4.625f);
        instancePath.cubicTo(17.815f, 4.625f, 18.5f, 5.31f, 18.5f, 6.155f);
        instancePath.lineTo(18.5f, 18.845f);
        instancePath.cubicTo(18.5f, 19.69f, 17.815f, 20.375f, 16.97f, 20.375f);
        instancePath.lineTo(8.03f, 20.375f);
        instancePath.cubicTo(7.185f, 20.375f, 6.5f, 19.69f, 6.5f, 18.845f);
        instancePath.lineTo(6.5f, 6.155f);
        instancePath.close();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 12.5f, 3.76367f, 15.0009f, 21.1849f, new int[]{-15252862, -15583896}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2112620);
        instancePaint6.setColor(-2112620);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(15.0656f, 11.8624f);
        instancePath2.cubicTo(15.0656f, 12.2476f, 14.7452f, 12.5356f, 14.4572f, 12.5356f);
        instancePath2.lineTo(13.124f, 12.5356f);
        instancePath2.cubicTo(13.5236f, 11.8696f, 14.0024f, 11.1904f, 14.4572f, 11.1904f);
        instancePath2.cubicTo(14.744f, 11.1904f, 15.0656f, 11.4784f, 15.0656f, 11.8636f);
        instancePath2.lineTo(15.0656f, 11.8624f);
        instancePath2.close();
        instancePath2.moveTo(10.5416f, 11.1892f);
        instancePath2.cubicTo(10.2548f, 11.1892f, 9.9332f, 11.4772f, 9.9332f, 11.8624f);
        instancePath2.cubicTo(9.9332f, 12.2476f, 10.2536f, 12.5356f, 10.5416f, 12.5356f);
        instancePath2.lineTo(11.8748f, 12.5356f);
        instancePath2.cubicTo(11.4752f, 11.8696f, 10.9964f, 11.1904f, 10.5416f, 11.1904f);
        instancePath2.lineTo(10.5416f, 11.1892f);
        instancePath2.close();
        instancePath2.moveTo(6.5f, 13.2544f);
        instancePath2.lineTo(9.32f, 13.2544f);
        instancePath2.cubicTo(9.0524f, 13.0684f, 8.8244f, 12.8212f, 8.6732f, 12.5344f);
        instancePath2.lineTo(6.5f, 12.5344f);
        instancePath2.lineTo(6.5f, 13.2544f);
        instancePath2.close();
        instancePath2.moveTo(18.5f, 12.5344f);
        instancePath2.lineTo(16.3268f, 12.5344f);
        instancePath2.cubicTo(16.1756f, 12.8212f, 15.9476f, 13.0684f, 15.68f, 13.2544f);
        instancePath2.lineTo(18.5f, 13.2544f);
        instancePath2.lineTo(18.5f, 12.5344f);
        instancePath2.close();
        instancePath2.moveTo(15.7856f, 11.8624f);
        instancePath2.cubicTo(15.7856f, 11.1076f, 15.1772f, 10.4692f, 14.4572f, 10.4692f);
        instancePath2.cubicTo(13.6244f, 10.4692f, 13.0208f, 11.3008f, 12.4988f, 12.178f);
        instancePath2.cubicTo(11.9768f, 11.3008f, 11.3732f, 10.4692f, 10.5404f, 10.4692f);
        instancePath2.cubicTo(9.8204f, 10.4692f, 9.212f, 11.1076f, 9.212f, 11.8624f);
        instancePath2.cubicTo(9.212f, 12.6172f, 9.8204f, 13.2556f, 10.5404f, 13.2556f);
        instancePath2.lineTo(11.858f, 13.2556f);
        instancePath2.cubicTo(11.246f, 14.182f, 10.4468f, 14.9704f, 9.5156f, 15.5548f);
        instancePath2.lineTo(9.8984f, 16.1644f);
        instancePath2.cubicTo(10.9364f, 15.5128f, 11.8256f, 14.6308f, 12.5f, 13.594f);
        instancePath2.cubicTo(13.1732f, 14.6308f, 14.0624f, 15.5128f, 15.1016f, 16.1644f);
        instancePath2.lineTo(15.4844f, 15.5548f);
        instancePath2.cubicTo(14.5532f, 14.9704f, 13.754f, 14.1808f, 13.142f, 13.2556f);
        instancePath2.lineTo(14.4584f, 13.2556f);
        instancePath2.cubicTo(15.1784f, 13.2556f, 15.7868f, 12.6172f, 15.7868f, 11.8624f);
        instancePath2.lineTo(15.7856f, 11.8624f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
