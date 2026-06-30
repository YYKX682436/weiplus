package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class official_accounts_new_medium extends l95.c {
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
        instancePath.moveTo(2.65039f, 4.44058f);
        instancePath.cubicTo(2.65053f, 3.79763f, 3.28225f, 3.35774f, 3.87988f, 3.54244f);
        instancePath.lineTo(3.99902f, 3.58783f);
        instancePath.lineTo(8.87695f, 5.82062f);
        instancePath.cubicTo(10.2289f, 6.43942f, 11.3093f, 7.46015f, 12.0f, 8.70046f);
        instancePath.cubicTo(12.6907f, 7.46015f, 13.7711f, 6.43942f, 15.123f, 5.82062f);
        instancePath.lineTo(20.001f, 3.58783f);
        instancePath.lineTo(20.1201f, 3.54244f);
        instancePath.cubicTo(20.7177f, 3.35774f, 21.3495f, 3.79763f, 21.3496f, 4.44058f);
        instancePath.lineTo(21.3496f, 12.2283f);
        instancePath.cubicTo(21.3495f, 14.8679f, 19.7993f, 17.2675f, 17.377f, 18.3762f);
        instancePath.lineTo(12.3574f, 20.6737f);
        instancePath.cubicTo(12.347f, 20.6785f, 12.3357f, 20.681f, 12.3252f, 20.6853f);
        instancePath.cubicTo(12.2392f, 20.7205f, 12.1494f, 20.7439f, 12.0576f, 20.75f);
        instancePath.lineTo(11.9424f, 20.75f);
        instancePath.cubicTo(11.8503f, 20.7439f, 11.7601f, 20.7207f, 11.6738f, 20.6853f);
        instancePath.cubicTo(11.6636f, 20.6811f, 11.6527f, 20.6783f, 11.6426f, 20.6737f);
        instancePath.lineTo(6.62305f, 18.3762f);
        instancePath.cubicTo(4.20074f, 17.2675f, 2.65048f, 14.8679f, 2.65039f, 12.2283f);
        instancePath.lineTo(2.65039f, 4.44058f);
        instancePath.close();
        instancePath.moveTo(4.34961f, 12.2283f);
        instancePath.cubicTo(4.3497f, 14.2128f, 5.51582f, 16.0168f, 7.33691f, 16.8503f);
        instancePath.lineTo(11.1504f, 18.5954f);
        instancePath.lineTo(11.1504f, 11.9685f);
        instancePath.cubicTo(11.1504f, 9.984f, 9.98424f, 8.18005f, 8.16309f, 7.34649f);
        instancePath.lineTo(4.34961f, 5.60043f);
        instancePath.lineTo(4.34961f, 12.2283f);
        instancePath.close();
        instancePath.moveTo(15.8369f, 7.34649f);
        instancePath.cubicTo(14.0158f, 8.18005f, 12.8496f, 9.984f, 12.8496f, 11.9685f);
        instancePath.lineTo(12.8496f, 18.5954f);
        instancePath.lineTo(16.6631f, 16.8503f);
        instancePath.cubicTo(18.4842f, 16.0168f, 19.6503f, 14.2128f, 19.6504f, 12.2283f);
        instancePath.lineTo(19.6504f, 5.60043f);
        instancePath.lineTo(15.8369f, 7.34649f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
