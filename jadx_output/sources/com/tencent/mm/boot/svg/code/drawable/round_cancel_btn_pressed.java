package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class round_cancel_btn_pressed extends l95.c {
    private final int width = 120;
    private final int height = 120;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 120;
        if (i17 != 0 && i17 != 1) {
            i18 = 0;
            if (i17 == 2) {
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
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(Integer.MIN_VALUE);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(50.0f, 94.0f);
                instancePath.cubicTo(74.30053f, 94.0f, 94.0f, 74.30053f, 94.0f, 50.0f);
                instancePath.cubicTo(94.0f, 25.69947f, 74.30053f, 6.0f, 50.0f, 6.0f);
                instancePath.cubicTo(25.69947f, 6.0f, 6.0f, 25.69947f, 6.0f, 50.0f);
                instancePath.cubicTo(6.0f, 74.30053f, 25.69947f, 94.0f, 50.0f, 94.0f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                android.graphics.Path instancePath2 = l95.c.instancePath(looper);
                instancePath2.moveTo(50.0f, 100.0f);
                instancePath2.cubicTo(22.385763f, 100.0f, 0.0f, 77.614235f, 0.0f, 50.0f);
                instancePath2.cubicTo(0.0f, 22.385763f, 22.385763f, 0.0f, 50.0f, 0.0f);
                instancePath2.cubicTo(77.614235f, 0.0f, 100.0f, 22.385763f, 100.0f, 50.0f);
                instancePath2.cubicTo(100.0f, 77.614235f, 77.614235f, 100.0f, 50.0f, 100.0f);
                instancePath2.close();
                instancePath2.moveTo(50.0f, 94.0f);
                instancePath2.cubicTo(74.30053f, 94.0f, 94.0f, 74.30053f, 94.0f, 50.0f);
                instancePath2.cubicTo(94.0f, 25.69947f, 74.30053f, 6.0f, 50.0f, 6.0f);
                instancePath2.cubicTo(25.69947f, 6.0f, 6.0f, 25.69947f, 6.0f, 50.0f);
                instancePath2.cubicTo(6.0f, 74.30053f, 25.69947f, 94.0f, 50.0f, 94.0f);
                instancePath2.close();
                instancePath2.moveTo(54.24264f, 49.999996f);
                instancePath2.lineTo(69.79899f, 65.55635f);
                instancePath2.lineTo(65.55635f, 69.79899f);
                instancePath2.lineTo(50.0f, 54.242638f);
                instancePath2.lineTo(34.44365f, 69.79899f);
                instancePath2.lineTo(30.20101f, 65.55635f);
                instancePath2.lineTo(45.75736f, 49.999996f);
                instancePath2.lineTo(30.201012f, 34.44365f);
                instancePath2.lineTo(34.443653f, 30.20101f);
                instancePath2.lineTo(50.0f, 45.757355f);
                instancePath2.lineTo(65.55635f, 30.20101f);
                instancePath2.lineTo(69.79899f, 34.44365f);
                instancePath2.lineTo(54.24264f, 49.999996f);
                instancePath2.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
