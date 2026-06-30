package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class weixin_store_regular extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
                android.graphics.Canvas canvas = (android.graphics.Canvas) objArr[0];
                android.os.Looper looper = (android.os.Looper) objArr[1];
                l95.c.instanceMatrix(looper);
                l95.c.instanceMatrixArray(looper);
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.95996f, 15.1055f);
                instancePath.cubicTo(5.28796f, 15.0575f, 5.59267f, 15.2882f, 5.63867f, 15.6162f);
                instancePath.cubicTo(6.00285f, 18.172f, 8.73627f, 20.0995f, 11.998f, 20.0996f);
                instancePath.cubicTo(15.2599f, 20.0996f, 17.9943f, 18.1721f, 18.3584f, 15.6162f);
                instancePath.cubicTo(18.4044f, 15.2883f, 18.7082f, 15.0596f, 19.0361f, 15.1055f);
                instancePath.cubicTo(19.3641f, 15.1515f, 19.5919f, 15.4562f, 19.5459f, 15.7842f);
                instancePath.cubicTo(19.0977f, 18.928f, 15.8539f, 21.2998f, 11.998f, 21.2998f);
                instancePath.cubicTo(8.14222f, 21.2997f, 4.89631f, 18.928f, 4.4502f, 15.7842f);
                instancePath.cubicTo(4.4042f, 15.4562f, 4.63207f, 15.1516f, 4.95996f, 15.1055f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16777216);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(16.7002f, 2.7002f);
                instancePath2.cubicTo(18.0441f, 2.70027f, 19.2683f, 3.49188f, 19.8223f, 4.71582f);
                instancePath2.lineTo(19.8604f, 4.80371f);
                instancePath2.lineTo(21.6943f, 8.83789f);
                instancePath2.cubicTo(21.8962f, 9.23374f, 21.998f, 9.65971f, 21.998f, 10.1035f);
                instancePath2.cubicTo(21.998f, 11.5895f, 20.8217f, 12.8641f, 19.1377f, 13.2021f);
                instancePath2.cubicTo(18.8638f, 13.2601f, 18.5798f, 13.2881f, 18.2959f, 13.2881f);
                instancePath2.cubicTo(17.5561f, 13.2881f, 16.8442f, 13.1f, 16.2363f, 12.7461f);
                instancePath2.cubicTo(15.8603f, 12.5381f, 15.5175f, 12.2438f, 15.2275f, 11.8818f);
                instancePath2.cubicTo(14.4855f, 12.7577f, 13.2959f, 13.2881f, 12.0f, 13.2881f);
                instancePath2.cubicTo(10.7041f, 13.2881f, 9.51633f, 12.7579f, 8.77832f, 11.876f);
                instancePath2.cubicTo(8.51032f, 12.224f, 8.15395f, 12.528f, 7.75195f, 12.752f);
                instancePath2.cubicTo(6.93204f, 13.2299f, 5.88815f, 13.4141f, 4.86426f, 13.2002f);
                instancePath2.cubicTo(3.18226f, 12.8762f, 2.0f, 11.6015f, 2.0f, 10.1035f);
                instancePath2.cubicTo(2.00007f, 9.69166f, 2.09429f, 9.28169f, 2.28223f, 8.88184f);
                instancePath2.lineTo(2.30176f, 8.8418f);
                instancePath2.lineTo(4.16602f, 4.75195f);
                instancePath2.cubicTo(4.16602f, 4.75195f, 4.17181f, 4.73547f, 4.17578f, 4.72754f);
                instancePath2.cubicTo(4.72781f, 3.49575f, 5.95398f, 2.70027f, 7.2998f, 2.7002f);
                instancePath2.lineTo(16.7002f, 2.7002f);
                instancePath2.close();
                instancePath2.moveTo(7.29785f, 3.89844f);
                instancePath2.cubicTo(6.42791f, 3.8985f, 5.63635f, 4.41015f, 5.27637f, 5.2041f);
                instancePath2.lineTo(5.25f, 5.26562f);
                instancePath2.lineTo(3.3877f, 9.34375f);
                instancePath2.cubicTo(3.3877f, 9.34375f, 3.38188f, 9.3563f, 3.37988f, 9.3623f);
                instancePath2.lineTo(3.3623f, 9.40039f);
                instancePath2.cubicTo(3.25643f, 9.62621f, 3.20025f, 9.8658f, 3.2002f, 10.0996f);
                instancePath2.cubicTo(3.2002f, 10.9995f, 3.99984f, 11.8074f, 5.09961f, 12.0195f);
                instancePath2.cubicTo(5.30361f, 12.0615f, 5.5082f, 12.084f, 5.7002f, 12.084f);
                instancePath2.cubicTo(6.22812f, 12.084f, 6.73235f, 11.954f, 7.1543f, 11.7061f);
                instancePath2.cubicTo(7.42622f, 11.5541f, 7.65421f, 11.3597f, 7.82617f, 11.1357f);
                instancePath2.cubicTo(7.98608f, 10.9318f, 8.09641f, 10.7074f, 8.15039f, 10.4795f);
                instancePath2.cubicTo(8.21257f, 10.2178f, 8.43823f, 10.0296f, 8.70605f, 10.0176f);
                instancePath2.cubicTo(8.97194f, 10.0076f, 9.21768f, 10.1739f, 9.30176f, 10.4277f);
                instancePath2.cubicTo(9.34376f, 10.5517f, 9.39777f, 10.6703f, 9.46777f, 10.7803f);
                instancePath2.cubicTo(9.93181f, 11.5802f, 10.9202f, 12.0859f, 11.9941f, 12.0859f);
                instancePath2.cubicTo(13.0681f, 12.0859f, 14.0584f, 11.5818f, 14.5244f, 10.7998f);
                instancePath2.cubicTo(14.6003f, 10.6799f, 14.6478f, 10.5717f, 14.6777f, 10.4678f);
                instancePath2.cubicTo(14.7498f, 10.2079f, 14.9879f, 10.0284f, 15.2559f, 10.0283f);
                instancePath2.lineTo(15.2598f, 10.0303f);
                instancePath2.lineTo(15.2725f, 10.0303f);
                instancePath2.cubicTo(15.5463f, 10.0365f, 15.7818f, 10.2263f, 15.8438f, 10.4922f);
                instancePath2.cubicTo(15.8958f, 10.7121f, 16.0041f, 10.9279f, 16.1641f, 11.1318f);
                instancePath2.cubicTo(16.3541f, 11.3698f, 16.5801f, 11.5621f, 16.8301f, 11.7021f);
                instancePath2.cubicTo(17.264f, 11.9561f, 17.768f, 12.0859f, 18.2959f, 12.0859f);
                instancePath2.cubicTo(18.4959f, 12.0859f, 18.6985f, 12.0644f, 18.8965f, 12.0244f);
                instancePath2.cubicTo(20.0183f, 11.8003f, 20.7979f, 11.0095f, 20.7979f, 10.1016f);
                instancePath2.cubicTo(20.7978f, 9.84576f, 20.738f, 9.59992f, 20.6201f, 9.37207f);
                instancePath2.cubicTo(20.6161f, 9.36407f, 20.6124f, 9.3537f, 20.6084f, 9.3457f);
                instancePath2.lineTo(18.7256f, 5.20605f);
                instancePath2.cubicTo(18.3676f, 4.41417f, 17.5721f, 3.89853f, 16.6982f, 3.89844f);
                instancePath2.lineTo(7.29785f, 3.89844f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
