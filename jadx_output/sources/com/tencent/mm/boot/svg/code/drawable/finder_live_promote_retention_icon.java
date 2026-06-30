package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_promote_retention_icon extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.75f, 20.9602f);
                instancePath.lineTo(3.75f, 3.54205f);
                instancePath.cubicTo(3.75f, 2.8284f, 4.30523f, 2.24988f, 4.99014f, 2.24988f);
                instancePath.lineTo(18.5074f, 2.24988f);
                instancePath.cubicTo(19.1923f, 2.24988f, 19.7475f, 2.8284f, 19.7475f, 3.54205f);
                instancePath.lineTo(19.7475f, 9.18185f);
                instancePath.lineTo(13.3402f, 15.5982f);
                instancePath.lineTo(12.0062f, 17.9368f);
                instancePath.cubicTo(11.7502f, 18.3856f, 11.7477f, 18.9357f, 11.9996f, 19.3868f);
                instancePath.cubicTo(12.3966f, 20.0976f, 13.2953f, 20.3529f, 14.007f, 19.9544f);
                instancePath.lineTo(16.367f, 18.6328f);
                instancePath.lineTo(19.7475f, 15.2474f);
                instancePath.lineTo(19.7475f, 20.9602f);
                instancePath.cubicTo(19.7475f, 21.6739f, 19.1923f, 22.2524f, 18.5074f, 22.2524f);
                instancePath.lineTo(4.99013f, 22.2524f);
                instancePath.cubicTo(4.30523f, 22.2524f, 3.75f, 21.6739f, 3.75f, 20.9602f);
                instancePath.close();
                instancePath.moveTo(7.37988f, 7.79984f);
                instancePath.lineTo(15.3799f, 7.79984f);
                instancePath.lineTo(15.3799f, 9.19984f);
                instancePath.lineTo(7.37988f, 9.19984f);
                instancePath.lineTo(7.37988f, 7.79984f);
                instancePath.close();
                instancePath.moveTo(12.3799f, 11.2001f);
                instancePath.lineTo(7.37988f, 11.2001f);
                instancePath.lineTo(7.37988f, 12.6001f);
                instancePath.lineTo(12.3799f, 12.6001f);
                instancePath.lineTo(12.3799f, 11.2001f);
                instancePath.close();
                instancePath.moveTo(21.8829f, 9.55601f);
                instancePath.cubicTo(21.7417f, 9.41464f, 21.5129f, 9.41464f, 21.3717f, 9.55601f);
                instancePath.lineTo(14.4794f, 16.4581f);
                instancePath.lineTo(13.5286f, 18.125f);
                instancePath.cubicTo(13.4908f, 18.1912f, 13.4905f, 18.2723f, 13.5276f, 18.3388f);
                instancePath.cubicTo(13.5861f, 18.4435f, 13.7182f, 18.4809f, 13.8228f, 18.4223f);
                instancePath.lineTo(15.5018f, 17.482f);
                instancePath.lineTo(22.3941f, 10.5799f);
                instancePath.cubicTo(22.5353f, 10.4385f, 22.5353f, 10.2093f, 22.3941f, 10.0679f);
                instancePath.lineTo(21.8829f, 9.55601f);
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
