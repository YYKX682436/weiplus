package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_migration_move extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.625f, 0.0f, 1.0f, 3.350798f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.5f, 17.192951f);
        instancePath.cubicTo(13.5f, 17.721073f, 12.996321f, 18.149202f, 12.375f, 18.149202f);
        instancePath.lineTo(1.125f, 18.149202f);
        instancePath.cubicTo(0.50367963f, 18.149202f, 0.0f, 17.721073f, 0.0f, 17.192951f);
        instancePath.lineTo(0.0f, 3.8054516f);
        instancePath.cubicTo(0.0f, 3.2773294f, 0.50367963f, 2.8492017f, 1.125f, 2.8492017f);
        instancePath.lineTo(4.5f, 2.8492017f);
        instancePath.lineTo(4.5f, 0.83734125f);
        instancePath.cubicTo(4.5f, 0.30921894f, 5.0036798f, 0.0f, 5.625f, 0.0f);
        instancePath.lineTo(15.422234f, 0.0f);
        instancePath.lineTo(15.422234f, 0.0f);
        instancePath.cubicTo(16.043554f, 0.0f, 16.34251f, 0.40172705f, 16.34251f, 0.9298493f);
        instancePath.lineTo(16.34251f, 13.420775f);
        instancePath.cubicTo(16.34251f, 13.948897f, 16.116629f, 14.324202f, 15.495309f, 14.324202f);
        instancePath.lineTo(15.09f, 14.324f);
        instancePath.lineTo(15.09f, 13.176f);
        instancePath.lineTo(15.092502f, 13.176702f);
        instancePath.lineTo(15.092502f, 1.2047698f);
        instancePath.lineTo(4.50129f, 1.2047698f);
        instancePath.lineTo(4.50129f, 2.8492017f);
        instancePath.lineTo(12.375f, 2.8492017f);
        instancePath.cubicTo(12.996321f, 2.8492017f, 13.5f, 3.2773294f, 13.5f, 3.8054516f);
        instancePath.lineTo(13.5f, 13.176702f);
        instancePath.lineTo(13.5f, 13.176f);
        instancePath.lineTo(13.5f, 17.192951f);
        instancePath.close();
        instancePath.moveTo(12.225871f, 4.106015f);
        instancePath.lineTo(1.125f, 4.106015f);
        instancePath.lineTo(1.125f, 17.001701f);
        instancePath.lineTo(12.225871f, 17.001701f);
        instancePath.lineTo(12.225871f, 4.106015f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 6.123234E-17f, 1.0f, -3.3825908f, -1.0f, 6.123234E-17f, 17.176373f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.389151f, 11.473271f);
        instancePath2.lineTo(7.389151f, 7.3247976f);
        instancePath2.lineTo(6.4388f, 7.3247976f);
        instancePath2.lineTo(6.4388f, 11.5130005f);
        instancePath2.lineTo(5.328891f, 10.279482f);
        instancePath2.lineTo(4.6568904f, 11.003845f);
        instancePath2.lineTo(6.6212234f, 13.100226f);
        instancePath2.cubicTo(6.774821f, 13.278813f, 7.0189605f, 13.278813f, 7.1725574f, 13.100226f);
        instancePath2.lineTo(9.13689f, 11.003845f);
        instancePath2.lineTo(8.4648905f, 10.279482f);
        instancePath2.lineTo(7.389151f, 11.473271f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
