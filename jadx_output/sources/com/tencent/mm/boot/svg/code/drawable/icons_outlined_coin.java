package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_coin extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
            l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(30.0f, 0.0f);
            instancePath.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
            instancePath.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
            instancePath.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
            instancePath.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(30.0f, 3.6f);
            instancePath.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
            instancePath.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
            instancePath.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
            instancePath.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
            instancePath.close();
            instancePath.moveTo(24.0f, 18.0f);
            instancePath.lineTo(28.799f, 27.6f);
            instancePath.lineTo(31.2f, 27.6f);
            instancePath.lineTo(36.0f, 18.0f);
            instancePath.lineTo(40.5f, 18.0f);
            instancePath.lineTo(35.7f, 27.6f);
            instancePath.lineTo(40.5f, 27.600037f);
            instancePath.lineTo(40.5f, 31.200037f);
            instancePath.lineTo(31.8f, 31.2f);
            instancePath.lineTo(31.8f, 34.5f);
            instancePath.lineTo(40.5f, 34.5f);
            instancePath.lineTo(40.5f, 38.1f);
            instancePath.lineTo(31.8f, 38.1f);
            instancePath.lineTo(31.800074f, 43.5f);
            instancePath.lineTo(28.200073f, 43.5f);
            instancePath.lineTo(28.2f, 38.1f);
            instancePath.lineTo(19.5f, 38.1f);
            instancePath.lineTo(19.5f, 34.5f);
            instancePath.lineTo(28.2f, 34.5f);
            instancePath.lineTo(28.2f, 31.2f);
            instancePath.lineTo(19.5f, 31.200037f);
            instancePath.lineTo(19.5f, 27.600037f);
            instancePath.lineTo(24.299f, 27.6f);
            instancePath.lineTo(19.5f, 18.0f);
            instancePath.lineTo(24.0f, 18.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
