package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sight_icon_emoji extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 90;
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
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(26.0f, 1.0f);
        instancePath.cubicTo(41.749996f, -2.7020142f, 58.451546f, 6.5304475f, 64.0f, 21.0f);
        instancePath.cubicTo(69.30905f, 34.878006f, 64.155495f, 51.76251f, 52.0f, 60.0f);
        instancePath.cubicTo(39.778633f, 68.93709f, 21.556034f, 67.74677f, 11.0f, 57.0f);
        instancePath.cubicTo(-0.24904436f, 47.641407f, -3.2110927f, 30.486835f, 4.0f, 18.0f);
        instancePath.cubicTo(8.276852f, 9.0211115f, 16.842775f, 2.5793939f, 26.0f, 1.0f);
        instancePath.lineTo(26.0f, 1.0f);
        instancePath.close();
        instancePath.moveTo(27.0f, 4.0f);
        instancePath.cubicTo(12.1093855f, 6.789598f, 1.3032824f, 21.511627f, 3.0f, 36.0f);
        instancePath.cubicTo(4.5091596f, 51.64438f, 19.529842f, 64.36022f, 35.0f, 63.0f);
        instancePath.cubicTo(51.368896f, 62.174374f, 64.971405f, 46.114883f, 63.0f, 30.0f);
        instancePath.cubicTo(61.405987f, 12.758258f, 43.229362f, -0.47659707f, 27.0f, 4.0f);
        instancePath.lineTo(27.0f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.0f, 19.0f);
        instancePath2.cubicTo(22.44149f, 17.715698f, 26.87168f, 21.241371f, 26.0f, 25.0f);
        instancePath2.cubicTo(25.251135f, 28.607508f, 20.48421f, 30.265413f, 18.0f, 28.0f);
        instancePath2.cubicTo(14.928059f, 25.732405f, 15.6331005f, 20.811155f, 19.0f, 19.0f);
        instancePath2.lineTo(19.0f, 19.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(45.0f, 19.0f);
        instancePath3.cubicTo(48.144283f, 18.20386f, 51.80879f, 21.377556f, 51.0f, 24.0f);
        instancePath3.cubicTo(50.233788f, 27.98074f, 44.67928f, 29.259693f, 42.0f, 27.0f);
        instancePath3.cubicTo(39.723274f, 24.219673f, 41.235275f, 19.795444f, 45.0f, 19.0f);
        instancePath3.lineTo(45.0f, 19.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(15.0f, 36.0f);
        instancePath4.cubicTo(27.003326f, 35.99499f, 38.996674f, 35.99499f, 51.0f, 36.0f);
        instancePath4.cubicTo(50.890244f, 43.420006f, 46.080933f, 50.524376f, 39.0f, 53.0f);
        instancePath4.cubicTo(31.752771f, 55.694836f, 22.90244f, 52.91922f, 18.0f, 46.0f);
        instancePath4.cubicTo(16.207317f, 43.470108f, 15.219512f, 39.732548f, 15.0f, 36.0f);
        instancePath4.lineTo(15.0f, 36.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
