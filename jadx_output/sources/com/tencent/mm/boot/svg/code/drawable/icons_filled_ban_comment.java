package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_ban_comment extends l95.c {
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.131603f, 6.2535715f);
                instancePath.lineTo(16.825377f, 18.946735f);
                instancePath.cubicTo(15.394642f, 19.61799f, 13.7498045f, 20.0f, 12.0f, 20.0f);
                instancePath.cubicTo(10.8710165f, 20.0f, 9.78573f, 19.840973f, 8.773454f, 19.547836f);
                instancePath.lineTo(8.773454f, 19.547836f);
                instancePath.lineTo(5.790501f, 20.978193f);
                instancePath.cubicTo(5.705353f, 21.019022f, 5.6103826f, 21.034904f, 5.516583f, 21.024002f);
                instancePath.cubicTo(5.2422876f, 20.992117f, 5.0457745f, 20.74391f, 5.077659f, 20.469614f);
                instancePath.lineTo(5.077659f, 20.469614f);
                instancePath.lineTo(5.3797565f, 17.870733f);
                instancePath.cubicTo(3.306998f, 16.313334f, 2.0f, 14.036405f, 2.0f, 11.5f);
                instancePath.cubicTo(2.0f, 9.520164f, 2.7963367f, 7.6984215f, 4.131603f, 6.2535715f);
                instancePath.close();
                instancePath.moveTo(3.0606601f, 3.0606601f);
                instancePath.lineTo(4.1213202f, 2.0f);
                instancePath.lineTo(6.513101f, 4.3926344f);
                instancePath.cubicTo(8.088355f, 3.5122216f, 9.9738035f, 3.0f, 12.0f, 3.0f);
                instancePath.cubicTo(17.522848f, 3.0f, 22.0f, 6.8055797f, 22.0f, 11.5f);
                instancePath.cubicTo(22.0f, 13.716352f, 21.002035f, 15.73458f, 19.367222f, 17.247734f);
                instancePath.lineTo(21.091883f, 18.970562f);
                instancePath.lineTo(20.031223f, 20.031223f);
                instancePath.lineTo(3.0606601f, 3.0606601f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
