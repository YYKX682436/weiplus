package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_thumb_filled extends l95.c {
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
                instancePath.moveTo(15.6659f, 6.73482f);
                instancePath.lineTo(15.4772f, 9.55456f);
                instancePath.lineTo(19.555f, 9.55456f);
                instancePath.cubicTo(20.6759f, 9.55456f, 21.8237f, 10.766f, 21.6465f, 12.2588f);
                instancePath.lineTo(21.6196f, 12.4056f);
                instancePath.lineTo(20.2203f, 19.078f);
                instancePath.cubicTo(19.9816f, 20.2075f, 19.1802f, 20.9227f, 18.2096f, 20.992f);
                instancePath.lineTo(18.0552f, 20.9975f);
                instancePath.lineTo(9.01672f, 20.9917f);
                instancePath.cubicTo(8.46469f, 20.9907f, 8.01736f, 20.5431f, 8.01672f, 19.9911f);
                instancePath.lineTo(8.01672f, 11.2404f);
                instancePath.cubicTo(8.01671f, 10.8476f, 8.2606f, 10.501f, 8.62024f, 10.3639f);
                instancePath.lineTo(8.73148f, 10.3292f);
                instancePath.cubicTo(10.0018f, 10.0177f, 11.0538f, 7.92838f, 11.2466f, 6.06782f);
                instancePath.lineTo(11.2571f, 5.90866f);
                instancePath.lineTo(11.2791f, 5.33911f);
                instancePath.lineTo(11.3016f, 5.06542f);
                instancePath.cubicTo(11.3759f, 4.3611f, 11.5861f, 3.47588f, 12.3788f, 3.13466f);
                instancePath.cubicTo(14.4624f, 2.23777f, 15.7802f, 4.9589f, 15.6659f, 6.73482f);
                instancePath.close();
                instancePath.moveTo(5.51479f, 20.9931f);
                instancePath.lineTo(4.35213f, 20.9955f);
                instancePath.cubicTo(3.83929f, 20.9965f, 3.41584f, 20.6113f, 3.35706f, 20.1141f);
                instancePath.lineTo(3.3501f, 19.9955f);
                instancePath.lineTo(3.3501f, 11.416f);
                instancePath.cubicTo(3.3501f, 10.8651f, 3.79573f, 10.4179f, 4.34667f, 10.416f);
                instancePath.lineTo(5.50934f, 10.412f);
                instancePath.cubicTo(6.02217f, 10.4103f, 6.44616f, 10.7949f, 6.50563f, 11.292f);
                instancePath.lineTo(6.51276f, 11.412f);
                instancePath.lineTo(6.51276f, 19.9931f);
                instancePath.cubicTo(6.51276f, 20.5446f, 6.06629f, 20.992f, 5.51479f, 20.9931f);
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
