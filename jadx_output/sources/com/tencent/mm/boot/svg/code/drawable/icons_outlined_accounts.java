package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_accounts extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
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
        canvas.saveLayerAlpha(null, 230, 31);
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint5, looper);
        instancePaint7.setStrokeWidth(0.6f);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(36.0f, 61.65f);
        instancePath.cubicTo(50.166103f, 61.65f, 61.65f, 50.166103f, 61.65f, 36.0f);
        instancePath.cubicTo(61.65f, 21.833897f, 50.166103f, 10.35f, 36.0f, 10.35f);
        instancePath.cubicTo(21.833897f, 10.35f, 10.35f, 21.833897f, 10.35f, 36.0f);
        instancePath.cubicTo(10.35f, 50.166103f, 21.833897f, 61.65f, 36.0f, 61.65f);
        instancePath.close();
        instancePath.moveTo(36.0f, 66.0f);
        instancePath.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
        instancePath.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
        instancePath.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
        instancePath.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint5, looper);
        instancePaint8.setStrokeWidth(1.2f);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 19.0f, 0.0f, 1.0f, 22.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.125f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint8, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(32.50999f, 16.8125f);
        instancePath2.cubicTo(33.027756f, 16.8125f, 33.44749f, 17.232233f, 33.44749f, 17.75f);
        instancePath2.cubicTo(33.44749f, 18.04381f, 33.30975f, 18.320625f, 33.075386f, 18.49782f);
        instancePath2.lineTo(21.601154f, 27.173014f);
        instancePath2.cubicTo(21.270746f, 27.422821f, 20.80039f, 27.357483f, 20.550583f, 27.027075f);
        instancePath2.cubicTo(20.404402f, 26.83373f, 20.360674f, 26.58166f, 20.43319f, 26.350376f);
        instancePath2.lineTo(22.2479f, 20.5625f);
        instancePath2.lineTo(0.9375f, 20.5625f);
        instancePath2.lineTo(0.9375f, 16.8125f);
        instancePath2.lineTo(32.50999f, 16.8125f);
        instancePath2.close();
        instancePath2.moveTo(13.197369f, 0.97292507f);
        instancePath2.cubicTo(13.343549f, 1.1662695f, 13.387278f, 1.41834f, 13.314762f, 1.6496235f);
        instancePath2.lineTo(11.5000515f, 7.4375f);
        instancePath2.lineTo(32.8125f, 7.4375f);
        instancePath2.lineTo(32.8125f, 11.1875f);
        instancePath2.lineTo(1.2379622f, 11.1875f);
        instancePath2.cubicTo(0.7201953f, 11.1875f, 0.30046228f, 10.767767f, 0.30046228f, 10.25f);
        instancePath2.cubicTo(0.30046228f, 9.95619f, 0.43820226f, 9.679374f, 0.67256665f, 9.50218f);
        instancePath2.lineTo(12.146797f, 0.82698596f);
        instancePath2.cubicTo(12.477204f, 0.5771785f, 12.947561f, 0.6425176f, 13.197369f, 0.97292507f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint9);
        canvas.drawPath(instancePath2, instancePaint10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
