package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class game_haowan_share extends l95.c {
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
        instancePaint3.setColor(-419430401);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.6f, 4.668629f);
        instancePath.lineTo(5.599f, 5.867629f);
        instancePath.lineTo(4.0f, 5.868629f);
        instancePath.lineTo(4.0f, 13.468629f);
        instancePath.lineTo(12.0f, 13.468629f);
        instancePath.lineTo(12.0f, 5.868629f);
        instancePath.lineTo(10.399f, 5.867629f);
        instancePath.lineTo(10.4f, 4.668629f);
        instancePath.lineTo(12.16f, 4.668629f);
        instancePath.cubicTo(12.734376f, 4.668629f, 13.2f, 5.1163445f, 13.2f, 5.668629f);
        instancePath.lineTo(13.2f, 13.66863f);
        instancePath.cubicTo(13.2f, 14.220914f, 12.734376f, 14.66863f, 12.16f, 14.66863f);
        instancePath.lineTo(3.84f, 14.66863f);
        instancePath.cubicTo(3.2656238f, 14.66863f, 2.8f, 14.220914f, 2.8f, 13.66863f);
        instancePath.lineTo(2.8f, 5.668629f);
        instancePath.cubicTo(2.8f, 5.1163445f, 3.2656238f, 4.668629f, 3.84f, 4.668629f);
        instancePath.lineTo(5.6f, 4.668629f);
        instancePath.close();
        instancePath.moveTo(8.594112f, 1.2343146f);
        instancePath.lineTo(10.856854f, 3.4970562f);
        instancePath.lineTo(10.008327f, 4.3455844f);
        instancePath.lineTo(8.6f, 2.937f);
        instancePath.lineTo(8.6f, 8.668629f);
        instancePath.lineTo(7.4f, 8.668629f);
        instancePath.lineTo(7.4f, 2.993f);
        instancePath.lineTo(6.048528f, 4.3455844f);
        instancePath.lineTo(5.2f, 3.4970562f);
        instancePath.lineTo(7.462742f, 1.2343146f);
        instancePath.cubicTo(7.7751613f, 0.92189515f, 8.281693f, 0.92189515f, 8.594112f, 1.2343146f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
