package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_change_language extends l95.c {
    private final int width = 33;
    private final int height = 33;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 33;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.06387f, 6.35f);
        instancePath.lineTo(6.06387f, 27.15f);
        instancePath.lineTo(26.8639f, 27.15f);
        instancePath.lineTo(26.8639f, 6.35f);
        instancePath.lineTo(6.06387f, 6.35f);
        instancePath.close();
        instancePath.moveTo(5.7972f, 4.75f);
        instancePath.cubicTo(5.06082f, 4.75f, 4.46387f, 5.34695f, 4.46387f, 6.08333f);
        instancePath.lineTo(4.46387f, 27.4167f);
        instancePath.cubicTo(4.46387f, 28.153f, 5.06082f, 28.75f, 5.7972f, 28.75f);
        instancePath.lineTo(27.1305f, 28.75f);
        instancePath.cubicTo(27.8669f, 28.75f, 28.4639f, 28.153f, 28.4639f, 27.4167f);
        instancePath.lineTo(28.4639f, 6.08333f);
        instancePath.cubicTo(28.4639f, 5.34695f, 27.8669f, 4.75f, 27.1305f, 4.75f);
        instancePath.lineTo(5.7972f, 4.75f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(16.464f, 12.0346f);
        instancePath2.cubicTo(13.8598f, 12.0346f, 11.7486f, 14.1458f, 11.7486f, 16.75f);
        instancePath2.lineTo(9.79736f, 16.75f);
        instancePath2.cubicTo(9.79736f, 13.0681f, 12.7821f, 10.0834f, 16.464f, 10.0834f);
        instancePath2.cubicTo(18.0332f, 10.0834f, 19.4752f, 10.6257f, 20.6134f, 11.5319f);
        instancePath2.lineTo(20.6134f, 10.3333f);
        instancePath2.lineTo(22.5646f, 10.3333f);
        instancePath2.lineTo(22.5646f, 13.9918f);
        instancePath2.cubicTo(22.5646f, 14.5307f, 22.1278f, 14.9675f, 21.589f, 14.9675f);
        instancePath2.lineTo(17.9305f, 14.9675f);
        instancePath2.lineTo(17.9305f, 13.0162f);
        instancePath2.lineTo(19.3446f, 13.0162f);
        instancePath2.cubicTo(18.5475f, 12.4003f, 17.5483f, 12.0346f, 16.464f, 12.0346f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(16.4642f, 21.4655f);
        instancePath3.cubicTo(19.0685f, 21.4655f, 21.1796f, 19.3543f, 21.1796f, 16.75f);
        instancePath3.lineTo(23.1309f, 16.75f);
        instancePath3.cubicTo(23.1309f, 20.4319f, 20.1461f, 23.4167f, 16.4642f, 23.4167f);
        instancePath3.cubicTo(14.8995f, 23.4167f, 13.4609f, 22.8772f, 12.3242f, 21.9756f);
        instancePath3.lineTo(12.3242f, 23.008f);
        instancePath3.lineTo(10.373f, 23.008f);
        instancePath3.lineTo(10.373f, 19.3494f);
        instancePath3.cubicTo(10.373f, 18.8106f, 10.8098f, 18.3738f, 11.3486f, 18.3738f);
        instancePath3.lineTo(15.0071f, 18.3738f);
        instancePath3.lineTo(15.0071f, 20.3251f);
        instancePath3.lineTo(13.389f, 20.3251f);
        instancePath3.cubicTo(14.2152f, 21.0366f, 15.2897f, 21.4655f, 16.4642f, 21.4655f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
