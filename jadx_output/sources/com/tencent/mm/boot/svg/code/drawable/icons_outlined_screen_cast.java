package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_screen_cast extends l95.c {
    private final int width = 28;
    private final int height = 28;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 28;
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
                instancePaint3.setColor(-419430401);
                instancePaint3.setColor(-419430401);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(24.4999f, 3.5f);
                instancePath.cubicTo(25.1443f, 3.5f, 25.6666f, 4.02233f, 25.6666f, 4.66667f);
                instancePath.lineTo(25.6666f, 17.5f);
                instancePath.cubicTo(25.6666f, 18.1443f, 25.1443f, 18.6667f, 24.4999f, 18.6667f);
                instancePath.lineTo(18.5931f, 18.6667f);
                instancePath.lineTo(21.9321f, 24.4477f);
                instancePath.lineTo(20.4166f, 25.3227f);
                instancePath.lineTo(18.7284f, 22.4f);
                instancePath.lineTo(9.26909f, 22.4f);
                instancePath.lineTo(7.58213f, 25.3227f);
                instancePath.lineTo(6.06659f, 24.4477f);
                instancePath.lineTo(9.40209f, 18.6667f);
                instancePath.lineTo(3.49992f, 18.6667f);
                instancePath.cubicTo(2.85559f, 18.6667f, 2.33325f, 18.1443f, 2.33325f, 17.5f);
                instancePath.lineTo(2.33325f, 4.66667f);
                instancePath.cubicTo(2.33325f, 4.02233f, 2.85559f, 3.5f, 3.49992f, 3.5f);
                instancePath.lineTo(24.4999f, 3.5f);
                instancePath.close();
                instancePath.moveTo(16.5724f, 18.6667f);
                instancePath.lineTo(11.4239f, 18.6667f);
                instancePath.lineTo(10.0764f, 21.0f);
                instancePath.lineTo(17.9199f, 21.0f);
                instancePath.lineTo(16.5724f, 18.6667f);
                instancePath.close();
                instancePath.moveTo(24.2666f, 4.9f);
                instancePath.lineTo(3.73325f, 4.9f);
                instancePath.lineTo(3.73325f, 17.2667f);
                instancePath.lineTo(24.2666f, 17.2667f);
                instancePath.lineTo(24.2666f, 4.9f);
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
