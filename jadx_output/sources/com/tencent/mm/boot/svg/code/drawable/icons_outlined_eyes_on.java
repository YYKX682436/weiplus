package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class icons_outlined_eyes_on extends l95.c {
    private final int width = 72;
    private final int height = 72;

    @Override // l95.c
    public int doCommand(int i17, java.lang.Object... objArr) {
        if (i17 == 0 || i17 == 1) {
            return 72;
        }
        if (i17 == 2) {
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
            android.graphics.Path instancePath = l95.c.instancePath(looper);
            instancePath.moveTo(33.0f, 38.4f);
            instancePath.cubicTo(45.102955f, 38.4f, 56.058674f, 31.649624f, 61.943615f, 21.0f);
            instancePath.cubicTo(56.058674f, 10.350376f, 45.102955f, 3.6f, 33.0f, 3.6f);
            instancePath.cubicTo(20.897047f, 3.6f, 9.941325f, 10.350376f, 4.0563836f, 21.0f);
            instancePath.cubicTo(9.941325f, 31.649624f, 20.897047f, 38.4f, 33.0f, 38.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 0.0f);
            instancePath.cubicTo(47.42337f, 0.0f, 59.91619f, 8.542883f, 66.0f, 21.0f);
            instancePath.cubicTo(59.91619f, 33.45712f, 47.42337f, 42.0f, 33.0f, 42.0f);
            instancePath.cubicTo(18.576628f, 42.0f, 6.0838094f, 33.45712f, -1.0963674E-11f, 21.0f);
            instancePath.cubicTo(6.0838094f, 8.542883f, 18.576628f, 0.0f, 33.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(33.0f, 29.4f);
            instancePath.cubicTo(37.63919f, 29.4f, 41.4f, 25.639193f, 41.4f, 21.0f);
            instancePath.cubicTo(41.4f, 16.360807f, 37.63919f, 12.6f, 33.0f, 12.6f);
            instancePath.cubicTo(28.360807f, 12.6f, 24.6f, 16.360807f, 24.6f, 21.0f);
            instancePath.cubicTo(24.6f, 25.639193f, 28.360807f, 29.4f, 33.0f, 29.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 33.0f);
            instancePath.cubicTo(26.372583f, 33.0f, 21.0f, 27.627417f, 21.0f, 21.0f);
            instancePath.cubicTo(21.0f, 14.372583f, 26.372583f, 9.0f, 33.0f, 9.0f);
            instancePath.cubicTo(39.62742f, 9.0f, 45.0f, 14.372583f, 45.0f, 21.0f);
            instancePath.cubicTo(45.0f, 27.627417f, 39.62742f, 33.0f, 33.0f, 33.0f);
            instancePath.close();
            com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            l95.c.done(looper);
        }
        return 0;
    }
}
