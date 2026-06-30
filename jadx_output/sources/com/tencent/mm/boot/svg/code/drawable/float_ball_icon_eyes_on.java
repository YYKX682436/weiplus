package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_eyes_on extends l95.c {
    private final int width = 18;
    private final int height = 18;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 18;
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
                instancePaint3.setColor(-1);
                instancePaint3.setColor(-1);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.7998f, 9.00001f);
                instancePath.cubicTo(3.12719f, 6.28209f, 5.8529f, 4.4182f, 8.99981f, 4.4182f);
                instancePath.cubicTo(12.1468f, 4.4182f, 14.8725f, 6.28209f, 16.1998f, 9.00001f);
                instancePath.cubicTo(14.8725f, 11.7179f, 12.1468f, 13.5818f, 8.99981f, 13.5818f);
                instancePath.cubicTo(5.8529f, 13.5818f, 3.12719f, 11.7179f, 1.7998f, 9.00001f);
                instancePath.close();
                instancePath.moveTo(11.2907f, 8.99995f);
                instancePath.cubicTo(11.2907f, 10.2652f, 10.265f, 11.2908f, 8.99976f, 11.2908f);
                instancePath.cubicTo(7.73452f, 11.2908f, 6.70885f, 10.2652f, 6.70885f, 8.99995f);
                instancePath.cubicTo(6.70885f, 7.73471f, 7.73452f, 6.70903f, 8.99976f, 6.70903f);
                instancePath.cubicTo(10.265f, 6.70903f, 11.2907f, 7.73471f, 11.2907f, 8.99995f);
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
