package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class brand_100_loading_60_60 extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        instancePath.moveTo(30.0f, 0.0f);
        instancePath.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        instancePath.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        instancePath.lineTo(30.0f, 54.75f);
        instancePath.cubicTo(43.66905f, 54.75f, 54.75f, 43.66905f, 54.75f, 30.0f);
        instancePath.cubicTo(54.75f, 16.330952f, 43.66905f, 5.25f, 30.0f, 5.25f);
        instancePath.lineTo(30.0f, 0.0f);
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 60.0f, 0.0f, 30.0f, 0.0f, 60.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.94086915f, 0.0f, 0.94086915f, 0.90559083f, new int[]{508256, 1275576672}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(30.0f, 0.0f);
        instancePath2.lineTo(30.0f, 5.25f);
        instancePath2.cubicTo(16.330952f, 5.25f, 5.25f, 16.330952f, 5.25f, 30.0f);
        instancePath2.cubicTo(5.25f, 43.66905f, 16.330952f, 54.75f, 30.0f, 54.75f);
        instancePath2.lineTo(30.0f, 60.0f);
        instancePath2.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        instancePath2.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
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
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 30.0f, 0.0f, 0.0f, 0.0f, 60.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 1.0f, 0.08673706f, 1.0f, 0.9062866f, new int[]{-16268960, 1275576672}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-16268960);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(30.375f, 0.0f);
        instancePath3.cubicTo(31.824747f, 0.0f, 33.0f, 1.1752524f, 33.0f, 2.625f);
        instancePath3.cubicTo(33.0f, 4.0747476f, 31.824747f, 5.25f, 30.375f, 5.25f);
        instancePath3.cubicTo(28.925253f, 5.25f, 27.75f, 4.0747476f, 27.75f, 2.625f);
        instancePath3.cubicTo(27.75f, 1.1752524f, 28.925253f, 0.0f, 30.375f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
