package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class remittance_wait extends l95.c {
    private final int width = 186;
    private final int height = 186;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 186;
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
                instancePaint3.setColor(-15683841);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(186.0f, 94.14815f);
                instancePath.cubicTo(186.0f, 41.636444f, 144.36356f, 0.0f, 91.85185f, 0.0f);
                instancePath.cubicTo(41.636444f, 0.0f, 0.0f, 41.636444f, 0.0f, 94.14815f);
                instancePath.cubicTo(0.0f, 144.36356f, 41.636444f, 186.0f, 91.85185f, 186.0f);
                instancePath.cubicTo(144.36356f, 186.0f, 186.0f, 144.36356f, 186.0f, 94.14815f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(96.53957f, 101.59992f);
                instancePath2.lineTo(93.96079f, 37.990128f);
                instancePath2.cubicTo(93.93903f, 37.45337f, 93.475f, 37.0f, 92.925255f, 37.0f);
                instancePath2.lineTo(84.91605f, 37.0f);
                instancePath2.cubicTo(84.37632f, 37.0f, 83.90268f, 37.443295f, 83.880516f, 37.990128f);
                instancePath2.lineTo(81.00167f, 109.00153f);
                instancePath2.cubicTo(80.974144f, 109.68064f, 81.28838f, 110.28124f, 81.79111f, 110.64247f);
                instancePath2.cubicTo(81.98214f, 110.944756f, 82.25776f, 111.19843f, 82.60479f, 111.36398f);
                instancePath2.lineTo(129.58261f, 133.77519f);
                instancePath2.cubicTo(130.08742f, 134.016f, 130.7105f, 133.8202f, 130.98582f, 133.34332f);
                instancePath2.lineTo(133.9888f, 128.14203f);
                instancePath2.cubicTo(134.26079f, 127.67092f, 134.11714f, 127.02809f, 133.66052f, 126.71911f);
                instancePath2.lineTo(96.53957f, 101.59992f);
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
