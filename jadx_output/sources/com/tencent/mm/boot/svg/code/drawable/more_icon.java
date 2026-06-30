package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class more_icon extends l95.c {
    private final int width = 24;
    private final int height = 24;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        int i18 = 24;
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
                android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(3.75f, 2.0f);
                instancePath.cubicTo(3.75f, 2.96635f, 2.96635f, 3.75f, 2.0f, 3.75f);
                instancePath.cubicTo(1.03365f, 3.75f, 0.25f, 2.96635f, 0.25f, 2.0f);
                instancePath.cubicTo(0.25f, 1.0333f, 1.03365f, 0.25f, 2.0f, 0.25f);
                instancePath.cubicTo(2.96635f, 0.25f, 3.75f, 1.0333f, 3.75f, 2.0f);
                instancePath.close();
                instancePath.moveTo(9.0f, 0.25f);
                instancePath.cubicTo(9.96635f, 0.25f, 10.75f, 1.0333f, 10.75f, 2.0f);
                instancePath.cubicTo(10.75f, 2.96635f, 9.96635f, 3.75f, 9.0f, 3.75f);
                instancePath.cubicTo(8.03365f, 3.75f, 7.25f, 2.96635f, 7.25f, 2.0f);
                instancePath.cubicTo(7.25f, 1.0333f, 8.03365f, 0.25f, 9.0f, 0.25f);
                instancePath.close();
                instancePath.moveTo(16.0f, 0.25f);
                instancePath.cubicTo(16.96635f, 0.25f, 17.75f, 1.0333f, 17.75f, 2.0f);
                instancePath.cubicTo(17.75f, 2.96635f, 16.96635f, 3.75f, 16.0f, 3.75f);
                instancePath.cubicTo(15.03365f, 3.75f, 14.25f, 2.96635f, 14.25f, 2.0f);
                instancePath.cubicTo(14.25f, 1.0333f, 15.03365f, 0.25f, 16.0f, 0.25f);
                instancePath.close();
                com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                l95.c.done(looper);
            }
        }
        return i18;
    }
}
