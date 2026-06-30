package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_chatbot extends l95.c {
    private final int width = 32;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 32;
        }
        if (i17 == 1) {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(looper);
        instancePaint3.setFlags(385);
        instancePaint3.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint3.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.0f);
        instancePaint4.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint4.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint4.setStrokeMiter(4.0f);
        instancePaint4.setPathEffect(null);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        l95.c.instancePaint(instancePaint3, looper).setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(32.0f, 0.0f);
        instancePath2.lineTo(32.0f, 24.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.addPath(instancePath, instanceMatrix, instancePath2, true);
        canvas.clipPath(instancePath);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(855638016);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(0.0f, 5.0f);
        instancePath3.cubicTo(0.0f, 2.2385762f, 2.2385762f, 0.0f, 5.0f, 0.0f);
        instancePath3.lineTo(27.0f, 0.0f);
        instancePath3.cubicTo(29.761423f, 0.0f, 32.0f, 2.2385762f, 32.0f, 5.0f);
        instancePath3.lineTo(32.0f, 19.0f);
        instancePath3.cubicTo(32.0f, 21.761423f, 29.761423f, 24.0f, 27.0f, 24.0f);
        instancePath3.lineTo(5.0f, 24.0f);
        instancePath3.cubicTo(2.2385762f, 24.0f, 0.0f, 21.761423f, 0.0f, 19.0f);
        instancePath3.lineTo(0.0f, 5.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(23.601f, 5.59999f);
        instancePath4.lineTo(21.5645f, 5.59999f);
        instancePath4.lineTo(21.5645f, 19.064f);
        instancePath4.lineTo(23.601f, 19.064f);
        instancePath4.lineTo(23.601f, 5.59999f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(13.8238f, 5.60001f);
        instancePath5.lineTo(11.4855f, 5.60001f);
        instancePath5.lineTo(6.2998f, 19.064f);
        instancePath5.lineTo(8.48723f, 19.064f);
        instancePath5.lineTo(9.75066f, 15.5943f);
        instancePath5.lineTo(15.5398f, 15.5943f);
        instancePath5.lineTo(16.8032f, 19.064f);
        instancePath5.lineTo(19.0095f, 19.064f);
        instancePath5.lineTo(13.8238f, 5.60001f);
        instancePath5.close();
        instancePath5.moveTo(14.9175f, 13.8971f);
        instancePath5.lineTo(10.3729f, 13.8971f);
        instancePath5.lineTo(12.6169f, 7.80629f);
        instancePath5.lineTo(12.6924f, 7.80629f);
        instancePath5.lineTo(14.9175f, 13.8971f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint7);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
