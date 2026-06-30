package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_feedback_checkmark_circle extends l95.c {
    private final int width = 64;
    private final int height = 64;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 64;
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
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.33325f, 32.0f);
                instancePath.cubicTo(5.33325f, 46.7276f, 17.2723f, 58.6667f, 31.9999f, 58.6667f);
                instancePath.cubicTo(46.7275f, 58.6667f, 58.6666f, 46.7276f, 58.6666f, 32.0f);
                instancePath.cubicTo(58.6666f, 17.2724f, 46.7275f, 5.33337f, 31.9999f, 5.33337f);
                instancePath.cubicTo(17.2723f, 5.33337f, 5.33325f, 17.2724f, 5.33325f, 32.0f);
                instancePath.close();
                instancePath.moveTo(43.7939f, 22.7734f);
                instancePath.lineTo(28.8624f, 37.7049f);
                instancePath.lineTo(21.4867f, 30.3292f);
                instancePath.lineTo(18.6666f, 33.1493f);
                instancePath.lineTo(28.1614f, 42.6509f);
                instancePath.cubicTo(28.5518f, 43.0416f, 29.1851f, 43.0418f, 29.5757f, 42.6513f);
                instancePath.lineTo(46.6273f, 25.6068f);
                instancePath.lineTo(43.7939f, 22.7734f);
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
