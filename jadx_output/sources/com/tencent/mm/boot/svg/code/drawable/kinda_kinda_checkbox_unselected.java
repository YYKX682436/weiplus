package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class kinda_kinda_checkbox_unselected extends l95.c {
    private final int width = 26;
    private final int height = 26;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 26;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(22.8f, 12.148149f);
            instancePath.cubicTo(22.8f, 6.0351863f, 17.964813f, 1.2f, 11.851851f, 1.2f);
            instancePath.cubicTo(5.994383f, 1.2f, 1.2f, 6.076857f, 1.2f, 12.148149f);
            instancePath.cubicTo(1.2f, 17.964813f, 6.0351863f, 22.8f, 11.851851f, 22.8f);
            instancePath.cubicTo(17.923143f, 22.8f, 22.8f, 18.005617f, 22.8f, 12.148149f);
            instancePath.close();
            instancePath.moveTo(24.0f, 12.148149f);
            instancePath.cubicTo(24.0f, 18.627556f, 18.627556f, 24.0f, 11.851851f, 24.0f);
            instancePath.cubicTo(5.3724446f, 24.0f, 0.0f, 18.627556f, 0.0f, 12.148149f);
            instancePath.cubicTo(0.0f, 5.3724446f, 5.3724446f, 0.0f, 11.851851f, 0.0f);
            instancePath.cubicTo(18.627556f, 0.0f, 24.0f, 5.3724446f, 24.0f, 12.148149f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
