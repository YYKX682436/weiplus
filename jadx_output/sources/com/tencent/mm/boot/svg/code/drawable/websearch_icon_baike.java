package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class websearch_icon_baike extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -138.0f, 0.0f, 1.0f, -671.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 69.0f, 0.0f, 1.0f, 68.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(6.15f, 2.4f);
        instancePath.lineTo(6.15f, 13.35697f);
        instancePath.lineTo(13.5f, 13.35697f);
        instancePath.cubicTo(13.83137f, 13.35697f, 14.1f, 13.088341f, 14.1f, 12.756969f);
        instancePath.lineTo(14.1f, 11.400009f);
        instancePath.lineTo(14.1f, 3.0f);
        instancePath.cubicTo(14.1f, 2.6686292f, 13.83137f, 2.4f, 13.5f, 2.4f);
        instancePath.lineTo(6.15f, 2.4f);
        instancePath.close();
        instancePath.moveTo(5.25f, 2.4f);
        instancePath.lineTo(3.9f, 2.4f);
        instancePath.lineTo(3.9f, 13.35697f);
        instancePath.lineTo(5.25f, 13.35697f);
        instancePath.lineTo(5.25f, 2.4f);
        instancePath.close();
        instancePath.moveTo(14.1f, 14.132156f);
        instancePath.cubicTo(13.916262f, 14.212435f, 13.713331f, 14.256969f, 13.5f, 14.256969f);
        instancePath.lineTo(3.9f, 14.256969f);
        instancePath.lineTo(3.9f, 15.6f);
        instancePath.lineTo(13.5f, 15.6f);
        instancePath.cubicTo(13.83137f, 15.6f, 14.1f, 15.33137f, 14.1f, 15.0f);
        instancePath.lineTo(14.1f, 14.132156f);
        instancePath.close();
        instancePath.moveTo(3.0f, 1.5f);
        instancePath.lineTo(13.5f, 1.5f);
        instancePath.cubicTo(14.328427f, 1.5f, 15.0f, 2.171573f, 15.0f, 3.0f);
        instancePath.lineTo(15.0f, 15.0f);
        instancePath.cubicTo(15.0f, 15.828427f, 14.328427f, 16.5f, 13.5f, 16.5f);
        instancePath.lineTo(3.0f, 16.5f);
        instancePath.lineTo(3.0f, 1.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
