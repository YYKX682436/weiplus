package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_no_comment_on_light extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(27.333334f, 5.3333335f);
        instancePath.cubicTo(28.437902f, 5.3333335f, 29.333334f, 6.228764f, 29.333334f, 7.3333335f);
        instancePath.lineTo(29.333944f, 17.654404f);
        instancePath.cubicTo(28.860207f, 17.142212f, 28.322437f, 16.690111f, 27.733355f, 16.310818f);
        instancePath.lineTo(27.733334f, 7.3333335f);
        instancePath.cubicTo(27.733334f, 7.1124196f, 27.554247f, 6.9333334f, 27.333334f, 6.9333334f);
        instancePath.lineTo(4.6666665f, 6.9333334f);
        instancePath.cubicTo(4.4457526f, 6.9333334f, 4.266667f, 7.1124196f, 4.266667f, 7.3333335f);
        instancePath.lineTo(4.266667f, 23.333334f);
        instancePath.cubicTo(4.266667f, 23.554247f, 4.4457526f, 23.733334f, 4.6666665f, 23.733334f);
        instancePath.lineTo(10.933333f, 23.733334f);
        instancePath.lineTo(10.933333f, 26.803925f);
        instancePath.lineTo(14.003925f, 23.733334f);
        instancePath.lineTo(15.0130625f, 23.733625f);
        instancePath.cubicTo(15.043781f, 24.283205f, 15.128194f, 24.818445f, 15.261141f, 25.334188f);
        instancePath.lineTo(14.666667f, 25.333334f);
        instancePath.lineTo(11.609476f, 28.390524f);
        instancePath.cubicTo(11.088777f, 28.911222f, 10.244556f, 28.911222f, 9.723858f, 28.390524f);
        instancePath.cubicTo(9.473809f, 28.140476f, 9.333333f, 27.801336f, 9.333333f, 27.447716f);
        instancePath.lineTo(9.333333f, 25.333334f);
        instancePath.lineTo(4.6666665f, 25.333334f);
        instancePath.cubicTo(3.562097f, 25.333334f, 2.6666667f, 24.437902f, 2.6666667f, 23.333334f);
        instancePath.lineTo(2.6666667f, 7.3333335f);
        instancePath.cubicTo(2.6666667f, 6.228764f, 3.562097f, 5.3333335f, 4.6666665f, 5.3333335f);
        instancePath.lineTo(27.333334f, 5.3333335f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-372399);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(23.1667f, 16.33301f);
        instancePath2.cubicTo(26.8486f, 16.33301f, 29.8333f, 19.31781f, 29.8333f, 22.99971f);
        instancePath2.cubicTo(29.8333f, 26.68161f, 26.8486f, 29.66631f, 23.1667f, 29.66631f);
        instancePath2.cubicTo(19.4848f, 29.66631f, 16.5f, 26.68161f, 16.5f, 22.99971f);
        instancePath2.cubicTo(16.5f, 19.31781f, 19.4848f, 16.33301f, 23.1667f, 16.33301f);
        instancePath2.close();
        instancePath2.moveTo(19.063f, 20.02741f);
        instancePath2.cubicTo(18.4572f, 20.86231f, 18.1f, 21.88931f, 18.1f, 22.99971f);
        instancePath2.cubicTo(18.1f, 25.79791f, 20.3684f, 28.06631f, 23.1667f, 28.06631f);
        instancePath2.cubicTo(24.2771f, 28.06631f, 25.3041f, 27.70911f, 26.139f, 27.10331f);
        instancePath2.lineTo(19.063f, 20.02741f);
        instancePath2.close();
        instancePath2.moveTo(20.1944f, 18.89601f);
        instancePath2.lineTo(27.2703f, 25.97201f);
        instancePath2.cubicTo(27.8761f, 25.13711f, 28.2333f, 24.11011f, 28.2333f, 22.99971f);
        instancePath2.cubicTo(28.2333f, 20.20141f, 25.9649f, 17.93301f, 23.1667f, 17.93301f);
        instancePath2.cubicTo(22.0563f, 17.93301f, 21.0293f, 18.29021f, 20.1944f, 18.89601f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
