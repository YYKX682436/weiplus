package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class fts_more_button_icon extends l95.c {
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
                instancePaint3.setColor(-11048043);
                canvas.save();
                float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
                android.graphics.Path instancePath = l95.c.instancePath(looper);
                instancePath.moveTo(12.309931f, 11.561403f);
                instancePath.lineTo(16.424265f, 15.675735f);
                instancePath.lineTo(15.575736f, 16.524263f);
                instancePath.lineTo(11.452851f, 12.401379f);
                instancePath.cubicTo(10.24281f, 13.400067f, 8.691467f, 14.0f, 7.0f, 14.0f);
                instancePath.cubicTo(3.134f, 14.0f, 0.0f, 10.866f, 0.0f, 7.0f);
                instancePath.cubicTo(0.0f, 3.134f, 3.134f, 0.0f, 7.0f, 0.0f);
                instancePath.cubicTo(10.866f, 0.0f, 14.0f, 3.134f, 14.0f, 7.0f);
                instancePath.cubicTo(14.0f, 8.742484f, 13.363332f, 10.336264f, 12.309931f, 11.561403f);
                instancePath.close();
                instancePath.moveTo(12.799997f, 7.0000124f);
                instancePath.cubicTo(12.799997f, 3.796755f, 10.203255f, 1.2000122f, 6.999997f, 1.2000122f);
                instancePath.cubicTo(3.7967398f, 1.2000122f, 1.199997f, 3.796755f, 1.199997f, 7.0000124f);
                instancePath.cubicTo(1.199997f, 10.20327f, 3.7967398f, 12.800013f, 6.999997f, 12.800013f);
                instancePath.cubicTo(10.203255f, 12.800013f, 12.799997f, 10.20327f, 12.799997f, 7.0000124f);
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
