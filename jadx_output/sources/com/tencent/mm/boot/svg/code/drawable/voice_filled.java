package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_filled extends l95.c {
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
        instancePath.moveTo(11.1398f, 18.6398f);
        instancePath.cubicTo(12.7594f, 16.8991f, 13.75f, 14.5652f, 13.75f, 12.0f);
        instancePath.cubicTo(13.75f, 9.43482f, 12.7594f, 7.10099f, 11.1398f, 5.36023f);
        instancePath.lineTo(9.72441f, 6.77561f);
        instancePath.cubicTo(10.9826f, 8.15344f, 11.75f, 9.98711f, 11.75f, 12.0f);
        instancePath.cubicTo(11.75f, 14.0129f, 10.9826f, 15.8466f, 9.72441f, 17.2244f);
        instancePath.lineTo(11.1398f, 18.6398f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.0853f, 20.5853f);
        instancePath2.cubicTo(15.2021f, 18.3461f, 16.5f, 15.3246f, 16.5f, 12.0f);
        instancePath2.cubicTo(16.5f, 8.67542f, 15.2021f, 5.65396f, 13.0853f, 3.4147f);
        instancePath2.lineTo(14.5f, 2.0f);
        instancePath2.cubicTo(16.9785f, 4.6016f, 18.5f, 8.12313f, 18.5f, 12.0f);
        instancePath2.cubicTo(18.5f, 15.8769f, 16.9785f, 19.3984f, 14.5f, 22.0f);
        instancePath2.lineTo(13.0853f, 20.5853f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(7.77674f, 15.2768f);
        instancePath3.cubicTo(8.53876f, 14.3992f, 9.0f, 13.2535f, 9.0f, 12.0f);
        instancePath3.cubicTo(9.0f, 10.7466f, 8.53876f, 9.60082f, 7.77674f, 8.72328f);
        instancePath3.lineTo(4.5f, 12.0f);
        instancePath3.lineTo(7.77674f, 15.2768f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
