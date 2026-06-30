package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class status_accountkey extends l95.c {
    private final int width = 46;
    private final int height = 46;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 46;
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
        instancePaint3.setColor(-12206054);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(21.72f, 0.0f);
        instancePath.lineTo(24.06f, 0.0f);
        instancePath.cubicTo(35.45f, 0.38f, 45.34f, 10.09f, 46.0f, 21.46f);
        instancePath.lineTo(46.0f, 24.3f);
        instancePath.cubicTo(45.5f, 35.7f, 35.65f, 45.5f, 24.26f, 46.0f);
        instancePath.lineTo(21.93f, 46.0f);
        instancePath.cubicTo(10.47f, 45.63f, 0.54f, 35.78f, 0.0f, 24.34f);
        instancePath.lineTo(0.0f, 21.82f);
        instancePath.cubicTo(0.44f, 10.39f, 10.3f, 0.51f, 21.72f, 0.0f);
        instancePath.lineTo(21.72f, 0.0f);
        instancePath.close();
        instancePath.moveTo(17.58f, 13.59f);
        instancePath.cubicTo(15.96f, 15.34f, 16.17f, 17.82f, 15.82f, 20.0f);
        instancePath.lineTo(12.99f, 20.0f);
        instancePath.cubicTo(13.0f, 24.34f, 13.0f, 28.67f, 13.0f, 33.0f);
        instancePath.lineTo(33.0f, 33.0f);
        instancePath.cubicTo(33.0f, 28.67f, 33.0f, 24.34f, 33.01f, 20.0f);
        instancePath.lineTo(30.18f, 20.0f);
        instancePath.cubicTo(29.83f, 17.83f, 30.07f, 15.34f, 28.43f, 13.6f);
        instancePath.cubicTo(25.84f, 10.18f, 20.17f, 10.17f, 17.58f, 13.59f);
        instancePath.lineTo(17.58f, 13.59f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(18.82f, 20.0f);
        instancePath2.cubicTo(18.8f, 17.38f, 19.71f, 13.9f, 22.99f, 14.0f);
        instancePath2.cubicTo(26.26f, 13.87f, 27.22f, 17.37f, 27.18f, 20.0f);
        instancePath2.lineTo(18.82f, 20.0f);
        instancePath2.lineTo(18.82f, 20.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 11.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(5.58f, 2.59f);
        instancePath3.cubicTo(8.17f, -0.83f, 13.84f, -0.82f, 16.43f, 2.6f);
        instancePath3.cubicTo(18.07f, 4.34f, 17.83f, 6.83f, 18.18f, 9.0f);
        instancePath3.lineTo(21.01f, 9.0f);
        instancePath3.cubicTo(21.0f, 13.34f, 21.0f, 17.67f, 21.0f, 22.0f);
        instancePath3.lineTo(1.0f, 22.0f);
        instancePath3.cubicTo(1.0f, 17.67f, 1.0f, 13.34f, 0.99f, 9.0f);
        instancePath3.lineTo(3.82f, 9.0f);
        instancePath3.cubicTo(4.17f, 6.82f, 3.96f, 4.34f, 5.58f, 2.59f);
        instancePath3.lineTo(5.58f, 2.59f);
        instancePath3.close();
        instancePath3.moveTo(6.82f, 9.0f);
        instancePath3.lineTo(15.18f, 9.0f);
        instancePath3.cubicTo(15.22f, 6.37f, 14.26f, 2.87f, 10.99f, 3.0f);
        instancePath3.cubicTo(7.71f, 2.9f, 6.8f, 6.38f, 6.82f, 9.0f);
        instancePath3.lineTo(6.82f, 9.0f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
