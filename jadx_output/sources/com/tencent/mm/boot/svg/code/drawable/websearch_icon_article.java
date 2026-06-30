package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_article extends l95.c {
    private final int width = 12;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 12;
        }
        if (i17 == 1) {
            return 16;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-5066062);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -202.0f, 0.0f, 1.0f, -603.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 133.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.9f, 2.4f);
        instancePath.lineTo(3.9f, 15.6f);
        instancePath.lineTo(14.1f, 15.6f);
        instancePath.lineTo(14.1f, 2.4f);
        instancePath.lineTo(3.9f, 2.4f);
        instancePath.close();
        instancePath.moveTo(3.0f, 2.25f);
        instancePath.cubicTo(3.0f, 1.8357865f, 3.3357863f, 1.5f, 3.75f, 1.5f);
        instancePath.lineTo(14.25f, 1.5f);
        instancePath.cubicTo(14.664213f, 1.5f, 15.0f, 1.8357865f, 15.0f, 2.25f);
        instancePath.lineTo(15.0f, 15.75f);
        instancePath.cubicTo(15.0f, 16.164213f, 14.664213f, 16.5f, 14.25f, 16.5f);
        instancePath.lineTo(3.75f, 16.5f);
        instancePath.cubicTo(3.3357863f, 16.5f, 3.0f, 16.164213f, 3.0f, 15.75f);
        instancePath.lineTo(3.0f, 2.25f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.375f, 3.75f);
        instancePath2.cubicTo(6.9963202f, 3.75f, 7.5f, 4.2536798f, 7.5f, 4.875f);
        instancePath2.cubicTo(7.5f, 5.4963202f, 6.9963202f, 6.0f, 6.375f, 6.0f);
        instancePath2.cubicTo(5.7536798f, 6.0f, 5.25f, 5.4963202f, 5.25f, 4.875f);
        instancePath2.cubicTo(5.25f, 4.2536798f, 5.7536798f, 3.75f, 6.375f, 3.75f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(5.25f, 7.5f);
        instancePath3.lineTo(10.875f, 7.5f);
        instancePath3.lineTo(10.875f, 8.5f);
        instancePath3.lineTo(5.25f, 8.5f);
        instancePath3.lineTo(5.25f, 7.5f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(5.25f, 9.75f);
        instancePath4.lineTo(8.25f, 9.75f);
        instancePath4.lineTo(8.25f, 10.75f);
        instancePath4.lineTo(5.25f, 10.75f);
        instancePath4.lineTo(5.25f, 9.75f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(5.25f, 12.0f);
        instancePath5.lineTo(8.25f, 12.0f);
        instancePath5.lineTo(8.25f, 13.0f);
        instancePath5.lineTo(5.25f, 13.0f);
        instancePath5.lineTo(5.25f, 12.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
