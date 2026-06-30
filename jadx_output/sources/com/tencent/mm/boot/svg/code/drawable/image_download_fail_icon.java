package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class image_download_fail_icon extends l95.c {
    private final int width = 240;
    private final int height = 175;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 240;
        }
        if (i17 == 1) {
            return 175;
        }
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-7829368);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(203.52f, 57.660694f);
            instancePath.lineTo(203.52f, 15.384615f);
            instancePath.lineTo(15.36f, 15.384615f);
            instancePath.lineTo(15.36f, 105.37835f);
            instancePath.lineTo(74.236595f, 50.650925f);
            instancePath.lineTo(125.95681f, 97.89139f);
            instancePath.cubicTo(122.740204f, 105.88419f, 120.96f, 114.66317f, 120.96f, 123.90788f);
            instancePath.cubicTo(120.96f, 141.31677f, 127.86343f, 157.30098f, 139.04478f, 169.23077f);
            instancePath.lineTo(11.193079f, 169.23077f);
            instancePath.cubicTo(5.0091143f, 169.23077f, 0.0f, 164.20079f, 0.0f, 157.996f);
            instancePath.lineTo(0.0f, 11.234769f);
            instancePath.cubicTo(0.0f, 5.018827f, 5.0113125f, 0.0f, 11.193079f, 0.0f);
            instancePath.lineTo(207.68692f, 0.0f);
            instancePath.cubicTo(213.87088f, 0.0f, 218.88f, 5.0299807f, 218.88f, 11.234769f);
            instancePath.lineTo(218.88f, 63.36721f);
            instancePath.cubicTo(214.07797f, 60.88269f, 208.93094f, 58.95344f, 203.52f, 57.660694f);
            instancePath.close();
            instancePath.moveTo(240.0f, 123.71794f);
            instancePath.cubicTo(240.0f, 151.75385f, 216.79105f, 175.0f, 187.52f, 175.0f);
            instancePath.cubicTo(159.52896f, 175.0f, 136.32f, 151.75385f, 136.32f, 123.71794f);
            instancePath.cubicTo(136.32f, 94.4f, 159.52896f, 71.15385f, 187.52f, 71.15385f);
            instancePath.cubicTo(216.79105f, 71.15385f, 240.0f, 94.4f, 240.0f, 123.71794f);
            instancePath.close();
            instancePath.moveTo(185.67625f, 92.14744f);
            instancePath.cubicTo(185.58711f, 92.14744f, 185.49799f, 92.15041f, 185.40904f, 92.15637f);
            instancePath.cubicTo(183.20485f, 92.30395f, 181.53761f, 94.210434f, 181.68518f, 96.41464f);
            instancePath.lineTo(183.95256f, 130.28104f);
            instancePath.cubicTo(184.02289f, 131.33139f, 184.89539f, 132.14743f, 185.9481f, 132.14743f);
            instancePath.lineTo(191.13371f, 132.14743f);
            instancePath.cubicTo(192.18643f, 132.14743f, 193.05893f, 131.33139f, 193.12926f, 130.28104f);
            instancePath.lineTo(195.39664f, 96.41464f);
            instancePath.cubicTo(195.40259f, 96.3257f, 195.40556f, 96.23658f, 195.40556f, 96.14744f);
            instancePath.cubicTo(195.40556f, 93.93829f, 193.6147f, 92.14744f, 191.40556f, 92.14744f);
            instancePath.lineTo(185.67625f, 92.14744f);
            instancePath.close();
            instancePath.moveTo(188.16f, 155.76923f);
            instancePath.cubicTo(192.40155f, 155.76923f, 195.84f, 152.32527f, 195.84f, 148.07692f);
            instancePath.cubicTo(195.84f, 143.82858f, 192.40155f, 140.38461f, 188.16f, 140.38461f);
            instancePath.cubicTo(183.91846f, 140.38461f, 180.48f, 143.82858f, 180.48f, 148.07692f);
            instancePath.cubicTo(180.48f, 152.32527f, 183.91846f, 155.76923f, 188.16f, 155.76923f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
