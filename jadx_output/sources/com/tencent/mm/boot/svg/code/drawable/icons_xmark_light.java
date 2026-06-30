package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_xmark_light extends l95.c {
    private final int width = 20;
    private final int height = 20;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 20;
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
            instancePaint3.setColor(419430400);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(10.0f, 2.0f);
            instancePath.cubicTo(14.418278f, 2.0f, 18.0f, 5.581722f, 18.0f, 10.0f);
            instancePath.cubicTo(18.0f, 14.418278f, 14.418278f, 18.0f, 10.0f, 18.0f);
            instancePath.cubicTo(5.581722f, 18.0f, 2.0f, 14.418278f, 2.0f, 10.0f);
            instancePath.cubicTo(2.0f, 5.581722f, 5.581722f, 2.0f, 10.0f, 2.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-436207616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(12.5927f, 6.70016f);
            instancePath2.lineTo(13.2998f, 7.40727f);
            instancePath2.lineTo(10.7071f, 9.99999f);
            instancePath2.lineTo(13.2663f, 12.5592f);
            instancePath2.lineTo(12.5592f, 13.2663f);
            instancePath2.lineTo(9.99995f, 10.7071f);
            instancePath2.lineTo(7.40722f, 13.2998f);
            instancePath2.lineTo(6.70011f, 12.5927f);
            instancePath2.lineTo(9.29285f, 9.99999f);
            instancePath2.lineTo(6.66663f, 7.37376f);
            instancePath2.lineTo(7.37373f, 6.66666f);
            instancePath2.lineTo(9.99995f, 9.29288f);
            instancePath2.lineTo(12.5927f, 6.70016f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
