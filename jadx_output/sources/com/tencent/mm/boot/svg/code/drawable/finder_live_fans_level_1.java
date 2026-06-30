package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_fans_level_1 extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(8.00256f, 12.0334f);
        instancePath.lineTo(4.71873f, 13.7384f);
        instancePath.cubicTo(4.37514f, 13.9167f, 3.95018f, 13.7863f, 3.76955f, 13.447f);
        instancePath.cubicTo(3.69762f, 13.3119f, 3.6728f, 13.1571f, 3.69893f, 13.0066f);
        instancePath.lineTo(4.32608f, 9.39547f);
        instancePath.lineTo(1.66941f, 6.83803f);
        instancePath.cubicTo(1.39144f, 6.57044f, 1.38575f, 6.13099f, 1.6567f, 5.85648f);
        instancePath.cubicTo(1.7646f, 5.74717f, 1.90597f, 5.67603f, 2.05894f, 5.65408f);
        instancePath.lineTo(5.73037f, 5.12721f);
        instancePath.lineTo(7.37229f, 1.84167f);
        instancePath.cubicTo(7.54408f, 1.49791f, 7.96553f, 1.35676f, 8.31362f, 1.52642f);
        instancePath.cubicTo(8.45223f, 1.59398f, 8.56442f, 1.70478f, 8.63283f, 1.84167f);
        instancePath.lineTo(10.2748f, 5.12721f);
        instancePath.lineTo(13.9462f, 5.65408f);
        instancePath.cubicTo(14.3303f, 5.7092f, 14.5965f, 6.06143f, 14.5407f, 6.44079f);
        instancePath.cubicTo(14.5184f, 6.59186f, 14.4464f, 6.73147f, 14.3357f, 6.83803f);
        instancePath.lineTo(11.679f, 9.39547f);
        instancePath.lineTo(12.3062f, 13.0066f);
        instancePath.cubicTo(12.3718f, 13.3845f, 12.1149f, 13.7433f, 11.7323f, 13.8081f);
        instancePath.cubicTo(11.5799f, 13.8339f, 11.4232f, 13.8094f, 11.2864f, 13.7384f);
        instancePath.lineTo(8.00256f, 12.0334f);
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
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 8.00261f, 1.45459f, 8.00261f, 13.8182f, new int[]{-337567, -1067520}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-15616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.4506f, 3.53f);
        instancePath2.lineTo(12.5276f, 3.21479f);
        instancePath2.cubicTo(12.4971f, 3.20441f, 12.4809f, 3.17134f, 12.4913f, 3.14093f);
        instancePath2.cubicTo(12.4971f, 3.12388f, 12.5105f, 3.11049f, 12.5276f, 3.10467f);
        instancePath2.lineTo(13.4506f, 2.78946f);
        instancePath2.lineTo(13.7658f, 1.86642f);
        instancePath2.cubicTo(13.7762f, 1.83601f, 13.8093f, 1.81978f, 13.8397f, 1.83016f);
        instancePath2.cubicTo(13.8567f, 1.83599f, 13.8701f, 1.84937f, 13.8759f, 1.86642f);
        instancePath2.lineTo(14.1911f, 2.78946f);
        instancePath2.lineTo(15.1142f, 3.10467f);
        instancePath2.cubicTo(15.1446f, 3.11506f, 15.1608f, 3.14812f, 15.1504f, 3.17853f);
        instancePath2.cubicTo(15.1446f, 3.19558f, 15.1312f, 3.20897f, 15.1142f, 3.21479f);
        instancePath2.lineTo(14.1911f, 3.53f);
        instancePath2.lineTo(13.8759f, 4.45304f);
        instancePath2.cubicTo(13.8655f, 4.48345f, 13.8325f, 4.49968f, 13.8021f, 4.4893f);
        instancePath2.cubicTo(13.785f, 4.48348f, 13.7716f, 4.47009f, 13.7658f, 4.45304f);
        instancePath2.lineTo(13.4506f, 3.53f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
