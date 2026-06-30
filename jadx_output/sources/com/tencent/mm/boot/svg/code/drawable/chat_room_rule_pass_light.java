package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chat_room_rule_pass_light extends l95.c {
    private final int width = 12;
    private final int height = 12;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 12;
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
                instancePaint3.setColor(-1659134);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(1.0f, 6.0f);
                instancePath.cubicTo(1.0f, 8.76142f, 3.23858f, 11.0f, 6.0f, 11.0f);
                instancePath.cubicTo(8.76142f, 11.0f, 11.0f, 8.76142f, 11.0f, 6.0f);
                instancePath.cubicTo(11.0f, 3.23858f, 8.76142f, 1.0f, 6.0f, 1.0f);
                instancePath.cubicTo(3.23858f, 1.0f, 1.0f, 3.23858f, 1.0f, 6.0f);
                instancePath.close();
                instancePath.moveTo(8.21137f, 4.27f);
                instancePath.lineTo(5.41171f, 7.06966f);
                instancePath.lineTo(4.02876f, 5.68671f);
                instancePath.lineTo(3.49999f, 6.21548f);
                instancePath.lineTo(4.70586f, 7.42222f);
                instancePath.cubicTo(5.09629f, 7.81293f, 5.72954f, 7.81311f, 6.12019f, 7.42262f);
                instancePath.lineTo(8.74264f, 4.80126f);
                instancePath.lineTo(8.21137f, 4.27f);
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
