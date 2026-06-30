package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class pc_connect_succ extends l95.c {
    private final int width = 26;
    private final int height = 26;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
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
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -204.0f, 0.0f, 1.0f, -261.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 205.0f, 0.0f, 1.0f, 262.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16268960);
        instancePaint4.setStrokeWidth(1.2857143f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(24.0f, 12.148149f);
        instancePath.cubicTo(24.0f, 5.3724446f, 18.627556f, 0.0f, 11.851851f, 0.0f);
        instancePath.cubicTo(5.3724446f, 0.0f, 0.0f, 5.3724446f, 0.0f, 12.148149f);
        instancePath.cubicTo(0.0f, 18.627556f, 5.3724446f, 24.0f, 11.851851f, 24.0f);
        instancePath.cubicTo(18.627556f, 24.0f, 24.0f, 18.627556f, 24.0f, 12.148149f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16268960);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(6.252277f, 13.007762f);
        instancePath2.cubicTo(6.088865f, 12.838639f, 6.064898f, 12.553898f, 6.207098f, 12.360409f);
        instancePath2.lineTo(6.4001174f, 12.097771f);
        instancePath2.cubicTo(6.5385776f, 11.90937f, 6.797776f, 11.869274f, 6.991251f, 12.017562f);
        instancePath2.lineTo(9.395165f, 13.8600235f);
        instancePath2.cubicTo(9.768337f, 14.146039f, 10.365941f, 14.132068f, 10.727476f, 13.83088f);
        instancePath2.lineTo(17.770195f, 7.963725f);
        instancePath2.cubicTo(17.949402f, 7.814432f, 18.228569f, 7.8256383f, 18.393208f, 7.9882336f);
        instancePath2.lineTo(18.490576f, 8.0843935f);
        instancePath2.cubicTo(18.655449f, 8.247223f, 18.652159f, 8.513998f, 18.47881f, 8.684599f);
        instancePath2.lineTo(10.683666f, 16.356184f);
        instancePath2.cubicTo(10.3450775f, 16.689405f, 9.800653f, 16.680157f, 9.4811325f, 16.349468f);
        instancePath2.lineTo(6.252277f, 13.007762f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
