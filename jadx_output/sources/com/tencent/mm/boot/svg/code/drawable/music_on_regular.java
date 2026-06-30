package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class music_on_regular extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.18497f, 5.593624f);
                instancePath.cubicTo(21.188822f, 5.6305904f, 21.1875f, 5.6679134f, 21.181046f, 5.7045155f);
                instancePath.lineTo(18.92888f, 18.477184f);
                instancePath.cubicTo(18.689121f, 19.83692f, 17.392475f, 20.74484f, 16.03274f, 20.505083f);
                instancePath.cubicTo(14.673004f, 20.265326f, 13.765083f, 18.96868f, 14.004841f, 17.608944f);
                instancePath.cubicTo(14.244599f, 16.249208f, 15.541245f, 15.341287f, 16.90098f, 15.581044f);
                instancePath.cubicTo(16.941025f, 15.588105f, 16.983501f, 15.597667f, 17.028412f, 15.60973f);
                instancePath.cubicTo(17.455112f, 15.724352f, 17.893942f, 15.471366f, 18.008568f, 15.044666f);
                instancePath.cubicTo(18.014408f, 15.022923f, 18.01933f, 15.000944f, 18.023321f, 14.978787f);
                instancePath.lineTo(19.02683f, 9.283521f);
                instancePath.lineTo(11.268818f, 10.090618f);
                instancePath.lineTo(9.718313f, 18.883966f);
                instancePath.cubicTo(9.488146f, 20.189312f, 8.28395f, 21.078266f, 6.984976f, 20.935171f);
                instancePath.lineTo(6.8221736f, 20.911865f);
                instancePath.cubicTo(5.462438f, 20.672108f, 4.554517f, 19.375462f, 4.794275f, 18.015726f);
                instancePath.cubicTo(5.034033f, 16.65599f, 6.330679f, 15.748069f, 7.690415f, 15.987826f);
                instancePath.cubicTo(7.7303443f, 15.994867f, 7.772693f, 16.004395f, 7.817461f, 16.016409f);
                instancePath.cubicTo(8.244114f, 16.13121f, 8.683082f, 15.878462f, 8.797937f, 15.451824f);
                instancePath.cubicTo(8.804301f, 15.428186f, 8.809577f, 15.404268f, 8.813751f, 15.380148f);
                instancePath.lineTo(10.306957f, 6.9077296f);
                instancePath.cubicTo(10.3689575f, 6.555943f, 10.656663f, 6.287887f, 11.0119505f, 6.250887f);
                instancePath.lineTo(20.745691f, 5.237208f);
                instancePath.cubicTo(20.965416f, 5.2143254f, 21.162088f, 5.3738985f, 21.18497f, 5.593624f);
                instancePath.close();
                instancePath.moveTo(7.9968905f, 2.7497308f);
                instancePath.cubicTo(8.233397f, 3.7416131f, 7.6210427f, 4.7374187f, 6.6291604f, 4.9739246f);
                instancePath.cubicTo(6.5838647f, 4.984725f, 6.538177f, 4.993808f, 6.492194f, 5.001154f);
                instancePath.lineTo(5.562836f, 5.1496243f);
                instancePath.lineTo(6.9431186f, 10.300907f);
                instancePath.cubicTo(7.229002f, 11.367839f, 6.595837f, 12.464513f, 5.528905f, 12.750397f);
                instancePath.cubicTo(4.4619727f, 13.036281f, 3.3652987f, 12.403115f, 3.079415f, 11.336183f);
                instancePath.cubicTo(2.8065262f, 10.317748f, 3.3710349f, 9.272213f, 4.350872f, 8.930624f);
                instancePath.lineTo(4.4936285f, 8.886693f);
                instancePath.lineTo(4.4936285f, 8.886693f);
                instancePath.cubicTo(4.731164f, 8.823046f, 4.8828583f, 8.598946f, 4.863346f, 8.362249f);
                instancePath.lineTo(4.8478055f, 8.2731f);
                instancePath.lineTo(4.8478055f, 8.2731f);
                instancePath.lineTo(3.6762078f, 3.9038484f);
                instancePath.cubicTo(3.6186173f, 3.6905732f, 3.7448242f, 3.4709928f, 3.9580991f, 3.4134016f);
                instancePath.cubicTo(3.9800189f, 3.4074826f, 4.0024033f, 3.4034405f, 4.025008f, 3.4013119f);
                instancePath.cubicTo(5.076047f, 3.3025703f, 5.8471026f, 3.2148006f, 6.338175f, 3.1380024f);
                instancePath.cubicTo(6.9000273f, 3.0501351f, 7.452933f, 2.9207113f, 7.9968905f, 2.7497308f);
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
