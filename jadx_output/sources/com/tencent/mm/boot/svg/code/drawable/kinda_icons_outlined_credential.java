package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_icons_outlined_credential extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(25.333334f, 2.6666667f);
                instancePath.cubicTo(26.069714f, 2.6666667f, 26.666666f, 3.2636204f, 26.666666f, 4.0f);
                instancePath.lineTo(26.666666f, 28.0f);
                instancePath.cubicTo(26.666666f, 28.73638f, 26.069714f, 29.333334f, 25.333334f, 29.333334f);
                instancePath.lineTo(6.6666665f, 29.333334f);
                instancePath.cubicTo(5.930287f, 29.333334f, 5.3333335f, 28.73638f, 5.3333335f, 28.0f);
                instancePath.lineTo(5.3333335f, 4.0f);
                instancePath.cubicTo(5.3333335f, 3.2636204f, 5.930287f, 2.6666667f, 6.6666665f, 2.6666667f);
                instancePath.lineTo(25.333334f, 2.6666667f);
                instancePath.close();
                instancePath.moveTo(25.066668f, 4.266667f);
                instancePath.lineTo(6.9333334f, 4.266667f);
                instancePath.lineTo(6.9333334f, 27.733334f);
                instancePath.lineTo(25.066668f, 27.733334f);
                instancePath.lineTo(25.066668f, 4.266667f);
                instancePath.close();
                instancePath.moveTo(14.666667f, 12.0f);
                instancePath.lineTo(14.666667f, 13.6f);
                instancePath.lineTo(9.333333f, 13.6f);
                instancePath.lineTo(9.333333f, 12.0f);
                instancePath.lineTo(14.666667f, 12.0f);
                instancePath.close();
                instancePath.moveTo(17.333334f, 8.0f);
                instancePath.lineTo(17.333334f, 9.6f);
                instancePath.lineTo(9.333333f, 9.6f);
                instancePath.lineTo(9.333333f, 8.0f);
                instancePath.lineTo(17.333334f, 8.0f);
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
