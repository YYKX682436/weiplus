package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_listen_later_regural extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 != 2) {
            return 0;
        }
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(72.0f, 0.0f);
        instancePath2.lineTo(72.0f, 72.0f);
        instancePath2.lineTo(0.0f, 72.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-436207616);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(20.5503f, 9.0f);
        instancePath3.lineTo(20.5503f, 16.95f);
        instancePath3.lineTo(28.5f, 16.95f);
        instancePath3.lineTo(28.5f, 20.55f);
        instancePath3.lineTo(20.5503f, 20.55f);
        instancePath3.lineTo(20.5503f, 28.5f);
        instancePath3.lineTo(16.9503f, 28.5f);
        instancePath3.lineTo(16.9503f, 20.55f);
        instancePath3.lineTo(9.0f, 20.55f);
        instancePath3.lineTo(9.0f, 16.95f);
        instancePath3.lineTo(16.9503f, 16.95f);
        instancePath3.lineTo(16.9503f, 9.0f);
        instancePath3.lineTo(20.5503f, 9.0f);
        instancePath3.close();
        instancePath3.moveTo(33.0f, 16.95f);
        instancePath3.lineTo(63.0f, 16.95f);
        instancePath3.lineTo(63.0f, 20.55f);
        instancePath3.lineTo(33.0f, 20.55f);
        instancePath3.lineTo(33.0f, 16.95f);
        instancePath3.close();
        instancePath3.moveTo(63.0f, 35.55f);
        instancePath3.lineTo(15.0f, 35.55f);
        instancePath3.lineTo(15.0f, 39.15f);
        instancePath3.lineTo(63.0f, 39.15f);
        instancePath3.lineTo(63.0f, 35.55f);
        instancePath3.close();
        instancePath3.moveTo(63.0f, 53.55f);
        instancePath3.lineTo(15.0f, 53.55f);
        instancePath3.lineTo(15.0f, 57.15f);
        instancePath3.lineTo(63.0f, 57.15f);
        instancePath3.lineTo(63.0f, 53.55f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
