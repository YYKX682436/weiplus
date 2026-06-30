package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chat_room_rule_reject_red extends l95.c {
    private final int width = 10;
    private final int height = 10;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 10;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                instancePaint3.setColor(-372399);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.0f, 10.0f);
                instancePath.cubicTo(2.23858f, 10.0f, 0.0f, 7.76142f, 0.0f, 5.0f);
                instancePath.cubicTo(0.0f, 2.23858f, 2.23858f, 0.0f, 5.0f, 0.0f);
                instancePath.cubicTo(7.76142f, 0.0f, 10.0f, 2.23858f, 10.0f, 5.0f);
                instancePath.cubicTo(10.0f, 7.76142f, 7.76142f, 10.0f, 5.0f, 10.0f);
                instancePath.close();
                instancePath.moveTo(6.50262f, 2.96705f);
                instancePath.lineTo(7.03296f, 3.49738f);
                instancePath.lineTo(5.53033f, 5.0f);
                instancePath.lineTo(7.03291f, 6.50258f);
                instancePath.lineTo(6.50258f, 7.03291f);
                instancePath.lineTo(5.0f, 5.53033f);
                instancePath.lineTo(3.49742f, 7.03291f);
                instancePath.lineTo(2.96709f, 6.50258f);
                instancePath.lineTo(4.46967f, 5.0f);
                instancePath.lineTo(2.96705f, 3.49738f);
                instancePath.lineTo(3.49738f, 2.96705f);
                instancePath.lineTo(5.0f, 4.46967f);
                instancePath.lineTo(6.50262f, 2.96705f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
