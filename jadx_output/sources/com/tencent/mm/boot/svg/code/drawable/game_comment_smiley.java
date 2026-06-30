package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_comment_smiley extends l95.c {
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(2.66656f, 16.0f);
                instancePath.cubicTo(2.66656f, 23.3638f, 8.6361f, 29.3333f, 15.9999f, 29.3333f);
                instancePath.cubicTo(23.3637f, 29.3333f, 29.3332f, 23.3638f, 29.3332f, 16.0f);
                instancePath.cubicTo(29.3332f, 8.63616f, 23.3637f, 2.66663f, 15.9999f, 2.66663f);
                instancePath.cubicTo(8.6361f, 2.66663f, 2.66656f, 8.63616f, 2.66656f, 16.0f);
                instancePath.close();
                instancePath.moveTo(27.7332f, 15.9999f);
                instancePath.cubicTo(27.7332f, 22.48f, 22.48f, 27.7332f, 15.9999f, 27.7332f);
                instancePath.cubicTo(9.51971f, 27.7332f, 4.26652f, 22.48f, 4.26652f, 15.9999f);
                instancePath.cubicTo(4.26652f, 9.51975f, 9.51971f, 4.26656f, 15.9999f, 4.26656f);
                instancePath.cubicTo(22.48f, 4.26656f, 27.7332f, 9.51975f, 27.7332f, 15.9999f);
                instancePath.close();
                instancePath.moveTo(23.9999f, 16.6666f);
                instancePath.cubicTo(23.9999f, 21.0849f, 20.4182f, 24.6666f, 15.9999f, 24.6666f);
                instancePath.cubicTo(11.5816f, 24.6666f, 7.9999f, 21.0849f, 7.9999f, 16.6666f);
                instancePath.lineTo(23.9999f, 16.6666f);
                instancePath.close();
                instancePath.moveTo(22.1984f, 18.2666f);
                instancePath.cubicTo(21.4879f, 21.027f, 18.9821f, 23.0666f, 16.0f, 23.0666f);
                instancePath.cubicTo(13.0179f, 23.0666f, 10.5121f, 21.027f, 9.80163f, 18.2666f);
                instancePath.lineTo(22.1984f, 18.2666f);
                instancePath.close();
                instancePath.moveTo(13.3332f, 11.9999f);
                instancePath.cubicTo(13.3332f, 13.1045f, 12.4378f, 13.9999f, 11.3332f, 13.9999f);
                instancePath.cubicTo(10.2287f, 13.9999f, 9.33324f, 13.1045f, 9.33324f, 11.9999f);
                instancePath.cubicTo(9.33324f, 10.8954f, 10.2287f, 9.99994f, 11.3332f, 9.99994f);
                instancePath.cubicTo(12.4378f, 9.99994f, 13.3332f, 10.8954f, 13.3332f, 11.9999f);
                instancePath.close();
                instancePath.moveTo(20.6665f, 13.9999f);
                instancePath.cubicTo(21.7711f, 13.9999f, 22.6665f, 13.1045f, 22.6665f, 11.9999f);
                instancePath.cubicTo(22.6665f, 10.8954f, 21.7711f, 9.99994f, 20.6665f, 9.99994f);
                instancePath.cubicTo(19.562f, 9.99994f, 18.6665f, 10.8954f, 18.6665f, 11.9999f);
                instancePath.cubicTo(18.6665f, 13.1045f, 19.562f, 13.9999f, 20.6665f, 13.9999f);
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
