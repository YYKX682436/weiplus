package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_blacklist_add extends l95.c {
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(22.666666f, 16.0f);
                instancePath.cubicTo(26.348564f, 16.0f, 29.333334f, 18.984768f, 29.333334f, 22.666666f);
                instancePath.cubicTo(29.333334f, 26.348564f, 26.348564f, 29.333334f, 22.666666f, 29.333334f);
                instancePath.cubicTo(18.984768f, 29.333334f, 16.0f, 26.348564f, 16.0f, 22.666666f);
                instancePath.cubicTo(16.0f, 18.984768f, 18.984768f, 16.0f, 22.666666f, 16.0f);
                instancePath.close();
                instancePath.moveTo(16.0f, 4.0f);
                instancePath.cubicTo(18.945518f, 4.0f, 21.333334f, 6.3906403f, 21.333334f, 9.33361f);
                instancePath.lineTo(21.333334f, 11.613581f);
                instancePath.cubicTo(21.333334f, 12.380527f, 21.12966f, 13.315579f, 20.802193f, 14.202541f);
                instancePath.cubicTo(16.911621f, 15.054211f, 14.0f, 18.520416f, 14.0f, 22.666666f);
                instancePath.cubicTo(14.0f, 24.678411f, 14.685439f, 26.530062f, 15.835516f, 28.000818f);
                instancePath.lineTo(4.3333335f, 28.0f);
                instancePath.cubicTo(3.7810485f, 28.0f, 3.3333333f, 27.552284f, 3.3333333f, 27.0f);
                instancePath.lineTo(3.3333333f, 25.753952f);
                instancePath.cubicTo(3.3333333f, 24.8405f, 3.9975345f, 23.775877f, 4.8187966f, 23.37511f);
                instancePath.lineTo(12.365934f, 19.69219f);
                instancePath.cubicTo(13.460503f, 19.158054f, 13.715013f, 17.975018f, 12.924594f, 17.038185f);
                instancePath.lineTo(12.442551f, 16.46685f);
                instancePath.cubicTo(11.461757f, 15.30438f, 10.666667f, 13.132662f, 10.666667f, 11.612388f);
                instancePath.lineTo(10.666667f, 9.332774f);
                instancePath.cubicTo(10.666667f, 6.387564f, 13.060475f, 4.0f, 16.0f, 4.0f);
                instancePath.close();
                instancePath.moveTo(18.736258f, 20.14972f);
                instancePath.cubicTo(18.27025f, 20.87592f, 18.0f, 21.739733f, 18.0f, 22.666666f);
                instancePath.cubicTo(18.0f, 25.243996f, 20.089338f, 27.333334f, 22.666666f, 27.333334f);
                instancePath.cubicTo(23.593578f, 27.333334f, 24.457373f, 27.063095f, 25.183561f, 26.597109f);
                instancePath.lineTo(18.736258f, 20.14972f);
                instancePath.close();
                instancePath.moveTo(22.666666f, 18.0f);
                instancePath.cubicTo(21.739733f, 18.0f, 20.87592f, 18.27025f, 20.14972f, 18.736258f);
                instancePath.lineTo(26.597109f, 25.183561f);
                instancePath.cubicTo(27.063095f, 24.457373f, 27.333334f, 23.593578f, 27.333334f, 22.666666f);
                instancePath.cubicTo(27.333334f, 20.089338f, 25.243996f, 18.0f, 22.666666f, 18.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
