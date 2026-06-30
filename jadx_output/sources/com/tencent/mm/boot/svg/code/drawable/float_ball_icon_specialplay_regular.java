package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_specialplay_regular extends l95.c {
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
                instancePath.moveTo(7.11314f, 4.14485f);
                instancePath.lineTo(18.9566f, 11.0454f);
                instancePath.cubicTo(19.4736f, 11.3466f, 19.6532f, 12.0182f, 19.3578f, 12.5453f);
                instancePath.cubicTo(19.2622f, 12.7158f, 19.1237f, 12.857f, 18.9566f, 12.9544f);
                instancePath.lineTo(7.11314f, 19.855f);
                instancePath.cubicTo(6.59612f, 20.1562f, 5.9375f, 19.973f, 5.64206f, 19.4459f);
                instancePath.cubicTo(5.54897f, 19.2798f, 5.5f, 19.0918f, 5.5f, 18.9004f);
                instancePath.lineTo(5.5f, 5.09937f);
                instancePath.cubicTo(5.5f, 4.4922f, 5.98273f, 4.0f, 6.5782f, 4.0f);
                instancePath.cubicTo(6.76584f, 4.0f, 6.95022f, 4.04993f, 7.11314f, 4.14485f);
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
