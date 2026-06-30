package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class chatting_note_default_img extends l95.c {
    private final int width = 136;
    private final int height = 136;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 136;
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
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-921103);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(136.0f, 0.0f);
        instancePath.lineTo(136.0f, 136.0f);
        instancePath.lineTo(0.0f, 136.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 34.0f, 0.0f, 1.0f, 42.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-3552823);
        instancePaint5.setStrokeWidth(3.0f);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(1.5f, 6.0f);
        instancePath2.cubicTo(1.5f, 3.5147185f, 3.5147185f, 1.5f, 6.0f, 1.5f);
        instancePath2.lineTo(63.0f, 1.5f);
        instancePath2.cubicTo(65.48528f, 1.5f, 67.5f, 3.5147185f, 67.5f, 6.0f);
        instancePath2.lineTo(67.5f, 47.0f);
        instancePath2.cubicTo(67.5f, 49.485283f, 65.48528f, 51.5f, 63.0f, 51.5f);
        instancePath2.lineTo(6.0f, 51.5f);
        instancePath2.cubicTo(3.5147185f, 51.5f, 1.5f, 49.485283f, 1.5f, 47.0f);
        instancePath2.lineTo(1.5f, 6.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-3552823);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(2.0f, 40.47622f);
        instancePath3.lineTo(23.9226f, 20.0f);
        instancePath3.lineTo(48.016544f, 43.06765f);
        instancePath3.lineTo(44.84195f, 35.311966f);
        instancePath3.lineTo(54.734417f, 27.538553f);
        instancePath3.lineTo(68.0f, 40.47622f);
        instancePath3.lineTo(68.0f, 50.245495f);
        instancePath3.lineTo(2.0f, 50.245495f);
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
