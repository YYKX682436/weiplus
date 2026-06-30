package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class mike_filled extends l95.c {
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
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(24.0f, 0.0f);
        instancePath2.lineTo(24.0f, 24.0f);
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
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16268960);
        instancePaint6.setColor(-16268960);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(7.38012f, 10.32f);
        instancePath3.lineTo(7.38012f, 12.0f);
        instancePath3.cubicTo(7.38012f, 14.5515f, 9.44856f, 16.62f, 12.0001f, 16.62f);
        instancePath3.cubicTo(14.5517f, 16.62f, 16.6201f, 14.5515f, 16.6201f, 12.0f);
        instancePath3.lineTo(16.6201f, 10.32f);
        instancePath3.lineTo(17.8801f, 10.32f);
        instancePath3.lineTo(17.8801f, 12.0f);
        instancePath3.cubicTo(17.8801f, 15.0346f, 15.5813f, 17.5323f, 12.6301f, 17.8466f);
        instancePath3.lineTo(12.6301f, 20.4f);
        instancePath3.lineTo(11.3701f, 20.4f);
        instancePath3.lineTo(11.3703f, 17.8466f);
        instancePath3.cubicTo(8.41901f, 17.5324f, 6.12012f, 15.0346f, 6.12012f, 12.0f);
        instancePath3.lineTo(6.12012f, 10.32f);
        instancePath3.lineTo(7.38012f, 10.32f);
        instancePath3.close();
        instancePath3.moveTo(12.0001f, 3.59998f);
        instancePath3.cubicTo(13.8558f, 3.59998f, 15.3601f, 5.1043f, 15.3601f, 6.95998f);
        instancePath3.lineTo(15.3601f, 12.0f);
        instancePath3.cubicTo(15.3601f, 13.8557f, 13.8558f, 15.36f, 12.0001f, 15.36f);
        instancePath3.cubicTo(10.1444f, 15.36f, 8.64012f, 13.8557f, 8.64012f, 12.0f);
        instancePath3.lineTo(8.64012f, 6.95998f);
        instancePath3.cubicTo(8.64012f, 5.1043f, 10.1444f, 3.59998f, 12.0001f, 3.59998f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
