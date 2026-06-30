package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sight_list_checkbox_unselected extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 90;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
                instancePaint3.setStrokeWidth(1.0f);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                instancePaint4.setStrokeWidth(3.0f);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(45.0f, 11.0f);
                instancePath.cubicTo(63.225395f, 11.0f, 78.0f, 25.774603f, 78.0f, 44.0f);
                instancePath.cubicTo(78.0f, 62.225395f, 63.225395f, 77.0f, 45.0f, 77.0f);
                instancePath.cubicTo(26.774603f, 77.0f, 12.0f, 62.225395f, 12.0f, 44.0f);
                instancePath.cubicTo(12.0f, 25.774603f, 26.774603f, 11.0f, 45.0f, 11.0f);
                instancePath.close();
                android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
                instancePaint5.setFlags(385);
                instancePaint5.setStyle(android.graphics.Paint.Style.FILL);
                android.graphics.Paint instancePaint6 = l95.c.instancePaint(looper);
                instancePaint6.setFlags(385);
                instancePaint6.setStyle(android.graphics.Paint.Style.STROKE);
                instancePaint5.setColor(-16777216);
                instancePaint6.setStrokeWidth(1.0f);
                instancePaint6.setStrokeCap(android.graphics.Paint.Cap.BUTT);
                instancePaint6.setStrokeJoin(android.graphics.Paint.Join.MITER);
                instancePaint6.setStrokeMiter(4.0f);
                instancePaint6.setPathEffect(null);
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 66.0f, 0.0f, 12.0f, 0.0f, 66.0f, 11.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint4, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-11019676, -5439996}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
