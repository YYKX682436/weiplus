package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_game_notice_close extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 20;
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
                instancePaint3.setColor(Integer.MIN_VALUE);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.2084f, 8.91099f);
                instancePath.lineTo(5.04737f, 3.75f);
                instancePath.lineTo(4.16669f, 4.63068f);
                instancePath.lineTo(9.32767f, 9.79167f);
                instancePath.lineTo(4.16669f, 14.9527f);
                instancePath.lineTo(5.04737f, 15.8333f);
                instancePath.lineTo(10.2084f, 10.6723f);
                instancePath.lineTo(15.3693f, 15.8333f);
                instancePath.lineTo(16.25f, 14.9527f);
                instancePath.lineTo(11.089f, 9.79167f);
                instancePath.lineTo(16.25f, 4.63068f);
                instancePath.lineTo(15.3693f, 3.75f);
                instancePath.lineTo(10.2084f, 8.91099f);
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
