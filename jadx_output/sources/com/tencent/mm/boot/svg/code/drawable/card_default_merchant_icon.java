package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class card_default_merchant_icon extends l95.c {
    private final int width = 40;
    private final int height = 40;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 40;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        canvas.saveLayerAlpha(null, 12, 31);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(20.0f, 0.0f);
        instancePath.cubicTo(31.045696f, 0.0f, 40.0f, 8.954305f, 40.0f, 20.0f);
        instancePath.cubicTo(40.0f, 31.045696f, 31.045696f, 40.0f, 20.0f, 40.0f);
        instancePath.cubicTo(8.954305f, 40.0f, 0.0f, 31.045696f, 0.0f, 20.0f);
        instancePath.cubicTo(0.0f, 8.954305f, 8.954305f, 0.0f, 20.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.saveLayerAlpha(null, 51, 31);
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(1.0f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(4.5f, 10.5f);
        instancePath2.lineTo(4.5f, 24.0f);
        instancePath2.cubicTo(4.5f, 24.276142f, 4.7238574f, 24.5f, 5.0f, 24.5f);
        instancePath2.lineTo(23.0f, 24.5f);
        instancePath2.cubicTo(23.276142f, 24.5f, 23.5f, 24.276142f, 23.5f, 24.0f);
        instancePath2.lineTo(23.5f, 10.5f);
        instancePath2.lineTo(4.5f, 10.5f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-2565928);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(25.499073f, 10.472813f);
        instancePath3.lineTo(23.211826f, 4.3734875f);
        instancePath3.cubicTo(23.0148f, 3.8480787f, 22.51252f, 3.5f, 21.951384f, 3.5f);
        instancePath3.lineTo(6.0486164f, 3.5f);
        instancePath3.cubicTo(5.487479f, 3.5f, 4.9852014f, 3.8480787f, 4.788173f, 4.3734875f);
        instancePath3.lineTo(2.5009263f, 10.472813f);
        instancePath3.cubicTo(2.5478566f, 12.704954f, 4.371993f, 14.5f, 6.6153846f, 14.5f);
        instancePath3.cubicTo(7.9268394f, 14.5f, 9.134812f, 13.882993f, 9.907946f, 12.853959f);
        instancePath3.lineTo(10.307693f, 12.321898f);
        instancePath3.lineTo(10.707439f, 12.853959f);
        instancePath3.cubicTo(11.480572f, 13.882993f, 12.688545f, 14.5f, 14.0f, 14.5f);
        instancePath3.cubicTo(15.311455f, 14.5f, 16.519428f, 13.882993f, 17.29256f, 12.853959f);
        instancePath3.lineTo(17.692308f, 12.321898f);
        instancePath3.lineTo(18.092054f, 12.853959f);
        instancePath3.cubicTo(18.865187f, 13.882993f, 20.07316f, 14.5f, 21.384615f, 14.5f);
        instancePath3.cubicTo(23.628008f, 14.5f, 25.452143f, 12.704954f, 25.499073f, 10.472813f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.drawPath(instancePath3, instancePaint8);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-16777216);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(5.0f, 10.0f);
        instancePath4.cubicTo(5.0f, 9.723858f, 5.2238574f, 9.5f, 5.5f, 9.5f);
        instancePath4.lineTo(22.5f, 9.5f);
        instancePath4.cubicTo(22.776142f, 9.5f, 23.0f, 9.723858f, 23.0f, 10.0f);
        instancePath4.lineTo(23.0f, 10.0f);
        instancePath4.cubicTo(23.0f, 10.276142f, 22.776142f, 10.5f, 22.5f, 10.5f);
        instancePath4.lineTo(5.5f, 10.5f);
        instancePath4.cubicTo(5.2238574f, 10.5f, 5.0f, 10.276142f, 5.0f, 10.0f);
        instancePath4.lineTo(5.0f, 10.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint9);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
