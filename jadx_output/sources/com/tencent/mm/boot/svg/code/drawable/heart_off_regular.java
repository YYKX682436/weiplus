package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class heart_off_regular extends l95.c {
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
                instancePath.moveTo(4.21956f, 6.26445f);
                instancePath.cubicTo(5.99981f, 4.48421f, 8.81903f, 4.31097f, 10.7979f, 5.83179f);
                instancePath.lineTo(10.987f, 5.98231f);
                instancePath.cubicTo(11.0143f, 6.00516f, 11.0394f, 6.02696f, 11.0625f, 6.04782f);
                instancePath.lineTo(11.1253f, 6.10767f);
                instancePath.lineTo(10.2711f, 6.95048f);
                instancePath.lineTo(10.1744f, 6.86796f);
                instancePath.lineTo(10.0666f, 6.78325f);
                instancePath.cubicTo(8.56404f, 5.62846f, 6.42093f, 5.76015f, 5.06809f, 7.11298f);
                instancePath.cubicTo(3.70393f, 8.47715f, 3.58626f, 10.6368f, 4.74133f, 12.1193f);
                instancePath.lineTo(4.87491f, 12.2811f);
                instancePath.lineTo(5.01375f, 12.4327f);
                instancePath.lineTo(11.997f, 19.417f);
                instancePath.lineTo(18.9687f, 12.4451f);
                instancePath.cubicTo(20.3635f, 11.0076f, 20.3949f, 8.74377f, 19.0741f, 7.26801f);
                instancePath.lineTo(18.9274f, 7.11298f);
                instancePath.cubicTo(17.5473f, 5.73288f, 15.3598f, 5.63174f, 13.871f, 6.82788f);
                instancePath.lineTo(13.7085f, 6.96612f);
                instancePath.lineTo(13.5463f, 7.12003f);
                instancePath.lineTo(13.2886f, 7.37324f);
                instancePath.lineTo(12.4215f, 8.20083f);
                instancePath.lineTo(11.755f, 8.86199f);
                instancePath.lineTo(13.6788f, 11.0525f);
                instancePath.cubicTo(13.9083f, 11.314f, 13.9079f, 11.6984f, 13.6938f, 11.9585f);
                instancePath.lineTo(13.6145f, 12.0403f);
                instancePath.lineTo(11.785f, 13.568f);
                instancePath.lineTo(12.7748f, 16.15f);
                instancePath.lineTo(11.6543f, 16.5794f);
                instancePath.lineTo(10.5369f, 13.6639f);
                instancePath.cubicTo(10.4433f, 13.4195f, 10.4946f, 13.1465f, 10.6628f, 12.9536f);
                instancePath.lineTo(10.7419f, 12.8761f);
                instancePath.lineTo(12.438f, 11.459f);
                instancePath.lineTo(10.5439f, 9.30001f);
                instancePath.cubicTo(10.3243f, 9.04981f, 10.314f, 8.68471f, 10.5054f, 8.42419f);
                instancePath.lineTo(10.5767f, 8.34153f);
                instancePath.lineTo(11.5844f, 7.34106f);
                instancePath.lineTo(12.4537f, 6.5114f);
                instancePath.lineTo(12.7125f, 6.25703f);
                instancePath.lineTo(12.8939f, 6.08514f);
                instancePath.cubicTo(14.8672f, 4.30776f, 17.8926f, 4.38111f, 19.7759f, 6.26445f);
                instancePath.cubicTo(21.6491f, 8.1376f, 21.7279f, 11.133f, 19.9917f, 13.1053f);
                instancePath.lineTo(19.8236f, 13.2871f);
                instancePath.lineTo(12.6577f, 20.4489f);
                instancePath.lineTo(12.5401f, 20.5396f);
                instancePath.cubicTo(12.2207f, 20.7459f, 11.8127f, 20.7522f, 11.4637f, 20.5394f);
                instancePath.lineTo(11.3498f, 20.4604f);
                instancePath.lineTo(11.2636f, 20.3812f);
                instancePath.lineTo(4.14803f, 13.2633f);
                instancePath.lineTo(3.98167f, 13.0823f);
                instancePath.cubicTo(2.26048f, 11.1123f, 2.35802f, 8.126f, 4.21956f, 6.26445f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
