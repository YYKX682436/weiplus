package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_no_comment_on_dark extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-855638017);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(27.333334f, 4.3333335f);
        instancePath.cubicTo(28.437902f, 4.3333335f, 29.333334f, 5.228764f, 29.333334f, 6.3333335f);
        instancePath.lineTo(29.333944f, 16.654404f);
        instancePath.cubicTo(28.860207f, 16.142212f, 28.322437f, 15.690112f, 27.733355f, 15.310819f);
        instancePath.lineTo(27.733334f, 6.3333335f);
        instancePath.cubicTo(27.733334f, 6.1124196f, 27.554247f, 5.9333334f, 27.333334f, 5.9333334f);
        instancePath.lineTo(4.6666665f, 5.9333334f);
        instancePath.cubicTo(4.4457526f, 5.9333334f, 4.266667f, 6.1124196f, 4.266667f, 6.3333335f);
        instancePath.lineTo(4.266667f, 22.333334f);
        instancePath.cubicTo(4.266667f, 22.554247f, 4.4457526f, 22.733334f, 4.6666665f, 22.733334f);
        instancePath.lineTo(10.933333f, 22.733334f);
        instancePath.lineTo(10.933333f, 25.803925f);
        instancePath.lineTo(14.003925f, 22.733334f);
        instancePath.lineTo(15.0130625f, 22.733625f);
        instancePath.cubicTo(15.043781f, 23.283205f, 15.128194f, 23.818445f, 15.261141f, 24.334188f);
        instancePath.lineTo(14.666667f, 24.333334f);
        instancePath.lineTo(11.609476f, 27.390524f);
        instancePath.cubicTo(11.088777f, 27.911222f, 10.244556f, 27.911222f, 9.723858f, 27.390524f);
        instancePath.cubicTo(9.473809f, 27.140476f, 9.333333f, 26.801336f, 9.333333f, 26.447716f);
        instancePath.lineTo(9.333333f, 24.333334f);
        instancePath.lineTo(4.6666665f, 24.333334f);
        instancePath.cubicTo(3.562097f, 24.333334f, 2.6666667f, 23.437902f, 2.6666667f, 22.333334f);
        instancePath.lineTo(2.6666667f, 6.3333335f);
        instancePath.cubicTo(2.6666667f, 5.228764f, 3.562097f, 4.3333335f, 4.6666665f, 4.3333335f);
        instancePath.lineTo(27.333334f, 4.3333335f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-372399);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(23.1667f, 15.33301f);
        instancePath2.cubicTo(26.8486f, 15.33301f, 29.8333f, 18.31781f, 29.8333f, 21.99971f);
        instancePath2.cubicTo(29.8333f, 25.68161f, 26.8486f, 28.66631f, 23.1667f, 28.66631f);
        instancePath2.cubicTo(19.4848f, 28.66631f, 16.5f, 25.68161f, 16.5f, 21.99971f);
        instancePath2.cubicTo(16.5f, 18.31781f, 19.4848f, 15.33301f, 23.1667f, 15.33301f);
        instancePath2.close();
        instancePath2.moveTo(19.063f, 19.02741f);
        instancePath2.cubicTo(18.4572f, 19.86231f, 18.1f, 20.88931f, 18.1f, 21.99971f);
        instancePath2.cubicTo(18.1f, 24.79791f, 20.3684f, 27.06631f, 23.1667f, 27.06631f);
        instancePath2.cubicTo(24.2771f, 27.06631f, 25.3041f, 26.70911f, 26.139f, 26.10331f);
        instancePath2.lineTo(19.063f, 19.02741f);
        instancePath2.close();
        instancePath2.moveTo(20.1944f, 17.89601f);
        instancePath2.lineTo(27.2703f, 24.97201f);
        instancePath2.cubicTo(27.8761f, 24.13711f, 28.2333f, 23.11011f, 28.2333f, 21.99971f);
        instancePath2.cubicTo(28.2333f, 19.20141f, 25.9649f, 16.93301f, 23.1667f, 16.93301f);
        instancePath2.cubicTo(22.0563f, 16.93301f, 21.0293f, 17.29021f, 20.1944f, 17.89601f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
