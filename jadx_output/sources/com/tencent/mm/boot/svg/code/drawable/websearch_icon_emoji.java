package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_emoji extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -72.0f, 0.0f, 1.0f, -603.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = l95.c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 1.5f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(7.5f, 14.1f);
        instancePath.cubicTo(11.14508f, 14.1f, 14.1f, 11.14508f, 14.1f, 7.5f);
        instancePath.cubicTo(14.1f, 3.8549206f, 11.14508f, 0.9f, 7.5f, 0.9f);
        instancePath.cubicTo(3.8549206f, 0.9f, 0.9f, 3.8549206f, 0.9f, 7.5f);
        instancePath.cubicTo(0.9f, 11.14508f, 3.8549206f, 14.1f, 7.5f, 14.1f);
        instancePath.close();
        instancePath.moveTo(7.5f, 15.0f);
        instancePath.cubicTo(3.3578644f, 15.0f, 0.0f, 11.642136f, 0.0f, 7.5f);
        instancePath.cubicTo(0.0f, 3.3578644f, 3.3578644f, 0.0f, 7.5f, 0.0f);
        instancePath.cubicTo(11.642136f, 0.0f, 15.0f, 3.3578644f, 15.0f, 7.5f);
        instancePath.cubicTo(15.0f, 11.642136f, 11.642136f, 15.0f, 7.5f, 15.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.5f, 11.475f);
        instancePath2.cubicTo(9.177456f, 11.475f, 10.586946f, 10.327704f, 10.986585f, 8.775f);
        instancePath2.lineTo(4.013416f, 8.775f);
        instancePath2.cubicTo(4.4130545f, 10.327704f, 5.8225446f, 11.475f, 7.5f, 11.475f);
        instancePath2.close();
        instancePath2.moveTo(3.0f, 7.875f);
        instancePath2.lineTo(12.0f, 7.875f);
        instancePath2.cubicTo(12.0f, 10.360281f, 9.985281f, 12.375f, 7.5f, 12.375f);
        instancePath2.cubicTo(5.0147185f, 12.375f, 3.0f, 10.360281f, 3.0f, 7.875f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.875f, 6.375f);
        instancePath3.cubicTo(4.2536798f, 6.375f, 3.75f, 5.8713202f, 3.75f, 5.25f);
        instancePath3.cubicTo(3.75f, 4.6286798f, 4.2536798f, 4.125f, 4.875f, 4.125f);
        instancePath3.cubicTo(5.4963202f, 4.125f, 6.0f, 4.6286798f, 6.0f, 5.25f);
        instancePath3.cubicTo(6.0f, 5.8713202f, 5.4963202f, 6.375f, 4.875f, 6.375f);
        instancePath3.close();
        instancePath3.moveTo(10.125f, 6.375f);
        instancePath3.cubicTo(9.503679f, 6.375f, 9.0f, 5.8713202f, 9.0f, 5.25f);
        instancePath3.cubicTo(9.0f, 4.6286798f, 9.503679f, 4.125f, 10.125f, 4.125f);
        instancePath3.cubicTo(10.746321f, 4.125f, 11.25f, 4.6286798f, 11.25f, 5.25f);
        instancePath3.cubicTo(11.25f, 5.8713202f, 10.746321f, 6.375f, 10.125f, 6.375f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
