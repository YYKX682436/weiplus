package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class sight_list_checkbox_selected extends l95.c {
    private final int width = 90;
    private final int height = 90;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 90;
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
        instancePaint3.setColor(-2565928);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(45.0f, 12.0f);
        instancePath.cubicTo(63.225395f, 12.0f, 78.0f, 26.774603f, 78.0f, 45.0f);
        instancePath.cubicTo(78.0f, 63.225395f, 63.225395f, 78.0f, 45.0f, 78.0f);
        instancePath.cubicTo(26.774603f, 78.0f, 12.0f, 63.225395f, 12.0f, 45.0f);
        instancePath.cubicTo(12.0f, 26.774603f, 26.774603f, 12.0f, 45.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(45.0f, 12.0f);
        instancePath2.cubicTo(63.225395f, 12.0f, 78.0f, 26.774603f, 78.0f, 45.0f);
        instancePath2.cubicTo(78.0f, 63.225395f, 63.225395f, 78.0f, 45.0f, 78.0f);
        instancePath2.cubicTo(26.774603f, 78.0f, 12.0f, 63.225395f, 12.0f, 45.0f);
        instancePath2.cubicTo(12.0f, 26.774603f, 26.774603f, 12.0f, 45.0f, 12.0f);
        instancePath2.close();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(looper);
        instancePaint6.setFlags(385);
        instancePaint6.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint instancePaint7 = l95.c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(android.graphics.Paint.Style.STROKE);
        instancePaint6.setColor(-16777216);
        instancePaint7.setStrokeWidth(1.0f);
        instancePaint7.setStrokeCap(android.graphics.Paint.Cap.BUTT);
        instancePaint7.setStrokeJoin(android.graphics.Paint.Join.MITER);
        instancePaint7.setStrokeMiter(4.0f);
        instancePaint7.setPathEffect(null);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 66.0f, 0.0f, 12.0f, 0.0f, 66.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setLinearGradient(instancePaint5, 0.5f, 0.0f, 0.5f, 1.0f, new int[]{-10560163, -5768183}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint8 = l95.c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-1);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(38.250305f, 53.508274f);
        instancePath3.lineTo(29.74203f, 45.0f);
        instancePath3.lineTo(25.49939f, 49.24264f);
        instancePath3.lineTo(38.22731f, 61.970562f);
        instancePath3.lineTo(38.283035f, 61.914837f);
        instancePath3.lineTo(38.30603f, 61.93783f);
        instancePath3.lineTo(64.62193f, 35.62193f);
        instancePath3.lineTo(60.37929f, 31.37929f);
        instancePath3.lineTo(38.250305f, 53.508274f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint8);
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
