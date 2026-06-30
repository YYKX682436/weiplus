package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_pk_crit_annouce_right extends l95.c {
    private final int width = 56;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 56;
        }
        if (i17 == 1) {
            return 32;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(26.4998f, 5.0f);
        instancePath.cubicTo(28.432796f, 5.0f, 29.9998f, 6.5670033f, 29.9998f, 8.5f);
        instancePath.cubicTo(29.9998f, 10.432997f, 28.432796f, 12.0f, 26.4998f, 12.0f);
        instancePath.cubicTo(24.566803f, 12.0f, 22.9998f, 10.432997f, 22.9998f, 8.5f);
        instancePath.cubicTo(22.9998f, 6.5670033f, 24.566803f, 5.0f, 26.4998f, 5.0f);
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 28.4088f, 5.0f, 24.9088f, 11.3636f, new int[]{-1855006805, -10437034}, new float[]{0.211955f, 0.86858f}, instanceMatrix, 0);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.saveLayerAlpha(null, 128, 31);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2049211);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(11.0993f, 23.3275f);
        instancePath2.cubicTo(9.87854f, 23.0458f, 10.0514f, 22.8206f, 9.64452f, 22.2259f);
        instancePath2.lineTo(8.51766f, 22.6015f);
        instancePath2.cubicTo(8.51766f, 23.5405f, 8.42376f, 24.3857f, 9.2689f, 25.4186f);
        instancePath2.cubicTo(10.114f, 26.4516f, 10.4149f, 26.775f, 11.0054f, 26.802f);
        instancePath2.cubicTo(11.0054f, 26.6142f, 11.0993f, 23.5153f, 11.0993f, 23.3275f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-4864);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(17.841f, 22.1591f);
        instancePath3.lineTo(18.0288f, 18.7785f);
        instancePath3.cubicTo(14.9302f, 17.9335f, 10.8295f, 17.8872f, 9.67154f, 19.6239f);
        instancePath3.cubicTo(8.54456f, 21.3141f, 8.35659f, 23.192f, 8.54441f, 23.7554f);
        instancePath3.cubicTo(8.54441f, 23.5676f, 8.82612f, 22.7225f, 9.85908f, 22.253f);
        instancePath3.cubicTo(12.1879f, 21.1261f, 16.1507f, 21.7208f, 17.841f, 22.1591f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
