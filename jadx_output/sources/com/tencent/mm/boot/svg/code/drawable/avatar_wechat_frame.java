package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class avatar_wechat_frame extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 120;
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
        instancePaint3.setColor(-372399);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        instancePath.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        instancePath.cubicTo(114.62742f, 0.0f, 120.0f, 5.3725824f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 108.0f);
        instancePath.cubicTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f);
        instancePath.lineTo(12.0f, 120.0f);
        instancePath.cubicTo(5.3725824f, 120.0f, 0.0f, 114.62742f, 0.0f, 108.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 23.0f, 0.0f, 1.0f, 41.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(56.837322f, 34.38223f);
        instancePath2.lineTo(56.837322f, 4.36973f);
        instancePath2.lineTo(14.724756f, 4.36973f);
        instancePath2.lineTo(14.724756f, 34.38223f);
        instancePath2.lineTo(56.837322f, 34.38223f);
        instancePath2.close();
        instancePath2.moveTo(10.331462f, 1.1368684E-13f);
        instancePath2.lineTo(61.230618f, 1.1368684E-13f);
        instancePath2.lineTo(61.230618f, 38.7517f);
        instancePath2.lineTo(10.331462f, 38.7517f);
        instancePath2.lineTo(10.331462f, 1.1368684E-13f);
        instancePath2.close();
        instancePath2.moveTo(4.393229f, 38.7517f);
        instancePath2.lineTo(1.6966473f, 38.7517f);
        instancePath2.cubicTo(2.2737368E-13f, 38.7517f, 2.2746995E-13f, 37.909233f, 2.2746995E-13f, 37.909233f);
        instancePath2.lineTo(2.489629f, 0.842595f);
        instancePath2.cubicTo(2.515041f, 0.3670758f, 2.9129448f, -0.00428691f, 3.3924437f, -9.633928E-14f);
        instancePath2.lineTo(6.938233f, -3.6742225E-5f);
        instancePath2.lineTo(4.393229f, 38.7517f);
        instancePath2.close();
        instancePath2.moveTo(67.16885f, 38.7517f);
        instancePath2.lineTo(64.62385f, -3.6742225E-5f);
        instancePath2.lineTo(68.16964f, -9.633928E-14f);
        instancePath2.cubicTo(68.64913f, -0.00428691f, 69.047035f, 0.3670758f, 69.07245f, 0.842595f);
        instancePath2.lineTo(71.56208f, 37.909233f);
        instancePath2.cubicTo(71.56208f, 37.909233f, 71.56208f, 38.7517f, 69.86543f, 38.7517f);
        instancePath2.lineTo(67.16885f, 38.7517f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
