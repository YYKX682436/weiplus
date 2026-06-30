package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pay_cards extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
            instancePaint3.setColor(-436207616);
            instancePaint3.setColor(-436207616);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(18.3984f, 18.6004f);
            instancePath.lineTo(15.3984f, 18.6004f);
            instancePath.lineTo(15.3984f, 17.4004f);
            instancePath.lineTo(18.3984f, 17.4004f);
            instancePath.lineTo(18.3984f, 14.4004f);
            instancePath.lineTo(19.5984f, 14.4004f);
            instancePath.lineTo(19.5984f, 17.4004f);
            instancePath.lineTo(22.5984f, 17.4004f);
            instancePath.lineTo(22.5984f, 18.6004f);
            instancePath.lineTo(19.5984f, 18.6004f);
            instancePath.lineTo(19.5984f, 21.6004f);
            instancePath.lineTo(18.3984f, 21.6004f);
            instancePath.lineTo(18.3984f, 18.6004f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            instancePaint4.setColor(-436207616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(21.0f, 4.0f);
            instancePath2.cubicTo(21.5523f, 4.0f, 22.0f, 4.44772f, 22.0f, 5.0f);
            instancePath2.lineTo(22.0f, 14.4004f);
            instancePath2.lineTo(20.7998f, 14.4004f);
            instancePath2.lineTo(20.7998f, 5.2002f);
            instancePath2.lineTo(3.2002f, 5.2002f);
            instancePath2.lineTo(3.2002f, 18.7998f);
            instancePath2.lineTo(14.3984f, 18.7998f);
            instancePath2.lineTo(14.3984f, 20.0f);
            instancePath2.lineTo(3.0f, 20.0f);
            instancePath2.cubicTo(2.44772f, 20.0f, 2.0f, 19.5523f, 2.0f, 19.0f);
            instancePath2.lineTo(2.0f, 5.0f);
            instancePath2.cubicTo(2.0f, 4.44772f, 2.44772f, 4.0f, 3.0f, 4.0f);
            instancePath2.lineTo(21.0f, 4.0f);
            instancePath2.close();
            instancePath2.moveTo(19.5f, 9.2002f);
            instancePath2.lineTo(4.5f, 9.2002f);
            instancePath2.lineTo(4.5f, 8.0f);
            instancePath2.lineTo(19.5f, 8.0f);
            instancePath2.lineTo(19.5f, 9.2002f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
