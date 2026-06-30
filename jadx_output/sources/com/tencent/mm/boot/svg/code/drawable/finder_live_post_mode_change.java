package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_post_mode_change extends l95.c {
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
                instancePath.moveTo(4.49905f, 10.4997f);
                instancePath.cubicTo(4.03757f, 10.4997f, 3.82244f, 9.92785f, 4.16949f, 9.62368f);
                instancePath.lineTo(9.10225f, 5.30037f);
                instancePath.cubicTo(9.4557f, 4.99059f, 9.96124f, 5.43851f, 9.69627f, 5.82669f);
                instancePath.lineTo(7.53017f, 8.99995f);
                instancePath.lineTo(20.0003f, 8.99995f);
                instancePath.lineTo(20.0003f, 10.4999f);
                instancePath.lineTo(6.00028f, 10.4999f);
                instancePath.lineTo(6.00028f, 10.4997f);
                instancePath.lineTo(4.49905f, 10.4997f);
                instancePath.close();
                instancePath.moveTo(19.5001f, 13.5021f);
                instancePath.cubicTo(19.9616f, 13.5021f, 20.1767f, 14.0739f, 19.8296f, 14.3781f);
                instancePath.lineTo(14.8969f, 18.7014f);
                instancePath.cubicTo(14.5434f, 19.0112f, 14.0379f, 18.5632f, 14.3029f, 18.1751f);
                instancePath.lineTo(16.469f, 15.0018f);
                instancePath.lineTo(3.99881f, 15.0018f);
                instancePath.lineTo(3.99881f, 13.5018f);
                instancePath.lineTo(17.9989f, 13.5018f);
                instancePath.lineTo(17.9989f, 13.5021f);
                instancePath.lineTo(19.5001f, 13.5021f);
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
