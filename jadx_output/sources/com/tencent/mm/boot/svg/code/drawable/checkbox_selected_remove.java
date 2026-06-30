package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_remove extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                instancePath.moveTo(1.2002f, 11.99995f);
                instancePath.cubicTo(1.2002f, 6.0352745f, 6.0355244f, 1.19995f, 12.0002f, 1.19995f);
                instancePath.lineTo(12.000199f, 1.19995f);
                instancePath.cubicTo(17.964874f, 1.19995f, 22.8002f, 6.0352745f, 22.8002f, 11.99995f);
                instancePath.lineTo(22.8002f, 11.999949f);
                instancePath.cubicTo(22.8002f, 17.964626f, 17.964874f, 22.79995f, 12.000199f, 22.79995f);
                instancePath.lineTo(12.0002f, 22.79995f);
                instancePath.cubicTo(6.0355244f, 22.79995f, 1.2002f, 17.964626f, 1.2002f, 11.999949f);
                instancePath.lineTo(1.2002f, 11.99995f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(11.3695f, 11.3706f);
                instancePath2.lineTo(12.6295f, 11.3706f);
                instancePath2.lineTo(17.3545f, 11.3706f);
                instancePath2.lineTo(17.3545f, 12.6307f);
                instancePath2.lineTo(12.6295f, 12.6307f);
                instancePath2.lineTo(11.3695f, 12.6307f);
                instancePath2.lineTo(6.64453f, 12.6307f);
                instancePath2.lineTo(6.64453f, 11.3706f);
                instancePath2.lineTo(11.3695f, 11.3706f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
