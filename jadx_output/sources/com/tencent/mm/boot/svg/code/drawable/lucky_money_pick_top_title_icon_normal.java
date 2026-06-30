package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class lucky_money_pick_top_title_icon_normal extends l95.c {
    private final int width = 16;
    private final int height = 16;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 16;
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
        instancePath.lineTo(16.0f, 0.0f);
        instancePath.lineTo(16.0f, 16.0f);
        instancePath.lineTo(0.0f, 16.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.47f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.6f, 0.0f);
        instancePath2.cubicTo(0.93137085f, 0.0f, 1.2f, 0.26862916f, 1.2f, 0.6f);
        instancePath2.lineTo(1.2f, 8.066667f);
        instancePath2.cubicTo(1.2f, 8.398038f, 0.93137085f, 8.666667f, 0.6f, 8.666667f);
        instancePath2.cubicTo(0.26862916f, 8.666667f, 0.0f, 8.398038f, 0.0f, 8.066667f);
        instancePath2.lineTo(0.0f, 0.6f);
        instancePath2.cubicTo(0.0f, 0.26862916f, 0.26862916f, 0.0f, 0.6f, 0.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-16777216);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(11.0f, 2.0f);
        instancePath3.cubicTo(11.552284f, 2.0f, 12.0f, 2.4477153f, 12.0f, 3.0f);
        instancePath3.lineTo(12.0f, 13.0f);
        instancePath3.cubicTo(12.0f, 13.552284f, 11.552284f, 14.0f, 11.0f, 14.0f);
        instancePath3.lineTo(5.0f, 14.0f);
        instancePath3.cubicTo(4.4477153f, 14.0f, 4.0f, 13.552284f, 4.0f, 13.0f);
        instancePath3.lineTo(4.0f, 3.0f);
        instancePath3.cubicTo(4.0f, 2.4477153f, 4.4477153f, 2.0f, 5.0f, 2.0f);
        instancePath3.lineTo(11.0f, 2.0f);
        instancePath3.close();
        instancePath3.moveTo(10.8f, 3.2f);
        instancePath3.lineTo(5.2f, 3.2f);
        instancePath3.lineTo(5.2f, 12.8f);
        instancePath3.lineTo(10.8f, 12.8f);
        instancePath3.lineTo(10.8f, 3.2f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-16777216);
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 13.333333f, 0.0f, 1.0f, 4.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(instancePaint6, looper);
        android.graphics.Path instancePath4 = l95.c.instancePath(looper);
        instancePath4.moveTo(0.6f, 0.0f);
        instancePath4.cubicTo(0.93137085f, 0.0f, 1.2f, 0.26862916f, 1.2f, 0.6f);
        instancePath4.lineTo(1.2f, 8.066667f);
        instancePath4.cubicTo(1.2f, 8.398038f, 0.93137085f, 8.666667f, 0.6f, 8.666667f);
        instancePath4.cubicTo(0.26862916f, 8.666667f, 0.0f, 8.398038f, 0.0f, 8.066667f);
        instancePath4.lineTo(0.0f, 0.6f);
        instancePath4.cubicTo(0.0f, 0.26862916f, 0.26862916f, 0.0f, 0.6f, 0.0f);
        instancePath4.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
