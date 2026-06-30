package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class note_filled_folder extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(1.0f, 0.0f);
        instancePath.lineTo(6.75f, 0.0f);
        instancePath.lineTo(8.625f, 1.5f);
        instancePath.lineTo(19.0f, 1.5f);
        instancePath.cubicTo(19.552284f, 1.5f, 20.0f, 1.9477153f, 20.0f, 2.5f);
        instancePath.lineTo(20.0f, 15.0f);
        instancePath.cubicTo(20.0f, 15.552284f, 19.552284f, 16.0f, 19.0f, 16.0f);
        instancePath.lineTo(1.0f, 16.0f);
        instancePath.cubicTo(0.44771525f, 16.0f, 6.7635376E-17f, 15.552284f, 0.0f, 15.0f);
        instancePath.lineTo(0.0f, 1.0f);
        instancePath.cubicTo(-6.7635376E-17f, 0.44771525f, 0.44771525f, 1.0145306E-16f, 1.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(1.5f, 5.0f);
        instancePath.lineTo(1.5f, 6.5f);
        instancePath.lineTo(18.5f, 6.5f);
        instancePath.lineTo(18.5f, 5.0f);
        instancePath.lineTo(1.5f, 5.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
