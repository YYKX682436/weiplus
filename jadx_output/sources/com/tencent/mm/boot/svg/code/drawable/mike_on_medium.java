package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mike_on_medium extends l95.c {
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
        instancePath.moveTo(12.0f, 2.0f);
        instancePath.cubicTo(9.51472f, 2.0f, 7.5f, 4.01472f, 7.5f, 6.5f);
        instancePath.lineTo(7.5f, 12.5f);
        instancePath.cubicTo(7.5f, 14.9853f, 9.51472f, 17.0f, 12.0f, 17.0f);
        instancePath.cubicTo(14.4853f, 17.0f, 16.5f, 14.9853f, 16.5f, 12.5f);
        instancePath.lineTo(16.5f, 6.5f);
        instancePath.cubicTo(16.5f, 4.01472f, 14.4853f, 2.0f, 12.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(15.0f, 12.5f);
        instancePath.lineTo(15.0f, 6.5f);
        instancePath.cubicTo(15.0f, 4.84315f, 13.6569f, 3.5f, 12.0f, 3.5f);
        instancePath.cubicTo(10.3431f, 3.5f, 9.0f, 4.84315f, 9.0f, 6.5f);
        instancePath.lineTo(9.0f, 12.5f);
        instancePath.cubicTo(9.0f, 14.1569f, 10.3431f, 15.5f, 12.0f, 15.5f);
        instancePath.cubicTo(13.6569f, 15.5f, 15.0f, 14.1569f, 15.0f, 12.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.75f, 19.963f);
        instancePath2.cubicTo(16.54f, 19.5867f, 19.5f, 16.389f, 19.5f, 12.5f);
        instancePath2.lineTo(19.5f, 11.0f);
        instancePath2.lineTo(18.0f, 11.0f);
        instancePath2.lineTo(18.0f, 12.5f);
        instancePath2.cubicTo(18.0f, 15.8137f, 15.3137f, 18.5f, 12.0f, 18.5f);
        instancePath2.cubicTo(8.68629f, 18.5f, 6.0f, 15.8137f, 6.0f, 12.5f);
        instancePath2.lineTo(6.0f, 11.0f);
        instancePath2.lineTo(4.5f, 11.0f);
        instancePath2.lineTo(4.5f, 12.5f);
        instancePath2.cubicTo(4.5f, 16.389f, 7.46001f, 19.5867f, 11.25f, 19.963f);
        instancePath2.lineTo(11.25f, 23.0f);
        instancePath2.lineTo(12.75f, 23.0f);
        instancePath2.lineTo(12.75f, 19.963f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
