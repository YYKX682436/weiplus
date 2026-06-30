package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class play extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.5f, 6.58473f);
                instancePath.lineTo(7.5f, 17.4152f);
                instancePath.lineTo(16.9767f, 12.0f);
                instancePath.lineTo(7.5f, 6.58473f);
                instancePath.close();
                instancePath.moveTo(18.4806f, 11.1317f);
                instancePath.lineTo(7.49614f, 4.8549f);
                instancePath.cubicTo(7.34504f, 4.76856f, 7.17403f, 4.72314f, 7.0f, 4.72314f);
                instancePath.cubicTo(6.44772f, 4.72314f, 6.0f, 5.17086f, 6.0f, 5.72314f);
                instancePath.lineTo(6.0f, 18.2768f);
                instancePath.cubicTo(6.0f, 18.4508f, 6.04542f, 18.6218f, 6.13176f, 18.7729f);
                instancePath.cubicTo(6.40577f, 19.2524f, 7.01662f, 19.419f, 7.49614f, 19.145f);
                instancePath.lineTo(18.4806f, 12.8682f);
                instancePath.cubicTo(18.6356f, 12.7796f, 18.7641f, 12.6511f, 18.8527f, 12.4961f);
                instancePath.cubicTo(19.1267f, 12.0166f, 18.9601f, 11.4057f, 18.4806f, 11.1317f);
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
