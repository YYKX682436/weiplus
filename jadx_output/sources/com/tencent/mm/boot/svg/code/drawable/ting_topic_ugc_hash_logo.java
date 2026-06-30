package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class ting_topic_ugc_hash_logo extends l95.c {
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
                instancePaint3.setColor(-372399);
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(20.0f, 0.0f);
                instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
                instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
                instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
                instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-201326593);
                instancePaint4.setColor(-201326593);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(23.6727f, 12.5f);
                instancePath2.lineTo(23.5537f, 13.6415f);
                instancePath2.cubicTo(23.2477f, 16.5783f, 22.6673f, 16.6058f, 21.2476f, 16.6732f);
                instancePath2.cubicTo(20.8936f, 16.69f, 20.4874f, 16.7093f, 20.0202f, 16.7768f);
                instancePath2.cubicTo(18.3172f, 17.0216f, 16.8121f, 17.9945f, 16.6333f, 19.7105f);
                instancePath2.cubicTo(16.4545f, 21.4265f, 17.6984f, 22.9598f, 19.4144f, 23.1386f);
                instancePath2.cubicTo(20.468f, 23.2484f, 21.2995f, 23.0819f, 21.9579f, 22.7378f);
                instancePath2.cubicTo(23.6312f, 21.8634f, 23.9344f, 19.7015f, 24.1982f, 17.8211f);
                instancePath2.cubicTo(24.203f, 17.7869f, 24.2078f, 17.7528f, 24.2126f, 17.7187f);
                instancePath2.lineTo(25.5784f, 8.0f);
                instancePath2.lineTo(28.5708f, 8.0f);
                instancePath2.lineTo(27.9383f, 12.5f);
                instancePath2.lineTo(31.25f, 12.5f);
                instancePath2.lineTo(31.25f, 15.5f);
                instancePath2.lineTo(27.5167f, 15.5f);
                instancePath2.lineTo(26.4627f, 23.0f);
                instancePath2.lineTo(29.75f, 23.0f);
                instancePath2.lineTo(29.75f, 26.0f);
                instancePath2.lineTo(26.041f, 26.0f);
                instancePath2.lineTo(25.3032f, 31.25f);
                instancePath2.lineTo(22.2737f, 31.25f);
                instancePath2.lineTo(23.0116f, 26.0f);
                instancePath2.lineTo(16.291f, 26.0f);
                instancePath2.lineTo(15.5532f, 31.25f);
                instancePath2.lineTo(12.5237f, 31.25f);
                instancePath2.lineTo(13.2616f, 26.0f);
                instancePath2.lineTo(8.75f, 26.0f);
                instancePath2.lineTo(8.75f, 23.0f);
                instancePath2.lineTo(13.6832f, 23.0f);
                instancePath2.lineTo(14.7372f, 15.5f);
                instancePath2.lineTo(10.25f, 15.5f);
                instancePath2.lineTo(10.25f, 12.5f);
                instancePath2.lineTo(15.1589f, 12.5f);
                instancePath2.lineTo(15.7913f, 8.0f);
                instancePath2.lineTo(18.8208f, 8.0f);
                instancePath2.lineTo(18.1883f, 12.5f);
                instancePath2.lineTo(23.6727f, 12.5f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
