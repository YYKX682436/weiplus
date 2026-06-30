package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatroom_logo_white extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 16;
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
                instancePaint3.setColor(-855638017);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(10.4759f, 6.33203f);
                instancePath.cubicTo(10.4759f, 8.62007f, 8.62105f, 10.4749f, 6.33301f, 10.4749f);
                instancePath.cubicTo(6.07935f, 10.4749f, 5.83101f, 10.4521f, 5.58994f, 10.4084f);
                instancePath.cubicTo(5.54629f, 10.1674f, 5.52348f, 9.91902f, 5.52348f, 9.66536f);
                instancePath.cubicTo(5.52348f, 7.37733f, 7.3783f, 5.52251f, 9.66634f, 5.52251f);
                instancePath.cubicTo(9.92f, 5.52251f, 10.1683f, 5.54531f, 10.4094f, 5.58897f);
                instancePath.cubicTo(10.4531f, 5.83004f, 10.4759f, 6.07837f, 10.4759f, 6.33203f);
                instancePath.close();
                instancePath.moveTo(10.1365f, 4.68718f);
                instancePath.cubicTo(9.98172f, 4.67275f, 9.82489f, 4.66536f, 9.66634f, 4.66536f);
                instancePath.cubicTo(6.90492f, 4.66536f, 4.66634f, 6.90394f, 4.66634f, 9.66536f);
                instancePath.cubicTo(4.66634f, 9.82391f, 4.67372f, 9.98074f, 4.68816f, 10.1355f);
                instancePath.cubicTo(3.21842f, 9.49904f, 2.19015f, 8.03562f, 2.19015f, 6.33203f);
                instancePath.cubicTo(2.19015f, 4.04399f, 4.04497f, 2.18917f, 6.33301f, 2.18917f);
                instancePath.cubicTo(8.0366f, 2.18917f, 9.50002f, 3.21744f, 10.1365f, 4.68718f);
                instancePath.close();
                instancePath.moveTo(11.1188f, 4.87959f);
                instancePath.cubicTo(10.4965f, 2.82652f, 8.58929f, 1.33203f, 6.33301f, 1.33203f);
                instancePath.cubicTo(3.57158f, 1.33203f, 1.33301f, 3.57061f, 1.33301f, 6.33203f);
                instancePath.cubicTo(1.33301f, 8.58831f, 2.82749f, 10.4955f, 4.88057f, 11.1178f);
                instancePath.cubicTo(5.50284f, 13.1709f, 7.41006f, 14.6654f, 9.66634f, 14.6654f);
                instancePath.cubicTo(12.4278f, 14.6654f, 14.6663f, 12.4268f, 14.6663f, 9.66536f);
                instancePath.cubicTo(14.6663f, 7.40908f, 13.1719f, 5.50186f, 11.1188f, 4.87959f);
                instancePath.close();
                instancePath.moveTo(11.3112f, 5.86189f);
                instancePath.cubicTo(11.3256f, 6.01666f, 11.333f, 6.17348f, 11.333f, 6.33203f);
                instancePath.cubicTo(11.333f, 9.09346f, 9.09443f, 11.332f, 6.33301f, 11.332f);
                instancePath.cubicTo(6.17446f, 11.332f, 6.01764f, 11.3247f, 5.86286f, 11.3102f);
                instancePath.cubicTo(6.49933f, 12.78f, 7.96275f, 13.8082f, 9.66634f, 13.8082f);
                instancePath.cubicTo(11.9544f, 13.8082f, 13.8092f, 11.9534f, 13.8092f, 9.66536f);
                instancePath.cubicTo(13.8092f, 7.96178f, 12.7809f, 6.49836f, 11.3112f, 5.86189f);
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
