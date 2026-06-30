package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_icon_min_window_regular extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.3313f, 12.7998f);
                instancePath.lineTo(27.6646f, 5.46664f);
                instancePath.lineTo(26.5332f, 4.33527f);
                instancePath.lineTo(19.2f, 11.6685f);
                instancePath.lineTo(19.2f, 6.39991f);
                instancePath.lineTo(17.6f, 6.39991f);
                instancePath.lineTo(17.6f, 13.0665f);
                instancePath.cubicTo(17.6f, 13.8029f, 18.1969f, 14.3998f, 18.9333f, 14.3998f);
                instancePath.lineTo(25.5999f, 14.3998f);
                instancePath.lineTo(25.5999f, 12.7998f);
                instancePath.lineTo(20.3313f, 12.7998f);
                instancePath.close();
                instancePath.moveTo(11.6684f, 19.2021f);
                instancePath.lineTo(4.33521f, 26.5353f);
                instancePath.lineTo(5.46658f, 27.6666f);
                instancePath.lineTo(12.7998f, 20.3334f);
                instancePath.lineTo(12.7998f, 25.602f);
                instancePath.lineTo(14.3998f, 25.602f);
                instancePath.lineTo(14.3998f, 18.9354f);
                instancePath.cubicTo(14.3998f, 18.199f, 13.8028f, 17.6021f, 13.0664f, 17.6021f);
                instancePath.lineTo(6.39985f, 17.6021f);
                instancePath.lineTo(6.39985f, 19.2021f);
                instancePath.lineTo(11.6684f, 19.2021f);
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
