package com.tencent.mm.boot.svg.code.drawable;

/* loaded from: classes16.dex */
public class finder_outlined_arrow extends l95.c {
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
        canvas.save();
        android.graphics.Paint instancePaint3 = l95.c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        float[] matrixFloatArray = l95.c.setMatrixFloatArray(instanceMatrixArray, 6.123234E-17f, 1.0f, 7.757359f, -1.0f, 6.123234E-17f, 18.792892f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        android.graphics.Paint instancePaint4 = l95.c.instancePaint(instancePaint3, looper);
        android.graphics.Path instancePath = l95.c.instancePath(looper);
        instancePath.moveTo(13.792893f, 3.4926407f);
        instancePath.lineTo(13.792893f, 4.9926405f);
        instancePath.lineTo(2.664f, 4.992f);
        instancePath.lineTo(5.0961943f, 7.424621f);
        instancePath.lineTo(4.035534f, 8.485281f);
        instancePath.lineTo(0.14644662f, 4.5961943f);
        instancePath.cubicTo(-0.048815537f, 4.400932f, -0.048815537f, 4.0843496f, 0.14644662f, 3.8890872f);
        instancePath.lineTo(0.8535534f, 3.1819806f);
        instancePath.lineTo(0.854f, 3.182f);
        instancePath.lineTo(4.035534f, -7.1054274E-15f);
        instancePath.lineTo(5.0961943f, 1.0606601f);
        instancePath.lineTo(2.664f, 3.492f);
        instancePath.lineTo(13.792893f, 3.4926407f);
        instancePath.close();
        com.tencent.mm.svg.WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        l95.c.done(looper);
        return 0;
    }
}
