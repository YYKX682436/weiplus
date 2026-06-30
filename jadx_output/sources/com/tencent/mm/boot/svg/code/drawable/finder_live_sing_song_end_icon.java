package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_live_sing_song_end_icon extends l95.c {
    private final int width = 4;
    private final int height = 4;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
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
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -3.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = l95.c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(4.0f, 0.0f);
        instancePath.lineTo(4.0f, 4.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(654311423);
        android.graphics.Path instancePath2 = l95.c.instancePath(looper);
        instancePath2.moveTo(2.0f, 1.8189894E-12f);
        instancePath2.cubicTo(3.1045694f, 1.8189894E-12f, 4.0f, 0.8954305f, 4.0f, 2.0f);
        instancePath2.cubicTo(4.0f, 3.1045694f, 3.1045694f, 4.0f, 2.0f, 4.0f);
        instancePath2.cubicTo(1.1514515f, 4.0f, 0.4263277f, 3.4715557f, 0.13577133f, 2.72581f);
        instancePath2.cubicTo(0.38006744f, 2.8986654f, 0.67819977f, 3.0f, 1.0f, 3.0f);
        instancePath2.cubicTo(1.8284271f, 3.0f, 2.5f, 2.328427f, 2.5f, 1.5f);
        instancePath2.cubicTo(2.5f, 0.8333896f, 2.0651608f, 0.2683413f, 1.4636604f, 0.073033236f);
        instancePath2.cubicTo(1.6336842f, 0.025425246f, 1.8138728f, 1.8189894E-12f, 2.0f, 1.8189894E-12f);
        instancePath2.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
