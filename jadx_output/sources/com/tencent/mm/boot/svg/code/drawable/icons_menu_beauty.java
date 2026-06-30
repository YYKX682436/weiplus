package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_menu_beauty extends l95.c {
    private final int width = 30;
    private final int height = 30;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 30;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(13.893f, 3.75f);
                instancePath.cubicTo(16.0357f, 3.75f, 18.0928f, 4.34018f, 19.877f, 5.4349f);
                instancePath.lineTo(20.2301f, 5.66055f);
                instancePath.lineTo(18.1452f, 6.61259f);
                instancePath.cubicTo(16.8394f, 5.96509f, 15.3925f, 5.62075f, 13.893f, 5.62075f);
                instancePath.cubicTo(8.59788f, 5.62075f, 4.30538f, 9.91326f, 4.30538f, 15.2083f);
                instancePath.cubicTo(4.30538f, 20.5034f, 8.59788f, 24.7959f, 13.893f, 24.7959f);
                instancePath.cubicTo(19.188f, 24.7959f, 23.4805f, 20.5034f, 23.4805f, 15.2083f);
                instancePath.cubicTo(23.4805f, 14.9689f, 23.4718f, 14.7307f, 23.4544f, 14.494f);
                instancePath.lineTo(25.0722f, 12.6845f);
                instancePath.cubicTo(25.2571f, 13.5068f, 25.3513f, 14.3518f, 25.3513f, 15.2083f);
                instancePath.cubicTo(25.3513f, 21.5366f, 20.2212f, 26.6667f, 13.893f, 26.6667f);
                instancePath.cubicTo(7.5647f, 26.6667f, 2.43463f, 21.5366f, 2.43463f, 15.2083f);
                instancePath.cubicTo(2.43463f, 8.88007f, 7.5647f, 3.75f, 13.893f, 3.75f);
                instancePath.close();
                instancePath.moveTo(17.359f, 17.8194f);
                instancePath.cubicTo(17.0985f, 19.4994f, 15.6459f, 20.8206f, 13.893f, 20.8206f);
                instancePath.cubicTo(12.1277f, 20.8206f, 10.6671f, 19.5167f, 10.4216f, 17.8194f);
                instancePath.lineTo(17.359f, 17.8194f);
                instancePath.close();
                instancePath.moveTo(17.9852f, 11.4668f);
                instancePath.cubicTo(18.9538f, 11.4668f, 19.739f, 12.2521f, 19.739f, 13.2207f);
                instancePath.cubicTo(19.739f, 14.1893f, 18.9538f, 14.9745f, 17.9852f, 14.9745f);
                instancePath.cubicTo(17.0166f, 14.9745f, 16.2314f, 14.1893f, 16.2314f, 13.2207f);
                instancePath.cubicTo(16.2314f, 12.2521f, 17.0166f, 11.4668f, 17.9852f, 11.4668f);
                instancePath.close();
                instancePath.moveTo(9.8007f, 11.4668f);
                instancePath.cubicTo(10.7693f, 11.4668f, 11.5545f, 12.2521f, 11.5545f, 13.2207f);
                instancePath.cubicTo(11.5545f, 14.1893f, 10.7693f, 14.9745f, 9.8007f, 14.9745f);
                instancePath.cubicTo(8.83209f, 14.9745f, 8.04687f, 14.1893f, 8.04687f, 13.2207f);
                instancePath.cubicTo(8.04687f, 12.2521f, 8.83209f, 11.4668f, 9.8007f, 11.4668f);
                instancePath.close();
                instancePath.moveTo(22.8083f, 4.74974f);
                instancePath.cubicTo(23.3041f, 5.97407f, 23.7718f, 6.82662f, 24.2114f, 7.30741f);
                instancePath.cubicTo(24.6509f, 7.78819f, 25.4304f, 8.29972f, 26.5498f, 8.84201f);
                instancePath.cubicTo(25.403f, 9.41426f, 24.6235f, 9.92579f, 24.2114f, 10.3766f);
                instancePath.cubicTo(23.7992f, 10.8274f, 23.3315f, 11.68f, 22.8083f, 12.9343f);
                instancePath.cubicTo(22.2783f, 11.6726f, 21.8106f, 10.82f, 21.4052f, 10.3766f);
                instancePath.cubicTo(20.9998f, 9.9332f, 20.2204f, 9.42167f, 19.0668f, 8.84201f);
                instancePath.cubicTo(20.2134f, 8.26997f, 20.9929f, 7.75844f, 21.4052f, 7.30741f);
                instancePath.cubicTo(21.8176f, 6.85638f, 22.2853f, 6.00382f, 22.8083f, 4.74974f);
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
