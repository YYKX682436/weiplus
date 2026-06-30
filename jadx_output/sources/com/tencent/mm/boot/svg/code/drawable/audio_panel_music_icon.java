package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_panel_music_icon extends l95.c {
    private final int width = 48;
    private final int height = 48;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 48;
        }
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
            instancePaint3.setColor(-13054593);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(48.0f, 0.0f);
            instancePath.lineTo(48.0f, 48.0f);
            instancePath.lineTo(0.0f, 48.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(32.5787f, 17.5787f);
            instancePath2.cubicTo(30.1787f, 15.5654f, 26.0854f, 15.5921f, 25.6987f, 12.3387f);
            instancePath2.lineTo(25.6987f, 12.2854f);
            instancePath2.cubicTo(25.6987f, 11.7787f, 25.3387f, 11.3254f, 24.832f, 11.2587f);
            instancePath2.cubicTo(24.2187f, 11.1787f, 23.6987f, 11.6587f, 23.6987f, 12.2454f);
            instancePath2.lineTo(23.6987f, 23.8187f);
            instancePath2.cubicTo(23.6987f, 28.4721f, 22.7787f, 27.4854f, 19.8454f, 28.2187f);
            instancePath2.cubicTo(17.6854f, 28.7654f, 15.8854f, 30.2187f, 15.8854f, 32.4587f);
            instancePath2.cubicTo(15.8854f, 34.6987f, 17.832f, 36.4987f, 20.0854f, 36.4587f);
            instancePath2.cubicTo(25.552f, 36.3387f, 25.6987f, 30.8854f, 25.6987f, 28.3121f);
            instancePath2.lineTo(25.6987f, 18.4454f);
            instancePath2.cubicTo(25.7654f, 17.0587f, 26.4454f, 16.9121f, 27.8854f, 17.3521f);
            instancePath2.cubicTo(29.792f, 18.1121f, 32.0054f, 18.4187f, 32.8054f, 20.4321f);
            instancePath2.cubicTo(33.3387f, 22.2854f, 32.0854f, 23.9787f, 30.352f, 24.7254f);
            instancePath2.cubicTo(30.1387f, 24.8187f, 30.232f, 25.1254f, 30.4587f, 25.0987f);
            instancePath2.cubicTo(33.832f, 24.5387f, 35.8187f, 20.1387f, 32.5787f, 17.5921f);
            instancePath2.lineTo(32.5787f, 17.5787f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
