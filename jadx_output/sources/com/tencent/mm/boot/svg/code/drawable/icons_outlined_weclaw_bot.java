package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_weclaw_bot extends l95.c {
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
        instancePath.moveTo(10.125f, 6.9375f);
        instancePath.cubicTo(10.8499f, 6.9375f, 11.4375f, 7.52513f, 11.4375f, 8.25f);
        instancePath.cubicTo(11.4375f, 8.97487f, 10.8499f, 9.5625f, 10.125f, 9.5625f);
        instancePath.cubicTo(9.40013f, 9.5625f, 8.8125f, 8.97487f, 8.8125f, 8.25f);
        instancePath.cubicTo(8.8125f, 7.52513f, 9.40013f, 6.9375f, 10.125f, 6.9375f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(13.875f, 6.9375f);
        instancePath2.cubicTo(14.5999f, 6.9375f, 15.1875f, 7.52513f, 15.1875f, 8.25f);
        instancePath2.cubicTo(15.1875f, 8.97487f, 14.5999f, 9.5625f, 13.875f, 9.5625f);
        instancePath2.cubicTo(13.1501f, 9.5625f, 12.5625f, 8.97487f, 12.5625f, 8.25f);
        instancePath2.cubicTo(12.5625f, 7.52513f, 13.1501f, 6.9375f, 13.875f, 6.9375f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(20.1025f, 3.00488f);
        instancePath3.cubicTo(20.6067f, 3.05621f, 21.0f, 3.48232f, 21.0f, 4.0f);
        instancePath3.lineTo(21.0f, 20.0f);
        instancePath3.lineTo(20.9951f, 20.1025f);
        instancePath3.cubicTo(20.9472f, 20.573f, 20.573f, 20.9472f, 20.1025f, 20.9951f);
        instancePath3.lineTo(20.0f, 21.0f);
        instancePath3.lineTo(4.0f, 21.0f);
        instancePath3.cubicTo(3.48232f, 21.0f, 3.05621f, 20.6067f, 3.00488f, 20.1025f);
        instancePath3.lineTo(3.0f, 20.0f);
        instancePath3.lineTo(3.0f, 4.0f);
        instancePath3.cubicTo(3.0f, 3.44772f, 3.44772f, 3.0f, 4.0f, 3.0f);
        instancePath3.lineTo(20.0f, 3.0f);
        instancePath3.lineTo(20.1025f, 3.00488f);
        instancePath3.close();
        instancePath3.moveTo(4.2002f, 19.7998f);
        instancePath3.lineTo(19.7998f, 19.7998f);
        instancePath3.lineTo(19.7998f, 4.2002f);
        instancePath3.lineTo(4.2002f, 4.2002f);
        instancePath3.lineTo(4.2002f, 19.7998f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
