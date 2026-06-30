package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_bell_on extends l95.c {
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
                instancePaint3.setColor(-15616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.9999f, 20.0f);
                instancePath.lineTo(5.1866f, 20.0f);
                instancePath.cubicTo(4.3807f, 20.0f, 3.901f, 19.061f, 4.38073f, 18.408f);
                instancePath.cubicTo(5.46019f, 16.9387f, 5.99989f, 15.4693f, 5.99989f, 14.0f);
                instancePath.lineTo(5.99989f, 10.0f);
                instancePath.cubicTo(5.99989f, 7.37734f, 7.6826f, 5.14769f, 10.0273f, 4.3318f);
                instancePath.cubicTo(10.0093f, 4.22388f, 9.99989f, 4.11304f, 9.99989f, 4.0f);
                instancePath.cubicTo(9.99989f, 2.89543f, 10.8953f, 2.0f, 11.9999f, 2.0f);
                instancePath.cubicTo(13.1045f, 2.0f, 13.9999f, 2.89543f, 13.9999f, 4.0f);
                instancePath.cubicTo(13.9999f, 4.11304f, 13.9905f, 4.22388f, 13.9725f, 4.3318f);
                instancePath.cubicTo(16.3172f, 5.14769f, 17.9999f, 7.37734f, 17.9999f, 10.0f);
                instancePath.lineTo(17.9999f, 14.0f);
                instancePath.cubicTo(17.9999f, 15.4693f, 18.5396f, 16.9386f, 19.619f, 18.4079f);
                instancePath.cubicTo(20.0876f, 19.0457f, 19.619f, 20.0f, 18.8131f, 20.0f);
                instancePath.lineTo(12.9999f, 20.0f);
                instancePath.lineTo(12.9999f, 20.2f);
                instancePath.cubicTo(12.9999f, 20.7523f, 12.5522f, 21.2f, 11.9999f, 21.2f);
                instancePath.cubicTo(11.4476f, 21.2f, 10.9999f, 20.7523f, 10.9999f, 20.2f);
                instancePath.lineTo(10.9999f, 20.0f);
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
