package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class top_story_fullscreen extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
        }
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha(null, 230, 31);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(1.3f);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(3.0198066E-14f, 5.8581343f);
            instancePath.lineTo(3.0142555E-14f, 0.37615737f);
            instancePath.cubicTo(3.0122264E-14f, 0.21047194f, 0.13431458f, 0.07615736f, 0.3f, 0.07615736f);
            instancePath.lineTo(6.0260386f, 0.07615736f);
            canvas.drawPath(instancePath, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(3.0198066E-14f, 10.096506f);
            instancePath2.lineTo(3.0142555E-14f, 15.578483f);
            instancePath2.cubicTo(3.06779E-14f, 15.744168f, 0.13431458f, 15.878483f, 0.3f, 15.878483f);
            instancePath2.lineTo(6.0260386f, 15.878483f);
            canvas.drawPath(instancePath2, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(15.876585f, 9.997669f);
            instancePath3.lineTo(15.876585f, 15.6773205f);
            instancePath3.cubicTo(15.876585f, 15.843005f, 15.74227f, 15.977321f, 15.576586f, 15.977321f);
            instancePath3.lineTo(9.850547f, 15.977321f);
            canvas.drawPath(instancePath3, instancePaint7);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint4, looper);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(15.876585f, 5.9344497f);
            instancePath4.lineTo(15.876585f, 0.3f);
            instancePath4.cubicTo(15.876585f, 0.13431458f, 15.74227f, 7.796637E-15f, 15.576586f, 7.827072E-15f);
            instancePath4.lineTo(9.916438f, 7.1054274E-15f);
            canvas.drawPath(instancePath4, instancePaint8);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
