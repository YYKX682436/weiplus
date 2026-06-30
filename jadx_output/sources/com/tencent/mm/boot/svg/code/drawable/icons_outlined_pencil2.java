package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pencil2 extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 32;
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
                instancePaint3.setColor(-436207616);
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.1009f, 26.8294f);
                instancePath.lineTo(5.56561f, 27.6297f);
                instancePath.cubicTo(4.65409f, 27.7905f, 3.85999f, 26.9964f, 4.02085f, 26.0849f);
                instancePath.lineTo(4.8212f, 21.5497f);
                instancePath.lineTo(21.9769f, 4.38836f);
                instancePath.cubicTo(22.4976f, 3.86751f, 23.3419f, 3.86745f, 23.8627f, 4.38821f);
                instancePath.lineTo(27.2568f, 7.78232f);
                instancePath.cubicTo(27.7774f, 8.30296f, 27.7775f, 9.14706f, 27.2569f, 9.66778f);
                instancePath.lineTo(24.7894f, 12.1361f);
                instancePath.lineTo(24.7926f, 12.1393f);
                instancePath.lineTo(23.6612f, 13.2707f);
                instancePath.lineTo(23.6582f, 13.2676f);
                instancePath.lineTo(10.1009f, 26.8294f);
                instancePath.close();
                instancePath.moveTo(22.5269f, 12.1363f);
                instancePath.lineTo(9.32606f, 25.3414f);
                instancePath.lineTo(5.66271f, 25.9878f);
                instancePath.lineTo(6.30923f, 22.3243f);
                instancePath.lineTo(19.5099f, 9.11929f);
                instancePath.lineTo(22.5269f, 12.1363f);
                instancePath.close();
                instancePath.moveTo(23.658f, 11.0047f);
                instancePath.lineTo(25.9369f, 8.72516f);
                instancePath.lineTo(22.9199f, 5.70817f);
                instancePath.lineTo(20.6411f, 7.98773f);
                instancePath.lineTo(23.658f, 11.0047f);
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
