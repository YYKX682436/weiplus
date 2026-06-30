package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class bottomsheet_icon_del extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 96;
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
                l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(53.00009f, 8.0f);
                instancePath.lineTo(45.00009f, 0.0f);
                instancePath.lineTo(20.00009f, 0.0f);
                instancePath.lineTo(12.000091f, 8.0f);
                instancePath.lineTo(9.0277776E-5f, 8.0f);
                instancePath.lineTo(9.0277776E-5f, 16.0f);
                instancePath.lineTo(65.00009f, 16.0f);
                instancePath.lineTo(65.00009f, 8.0f);
                instancePath.lineTo(53.00009f, 8.0f);
                instancePath.close();
                instancePath.moveTo(12.000091f, 67.0f);
                instancePath.lineTo(20.00009f, 67.0f);
                instancePath.lineTo(20.00009f, 31.0f);
                instancePath.lineTo(12.000091f, 31.0f);
                instancePath.lineTo(12.000091f, 67.0f);
                instancePath.close();
                instancePath.moveTo(28.00009f, 67.0f);
                instancePath.lineTo(36.00009f, 67.0f);
                instancePath.lineTo(36.00009f, 31.0f);
                instancePath.lineTo(28.00009f, 31.0f);
                instancePath.lineTo(28.00009f, 67.0f);
                instancePath.close();
                instancePath.moveTo(45.00009f, 67.0f);
                instancePath.lineTo(53.00009f, 67.0f);
                instancePath.lineTo(53.00009f, 31.0f);
                instancePath.lineTo(45.00009f, 31.0f);
                instancePath.lineTo(45.00009f, 67.0f);
                instancePath.close();
                instancePath.moveTo(4.00009f, 68.0f);
                instancePath.cubicTo(4.00009f, 74.53162f, 9.468924f, 80.0f, 16.00009f, 80.0f);
                instancePath.lineTo(49.00009f, 80.0f);
                instancePath.cubicTo(55.531708f, 80.0f, 61.00009f, 74.53162f, 61.00009f, 68.0f);
                instancePath.lineTo(61.00009f, 23.0f);
                instancePath.lineTo(4.00009f, 23.0f);
                instancePath.lineTo(4.00009f, 68.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
