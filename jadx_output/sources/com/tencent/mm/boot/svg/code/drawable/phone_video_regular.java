package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class phone_video_regular extends l95.c {
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
        instancePath.moveTo(9.0404f, 8.43188f);
        instancePath.cubicTo(9.29023f, 7.96954f, 9.33858f, 7.57743f, 9.1685f, 7.11574f);
        instancePath.lineTo(7.86987f, 3.70605f);
        instancePath.cubicTo(7.44142f, 2.70185f, 6.33379f, 2.15284f, 5.2875f, 2.44226f);
        instancePath.cubicTo(2.80803f, 3.21613f, 1.48585f, 5.84712f, 2.00084f, 8.33135f);
        instancePath.cubicTo(2.7764f, 11.6684f, 4.46232f, 14.6769f, 6.88405f, 17.0786f);
        instancePath.cubicTo(9.3014f, 19.4758f, 12.322f, 21.1395f, 15.6177f, 21.8783f);
        instancePath.cubicTo(18.0103f, 22.5651f, 20.625f, 21.088f, 21.461f, 18.7819f);
        instancePath.cubicTo(21.8361f, 17.6912f, 21.3813f, 16.4601f, 20.2722f, 15.9963f);
        instancePath.lineTo(16.8226f, 14.7144f);
        instancePath.cubicTo(16.3243f, 14.5497f, 15.9563f, 14.5961f, 15.5088f, 14.8426f);
        instancePath.lineTo(12.8807f, 16.2757f);
        instancePath.cubicTo(12.7935f, 16.3231f, 12.7036f, 16.3371f, 12.6162f, 16.2838f);
        instancePath.cubicTo(11.468f, 15.6136f, 10.5395f, 14.9159f, 9.78292f, 14.1529f);
        instancePath.cubicTo(9.013f, 13.3893f, 8.30534f, 12.4587f, 7.64143f, 11.3423f);
        instancePath.cubicTo(7.58665f, 11.2537f, 7.5808f, 11.1643f, 7.63041f, 11.0713f);
        instancePath.lineTo(9.0404f, 8.43188f);
        instancePath.close();
        instancePath.moveTo(6.61351f, 11.9615f);
        instancePath.cubicTo(6.50334f, 11.7797f, 6.41118f, 11.544f, 6.39809f, 11.2646f);
        instancePath.cubicTo(6.38455f, 10.9755f, 6.45935f, 10.7171f, 6.57143f, 10.5068f);
        instancePath.lineTo(6.57197f, 10.5058f);
        instancePath.lineTo(7.98465f, 7.86141f);
        instancePath.cubicTo(8.05808f, 7.72552f, 8.06678f, 7.66468f, 8.06826f, 7.65027f);
        instancePath.cubicTo(8.06908f, 7.64311f, 8.07244f, 7.61343f, 8.04423f, 7.53535f);
        instancePath.lineTo(6.75847f, 4.15945f);
        instancePath.cubicTo(6.55672f, 3.70994f, 6.06503f, 3.48126f, 5.62379f, 3.59447f);
        instancePath.cubicTo(3.82351f, 4.16909f, 2.77643f, 6.12874f, 3.1731f, 8.07435f);
        instancePath.cubicTo(3.89879f, 11.1845f, 5.47057f, 13.9868f, 7.72904f, 16.2265f);
        instancePath.cubicTo(9.9883f, 18.467f, 12.8078f, 20.0186f, 15.8802f, 20.7073f);
        instancePath.lineTo(15.9147f, 20.7151f);
        instancePath.lineTo(15.9488f, 20.7249f);
        instancePath.cubicTo(17.6819f, 21.2224f, 19.6864f, 20.1398f, 20.3293f, 18.3827f);
        instancePath.cubicTo(20.5147f, 17.8304f, 20.2725f, 17.3082f, 19.8269f, 17.111f);
        instancePath.lineTo(16.4284f, 15.8481f);
        instancePath.cubicTo(16.3153f, 15.8125f, 16.2751f, 15.8173f, 16.2708f, 15.8178f);
        instancePath.cubicTo(16.2643f, 15.8185f, 16.2152f, 15.8235f, 16.0879f, 15.8936f);
        instancePath.lineTo(16.0833f, 15.8962f);
        instancePath.lineTo(13.4534f, 17.3303f);
        instancePath.cubicTo(13.1444f, 17.4981f, 12.5796f, 17.6592f, 12.0047f, 17.3163f);
        instancePath.cubicTo(10.7916f, 16.6077f, 9.77764f, 15.8511f, 8.93432f, 15.0013f);
        instancePath.cubicTo(8.08205f, 14.1554f, 7.3168f, 13.1433f, 6.61351f, 11.9615f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.7f, 4.0f);
        instancePath2.cubicTo(12.3134f, 4.0f, 12.0f, 4.3134f, 12.0f, 4.7f);
        instancePath2.lineTo(12.0f, 9.8f);
        instancePath2.cubicTo(12.0f, 10.1866f, 12.3134f, 10.5f, 12.7f, 10.5f);
        instancePath2.lineTo(19.05f, 10.5f);
        instancePath2.cubicTo(19.4366f, 10.5f, 19.75f, 10.1866f, 19.75f, 9.8f);
        instancePath2.lineTo(19.75f, 8.78539f);
        instancePath2.lineTo(21.4722f, 9.70223f);
        instancePath2.cubicTo(21.9385f, 9.95045f, 22.5011f, 9.61254f, 22.5011f, 9.08433f);
        instancePath2.lineTo(22.5011f, 5.41567f);
        instancePath2.cubicTo(22.5011f, 4.88746f, 21.9385f, 4.54955f, 21.4722f, 4.79777f);
        instancePath2.lineTo(19.75f, 5.71461f);
        instancePath2.lineTo(19.75f, 4.7f);
        instancePath2.cubicTo(19.75f, 4.3134f, 19.4366f, 4.0f, 19.05f, 4.0f);
        instancePath2.lineTo(12.7f, 4.0f);
        instancePath2.close();
        instancePath2.moveTo(13.1f, 5.1f);
        instancePath2.lineTo(13.1f, 9.4f);
        instancePath2.lineTo(18.65f, 9.4f);
        instancePath2.lineTo(18.65f, 5.1f);
        instancePath2.lineTo(13.1f, 5.1f);
        instancePath2.close();
        instancePath2.moveTo(19.7504f, 6.96057f);
        instancePath2.lineTo(21.4011f, 6.08176f);
        instancePath2.lineTo(21.4011f, 8.41824f);
        instancePath2.lineTo(19.7504f, 7.53943f);
        instancePath2.lineTo(19.7504f, 6.96057f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
