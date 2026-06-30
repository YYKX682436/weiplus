package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class audio_filled extends l95.c {
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
        instancePath.moveTo(14.5f, 7.02649f);
        instancePath.cubicTo(15.272f, 7.02649f, 15.8979f, 6.40063f, 15.8979f, 5.6286f);
        instancePath.cubicTo(15.8979f, 4.85657f, 15.272f, 4.23071f, 14.5f, 4.23071f);
        instancePath.cubicTo(13.728f, 4.23071f, 13.1021f, 4.85657f, 13.1021f, 5.6286f);
        instancePath.cubicTo(13.1021f, 6.40063f, 13.728f, 7.02649f, 14.5f, 7.02649f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.5f, 9.30316f);
        instancePath2.cubicTo(3.5f, 8.69564f, 3.99249f, 8.20316f, 4.6f, 8.20316f);
        instancePath2.cubicTo(5.20751f, 8.20316f, 5.7f, 8.69564f, 5.7f, 9.30316f);
        instancePath2.lineTo(5.7f, 13.1032f);
        instancePath2.cubicTo(5.7f, 13.7107f, 5.20751f, 14.2032f, 4.6f, 14.2032f);
        instancePath2.cubicTo(3.99249f, 14.2032f, 3.5f, 13.7107f, 3.5f, 13.1032f);
        instancePath2.lineTo(3.5f, 9.30316f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.4389f, 10.6094f);
        instancePath3.cubicTo(8.4389f, 10.0019f, 8.93139f, 9.50937f, 9.5389f, 9.50937f);
        instancePath3.cubicTo(10.1464f, 9.50937f, 10.6389f, 10.0019f, 10.6389f, 10.6094f);
        instancePath3.lineTo(10.6389f, 19.5345f);
        instancePath3.cubicTo(10.6389f, 20.142f, 10.1464f, 20.6345f, 9.5389f, 20.6345f);
        instancePath3.cubicTo(8.93139f, 20.6345f, 8.4389f, 20.142f, 8.4389f, 19.5345f);
        instancePath3.lineTo(8.4389f, 10.6094f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(13.3778f, 9.30316f);
        instancePath4.cubicTo(13.3778f, 8.69564f, 13.8703f, 8.20316f, 14.4778f, 8.20316f);
        instancePath4.cubicTo(15.0853f, 8.20316f, 15.5778f, 8.69564f, 15.5778f, 9.30316f);
        instancePath4.lineTo(15.5778f, 15.7496f);
        instancePath4.cubicTo(15.5778f, 16.3571f, 15.0853f, 16.8496f, 14.4778f, 16.8496f);
        instancePath4.cubicTo(13.8703f, 16.8496f, 13.3778f, 16.3571f, 13.3778f, 15.7496f);
        instancePath4.lineTo(13.3778f, 9.30316f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(18.3167f, 10.5737f);
        instancePath5.cubicTo(18.3167f, 9.96621f, 18.8092f, 9.47372f, 19.4167f, 9.47372f);
        instancePath5.cubicTo(20.0242f, 9.47372f, 20.5167f, 9.96621f, 20.5167f, 10.5737f);
        instancePath5.lineTo(20.5167f, 13.1032f);
        instancePath5.cubicTo(20.5167f, 13.7107f, 20.0242f, 14.2032f, 19.4167f, 14.2032f);
        instancePath5.cubicTo(18.8092f, 14.2032f, 18.3167f, 13.7107f, 18.3167f, 13.1032f);
        instancePath5.lineTo(18.3167f, 10.5737f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
