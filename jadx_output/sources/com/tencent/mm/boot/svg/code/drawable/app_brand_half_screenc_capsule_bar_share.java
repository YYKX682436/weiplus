package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_half_screenc_capsule_bar_share extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(13.003701f, 2.9980292f);
                instancePath2.cubicTo(13.267266f, 2.9980292f, 13.520174f, 3.1020815f, 13.707429f, 3.2875595f);
                instancePath2.lineTo(20.878723f, 10.3907995f);
                instancePath2.cubicTo(21.240923f, 10.74956f, 21.271357f, 11.316653f, 20.968204f, 11.710394f);
                instancePath2.lineTo(20.878723f, 11.811739f);
                instancePath2.lineTo(13.707429f, 18.91498f);
                instancePath2.cubicTo(13.315047f, 19.303637f, 12.68189f, 19.30062f, 12.293232f, 18.908237f);
                instancePath2.cubicTo(12.107754f, 18.720982f, 12.003701f, 18.468075f, 12.003701f, 18.20451f);
                instancePath2.lineTo(12.003701f, 14.921581f);
                instancePath2.cubicTo(9.665079f, 15.109543f, 6.2516403f, 16.491343f, 4.4758644f, 20.821827f);
                instancePath2.cubicTo(4.180841f, 21.541285f, 3.457108f, 21.535069f, 3.2995987f, 20.60254f);
                instancePath2.cubicTo(2.0531158f, 13.222767f, 6.2516403f, 8.214798f, 12.003701f, 7.3083787f);
                instancePath2.lineTo(12.003701f, 3.9980292f);
                instancePath2.cubicTo(12.003701f, 3.4457445f, 12.451417f, 2.9980292f, 13.003701f, 2.9980292f);
                instancePath2.close();
                instancePath2.moveTo(13.203f, 4.478f);
                instancePath2.lineTo(13.203702f, 8.334088f);
                instancePath2.lineTo(12.190495f, 8.493752f);
                instancePath2.cubicTo(7.364929f, 9.254172f, 4.214323f, 13.013382f, 4.2834125f, 18.252748f);
                instancePath2.lineTo(4.29f, 18.54f);
                instancePath2.lineTo(4.3153105f, 18.498507f);
                instancePath2.cubicTo(6.0892243f, 15.641751f, 8.769406f, 14.066792f, 11.62178f, 13.75265f);
                instancePath2.lineTo(11.907564f, 13.725438f);
                instancePath2.lineTo(13.203702f, 13.6212635f);
                instancePath2.lineTo(13.203f, 17.724f);
                instancePath2.lineTo(19.891f, 11.101f);
                instancePath2.lineTo(13.203f, 4.478f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
