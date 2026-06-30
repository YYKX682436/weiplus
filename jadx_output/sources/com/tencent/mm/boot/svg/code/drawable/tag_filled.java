package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class tag_filled extends l95.c {
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
                instancePaint3.setColor(-16777216);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.20696f, 12.7929f);
                instancePath.cubicTo(2.81643f, 13.1834f, 2.81643f, 13.8166f, 3.20696f, 14.2071f);
                instancePath.lineTo(9.79274f, 20.7929f);
                instancePath.cubicTo(10.1833f, 21.1834f, 10.8164f, 21.1834f, 11.207f, 20.7929f);
                instancePath.lineTo(20.707f, 11.2929f);
                instancePath.cubicTo(20.8945f, 11.1054f, 20.9998f, 10.851f, 20.9998f, 10.5858f);
                instancePath.lineTo(20.9998f, 4.0f);
                instancePath.cubicTo(20.9998f, 3.44772f, 20.5521f, 3.0f, 19.9998f, 3.0f);
                instancePath.lineTo(13.4141f, 3.0f);
                instancePath.cubicTo(13.1488f, 3.0f, 12.8945f, 3.10536f, 12.707f, 3.29289f);
                instancePath.lineTo(3.20696f, 12.7929f);
                instancePath.close();
                instancePath.moveTo(15.9998f, 10.0f);
                instancePath.cubicTo(17.1044f, 10.0f, 17.9998f, 9.10457f, 17.9998f, 8.0f);
                instancePath.cubicTo(17.9998f, 6.89543f, 17.1044f, 6.0f, 15.9998f, 6.0f);
                instancePath.cubicTo(14.8953f, 6.0f, 13.9998f, 6.89543f, 13.9998f, 8.0f);
                instancePath.cubicTo(13.9998f, 9.10457f, 14.8953f, 10.0f, 15.9998f, 10.0f);
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
