package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class float_ball_record extends l95.c {
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
        instancePath.moveTo(5.59961f, 12.5f);
        instancePath.cubicTo(5.59961f, 16.0346f, 8.46538f, 18.9004f, 12.0f, 18.9004f);
        instancePath.cubicTo(15.5346f, 18.9004f, 18.4004f, 16.0346f, 18.4004f, 12.5f);
        instancePath.lineTo(18.4004f, 11.0f);
        instancePath.lineTo(19.5996f, 11.0f);
        instancePath.lineTo(19.5996f, 12.5f);
        instancePath.cubicTo(19.5996f, 16.4955f, 16.5165f, 19.7674f, 12.5996f, 20.0732f);
        instancePath.lineTo(12.5996f, 23.0f);
        instancePath.lineTo(11.4004f, 23.0f);
        instancePath.lineTo(11.4004f, 20.0732f);
        instancePath.cubicTo(7.48346f, 19.7674f, 4.40039f, 16.4955f, 4.40039f, 12.5f);
        instancePath.lineTo(4.40039f, 11.0f);
        instancePath.lineTo(5.59961f, 11.0f);
        instancePath.lineTo(5.59961f, 12.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.0f, 2.0f);
        instancePath2.cubicTo(14.4853f, 2.0f, 16.5f, 4.01472f, 16.5f, 6.5f);
        instancePath2.lineTo(16.5f, 12.5f);
        instancePath2.lineTo(16.4941f, 12.7314f);
        instancePath2.cubicTo(16.3737f, 15.1092f, 14.4077f, 17.0f, 12.0f, 17.0f);
        instancePath2.cubicTo(9.59234f, 17.0f, 7.62632f, 15.1092f, 7.50586f, 12.7314f);
        instancePath2.lineTo(7.5f, 12.5f);
        instancePath2.lineTo(7.5f, 6.5f);
        instancePath2.cubicTo(7.5f, 4.01472f, 9.51472f, 2.0f, 12.0f, 2.0f);
        instancePath2.close();
        instancePath2.moveTo(12.0f, 3.2002f);
        instancePath2.cubicTo(10.1775f, 3.2002f, 8.7002f, 4.67746f, 8.7002f, 6.5f);
        instancePath2.lineTo(8.7002f, 12.5f);
        instancePath2.cubicTo(8.7002f, 14.3225f, 10.1775f, 15.7998f, 12.0f, 15.7998f);
        instancePath2.cubicTo(13.8225f, 15.7998f, 15.2998f, 14.3225f, 15.2998f, 12.5f);
        instancePath2.lineTo(15.2998f, 6.5f);
        instancePath2.cubicTo(15.2998f, 4.67746f, 13.8225f, 3.2002f, 12.0f, 3.2002f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
