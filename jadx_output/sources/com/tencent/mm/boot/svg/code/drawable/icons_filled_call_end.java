package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_call_end extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -0.70710677f, -0.70710677f, 74.18376f, 0.70710677f, -0.70710677f, 39.000004f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(41.456177f, 37.89717f);
                instancePath.cubicTo(40.90096f, 37.712082f, 40.66962f, 37.804626f, 40.16067f, 38.082264f);
                instancePath.cubicTo(38.49502f, 39.007713f, 34.42343f, 41.22879f, 32.017494f, 42.47815f);
                instancePath.cubicTo(31.416008f, 42.802055f, 30.768255f, 42.98715f, 30.027967f, 42.98715f);
                instancePath.cubicTo(29.24141f, 42.98715f, 28.54739f, 42.755783f, 27.945904f, 42.385605f);
                instancePath.cubicTo(24.568336f, 40.395885f, 21.375841f, 38.082264f, 18.646027f, 35.305912f);
                instancePath.cubicTo(15.91621f, 32.575836f, 13.602808f, 29.383034f, 11.613281f, 26.005142f);
                instancePath.cubicTo(11.243137f, 25.403599f, 11.011797f, 24.663239f, 11.011797f, 23.922878f);
                instancePath.cubicTo(11.011797f, 23.228792f, 11.196869f, 22.534704f, 11.520745f, 21.933163f);
                instancePath.cubicTo(12.769983f, 19.48072f, 14.9908495f, 15.40874f, 15.91621f, 13.789203f);
                instancePath.cubicTo(16.193819f, 13.280206f, 16.286354f, 13.002571f, 16.101282f, 12.493573f);
                instancePath.lineTo(12.168498f, 2.0359898f);
                instancePath.cubicTo(11.65955f, 0.8329049f, 10.502849f, 0.046272494f, 9.114807f, 0.0f);
                instancePath.cubicTo(8.55959f, 0.0f, 7.911837f, 0.23136246f, 7.773033f, 0.27763495f);
                instancePath.cubicTo(3.2387638f, 1.9434447f, 0.0f, 6.2467866f, 0.0f, 11.3367605f);
                instancePath.cubicTo(0.0f, 12.771208f, 0.37014443f, 14.113111f, 0.41641247f, 14.437018f);
                instancePath.cubicTo(2.637279f, 24.154242f, 7.5879607f, 32.807198f, 14.389365f, 39.609253f);
                instancePath.cubicTo(21.19077f, 46.411312f, 29.842896f, 51.36247f, 39.559185f, 53.58355f);
                instancePath.cubicTo(39.883064f, 53.676094f, 41.224834f, 54.0f, 42.659145f, 54.0f);
                instancePath.cubicTo(47.74863f, 54.0f, 52.05156f, 50.760925f, 53.717213f, 46.226223f);
                instancePath.cubicTo(53.763477f, 46.087402f, 54.04109f, 45.43959f, 53.99482f, 44.88432f);
                instancePath.cubicTo(53.902283f, 43.496143f, 53.115726f, 42.339333f, 51.912758f, 41.830334f);
                instancePath.lineTo(41.456177f, 37.89717f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
