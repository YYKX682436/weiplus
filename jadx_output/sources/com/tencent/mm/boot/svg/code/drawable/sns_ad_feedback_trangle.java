package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sns_ad_feedback_trangle extends l95.c {
    private final int width = 15;
    private final int height = 6;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 15;
        }
        if (i17 == 1) {
            return 6;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 12.71027f, 1.0f, -1.8369701E-16f, -2.4164877f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(8.416489f, -3.8531091f);
            instancePath.lineTo(8.416489f, -1.4806807f);
            instancePath.cubicTo(8.416489f, -0.9334073f, 8.088407f, -0.1992531f, 7.6654387f, 0.17526627f);
            instancePath.lineTo(2.7301433f, 4.545249f);
            instancePath.cubicTo(2.31535f, 4.91253f, 2.3161323f, 5.5073094f, 2.7301433f, 5.8721867f);
            instancePath.lineTo(7.6654387f, 10.221771f);
            instancePath.cubicTo(8.080232f, 10.5873375f, 8.416489f, 11.337422f, 8.416489f, 11.880487f);
            instancePath.lineTo(8.416489f, 14.146891f);
            instancePath.lineTo(13.147665f, 14.146891f);
            instancePath.lineTo(13.147665f, -3.8531091f);
            instancePath.lineTo(8.416489f, -3.8531091f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
