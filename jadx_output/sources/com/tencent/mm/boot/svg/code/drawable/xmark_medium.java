package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class xmark_medium extends l95.c {
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
                instancePath.moveTo(11.9988f, 13.2726f);
                instancePath.lineTo(5.77408f, 19.4961f);
                instancePath.lineTo(4.50141f, 18.2232f);
                instancePath.lineTo(10.7259f, 11.9999f);
                instancePath.lineTo(4.50049f, 5.77564f);
                instancePath.lineTo(5.77316f, 4.50274f);
                instancePath.lineTo(11.9988f, 10.7272f);
                instancePath.lineTo(18.227f, 4.50024f);
                instancePath.lineTo(19.4997f, 5.77316f);
                instancePath.lineTo(13.2717f, 11.9999f);
                instancePath.lineTo(19.4997f, 18.2268f);
                instancePath.lineTo(18.2271f, 19.4997f);
                instancePath.lineTo(11.9988f, 13.2726f);
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
