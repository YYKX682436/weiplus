package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_default_avatar extends l95.c {
    private final int width = 112;
    private final int height = 112;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 112;
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
                instancePaint3.setColor(-1184275);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(56.0f, 0.0f);
                instancePath.cubicTo(86.92795f, 0.0f, 112.0f, 25.072052f, 112.0f, 56.0f);
                instancePath.cubicTo(112.0f, 86.92795f, 86.92795f, 112.0f, 56.0f, 112.0f);
                instancePath.cubicTo(25.072052f, 112.0f, 0.0f, 86.92795f, 0.0f, 56.0f);
                instancePath.cubicTo(0.0f, 25.072052f, 25.072052f, 0.0f, 56.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(419430400);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(15.4f, 112.2f);
                instancePath2.cubicTo(13.4118f, 112.2f, 11.8f, 110.588f, 11.8f, 108.6f);
                instancePath2.lineTo(11.8f, 104.339f);
                instancePath2.cubicTo(11.8f, 101.142f, 14.1072f, 97.4155f, 16.96f, 96.0128f);
                instancePath2.lineTo(43.1764f, 83.1226f);
                instancePath2.cubicTo(46.9786f, 81.2531f, 47.8627f, 77.1125f, 45.117f, 73.8336f);
                instancePath2.lineTo(43.4425f, 71.8339f);
                instancePath2.cubicTo(40.0356f, 67.7653f, 37.2737f, 60.1643f, 37.2737f, 54.8433f);
                instancePath2.lineTo(37.2737f, 46.8647f);
                instancePath2.cubicTo(37.2737f, 36.5564f, 45.589f, 28.2f, 55.8f, 28.2f);
                instancePath2.cubicTo(66.0318f, 28.2f, 74.3263f, 36.5672f, 74.3263f, 46.8676f);
                instancePath2.lineTo(74.3263f, 54.8475f);
                instancePath2.cubicTo(74.3263f, 60.1633f, 71.5517f, 67.7866f, 68.1574f, 71.8406f);
                instancePath2.lineTo(66.483f, 73.8406f);
                instancePath2.cubicTo(63.7526f, 77.1017f, 64.6055f, 81.2525f, 68.4236f, 83.129f);
                instancePath2.lineTo(94.64f, 96.0139f);
                instancePath2.cubicTo(97.4898f, 97.4145f, 99.8f, 101.117f, 99.8f, 104.339f);
                instancePath2.lineTo(99.8f, 108.6f);
                instancePath2.cubicTo(99.8f, 110.588f, 98.1882f, 112.2f, 96.2f, 112.2f);
                instancePath2.lineTo(15.4f, 112.2f);
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
