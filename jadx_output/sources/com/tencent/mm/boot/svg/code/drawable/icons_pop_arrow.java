package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_pop_arrow extends l95.c {
    private final int width = 42;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 42;
        }
        if (i17 == 1) {
            return 16;
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
            instancePaint3.setColor(-11776948);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -6.123234E-17f, -1.0f, 25.5f, -1.0f, 6.123234E-17f, 25.5f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(25.5f, -16.5f);
            instancePath.cubicTo(25.5f, -10.98989f, 23.99602f, -9.600116f, 22.15751f, -7.8845377f);
            instancePath.lineTo(12.007299f, 1.5869969f);
            instancePath.cubicTo(9.997109f, 3.4627786f, 9.998025f, 6.4531126f, 12.007299f, 8.32804f);
            instancePath.lineTo(22.15751f, 17.799574f);
            instancePath.cubicTo(23.999258f, 19.518175f, 25.5f, 22.850643f, 25.5f, 25.39781f);
            instancePath.lineTo(31.5f, 25.5f);
            instancePath.lineTo(31.5f, -16.5f);
            instancePath.lineTo(25.5f, -16.5f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
