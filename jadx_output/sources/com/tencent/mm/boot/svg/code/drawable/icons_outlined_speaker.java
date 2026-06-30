package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_speaker extends l95.c {
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.2f, 0.0f, 1.0f, 3.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(7.212489f, 15.69777f);
        instancePath2.cubicTo(9.114182f, 13.796077f, 10.2f, 11.228917f, 10.2f, 8.485281f);
        instancePath2.cubicTo(10.2f, 5.7416463f, 9.114182f, 3.1744857f, 7.212489f, 1.2727922f);
        instancePath2.lineTo(8.485281f, 0.0f);
        instancePath2.cubicTo(10.656855f, 2.171573f, 12.0f, 5.1715727f, 12.0f, 8.485281f);
        instancePath2.cubicTo(12.0f, 11.79899f, 10.656855f, 14.79899f, 8.485281f, 16.970562f);
        instancePath2.lineTo(7.212489f, 15.69777f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(4.2426405f, 12.727922f);
        instancePath3.cubicTo(5.361765f, 11.608798f, 6.0f, 10.09984f, 6.0f, 8.485281f);
        instancePath3.cubicTo(6.0f, 6.8707223f, 5.361765f, 5.361765f, 4.2426405f, 4.2426405f);
        instancePath3.lineTo(5.515433f, 2.9698484f);
        instancePath3.cubicTo(6.926955f, 4.381371f, 7.8f, 6.331371f, 7.8f, 8.485281f);
        instancePath3.cubicTo(7.8f, 10.639192f, 6.926955f, 12.589191f, 5.515433f, 14.000714f);
        instancePath3.lineTo(4.2426405f, 12.727922f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(2.5455844f, 11.030866f);
        instancePath4.cubicTo(3.1970563f, 10.379394f, 3.6f, 9.479394f, 3.6f, 8.485281f);
        instancePath4.cubicTo(3.6f, 7.491169f, 3.1970563f, 6.591169f, 2.5455844f, 5.939697f);
        instancePath4.lineTo(0.0f, 8.485281f);
        instancePath4.lineTo(2.5455844f, 11.030866f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
