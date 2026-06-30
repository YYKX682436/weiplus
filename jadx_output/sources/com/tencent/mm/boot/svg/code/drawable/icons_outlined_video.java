package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_video extends l95.c {
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
        instancePaint5.setStrokeWidth(1.8f);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(46.04274f, 3.4795737f);
        instancePath.cubicTo(49.117954f, 2.235599f, 51.747143f, 3.4289417f, 53.117264f, 6.8587112f);
        instancePath.cubicTo(56.804317f, 16.086164f, 48.173702f, 51.0f, 41.402466f, 51.0f);
        instancePath.cubicTo(39.21163f, 51.0f, 37.016033f, 49.17704f, 34.45811f, 45.900322f);
        instancePath.cubicTo(33.30526f, 44.423508f, 32.10182f, 42.663128f, 30.864515f, 40.676292f);
        instancePath.cubicTo(29.874704f, 39.08688f, 28.901754f, 37.41577f, 27.967052f, 35.724552f);
        instancePath.lineTo(27.000734f, 33.944283f);
        instancePath.lineTo(27.000734f, 33.944283f);
        instancePath.lineTo(26.954134f, 34.028904f);
        instancePath.cubicTo(25.745037f, 36.29262f, 24.455261f, 38.55708f, 23.135513f, 40.676292f);
        instancePath.cubicTo(21.898207f, 42.663128f, 20.69477f, 44.423508f, 19.541918f, 45.900322f);
        instancePath.cubicTo(16.983995f, 49.17704f, 14.788398f, 51.0f, 12.597565f, 51.0f);
        instancePath.cubicTo(5.8263264f, 51.0f, -2.8042889f, 16.086164f, 0.8827154f, 6.858838f);
        instancePath.cubicTo(2.252888f, 3.4289417f, 4.882074f, 2.235599f, 7.9572897f, 3.4795737f);
        instancePath.cubicTo(10.186936f, 4.3815017f, 12.647688f, 6.538056f, 15.397542f, 9.7686205f);
        instancePath.cubicTo(17.033962f, 11.691107f, 18.745804f, 13.96773f, 20.50776f, 16.52704f);
        instancePath.cubicTo(22.45862f, 19.360743f, 24.369904f, 22.390919f, 26.16422f, 25.420408f);
        instancePath.lineTo(27.001041f, 26.846125f);
        instancePath.lineTo(27.835808f, 25.420408f);
        instancePath.cubicTo(29.271261f, 22.996817f, 30.781574f, 20.572784f, 32.32712f, 18.24926f);
        instancePath.lineTo(33.49227f, 16.52704f);
        instancePath.cubicTo(35.254227f, 13.96773f, 36.96607f, 11.691107f, 38.602486f, 9.7686205f);
        instancePath.cubicTo(41.35234f, 6.538056f, 43.813095f, 4.3815017f, 46.04274f, 3.4795737f);
        instancePath.close();
        instancePath.moveTo(6.6820955f, 6.5803556f);
        instancePath.cubicTo(5.3834834f, 6.055046f, 4.7143855f, 6.358738f, 4.0218015f, 8.092455f);
        instancePath.cubicTo(2.8115566f, 11.121289f, 3.3197682f, 18.753698f, 5.1138964f, 27.318731f);
        instancePath.lineTo(5.533583f, 29.235931f);
        instancePath.lineTo(5.9945498f, 31.174883f);
        instancePath.cubicTo(8.2591505f, 40.33598f, 11.517268f, 47.65122f, 12.597565f, 47.65122f);
        instancePath.cubicTo(13.336971f, 47.65122f, 14.950983f, 46.31114f, 16.872042f, 43.850246f);
        instancePath.cubicTo(17.943945f, 42.477127f, 19.083265f, 40.810535f, 20.262747f, 38.916557f);
        instancePath.cubicTo(21.220139f, 37.379204f, 22.165087f, 35.756042f, 23.07415f, 34.11112f);
        instancePath.lineTo(24.17312f, 32.08025f);
        instancePath.lineTo(24.17312f, 32.08025f);
        instancePath.lineTo(25.095085f, 30.304522f);
        instancePath.lineTo(24.131172f, 28.616598f);
        instancePath.lineTo(23.252825f, 27.116549f);
        instancePath.cubicTo(21.494541f, 24.147898f, 19.622498f, 21.179934f, 17.719234f, 18.415369f);
        instancePath.cubicTo(16.017447f, 15.943455f, 14.371949f, 13.755064f, 12.81746f, 11.92883f);
        instancePath.cubicTo(10.39332f, 9.080919f, 8.275521f, 7.224922f, 6.6820955f, 6.5803556f);
        instancePath.close();
        instancePath.moveTo(49.978176f, 8.092328f);
        instancePath.cubicTo(49.285645f, 6.358738f, 48.616547f, 6.055046f, 47.317932f, 6.5803556f);
        instancePath.cubicTo(45.724506f, 7.224922f, 43.60671f, 9.080919f, 41.18257f, 11.92883f);
        instancePath.cubicTo(39.62808f, 13.755064f, 37.982582f, 15.943455f, 36.280792f, 18.415369f);
        instancePath.cubicTo(34.758183f, 20.62702f, 33.255554f, 22.968847f, 31.815165f, 25.337063f);
        instancePath.lineTo(30.296595f, 27.881742f);
        instancePath.lineTo(28.90213f, 30.304522f);
        instancePath.lineTo(29.380444f, 31.22998f);
        instancePath.lineTo(30.029644f, 32.461315f);
        instancePath.cubicTo(31.20636f, 34.664402f, 32.46076f, 36.866753f, 33.73728f, 38.916557f);
        instancePath.cubicTo(34.916763f, 40.810535f, 36.056084f, 42.477127f, 37.127987f, 43.850246f);
        instancePath.cubicTo(39.049046f, 46.31114f, 40.66306f, 47.65122f, 41.402466f, 47.65122f);
        instancePath.cubicTo(42.48276f, 47.65122f, 45.74088f, 40.33598f, 48.005478f, 31.174883f);
        instancePath.lineTo(48.466446f, 29.235931f);
        instancePath.cubicTo(50.595543f, 19.909685f, 51.27812f, 11.345639f, 49.978176f, 8.092328f);
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
