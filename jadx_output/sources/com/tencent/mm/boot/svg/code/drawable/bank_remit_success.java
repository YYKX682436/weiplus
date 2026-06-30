package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bank_remit_success extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 120;
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
                instancePaint3.setColor(-16139513);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(115.8f, 60.68889f);
                instancePath.cubicTo(115.8f, 29.181868f, 90.81813f, 4.2f, 59.31111f, 4.2f);
                instancePath.cubicTo(29.181868f, 4.2f, 4.2f, 29.181868f, 4.2f, 60.68889f);
                instancePath.cubicTo(4.2f, 90.81813f, 29.181868f, 115.8f, 59.31111f, 115.8f);
                instancePath.cubicTo(90.81813f, 115.8f, 115.8f, 90.81813f, 115.8f, 60.68889f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(32.582005f, 63.962925f);
                instancePath2.cubicTo(32.19982f, 63.567383f, 32.154182f, 62.887268f, 32.48211f, 62.44106f);
                instancePath2.lineTo(34.52614f, 59.65979f);
                instancePath2.cubicTo(34.853153f, 59.21483f, 35.480194f, 59.131527f, 35.906685f, 59.458405f);
                instancePath2.lineTo(50.22881f, 70.43549f);
                instancePath2.cubicTo(50.66425f, 70.76923f, 51.36269f, 70.752f, 51.77925f, 70.40497f);
                instancePath2.lineTo(87.55628f, 40.59981f);
                instancePath2.cubicTo(87.97712f, 40.249214f, 88.639626f, 40.282352f, 89.03474f, 40.672565f);
                instancePath2.lineTo(90.83008f, 42.44564f);
                instancePath2.cubicTo(91.22577f, 42.836422f, 91.23205f, 43.46271f, 90.83447f, 43.85398f);
                instancePath2.lineTo(51.728115f, 82.340485f);
                instancePath2.cubicTo(51.334854f, 82.72751f, 50.700047f, 82.714195f, 50.32405f, 82.325066f);
                instancePath2.lineTo(32.582005f, 63.962925f);
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
