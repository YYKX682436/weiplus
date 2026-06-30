package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class close_ad_half_screen extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 40;
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
                instancePath.moveTo(20.25f, 18.6932f);
                instancePath.lineTo(14.0568f, 12.5f);
                instancePath.lineTo(13.0f, 13.5568f);
                instancePath.lineTo(19.1932f, 19.75f);
                instancePath.lineTo(13.0f, 25.9432f);
                instancePath.lineTo(14.0568f, 27.0f);
                instancePath.lineTo(20.25f, 20.8068f);
                instancePath.lineTo(26.4432f, 27.0f);
                instancePath.lineTo(27.5f, 25.9432f);
                instancePath.lineTo(21.3068f, 19.75f);
                instancePath.lineTo(27.5f, 13.5568f);
                instancePath.lineTo(26.4432f, 12.5f);
                instancePath.lineTo(20.25f, 18.6932f);
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
