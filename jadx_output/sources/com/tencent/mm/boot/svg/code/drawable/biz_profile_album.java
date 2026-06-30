package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_profile_album extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePath.moveTo(3.23307f, 2.00004f);
                instancePath.cubicTo(3.23307f, 1.63185f, 3.53155f, 1.33337f, 3.89974f, 1.33337f);
                instancePath.lineTo(12.0996f, 1.33337f);
                instancePath.cubicTo(12.4678f, 1.33337f, 12.7663f, 1.63185f, 12.7663f, 2.00004f);
                instancePath.lineTo(12.7663f, 2.13337f);
                instancePath.lineTo(3.23307f, 2.13337f);
                instancePath.lineTo(3.23307f, 2.00004f);
                instancePath.close();
                instancePath.moveTo(2.8f, 5.46648f);
                instancePath.lineTo(2.8f, 13.4665f);
                instancePath.lineTo(13.2f, 13.4665f);
                instancePath.lineTo(13.2f, 5.46648f);
                instancePath.lineTo(2.8f, 5.46648f);
                instancePath.close();
                instancePath.moveTo(2.66667f, 4.66648f);
                instancePath.cubicTo(2.29848f, 4.66648f, 2.0f, 4.96496f, 2.0f, 5.33315f);
                instancePath.lineTo(2.0f, 13.5998f);
                instancePath.cubicTo(2.0f, 13.968f, 2.29848f, 14.2665f, 2.66667f, 14.2665f);
                instancePath.lineTo(13.3333f, 14.2665f);
                instancePath.cubicTo(13.7015f, 14.2665f, 14.0f, 13.968f, 14.0f, 13.5998f);
                instancePath.lineTo(14.0f, 5.33315f);
                instancePath.cubicTo(14.0f, 4.96496f, 13.7015f, 4.66648f, 13.3333f, 4.66648f);
                instancePath.lineTo(2.66667f, 4.66648f);
                instancePath.close();
                instancePath.moveTo(3.36641f, 3.00004f);
                instancePath.cubicTo(2.99822f, 3.00004f, 2.69974f, 3.29852f, 2.69974f, 3.66671f);
                instancePath.lineTo(2.69974f, 3.80004f);
                instancePath.lineTo(13.2996f, 3.80004f);
                instancePath.lineTo(13.2996f, 3.66671f);
                instancePath.cubicTo(13.2996f, 3.29852f, 13.0011f, 3.00004f, 12.6329f, 3.00004f);
                instancePath.lineTo(3.36641f, 3.00004f);
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
