package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_ul_unpress extends l95.c {
    private final int width = 144;
    private final int height = 144;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 144;
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
        instancePaint4.setColor(-855638017);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 28.8f);
        instancePath.cubicTo(0.0f, 12.894198f, 12.894198f, 0.0f, 28.8f, 0.0f);
        instancePath.lineTo(115.2f, 0.0f);
        instancePath.cubicTo(131.1058f, 0.0f, 144.0f, 12.894198f, 144.0f, 28.8f);
        instancePath.lineTo(144.0f, 115.2f);
        instancePath.cubicTo(144.0f, 131.1058f, 131.1058f, 144.0f, 115.2f, 144.0f);
        instancePath.lineTo(28.8f, 144.0f);
        instancePath.cubicTo(12.894198f, 144.0f, 0.0f, 131.1058f, 0.0f, 115.2f);
        instancePath.lineTo(0.0f, 28.8f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint5);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 40.8f, 0.0f, 1.0f, 45.6f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(3.6f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(17.28f, 4.4f);
        instancePath2.lineTo(64.8f, 4.4f);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint7.setColor(-16777216);
        instancePaint7.setStrokeWidth(3.6f);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(17.28f, 26.4f);
        instancePath3.lineTo(64.8f, 26.4f);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint8.setColor(-16777216);
        instancePaint8.setStrokeWidth(3.6f);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(17.28f, 48.4f);
        instancePath4.lineTo(64.8f, 48.4f);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint9 = l95.c.instancePaint(instancePaint, looper);
        instancePaint9.setColor(-16777216);
        android.graphics.Path instancePath5 = l95.c.instancePath(looper);
        instancePath5.moveTo(3.456f, 0.0f);
        instancePath5.cubicTo(5.3646965f, 0.0f, 6.912f, 1.5446175f, 6.912f, 3.45f);
        instancePath5.cubicTo(6.912f, 5.3553824f, 5.3646965f, 6.9f, 3.456f, 6.9f);
        instancePath5.cubicTo(1.5473038f, 6.9f, 0.0f, 5.3553824f, 0.0f, 3.45f);
        instancePath5.cubicTo(0.0f, 1.5446175f, 1.5473038f, 0.0f, 3.456f, 0.0f);
        instancePath5.close();
        canvas.drawPath(instancePath5, instancePaint9);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint10 = l95.c.instancePaint(instancePaint, looper);
        instancePaint10.setColor(-16777216);
        android.graphics.Path instancePath6 = l95.c.instancePath(looper);
        instancePath6.moveTo(3.456f, 22.0f);
        instancePath6.cubicTo(5.3646965f, 22.0f, 6.912f, 23.575958f, 6.912f, 25.52f);
        instancePath6.cubicTo(6.912f, 27.464043f, 5.3646965f, 29.04f, 3.456f, 29.04f);
        instancePath6.cubicTo(1.5473038f, 29.04f, 0.0f, 27.464043f, 0.0f, 25.52f);
        instancePath6.cubicTo(0.0f, 23.575958f, 1.5473038f, 22.0f, 3.456f, 22.0f);
        instancePath6.close();
        canvas.drawPath(instancePath6, instancePaint10);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint11 = l95.c.instancePaint(instancePaint, looper);
        instancePaint11.setColor(-16777216);
        android.graphics.Path instancePath7 = l95.c.instancePath(looper);
        instancePath7.moveTo(3.456f, 44.0f);
        instancePath7.cubicTo(5.3646965f, 44.0f, 6.912f, 45.57596f, 6.912f, 47.52f);
        instancePath7.cubicTo(6.912f, 49.464043f, 5.3646965f, 51.04f, 3.456f, 51.04f);
        instancePath7.cubicTo(1.5473038f, 51.04f, 0.0f, 49.464043f, 0.0f, 47.52f);
        instancePath7.cubicTo(0.0f, 45.57596f, 1.5473038f, 44.0f, 3.456f, 44.0f);
        instancePath7.close();
        canvas.drawPath(instancePath7, instancePaint11);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
