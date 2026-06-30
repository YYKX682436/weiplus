package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class app_brand_video_play_btn_pause extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -114.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 114.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
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
        instancePaint3.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(5.0f, 3.3f);
        instancePath2.cubicTo(5.0f, 3.1343145f, 5.1343145f, 3.0f, 5.3f, 3.0f);
        instancePath2.lineTo(8.7f, 3.0f);
        instancePath2.cubicTo(8.865685f, 3.0f, 9.0f, 3.1343145f, 9.0f, 3.3f);
        instancePath2.lineTo(9.0f, 20.7f);
        instancePath2.cubicTo(9.0f, 20.865686f, 8.865685f, 21.0f, 8.7f, 21.0f);
        instancePath2.lineTo(5.3f, 21.0f);
        instancePath2.cubicTo(5.1343145f, 21.0f, 5.0f, 20.865686f, 5.0f, 20.7f);
        instancePath2.lineTo(5.0f, 3.3f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(15.0f, 3.3f);
        instancePath3.cubicTo(15.0f, 3.1343145f, 15.134315f, 3.0f, 15.3f, 3.0f);
        instancePath3.lineTo(18.7f, 3.0f);
        instancePath3.cubicTo(18.865686f, 3.0f, 19.0f, 3.1343145f, 19.0f, 3.3f);
        instancePath3.lineTo(19.0f, 20.7f);
        instancePath3.cubicTo(19.0f, 20.865686f, 18.865686f, 21.0f, 18.7f, 21.0f);
        instancePath3.lineTo(15.3f, 21.0f);
        instancePath3.cubicTo(15.134315f, 21.0f, 15.0f, 20.865686f, 15.0f, 20.7f);
        instancePath3.lineTo(15.0f, 3.3f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
