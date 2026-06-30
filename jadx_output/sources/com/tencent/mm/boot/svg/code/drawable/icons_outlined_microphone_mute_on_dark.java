package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_microphone_mute_on_dark extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(14.5f, 2.0f);
                instancePath.cubicTo(11.1863f, 2.0f, 8.5f, 4.68629f, 8.5f, 8.0f);
                instancePath.lineTo(8.5f, 16.0f);
                instancePath.cubicTo(8.5f, 18.76061f, 10.3644f, 21.08581f, 12.9027f, 21.78511f);
                instancePath.cubicTo(12.9168f, 21.23271f, 12.9851f, 20.69371f, 13.1025f, 20.17341f);
                instancePath.cubicTo(11.3575f, 19.58931f, 10.1f, 17.94151f, 10.1f, 16.0f);
                instancePath.lineTo(10.1f, 8.0f);
                instancePath.cubicTo(10.1f, 5.56995f, 12.0699f, 3.6f, 14.5f, 3.6f);
                instancePath.cubicTo(16.9301f, 3.6f, 18.9f, 5.56995f, 18.9f, 8.0f);
                instancePath.lineTo(18.9f, 14.04791f);
                instancePath.cubicTo(19.4146f, 13.90151f, 19.9497f, 13.80371f, 20.5f, 13.75981f);
                instancePath.lineTo(20.5f, 8.0f);
                instancePath.cubicTo(20.5f, 4.68629f, 17.8137f, 2.0f, 14.5f, 2.0f);
                instancePath.close();
                instancePath.moveTo(13.2253f, 24.30391f);
                instancePath.cubicTo(13.6153f, 25.65061f, 14.3386f, 26.85571f, 15.3f, 27.82411f);
                instancePath.lineTo(15.3f, 30.00001f);
                instancePath.lineTo(13.7f, 30.00001f);
                instancePath.lineTo(13.7f, 25.96851f);
                instancePath.cubicTo(8.5512f, 25.56091f, 4.5f, 21.25361f, 4.5f, 16.00001f);
                instancePath.lineTo(4.5f, 14.00001f);
                instancePath.lineTo(6.1f, 14.00001f);
                instancePath.lineTo(6.1f, 16.00001f);
                instancePath.cubicTo(6.1f, 20.20581f, 9.191f, 23.68971f, 13.2253f, 24.30391f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-372399);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(21.1667f, 15.33301f);
                instancePath2.cubicTo(24.8486f, 15.33301f, 27.8333f, 18.31781f, 27.8333f, 21.99971f);
                instancePath2.cubicTo(27.8333f, 25.68161f, 24.8486f, 28.66631f, 21.1667f, 28.66631f);
                instancePath2.cubicTo(17.4848f, 28.66631f, 14.5f, 25.68161f, 14.5f, 21.99971f);
                instancePath2.cubicTo(14.5f, 18.31781f, 17.4848f, 15.33301f, 21.1667f, 15.33301f);
                instancePath2.close();
                instancePath2.moveTo(17.063f, 19.02741f);
                instancePath2.cubicTo(16.4572f, 19.86231f, 16.1f, 20.88931f, 16.1f, 21.99971f);
                instancePath2.cubicTo(16.1f, 24.79791f, 18.3684f, 27.06631f, 21.1667f, 27.06631f);
                instancePath2.cubicTo(22.2771f, 27.06631f, 23.3041f, 26.70911f, 24.139f, 26.10331f);
                instancePath2.lineTo(17.063f, 19.02741f);
                instancePath2.close();
                instancePath2.moveTo(18.1944f, 17.89601f);
                instancePath2.lineTo(25.2703f, 24.97201f);
                instancePath2.cubicTo(25.8761f, 24.13711f, 26.2333f, 23.11011f, 26.2333f, 21.99971f);
                instancePath2.cubicTo(26.2333f, 19.20141f, 23.9649f, 16.93301f, 21.1667f, 16.93301f);
                instancePath2.cubicTo(20.0563f, 16.93301f, 19.0293f, 17.29021f, 18.1944f, 17.89601f);
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
