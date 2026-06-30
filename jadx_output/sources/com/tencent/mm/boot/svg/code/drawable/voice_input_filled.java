package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_input_filled extends l95.c {
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
        instancePaint3.setColor(-16777216);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(9.15175f, 20.4046f);
        instancePath.lineTo(8.54237f, 21.4602f);
        instancePath.lineTo(5.89784f, 22.2102f);
        instancePath.lineTo(5.22499f, 19.5442f);
        instancePath.lineTo(5.83437f, 18.4886f);
        instancePath.lineTo(9.15175f, 20.4046f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(8.2787f, 7.19267f);
        instancePath2.lineTo(7.17128f, 9.11064f);
        instancePath2.cubicTo(5.58515f, 11.8581f, 6.52639f, 15.3711f, 9.27382f, 16.9573f);
        instancePath2.cubicTo(12.0212f, 18.5434f, 15.5342f, 17.6021f, 17.1205f, 14.8548f);
        instancePath2.lineTo(18.2279f, 12.9368f);
        instancePath2.lineTo(19.7865f, 13.8362f);
        instancePath2.lineTo(18.6791f, 15.7542f);
        instancePath2.cubicTo(16.5959f, 19.3624f, 11.9827f, 20.5988f, 8.37441f, 18.5159f);
        instancePath2.cubicTo(4.76606f, 16.4326f, 3.52854f, 11.8186f, 5.61171f, 8.21025f);
        instancePath2.lineTo(6.71913f, 6.29228f);
        instancePath2.lineTo(8.2787f, 7.19267f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.1957f, 4.53056f);
        instancePath3.cubicTo(13.2125f, 2.76945f, 15.4649f, 2.16613f, 17.226f, 3.1829f);
        instancePath3.cubicTo(18.987f, 4.19972f, 19.5904f, 6.45211f, 18.5736f, 8.21318f);
        instancePath3.lineTo(15.4174f, 13.679f);
        instancePath3.cubicTo(14.4006f, 15.44f, 12.1492f, 16.0433f, 10.3881f, 15.0267f);
        instancePath3.cubicTo(8.62697f, 14.0099f, 8.02364f, 11.7585f, 9.04042f, 9.99736f);
        instancePath3.lineTo(12.1957f, 4.53056f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
