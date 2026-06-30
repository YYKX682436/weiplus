package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_delemoji extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(18.5f, 0.0f);
        instancePath.cubicTo(19.328426f, 0.0f, 20.0f, 0.67157286f, 20.0f, 1.5f);
        instancePath.lineTo(20.0f, 14.5f);
        instancePath.cubicTo(20.0f, 15.328427f, 19.328426f, 16.0f, 18.5f, 16.0f);
        instancePath.lineTo(6.4696865f, 16.0f);
        instancePath.cubicTo(6.00243f, 16.0f, 5.561861f, 15.782256f, 5.278062f, 15.41106f);
        instancePath.lineTo(0.30846515f, 8.91106f);
        instancePath.cubicTo(-0.102702245f, 8.373273f, -0.102702245f, 7.626727f, 0.30846515f, 7.0889397f);
        instancePath.lineTo(5.278062f, 0.58893955f);
        instancePath.cubicTo(5.561861f, 0.21774355f, 6.00243f, 0.0f, 6.4696865f, 0.0f);
        instancePath.lineTo(18.5f, 0.0f);
        instancePath.close();
        instancePath.moveTo(18.5f, 1.2f);
        instancePath.lineTo(6.4696865f, 1.2f);
        instancePath.cubicTo(6.376235f, 1.2f, 6.288121f, 1.2435488f, 6.2313614f, 1.3177879f);
        instancePath.lineTo(1.2617648f, 7.817788f);
        instancePath.cubicTo(1.1795312f, 7.9253454f, 1.1795312f, 8.074655f, 1.2617648f, 8.182212f);
        instancePath.lineTo(6.2313614f, 14.682212f);
        instancePath.cubicTo(6.288121f, 14.756452f, 6.376235f, 14.8f, 6.4696865f, 14.8f);
        instancePath.lineTo(18.5f, 14.8f);
        instancePath.cubicTo(18.665686f, 14.8f, 18.8f, 14.665686f, 18.8f, 14.5f);
        instancePath.lineTo(18.8f, 1.5f);
        instancePath.cubicTo(18.8f, 1.3343146f, 18.665686f, 1.2f, 18.5f, 1.2f);
        instancePath.close();
        instancePath.moveTo(15.0f, 4.0f);
        instancePath.lineTo(16.0f, 5.0f);
        instancePath.lineTo(13.0f, 8.0f);
        instancePath.lineTo(16.0f, 11.0f);
        instancePath.lineTo(15.0f, 12.0f);
        instancePath.lineTo(12.0f, 9.0f);
        instancePath.lineTo(9.0f, 12.0f);
        instancePath.lineTo(8.0f, 11.0f);
        instancePath.lineTo(11.0f, 8.0f);
        instancePath.lineTo(8.0f, 5.0f);
        instancePath.lineTo(9.0f, 4.0f);
        instancePath.lineTo(12.0f, 7.0f);
        instancePath.lineTo(15.0f, 4.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
