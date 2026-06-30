package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_nfc extends l95.c {
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
        instancePath.moveTo(6.19167f, 6.8483f);
        instancePath.cubicTo(4.96112f, 8.07885f, 4.2f, 9.77885f, 4.2f, 11.6566f);
        instancePath.cubicTo(4.2f, 13.5344f, 4.96112f, 15.2344f, 6.19167f, 16.4649f);
        instancePath.lineTo(5.34315f, 17.3135f);
        instancePath.cubicTo(3.89543f, 15.8658f, 3.0f, 13.8658f, 3.0f, 11.6566f);
        instancePath.cubicTo(3.0f, 9.44748f, 3.89543f, 7.44748f, 5.34315f, 5.99977f);
        instancePath.lineTo(6.19167f, 6.8483f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.11091f, 15.5457f);
        instancePath2.cubicTo(6.11561f, 14.5504f, 5.5f, 13.1754f, 5.5f, 11.6566f);
        instancePath2.cubicTo(5.5f, 10.1378f, 6.11561f, 8.76284f, 7.11091f, 7.76753f);
        instancePath2.lineTo(7.95944f, 8.61606f);
        instancePath2.cubicTo(7.18129f, 9.39421f, 6.7f, 10.4692f, 6.7f, 11.6566f);
        instancePath2.cubicTo(6.7f, 12.844f, 7.18129f, 13.919f, 7.95944f, 14.6972f);
        instancePath2.lineTo(7.11091f, 15.5457f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(19.8581f, 18.8f);
        instancePath3.lineTo(10.2581f, 18.8f);
        instancePath3.lineTo(10.2581f, 5.2f);
        instancePath3.lineTo(19.8581f, 5.2f);
        instancePath3.lineTo(19.8581f, 18.8f);
        instancePath3.close();
        instancePath3.moveTo(21.0581f, 19.0f);
        instancePath3.cubicTo(21.0581f, 19.5523f, 20.6104f, 20.0f, 20.0581f, 20.0f);
        instancePath3.lineTo(10.0581f, 20.0f);
        instancePath3.cubicTo(9.50579f, 20.0f, 9.05807f, 19.5523f, 9.05807f, 19.0f);
        instancePath3.lineTo(9.05807f, 5.0f);
        instancePath3.cubicTo(9.05807f, 4.44771f, 9.50579f, 4.0f, 10.0581f, 4.0f);
        instancePath3.lineTo(20.0581f, 4.0f);
        instancePath3.cubicTo(20.6104f, 4.0f, 21.0581f, 4.44771f, 21.0581f, 5.0f);
        instancePath3.lineTo(21.0581f, 19.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(16.0581f, 17.0f);
        instancePath4.cubicTo(16.0581f, 17.5523f, 15.6104f, 18.0f, 15.0581f, 18.0f);
        instancePath4.cubicTo(14.5058f, 18.0f, 14.0581f, 17.5523f, 14.0581f, 17.0f);
        instancePath4.cubicTo(14.0581f, 16.4477f, 14.5058f, 16.0f, 15.0581f, 16.0f);
        instancePath4.cubicTo(15.6104f, 16.0f, 16.0581f, 16.4477f, 16.0581f, 17.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
