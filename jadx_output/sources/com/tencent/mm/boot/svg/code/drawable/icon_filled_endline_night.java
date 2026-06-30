package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icon_filled_endline_night extends l95.c {
    private final int width = 69;
    private final int height = 4;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            return 69;
        }
        if (i17 == 1) {
            return 4;
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.5f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(2.0816682E-15f, 1.5f);
        instancePath.lineTo(24.0f, 1.5f);
        instancePath.lineTo(24.0f, 2.5f);
        instancePath.lineTo(2.0816682E-15f, 2.5f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint5 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(34.0f, 0.0f);
        instancePath2.cubicTo(35.10457f, 0.0f, 36.0f, 0.8954305f, 36.0f, 2.0f);
        instancePath2.cubicTo(36.0f, 3.1045694f, 35.10457f, 4.0f, 34.0f, 4.0f);
        instancePath2.cubicTo(33.15145f, 4.0f, 32.426327f, 3.4715557f, 32.135773f, 2.72581f);
        instancePath2.cubicTo(32.380066f, 2.8986654f, 32.6782f, 3.0f, 33.0f, 3.0f);
        instancePath2.cubicTo(33.828426f, 3.0f, 34.5f, 2.328427f, 34.5f, 1.5f);
        instancePath2.cubicTo(34.5f, 0.8333896f, 34.065163f, 0.2683413f, 33.46366f, 0.073033236f);
        instancePath2.cubicTo(33.633682f, 0.025425246f, 33.813873f, 0.0f, 34.0f, 0.0f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        android.graphics.Paint instancePaint6 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath3 = l95.c.instancePath(looper);
        instancePath3.moveTo(44.0f, 1.5f);
        instancePath3.lineTo(68.0f, 1.5f);
        instancePath3.lineTo(68.0f, 2.5f);
        instancePath3.lineTo(44.0f, 2.5f);
        instancePath3.lineTo(44.0f, 1.5f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
