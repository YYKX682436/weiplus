package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_pull_down_arrow extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 != 2) {
            return 0;
        }
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
        instancePath.moveTo(19.7428f, 37.6377f);
        instancePath.lineTo(16.5608f, 34.4557f);
        instancePath.lineTo(33.8975f, 17.119f);
        instancePath.cubicTo(35.0679f, 15.9486f, 36.955f, 15.9383f, 38.1358f, 17.119f);
        instancePath.lineTo(55.4725f, 34.4557f);
        instancePath.lineTo(52.2905f, 37.6377f);
        instancePath.lineTo(36.0166f, 21.3638f);
        instancePath.lineTo(19.7428f, 37.6377f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.7442f, 55.6377f);
        instancePath2.lineTo(16.5623f, 52.4557f);
        instancePath2.lineTo(33.8989f, 35.119f);
        instancePath2.cubicTo(35.0693f, 33.9486f, 36.9565f, 33.9383f, 38.1373f, 35.119f);
        instancePath2.lineTo(55.4739f, 52.4557f);
        instancePath2.lineTo(52.292f, 55.6377f);
        instancePath2.lineTo(36.0181f, 39.3638f);
        instancePath2.lineTo(19.7442f, 55.6377f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
