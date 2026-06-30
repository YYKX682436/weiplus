package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class backup_delete_icon extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 10.5f, 0.0f, 1.0f, 10.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.207434f, 11.899989f);
        instancePath.lineTo(16.05067f, 59.66637f);
        instancePath.cubicTo(16.138716f, 61.145535f, 17.363943f, 62.3f, 18.845724f, 62.3f);
        instancePath.lineTo(44.154278f, 62.3f);
        instancePath.cubicTo(45.636055f, 62.3f, 46.861286f, 61.145535f, 46.94933f, 59.66637f);
        instancePath.lineTo(49.792564f, 11.899989f);
        instancePath.lineTo(13.207434f, 11.899989f);
        instancePath.close();
        instancePath.moveTo(8.75f, 7.6999893f);
        instancePath.lineTo(54.25f, 7.6999893f);
        instancePath.lineTo(51.14191f, 59.91593f);
        instancePath.cubicTo(50.921795f, 63.613834f, 47.858727f, 66.5f, 44.154278f, 66.5f);
        instancePath.lineTo(18.845724f, 66.5f);
        instancePath.cubicTo(15.141274f, 66.5f, 12.078204f, 63.613834f, 11.858091f, 59.91593f);
        instancePath.lineTo(8.75f, 7.6999893f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(3.5f, 7.6999893f);
        instancePath2.lineTo(59.5f, 7.6999893f);
        instancePath2.cubicTo(60.4665f, 7.6999893f, 61.25f, 8.483491f, 61.25f, 9.449989f);
        instancePath2.lineTo(61.25f, 11.899989f);
        instancePath2.lineTo(1.75f, 11.899989f);
        instancePath2.lineTo(1.75f, 9.449989f);
        instancePath2.cubicTo(1.75f, 8.483491f, 2.5335016f, 7.6999893f, 3.5f, 7.6999893f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(38.5f, 9.549949E-5f);
        instancePath3.cubicTo(39.4665f, 9.549949E-5f, 40.25f, 0.7835972f, 40.25f, 1.7500955f);
        instancePath3.lineTo(40.25f, 4.2000847f);
        instancePath3.lineTo(22.75f, 4.2000847f);
        instancePath3.lineTo(22.75f, 1.7500955f);
        instancePath3.cubicTo(22.75f, 0.7835972f, 23.533503f, 9.549949E-5f, 24.5f, 9.549949E-5f);
        instancePath3.lineTo(38.5f, 9.549949E-5f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(22.75f, 21.0f);
        instancePath4.lineTo(26.950043f, 21.0f);
        instancePath4.lineTo(28.700043f, 52.5f);
        instancePath4.lineTo(24.5f, 52.5f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(36.049957f, 21.0f);
        instancePath5.lineTo(40.25f, 21.0f);
        instancePath5.lineTo(38.5f, 52.5f);
        instancePath5.lineTo(34.299957f, 52.5f);
        instancePath5.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
