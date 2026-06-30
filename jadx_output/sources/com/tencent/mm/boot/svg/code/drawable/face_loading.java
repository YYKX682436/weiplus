package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class face_loading extends l95.c {
    private final int width = be1.r0.CTRL_INDEX;
    private final int height = be1.r0.CTRL_INDEX;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return be1.r0.CTRL_INDEX;
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
        canvas.saveLayerAlpha(null, 230, 31);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(84.0f, 0.0f);
        instancePath.cubicTo(130.39192f, 0.0f, 168.0f, 37.60808f, 168.0f, 84.0f);
        instancePath.cubicTo(168.0f, 130.39192f, 130.39192f, 168.0f, 84.0f, 168.0f);
        instancePath.lineTo(84.0f, 153.3f);
        instancePath.cubicTo(122.27333f, 153.3f, 153.3f, 122.27333f, 153.3f, 84.0f);
        instancePath.cubicTo(153.3f, 45.726665f, 122.27333f, 14.7f, 84.0f, 14.7f);
        instancePath.lineTo(84.0f, 0.0f);
        instancePath.close();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 168.0f, 0.0f, 84.0f, 0.0f, 168.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.94086915f, 0.0f, 0.94086915f, 0.90559083f, new int[]{15592941, 1290661357}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(84.0f, 0.0f);
        instancePath2.lineTo(84.0f, 14.7f);
        instancePath2.cubicTo(45.726665f, 14.7f, 14.7f, 45.726665f, 14.7f, 84.0f);
        instancePath2.cubicTo(14.7f, 122.27333f, 45.726665f, 153.3f, 84.0f, 153.3f);
        instancePath2.lineTo(84.0f, 168.0f);
        instancePath2.cubicTo(37.60808f, 168.0f, 0.0f, 130.39192f, 0.0f, 84.0f);
        instancePath2.cubicTo(0.0f, 37.60808f, 37.60808f, 0.0f, 84.0f, 0.0f);
        instancePath2.close();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect(null);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 84.0f, 0.0f, 0.0f, 0.0f, 168.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.0f, 0.08673706f, 1.0f, 0.9062866f, new int[]{-1184275, 1290661357}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-1184275);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(85.05f, 0.0f);
        instancePath3.cubicTo(89.1093f, 0.0f, 92.4f, 3.2907066f, 92.4f, 7.35f);
        instancePath3.cubicTo(92.4f, 11.409293f, 89.1093f, 14.7f, 85.05f, 14.7f);
        instancePath3.cubicTo(80.99071f, 14.7f, 77.700005f, 11.409293f, 77.700005f, 7.35f);
        instancePath3.cubicTo(77.700005f, 3.2907066f, 80.99071f, 0.0f, 85.05f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
