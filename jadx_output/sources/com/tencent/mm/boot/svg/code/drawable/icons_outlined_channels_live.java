package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_channels_live extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(12.0f, 2.0f);
                instancePath2.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                instancePath2.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                instancePath2.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                instancePath2.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 3.2f);
                instancePath2.cubicTo(7.139894f, 3.2f, 3.2f, 7.139894f, 3.2f, 12.0f);
                instancePath2.cubicTo(3.2f, 16.860106f, 7.139894f, 20.8f, 12.0f, 20.8f);
                instancePath2.cubicTo(16.860106f, 20.8f, 20.8f, 16.860106f, 20.8f, 12.0f);
                instancePath2.cubicTo(20.8f, 7.139894f, 16.860106f, 3.2f, 12.0f, 3.2f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 6.5f);
                instancePath2.cubicTo(15.037566f, 6.5f, 17.5f, 8.962434f, 17.5f, 12.0f);
                instancePath2.cubicTo(17.5f, 15.037566f, 15.037566f, 17.5f, 12.0f, 17.5f);
                instancePath2.cubicTo(8.962434f, 17.5f, 6.5f, 15.037566f, 6.5f, 12.0f);
                instancePath2.cubicTo(6.5f, 8.962434f, 8.962434f, 6.5f, 12.0f, 6.5f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 7.7f);
                instancePath2.cubicTo(9.625175f, 7.7f, 7.7f, 9.625175f, 7.7f, 12.0f);
                instancePath2.cubicTo(7.7f, 14.374825f, 9.625175f, 16.3f, 12.0f, 16.3f);
                instancePath2.cubicTo(14.374825f, 16.3f, 16.3f, 14.374825f, 16.3f, 12.0f);
                instancePath2.cubicTo(16.3f, 9.625175f, 14.374825f, 7.7f, 12.0f, 7.7f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
