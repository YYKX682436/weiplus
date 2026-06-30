package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_mini_select_overlay_regular extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePath.moveTo(6.0f, 12.0f);
                instancePath.cubicTo(9.31371f, 12.0f, 12.0f, 9.31371f, 12.0f, 6.0f);
                instancePath.cubicTo(12.0f, 2.68629f, 9.31371f, 0.0f, 6.0f, 0.0f);
                instancePath.cubicTo(2.68629f, 0.0f, 0.0f, 2.68629f, 0.0f, 6.0f);
                instancePath.cubicTo(0.0f, 9.31371f, 2.68629f, 12.0f, 6.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(2.84996f, 6.27236f);
                instancePath.lineTo(4.82986f, 8.25226f);
                instancePath.cubicTo(4.96654f, 8.38894f, 5.18815f, 8.38894f, 5.32483f, 8.25226f);
                instancePath.lineTo(9.53212f, 4.04497f);
                instancePath.lineTo(9.03714f, 3.55f);
                instancePath.lineTo(5.07734f, 7.5098f);
                instancePath.lineTo(3.34493f, 5.77739f);
                instancePath.lineTo(2.84996f, 6.27236f);
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
