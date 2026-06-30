package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_filled_add_title extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 6.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(12.666667f, 2.0f);
        instancePath.lineTo(3.3333333f, 2.0f);
        instancePath.cubicTo(2.7810485f, 2.0f, 2.3333333f, 2.4477153f, 2.3333333f, 3.0f);
        instancePath.lineTo(2.3333333f, 5.0f);
        instancePath.cubicTo(2.3333333f, 5.5522847f, 2.7810485f, 6.0f, 3.3333333f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 13.0f);
        instancePath.cubicTo(6.0f, 13.552284f, 6.4477153f, 14.0f, 7.0f, 14.0f);
        instancePath.lineTo(9.0f, 14.0f);
        instancePath.cubicTo(9.552285f, 14.0f, 10.0f, 13.552284f, 10.0f, 13.0f);
        instancePath.lineTo(10.0f, 6.0f);
        instancePath.lineTo(10.0f, 6.0f);
        instancePath.lineTo(12.666667f, 6.0f);
        instancePath.cubicTo(13.218951f, 6.0f, 13.666667f, 5.5522847f, 13.666667f, 5.0f);
        instancePath.lineTo(13.666667f, 3.0f);
        instancePath.cubicTo(13.666667f, 2.4477153f, 13.218951f, 2.0f, 12.666667f, 2.0f);
        instancePath.close();
        instancePath.moveTo(12.333333f, 3.3333333f);
        instancePath.lineTo(12.333333f, 4.6666665f);
        instancePath.lineTo(8.666667f, 4.6666665f);
        instancePath.lineTo(8.666667f, 12.666667f);
        instancePath.lineTo(7.3333335f, 12.666667f);
        instancePath.lineTo(7.3333335f, 4.6666665f);
        instancePath.lineTo(3.6666667f, 4.6666665f);
        instancePath.lineTo(3.6666667f, 3.3333333f);
        instancePath.lineTo(12.333333f, 3.3333333f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
