package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_sent_to_chatting extends l95.c {
    private final int width = 34;
    private final int height = 34;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 34;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.saveLayerAlpha(null, 76, 31);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -171.0f, 0.0f, 1.0f, -553.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 171.0f, 0.0f, 1.0f, 553.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.8f, 0.0f, 1.0f, 9.35f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(2.016f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0626365f, 9.508f);
        instancePath.cubicTo(1.5646234f, 14.110367f, 5.464044f, 17.692f, 10.2f, 17.692f);
        instancePath.cubicTo(14.935956f, 17.692f, 18.835377f, 14.110367f, 19.337364f, 9.508f);
        instancePath.lineTo(1.0626365f, 9.508f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.25f, 5.1f);
        instancePath2.cubicTo(2.8416739f, 5.1f, 1.7f, 3.958326f, 1.7f, 2.55f);
        instancePath2.cubicTo(1.7f, 1.1416739f, 2.8416739f, 0.0f, 4.25f, 0.0f);
        instancePath2.cubicTo(5.658326f, 0.0f, 6.8f, 1.1416739f, 6.8f, 2.55f);
        instancePath2.cubicTo(6.8f, 3.958326f, 5.658326f, 5.1f, 4.25f, 5.1f);
        instancePath2.close();
        instancePath2.moveTo(16.15f, 5.1f);
        instancePath2.cubicTo(14.741673f, 5.1f, 13.6f, 3.958326f, 13.6f, 2.55f);
        instancePath2.cubicTo(13.6f, 1.1416739f, 14.741673f, 0.0f, 16.15f, 0.0f);
        instancePath2.cubicTo(17.558327f, 0.0f, 18.7f, 1.1416739f, 18.7f, 2.55f);
        instancePath2.cubicTo(18.7f, 3.958326f, 17.558327f, 5.1f, 16.15f, 5.1f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(17.0f, 34.0f);
        instancePath3.cubicTo(7.6111593f, 34.0f, 0.0f, 26.388842f, 0.0f, 17.0f);
        instancePath3.cubicTo(0.0f, 7.6111593f, 7.6111593f, 0.0f, 17.0f, 0.0f);
        instancePath3.cubicTo(26.388842f, 0.0f, 34.0f, 7.6111593f, 34.0f, 17.0f);
        instancePath3.cubicTo(34.0f, 26.388842f, 26.388842f, 34.0f, 17.0f, 34.0f);
        instancePath3.close();
        instancePath3.moveTo(17.0f, 32.3f);
        instancePath3.cubicTo(25.449957f, 32.3f, 32.3f, 25.449957f, 32.3f, 17.0f);
        instancePath3.cubicTo(32.3f, 8.550043f, 25.449957f, 1.7f, 17.0f, 1.7f);
        instancePath3.cubicTo(8.550043f, 1.7f, 1.7f, 8.550043f, 1.7f, 17.0f);
        instancePath3.cubicTo(1.7f, 25.449957f, 8.550043f, 32.3f, 17.0f, 32.3f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
