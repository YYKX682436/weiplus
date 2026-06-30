package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class checkbox_selected_game extends l95.c {
    private final int width = 60;
    private final int height = 60;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 60;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15616);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 6.4f);
        instancePath.cubicTo(0.0f, 2.8653774f, 2.8653774f, 0.0f, 6.4f, 0.0f);
        instancePath.lineTo(41.6f, 0.0f);
        instancePath.cubicTo(45.13462f, 0.0f, 48.0f, 2.8653774f, 48.0f, 6.4f);
        instancePath.lineTo(48.0f, 41.6f);
        instancePath.cubicTo(48.0f, 45.13462f, 45.13462f, 48.0f, 41.6f, 48.0f);
        instancePath.lineTo(6.4f, 48.0f);
        instancePath.cubicTo(2.8653774f, 48.0f, 0.0f, 45.13462f, 0.0f, 41.6f);
        instancePath.lineTo(0.0f, 6.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(37.20189f, 9.6f);
        instancePath2.lineTo(41.72737f, 14.1254835f);
        instancePath2.lineTo(23.89f, 31.962f);
        instancePath2.lineTo(23.91362f, 31.98589f);
        instancePath2.lineTo(19.388138f, 36.51137f);
        instancePath2.lineTo(6.4f, 23.523235f);
        instancePath2.lineTo(10.925484f, 18.997753f);
        instancePath2.lineTo(19.365f, 27.437f);
        instancePath2.lineTo(37.20189f, 9.6f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
