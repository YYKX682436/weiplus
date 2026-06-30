package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_audio_panel_close extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.10916f, 4.63429f);
        instancePath.lineTo(11.6457f, 9.17159f);
        instancePath.cubicTo(11.8409f, 9.36687f, 12.1575f, 9.3669f, 12.3528f, 9.17165f);
        instancePath.lineTo(16.8908f, 4.63429f);
        instancePath.cubicTo(17.4115f, 4.11359f, 18.1106f, 3.96849f, 18.4523f, 4.3102f);
        instancePath.lineTo(19.6898f, 5.54764f);
        instancePath.cubicTo(20.0315f, 5.88934f, 19.8864f, 6.58846f, 19.3657f, 7.10916f);
        instancePath.lineTo(14.8278f, 11.6456f);
        instancePath.cubicTo(14.6325f, 11.8409f, 14.6325f, 12.1575f, 14.8278f, 12.3528f);
        instancePath.lineTo(19.3657f, 16.8908f);
        instancePath.cubicTo(19.8864f, 17.4115f, 20.0315f, 18.1106f, 19.6898f, 18.4523f);
        instancePath.lineTo(18.4523f, 19.6898f);
        instancePath.cubicTo(18.1106f, 20.0315f, 17.4115f, 19.8864f, 16.8908f, 19.3657f);
        instancePath.lineTo(12.3528f, 14.8278f);
        instancePath.cubicTo(12.1575f, 14.6325f, 11.8409f, 14.6325f, 11.6456f, 14.8278f);
        instancePath.lineTo(7.10916f, 19.3657f);
        instancePath.cubicTo(6.58846f, 19.8864f, 5.88934f, 20.0315f, 5.54764f, 19.6898f);
        instancePath.lineTo(4.3102f, 18.4523f);
        instancePath.cubicTo(3.96849f, 18.1106f, 4.11359f, 17.4115f, 4.63429f, 16.8908f);
        instancePath.lineTo(9.17165f, 12.3528f);
        instancePath.cubicTo(9.3669f, 12.1575f, 9.36687f, 11.8409f, 9.17159f, 11.6457f);
        instancePath.lineTo(4.63429f, 7.10916f);
        instancePath.cubicTo(4.11359f, 6.58846f, 3.96849f, 5.88934f, 4.3102f, 5.54764f);
        instancePath.lineTo(5.54764f, 4.3102f);
        instancePath.cubicTo(5.88934f, 3.96849f, 6.58846f, 4.11359f, 7.10916f, 4.63429f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
