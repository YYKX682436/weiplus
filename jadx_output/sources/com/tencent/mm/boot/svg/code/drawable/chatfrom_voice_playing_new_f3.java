package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatfrom_voice_playing_new_f3 extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 72;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15028967);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(45.4242f, 69.0f);
                instancePath.lineTo(39.6252f, 63.291f);
                instancePath.cubicTo(47.0982f, 56.445f, 51.7692f, 46.713f, 51.7692f, 35.919f);
                instancePath.cubicTo(51.7692f, 25.209f, 47.1732f, 15.546f, 39.8022f, 8.709f);
                instancePath.lineTo(45.6012f, 3.0f);
                instancePath.cubicTo(54.4722f, 11.295f, 60.0012f, 22.977f, 60.0012f, 35.919f);
                instancePath.cubicTo(60.0012f, 48.945f, 54.4002f, 60.696f, 45.4242f, 69.0f);
                instancePath.moveTo(31.8912f, 55.674f);
                instancePath.lineTo(26.0892f, 49.959f);
                instancePath.cubicTo(30.0582f, 46.524f, 32.5602f, 41.505f, 32.5602f, 35.919f);
                instancePath.cubicTo(32.5602f, 30.417f, 30.1332f, 25.467f, 26.2692f, 22.035f);
                instancePath.lineTo(32.0712f, 16.323f);
                instancePath.cubicTo(37.4382f, 21.213f, 40.7922f, 28.185f, 40.7922f, 35.919f);
                instancePath.cubicTo(40.7922f, 43.737f, 37.3632f, 50.775f, 31.8912f, 55.674f);
                instancePath.moveTo(19.3032f, 43.278f);
                instancePath.lineTo(12.0012f, 36.087f);
                instancePath.lineTo(19.4952f, 28.707f);
                instancePath.cubicTo(21.6102f, 30.429f, 22.9572f, 33.018f, 22.9572f, 35.919f);
                instancePath.cubicTo(22.9572f, 38.904f, 21.5292f, 41.562f, 19.3032f, 43.278f);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
