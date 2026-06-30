package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_time_limit extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.0f, 3.25f);
                instancePath.cubicTo(7.16751f, 3.25f, 3.25f, 7.16751f, 3.25f, 12.0f);
                instancePath.cubicTo(3.25f, 16.8325f, 7.16751f, 20.75f, 12.0f, 20.75f);
                instancePath.cubicTo(14.3163f, 20.75f, 16.4209f, 19.851f, 17.9867f, 18.3814f);
                instancePath.cubicTo(18.2041f, 18.1773f, 18.4111f, 17.9623f, 18.6068f, 17.7372f);
                instancePath.lineTo(19.7389f, 18.7212f);
                instancePath.cubicTo(19.5099f, 18.9847f, 19.2677f, 19.2363f, 19.0133f, 19.4751f);
                instancePath.cubicTo(17.1804f, 21.1953f, 14.7126f, 22.25f, 12.0f, 22.25f);
                instancePath.cubicTo(6.33908f, 22.25f, 1.75f, 17.6609f, 1.75f, 12.0f);
                instancePath.cubicTo(1.75f, 6.33908f, 6.33908f, 1.75f, 12.0f, 1.75f);
                instancePath.cubicTo(12.3386f, 1.75f, 12.6736f, 1.76644f, 13.0042f, 1.79862f);
                instancePath.lineTo(12.8589f, 3.29156f);
                instancePath.cubicTo(12.5765f, 3.26408f, 12.29f, 3.25f, 12.0f, 3.25f);
                instancePath.close();
                instancePath.moveTo(16.1249f, 4.2812f);
                instancePath.cubicTo(15.624f, 4.0129f, 15.0941f, 3.79204f, 14.5412f, 3.62451f);
                instancePath.lineTo(14.9761f, 2.18895f);
                instancePath.cubicTo(15.6248f, 2.38547f, 16.2461f, 2.64449f, 16.8332f, 2.95892f);
                instancePath.lineTo(16.1249f, 4.2812f);
                instancePath.close();
                instancePath.moveTo(18.7644f, 6.44929f);
                instancePath.cubicTo(18.4004f, 6.00627f, 17.9937f, 5.5996f, 17.5507f, 5.23561f);
                instancePath.lineTo(18.503f, 4.07663f);
                instancePath.cubicTo(19.0215f, 4.50264f, 19.4974f, 4.97855f, 19.9234f, 5.49705f);
                instancePath.lineTo(18.7644f, 6.44929f);
                instancePath.close();
                instancePath.moveTo(20.3755f, 9.45883f);
                instancePath.cubicTo(20.208f, 8.90586f, 19.9871f, 8.37596f, 19.7188f, 7.87505f);
                instancePath.lineTo(21.0411f, 7.16682f);
                instancePath.cubicTo(21.3555f, 7.75386f, 21.6145f, 8.37524f, 21.8111f, 9.02389f);
                instancePath.lineTo(20.3755f, 9.45883f);
                instancePath.close();
                instancePath.moveTo(20.75f, 12.0f);
                instancePath.cubicTo(20.75f, 11.71f, 20.7359f, 11.4235f, 20.7084f, 11.1411f);
                instancePath.lineTo(22.2014f, 10.9958f);
                instancePath.cubicTo(22.2336f, 11.3264f, 22.25f, 11.6614f, 22.25f, 12.0f);
                instancePath.cubicTo(22.25f, 12.3524f, 22.2322f, 12.701f, 22.1974f, 13.0447f);
                instancePath.lineTo(20.705f, 12.8935f);
                instancePath.cubicTo(20.7347f, 12.5999f, 20.75f, 12.3019f, 20.75f, 12.0f);
                instancePath.close();
                instancePath.moveTo(19.635f, 16.2777f);
                instancePath.cubicTo(19.9246f, 15.762f, 20.1634f, 15.2142f, 20.3446f, 14.6409f);
                instancePath.lineTo(21.7748f, 15.0931f);
                instancePath.cubicTo(21.5622f, 15.7656f, 21.2822f, 16.4079f, 20.9429f, 17.0122f);
                instancePath.lineTo(19.635f, 16.2777f);
                instancePath.close();
                instancePath.moveTo(12.75f, 6.0f);
                instancePath.lineTo(11.25f, 6.0f);
                instancePath.lineTo(11.25f, 12.3107f);
                instancePath.lineTo(15.4697f, 16.5303f);
                instancePath.lineTo(16.5303f, 15.4697f);
                instancePath.lineTo(12.75f, 11.6893f);
                instancePath.lineTo(12.75f, 6.0f);
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
