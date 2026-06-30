package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class status_accountunkey extends l95.c {
    private final int width = 46;
    private final int height = 46;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 46;
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
                instancePaint3.setColor(-6710887);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(23.0f, 0.0f);
                instancePath.cubicTo(35.70255f, 0.0f, 46.0f, 10.29745f, 46.0f, 23.0f);
                instancePath.cubicTo(46.0f, 35.70255f, 35.70255f, 46.0f, 23.0f, 46.0f);
                instancePath.cubicTo(10.29745f, 46.0f, 0.0f, 35.70255f, 0.0f, 23.0f);
                instancePath.cubicTo(0.0f, 10.29745f, 10.29745f, 0.0f, 23.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(29.837742f, 16.978155f);
                instancePath2.cubicTo(29.663364f, 15.734242f, 29.332104f, 14.538659f, 28.424576f, 13.573514f);
                instancePath2.cubicTo(25.837162f, 10.148845f, 20.172827f, 10.138831f, 17.585415f, 13.5635f);
                instancePath2.cubicTo(15.967033f, 15.315889f, 16.176823f, 17.799276f, 15.827173f, 19.982252f);
                instancePath2.lineTo(13.0f, 19.982252f);
                instancePath2.cubicTo(13.00999f, 24.328176f, 13.00999f, 28.66409f, 13.00999f, 33.0f);
                instancePath2.lineTo(32.99001f, 33.0f);
                instancePath2.cubicTo(32.99001f, 28.66409f, 32.99001f, 24.328176f, 33.0f, 19.982252f);
                instancePath2.lineTo(31.586414f, 19.982252f);
                instancePath2.lineTo(26.086912f, 19.982252f);
                instancePath2.lineTo(18.824175f, 19.982252f);
                instancePath2.cubicTo(18.804195f, 17.358675f, 19.713287f, 13.873924f, 22.99001f, 13.97406f);
                instancePath2.cubicTo(25.067957f, 13.891255f, 26.212177f, 15.279206f, 26.759495f, 16.978155f);
                instancePath2.lineTo(29.837742f, 16.978155f);
                instancePath2.lineTo(29.837742f, 16.978155f);
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
