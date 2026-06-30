package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_negative_feedback extends l95.c {
    private final int width = 21;
    private final int height = 14;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 21;
        }
        if (i17 == 1) {
            return 14;
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setColor(637534208);
            instancePaint3.setStrokeWidth(0.583333f);
            instancePaint3.setColor(637534208);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(0.291667f, 6.999997f);
            instancePath.cubicTo(0.291667f, 3.2950885f, 3.2950885f, 0.291667f, 6.999997f, 0.291667f);
            instancePath.lineTo(14.000038f, 0.291667f);
            instancePath.cubicTo(17.704947f, 0.291667f, 20.708368f, 3.2950885f, 20.708368f, 6.999997f);
            instancePath.lineTo(20.708368f, 7.000037f);
            instancePath.cubicTo(20.708368f, 10.704946f, 17.704947f, 13.708367f, 14.000038f, 13.708367f);
            instancePath.lineTo(6.999997f, 13.708367f);
            instancePath.cubicTo(3.2950885f, 13.708367f, 0.291667f, 10.704946f, 0.291667f, 7.000037f);
            instancePath.lineTo(0.291667f, 6.999997f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-3618616);
            instancePaint4.setColor(-3618616);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(14.7576f, 6.0f);
            instancePath2.cubicTo(14.2053f, 6.0f, 13.7576f, 6.44772f, 13.7576f, 7.0f);
            instancePath2.cubicTo(13.7576f, 7.55228f, 14.2053f, 8.0f, 14.7576f, 8.0f);
            instancePath2.cubicTo(15.3099f, 8.0f, 15.7576f, 7.55228f, 15.7576f, 7.0f);
            instancePath2.cubicTo(15.7576f, 6.44772f, 15.3099f, 6.0f, 14.7576f, 6.0f);
            instancePath2.close();
            instancePath2.moveTo(6.0f, 7.00002f);
            instancePath2.cubicTo(6.0f, 6.44773f, 6.44772f, 6.00002f, 7.0f, 6.00002f);
            instancePath2.cubicTo(7.55228f, 6.00002f, 8.0f, 6.44773f, 8.0f, 7.00002f);
            instancePath2.cubicTo(8.0f, 7.5523f, 7.55228f, 8.00002f, 7.0f, 8.00002f);
            instancePath2.cubicTo(6.44772f, 8.00002f, 6.0f, 7.5523f, 6.0f, 7.00002f);
            instancePath2.close();
            instancePath2.moveTo(9.75745f, 7.00002f);
            instancePath2.cubicTo(9.75745f, 6.44773f, 10.2052f, 6.00002f, 10.7574f, 6.00002f);
            instancePath2.cubicTo(11.3097f, 6.00002f, 11.7574f, 6.44773f, 11.7574f, 7.00002f);
            instancePath2.cubicTo(11.7574f, 7.5523f, 11.3097f, 8.00002f, 10.7574f, 8.00002f);
            instancePath2.cubicTo(10.2052f, 8.00002f, 9.75745f, 7.5523f, 9.75745f, 7.00002f);
            instancePath2.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
