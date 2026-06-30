package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class photo_edit_mark extends l95.c {
    private final int width = 54;
    private final int height = 44;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 54;
        }
        if (i17 == 1) {
            return 44;
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.5f, 0.5f);
        instancePath.lineTo(46.5f, 0.5f);
        instancePath.lineTo(46.5f, 36.5f);
        instancePath.lineTo(0.5f, 36.5f);
        instancePath.lineTo(0.5f, 0.5f);
        instancePath.close();
        instancePath.moveTo(42.5f, 2.5f);
        instancePath.lineTo(42.5f, 32.5f);
        instancePath.lineTo(3.5f, 32.5f);
        instancePath.lineTo(3.5f, 2.5f);
        instancePath.lineTo(42.5f, 2.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(51.0f, 42.5f);
        instancePath2.lineTo(52.5f, 42.5f);
        instancePath2.lineTo(52.5f, 7.5f);
        instancePath2.lineTo(49.5f, 7.5f);
        instancePath2.lineTo(49.5f, 39.5f);
        instancePath2.lineTo(5.5f, 39.5f);
        instancePath2.lineTo(5.5f, 42.5f);
        instancePath2.lineTo(51.0f, 42.5f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(36.170597f, 14.009804f);
        instancePath3.lineTo(28.390347f, 19.793558f);
        instancePath3.lineTo(15.891026f, 9.5f);
        instancePath3.lineTo(0.5576923f, 22.578432f);
        instancePath3.lineTo(0.5576923f, 32.5f);
        instancePath3.lineTo(46.557693f, 32.5f);
        instancePath3.lineTo(46.557693f, 22.578432f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
