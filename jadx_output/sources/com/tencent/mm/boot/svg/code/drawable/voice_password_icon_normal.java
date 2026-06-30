package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class voice_password_icon_normal extends l95.c {
    private final int width = 240;
    private final int height = 240;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 240;
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -4094.0f, 0.0f, 1.0f, -5370.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 4094.0f, 0.0f, 1.0f, 5370.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(120.0f, 0.0f);
                instancePath.cubicTo(186.27417f, 0.0f, 240.0f, 53.72583f, 240.0f, 120.0f);
                instancePath.cubicTo(240.0f, 186.27417f, 186.27417f, 240.0f, 120.0f, 240.0f);
                instancePath.cubicTo(53.72583f, 240.0f, 0.0f, 186.27417f, 0.0f, 120.0f);
                instancePath.cubicTo(0.0f, 53.72583f, 53.72583f, 0.0f, 120.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(87.27273f, 109.09091f);
                instancePath2.lineTo(87.27273f, 121.55844f);
                instancePath2.cubicTo(87.27273f, 140.49391f, 102.62296f, 155.84416f, 121.55844f, 155.84416f);
                instancePath2.cubicTo(140.49391f, 155.84416f, 155.84416f, 140.49391f, 155.84416f, 121.55844f);
                instancePath2.lineTo(155.84416f, 109.09091f);
                instancePath2.lineTo(165.19481f, 109.09091f);
                instancePath2.lineTo(165.19481f, 121.55844f);
                instancePath2.cubicTo(165.19481f, 144.07864f, 148.13507f, 162.61435f, 126.233894f, 164.94727f);
                instancePath2.lineTo(126.233765f, 183.8961f);
                instancePath2.lineTo(116.88312f, 183.8961f);
                instancePath2.lineTo(116.88344f, 164.94731f);
                instancePath2.cubicTo(94.98204f, 162.6146f, 77.92208f, 144.0788f, 77.92208f, 121.55844f);
                instancePath2.lineTo(77.92208f, 109.09091f);
                instancePath2.lineTo(87.27273f, 109.09091f);
                instancePath2.close();
                instancePath2.moveTo(121.55844f, 59.22078f);
                instancePath2.cubicTo(135.3297f, 59.22078f, 146.4935f, 70.38459f, 146.4935f, 84.155846f);
                instancePath2.lineTo(146.4935f, 84.155846f);
                instancePath2.lineTo(146.4935f, 121.55844f);
                instancePath2.cubicTo(146.4935f, 135.3297f, 135.3297f, 146.4935f, 121.55844f, 146.4935f);
                instancePath2.cubicTo(107.787186f, 146.4935f, 96.623375f, 135.3297f, 96.623375f, 121.55844f);
                instancePath2.lineTo(96.623375f, 121.55844f);
                instancePath2.lineTo(96.623375f, 84.155846f);
                instancePath2.cubicTo(96.623375f, 70.38459f, 107.787186f, 59.22078f, 121.55844f, 59.22078f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
