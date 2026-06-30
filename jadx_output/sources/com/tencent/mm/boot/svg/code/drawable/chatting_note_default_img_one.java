package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_note_default_img_one extends l95.c {
    private final int width = 300;
    private final int height = 135;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 300;
        }
        if (i17 == 1) {
            return 135;
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
        instancePaint3.setColor(-921103);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(300.0f, 0.0f);
        instancePath.lineTo(300.0f, 136.0f);
        instancePath.lineTo(0.0f, 136.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-3552823);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 111.0f, 0.0f, 1.0f, 39.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(0.0f, 3.004289f);
        instancePath2.cubicTo(0.0f, 1.345066f, 1.3380457f, 0.0f, 3.0004263f, 0.0f);
        instancePath2.lineTo(75.99957f, 0.0f);
        instancePath2.cubicTo(77.65666f, 0.0f, 79.0f, 1.3527762f, 79.0f, 3.004289f);
        instancePath2.lineTo(79.0f, 53.995712f);
        instancePath2.cubicTo(79.0f, 55.654934f, 77.66196f, 57.0f, 75.99957f, 57.0f);
        instancePath2.lineTo(3.0004263f, 57.0f);
        instancePath2.cubicTo(1.3433366f, 57.0f, 0.0f, 55.647224f, 0.0f, 53.995712f);
        instancePath2.lineTo(0.0f, 3.004289f);
        instancePath2.close();
        instancePath2.moveTo(4.0f, 4.0f);
        instancePath2.lineTo(75.0f, 4.0f);
        instancePath2.lineTo(75.0f, 53.0f);
        instancePath2.lineTo(4.0f, 53.0f);
        instancePath2.lineTo(4.0f, 4.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint4, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(60.92106f, 30.279995f);
        instancePath3.lineTo(50.039062f, 38.768322f);
        instancePath3.lineTo(53.85942f, 46.690155f);
        instancePath3.lineTo(27.17777f, 22.0f);
        instancePath3.lineTo(2.0f, 45.710293f);
        instancePath3.lineTo(2.0f, 56.5f);
        instancePath3.lineTo(77.96154f, 56.5f);
        instancePath3.lineTo(77.96154f, 45.710293f);
        instancePath3.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
