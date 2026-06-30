package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_icon_close_regular extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(7.10898f, 4.63435f);
                instancePath.lineTo(11.6455f, 9.17165f);
                instancePath.cubicTo(11.8407f, 9.36694f, 12.1573f, 9.36696f, 12.3526f, 9.17171f);
                instancePath.lineTo(16.8906f, 4.63435f);
                instancePath.cubicTo(17.4113f, 4.11365f, 18.1104f, 3.96855f, 18.4522f, 4.31026f);
                instancePath.lineTo(19.6896f, 5.5477f);
                instancePath.cubicTo(20.0313f, 5.88941f, 19.8862f, 6.58853f, 19.3655f, 7.10922f);
                instancePath.lineTo(14.8277f, 11.6457f);
                instancePath.cubicTo(14.6323f, 11.8409f, 14.6323f, 12.1576f, 14.8276f, 12.3529f);
                instancePath.lineTo(19.3655f, 16.8909f);
                instancePath.cubicTo(19.8862f, 17.4116f, 20.0313f, 18.1107f, 19.6896f, 18.4524f);
                instancePath.lineTo(18.4522f, 19.6898f);
                instancePath.cubicTo(18.1104f, 20.0315f, 17.4113f, 19.8864f, 16.8906f, 19.3657f);
                instancePath.lineTo(12.3526f, 14.8278f);
                instancePath.cubicTo(12.1573f, 14.6326f, 11.8407f, 14.6326f, 11.6455f, 14.8279f);
                instancePath.lineTo(7.10898f, 19.3657f);
                instancePath.cubicTo(6.58828f, 19.8864f, 5.88916f, 20.0315f, 5.54745f, 19.6898f);
                instancePath.lineTo(4.31002f, 18.4524f);
                instancePath.cubicTo(3.96831f, 18.1107f, 4.11341f, 17.4116f, 4.63411f, 16.8909f);
                instancePath.lineTo(9.17147f, 12.3528f);
                instancePath.cubicTo(9.36672f, 12.1576f, 9.36669f, 11.841f, 9.17141f, 11.6457f);
                instancePath.lineTo(4.63411f, 7.10922f);
                instancePath.cubicTo(4.11341f, 6.58853f, 3.96831f, 5.88941f, 4.31002f, 5.5477f);
                instancePath.lineTo(5.54745f, 4.31026f);
                instancePath.cubicTo(5.88916f, 3.96855f, 6.58828f, 4.11365f, 7.10898f, 4.63435f);
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
