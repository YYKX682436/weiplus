package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_unlock extends l95.c {
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(14.8f, 9.0f);
        instancePath.lineTo(14.8f, 6.0f);
        instancePath.cubicTo(14.8f, 3.790861f, 16.59086f, 2.0f, 18.8f, 2.0f);
        instancePath.cubicTo(21.009138f, 2.0f, 22.8f, 3.790861f, 22.8f, 6.0f);
        instancePath.lineTo(22.8f, 9.0f);
        instancePath.lineTo(21.599998f, 9.0f);
        instancePath.lineTo(21.599998f, 6.0f);
        instancePath.cubicTo(21.599997f, 4.4535995f, 20.346394f, 3.199997f, 18.799997f, 3.199997f);
        instancePath.cubicTo(17.2536f, 3.199997f, 15.999997f, 4.4535995f, 15.999997f, 5.9999967f);
        instancePath.lineTo(16.0f, 9.0f);
        instancePath.lineTo(18.999128f, 9.0f);
        instancePath.cubicTo(19.551895f, 9.0f, 20.0f, 9.44749f, 20.0f, 9.998503f);
        instancePath.lineTo(20.0f, 21.001497f);
        instancePath.cubicTo(20.0f, 21.552956f, 19.555368f, 22.0f, 18.999128f, 22.0f);
        instancePath.lineTo(5.0008717f, 22.0f);
        instancePath.cubicTo(4.4481053f, 22.0f, 4.0f, 21.552511f, 4.0f, 21.001497f);
        instancePath.lineTo(4.0f, 9.998503f);
        instancePath.cubicTo(4.0f, 9.447044f, 4.4446306f, 9.0f, 5.0008717f, 9.0f);
        instancePath.lineTo(14.8f, 9.0f);
        instancePath.close();
        instancePath.moveTo(5.2f, 10.2f);
        instancePath.lineTo(5.2f, 20.8f);
        instancePath.lineTo(18.8f, 20.8f);
        instancePath.lineTo(18.8f, 10.2f);
        instancePath.lineTo(5.2f, 10.2f);
        instancePath.close();
        instancePath.moveTo(11.4f, 15.875187f);
        instancePath.cubicTo(10.870229f, 15.64372f, 10.5f, 15.115095f, 10.5f, 14.5f);
        instancePath.cubicTo(10.5f, 13.671573f, 11.171573f, 13.0f, 12.0f, 13.0f);
        instancePath.cubicTo(12.828427f, 13.0f, 13.5f, 13.671573f, 13.5f, 14.5f);
        instancePath.cubicTo(13.5f, 15.115096f, 13.129771f, 15.64372f, 12.599999f, 15.875187f);
        instancePath.lineTo(12.599999f, 18.0f);
        instancePath.lineTo(11.4f, 18.0f);
        instancePath.lineTo(11.4f, 15.875187f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
