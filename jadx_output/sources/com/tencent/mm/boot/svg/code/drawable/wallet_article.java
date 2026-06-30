package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class wallet_article extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
            instancePaint3.setColor(1275068416);
            instancePaint3.setColor(1275068416);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(5.33301f, 4.00008f);
            instancePath.cubicTo(5.33301f, 3.2637f, 5.92996f, 2.66675f, 6.66634f, 2.66675f);
            instancePath.lineTo(25.333f, 2.66675f);
            instancePath.cubicTo(26.0694f, 2.66675f, 26.6663f, 3.2637f, 26.6663f, 4.00008f);
            instancePath.lineTo(26.6663f, 28.0001f);
            instancePath.cubicTo(26.6663f, 28.7365f, 26.0694f, 29.3334f, 25.333f, 29.3334f);
            instancePath.lineTo(6.66634f, 29.3334f);
            instancePath.cubicTo(5.92996f, 29.3334f, 5.33301f, 28.7365f, 5.33301f, 28.0001f);
            instancePath.lineTo(5.33301f, 4.00008f);
            instancePath.close();
            instancePath.moveTo(6.93301f, 4.26675f);
            instancePath.lineTo(6.93301f, 27.7334f);
            instancePath.lineTo(25.0663f, 27.7334f);
            instancePath.lineTo(25.0663f, 4.26675f);
            instancePath.lineTo(6.93301f, 4.26675f);
            instancePath.close();
            instancePath.moveTo(11.333f, 10.6667f);
            instancePath.cubicTo(10.2284f, 10.6667f, 9.33301f, 9.77132f, 9.33301f, 8.66675f);
            instancePath.cubicTo(9.33301f, 7.56218f, 10.2284f, 6.66675f, 11.333f, 6.66675f);
            instancePath.cubicTo(12.4376f, 6.66675f, 13.333f, 7.56218f, 13.333f, 8.66675f);
            instancePath.cubicTo(13.333f, 9.77132f, 12.4376f, 10.6667f, 11.333f, 10.6667f);
            instancePath.close();
            instancePath.moveTo(9.33301f, 13.3334f);
            instancePath.lineTo(19.333f, 13.3334f);
            instancePath.lineTo(19.333f, 14.9334f);
            instancePath.lineTo(9.33301f, 14.9334f);
            instancePath.lineTo(9.33301f, 13.3334f);
            instancePath.close();
            instancePath.moveTo(9.33301f, 17.3334f);
            instancePath.lineTo(14.6663f, 17.3334f);
            instancePath.lineTo(14.6663f, 18.9334f);
            instancePath.lineTo(9.33301f, 18.9334f);
            instancePath.lineTo(9.33301f, 17.3334f);
            instancePath.close();
            instancePath.moveTo(9.33301f, 21.3334f);
            instancePath.lineTo(14.6663f, 21.3334f);
            instancePath.lineTo(14.6663f, 22.9334f);
            instancePath.lineTo(9.33301f, 22.9334f);
            instancePath.lineTo(9.33301f, 21.3334f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
