package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class trashcan extends l95.c {
    private final int width = 16;
    private final int height = 17;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 16;
        }
        if (i17 == 1) {
            return 17;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -167.0f, 0.0f, 1.0f, -386.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 165.0f, 0.0f, 1.0f, 384.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 2.5f, 0.0f, 1.0f, 2.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.144627f, 2.8333309f);
        instancePath.lineTo(3.8215883f, 14.206279f);
        instancePath.cubicTo(3.8425515f, 14.55846f, 4.134272f, 14.833331f, 4.4870768f, 14.833331f);
        instancePath.lineTo(10.512923f, 14.833331f);
        instancePath.cubicTo(10.865727f, 14.833331f, 11.157449f, 14.55846f, 11.1784115f, 14.206279f);
        instancePath.lineTo(11.855372f, 2.8333309f);
        instancePath.lineTo(3.144627f, 2.8333309f);
        instancePath.close();
        instancePath.moveTo(12.857142f, 2.8333309f);
        instancePath.lineTo(12.176645f, 14.2656975f);
        instancePath.cubicTo(12.124237f, 15.146152f, 11.394935f, 15.833331f, 10.512923f, 15.833331f);
        instancePath.lineTo(4.4870768f, 15.833331f);
        instancePath.cubicTo(3.6050653f, 15.833331f, 2.875763f, 15.146152f, 2.823355f, 14.2656975f);
        instancePath.lineTo(2.142857f, 2.8333309f);
        instancePath.lineTo(0.41666666f, 2.8333309f);
        instancePath.lineTo(0.41666666f, 2.2499974f);
        instancePath.cubicTo(0.41666666f, 2.0198789f, 0.6032147f, 1.8333308f, 0.8333333f, 1.8333308f);
        instancePath.lineTo(14.166667f, 1.8333308f);
        instancePath.cubicTo(14.396786f, 1.8333308f, 14.583333f, 2.0198789f, 14.583333f, 2.2499974f);
        instancePath.lineTo(14.583333f, 2.8333309f);
        instancePath.lineTo(12.857142f, 2.8333309f);
        instancePath.close();
        instancePath.moveTo(6.416677f, 5.0f);
        instancePath.lineTo(6.8333435f, 12.5f);
        instancePath.lineTo(5.8333335f, 12.5f);
        instancePath.lineTo(5.4166665f, 5.0f);
        instancePath.lineTo(6.416677f, 5.0f);
        instancePath.close();
        instancePath.moveTo(9.583333f, 5.0f);
        instancePath.lineTo(9.166667f, 12.5f);
        instancePath.lineTo(8.1666565f, 12.5f);
        instancePath.lineTo(8.5833235f, 5.0f);
        instancePath.lineTo(9.583333f, 5.0f);
        instancePath.close();
        instancePath.moveTo(9.166667f, 2.2737975E-5f);
        instancePath.cubicTo(9.396786f, 2.2737975E-5f, 9.583333f, 0.18657076f, 9.583333f, 0.4166894f);
        instancePath.lineTo(9.583333f, 1.0000228f);
        instancePath.lineTo(5.4166665f, 1.0000228f);
        instancePath.lineTo(5.4166665f, 0.4166894f);
        instancePath.cubicTo(5.4166665f, 0.18657076f, 5.6032147f, 2.2737975E-5f, 5.8333335f, 2.2737975E-5f);
        instancePath.lineTo(9.166667f, 2.2737975E-5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
