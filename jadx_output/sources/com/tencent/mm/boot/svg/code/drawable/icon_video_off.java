package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_video_off extends l95.c {
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
                instancePath.moveTo(22.4996f, 6.37614f);
                instancePath.lineTo(22.4996f, 11.5591f);
                instancePath.cubicTo(22.1372f, 11.2115f, 21.7346f, 10.9054f, 21.2996f, 10.6485f);
                instancePath.lineTo(21.2996f, 6.75137f);
                instancePath.lineTo(17.0f, 9.63882f);
                instancePath.lineTo(17.0f, 9.82645f);
                instancePath.cubicTo(16.5854f, 9.89047f, 16.1837f, 9.99368f, 15.7988f, 10.1322f);
                instancePath.lineTo(15.7988f, 9.53301f);
                instancePath.cubicTo(15.7988f, 9.5168f, 15.7992f, 9.50064f, 15.8f, 9.48454f);
                instancePath.lineTo(15.8f, 5.2f);
                instancePath.lineTo(2.7f, 5.2f);
                instancePath.lineTo(2.7f, 15.8f);
                instancePath.lineTo(11.5153f, 15.8f);
                instancePath.cubicTo(11.5052f, 15.9487f, 11.5f, 16.0987f, 11.5f, 16.25f);
                instancePath.cubicTo(11.5f, 16.5037f, 11.5145f, 16.7539f, 11.5428f, 17.0f);
                instancePath.lineTo(2.5f, 17.0f);
                instancePath.cubicTo(1.94772f, 17.0f, 1.5f, 16.5523f, 1.5f, 16.0f);
                instancePath.lineTo(1.5f, 5.0f);
                instancePath.cubicTo(1.5f, 4.44772f, 1.94772f, 4.0f, 2.5f, 4.0f);
                instancePath.lineTo(16.0f, 4.0f);
                instancePath.cubicTo(16.5523f, 4.0f, 17.0f, 4.44772f, 17.0f, 5.0f);
                instancePath.lineTo(17.0f, 8.19333f);
                instancePath.lineTo(20.942f, 5.54598f);
                instancePath.cubicTo(21.6064f, 5.09984f, 22.4996f, 5.57591f, 22.4996f, 6.37614f);
                instancePath.close();
                instancePath.moveTo(18.0f, 11.25f);
                instancePath.cubicTo(20.7614f, 11.25f, 23.0f, 13.4886f, 23.0f, 16.25f);
                instancePath.cubicTo(23.0f, 19.0114f, 20.7614f, 21.25f, 18.0f, 21.25f);
                instancePath.cubicTo(15.2386f, 21.25f, 13.0f, 19.0114f, 13.0f, 16.25f);
                instancePath.cubicTo(13.0f, 13.4886f, 15.2386f, 11.25f, 18.0f, 11.25f);
                instancePath.close();
                instancePath.moveTo(14.9222f, 14.0208f);
                instancePath.cubicTo(14.4679f, 14.647f, 14.2f, 15.4172f, 14.2f, 16.25f);
                instancePath.cubicTo(14.2f, 18.3487f, 15.9013f, 20.05f, 18.0f, 20.05f);
                instancePath.cubicTo(18.8328f, 20.05f, 19.603f, 19.7821f, 20.2292f, 19.3278f);
                instancePath.lineTo(14.9222f, 14.0208f);
                instancePath.close();
                instancePath.moveTo(15.7708f, 13.1722f);
                instancePath.cubicTo(16.397f, 12.7179f, 17.1672f, 12.45f, 18.0f, 12.45f);
                instancePath.cubicTo(20.0987f, 12.45f, 21.8f, 14.1513f, 21.8f, 16.25f);
                instancePath.cubicTo(21.8f, 17.0828f, 21.5321f, 17.8531f, 21.0778f, 18.4792f);
                instancePath.lineTo(15.7708f, 13.1722f);
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
