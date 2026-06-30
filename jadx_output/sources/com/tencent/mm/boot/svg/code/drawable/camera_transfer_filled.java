package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class camera_transfer_filled extends l95.c {
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
                instancePath.moveTo(14.7344f, 3.9472f);
                instancePath.cubicTo(14.9005f, 3.9472f, 15.0557f, 4.02968f, 15.1487f, 4.16731f);
                instancePath.lineTo(17.0f, 6.90773f);
                instancePath.lineTo(21.0f, 6.90773f);
                instancePath.cubicTo(21.5523f, 6.90773f, 22.0f, 7.35545f, 22.0f, 7.90773f);
                instancePath.lineTo(22.0f, 18.7367f);
                instancePath.cubicTo(22.0f, 19.289f, 21.5523f, 19.7367f, 21.0f, 19.7367f);
                instancePath.lineTo(3.0f, 19.7367f);
                instancePath.cubicTo(2.44772f, 19.7367f, 2.0f, 19.289f, 2.0f, 18.7367f);
                instancePath.lineTo(2.0f, 7.90773f);
                instancePath.cubicTo(2.0f, 7.35545f, 2.44772f, 6.90773f, 3.0f, 6.90773f);
                instancePath.lineTo(7.0f, 6.90773f);
                instancePath.lineTo(8.85131f, 4.16731f);
                instancePath.cubicTo(8.94428f, 4.02968f, 9.09953f, 3.9472f, 9.26562f, 3.9472f);
                instancePath.lineTo(14.7344f, 3.9472f);
                instancePath.close();
                instancePath.moveTo(9.2f, 12.8291f);
                instancePath.lineTo(8.0f, 12.8291f);
                instancePath.cubicTo(8.0f, 10.6491f, 9.79086f, 8.88177f, 12.0f, 8.88177f);
                instancePath.cubicTo(12.8561f, 8.88177f, 13.6494f, 9.14719f, 14.3f, 9.59919f);
                instancePath.lineTo(14.3f, 8.88219f);
                instancePath.lineTo(15.5f, 8.88219f);
                instancePath.lineTo(15.5f, 11.3427f);
                instancePath.cubicTo(15.5f, 11.6189f, 15.2761f, 11.8427f, 15.0f, 11.8427f);
                instancePath.lineTo(12.5f, 11.8427f);
                instancePath.lineTo(12.5f, 10.6585f);
                instancePath.lineTo(13.7335f, 10.6585f);
                instancePath.cubicTo(13.2497f, 10.2819f, 12.6441f, 10.066f, 12.0f, 10.066f);
                instancePath.cubicTo(10.4536f, 10.066f, 9.2f, 11.3031f, 9.2f, 12.8291f);
                instancePath.close();
                instancePath.moveTo(15.9999f, 12.8291f);
                instancePath.cubicTo(15.9999f, 15.0092f, 14.2091f, 16.7765f, 11.9999f, 16.7765f);
                instancePath.cubicTo(11.1439f, 16.7765f, 10.3506f, 16.5111f, 9.7f, 16.0591f);
                instancePath.lineTo(9.7f, 16.777f);
                instancePath.lineTo(8.5f, 16.777f);
                instancePath.lineTo(8.5f, 14.3164f);
                instancePath.cubicTo(8.5f, 14.0403f, 8.72386f, 13.8164f, 9.0f, 13.8164f);
                instancePath.lineTo(11.5f, 13.8164f);
                instancePath.lineTo(11.5f, 15.0007f);
                instancePath.lineTo(10.2676f, 15.0007f);
                instancePath.cubicTo(10.7519f, 15.3774f, 11.357f, 15.5923f, 11.9999f, 15.5923f);
                instancePath.cubicTo(13.5463f, 15.5923f, 14.7999f, 14.3552f, 14.7999f, 12.8291f);
                instancePath.lineTo(15.9999f, 12.8291f);
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
