package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_music_tips_bar extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(21.1629f, 5.69624f);
                instancePath.cubicTo(21.1677f, 5.74245f, 21.1661f, 5.7891f, 21.158f, 5.83486f);
                instancePath.lineTo(18.9289f, 18.477f);
                instancePath.cubicTo(18.6891f, 19.8367f, 17.3924f, 20.7446f, 16.0327f, 20.5049f);
                instancePath.cubicTo(14.673f, 20.2651f, 13.7651f, 18.9685f, 14.0048f, 17.6087f);
                instancePath.cubicTo(14.235f, 16.3034f, 15.4392f, 15.4144f, 16.7381f, 15.5575f);
                instancePath.lineTo(16.9013f, 15.5809f);
                instancePath.cubicTo(17.4063f, 15.6701f, 17.8897f, 15.3635f, 18.0331f, 14.8838f);
                instancePath.lineTo(18.0601f, 14.7699f);
                instancePath.lineTo(19.0268f, 9.2833f);
                instancePath.lineTo(11.2688f, 10.0904f);
                instancePath.lineTo(9.71829f, 18.8837f);
                instancePath.cubicTo(9.48812f, 20.1891f, 8.28392f, 21.078f, 6.98495f, 20.935f);
                instancePath.lineTo(6.82215f, 20.9116f);
                instancePath.cubicTo(5.46241f, 20.6719f, 4.55449f, 19.3752f, 4.79425f, 18.0155f);
                instancePath.cubicTo(5.02441f, 16.7102f, 6.22861f, 15.8212f, 7.52758f, 15.9643f);
                instancePath.lineTo(7.69039f, 15.9876f);
                instancePath.cubicTo(7.69062f, 15.9876f, 7.69084f, 15.9877f, 7.69107f, 15.9877f);
                instancePath.cubicTo(8.23496f, 16.0837f, 8.75363f, 15.7205f, 8.84956f, 15.1766f);
                instancePath.cubicTo(8.84972f, 15.1757f, 8.84989f, 15.1747f, 8.85006f, 15.1738f);
                instancePath.lineTo(10.2807f, 7.05609f);
                instancePath.cubicTo(10.3582f, 6.61636f, 10.7179f, 6.28129f, 11.162f, 6.23504f);
                instancePath.lineTo(20.6138f, 5.25072f);
                instancePath.cubicTo(20.8885f, 5.22212f, 21.1343f, 5.42158f, 21.1629f, 5.69624f);
                instancePath.close();
                instancePath.moveTo(7.99686f, 2.74951f);
                instancePath.cubicTo(8.23337f, 3.74139f, 7.62101f, 4.7372f, 6.62913f, 4.97371f);
                instancePath.cubicTo(6.58384f, 4.98451f, 6.53815f, 4.99359f, 6.49217f, 5.00093f);
                instancePath.lineTo(5.56281f, 5.14941f);
                instancePath.lineTo(6.94309f, 10.3007f);
                instancePath.cubicTo(7.22897f, 11.3676f, 6.59581f, 12.4643f, 5.52888f, 12.7502f);
                instancePath.cubicTo(4.46194f, 13.0361f, 3.36527f, 12.4029f, 3.07939f, 11.336f);
                instancePath.cubicTo(2.8065f, 10.3175f, 3.37101f, 9.27199f, 4.35084f, 8.9304f);
                instancePath.lineTo(4.4936f, 8.88647f);
                instancePath.cubicTo(4.73114f, 8.82283f, 4.88283f, 8.59873f, 4.86332f, 8.36203f);
                instancePath.lineTo(4.84778f, 8.27288f);
                instancePath.lineTo(3.70714f, 4.01907f);
                instancePath.cubicTo(3.63473f, 3.75259f, 3.79206f, 3.47787f, 4.05854f, 3.40547f);
                instancePath.cubicTo(4.08639f, 3.3979f, 4.11484f, 3.39276f, 4.14355f, 3.38989f);
                instancePath.cubicTo(5.1342f, 3.2957f, 5.86573f, 3.21166f, 6.33815f, 3.13778f);
                instancePath.cubicTo(6.9f, 3.04992f, 7.4529f, 2.92049f, 7.99686f, 2.74951f);
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
