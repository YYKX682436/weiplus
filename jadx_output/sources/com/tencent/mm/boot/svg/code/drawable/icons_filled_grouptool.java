package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_grouptool extends l95.c {
    private final int width = 96;
    private final int height = 96;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 96;
        }
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
            android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(15.652174f, 0.0f);
            instancePath.cubicTo(24.29663f, 0.0f, 31.304348f, 7.007716f, 31.304348f, 15.652174f);
            instancePath.cubicTo(31.304348f, 24.29663f, 24.29663f, 31.304348f, 15.652174f, 31.304348f);
            instancePath.cubicTo(7.007716f, 31.304348f, 0.0f, 24.29663f, 0.0f, 15.652174f);
            instancePath.cubicTo(0.0f, 7.007716f, 7.007716f, 0.0f, 15.652174f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath2 = l95.c.instancePath(looper);
            instancePath2.moveTo(56.347828f, 0.0f);
            instancePath2.cubicTo(64.99229f, 0.0f, 72.0f, 7.007716f, 72.0f, 15.652174f);
            instancePath2.cubicTo(72.0f, 24.29663f, 64.99229f, 31.304348f, 56.347828f, 31.304348f);
            instancePath2.cubicTo(47.70337f, 31.304348f, 40.695656f, 24.29663f, 40.695656f, 15.652174f);
            instancePath2.cubicTo(40.695656f, 7.007716f, 47.70337f, 0.0f, 56.347828f, 0.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath3 = l95.c.instancePath(looper);
            instancePath3.moveTo(15.652174f, 40.695656f);
            instancePath3.cubicTo(24.29663f, 40.695656f, 31.304348f, 47.70337f, 31.304348f, 56.347828f);
            instancePath3.cubicTo(31.304348f, 64.99229f, 24.29663f, 72.0f, 15.652174f, 72.0f);
            instancePath3.cubicTo(7.007716f, 72.0f, 0.0f, 64.99229f, 0.0f, 56.347828f);
            instancePath3.cubicTo(0.0f, 47.70337f, 7.007716f, 40.695656f, 15.652174f, 40.695656f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.save();
            android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath4 = l95.c.instancePath(looper);
            instancePath4.moveTo(56.347828f, 40.695656f);
            instancePath4.cubicTo(64.99229f, 40.695656f, 72.0f, 47.70337f, 72.0f, 56.347828f);
            instancePath4.cubicTo(72.0f, 64.99229f, 64.99229f, 72.0f, 56.347828f, 72.0f);
            instancePath4.cubicTo(47.70337f, 72.0f, 40.695656f, 64.99229f, 40.695656f, 56.347828f);
            instancePath4.cubicTo(40.695656f, 47.70337f, 47.70337f, 40.695656f, 56.347828f, 40.695656f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint7);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
