package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_bellring_shake extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.003101f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15616);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(12.012224f, 2.2372093f);
        instancePath2.cubicTo(13.135202f, 2.2372093f, 14.045557f, 3.1465225f, 14.045557f, 4.268217f);
        instancePath2.cubicTo(14.045557f, 4.383006f, 14.036023f, 4.4955707f, 14.017704f, 4.6051645f);
        instancePath2.cubicTo(16.401466f, 5.4337015f, 18.112225f, 7.697915f, 18.112225f, 10.36124f);
        instancePath2.lineTo(18.112225f, 14.423256f);
        instancePath2.cubicTo(18.112225f, 15.915345f, 18.660936f, 17.407434f, 19.758362f, 18.899523f);
        instancePath2.cubicTo(19.886566f, 19.073835f, 19.955706f, 19.284481f, 19.955706f, 19.500774f);
        instancePath2.cubicTo(19.955706f, 20.061638f, 19.500515f, 20.516308f, 18.93901f, 20.516308f);
        instancePath2.lineTo(13.028891f, 20.516283f);
        instancePath2.lineTo(13.028891f, 20.71938f);
        instancePath2.cubicTo(13.028891f, 21.280228f, 12.573713f, 21.734884f, 12.012224f, 21.734884f);
        instancePath2.cubicTo(11.450734f, 21.734884f, 10.995557f, 21.280228f, 10.995557f, 20.71938f);
        instancePath2.lineTo(10.995557f, 20.51628f);
        instancePath2.lineTo(5.085376f, 20.51628f);
        instancePath2.cubicTo(4.868845f, 20.51628f, 4.65797f, 20.447224f, 4.483469f, 20.31917f);
        instancePath2.cubicTo(4.0439124f, 19.996614f, 3.939507f, 19.38763f, 4.2386365f, 18.938772f);
        instancePath2.lineTo(4.2660503f, 18.899572f);
        instancePath2.cubicTo(5.363499f, 17.407467f, 5.912224f, 15.915361f, 5.912224f, 14.423256f);
        instancePath2.lineTo(5.912224f, 10.36124f);
        instancePath2.cubicTo(5.912224f, 7.697915f, 7.622981f, 5.4337015f, 10.006743f, 4.6051645f);
        instancePath2.cubicTo(9.988424f, 4.4955707f, 9.97889f, 4.383006f, 9.97889f, 4.268217f);
        instancePath2.cubicTo(9.97889f, 3.1465225f, 10.889245f, 2.2372093f, 12.012224f, 2.2372093f);
        instancePath2.close();
        instancePath2.moveTo(16.715477f, 2.9213748f);
        instancePath2.cubicTo(19.268398f, 4.540612f, 20.859495f, 7.3357487f, 20.895327f, 10.407534f);
        instancePath2.lineTo(20.895945f, 10.596899f);
        instancePath2.lineTo(19.295946f, 10.596899f);
        instancePath2.lineTo(19.295946f, 10.513566f);
        instancePath2.cubicTo(19.295946f, 7.9876604f, 18.017244f, 5.6814313f, 15.941929f, 4.3262134f);
        instancePath2.lineTo(15.858492f, 4.272514f);
        instancePath2.lineTo(16.715477f, 2.9213748f);
        instancePath2.close();
        instancePath2.moveTo(7.081277f, 2.9213748f);
        instancePath2.lineTo(7.938262f, 4.272514f);
        instancePath2.cubicTo(5.841785f, 5.6022434f, 4.535494f, 7.892735f, 4.501481f, 10.412649f);
        instancePath2.lineTo(4.5008f, 10.513566f);
        instancePath2.lineTo(4.5008f, 10.596899f);
        instancePath2.lineTo(2.9008f, 10.596899f);
        instancePath2.lineTo(2.9008f, 10.513566f);
        instancePath2.cubicTo(2.9008f, 7.400163f, 4.49901f, 4.559226f, 7.081277f, 2.9213748f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
