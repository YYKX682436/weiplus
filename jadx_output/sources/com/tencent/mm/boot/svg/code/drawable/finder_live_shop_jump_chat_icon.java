package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_shop_jump_chat_icon extends l95.c {
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
                android.graphics.Matrix instanceMatrix = l95.c.instanceMatrix(looper);
                float[] instanceMatrixArray = l95.c.instanceMatrixArray(looper);
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
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.35f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(4.44497f, 10.1786f);
                instancePath.lineTo(4.73816f, 10.2635f);
                instancePath.cubicTo(5.35236f, 10.4413f, 6.00147f, 10.5333f, 6.66667f, 10.5333f);
                instancePath.cubicTo(9.93296f, 10.5333f, 12.53336f, 8.323f, 12.53336f, 5.66666f);
                instancePath.cubicTo(12.53336f, 3.01032f, 9.93296f, 0.8f, 6.66667f, 0.8f);
                instancePath.cubicTo(3.40038f, 0.8f, 0.8f, 3.01032f, 0.8f, 5.66666f);
                instancePath.cubicTo(0.8f, 7.05061f, 1.50462f, 8.3507f, 2.73373f, 9.2742f);
                instancePath.lineTo(3.10084f, 9.5501f);
                instancePath.lineTo(2.94413f, 10.8982f);
                instancePath.lineTo(4.44497f, 10.1786f);
                instancePath.close();
                instancePath.moveTo(6.66667f, 11.3333f);
                instancePath.cubicTo(5.91401f, 11.3333f, 5.19049f, 11.2273f, 4.51564f, 11.0319f);
                instancePath.lineTo(2.527f, 11.9855f);
                instancePath.cubicTo(2.47024f, 12.0127f, 2.40693f, 12.0233f, 2.34439f, 12.016f);
                instancePath.cubicTo(2.16153f, 11.9947f, 2.03052f, 11.8293f, 2.05178f, 11.6464f);
                instancePath.lineTo(2.25317f, 9.9138f);
                instancePath.cubicTo(0.87134f, 8.8756f, 8.881784E-16f, 7.3576f, 8.881784E-16f, 5.66667f);
                instancePath.cubicTo(8.881784E-16f, 2.53705f, 2.98477f, 0.0f, 6.66667f, 0.0f);
                instancePath.cubicTo(10.34856f, 0.0f, 13.33336f, 2.53705f, 13.33336f, 5.66667f);
                instancePath.cubicTo(13.33336f, 8.7963f, 10.34856f, 11.3333f, 6.66667f, 11.3333f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(0.0f, 0.0f);
                instancePath2.lineTo(16.0f, 0.0f);
                instancePath2.lineTo(16.0f, 16.0f);
                instancePath2.lineTo(0.0f, 16.0f);
                instancePath2.lineTo(0.0f, 0.0f);
                instancePath2.close();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
