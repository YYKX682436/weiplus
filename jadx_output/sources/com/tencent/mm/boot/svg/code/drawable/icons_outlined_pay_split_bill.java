package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_pay_split_bill extends l95.c {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(39.0f, 0.0f);
        instancePath.cubicTo(40.656853f, 0.0f, 42.0f, 1.3431457f, 42.0f, 3.0f);
        instancePath.lineTo(42.0f, 51.0f);
        instancePath.cubicTo(42.0f, 52.656853f, 40.656853f, 54.0f, 39.0f, 54.0f);
        instancePath.lineTo(3.0f, 54.0f);
        instancePath.cubicTo(1.3431457f, 54.0f, 0.0f, 52.656853f, 0.0f, 51.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(0.0f, 1.3431457f, 1.3431457f, 0.0f, 3.0f, 0.0f);
        instancePath.lineTo(39.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(38.4f, 3.6f);
        instancePath.lineTo(3.6f, 3.6f);
        instancePath.lineTo(3.6f, 50.4f);
        instancePath.lineTo(38.4f, 50.4f);
        instancePath.lineTo(38.399f, 29.511f);
        instancePath.lineTo(24.674976f, 44.051704f);
        instancePath.cubicTo(24.643566f, 44.084984f, 24.61142f, 44.117554f, 24.578566f, 44.14939f);
        instancePath.lineTo(24.4779f, 44.24269f);
        instancePath.cubicTo(23.20458f, 45.37111f, 21.257587f, 45.25365f, 20.129166f, 43.98033f);
        instancePath.lineTo(20.129166f, 43.98033f);
        instancePath.lineTo(12.0f, 34.80733f);
        instancePath.lineTo(13.727176f, 33.110573f);
        instancePath.lineTo(22.363054f, 40.08119f);
        instancePath.lineTo(38.399f, 25.682f);
        instancePath.lineTo(38.4f, 3.6f);
        instancePath.close();
        instancePath.moveTo(25.5f, 18.0f);
        instancePath.lineTo(25.5f, 21.6f);
        instancePath.lineTo(7.5f, 21.6f);
        instancePath.lineTo(7.5f, 18.0f);
        instancePath.lineTo(25.5f, 18.0f);
        instancePath.close();
        instancePath.moveTo(25.5f, 9.0f);
        instancePath.lineTo(25.5f, 12.6f);
        instancePath.lineTo(7.5f, 12.6f);
        instancePath.lineTo(7.5f, 9.0f);
        instancePath.lineTo(25.5f, 9.0f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
