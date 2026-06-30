package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_join_singing_filled extends l95.c {
    private final int width = 24;
    private final int height = 25;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 24;
        }
        if (i17 == 1) {
            return 25;
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(5.15616f, 3.28618f);
        instancePath.cubicTo(5.15616f, 2.41765f, 6.14832f, 2.0241f, 6.69177f, 2.614f);
        instancePath.lineTo(6.77364f, 2.71539f);
        instancePath.lineTo(7.72145f, 4.22446f);
        instancePath.cubicTo(7.96894f, 4.5738f, 8.28645f, 4.918f, 8.94607f, 5.15467f);
        instancePath.cubicTo(9.58255f, 5.32522f, 10.0491f, 5.3462f, 10.0491f, 5.3462f);
        instancePath.cubicTo(10.0491f, 5.3462f, 9.60425f, 6.42877f, 8.92974f, 6.57819f);
        instancePath.cubicTo(8.21703f, 6.73608f, 7.64315f, 6.52664f, 7.08066f, 6.08272f);
        instancePath.lineTo(6.95336f, 5.97401f);
        instancePath.lineTo(6.95337f, 9.87663f);
        instancePath.lineTo(6.95194f, 9.8754f);
        instancePath.cubicTo(6.88182f, 11.2623f, 5.73506f, 12.3653f, 4.3307f, 12.3653f);
        instancePath.cubicTo(2.88115f, 12.3653f, 1.70605f, 11.1902f, 1.70605f, 9.74067f);
        instancePath.cubicTo(1.70605f, 8.29112f, 2.88115f, 7.11603f, 4.3307f, 7.11603f);
        instancePath.cubicTo(4.61908f, 7.11603f, 4.8966f, 7.16254f, 5.15616f, 7.24847f);
        instancePath.lineTo(5.15616f, 3.28618f);
        instancePath.close();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 1.70605f, 2.33301f, 25.9585f, 8.10076f, new int[]{-1245318, -7536826}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(19.8295f, 4.39141f);
        instancePath2.cubicTo(17.4771f, 3.03328f, 14.4692f, 3.83925f, 13.1111f, 6.1916f);
        instancePath2.cubicTo(12.3536f, 7.50357f, 12.2686f, 9.01895f, 12.7516f, 10.3411f);
        instancePath2.cubicTo(14.6331f, 11.7938f, 16.1648f, 12.6775f, 18.2113f, 13.4967f);
        instancePath2.cubicTo(19.5995f, 13.2549f, 20.8714f, 12.4232f, 21.6297f, 11.1098f);
        instancePath2.cubicTo(22.9878f, 8.75747f, 22.1818f, 5.74954f, 19.8295f, 4.39141f);
        instancePath2.close();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect(null);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.70605f, 2.33301f, 25.9585f, 8.10076f, new int[]{-1245318, -7536826}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(12.3115f, 11.9681f);
        instancePath3.cubicTo(13.882f, 13.1323f, 15.2906f, 13.9521f, 16.9856f, 14.6834f);
        instancePath3.lineTo(11.1163f, 22.765f);
        instancePath3.cubicTo(10.5564f, 23.5328f, 9.50766f, 23.7547f, 8.68474f, 23.2796f);
        instancePath3.cubicTo(7.83933f, 22.7915f, 7.51544f, 21.7327f, 7.94311f, 20.8551f);
        instancePath3.lineTo(12.3115f, 11.9681f);
        instancePath3.close();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(looper);
        instancePaint10.setFlags(385);
        instancePaint10.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(looper);
        instancePaint11.setFlags(385);
        instancePaint11.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint10.setColor(-16777216);
        instancePaint11.setStrokeWidth(1.0f);
        instancePaint11.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint11.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint11.setStrokeMiter(4.0f);
        instancePaint11.setPathEffect(null);
        float[] matrixFloatArray3 = l95.c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint9, 1.70605f, 2.33301f, 25.9585f, 8.10076f, new int[]{-1245318, -7536826}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
