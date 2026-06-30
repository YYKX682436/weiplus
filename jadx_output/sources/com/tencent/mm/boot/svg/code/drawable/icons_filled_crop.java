package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_crop extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                instancePath.moveTo(18.0f, 60.0f);
                instancePath.lineTo(8.997152f, 60.0f);
                instancePath.cubicTo(7.341871f, 60.0f, 6.0f, 58.666107f, 6.0f, 56.997383f);
                instancePath.lineTo(6.0f, 15.002615f);
                instancePath.cubicTo(6.0f, 13.3443165f, 7.341623f, 12.0f, 8.997152f, 12.0f);
                instancePath.lineTo(12.0f, 12.0f);
                instancePath.lineTo(60.0f, 12.0f);
                instancePath.lineTo(63.00285f, 12.0f);
                instancePath.cubicTo(64.65813f, 12.0f, 66.0f, 13.333893f, 66.0f, 15.002615f);
                instancePath.lineTo(66.0f, 56.997383f);
                instancePath.cubicTo(66.0f, 58.65568f, 64.65838f, 60.0f, 63.00285f, 60.0f);
                instancePath.lineTo(54.0f, 60.0f);
                instancePath.lineTo(18.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(18.0f, 57.0f);
                instancePath.lineTo(54.0f, 57.0f);
                instancePath.lineTo(54.0f, 15.0f);
                instancePath.lineTo(18.0f, 15.0f);
                instancePath.lineTo(18.0f, 57.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 33.333332f);
                instancePath.lineTo(10.0f, 40.444443f);
                instancePath.lineTo(14.0f, 40.444443f);
                instancePath.lineTo(14.0f, 33.333332f);
                instancePath.lineTo(10.0f, 33.333332f);
                instancePath.close();
                instancePath.moveTo(58.0f, 33.333332f);
                instancePath.lineTo(58.0f, 40.444443f);
                instancePath.lineTo(62.0f, 40.444443f);
                instancePath.lineTo(62.0f, 33.333332f);
                instancePath.lineTo(58.0f, 33.333332f);
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
