package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pay extends l95.c {
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
        l95.c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(3.6000366f, 33.0f);
        instancePath.lineTo(3.6000366f, 44.40001f);
        instancePath.lineTo(15.0f, 44.40001f);
        instancePath.lineTo(15.0f, 48.0f);
        instancePath.lineTo(3.0f, 48.0f);
        instancePath.cubicTo(1.3431457f, 48.0f, -2.0290612E-16f, 46.656853f, 0.0f, 45.0f);
        instancePath.lineTo(0.0f, 45.0f);
        instancePath.lineTo(0.0f, 33.0f);
        instancePath.lineTo(3.6000366f, 33.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 33.0f);
        instancePath.lineTo(60.0f, 45.0f);
        instancePath.cubicTo(60.0f, 46.656853f, 58.656853f, 48.0f, 57.0f, 48.0f);
        instancePath.lineTo(45.0f, 48.0f);
        instancePath.lineTo(45.0f, 44.40001f);
        instancePath.lineTo(56.399963f, 44.40001f);
        instancePath.lineTo(56.399963f, 33.0f);
        instancePath.lineTo(60.0f, 33.0f);
        instancePath.close();
        instancePath.moveTo(43.91026f, 14.25f);
        instancePath.lineTo(46.455845f, 16.795584f);
        instancePath.lineTo(28.606602f, 34.64483f);
        instancePath.cubicTo(27.43503f, 35.8164f, 25.535534f, 35.8164f, 24.363962f, 34.64483f);
        instancePath.lineTo(15.0f, 25.280865f);
        instancePath.lineTo(17.545584f, 22.735281f);
        instancePath.lineTo(26.485281f, 31.674978f);
        instancePath.lineTo(43.91026f, 14.25f);
        instancePath.close();
        instancePath.moveTo(15.0f, 0.0f);
        instancePath.lineTo(15.0f, 3.5999908f);
        instancePath.lineTo(3.6000366f, 3.5999908f);
        instancePath.lineTo(3.6000366f, 15.0f);
        instancePath.lineTo(0.0f, 15.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(-2.0290612E-16f, 1.3431457f, 1.3431457f, 3.043592E-16f, 3.0f, 0.0f);
        instancePath.lineTo(15.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(57.0f, 0.0f);
        instancePath.cubicTo(58.656853f, 3.043592E-16f, 60.0f, 1.3431457f, 60.0f, 3.0f);
        instancePath.lineTo(60.0f, 3.0f);
        instancePath.lineTo(60.0f, 15.0f);
        instancePath.lineTo(56.399963f, 15.0f);
        instancePath.lineTo(56.399963f, 3.5999908f);
        instancePath.lineTo(45.0f, 3.5999908f);
        instancePath.lineTo(45.0f, 0.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
