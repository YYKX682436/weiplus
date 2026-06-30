package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class biz_bubble_circle_regular extends l95.c {
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
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(8.66745f, 18.2678f);
                instancePath.lineTo(9.10724f, 18.3952f);
                instancePath.cubicTo(10.0285f, 18.662f, 11.0022f, 18.8f, 12.0f, 18.8f);
                instancePath.cubicTo(16.8994f, 18.8f, 20.8f, 15.4845f, 20.8f, 11.5f);
                instancePath.cubicTo(20.8f, 7.51548f, 16.8994f, 4.2f, 12.0f, 4.2f);
                instancePath.cubicTo(7.10057f, 4.2f, 3.2f, 7.51548f, 3.2f, 11.5f);
                instancePath.cubicTo(3.2f, 13.5759f, 4.25693f, 15.5261f, 6.10059f, 16.9114f);
                instancePath.lineTo(6.65126f, 17.3251f);
                instancePath.lineTo(6.41619f, 19.3473f);
                instancePath.lineTo(8.66745f, 18.2678f);
                instancePath.close();
                instancePath.moveTo(12.0f, 20.0f);
                instancePath.cubicTo(10.871f, 20.0f, 9.78573f, 19.841f, 8.77345f, 19.5478f);
                instancePath.lineTo(5.7905f, 20.9782f);
                instancePath.cubicTo(5.70535f, 21.019f, 5.61038f, 21.0349f, 5.51658f, 21.024f);
                instancePath.cubicTo(5.24229f, 20.9921f, 5.04577f, 20.7439f, 5.07766f, 20.4696f);
                instancePath.lineTo(5.37976f, 17.8707f);
                instancePath.cubicTo(3.307f, 16.3133f, 2.0f, 14.0364f, 2.0f, 11.5f);
                instancePath.cubicTo(2.0f, 6.80558f, 6.47715f, 3.0f, 12.0f, 3.0f);
                instancePath.cubicTo(17.5228f, 3.0f, 22.0f, 6.80558f, 22.0f, 11.5f);
                instancePath.cubicTo(22.0f, 16.1944f, 17.5228f, 20.0f, 12.0f, 20.0f);
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
