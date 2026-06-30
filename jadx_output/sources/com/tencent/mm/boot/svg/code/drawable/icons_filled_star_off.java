package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_star_off extends l95.c {
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
                instancePaint3.setColor(-436207616);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(5.12124f, 3.0f);
                instancePath.lineTo(9.34126f, 7.22f);
                instancePath.lineTo(11.1032f, 3.65194f);
                instancePath.cubicTo(11.3476f, 3.15669f, 11.9472f, 2.95335f, 12.4425f, 3.19777f);
                instancePath.cubicTo(12.6397f, 3.2951f, 12.7993f, 3.45473f, 12.8967f, 3.65194f);
                instancePath.lineTo(15.2327f, 8.38536f);
                instancePath.lineTo(20.4564f, 9.1444f);
                instancePath.cubicTo(21.0029f, 9.22382f, 21.3816f, 9.73126f, 21.3022f, 10.2778f);
                instancePath.cubicTo(21.2706f, 10.4954f, 21.1681f, 10.6966f, 21.0106f, 10.8501f);
                instancePath.lineTo(17.2307f, 14.5346f);
                instancePath.lineTo(17.3493f, 15.228f);
                instancePath.lineTo(22.0918f, 19.9706f);
                instancePath.lineTo(21.0311f, 21.0312f);
                instancePath.lineTo(4.06058f, 4.06066f);
                instancePath.lineTo(5.12124f, 3.0f);
                instancePath.close();
                instancePath.moveTo(6.894f, 9.0f);
                instancePath.lineTo(18.4031f, 20.5068f);
                instancePath.cubicTo(18.293f, 20.8508f, 17.9998f, 21.1232f, 17.6192f, 21.1885f);
                instancePath.cubicTo(17.4025f, 21.2256f, 17.1795f, 21.1903f, 16.9848f, 21.088f);
                instancePath.lineTo(12.3127f, 18.6317f);
                instancePath.lineTo(7.6405f, 21.088f);
                instancePath.cubicTo(7.15165f, 21.345f, 6.54702f, 21.157f, 6.29002f, 20.6682f);
                instancePath.cubicTo(6.18768f, 20.4735f, 6.15237f, 20.2506f, 6.18955f, 20.0338f);
                instancePath.lineTo(7.08185f, 14.8313f);
                instancePath.lineTo(3.30199f, 11.1468f);
                instancePath.cubicTo(2.90651f, 10.7613f, 2.89841f, 10.1282f, 3.28391f, 9.73271f);
                instancePath.cubicTo(3.43742f, 9.57523f, 3.63857f, 9.47274f, 3.8562f, 9.44112f);
                instancePath.lineTo(6.894f, 9.0f);
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
