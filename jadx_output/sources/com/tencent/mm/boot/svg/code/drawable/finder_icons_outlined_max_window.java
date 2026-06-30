package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_icons_outlined_max_window extends l95.c {
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.0f, 14.0f);
        instancePath.lineTo(18.0f, 18.0f);
        instancePath.cubicTo(18.0f, 18.552284f, 17.552284f, 19.0f, 17.0f, 19.0f);
        instancePath.lineTo(13.0f, 19.0f);
        instancePath.lineTo(13.0f, 17.8f);
        instancePath.lineTo(16.8f, 17.8f);
        instancePath.lineTo(16.8f, 14.0f);
        instancePath.lineTo(18.0f, 14.0f);
        instancePath.close();
        instancePath.moveTo(5.0f, 1.0f);
        instancePath.lineTo(5.0f, 2.2f);
        instancePath.lineTo(1.2f, 2.2f);
        instancePath.lineTo(1.2f, 6.0f);
        instancePath.lineTo(0.0f, 6.0f);
        instancePath.lineTo(0.0f, 2.0f);
        instancePath.cubicTo(0.0f, 1.4477153f, 0.44771525f, 1.0f, 1.0f, 1.0f);
        instancePath.lineTo(5.0f, 1.0f);
        instancePath.close();
        instancePath.moveTo(16.796854f, 3.0456264f);
        instancePath.lineTo(11.32492f, 8.517561f);
        instancePath.lineTo(10.476392f, 7.6690326f);
        instancePath.lineTo(15.948318f, 2.1971068f);
        instancePath.lineTo(12.996855f, 2.1971068f);
        instancePath.lineTo(12.996855f, 0.9971068f);
        instancePath.lineTo(16.996855f, 0.9971068f);
        instancePath.cubicTo(17.549139f, 0.9971068f, 17.996855f, 1.4448221f, 17.996855f, 1.9971068f);
        instancePath.lineTo(17.996855f, 5.997107f);
        instancePath.lineTo(16.796854f, 5.997107f);
        instancePath.lineTo(16.796854f, 3.0456264f);
        instancePath.close();
        instancePath.moveTo(1.2031456f, 16.954374f);
        instancePath.lineTo(6.67508f, 11.482439f);
        instancePath.lineTo(7.523608f, 12.330968f);
        instancePath.lineTo(2.0516825f, 17.802893f);
        instancePath.lineTo(5.0031457f, 17.802893f);
        instancePath.lineTo(5.0031457f, 19.002893f);
        instancePath.lineTo(1.0031456f, 19.002893f);
        instancePath.cubicTo(0.45086086f, 19.002893f, 0.0031455979f, 18.555178f, 0.0031455979f, 18.002893f);
        instancePath.lineTo(0.0031455979f, 14.002893f);
        instancePath.lineTo(1.2031456f, 14.002893f);
        instancePath.lineTo(1.2031456f, 16.954374f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
