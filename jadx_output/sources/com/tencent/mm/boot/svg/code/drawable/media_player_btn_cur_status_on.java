package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class media_player_btn_cur_status_on extends l95.c {
    private final int width = 32;
    private final int height = 32;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 32;
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
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 1.0f);
        instancePath2.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
        instancePath2.lineTo(3.0f, 0.0f);
        instancePath2.cubicTo(3.5522847f, 0.0f, 4.0f, 0.44771522f, 4.0f, 1.0f);
        instancePath2.lineTo(4.0f, 13.0f);
        instancePath2.cubicTo(4.0f, 13.552285f, 3.5522847f, 14.0f, 3.0f, 14.0f);
        instancePath2.lineTo(1.0f, 14.0f);
        instancePath2.cubicTo(0.44771522f, 14.0f, 0.0f, 13.552285f, 0.0f, 13.0f);
        instancePath2.lineTo(0.0f, 1.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(8.0f, 1.0f);
        instancePath3.cubicTo(8.0f, 0.44771522f, 8.447715f, 0.0f, 9.0f, 0.0f);
        instancePath3.lineTo(11.0f, 0.0f);
        instancePath3.cubicTo(11.552285f, 0.0f, 12.0f, 0.44771522f, 12.0f, 1.0f);
        instancePath3.lineTo(12.0f, 13.0f);
        instancePath3.cubicTo(12.0f, 13.552285f, 11.552285f, 14.0f, 11.0f, 14.0f);
        instancePath3.lineTo(9.0f, 14.0f);
        instancePath3.cubicTo(8.447715f, 14.0f, 8.0f, 13.552285f, 8.0f, 13.0f);
        instancePath3.lineTo(8.0f, 1.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
